package com.hnc.hnc.holynamechurch;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Adriealle on 12-12-2018.
 */

public class mapdatabase extends SQLiteOpenHelper {


    public mapdatabase(Context context) {
        super(context, "MAPS", null, 2);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_CONTACTS_TABLE = "CREATE TABLE MAPS ( _id INTEGER PRIMARY KEY AUTOINCREMENT, title TEXT, long TEXT,lat TEXT)";
        db.execSQL(CREATE_CONTACTS_TABLE);

        ContentValues values = new ContentValues();
        values.put("title", "Holy Name Church");
        values.put("long", "77.108914");
        values.put("lat", "28.426755");
        db.insert("MAPS", null, values);

        ContentValues v = new ContentValues();
        v.put("title", "Cemetery");
        v.put("long", "77.1045439");
        v.put("lat", "28.4192056");
        db.insert("MAPS", null, v);

        ContentValues va = new ContentValues();
        va.put("title", "Holy Family Hospital");
        va.put("long", "77.2751113");
        va.put("lat", "28.5618161");
        db.insert("MAPS", null, va);
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + "MAPS");
        onCreate(db);
    }



}
