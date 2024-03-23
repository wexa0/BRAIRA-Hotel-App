package com.example.brairahotelapp;

public final class Guest {
    private Guest() {}

    public static class GuestEntry {
        public static final String TABLE_NAME = "guest";
        public static final String COLUMN_GUEST_ID = "guest_id";
        public static final String COLUMN_FIRST_NAME = "first_name";
        public static final String COLUMN_LAST_NAME = "last_name";
        public static final String COLUMN_PHONE_NO = "phone_no";
        public static final String COLUMN_EMAIL_ADDRESS = "email_address";
        public static final String COLUMN_PASSWORD = "password";
    }

    public static final String SQL_CREATE_TABLE =
            "CREATE TABLE " + GuestEntry.TABLE_NAME + " (" +
                    GuestEntry.COLUMN_GUEST_ID + " INTEGER PRIMARY KEY," +
                    GuestEntry.COLUMN_FIRST_NAME + " TEXT," +
                    GuestEntry.COLUMN_LAST_NAME + " TEXT," +
                    GuestEntry.COLUMN_PHONE_NO + " TEXT," +
                    GuestEntry.COLUMN_EMAIL_ADDRESS + " TEXT PRIMARY KEY," +
                    GuestEntry.COLUMN_PASSWORD + " TEXT)";

    public static final String SQL_DELETE_TABLE =
            "DROP TABLE IF EXISTS " + GuestEntry.TABLE_NAME;
}
