package com.cookandroid.myre;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.view.View;

class userDBHelper extends SQLiteOpenHelper {
    User u = new User();
    public static final String DBNAME="MYRE.db";
    public  userDBHelper(Context context){
        super(context,DBNAME,null,1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
       db.execSQL("CREATE TABLE USER(UCODE text primary key)");
    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public boolean insertUser(String code){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("UCODE",code);
        db.insert("USER",null,contentValues);
        u.setCode(code);
        return true;
    }
    public boolean checkCode(String code){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("select UCODE from USER where UCODE == "+code,null);
        if( cursor.toString() == code){
            u.setCode(code);
            return true;
        }else{
            return false;
        }
    }
    public String getCode(){
        return u.getCode();
    }
}
