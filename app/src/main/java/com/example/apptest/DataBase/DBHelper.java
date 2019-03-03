package com.example.apptest.DataBase;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import com.example.apptest.model.Results;


public class DBHelper extends SQLiteOpenHelper {

    private static final  String DB_NAME="meetup_db";
    private static int DB_VERSION=1;
    public static final  String MEETUP_TABLE="EMPLOYEE";
    public static final  String ID="id";
    public static  final String NAME="name";
    public static final String DESCRIPTION="description";
    public static final String COUNT="membercount";
    public static final String LON="longitude";
    public static final String LAT="latitude";
    SQLiteDatabase db = getWritableDatabase();
    Results results1;

    public DBHelper(Context context) {
        super(context, DB_NAME, null , DB_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String DB_CREATE= " create table " + MEETUP_TABLE + " ( " + ID + " integer primary key ," + NAME +
                " text , " + DESCRIPTION + " text ," + COUNT + " integer , " + LON + " double , " + LAT + " double ) ";
        db.execSQL(DB_CREATE);
    }


    public void insertData(Results[] results, Context context){
        ContentValues cv = new ContentValues();

        for(int i = 0; i == results.length; i++) {
            results1 = results[i];
            int id=Integer.parseInt(results1.getId());
            cv.put(ID,id);
            cv.put(NAME, results1.getName());
            cv.put(DESCRIPTION, results1.getDescription());
            cv.put(COUNT, results1.getMembers());
            cv.put(LON, results1.getLon());
            cv.put(LAT, results1.getLat());

            long insert = db.insert(MEETUP_TABLE, null, cv);
            if (insert == 0) {
                Toast.makeText(context, "Data Is Not Stored", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(context, "Data Is  Stored", Toast.LENGTH_SHORT).show();
            }
        }
        db.close();
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
