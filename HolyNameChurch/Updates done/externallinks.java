package com.hnc.hnc.holynamechurch;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Adriealle on 12-12-2018.
 */

public class externallinks extends SQLiteOpenHelper {


    public externallinks(Context context) {
        super(context, "LINKS", null, 1);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_CONTACTS_TABLE = "CREATE TABLE LINKS ( _id INTEGER PRIMARY KEY AUTOINCREMENT, title TEXT, link TEXT)";
        db.execSQL(CREATE_CONTACTS_TABLE);

        ContentValues values = new ContentValues();
        values.put("title", "The Holy See");
        values.put("link", "http://w2.vatican.va/content/vatican/en.html");
        db.insert("LINKS", null, values);

        ContentValues v = new ContentValues();
        v.put("title", "ROSARY");
        v.put("link", "saying");
        db.insert("LINKS", null, v);

        ContentValues v1 = new ContentValues();
        v1.put("title", "Vatican News");
        v1.put("link", "https://www.vaticannews.va/en.html");
        db.insert("LINKS", null, v1);

        ContentValues v2 = new ContentValues();
        v2.put("title", "Archdiocese Of Delhi");
        v2.put("link", "http://www.archdiocesedelhi.org/Default.aspx");
        db.insert("LINKS", null, v2);

        ContentValues v3 = new ContentValues();
        v3.put("title", "Catholic News Agency");
        v3.put("link", "https://www.catholicnewsagency.com");
        db.insert("LINKS", null, v3);

        ContentValues v4 = new ContentValues();
        v4.put("title", "Catholic Cathechism Quiz");
        v4.put("link", "https://www.gotoquiz.com/catholic_catechism_quiz");
        db.insert("LINKS", null, v4);

        ContentValues v5 = new ContentValues();
        v5.put("title", "Cathechism Trivia");
        v5.put("link", "http://www.funtrivia.com/playquiz/quiz21237718514c0.html");
        db.insert("LINKS", null, v5);
        ContentValues v6 = new ContentValues();
        v6.put("title", "Catholic IQ");
        v6.put("link", "http://www.catechist.com/category/quiz/");
        db.insert("LINKS", null, v6);
        ContentValues v7 = new ContentValues();
        v7.put("title", "Read The Bible");
        v7.put("link", "https://www.bible.com/bible/111/JHN.1.NIV");
        db.insert("LINKS", null, v7);
ContentValues v8 = new ContentValues();
        v8.put("title", "Novena Prayers");
        v8.put("link", "https://www.marypages.com/novena-prayers-en.html");
        db.insert("LINKS", null, v8);
        ContentValues v9 = new ContentValues();
        v9.put("title", "Pray More Novenas");
        v9.put("link", "https://www.praymorenovenas.com/novenas");
        db.insert("LINKS", null, v9);
ContentValues v10 = new ContentValues();
        v10.put("title", "Catholic Online");
        v10.put("link", "https://www.catholic.org/");
        db.insert("LINKS", null, v10);
        ContentValues v11 = new ContentValues();
        v11.put("title", "Catholic Hymns");
        v11.put("link", "https://www.songandpraise.org/catholic-hymns.htm");
        db.insert("LINKS", null, v11);
ContentValues v12 = new ContentValues();
        v12.put("title", "Catholic History");
        v12.put("link", "https://www.christianity.com/church/denominations/what-is-catholicism.html");
        db.insert("LINKS", null, v12);
        ContentValues v13 = new ContentValues();
        v13.put("title", "Catholic Songs");
        v13.put("link", "https://www.ocp.org/en-us/catholic-songs");
        db.insert("LINKS", null, v13);
        ContentValues v14 = new ContentValues();
        v14.put("title", "The Catholic Encyclopedia");
        v14.put("link", "http://www.newadvent.org/cathen/");
        db.insert("LINKS", null, v14);
        ContentValues v15 = new ContentValues();
        v15.put("title", "Catholic Games");
        v15.put("link", "https://www.catholicdoors.com/games/index.htm");
        db.insert("LINKS", null, v15);












    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + "LINKS");
        onCreate(db);
    }



}
