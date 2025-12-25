package s;
public abstract class a {
    public static final int[] a;
    public static final Object[] b;

    static a()
    {
        int[] v1 = new int[0];
        s.a.a = v1;
        Object[] v0_1 = new Object[0];
        s.a.b = v0_1;
        return;
    }

    public static final int a(int p3, int p4, int[] p5)
    {
        kotlin.jvm.internal.j.e(p5, "array");
        int v3_1 = (p3 - 1);
        int v0_1 = 0;
        while (v0_1 <= v3_1) {
            int v1_1 = ((v0_1 + v3_1) >> 1);
            int v2 = p5[v1_1];
            if (v2 >= p4) {
                if (v2 <= p4) {
                    return v1_1;
                } else {
                    v3_1 = (v1_1 - 1);
                }
            } else {
                v0_1 = (v1_1 + 1);
            }
        }
        return (~ v0_1);
    }

    public static final int b(long[] p4, int p5, long p6)
    {
        kotlin.jvm.internal.j.e(p4, "array");
        int v5_1 = (p5 - 1);
        int v0_1 = 0;
        while (v0_1 <= v5_1) {
            int v1_1 = ((v0_1 + v5_1) >> 1);
            long v2_0 = p4[v1_1] cmp p6;
            if (v2_0 >= 0) {
                if (v2_0 <= 0) {
                    return v1_1;
                } else {
                    v5_1 = (v1_1 - 1);
                }
            } else {
                v0_1 = (v1_1 + 1);
            }
        }
        return (~ v0_1);
    }

    public static final void c(String p1)
    {
        kotlin.jvm.internal.j.e(p1, "message");
        throw new IllegalArgumentException(p1);
    }
}
