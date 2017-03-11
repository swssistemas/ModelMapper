package sws.api.android;


import android.content.ContentValues;
import android.support.annotation.NonNull;

import java.util.Date;

import sws.api.ModelWriter;

/**
 * Created by jeziel on 10/03/17.
 */
public class ContentValuesWriter implements ModelWriter {

    private ContentValues contentValues;

    public ContentValuesWriter(@NonNull ContentValues cv) {
        this.contentValues = cv;
    }

    @Override
    public void writeString(@NonNull String name, String value) {
        contentValues.put(name, value);
    }

    @Override
    public void writeInt(@NonNull String name, int value) {
        contentValues.put(name, value);
    }

    @Override
    public void writeDouble(@NonNull String name, double value) {
        contentValues.put(name, value);
    }

    @Override
    public void writeBoolean(@NonNull String name, boolean value) {
        contentValues.put(name, value);
    }

    @Override
    public void writeDate(@NonNull String name, long value) {
        contentValues.put(name, value);
    }

    @Override
    public void writeDate(@NonNull String name, @NonNull Date value) {
        contentValues.put(name, value.getTime());
    }
}
