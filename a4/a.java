package a4;
public abstract class a {
    public static final int[] a;
    public static final int[] b;

    static a()
    {
        a4.a.a = new int[] {16842752, 2130969951});
        a4.a.b = new int[] {2130969484});
        return;
    }

    public static android.content.Context a(android.content.Context p1, android.util.AttributeSet p2, int p3, int p4)
    {
        int[] v0_1 = new int[0];
        return a4.a.b(p1, p2, p3, p4, v0_1);
    }

    public static android.content.Context b(android.content.Context p6, android.util.AttributeSet p7, int p8, int p9, int[] p10)
    {
        l.c v2_4;
        int v1_0 = new int[1];
        l.c v2_8 = p6.obtainStyledAttributes(p7, a4.a.b, p8, p9);
        v1_0[0] = v2_8.getResourceId(0, 0);
        v2_8.recycle();
        int v1_1 = v1_0[0];
        if ((!(p6 instanceof l.c)) || (((l.c) p6).a != v1_1)) {
            v2_4 = 0;
        } else {
            v2_4 = 1;
        }
        if ((v1_1 != 0) && (v2_4 == null)) {
            l.c v2_7 = new l.c(p6, v1_1);
            int v1_2 = p10.length;
            int[] v4_0 = new int[v1_2];
            if (p10.length > 0) {
                int v8_1 = p6.obtainStyledAttributes(p7, p10, p8, p9);
                int v9_1 = 0;
                while (v9_1 < p10.length) {
                    v4_0[v9_1] = v8_1.getResourceId(v9_1, 0);
                    v9_1++;
                }
                v8_1.recycle();
            }
            int v8_2 = 0;
            while (v8_2 < v1_2) {
                int v9_2 = v4_0[v8_2];
                if (v9_2 != 0) {
                    v2_7.getTheme().applyStyle(v9_2, 1);
                }
                v8_2++;
            }
            android.content.res.Resources$Theme v6_1 = p6.obtainStyledAttributes(p7, a4.a.a);
            int v7_1 = v6_1.getResourceId(0, 0);
            int v8_4 = v6_1.getResourceId(1, 0);
            v6_1.recycle();
            if (v7_1 == 0) {
                v7_1 = v8_4;
            }
            if (v7_1 != 0) {
                v2_7.getTheme().applyStyle(v7_1, 1);
            }
            return v2_7;
        } else {
            return p6;
        }
    }
}
