package com.hnc.hnc.holynamechurch;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Adriealle on 15-12-2018.
 */

public class sacraments extends SQLiteOpenHelper {


    public sacraments(Context context) {
        super(context, "SACRAMENTS", null, 1);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_CONTACTS_TABLE = "CREATE TABLE SACRAMENTS ( _id INTEGER PRIMARY KEY AUTOINCREMENT, title TEXT, prayer TEXT)";
        db.execSQL(CREATE_CONTACTS_TABLE);
        ContentValues va = new ContentValues();
        va.put("title", "The Seven Sacraments");
        va.put("prayer", "According to the Catholic faith, the sacraments are a gift from God, given through the Church as an outpouring of His love. Through the sacraments, God justifies and sanctifies His people (i.e., He saves them and makes them holy), He meets His people where they are in order to draw them up to Him, He pours out His grace, He builds up the Church and He receives worship.");
        db.insert("SACRAMENTS", null, va);
        ContentValues va1 = new ContentValues();
        va1.put("title", "1. Baptism");
        va1.put("prayer", "(Sacraments of initiation)\n" +
                "The sacrament of Baptism is the beginning of life – supernatural life. It is the first and fundamental sacrament and the gate to the other sacraments, is the purifying and sanctifying sacrament of rebirth. When the sacrament of Baptism is administered, the spiritual vacuum which we call original sin disappears as God becomes present in the soul, and the soul is caught up into that sharing of God’s own life which we call sanctifying grace.\n\n" +
                "Requirements:\n" +
                "●Children of the Catholic parents are baptized when both parents are present their child to the church.\n\n" +
                "●Notice for baptism must be given to the Parish priest at least a week in advance.\n\n" +
                "●Godparents/Sponsors chosen by the parents must be practicing adult Catholics who have received Confirmation. If there is a reasonable doubt that the child will not be brought up in the true faith, the priest may refuse or delay the baptism.\n\n" +
                "●Baptism may not be administered to those children whose parents marriage has not been blessed in the Catholic Church. Such parents will have to have their marriage regularized as per the church law.\n\n" +
                "●Baptism is administered on Sunday before the Mass.");

        db.insert("SACRAMENTS", null, va1);
        ContentValues va2 = new ContentValues();
        va2.put("title", "2. Penance and Reconciliation");
        va2.put("prayer", "(Confession) (Sacraments of healing)\n" +
                "Through penance, the faithful receive pardon through God's mercy for the sins they have committed. At the same time, they are reconciled with the Church community. The confession, or disclosure, of sins frees us and facilitates our reconciliation with others.");

        db.insert("SACRAMENTS", null, va2);
        ContentValues va3 = new ContentValues();
        va3.put("title", "3. Eucharist");
        va3.put("prayer", "(Communion) (Sacraments of initiation)\n" +
                    "Those who partake in the Eucharist receive the real Body, Blood, Soul, and Divinity of Jesus Christ in what appears to be bread and wine. The catechism points out that the Holy Eucharist is both a sacrifice and a sacrament. The Eucharistic Sacrifice, the memorial of the death and resurrection of the Lord, in which the sacrifice of the cross is perpetuated over the centuries, is the summit and source of all Christian life and worship; it signifies and effects the unity of the people of God and achieves the building up of the Body of Christ.");

        db.insert("SACRAMENTS", null, va3);
        ContentValues va4 = new ContentValues();
        va4.put("title", "4. Confirmation");
        va4.put("prayer", "(Sacraments of initiation)\n" +
                "Confirmation provides a special outpouring of the Holy Spirit, which helps the confirmed Catholic witness to Christ and lead a mature Christian life. The Catechism’s section on Confirmation says that Confirmation is the special outpouring of the Holy Spirit. Confirmation is conferred through anointing with chrism and the laying on of hands.");

        db.insert("SACRAMENTS", null, va4);
        ContentValues va5 = new ContentValues();
        va5.put("title", "5. Matrimony");
        va5.put("prayer", "(Marriage) (Sacraments of service)\n" +
                "The Church has a rich tradition in its teaching on sacramental marriage and covenantal union. To ensure the right use of the procreative power God founded the institution of marriage: the lifelong and irrevocable union of one man and one woman. The matrimonial covenant, by which a man and a woman establish between themselves a partnership for the whole of life, is by its nature ordered toward the good of the spouses and the procreation and education of offspring.");


        db.insert("SACRAMENTS", null, va5);
        ContentValues va6 = new ContentValues();
        va6.put("title", "6. Holy Orders");
        va6.put("prayer", "(Sacraments of service)\n" +
                "Holy Orders is the sacrament by which bishops, priests and deacons are ordained and receive the power and grace to perform their sacred duties. The sacred rite by which orders are conferred is called ordination. There are two notable ways in which the sacrament of Holy Orders differs from the other sacraments. One is the fact that Holy Orders can be administered only by a bishop. The second way in which Holy Orders differs from other sacraments is that Holy Orders is not received all at once.");

        db.insert("SACRAMENTS", null, va6);
        ContentValues va7 = new ContentValues();
        va7.put("title", "7. Anointing of the Sick");
        va7.put("prayer", "(Extreme Unction) (Sacraments of healing)\n" +
                "The Anointing of the Sick is a remarkable sign of God’s great love for us and offers the comfort of God's grace to those who are ill. Through the sacrament of anointing, Christ strengthens the faithful who are afflicted by illness, providing them with the strongest means of support. The sacrament provides spiritual and sometimes physical healing, according to God's will, but also allows the sick person to join his or her sufferings to Christ and prepare for death. The celebration of this sacrament is an opportunity for the deepening of the faith of the community who are able to witness the faith and devotion of those being anointed.\n" +
                "\n\n" +
                "Requirements:\n" +
                "●The faithful must inform the Parish Priest when a member of the family is sick and in need of communion\n\n" +
                "●Anointing the sick (anytime during day or night");

        db.insert("SACRAMENTS", null, va);
        ContentValues va8 = new ContentValues();
        va8.put("title", "Christian Burial/Funeral");
        va8.put("prayer", "The Church asks spiritual assistance for the departed, honors their bodies, and at the same time brings solace of hope to the living. The celebration of the Christian funeral brings hope and consolation to the living. While proclaiming the Gospel of Jesus Christ and witnessing to the Christian hope in the resurrection, the funeral rites also recall to all who take part in them God's mercy and judgement and meet the human need to turn always to God in times of crisis.\n" +
                "\n" +
                "Requirements:\n" +
                "●Contact the Parish Priest immediately.\n" +
                "●Get a death certificate. In case of accidental death, a police certificate is necessary.\n" +
                "Before taking the body to the cemetery, inform the officiating Priest.");

        db.insert("SACRAMENTS", null, va8);

        }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + "SACRAMENTS");
        onCreate(db);
    }



}




