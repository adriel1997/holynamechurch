package com.hnc.hnc.holynamechurch;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Adriealle on 10-12-2018.
 */

public class novena  extends SQLiteOpenHelper {


        public novena(Context context) {
            super(context, "NOVENA", null, 1);
        }


        @Override
        public void onCreate(SQLiteDatabase db) {
            String CREATE_CONTACTS_TABLE = "CREATE TABLE NOVENA ( _id INTEGER PRIMARY KEY AUTOINCREMENT, title TEXT, prayer TEXT)";
            db.execSQL(CREATE_CONTACTS_TABLE);

            ContentValues values = new ContentValues();
            values.put("title", "NOVENA TO INFANT JESUS");
            values.put("prayer","[Every hour for nine successive hours per day]\n" +
                    "O Jesus, Who has said, \"Ask and you shall receive, seek and you shall find, knock and it shall be opened,\" through the intercession of Mary, Your Most Holy Mother, I knock, I seek, I ask that my prayer be granted. (Make your request) O Jesus, Who has said, \"All that you ask of the Father in My Name, He will grant you,\" through the intercession of Mary Your Most Holy Mother, I humbly and urgently ask your Father in your name that my prayer will be granted. (Make your request) O Jesus, Who has said, \"Heaven and earth shall pass away but My word shall not pass away,\" through the intercession of Mary Your Most Holy Mother, I feel confident that my prayer will be granted. (Make your request)\n" +
                    "Petitions and Thanksgivings\n" +
                    "\n\n" +
                    "NOVENA PRAYER\n" +
                    "O Miraculous Infant Jesus, we prostrate before Your Image and beseech You to cast your merciful look on our troubled hearts. Let Your tender Heart, so inclined to pity, be softened by our prayers and grant us that grace for which we ardently implore You. [Mention your request] Take from us all despair, all trials and misfortunes with which we are laden. For Your Sacred Infancy's sake, hear our prayers and send us consolation and aid that we may praise You, with the Father and the Holy Spirit, for ever and ever.   Amen. \n" +
                    "\n\n" +
                    "PETITIONS\n" +
                    "O Holy Infant Jesus, through your life on earth, you revealed to us by many marvels your hidden power. So now bless us abundantly with your uplifted hand and graciously deign to hear the petitions of those who call upon you in faith and trust. Amen. Our Father ... And the Word became Man And dwelt among us - [3] Hail Mary… And the Word became Man And dwelt among us Hail Mary - [11] Glory be… O Infant Jesus bless us and hear our prayers - [3] \n" +
                    "\n\n" +
                    "PRAYER TO INFANT JESUS \n" +
                    "O Miraculous Infant Jesus, look upon us, as we, turn to you, imploring your assistance in our needs and anxieties. Let your compassionate heart be moved to pity by our supplications and grant us the favour which we ardently implore you. Free us from all afflictions and despair, all trials and misfortunes and give us your support and consolation so that we may praise you and the Father and the Holy Spirit now and forever, Amen. \n" +
                    "\n\n" +
                    "THANKS FOR FAVOURS RECEIVED\n" +
                    "O most generous Infant Jesus, we, on our knees before your Sacred Image, have come to express our deep thankfulness to you for all the favours we have received at your hands. We believe, Jesus, that together with the father and Holy Spirit you are our Creator and Saviour. Henceforth , we place all our trust in you. Through this miraculous statue, may your devotion be spread throughout the world and may all Christians pay homage to your Holy Childhood and gain thereby untold divine blessings and favours. All praise and honour be to the Infant Jesus. Amen \n" +
                    "\n\n" +
                    "BLESSINGS\n" +
                    "May the Lord Jesus be with you to defend you; may He be with you to sustain you ;may He go before you to show you the way; may He follow you to guard you; from above may He bless you with the Father and the Holy Spirit who lives and reigns for ever and ever, Amen. May the Almighty God bless you, in the name of the father and of the Son and of the Holy Spirit. Amen.\n");
            db.insert("NOVENA", null, values);
            ContentValues v = new ContentValues();
            v.put("title", "NOVENA TO St. ANTHONY");
            v.put("prayer", "O’ Gracious St. Anthony, we praise you for your great virtues and remarkable humility. With the help of Jesus nothing is impossible with you. So we know that, sickness and death, perils and snares, evils and dangers disappear through your intercession. You find what is lost, you comfort the afflicted and you help the worst of the sinners to repent. There is nothing impossible for you O’ dear Saint Anthony. O’ faithful friend of Baby Jesus please be our support, our patron and our eternal benefactor. Procure all our needs, both material and spiritual from the Heavenly Father through your kind and powerful intercession, And more especially, the one we beg of you now… (Specify the intention here)\n" +
                    "O’ most loving and gentle Saint, We will always proclaim your blessings with a grateful heart. We command our body and soul, our whole self, and all that we have, to your care. It is never heard that you have disowned anyone. Protect us from all dangers. Help us to face life and its problems with serenity and to live a virtuous life without any taint of sin. May you be our stronghold, in our moments of temptation. Give us a loving and generous heart. Finally we pray to you to give us the readiness of heart to share all the good that we receive with our poor and needy brothers and sisters. Amen.\n" +
                    "3 Our Father\n3 Hail Mary\n3 Glory be to");
            db.insert("NOVENA", null, v);
            ContentValues va = new ContentValues();
            va.put("title", "NOVENA TO St. JUDE");
            va.put("prayer", "In the name of the Father, and of the Son and of the Holy Spirit. Amen.\n" +
                    "O Lord Jesus Christ, who when on earth, did with a strong cry and tears offered up prayers and supplications to the Father, receive the offering of this Novena, during which we desire to join our prayers in thine for this intention:\n" +
                    "We make this offering through Mary, your mother and our Mother, and through St. Jude Thaddeaus, your beloved cousin. For he is the helper in difficult cases. For their sake accept our prayer and render it fruitful. Amen\n" +
                    "O glorious Apostle, St. Jude Thaddaeus, patron of the desperate cases, who chosen by God to give testimony of the true Faith, suffered all kinds of tortures, and in the end gave your life rather than deny it, obtain for us, a faith strong as yours, and like you, make us ever ready to confess it with joy, so that we will die rather than deny it. \n\n" +
                    "(Our Father, Hail Mary, and Glory be.)\n" +
                    "O faithful Apostle, St. Jude Thaddaeus, beloved cousin our Saviour, by the admirable courage with which you sacrificed your life sooner than fail in your fidelity to the true Faith and the true God, obtain for us the grace to be always faithful to God and to the Church, in all our duties, so as to merit a share of glory in heaven. \n\n" +
                    "(Our Father, Hail Mary, and Glory be.)\n" +
                    "O fervent Apostle, St. Jude Thaddaeus, whose only desire was to please God in all things, obtain for us the same desire that inflamed with the same fervour, we may spend all our life in working out our salvation, so that purified by the fire of tribulation, we may be entitled to an eternal crown of glory in the kingdom of God. Amen. \n" +
                    "(Our Father, Hail Mary, and Glory be.)\n\n\n" +
                    "PRAYER TO ST. JUDE (To be said in grave need)\n" +
                    "St. Jude, glorious Apostle, faithful servant and friend of Jesus, the name of the traitor has caused you to be forgotten by many. But the Church honours and invokes you as the patron of things despaired of; pray for me, who am so miserable; pray for me, that finally I may receive the consolations and help of heaven in all my necessities, tribulations and sufferings, particularly (here make your request), and that I may bless God with the elect throughout eternity. Amen.\n" +
                    "St. Jude, Apostle, martyr and relative of our Lord Jesus Christ, of Mary and Joseph, intercede for me!\n");
            db.insert("NOVENA", null, va);
            ContentValues val = new ContentValues();
            val.put("title", "NOVENA TO St. LAWRENCE");
            val.put("prayer", "PRAYER - 1\n\n" +
                    "Glorious Martyr, St. Lawrence, we come to you in humility as we see your greatness and your power of intercession with God. You were so strong in your faith that you readily suffered tortures from the pagans and died a cruel death becoming an outstanding witness to Christ and His Church. As we discern your strong faith we believe in your powerful patronage and pray you to obtain for us a living faith, an unwavering hope and love of God and of our neighbour. Keep us pure and chaste; make us obedient to our elders. Help us to help the poor, the down trodden, the sick and those in trials and difficulties. Touch the tepid Christians and enkindle in them the fire of faith, and give the non-Christians the grace of faith in Christ. As the pagans were moved to your faith in Christ so may your immortal faith make the unbelievers embrace the true faith that the Kingdom of God may flourish. Assist us always to overcome our trials and temptations. Grant that we may always live a true Christian life and finally be victorious in the battle of faith that being true witnesses to Christ we may die in Him to join you and other saints and live for all eternity in His Kingdom to praise God forever and ever. Amen\n" +
                    "PRAYER - 2\n\n" +
                    "O St. Lawrence, who in the flower of youth suffered and died for the faith, hear our prayers. With confidence we fly to your patronage. Obtain for us deep faith, strong hope, a sincere love of God and neighbour, unsullied chastity and humble obedience. Inspire us to succour the poor, the needy, the sick and the afflicted. Lead the erring back to the Father’s Home. May God’s Kingdom spread far and wide on earth. Help us in all our needs especially…………. Finally grant that we live as the worthy people of God, die a holy death and join you in the heavenly bliss forever. Amen.\n" +
                    "PRAYER - 3\n\n" +
                    "O holy St Lawrence, Apostle and Martyr, great in virtue and rich in miracles, near kinsman of Jesus Christ, faithful intercessor of all who invoke your special patronage in time of need to you, I have recourse from the depth of my heart and humbly beg to whom God has given such great power to come to my assistance. Help me in my present urgent petition. In return I promise to make your name known and cause you to be invoked.\n\n" +
                    "(Say 3 Our Fathers, 3 Hail Mary and 3 Glories)\nSt Lawrence pray for us and all who invoke your aid. Amen");
            db.insert("NOVENA", null, val);
            ContentValues valu = new ContentValues();
            valu.put("title", "NOVENA PRAYER TO ST.  MARY");
            valu.put("prayer", "O Most Miraculous Mother of Good Health, Queen of the world, Star of the sea and the Refuge of sinners! When all deserted and fled from Jesus, you stood beneath the cross sharing His pain and sufferings. Teach me, O Mother most faithful and venerable, to love Jesus as you loved Him, and obtain for me all the necessary graces that I may ever remain faithful to Him at all times and in all places. \n" +
                    "\n\n\n" +
                    "O Mother most powerful! Heal me and all my dear ones that we may enjoy good health of mind and body. In trials and temptations obtain from Jesus, my Lord and God, whatever assistance I may stand in need of. I fly unto your patronage, O Most Miraculous Mother of Good Health, shield me from all sicknesses and diseases, trials and temptations, and grant unto me good health, peace and prosperity. Amen\n");
            db.insert("NOVENA", null, valu);
            ContentValues values2 = new ContentValues();
            values2.put("title", "PRAYER TO OUR LADY OF SNOW");
            values2.put("prayer", "O Holy Mary, Our Lady of Snows, Virgin Mary. Chosen by god as our holy mother. Mother who comforts the people come with sorrows. On belief of your son’s holy power, and your prayer to our god, please grant the things we asked daily… if it is acceptable to you. Please pray to god for us and get it for us. If my requisition is against the wish of our god, whatever necessary to me, please get that for me.\n" +
                    "\n(Here you ask the things you wish)\n\n" +
                    "O Holy Mary, Mother of God, you were so humble when St. Gabriel praise you as blessed amongst the women. With the same humbleness I praise you.. Please accept my praising.\n" +
                    "\n(say 9 times hail mary)\n\n" +
                    "O Mary, helping hand of needy people, I dedicate my good work and prayers to you to accept my prayers and grant me the things I wish. Please pray to your son our god, for me, and grant the things I asked to you.\n");
            db.insert("NOVENA", null, values2);
            ContentValues v2 = new ContentValues();
            v2.put("title", "PRAYER TO ST. FRANCIS XAVIER");
            v2.put("prayer", "O devoted Servant of God, Saint Francis Xavier, your heart was burning with love for Jesus. Impelled by his love, you went from country to country and spent yourself unto death to proclaim the name of Jesus and the good news of salvation. That is why the Father filled you with glory in heaven and preserved your body from corruption here on Earth. Filled with joy for these unique gifts, we join you in praising the Father.\n" +
                    "And Now we ask your intercession for ourselves. (Each one makes one’s intention silently.) We ask you to obtain for us the fulfilment of these desires if they are pleasing to the Father. And for everything together with you we praise the Father, through Jesus in the Spirit. Amen.");
            db.insert("NOVENA", null, v2);
            ContentValues va2 = new ContentValues();
            va2.put("title", "PRAYER TO VIRGIN MARY");
            va2.put("prayer", "O Virgin Immaculate, Mother of God and my Mother, from thy sublime height turn upon me thine eyes of pity. Filled with confidence in thy goodness and knowing full well thy power, I beseech thee to extend to me thine assistance in the journey of life, which is so full of danger for my soul. And in order that I may never be the slave of the devil through sin, but may ever live with my heart humble and pure, I entrust myself wholly to thee. I consecrate my heart to thee forever, my only desire being to love thy divine Son Jesus. Mary, none of thy devout servants has ever perished; may I too be saved. Amen.");
            db.insert("NOVENA", null, va2);

        }


        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("DROP TABLE IF EXISTS " + "NOVENA");
            onCreate(db);
        }

        void addPrayers(String n, String s) {

            SQLiteDatabase db = this.getWritableDatabase();
            ContentValues values = new ContentValues();
            values.put("title", n);
            values.put("prayer", s);
            db.insert("NOVENA", null, values);
            db.close();


        }


    }



