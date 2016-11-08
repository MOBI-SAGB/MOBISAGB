package com.sagb.mobisagb.db;

import android.content.Context;

import org.greenrobot.greendao.database.DatabaseOpenHelper;

/**
 * Created by USER on 03/11/16.
 */

public class DevOpenHelper extends DatabaseOpenHelper {

    private final static  String DB_NAME="/storage/emulated/0/Download/test.db";
    private final static int DB_VERSION=1;

    public DevOpenHelper(Context context){
        super(context,DB_NAME ,DB_VERSION);
    }

}
