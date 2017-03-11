package sws.api.android;

import android.support.annotation.NonNull;
import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Date;

import sws.api.ModelWriter;

/**
 * Created by jeziel on 11/03/17.
 */
public class JsonModelWriter implements ModelWriter {

    private static final String TAG = JsonModelWriter.class.getSimpleName();

    private JSONObject jsonObject;

    public JsonModelWriter(@NonNull JSONObject jsonObject) {
        this.jsonObject = jsonObject;
    }

    @Override
    public void writeString(@NonNull String name, String value) {
        try {
            jsonObject.put(name, value);
        } catch (JSONException e) {
            Log.e(TAG, e.getMessage());
        }
    }

    @Override
    public void writeInt(@NonNull String name, int value) {
        try {
            jsonObject.put(name, value);
        } catch (JSONException e) {
            Log.e(TAG, e.getMessage());
        }
    }

    @Override
    public void writeDouble(@NonNull String name, double value) {
        try {
            jsonObject.put(name, value);
        } catch (JSONException e) {
            Log.e(TAG, e.getMessage());
        }
    }

    @Override
    public void writeBoolean(@NonNull String name, boolean value) {
        try {
            jsonObject.put(name, value);
        } catch (JSONException e) {
            Log.e(TAG, e.getMessage());
        }
    }

    @Override
    public void writeDate(@NonNull String name, long value) {
        try {
            jsonObject.put(name, value);
        } catch (JSONException e) {
            Log.e(TAG, e.getMessage());
        }
    }

    @Override
    public void writeDate(@NonNull String name, @NonNull Date value) {
        try {
            jsonObject.put(name, value.getTime());
        } catch (JSONException e) {
            Log.e(TAG, e.getMessage());
        }
    }
}
