package sws.api.android;

import android.support.annotation.NonNull;
import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Date;

import sws.api.ModelReader;

/**
 *
 * Created by jeziel on 11/03/17.
 */
public class JsonModelReader implements ModelReader {

    private static final String TAG = JsonModelReader.class.getSimpleName();

    private JSONObject jsonObject;

    public JsonModelReader(@NonNull JSONObject jsonObject) {
        this.jsonObject = jsonObject;
    }

    @Override
    public String readString(@NonNull String name, String defaultValue) {
        try {
            return (!jsonObject.isNull(name)) ? jsonObject.getString(name) : defaultValue;
        } catch (JSONException e) {
            Log.e(TAG, e.getMessage());
            return null;
        }
    }

    @Override
    public int readInt(@NonNull String name, int defaultValue) {
        try {
            return (!jsonObject.isNull(name)) ? jsonObject.getInt(name) : defaultValue;
        } catch (JSONException e) {
            Log.e(TAG, e.getMessage());
            return 0;
        }
    }

    @Override
    public long readLong(String name, long defaultValue) {
        try {
            return (!jsonObject.isNull(name)) ? jsonObject.getLong(name) : defaultValue;
        } catch (JSONException e) {
            Log.e(TAG, e.getMessage());
            return 0;
        }
    }

    @Override
    public double readDouble(@NonNull String name, double defaultValue) {
        try {
            return (!jsonObject.isNull(name)) ? jsonObject.getDouble(name) : defaultValue;
        } catch (JSONException e) {
            Log.e(TAG, e.getMessage());
            return 0;
        }
    }

    @Override
    public boolean readBoolean(@NonNull String name, boolean defaultValue) {
        try {
            return (!jsonObject.isNull(name)) ? jsonObject.getBoolean(name) : defaultValue;
        } catch (JSONException e) {
            Log.e(TAG, e.getMessage());
            return false;
        }
    }

    @Override
    public long readDate(@NonNull String name, long defaultValue) {
        try {
            return (!jsonObject.isNull(name)) ? jsonObject.getLong(name) : defaultValue;
        } catch (JSONException e) {
            Log.e(TAG, e.getMessage());
            return 0;
        }
    }

    @Override
    public Date readDate(@NonNull String name, Date defaultValue) {
        try {
            return (!jsonObject.isNull(name)) ? new Date(jsonObject.getLong(name)) : defaultValue;
        } catch (JSONException e) {
            Log.e(TAG, e.getMessage());
            return null;
        }
    }
}
