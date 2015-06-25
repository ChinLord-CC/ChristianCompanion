package com.glorytog_d.app2;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.Cursor;
import android.content.Context;
import android.content.ContentValues;

/**
 * Created by Chinonso25 on 18/06/2015.
 */
public class MyDBHandler extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME="User.db";
    private static final String TABLE_NAME = "Information";
    private static final String COLUMN_ID ="id";
    private static final String COLUMN_USERNAME ="username";

    public MyDBHandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);


    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE" + TABLE_NAME + "(" +
                COLUMN_ID + "INTEGER PRIMARY KEY AUTOINCREMENT "+
                COLUMN_USERNAME + " TEXT " +
                ");";
        db.execSQL(query);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP_TABLE IF EXISTS" + TABLE_NAME );
        onCreate(db);
    }

    //ADD new row to database
    public void addName(UserInfo userInfo){
        ContentValues values = new ContentValues();
        values.put(COLUMN_USERNAME, userInfo.get_username());
        SQLiteDatabase db = getWritableDatabase();
        db.insert(TABLE_NAME, null, values);
        db.close();
    }

    //Delete product from db

    public void deleteinfo(String username){
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("DELETE FROM" + TABLE_NAME + " WHERE " + COLUMN_USERNAME + "+\"" + username + "+\"" );

    }
    //print DB
    public String databaseToString(){
        String dbString = "";
        SQLiteDatabase db = getWritableDatabase();
        String query = "SELECT * FROM" + TABLE_NAME + "WHERE 1";

        //CURSOR To LoCATION
        Cursor c = db.rawQuery(query, null);
        c.moveToFirst();


        while(!c.isAfterLast()){
            if(c.getString(c.getColumnIndex("username"))!= null);
            dbString += c.getString(c.getColumnIndex("username"));
            dbString+= "\n";

        }
        db.close();
        return dbString;

    }

}
