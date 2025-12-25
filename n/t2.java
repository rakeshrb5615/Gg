package n;
public abstract class t2 {
    public static final ThreadLocal a;
    public static final int[] b;
    public static final int[] c;
    public static final int[] d;
    public static final int[] e;
    public static final int[] f;
    public static final int[] g;

    static t2()
    {
        n.t2.a = new ThreadLocal();
        n.t2.b = new int[] {-16842910});
        n.t2.c = new int[] {16842908});
        n.t2.d = new int[] {16842919});
        n.t2.e = new int[] {16842912});
        int[] v0_7 = new int[0];
        n.t2.f = v0_7;
        int[] v0_9 = new int[1];
        n.t2.g = v0_9;
        return;
    }

    public static void a(android.view.View p3, android.content.Context p4)
    {
        android.content.res.TypedArray v4_1 = p4.obtainStyledAttributes(g.a.j);
        try {
            if (!v4_1.hasValue(117)) {
                StringBuilder v2_1 = new StringBuilder("View ");
                v2_1.append(p3.getClass());
                v2_1.append(" is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
                android.util.Log.e("ThemeUtils", v2_1.toString());
            }
        } catch (String v3_4) {
            v4_1.recycle();
            throw v3_4;
        }
        v4_1.recycle();
        return;
    }

    public static int b(android.content.Context p4, int p5)
    {
        float v0_0 = n.t2.d(p4, p5);
        if ((v0_0 == 0) || (!v0_0.isStateful())) {
            float v0_3 = n.t2.a;
            android.util.TypedValue v1_1 = ((android.util.TypedValue) v0_3.get());
            if (v1_1 == null) {
                v1_1 = new android.util.TypedValue();
                v0_3.set(v1_1);
            }
            p4.getTheme().resolveAttribute(16842803, v1_1, 1);
            float v0_2 = v1_1.getFloat();
            int v4_1 = n.t2.c(p4, p5);
            return h0.a.h(v4_1, Math.round((((float) android.graphics.Color.alpha(v4_1)) * v0_2)));
        } else {
            return v0_0.getColorForState(n.t2.b, v0_0.getDefaultColor());
        }
    }

    public static int c(android.content.Context p2, int p3)
    {
        int[] v0 = n.t2.g;
        v0[0] = p3;
        android.content.res.TypedArray v2_1 = p2.obtainStyledAttributes(0, v0);
        try {
            Throwable v3_3 = v2_1.getColor(0, 0);
            v2_1.recycle();
            return v3_3;
        } catch (Throwable v3_1) {
            v2_1.recycle();
            throw v3_1;
        }
    }

    public static android.content.res.ColorStateList d(android.content.Context p2, int p3)
    {
        int v0_0 = n.t2.g;
        v0_0[0] = p3;
        android.content.res.TypedArray v3_2 = p2.obtainStyledAttributes(0, v0_0);
        try {
            android.content.res.ColorStateList v2_1;
            if (!v3_2.hasValue(0)) {
                v2_1 = v3_2.getColorStateList(0);
            } else {
                int v0_1 = v3_2.getResourceId(0, 0);
                if (v0_1 == 0) {
                } else {
                    v2_1 = e0.c.getColorStateList(p2, v0_1);
                    if (v2_1 == null) {
                    } else {
                    }
                }
            }
        } catch (android.content.res.ColorStateList v2_2) {
            v3_2.recycle();
            throw v2_2;
        }
        v3_2.recycle();
        return v2_1;
    }
}
