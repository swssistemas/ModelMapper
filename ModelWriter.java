package sws.api;


import java.util.Date;

/**
 * Created by jeziel on 10/03/17.
 */
public interface ModelWriter {

    void writeString(String name, String value);
    void writeInt(String name, int value);
    void writeDouble(String name, double value);
    void writeBoolean(String name, boolean value);
    void writeDate(String name, long value);
    void writeDate(String name, Date value);
}
