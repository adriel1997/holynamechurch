package com.hnc.hnc.holynamechurch;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class faqnsocial extends AppCompatActivity {
ImageButton fb,in,tw,we;
TextView faqinfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faqnsocial);
        fb=findViewById(R.id.fb);
        tw=findViewById(R.id.twitter);
        in=findViewById(R.id.insta);
        we=findViewById(R.id.web);
		faqinfo = findViewById(R.id.faqinfo);
		
		faqinfo.setText(faqinfo.getText() + "\n\n\n"
		+"This page is still underprogress.\n"+
		"You can reach out to us on social media or our website through above buttons. \n"+
		"There is also contact information in about us section as well as map locations. \n"+
		"For church notices, mass timings and important upcoming events please our website.\n"
		);
		
		
    fb.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent re = new Intent(faqnsocial.this,web.class);
            re.putExtra("id","https://www.facebook.com/holynamechurch.gurgaon");
            startActivity(re);

        }
    });
        tw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent re = new Intent(faqnsocial.this,web.class);
                re.putExtra("id","https://twitter.com/holyname_church");
                startActivity(re);

            }
        });
        in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent re = new Intent(faqnsocial.this,web.class);
                re.putExtra("id","https://www.instagram.com/holyname_church/");
                startActivity(re);

            }
        });
        we.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
				Intent re = new Intent(faqnsocial.this,web.class);
                re.putExtra("id","http://holynamechurchgurugram.com");
                startActivity(re);
            }
        });
    }

}
