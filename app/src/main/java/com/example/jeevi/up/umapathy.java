package com.example.jeevi.up;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class umapathy extends SQLiteOpenHelper {
   // String string;
   // String p,l,m;

    SQLiteDatabase sqLiteDatabase;

    public umapathy(Context context) {
        super(context, "information.db", null, 1);
        sqLiteDatabase=getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
    db.execSQL("create table detail (Name text,location text,Mobile text,password text,age text,bloodgroup text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public long saveit(String a,String b,String c,String d,String e,String f){
        ContentValues contentValues=new ContentValues();
         contentValues.put("Name",a);
        contentValues.put("location",b);
        contentValues.put("Mobile",c);
        contentValues.put("password",d);
        contentValues.put("age",e);
        contentValues.put("bloodgroup",f);
        long p=sqLiteDatabase.insert("detail",null,contentValues);
        return p;
    }

    public String getu(String r) {

        Cursor cursor;
            cursor = sqLiteDatabase.query("detail", null, "Name=?", new String[]{r},
                    null, null, null);
        if (cursor.getCount() < 1) {
            return "DOES NOT EXIST";
        }
        else {

            cursor.moveToFirst();
            String z = cursor.getString(cursor.getColumnIndex("location"));
            // String y=cursor.getString(cursor.getColumnIndex("Mobile"));
            //String Z=cursor.getString(cursor.getColumnIndex("age"));
            //String W=cursor.getString(cursor.getColumnIndex("bloodgroup"));
            return z;
        }


        //return Y;
        //return z;
       //return w;

    }

    public String getuu(String r) {



            Cursor cursor;
            cursor = sqLiteDatabase.query("detail", null, "Name=?", new String[]{r},
                    null, null, null);
            if (cursor.getCount() < 1) {
             return "DOES NOT EXIST";
            }
              cursor.moveToFirst();
            String z1 = cursor.getString(cursor.getColumnIndex("Mobile"));
            return z1;

    }

    public String getuuu(String r) {



           Cursor cursor;
            cursor = sqLiteDatabase.query("detail", null, "Name=?", new String[]{r},
                    null, null, null);
           if (cursor.getCount() < 1) {
                return "DOES NOT EXIST";
            }
            cursor.moveToFirst();
            String z2 = cursor.getString(cursor.getColumnIndex("age"));
            return z2;


    }

    public String getuuuu(String r) {



            Cursor cursor;
            cursor = sqLiteDatabase.query("detail", null, "Name=?", new String[]{r},
                    null, null, null);
            if (cursor.getCount() < 1) {
               return "DOES NOT EXIST";
            }
             cursor.moveToFirst();
            String z3 = cursor.getString(cursor.getColumnIndex("bloodgroup"));
            return z3;
        }


    public String getuv(String r) {
        Cursor cursor;
        cursor = sqLiteDatabase.query("detail", null, "Name=?", new String[]{r},
                null, null, null);
        if (cursor.getCount() < 1) {
            return "DOES NOT EXIST";
        }
        cursor.moveToFirst();

        String z4 = cursor.getString(cursor.getColumnIndex("password"));
        return z4;

    }
   /* public void deleteinformation(String user_name,SQLiteDatabase sqLiteDatabase){
        String selection = UserContract.NewUserInfo.USER_NAME+" LIKE ?";
        String[] seletion_args={user_name};
        sqLiteDatabase.delete(UserContract.NewUserInfo.TABLE_NAME,selection,seletion_args);
*/
   public void deletein(String r,SQLiteDatabase sqLiteDatabase){
       sqLiteDatabase.delete("detail","Name=?",new String[]{r});
    }
}

