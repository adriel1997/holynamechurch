package com.hnc.hnc.holynamechurch;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Adriealle on 25-11-2018.
 */

public class prayers extends SQLiteOpenHelper {


    public prayers(Context context) {
        super(context, "PRAYERS", null, 1);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_CONTACTS_TABLE = "CREATE TABLE PRAYERS ( _id INTEGER PRIMARY KEY AUTOINCREMENT, title TEXT, prayer TEXT)";
        db.execSQL(CREATE_CONTACTS_TABLE);

        ContentValues values = new ContentValues();
        values.put("title", "PRAYER TO OUR LADY OF SNOW");
        values.put("prayer", "O Holy Mary, Our Lady of Snows, Virgin Mary. Chosen by god as our holy mother. Mother who comforts the people come with sorrows. On belief of your son’s holy power, and your prayer to our god, please grant the things we asked daily… if it is acceptable to you. Please pray to god for us and get it for us. If my requisition is against the wish of our god, whatever necessary to me, please get that for me.\n" +
                "\n(Here you ask the things you wish)\n\n" +
                "O Holy Mary, Mother of God, you were so humble when St. Gabriel praise you as blessed amongst the women. With the same humbleness I praise you.. Please accept my praising.\n" +
                "\n(say 9 times hail mary)\n\n" +
                "O Mary, helping hand of needy people, I dedicate my good work and prayers to you to accept my prayers and grant me the things I wish. Please pray to your son our god, for me, and grant the things I asked to you.\n");
        db.insert("PRAYERS", null, values);
        ContentValues v = new ContentValues();
        v.put("title", "PRAYER TO ST. FRANCIS XAVIER");
        v.put("prayer", "O devoted Servant of God, Saint Francis Xavier, your heart was burning with love for Jesus. Impelled by his love, you went from country to country and spent yourself unto death to proclaim the name of Jesus and the good news of salvation. That is why the Father filled you with glory in heaven and preserved your body from corruption here on Earth. Filled with joy for these unique gifts, we join you in praising the Father.\n" +
                "And Now we ask your intercession for ourselves. (Each one makes one’s intention silently.) We ask you to obtain for us the fulfilment of these desires if they are pleasing to the Father. And for everything together with you we praise the Father, through Jesus in the Spirit. Amen.");
        db.insert("PRAYERS", null, v);
        ContentValues va = new ContentValues();
        va.put("title", "PRAYER TO VIRGIN MARY");
        va.put("prayer", "O Virgin Immaculate, Mother of God and my Mother, from thy sublime height turn upon me thine eyes of pity. Filled with confidence in thy goodness and knowing full well thy power, I beseech thee to extend to me thine assistance in the journey of life, which is so full of danger for my soul. And in order that I may never be the slave of the devil through sin, but may ever live with my heart humble and pure, I entrust myself wholly to thee. I consecrate my heart to thee forever, my only desire being to love thy divine Son Jesus. Mary, none of thy devout servants has ever perished; may I too be saved. Amen.");
        db.insert("PRAYERS", null, va);
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + "PRAYERS");
        onCreate(db);
    }



}



