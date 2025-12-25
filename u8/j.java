package u8;
public abstract class j {
    public static final String[] a;
    public static final byte[] b;

    static j()
    {
        int v1_0 = new String[93];
        int v2 = 0;
        String v3_5 = 0;
        while (v3_5 < 32) {
            String v4_2 = u8.j.a((v3_5 >> 12));
            int v5_1 = u8.j.a((v3_5 >> 8));
            int v6_2 = u8.j.a((v3_5 >> 4));
            int v7_1 = u8.j.a(v3_5);
            int v8_2 = new StringBuilder("\\u");
            v8_2.append(v4_2);
            v8_2.append(v5_1);
            v8_2.append(v6_2);
            v8_2.append(v7_1);
            v1_0[v3_5] = v8_2.toString();
            v3_5++;
        }
        v1_0[34] = "\\\"";
        v1_0[92] = "\\\\";
        v1_0[9] = "\\t";
        v1_0[8] = "\\b";
        v1_0[10] = "\\n";
        v1_0[13] = "\\r";
        v1_0[12] = "\\f";
        u8.j.a = v1_0;
        byte[] v0_1 = new byte[93];
        while (v2 < 32) {
            v0_1[v2] = 1;
            v2++;
        }
        v0_1[34] = 34;
        v0_1[92] = 92;
        v0_1[9] = 116;
        v0_1[8] = 98;
        v0_1[10] = 110;
        v0_1[13] = 114;
        v0_1[12] = 102;
        u8.j.b = v0_1;
        return;
    }

    public static final char a(int p1)
    {
        char v1_2;
        char v1_1 = (p1 & 15);
        if (v1_1 >= 10) {
            v1_2 = (v1_1 + 87);
        } else {
            v1_2 = (v1_1 + 48);
        }
        return ((char) v1_2);
    }
}
