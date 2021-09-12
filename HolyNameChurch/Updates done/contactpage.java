package com.hnc.hnc.holynamechurch;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

public class contactpage extends AppCompatActivity {
    ListView list,map;
    contactemail getdata;
    mapdatabase getmap;
    Cursor c,c1;
    TextView youth;
    SQLiteDatabase g,g1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactpage);
        list = findViewById(R.id.contactlist);
        map = findViewById(R.id.maplist);
        getdata=new contactemail(this);
        getmap=new mapdatabase(this);

        youth=findViewById(R.id.youthteam);
/*
        Adriealle D'Souza (Developer)
        Linsie Paul (Content Provider)
        Benedict Fernandes(Content Provider)
        Rahul Ghosh(Content Provider)
        Angel(Content Provider)
        Parthasarathy(Content Provider)
        Joanne Louzado
        Akhil Joy
        Salisha Correia
        Priya Sharma
        Aalika Peres
        Tarika Peres
        Sarah Srinivasan
        Thomas Xavier
        Pahuni D'costa
*/

        youth.setText("About HNC\n" +
                "\n" +
                "This parish is a new growing seed and works with full zeal and commitment for the common good of the others and especially provides tender care to the poor and the needy. The parish community has grown in every sphere of life and continues to experience faith in God and fellowship and love among the people.\n" +
                "\n" +
                "History\n" +
                "\n" +
                "Everyone has a dream one struggles to realize. In the late 1990’s prices and rentals of business properties skyrocketed and the Delhi government encouraged businesses to shift out to the satellite towns in the National Capital Region. As a result, offices of major business houses shifted to Gurgaon, among other places. Even though the Church of Immaculate Conception had been beautifully and impressively rebuilt, the Catholic population had witnessed an exponential growth.\n" +
                "\n" +
                "After the Archdiocese of Delhi submitted the formal land application form, HUDA asked to make a presentation on the application. It was with great happiness and joy that in September 2007 that the land allotment letter had been finally received by the Archdiocese of Delhi.\n" +
                "\n" +
                "Many parishioners have worked to build the church of the Holy Name of Jesus. The church was inaugurated on August 14, 2011 by Most. Rev. Vincent M. Concessao, Archbishop of Delhi and Rt. Rev. Franco Mulakkal, Auxiliary Bishop Of Delhi, along with priests, nuns and faithful.\n" +
                "\n" +
                "Our lovely Hindi speaking Catholic Christians hailing from various parts of India are embraced with open arms in the Holy Name Church. Our parish visits them at their homes and counsel and pray for them. This led to induction of 450 families into our church.\n" +
                "\n" +
                "This seeded the journey of our church in growing faith and strength. As the strength of the parishioners increased in our church, many of the needy families required school fee support. This led to formation of our Vincent DePaul society at our church in 2011. Initially about 60 children were supported through Vincent De Paul Society towards school fees, etc. This society even supported urgent medical needs of the needy. This journey has moved further with the support of all us parishioners.\n" +
                "\n" +
                "With the strength of parishioners, came another God led movement – Sacrament of Matrimony in our church, which is preforming of Marriages and Marriage rectification through counselling and family visits. Further baptisms, holy communion & confirmation have been performed for our parish children.\n" +
                "\n" +
                "It was identified that need for burial ground at Gurgaon was long awaited one, hence work was initiated with collaboration of Burial committee members. This led to burial ground being readied through levelling. This has provided honorable burials at Catholic burial site in Gurgaon.\n" +
                "\n" +
                "With lot of support and love of parishioners, church has been constantly making improvements including hosting various festivals bringing festive season into the church. Some of them being:\n" +
                "\n" +
                "-Karam festival celebration by Christian Hindi speaking people, where 3000 people turn out every year.\n" +
                "-Onam/Pongal/Parish festival also being done at our church bringing unity, Christian love and feeling of celebration.\n" +
                "-Christmas festival preparation at our Church has been much talked up in the neighborhood. We have participation of many parishioners in preparation of crib, lighting and decoration leading to lot of Godly love at our church\n" +
                "-Visiting the faithful’s home through Carol Singing and through house blessings are done with lot of fervor bringing a lot of joy every year thereby connecting our parishioners through the love of God.\n" +
                "\n" +
                "We render thanks to God for the wonderful ways in which he has built up the parish to be a worshipping and witnessing community.\n" +
                "\n" +
                "Mission\n" +
                "\n" +
                "“Change will not come if we wait for some other person or some other time. We are the ones, we’ve been waiting for. We are the Change we seek.” – Barak Obama\n" +
                "We are caught in a world crazy for new experiences and the media hype attempts us to run after novel changes which are short-lived and leave one frustrated. We need to dream like Robert Frost of a road less travelled, something “New” to be followed and achieved. It’s only the less travelled path though beset with the difficulties which will take one to summit, where the eagles soar.\n" +
                "\n" +
                "The mission of the church in the light of Jesus our Lord and Saviour is that as a child is bonded to the mother through the umbilical cord, so may all the parishner’s be attached to the Holy Name Church Family. We raise our prayers to the God our heavenly Father that all our beloved families and children be blessed always. Whoever visits this house of God may experience His blessings abundantly in all their endeavours.");
			//youth.setJustificationMode(JUSTIFICATION_MODE_INTER_WORD);
        if(getdata!=null&&getmap!=null){
            g=getdata.getReadableDatabase();
            g1=getmap.getReadableDatabase();
            if(g!=null){c = g.query("EMAIL", null, null, null, null, null, null);
                if(c!=null){
                    SimpleCursorAdapter p = new SimpleCursorAdapter(this,R.layout.prayerlistlayout,c,new String[] {"title"},new int [] {R.id.prayertitle},0);
                    list.setAdapter(p);
                Utility.setListViewHeightBasedOnChildren(list);}}


            if(g1!=null){c1 = g1.query("MAPS", null, null, null, null, null, null);

                if(c1!=null){
                    SimpleCursorAdapter p1 = new SimpleCursorAdapter(this,R.layout.prayerlistlayout,c1,new String[] {"title"},new int [] {R.id.prayertitle},0);
                    map.setAdapter(p1);
                //Utility.setListViewHeightBasedOnChildren(map);
                }}
        }
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                long ID=l;
                c = g.query("EMAIL",null,"_id=?",new String[]{""+ID}, null, null, null);
                if (c != null) {
                    c.moveToFirst();
                    String email;
                    email=c.getString(c.getColumnIndex("email"));
					String subject;
                    subject=c.getString(c.getColumnIndex("title"));
                    Intent sendIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","holynamechurch.gurgaon@gmail,com",null));
                    sendIntent.putExtra(Intent.EXTRA_EMAIL, new String[] { "holynamechurch.gurgaon@gmail,com" });
                    sendIntent.putExtra(Intent.EXTRA_SUBJECT, subject);
                    sendIntent.putExtra(Intent.EXTRA_TEXT, "Enter Query: \n *Note Please Enter Phone Number :-");
                    startActivity(sendIntent);

               // Toast.makeText(contactpage.this, "Under Development", Toast.LENGTH_SHORT).show();


            }
        }});
        map.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                long ID=l;
                c = g1.query("MAPS",null,"_id=?",new String[]{""+ID}, null, null, null);
                if (c != null) {
                    c.moveToFirst();
                    String lon=c.getString(c.getColumnIndex("long"));
                    String lat=c.getString(c.getColumnIndex("lat"));
                    Uri gmmIntentUri = Uri.parse("google.navigation:q="+lat+","+lon);
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    mapIntent.setPackage("com.google.android.apps.maps");
                    startActivity(mapIntent);
                }

            }
        });
    }
}
