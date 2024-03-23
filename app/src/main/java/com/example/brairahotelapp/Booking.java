package com.example.brairahotelapp;

public final class Booking {
    private Booking() {}

    public static class BookingEntry {
        public static final String TABLE_NAME = "booking";
        public static final String COLUMN_BOOKING_ID = "booking_id";
        public static final String COLUMN_GUEST_ID = "guest_id";
        public static final String COLUMN_ROOM_ID = "room_id";
        public static final String COLUMN_BOOKING_DATE = "booking_date";
        public static final String COLUMN_CHECK_IN_DATE = "check_in_date";
        public static final String COLUMN_CHECK_OUT_DATE = "check_out_date";
        public static final String COLUMN_CHECK_IN_TIME = "check_in_time";
        public static final String COLUMN_CHECK_OUT_TIME = "check_out_time";
    }

    public static final String SQL_CREATE_TABLE =
            "CREATE TABLE " + BookingEntry.TABLE_NAME + " (" +
                    BookingEntry.COLUMN_BOOKING_ID + " INTEGER PRIMARY KEY," +
                    BookingEntry.COLUMN_GUEST_ID + " INTEGER," +
                    BookingEntry.COLUMN_ROOM_ID + " INTEGER," +
                    BookingEntry.COLUMN_BOOKING_DATE + " TEXT," +
                    BookingEntry.COLUMN_CHECK_IN_DATE + " TEXT," +
                    BookingEntry.COLUMN_CHECK_OUT_DATE + " TEXT," +
                    BookingEntry.COLUMN_CHECK_IN_TIME + " TEXT," +
                    BookingEntry.COLUMN_CHECK_OUT_TIME + " TEXT," +
                    "FOREIGN KEY(" + BookingEntry.COLUMN_GUEST_ID + ") REFERENCES " +
                    Guest.GuestEntry.TABLE_NAME + "(" + Guest.GuestEntry.COLUMN_GUEST_ID + ")," +
                    "FOREIGN KEY(" + BookingEntry.COLUMN_ROOM_ID + ") REFERENCES " +
                    Room.RoomEntry.TABLE_NAME + "(" + Room.RoomEntry.COLUMN_ROOM_ID + "))";

    public static final String SQL_DELETE_TABLE =
            "DROP TABLE IF EXISTS " + BookingEntry.TABLE_NAME;
}
