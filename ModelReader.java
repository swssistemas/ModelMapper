package sws.api;


import java.util.Date;

/**
 * Created by jeziel on 10/03/17.
 */
public interface ModelReader {

    String readString(String name, String defaultValue);
    int readInt(String name, int defaultValue);
    double readDouble(String name, double defaultValue);
    boolean readBoolean(String name, boolean defaultValue);
    long readDate(String name, long defaultValue);
    Date readDate(String name, Date defaultValue);
}
