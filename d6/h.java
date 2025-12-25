package d6;
public final class h {
    public static final byte a;
    public static final byte b;

    static h()
    {
        d6.h.a = Byte.parseByte("01110000", 2);
        d6.h.b = Byte.parseByte("00001111", 2);
        return;
    }

    public static String a()
    {
        String v0_0 = java.util.UUID.randomUUID();
        int v1_2 = new byte[17];
        int v1_3 = java.nio.ByteBuffer.wrap(v1_2);
        v1_3.putLong(v0_0.getMostSignificantBits());
        v1_3.putLong(v0_0.getLeastSignificantBits());
        String v0_1 = v1_3.array();
        String v2_1 = v0_1[0];
        v0_1[16] = v2_1;
        v0_1[0] = ((byte) ((v2_1 & d6.h.b) | d6.h.a));
        return new String(android.util.Base64.encode(v0_1, 11), java.nio.charset.Charset.defaultCharset()).substring(0, 22);
    }
}
