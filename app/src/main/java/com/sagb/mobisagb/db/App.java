package com.sagb.mobisagb.db;

/**
 * Created by USER on 03/11/16.
 */

import android.content.Context;

import com.sagb.model.DaoMaster;
import com.sagb.model.DaoSession;

import org.greenrobot.greendao.database.Database;

public class App  {
    /** A flag to show how easily you can switch from standard SQLite to the encrypted SQLCipher. */
    public static final boolean ENCRYPTED = true;
    ;
    private static DaoSession daoSession;


    public static void onCreate(Context ctx) {

        Database db = new DevOpenHelper(ctx).getWritableDb();
        daoSession = new DaoMaster(db).newSession();
    }

    public static DaoSession getDaoSession(Context ctx) {
        onCreate(ctx);
        return daoSession;
    }
}