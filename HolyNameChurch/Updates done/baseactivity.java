package com.hnc.hnc.holynamechurch;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class baseactivity extends AppCompatActivity {
String ID,titles;
Cursor c;
TextView title;
TextView prayer;
ImageButton share;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baseactivity);
        title=findViewById(R.id.prayertitle);
        share=findViewById(R.id.imageButton);
        prayer=findViewById(R.id.prayercontent);
        ID = getIntent().getExtras().getString("id");
        titles = getIntent().getExtras().getString("title");
                title.setText(ID);
                prayer.setText(titles);



share.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        String shareBody = title.getText().toString();
        String shareSub = prayer.getText().toString();
        sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, shareBody+"\n"+shareSub);
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody+"\n"+shareSub);
        startActivity(Intent.createChooser(sharingIntent, "Share using"));
    }
});
    }

}
