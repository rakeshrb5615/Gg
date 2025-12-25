package s8;
public abstract class k {
    public static final q8.d[] a;

    static k()
    {
        q8.d[] v0_1 = new q8.d[0];
        s8.k.a = v0_1;
        return;
    }

    public static final void a(int p3, int p4, q8.d p5)
    {
        kotlin.jvm.internal.j.e(p5, "descriptor");
        java.util.ArrayList v0_2 = new java.util.ArrayList();
        int v3_4 = ((~ p3) & p4);
        String v1_6 = 0;
        while (v1_6 < 32) {
            if ((v3_4 & 1) != 0) {
                v0_2.add(p5.e(v1_6));
            }
            v3_4 >>= 1;
            v1_6++;
        }
        String v4_3;
        int v5_1 = p5.b();
        kotlin.jvm.internal.j.e(v5_1, "serialName");
        if (v0_2.size() != 1) {
            String v4_2 = new StringBuilder("Fields ");
            v4_2.append(v0_2);
            v4_2.append(" are required for type with serial name \'");
            v4_2.append(v5_1);
            v4_2.append("\', but they were missing");
            v4_3 = v4_2.toString();
        } else {
            String v1_5 = new StringBuilder("Field \'");
            v1_5.append(((String) v0_2.get(0)));
            v1_5.append("\' is required for type with serial name \'");
            v1_5.append(v5_1);
            v1_5.append("\', but it was missing");
            v4_3 = v1_5.toString();
        }
        throw new o8.b(v0_2, v4_3, 0);
    }
}
