package androidx.datastore.preferences.protobuf;
public abstract class x {
    public static final java.nio.charset.Charset a;
    public static final byte[] b;

    static x()
    {
        java.nio.charset.Charset.forName("US-ASCII");
        androidx.datastore.preferences.protobuf.x.a = java.nio.charset.Charset.forName("UTF-8");
        java.nio.charset.Charset.forName("ISO-8859-1");
        IllegalArgumentException v1_2 = new byte[0];
        androidx.datastore.preferences.protobuf.x.b = v1_2;
        java.nio.ByteBuffer.wrap(v1_2);
        try {
            new androidx.datastore.preferences.protobuf.h(v1_2, 0, 0, 0).e(0);
            return;
        } catch (androidx.datastore.preferences.protobuf.z v0_1) {
            throw new IllegalArgumentException(v0_1);
        }
    }

    public static void a(Object p0, String p1)
    {
        if (p0 == null) {
            throw new NullPointerException(p1);
        } else {
            return;
        }
    }

    public static int b(long p2)
    {
        return ((int) (p2 ^ (p2 >> 32)));
    }
}
