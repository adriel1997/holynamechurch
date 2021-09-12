package com.hnc.hnc.holynamechurch;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class Home extends AppCompatActivity
{
    ImageButton request,pray,notification,share,about,donate,ext,shrine,institutions,social,calender,faq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        request = findViewById(R.id.request);
        shrine = findViewById(R.id.shrine);
        institutions = findViewById(R.id.institution);
        social = findViewById(R.id.social);
        calender = findViewById(R.id.calender);
        faq = findViewById(R.id.faq);
        pray = findViewById(R.id.pray);
        share = findViewById(R.id.share);
        notification = findViewById(R.id.notification);
        about = findViewById(R.id.about);
        donate = findViewById(R.id.donate);
        ext = findViewById(R.id.ext);
        //rosary=findViewById(R.id.rosary);


        shrine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent prays = new Intent(Home.this, shrines.class);
                startActivity(prays);
            }
        });
        institutions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent prays = new Intent(Home.this, institutions.class);
                startActivity(prays);
            }
        });
        social.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent prays = new Intent(Home.this, faqnsocial.class);
                startActivity(prays);
            }
        });
        calender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent prays = new Intent(Home.this, externallinkspage.class);
                startActivity(prays);
            }
        });
        faq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent prays = new Intent(Home.this, faqnsocial.class);
                startActivity(prays);
            }
        });
        donate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               /* Intent prays=new Intent(Home.this,donate.class);
                startActivity(prays);*/
                new AlertDialog.Builder(Home.this)
                        .setMessage("Still under development")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                            }
                        })
                        .setNegativeButton("No", null)
                        .show();


            }


        });

        pray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent prays = new Intent(Home.this, prayerlist.class);
                startActivity(prays);
            }
        });
        ext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent prays = new Intent(Home.this, externallinkspage.class);
                startActivity(prays);
            }
        });
        notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent re = new Intent(Home.this,web.class);
                re.putExtra("id","http://holynamechurchgurugram.com");
                startActivity(re);

            }
        });

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                String shareBody = "Hi there my church has developed an application to stay updated on day to day church activities and events.\nDownload our application from:\n https://play.google.com/store/apps/details?id=com.hnc.hnc.holynamechurch";
                String shareSub = "\nDownload our application";
                sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, shareSub);
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(sharingIntent, "Share using"));
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent prays = new Intent(Home.this, contactpage.class);
                startActivity(prays);
            }
        });
        request.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent prays = new Intent(Home.this, Formpage.class);
                startActivity(prays);
            }
        });
    }




}
