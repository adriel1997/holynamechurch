package com.hnc.hnc.holynamechurch;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class Formpage extends AppCompatActivity {
EditText name ,phone,message;
Spinner choice;
Button send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formpage);
send=findViewById(R.id.send);
name=findViewById(R.id.name);
phone=findViewById(R.id.phone);
choice=findViewById(R.id.spinner);
message=findViewById(R.id.message);
send.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent sendIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","example@xyz.com",null));
        sendIntent.putExtra(Intent.EXTRA_EMAIL, new String[] { "abc@gmail,com" });
        sendIntent.putExtra(Intent.EXTRA_SUBJECT, choice.getSelectedItem().toString());
        sendIntent.putExtra(Intent.EXTRA_TEXT, "*Note -Serious Requests of Registered Memebers " +
                "will only be entertained \nName"+name.getText().toString()+"\nPhone Number"+phone+"\nMessage:"+message.getText().toString());
        startActivity(sendIntent);

    }
});
    }
}