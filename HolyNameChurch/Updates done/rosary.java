package com.hnc.hnc.holynamechurch;

import android.content.ContentValues;

import android.content.Context;

import android.database.sqlite.SQLiteDatabase;

import android.database.sqlite.SQLiteOpenHelper;

/**

 * Created by Adriealle on 10-12-2018.

 */

public class rosary  extends SQLiteOpenHelper {


        public rosary(Context context) {

            super(context, "ROSARY", null, 1);

        }


        @Override

        public void onCreate(SQLiteDatabase db) {

            String CREATE_CONTACTS_TABLE = "CREATE TABLE ROSARY ( _id INTEGER PRIMARY KEY AUTOINCREMENT, title TEXT, prayer TEXT)";

            db.execSQL(CREATE_CONTACTS_TABLE);

            ContentValues values = new ContentValues();
values.put("title","How to Pray the Rosary");
            values.put("prayer","The Rosary is a Scripture-based prayer. It begins with the Apostles' Creed, which summarizes the great mysteries of the Catholic faith. The Our Father, which introduces each mystery, is from the Gospels. The first part of the Hail Mary is the angel's words announcing Christ's birth and Elizabeth's greeting to Mary. St. Pius V officially added the second part of the Hail Mary. The Mysteries of the Rosary center on the events of Christ's life. There are four sets of Mysteries: Joyful, Sorrowful, Glorious and––added by Saint John Paul II in 2002––the Luminous.\n" +
                    "\n" +
                    "The repetition in the Rosary is meant to lead one into restful and contemplative prayer related to each Mystery. The gentle repetition of the words helps us to enter into the silence of our hearts, where Christ's spirit dwells. The Rosary can be said privately or with a group.\n" +
                    "\nThe Five Joyful Mysteries are traditionally prayed on Mondays, Saturdays, and, during the season of Advent, on Sundays:\n" +
                    "1.The Annunciation\n" +
                    "2.The Visitation\n" +
                    "3.The Nativity\n" +
                    "4.The Presentation in the Temple\n" +
                    "5.The Finding in the Temple\n" +
                    "\nThe Five Sorrowful Mysteries are traditionally prayed on Tuesdays, Fridays, and, during the season of Lent, on Sundays:\n" +
                    "1.The Agony in the Garden\n" +
                    "2.The Scourging at the Pillar\n" +
                    "3.The Crowning with Thorns\n" +
                    "4.The Carrying of the Cross\n" +
                    "5.The Crucifixion and Death\n" +
                    "\nThe Five Glorious Mysteries are traditionally prayed on Wednesdays and, outside the seasons of Advent and Lent, on Sundays:\n" +
                    "1.The Resurrection\n" +
                    "2.The Ascension\n" +
                    "3.The Descent of the Holy Spirit\n" +
                    "4.The Assumption\n" +
                    "5.The Coronation of Mary\n" +
                    "\nThe Five Luminous Mysteries are traditionally prayed on Thursdays:\n" +
                    "1.The Baptism of Christ in the Jordan\n" +
                    "2.The Wedding Feast at Cana\n" +
                    "3.Jesus' Proclamation of the Coming of the Kingdom of God\n" +
                    "4.The Transfiguration\n" +
                    "5.The Institution of the Eucharist");

            db.insert("ROSARY", null, values);

            ContentValues v = new ContentValues();
            v.put("title","Praying the Rosary");
            v.put("prayer","Familiarize yourself and/or your group with the prayers of the rosary.\n\n" +
                    "1.Make the Sign of the Cross.\n" +
                    "2.Holding the Crucifix, say the Apostles' Creed.\n" +
                    "3.On the first bead, say an Our Father.\n" +
                    "4.Say one Hail Mary on each of the next three beads.\n" +
                    "5.Say the Glory Be\n" +
                    "6.For each of the five decades, announce the Mystery (perhaps followed by a brief reading from Scripture) then say the Our Father.\n" +
                    "7.While moving across each of the ten beads of the decade, next say ten Hail Marys while meditating on the Mystery. Then say a Glory Be.\n" +
                    "(After finishing each decade, some say the following prayer requested by the Blessed Virgin Mary at Fatima: O my Jesus, forgive us our sins, save us from the fires of hell; lead all souls to Heaven, especially those who have most need of your mercy.)\n" +
                    "8.After saying the five decades, say the Hail, Holy Queen, followed by this dialogue and prayer:\n" +
                    "\n" +
                    "V. Pray for us, O holy Mother of God.\n" +
                    "R. That we may be made worthy of the promises of Christ.\n" +
                    "Let us pray: O God, whose Only Begotten Son,\n" +
                    "by his life, Death, and Resurrection,\n" +
                    "has purchased for us the rewards of eternal life,\n" +
                    "grant, we beseech thee,\n" +
                    "that while meditating on these mysteries\n" +
                    "of the most holy Rosary of the Blessed Virgin Mary,\n" +
                    "we may imitate what they contain\n" +
                    "and obtain what they promise,\n" +
                    "through the same Christ our Lord. Amen.\n" +
                    "\n" +
                    "(A prayer to St. Joseph may also follow.) Conclude the Rosary with the Sign of the Cross.\n" +
                    "Prayers of the Rosary");

            db.insert("ROSARY", null, v);
            ContentValues va = new ContentValues();
            va.put("title","The Apostles' Creed");
            va.put("prayer","I believe in God,\n" +
                    "the Father almighty,\n" +
                    "Creator of heaven and earth,\n" +
                    "and in Jesus Christ, his only Son, our Lord,\n" +
                    "who was conceived by the Holy Spirit,\n" +
                    "born of the Virgin Mary,\n" +
                    "suffered under Pontius Pilate,\n" +
                    "was crucified, died and was buried;\n" +
                    "he descended into hell;\n" +
                    "on the third day he rose again from the dead;\n" +
                    "he ascended into heaven,\n" +
                    "and is seated at the right hand of God the Father almighty;\n" +
                    "from there he will come to judge the living and the dead.\n" +
                    "\n" +
                    "I believe in the Holy Spirit,\n" +
                    "the holy catholic Church,\n" +
                    "the communion of saints,\n" +
                    "the forgiveness of sins,\n" +
                    "the resurrection of the body,\n" +
                    "and life everlasting.\n" +
                    "Amen.\n");

            db.insert("ROSARY", null, va);
            ContentValues val = new ContentValues();
            val.put("title","The Our Father");
            val.put("prayer","Our Father, who art in heaven,\n" +
                    "hallowed be thy name;\n" +
                    "thy kingdom come;\n" +
                    "thy will be done on earth as it is in heaven.\n" +
                    "Give us this day our daily bread;\n" +
                    "and forgive us our trespasses\n" +
                    "as we forgive those who trespass\n" +
                    "against us;\n" +
                    "and lead us not into temptation,\n" +
                    "but deliver us from evil.\n" +
                    "Amen");

            db.insert("ROSARY", null, val);
            ContentValues valu = new ContentValues();
            valu.put("title","The Hail Mary");
            valu.put("prayer","Hail Mary, full of grace, the Lord is with you;\n" +
                    "blessed are you among women,\n" +
                    "and blessed is the fruit of your womb, Jesus.\n" +
                    "Holy Mary, Mother of God,\n" +
                    "pray for us sinners\n" +
                    "now and at the hour of our death.\n" +
                    "Amen.");
            db.insert("ROSARY", null, valu);

            ContentValues value = new ContentValues();
            value.put("title","The Glory Be (The Doxology)");
            value.put("prayer","Glory be to the Father, the Son, and the Holy Spirit;\n" +
                    "as it was in the beginning, is now, and ever shall be,\n" +
                    "world without end.\n" +
                    "Amen.");
            db.insert("ROSARY", null, value);
            ContentValues value1 = new ContentValues();
            value1.put("title","The Hail Holy Queen");
            value1.put("prayer","Hail, holy Queen, mother of mercy,\n" +
                    "our life, our sweetness, and our hope.\n" +
                    "To you we cry, poor banished children of Eve;\n" +
                    "to you we send up our sighs,\n" +
                    "mourning and weeping in this valley of tears.\n" +
                    "Turn, then, most gracious advocate,\n" +
                    "your eyes of mercy toward us;\n" +
                    "and after this, our exile,\n" +
                    "show unto us the blessed fruit of your womb, Jesus.\n" +
                    "O clement, O loving, O sweet Virgin Mary.");
            db.insert("ROSARY", null, value1);

        }


        @Override

        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

            db.execSQL("DROP TABLE IF EXISTS " + "ROSARY");

            onCreate(db);

        }




    }




