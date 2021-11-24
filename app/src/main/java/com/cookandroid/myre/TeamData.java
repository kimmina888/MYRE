package com.cookandroid.myre;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class TeamData extends SQLiteOpenHelper {
    public static final String DBNAME="MYRE.db";
    public  TeamData(Context context){
        super(context,DBNAME,null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE ALL_TEAM (TNAME TEXT, CODE TEXT NOT NULL, BOSS TEXT NOT NULL, ACCOUNT INTEGER NOT NULL,PRIMARY KEY(TNAME))");
        sqLiteDatabase.execSQL("CREATE TABLE MY_TEAM (TNAME TEXT, TCODE TEXT NOT NULL, MNAME TEXT NOT NULL, MINFO TEXT NOT NULL, MCODETEXT NOT NULL, PRIMARY KEY(TNAME))");
        sqLiteDatabase.execSQL("CREATE TABLE IDEA (CONTENT TEXT PRIMARY KEY, TEAMN NOT NULL)");
        sqLiteDatabase.execSQL("CREATE TABLE MEETING (CONTENT TEXT PRIMARY KEY, DAY DATE NOT NULL,TEAMN NOT NULL)");
        sqLiteDatabase.execSQL("CREATE TABLE TODO (CONTENT TEXT PRIMARY KEY, ACHIVE BOOL NOT NULL)");
        sqLiteDatabase.execSQL("CREATE TABLE MEMBER (CONTENT TEXT PRIMARY KEY, ACHIVE BOOL NOT NULL)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
