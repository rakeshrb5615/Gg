package g1;
public final class u {
    public static final ThreadLocal d;
    public final int a;
    public final j6.s b;
    public volatile int c;

    static u()
    {
        g1.u.d = new ThreadLocal();
        return;
    }

    public u(j6.s p2, int p3)
    {
        this.c = 0;
        this.b = p2;
        this.a = p3;
        return;
    }

    public final int a(int p4)
    {
        int v0_0 = this.b();
        int v1_2 = v0_0.b(16);
        if (v1_2 == 0) {
            return 0;
        } else {
            java.nio.ByteBuffer v2_1 = ((java.nio.ByteBuffer) v0_0.d);
            int v1_0 = (v1_2 + v0_0.a);
            return v2_1.getInt(((p4 * 4) + ((v2_1.getInt(v1_0) + v1_0) + 4)));
        }
    }

    public final h1.a b()
    {
        int v0_0 = g1.u.d;
        h1.a v1_1 = ((h1.a) v0_0.get());
        if (v1_1 == null) {
            v1_1 = new h1.a();
            v0_0.set(v1_1);
        }
        int v0_1 = ((h1.b) this.b.b);
        int v2_1 = v0_1.b(6);
        if (v2_1 != 0) {
            int v2_2 = (v2_1 + v0_1.a);
            int v2_5 = ((this.a * 4) + ((((java.nio.ByteBuffer) v0_1.d).getInt(v2_2) + v2_2) + 4));
            int v3_9 = (((java.nio.ByteBuffer) v0_1.d).getInt(v2_5) + v2_5);
            int v0_3 = ((java.nio.ByteBuffer) v0_1.d);
            v1_1.d = v0_3;
            if (v0_3 == 0) {
                v1_1.a = 0;
                v1_1.b = 0;
                v1_1.c = 0;
            } else {
                v1_1.a = v3_9;
                int v3_10 = (v3_9 - v0_3.getInt(v3_9));
                v1_1.b = v3_10;
                v1_1.c = ((java.nio.ByteBuffer) v1_1.d).getShort(v3_10);
                return v1_1;
            }
        }
        return v1_1;
    }

    public final String toString()
    {
        int v1_0;
        String v0_1 = new StringBuilder();
        v0_1.append(super.toString());
        v0_1.append(", id:");
        int v1_10 = this.b();
        String v2_0 = v1_10.b(4);
        int v3 = 0;
        if (v2_0 == null) {
            v1_0 = 0;
        } else {
            v1_0 = ((java.nio.ByteBuffer) v1_10.d).getInt((v2_0 + v1_10.a));
        }
        int v1_6;
        v0_1.append(Integer.toHexString(v1_0));
        v0_1.append(", codepoints:");
        int v1_4 = this.b();
        String v2_3 = v1_4.b(16);
        if (v2_3 == null) {
            v1_6 = 0;
        } else {
            String v2_4 = (v2_3 + v1_4.a);
            v1_6 = ((java.nio.ByteBuffer) v1_4.d).getInt((((java.nio.ByteBuffer) v1_4.d).getInt(v2_4) + v2_4));
        }
        while (v3 < v1_6) {
            v0_1.append(Integer.toHexString(this.a(v3)));
            v0_1.append(" ");
            v3++;
        }
        return v0_1.toString();
    }
}
