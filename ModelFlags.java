package sws.api;

/**
 * Created by jeziel on 13/03/17.
 */
public final class ModelFlags {

    public static final int TYPE_JSON = 1;
    public static final int TYPE_CURSOR = 2; /* only Readable */
    public static final int TYPE_CONTENTVALUES = 3; /* only Writable */

    private ModelFlags() {}
}
