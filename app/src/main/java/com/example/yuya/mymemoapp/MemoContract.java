package com.example.yuya.mymemoapp;

import android.provider.BaseColumns;

/**
 * Created by yuya on 2015/05/24.
 */
public final class MemoContract {

    public MemoContract() {}

    public static abstract class Memos implements BaseColumns {
        public static final String TABLE_NAME = "memos";
        public static final String COL_TITLE = "title";
        public static final String COL_BODY = "body";
        public static final String COL_CREATE = "created";
        public static final String COL_UPDATED = "updated";
    }
}
