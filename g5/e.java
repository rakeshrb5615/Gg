package g5;
public final class e {
    public static final String b;
    public static final java.util.concurrent.atomic.AtomicLong c;
    public final String a;

    static e()
    {
        java.util.concurrent.atomic.AtomicLong v0_1 = new StringBuilder();
        v0_1.append(java.util.UUID.randomUUID().toString());
        v0_1.append(System.currentTimeMillis());
        g5.e.b = g5.g.h(v0_1.toString());
        g5.e.c = new java.util.concurrent.atomic.AtomicLong(0);
        return;
    }

    public e()
    {
        g5.e v16_1 = ;
String v0_4 = new java.util.Date().getTime();
        int v4_3 = (v0_4 / 1000);
        String v0_10 = (v0_4 % 1000);
        String v3_0 = java.nio.ByteBuffer.allocate(4);
        v3_0.putInt(((int) v4_3));
        v3_0.order(java.nio.ByteOrder.BIG_ENDIAN);
        v3_0.position(0);
        String v3_1 = v3_0.array();
        String v5_0 = v3_1[0];
        int v7_0 = v3_1[1];
        byte v9 = v3_1[2];
        String v3_2 = v3_1[3];
        String v0_2 = g5.e.a(v0_10);
        g5.e v1_0 = v0_2[0];
        String v0_3 = v0_2[1];
        byte v11_2 = g5.e.a(g5.e.c.incrementAndGet());
        byte v12 = v11_2[0];
        byte v11_3 = v11_2[1];
        byte v13_4 = g5.e.a(((long) Integer.valueOf(android.os.Process.myPid()).shortValue()));
        byte v14 = v13_4[0];
        byte v13_5 = v13_4[1];
        byte[] v15_1 = new byte[10];
        v15_1[0] = v5_0;
        v15_1[1] = v7_0;
        v15_1[2] = v9;
        v15_1[3] = v3_2;
        v15_1[4] = v1_0;
        v15_1[5] = v0_3;
        v15_1[6] = v12;
        v15_1[7] = v11_3;
        v15_1[8] = v14;
        v15_1[9] = v13_5;
        String v0_9 = g5.g.e(v15_1);
        g5.e v1_2 = java.util.Locale.US;
        v16_1.a = String.format(v1_2, "%s%s%s%s", new Object[] {v0_9.substring(0, 12), v0_9.substring(12, 16), v0_9.subSequence(16, 20), g5.e.b.substring(0, 12)})).toUpperCase(v1_2);
        return;
    }

    public static byte[] a(long p1)
    {
        java.nio.ByteBuffer v0_1 = java.nio.ByteBuffer.allocate(2);
        v0_1.putShort(((short) ((int) p1)));
        v0_1.order(java.nio.ByteOrder.BIG_ENDIAN);
        v0_1.position(0);
        return v0_1.array();
    }

    public final String toString()
    {
        return this.a;
    }
}
