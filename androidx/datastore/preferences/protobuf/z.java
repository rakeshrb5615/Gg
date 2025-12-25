package androidx.datastore.preferences.protobuf;
public class z extends java.io.IOException {
    public boolean a;

    public static androidx.datastore.preferences.protobuf.z a()
    {
        return new androidx.datastore.preferences.protobuf.z("Protocol message had invalid UTF-8.");
    }

    public static androidx.datastore.preferences.protobuf.y b()
    {
        return new androidx.datastore.preferences.protobuf.y("Protocol message tag had invalid wire type.");
    }

    public static androidx.datastore.preferences.protobuf.z c()
    {
        return new androidx.datastore.preferences.protobuf.z("CodedInputStream encountered a malformed varint.");
    }

    public static androidx.datastore.preferences.protobuf.z d()
    {
        return new androidx.datastore.preferences.protobuf.z("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static androidx.datastore.preferences.protobuf.z e()
    {
        return new androidx.datastore.preferences.protobuf.z("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
