package com.hnc.hnc.holynamechurch;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Adriealle on 15-12-2018.
 */

public class confessions extends SQLiteOpenHelper {


    public confessions(Context context) {
        super(context, "CONFESSIONS", null, 1);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_CONTACTS_TABLE = "CREATE TABLE CONFESSIONS ( _id INTEGER PRIMARY KEY AUTOINCREMENT, title TEXT, prayer TEXT)";
        db.execSQL(CREATE_CONTACTS_TABLE);

        ContentValues values = new ContentValues();
        values.put("title", "The Basic Requirement");
        values.put("prayer", "\n" +
                "The basic requirement for a good confession is to have the intention of returning to God like the \"prodigal son\" and to acknowledge our sins with true sorrow before the priest.\\n\n" +
                "The basic requirement for a good confession is to have the intention of returning to God and to acknowledge my sins with true sorrow before the priest.\n");
        db.insert("CONFESSIONS", null, values);
        ContentValues v = new ContentValues();
        v.put("title", "What is Sin?");
        v.put("prayer", "In many ways our society has lost a sense of sin. As a Catholic follower of Christ, I must make an effort to recognize sin in my daily actions, words and omissions." +
                "The Gospels show how important is the forgiveness of our sins. Lives of saints prove that the person who grows in holiness has a stronger sense of sin, sorrow for sins, and a need for the Sacrament of Reconciliation or Confession\n");
        db.insert("CONFESSIONS", null, v);
        ContentValues va = new ContentValues();
        va.put("title", "The Differences in Sins");
        va.put("prayer", "As a result of Original Sin, human nature is weakened. Baptism, by imparting the life of Christ's grace, takes away Original Sin, and turns us back toward God. The consequences of this weakness and the inclination to evil persist, and we often commit personal or actual sin.\n" +
                "Actual sin is sin which people commit. There are two kinds of actual sin, mortal and venial.\n" +
                "Mortal sin is a deadly offense against God, so horrible that it destroys the life of grace in the soul. Three simultaneous conditions must be fulfilled for a mortal sin:  \n" +
                "?the act must be something very serious;\n" +
                "?the person must have sufficient understanding of what is being done;\n" +
                "?the person must have sufficient freedom of the will.");
        db.insert("CONFESSIONS", null, va);


        ContentValues val = new ContentValues();
        val.put("title", "The Differences in Sins");
        val.put("prayer", "As a result of Original Sin, human nature is weakened. Baptism, by imparting the life of Christ's grace, takes away Original Sin, and turns us back toward God. The consequences of this weakness and the inclination to evil persist, and we often commit personal or actual sin.\n" +
                "Actual sin is sin which people commit. There are two kinds of actual sin, mortal and venial.\n" +
                "Mortal sin is a deadly offense against God, so horrible that it destroys the life of grace in the soul. Three simultaneous conditions must be fulfilled for a mortal sin:  \n" +
                "?the act must be something very serious;\n" +
                "?the person must have sufficient understanding of what is being done;\n" +
                "?the person must have sufficient freedom of the will.\n");
        db.insert("CONFESSIONS", null, val);

        ContentValues valu = new ContentValues();
        valu.put("title", "Before Confession");
        valu.put("prayer", "Spend a few minutes before your confession: \nPray for God’s help and guidance; \nexamine your conscience; \nremember any sins you have committed (write them down if it helps); \npray for God’s forgiveness. \nBut don’t spend forever trying to remember every little sin (this can become an obsession that is called ‘scruples’) – ten minutes is probably a good amount of time; an hour is too long. It is our duty to mention in confession all our serious (or ‘mortal’) sins; and we are encouraged to mention some of our other smaller (or ‘venial’) sins and everyday faults, but we don’t need to list every minor failure. Remember that all our venial sins are forgiven and forgotten whenever we pray for God’s forgiveness, and whenever we receive Holy Communion.\n" +
                "\n\nBe truly sorry for your sins.");
        db.insert("CONFESSIONS", null, valu);
        ContentValues value = new ContentValues();
        value.put("title", "During Confession");
        value.put("prayer", "After examining your conscience and telling God of your sorrow, go into the confessional. You may kneel at the screen or sit to talk face-to-face with the priest.\n" +
                "\n" +
                "Begin your confession with the sign of the cross, \"In the name of the Father, and of the Son, and of the Holy Spirit. Amen.” Then add: “Bless me, Father, for I have sinned. It is [state the length of time] since my last confession.” \n" +
                "\n" +
                "The priest may read a passage from holy Scripture.\n" +
                "\n" +
                "Say the sins that you remember. Start with the one(s) that is most difficult to say. (In order to make a good confession the faithful must confess all mortal sins, according to kind and number.) After confessing all the sins you remember since your last good confession, you may conclude by saying, \"I am sorry for these and all the sins of my past life.\"\n" +
                "\n" +
                "Listen to the words of the priest. He will assign you some penance. Doing the penance will diminish the temporal punishment due to sins already forgiven. When invited, express some prayer of sorrow or Act of Contrition such as:\n");
        db.insert("CONFESSIONS", null, value);
        ContentValues values2 = new ContentValues();
        values2.put("title", "Act Of Contrition");
        values2.put("prayer", "O my God, I am heartily sorry for having offended you and I detest all my sins, because I dread the loss of heaven and the pains of hell. But most of all because I have offended you, my God, who are all good and deserving of all my love. I firmly resolve with the help of your grace, to confess my sins, to do penance and to amend my life. Amen.");
        db.insert("CONFESSIONS", null, values2);
        ContentValues values3 = new ContentValues();
        values3.put("title", "At the End of Confession");
        values3.put("prayer", "Listen to the words of absolution, the sacramental forgiveness of the Church through the ordained priest.\n" +
                "As you listen to the words of forgiveness you may make the sign of the cross with the priest. If he closes by saying, \"Give thanks to the Lord for He is good,\" answer, \"For His mercy endures forever.\"");
        db.insert("CONFESSIONS", null, values3);
        ContentValues values4 = new ContentValues();
        values4.put("title", "After confession");
        values4.put("prayer", "Give thanks to God for forgiving you again and pray for God’s help to live a new life.. If you recall some serious sin you forgot to tell, rest assured that it has been forgiven with the others, but be sure to confess it in your next Confession.");
        db.insert("CONFESSIONS", null, values4);

    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + "CONFESSIONS");
        onCreate(db);
    }



}




