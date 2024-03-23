package com.example.brairahotelapp;

public final class Room {
    private Room() {}

    public static class RoomEntry {
        public static final String TABLE_NAME = "room";
        public static final String COLUMN_ROOM_ID = "room_id";
        public static final String COLUMN_ROOM_TYPE = "room_type";
        public static final String COLUMN_ROOM_IMAGE = "room_image";
        public static final String COLUMN_ROOM_DESCRIPTION = "room_description";
        public static final String COLUMN_ROOM_PRICE = "room_price";
        public static final String COLUMN_ROOM_CAPACITY = "room_capacity";
        public static final String COLUMN_ROOM_FACILITIES = "room_facilities";
    }

    public static final String SQL_CREATE_TABLE =
            "CREATE TABLE " + RoomEntry.TABLE_NAME + " (" +
                    RoomEntry.COLUMN_ROOM_ID + " INTEGER PRIMARY KEY," +
                    RoomEntry.COLUMN_ROOM_TYPE + " TEXT," +
                    RoomEntry.COLUMN_ROOM_IMAGE + " TEXT," +
                    RoomEntry.COLUMN_ROOM_DESCRIPTION + " TEXT," +
                    RoomEntry.COLUMN_ROOM_PRICE + " REAL," +
                    RoomEntry.COLUMN_ROOM_CAPACITY + " INTEGER," +
                    RoomEntry.COLUMN_ROOM_FACILITIES + " TEXT)";

    public static final String SQL_DELETE_TABLE =
            "DROP TABLE IF EXISTS " + RoomEntry.TABLE_NAME;
}
