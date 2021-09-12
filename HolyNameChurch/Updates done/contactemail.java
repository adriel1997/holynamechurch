package com.hnc.hnc.holynamechurch;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Adriealle on 12-12-2018.
 */

public class contactemail extends SQLiteOpenHelper {


    public contactemail(Context context) {
        super(context, "EMAIL", null, 1);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_CONTACTS_TABLE = "CREATE TABLE EMAIL ( _id INTEGER PRIMARY KEY AUTOINCREMENT, title TEXT, email TEXT)";
        db.execSQL(CREATE_CONTACTS_TABLE);
		ContentValues val = new ContentValues();
        val.put("title", "Parish Counsel");
        val.put("email", "saying");
        db.insert("EMAIL", null, val);
		ContentValues v = new ContentValues();
        v.put("title", "St. Vincent De Paul");
        v.put("email", "saying");
        db.insert("EMAIL", null, v);
        ContentValues values = new ContentValues();
        values.put("title", "ICYM Youth Society ");
        values.put("email", "saying");
        db.insert("EMAIL", null, values);
        ContentValues va = new ContentValues();
        va.put("title", "Choir Group");
        va.put("email", "saying");
        db.insert("EMAIL", null, va);
       
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + "EMAIL");
        onCreate(db);
    }



}
