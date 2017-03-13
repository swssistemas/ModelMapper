package sws.api.android;

import android.database.Cursor;
import android.support.annotation.NonNull;

import java.util.Date;
import sws.api.ModelReader;

/**
 * Created by jeziel on 10/03/17.
 */
public class CursorModelReader implements ModelReader {

    private Cursor cursor;

    public CursorModelReader(@NonNull Cursor c) {
        this.cursor = c;
    }

    @Override
    public String readString(@NonNull String name, String defaultValue) {
        int index = cursor.getColumnIndex(name);
        return index >= 0 ? cursor.getString(index) : defaultValue;
    }

    @Override
    public int readInt(@NonNull String name, int defaultValue) {
        int index = cursor.getColumnIndex(name);
        return index >= 0 ? cursor.getInt(index) : defaultValue;
    }

    @Override
    public long readLong(String name, long defaultValue) {
        int index = cursor.getColumnIndex(name);
        return index >= 0 ? cursor.getLong(index) : defaultValue;
    }

    @Override
    public double readDouble(@NonNull String name, double defaultValue) {
        int index = cursor.getColumnIndex(name);
        return index >= 0 ? cursor.getDouble(index) : defaultValue;
    }

    @Override
    public boolean readBoolean(@NonNull String name, boolean defaultValue) {
        int index = cursor.getColumnIndex(name);
        return index >= 0 ? cursor.getInt(index) == 1 : defaultValue;
    }

    @Override
    public long readDate(@NonNull String name, long defaultValue) {
        int index = cursor.getColumnIndex(name);
        return index >= 0 ? cursor.getLong(index) : defaultValue;
    }

    @Override
    public Date readDate(@NonNull String name, Date defaultValue) {
        int index = cursor.getColumnIndex(name);
        return index >= 0 ? new Date(cursor.getLong(index)) : defaultValue;
    }
}
