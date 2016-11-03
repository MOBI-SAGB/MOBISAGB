package com.example.oelmoussaid.mobisagb;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


/**
 * Created by o.elmoussaid on 02/11/2016.
 */

public class ConnectSqlite  extends SQLiteOpenHelper{

    private static  final String DB_NAME ="/storage/emulated/0/Download/SAGB.db";
    private static final int DB_VERSION=1;

    public ConnectSqlite(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
       onCreate(db);
    }
}
