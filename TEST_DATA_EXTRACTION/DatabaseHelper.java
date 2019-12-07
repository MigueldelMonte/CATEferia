package com.example.databasehelper;



import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {

    private  static final String DATA_NAME = "  USER_INFO.DB";
    private static final int DATA_VERSION = 1;
    private static final String CREATE_QUERY = "CREATE TABLE "+ User.UserInfo.TABLE_NAME+
                                                "("+User.UserInfo.USER_NAME+" TEXT, "+
                                                User.UserInfo.USER_PHONE+" TEXT,"+
                                                User.UserInfo.USER_EMAIL+ " TEXT);";

    public DatabaseHelper(Context context){
        super(context,DATA_NAME,null,DATA_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_QUERY);
    }
    public void AddInf(String name, String phone, String mail, SQLiteDatabase db){
        ContentValues contentValues = new ContentValues();
        contentValues.put(User.UserInfo.USER_NAME,name);
        contentValues.put(User.UserInfo.USER_PHONE,phone);
        contentValues.put(User.UserInfo.USER_EMAIL,mail);

        db.insert(User.UserInfo.TABLE_NAME,null,contentValues);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
