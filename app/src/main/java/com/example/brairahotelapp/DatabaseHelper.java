package com.example.brairahotelapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "booking.db";
    private static final int DATABASE_VERSION = 1;

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Room.SQL_CREATE_TABLE);
        db.execSQL(Guest.SQL_CREATE_TABLE);
        db.execSQL(Booking.SQL_CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(Room.SQL_DELETE_TABLE);
        db.execSQL(Guest.SQL_DELETE_TABLE);
        db.execSQL(Booking.SQL_DELETE_TABLE);
        onCreate(db);
    }
}
