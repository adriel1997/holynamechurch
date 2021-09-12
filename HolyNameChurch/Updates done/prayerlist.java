package com.hnc.hnc.holynamechurch;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

public class prayerlist extends AppCompatActivity {
ListView list,novena,sacraments,rosary,confessions,command,station;
prayers  getdata;
confessions getcon;
novena getnov;
sacraments getsac;
rosary getros;
comandments getcom;
stations getsta;

    




Cursor c,c1,c2,c3,c4,c5,c6;
SQLiteDatabase g,g1,g2,g3,g4,g5,g6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prayerlist);
        list = findViewById(R.id.applist);
        novena=findViewById(R.id.novenalist);
        sacraments=findViewById(R.id.saclist);
        rosary=findViewById(R.id.rosarylist);
        confessions=findViewById(R.id.conlist);
        command=findViewById(R.id.comlis);
station=findViewById(R.id.stalist);






        getdata=new prayers(this);
        getcom=new comandments(this);
        getros=new rosary(this);
        getsac=new sacraments(this);
        getcon=new confessions(this);
        getnov=new novena(this);
getsta=new stations(this);





if(getdata!=null&&getcom!=null&&getros!=null&&getsac!=null&&getcon!=null&&getnov!=null&&getsta!=null){
        g=getdata.getReadableDatabase();
        g1=getcom.getReadableDatabase();
        g2=getros.getReadableDatabase();
        g3=getsac.getReadableDatabase();
        g4=getcon.getReadableDatabase();
        g5=getnov.getReadableDatabase();
    g6=getsta.getReadableDatabase();
            if(g!=null&&g1!=null&&g2!=null&&g3!=null&&g4!=null&&g5!=null&&g6!=null){
                c = g.query("PRAYERS", null, null, null, null, null, null);
                c1 = g1.query("COMMANDMENT", null, null, null, null, null, null);
                c2= g2.query("ROSARY", null, null, null, null, null, null);
                c3 = g3.query("SACRAMENTS", null, null, null, null, null, null);
                c4 = g4.query("CONFESSIONS", null, null, null, null, null, null);
                c5 = g5.query("NOVENA", null, null, null, null, null, null);
                c6 = g6.query("STATIONS", null, null, null, null, null, null);
if(c!=null&&c1!=null&&c2!=null&&c3!=null&&c4!=null&&c5!=null&&c6!=null){
        SimpleCursorAdapter p = new SimpleCursorAdapter(this,R.layout.prayerlistlayout,c,new String[] {"title"},new int [] {R.id.prayertitle},0);
       list.setAdapter(p);
    //Utility.setListViewHeightBasedOnChildren(list);
    SimpleCursorAdapter p1 = new SimpleCursorAdapter(this,R.layout.prayerlistlayout,c1,new String[] {"title"},new int [] {R.id.prayertitle},0);
    command.setAdapter(p1);
    //Utility.setListViewHeightBasedOnChildren(command);
    SimpleCursorAdapter p2 = new SimpleCursorAdapter(this,R.layout.prayerlistlayout,c2,new String[] {"title"},new int [] {R.id.prayertitle},0);
    rosary.setAdapter(p2);
    //Utility.setListViewHeightBasedOnChildren(rosary);
    SimpleCursorAdapter p3 = new SimpleCursorAdapter(this,R.layout.prayerlistlayout,c3,new String[] {"title"},new int [] {R.id.prayertitle},0);
    sacraments.setAdapter(p3);
    //Utility.setListViewHeightBasedOnChildren(sacraments);
    SimpleCursorAdapter p4 = new SimpleCursorAdapter(this,R.layout.prayerlistlayout,c4,new String[] {"title"},new int [] {R.id.prayertitle},0);
    confessions.setAdapter(p4);
   // Utility.setListViewHeightBasedOnChildren(confessions);
    SimpleCursorAdapter p5 = new SimpleCursorAdapter(this,R.layout.prayerlistlayout,c5,new String[] {"title"},new int [] {R.id.prayertitle},0);
    novena.setAdapter(p5);
   // Utility.setListViewHeightBasedOnChildren(novena);
    SimpleCursorAdapter p6 = new SimpleCursorAdapter(this,R.layout.prayerlistlayout,c6,new String[] {"title"},new int [] {R.id.prayertitle},0);
    station.setAdapter(p6);
   // Utility.setListViewHeightBasedOnChildren(station);














}}}
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                long ID=l;
                c = g.query("PRAYERS",null,"_id=?",new String[]{""+ID}, null, null, null);
                if (c != null) {
                    c.moveToFirst();
                    getlist(c);
                }

            }
        });
        station.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                long ID=l;
                c = g6.query("STATIONS",null,"_id=?",new String[]{""+ID}, null, null, null);
                if (c != null) {
                    c.moveToFirst();
                    getlist(c);
                }

            }
        });
        command.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                long ID=l;
                c = g1.query("COMMANDMENT",null,"_id=?",new String[]{""+ID}, null, null, null);
                if (c != null) {
                    c.moveToFirst();
                    getlist(c);
                }

            }
        });
        rosary.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                long ID=l;
                c = g2.query("ROSARY",null,"_id=?",new String[]{""+ID}, null, null, null);
                if (c != null) {
                    c.moveToFirst();
                    getlist(c);
                }

            }
        });
        sacraments.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                long ID=l;
                c = g3.query("SACRAMENTS",null,"_id=?",new String[]{""+ID}, null, null, null);
                if (c != null) {
                    c.moveToFirst();
                    getlist(c);
                }

            }
        });
        confessions.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                long ID=l;
                c = g4.query("CONFESSIONS",null,"_id=?",new String[]{""+ID}, null, null, null);
                if (c != null) {
                    c.moveToFirst();
                    getlist(c);
                }

            }
        });
        novena.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                long ID=l;
                c = g5.query("NOVENA",null,"_id=?",new String[]{""+ID}, null, null, null);
                if (c != null) {
                    c.moveToFirst();
                    getlist(c);
                }

            }
        });
    }
    public void getlist(Cursor c){

        String name=c.getString(c.getColumnIndex("title"));
        String decp=c.getString(c.getColumnIndex("prayer"));
        Intent re = new Intent(prayerlist.this,baseactivity.class);
        re.putExtra("id",name);
        re.putExtra("title",decp);
        startActivity(re);

    }

}
