package com.example.oelmoussaid.mobisagb;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by o.elmoussaid on 02/11/2016.
 */

public class BDDAO {

    final String tableName="Operateurs";
     ConnectSqlite con;
     SQLiteDatabase db;
    public BDDAO(Context contxt) {
        this.con = new ConnectSqlite(contxt);
    }


    public long InsertOp( Operateurs op)
    {
        ContentValues contentvalue=new ContentValues();
        contentvalue.put("NomOper",op.getNom());
        contentvalue.put("PassWord",op.getPass());
        db = con.getWritableDatabase();
        return db.insert(tableName,null,contentvalue);
    }

}
