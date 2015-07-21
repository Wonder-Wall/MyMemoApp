package com.example.yuya.mymemoapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by yuya on 2015/07/21.
 */
public class MemoOpenHelper extends SQLiteOpenHelper {
    public static final String DB_NAME="myapp.db";
    public static final int DB_VERSION= 1;

    public static final String CREATE_TABLE =
            "create table memos(" +
                    "id integer primary key autoincrement, " +
                    "title text, " +
                    "body text, " +
                    "created date time default current_timestamp," +
                    "updated date time default current_timestamp ";
    public static final String INIT_TABLE =
            "insert into memos (title, body) values" +
            "('t1','b1) ," +
            "('t2','b2) ," +
            "('t3','b3)";
    public static final String DROP_TABLE =
            "drop table if exists memos" + MemoContract.Memos.TABLES_NAME;
    public MemoOpenHelper(Context c) {
        super(c, DB_NAME, null, DB_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Create_TABLE);
        db.execSQL(INIT_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(DROP_TABLE);
        onCreate(db);

    }
}
