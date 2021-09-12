package com.hnc.hnc.holynamechurch;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

public class externallinkspage extends AppCompatActivity {
ListView list;
externallinks getdata;
Button lit,roma;
Cursor c;
SQLiteDatabase g;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_externallinkspage);
        list = findViewById(R.id.links);
        lit=findViewById(R.id.lit);
        roma=findViewById(R.id.roman);
        getdata=new externallinks(this);
        if(getdata!=null){
            g=getdata.getReadableDatabase();
            if(g!=null){c = g.query("LINKS", null, null, null, null, null, null);

                if(c!=null){
                    SimpleCursorAdapter p = new SimpleCursorAdapter(this,R.layout.prayerlistlayout,c,new String[] {"title"},new int [] {R.id.prayertitle},0);
                    list.setAdapter(p);
                    Utility.setListViewHeightBasedOnChildren(list);}}}
                    roma.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent re = new Intent(externallinkspage.this,web.class);
                            re.putExtra("id","http://www.romcal.net/output/2019.html");
                            startActivity(re);
                        }
                    });
        lit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent re = new Intent(externallinkspage.this,web.class);
                re.putExtra("id","http://www.kevinlaughery.com/lc2019.html");
                startActivity(re);

            }
        });
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                long ID=l;
                c = g.query("LINKS",null,"_id=?",new String[]{""+ID}, null, null, null);
                if (c != null) {
                    c.moveToFirst();
                    String lon=c.getString(c.getColumnIndex("link"));
                    Intent re = new Intent(externallinkspage.this,web.class);
                re.putExtra("id",lon);
                startActivity(re);}
            }
        });
    }}