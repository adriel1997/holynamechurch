package com.hnc.hnc.holynamechurch;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Adriealle on 15-12-2018.
 */

public class comandments extends SQLiteOpenHelper {


    public comandments(Context context) {
        super(context, "COMMANDMENT", null, 1);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_CONTACTS_TABLE = "CREATE TABLE COMMANDMENT ( _id INTEGER PRIMARY KEY AUTOINCREMENT, title TEXT, prayer TEXT)";
        db.execSQL(CREATE_CONTACTS_TABLE);

        ContentValues values = new ContentValues();

        values.put("title", "1st Commandment");

        values.put("prayer", "I am the Lord your God. You shall not have strange gods before me.?\n\n" +

                "Do I love God above all things? do I put anything, anyone or myself before God? \n\n" +

                "Do I make at least some time for prayer every day? Have I neglected my friendship with God by neglecting prayer? \n\n" +

                "Do I seek to love God with all my heart and with all my soul and with all my strength?\n\n" +

                "Have I ever received Holy Communion in the state of mortal sin? \n\n" +

                "Have I had any involvement with the superstitious practices, occult, horoscopes, witchcraft, wicca, ouija boards, seances, tarot cards, new age crystals, fortune telling, or the like?\n\n" +

                "Have I abused the sacrament of penance by lying to the priest or deliberately not confessing a mortal sin?\n\n" +

                "Have I denied a truth of the faith out of concern for the respect or opinion of others?\n\n" +

                "Has money and pleasure become more important to me than the God who created me for Himself?");
        db.insert("COMMANDMENT", null, values);
        ContentValues v = new ContentValues();
        v.put("title", "2nd Commandment");
        v.put("prayer", "You shall not take the name of the Lord your God in vain.\n\n" +
                "Do I hold on to the practice of my Catholic faith, or have I turned away from it, or spoken against the teachings of the Church?\n\n" +
                "Do I stay faithful to Jesus, even when I have difficulties or doubts?\n\n" +
                "Have I blasphemed God, the church, Mary, the saints, or sacred places or things?\n\n" +
                "Have I ever committed perjury, that is, lied under oath in a court of law? \n\n" +
                "Have I ever lied after \"swearing to God\" that I am telling the truth?\n\n" +
                "Have I ever used God's name out of anger, that is, as a curse\n\n" +
                "Have I used God’s holy name irreverently?\n\n" +
                "When things are difficult, do I hope in God, or do I give in to self-pity and despair? Do I get angry and resentful with him?");
        db.insert("COMMANDMENT", null, v);
        ContentValues va = new ContentValues();
        va.put("title", "3rd Commandment");
        va.put("prayer", "Remember to keep holy the Lord's Day.\n\n" +
                "Do I make a sincere effort to come to Mass on time, and to listen and pray during the Mass? Do I fast for an hour before receiving Holy Communion (apart from water and medicine)? Am I reverent in church?\n\n" +
                "Do I try to keep Sunday as a day of prayer, rest and relaxation, avoiding unnecessary work?\n\n" +
                "Have I deliberately missed come late or left early from Mass on the Sabbath (Saturday evening through Sunday) without a good reason?\n\n" +
                "Have I ever missed Mass on a Holy Day of Obligation or an important holiday in the liturgical calendar (i.e., Ascension Thursday, Easter Sunday, Christmas, Mary the Mother of God, etc.)?");
        db.insert("COMMANDMENT", null, va);
        ContentValues val = new ContentValues();
        val.put("title", "4th Commandment");
        val.put("prayer", "Honour your father and mother.\n\n" +
                "Do I honour and respect my parents? Do I let them know I love them?\n\n" +
                "Do I disobey my parents? Do I lie to them? Do I steal from them? Do I swear at them?\n\n" +
                "Have I deliberately hurt my parents? Am I ashamed of them?\n\n" +
                "Have I neglected or not carried out family duties?\n\n" +
                "Do I support and care for the well-being of all family members, especially the elderly and the sick?\n\n" +
                "Do I treat my children with love and respect?\n\n" +
                "Do I show kindness to my brothers and sisters?\n\n" +
                "Am I obeying and honoring those in place of my parents, such as teachers and principals? \n\n" +
                "Do I lie to my teachers? Do I swear at them? Do I skip class?\n\n" +
                "Do I honour and obey my lawful superiors, and follow the just laws of my country?");
        db.insert("COMMANDMENT", null, val);
        ContentValues valu = new ContentValues();
        valu.put("title", "5th Commandment");
        valu.put("prayer", "You shall not kill.\n\n" +
                "Have I deliberately tried to harm or hurt anyone – physically or emotionally?\n\n" +
                "Do I harbour hatred or anger against anyone? Have I cursed anyone? Hold a grudge? Refuse to forgive another?\n\n" +
                "Have I murdered anyone's reputation by deliberately spreading rumors or keeping rumors alive by passing them on? \n\n" +
                "Do I pray for my enemies? Do I try to forgive those who have hurt me?\n\n" +
                "Have I led anyone to sin through bad example or through direct encouragement?\n\n" +
                "Do I help those in need? Do I love my neighbour as myself? Do I try to be kind and generous with everyone I meet?\n\n" +
                "Do I care for my own physical, emotional, and spiritual health?\n\n" +
                "Have I attempted suicide or seriously considered it?\n\n" +
                "Have I abused alcohol or used illegal drugs?\n\n" +
                "Do I stand up for the unborn child's right to life, or have I merely accepted society's anti-life mentality?\n\n" +
                "Have I had an abortion/induced contraceptives or counseled/encouraged another to do so?\n\n" +
                "Have I sterilized myself in any way or encouraged anyone to do so? \n\n" +
                "Did I participate in or approve of euthanasia or \"mercy-killing\"?");
        db.insert("COMMANDMENT", null, valu);
        ContentValues value = new ContentValues();
        value.put("title", "6th Commandment");
        value.put("prayer", "You shall not commit adultery.\n\n" +
                "For the married:\n\n" +
                "Am I faithful to my spouse in my actions, my words, and my thoughts?\n\n" +
                "Am I respectful and chaste in my relationships?\n\n" +
                "Have I engaged in sexual activity before marriage or outside of marriage?\n\n" +
                "Have I used artificial contraception or been sterilized?\n\n" +
                "Has our marriage been open to new life, or have I used contraception, or been sterilized?\n\n" +
                "Was I married outside the church without proper permission of the church?\n\n" +
                "For the unmarried: \n\n" +
                "Have I engaged in sexual activity with anyone of either sex?\n\n" +
                "For all: \n\n" +
                "Do I dress and behave modestly? \n\n" +
                "Have I deliberately viewed shows, plays, pictures or movies on the TV/internet, or through videos/magazines or some other media that contain impure scenes with the deliberate intention of being aroused by them?\n\n" +
                "Have I ever freely and deliberately entertained impure thoughts?  \n\n" +
                "Have I practiced any form of contraception? \n\n" +
                "Have I used impure language or told impure jokes?\n\n" +
                "Do I try to turn away from impure thoughts and temptations?");
        db.insert("COMMANDMENT", null, value);
        ContentValues value6 = new ContentValues();
        value6.put("title", "6th Commandment");
        value6.put("prayer", "You shall not commit adultery.\n\n" +
                "For the married:\n\n" +
                "Am I faithful to my spouse in my actions, my words, and my thoughts?\n\n" +
                "Am I respectful and chaste in my relationships?\n\n" +
                "Have I engaged in sexual activity before marriage or outside of marriage?\n\n" +
                "Have I used artificial contraception or been sterilized?\n\n" +
                "Has our marriage been open to new life, or have I used contraception, or been sterilized?\n\n" +
                "Was I married outside the church without proper permission of the church?\n\n" +
                "For the unmarried: \n\n" +
                "Have I engaged in sexual activity with anyone of either sex?\n\n" +
                "For all: \n\n" +
                "Do I dress and behave modestly? \n\n" +
                "Have I deliberately viewed shows, plays, pictures or movies on the TV/internet, or through videos/magazines or some other media that contain impure scenes with the deliberate intention of being aroused by them?\n\n" +
                "Have I ever freely and deliberately entertained impure thoughts?  \n\n" +
                "Have I practiced any form of contraception? \n\n" +
                "Have I used impure language or told impure jokes?\n\n" +
                "Do I try to turn away from impure thoughts and temptations?");
        db.insert("COMMANDMENT", null, value6);
        ContentValues value1 = new ContentValues();
        value1.put("title", "7th Commandment");
        value1.put("prayer", "You shall not steal.\n\n" +
                "Do I steal from my parents or friends?\n\n" +
                "Have I ever stolen from a stranger? \n\n" +
                "Have I stolen any property from a store?\n\n" +
                "Have I ever taken what rightfully belongs to another?\n\n" +
                "Have I cheated anyone of what I owe them?\n\n" +
                "Have I deliberately destroyed the property of others?\n\n" +
                "Have I copied or used pirated material: videos, music, software?\n\n" +
                "Have I stolen or accepted stolen goods?\n\n" +
                "Do I gamble excessively?\n\n" +
                "Am I lazy? Do I waste time at work or at school or college?\n\n" +
                "Do I seek to share what I have with the poor and needy and with the Church according to my means?");
        db.insert("COMMANDMENT", null, value1);
        ContentValues value2 = new ContentValues();
        value2.put("title", "8th Commandment");
        value2.put("prayer", "You shall not bear false witness against your neighbour.\n\n" +
                "Am I a trustworthy and sincere person? Do I keep my word and my promises, and keep confidential things confidential?\n\n" +
                "Have I revealed secrets or confidential information without good reason?\n\n" +
                "Have I ruined the good name of others by gossiping, speaking badly or spreading rumours/lies or maliciously revealing their faults and sins?\n\n" +
                "Have I ridiculed or humiliated anyone?\n\n" +
                "Do I tell the truth, even if it is inconvenient? Or do I lie or mislead people?\n\n" +
                "Have I sworn falsely?\n\n" +
                "Have I cheated, plagiarized or been academically dishonest?\n\n" +
                "Am I \"two-faced\", that is, have I been a certain kind of person to some people, but a completely different kind of person to others?");
        db.insert("COMMANDMENT", null, value2);
        ContentValues value3 = new ContentValues();
        value3.put("title", "9th Commandment");
        value3.put("prayer", "You shall not desire your neighbour's wife.\n\n" +
                "Have I deliberately and consciously permitted sexual thoughts about anyone besides my spouse?\n\n" +
                "Do I guard my imagination and senses?\n\n" +
                "Am I responsible about what I read?");
        db.insert("COMMANDMENT", null, value3);
        ContentValues value4 = new ContentValues();
        value4.put("title", "10th Commandment");
        value4.put("prayer", "You shall not desire your neighbour's goods.\n\n" +
                "Am I envious of the possessions, abilities, talents, beauty, or success of others?\n\n" +
                "Am I grateful for the things I have and for the blessings God has given me? Or am I always complaining?\n\n" +
                "Am I greedy or selfish? Am I too caught up with material things?\n\n" +
                "Am I jealous of other people: jealous of their possessions, talents, beauty, success or relationships?\n\n" +
                "Do I wish that others be deprived of the goods or talents that are theirs? \n\n" +
                "Do I harbor unforgiveness and grudges against others? \n\n" +
                "Am I a resentful person? Do I put down others?");
        db.insert("COMMANDMENT", null, value4);
        ContentValues value5 = new ContentValues();
        value5.put("title", "Percepts of the church");
        value5.put("prayer", "Have I deliberately missed Mass on a Sunday or Holy Day of obligation without a serious reason?\n\n" +
                "Do I go to confession at least once a year when I have serious sins to confess?\n\n" +
                "Do I receive Holy Communion, at least once during Eastertime?\n\n" +
                "Do I take part in the major feasts celebrating Our Lord, the Virgin Mary, and the saints?\n\n" +
                "Do I abstain from meat on Fridays during Lent (for ages 14 and over) and fast on one full meal on Ash Wednesday and Good Friday (for ages 18-59)?\n\n" +
                "Do I fast for one hour before Holy Communion (water and medicine allowed)?\n\n" +
                "Do I contribute to support the material needs of the church?\n\n" +
                "Do I forgive myself for my sins after bringing them to God in the Sacrament of Reconciliation?");
        db.insert("COMMANDMENT", null, value5);







    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + "COMMANDMENT");
        onCreate(db);
    }



}



