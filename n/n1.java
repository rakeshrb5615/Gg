package n;
public abstract class n1 {
    public static final int[] a;
    public static final int[] b;
    public static final android.graphics.Rect c;

    static n1()
    {
        n.n1.a = new int[] {16842912});
        android.graphics.Rect v0_3 = new int[0];
        n.n1.b = v0_3;
        n.n1.c = new android.graphics.Rect();
        return;
    }

    public static void a(android.graphics.drawable.Drawable p3)
    {
        int[] v0_3 = p3.getClass().getName();
        int[] v1_3 = android.os.Build$VERSION.SDK_INT;
        if ((v1_3 >= 29) && ((v1_3 < 31) && ("android.graphics.drawable.ColorStateListDrawable".equals(v0_3)))) {
            int[] v0_2 = p3.getState();
            if ((v0_2 != null) && (v0_2.length != 0)) {
                p3.setState(n.n1.b);
            } else {
                p3.setState(n.n1.a);
            }
            p3.setState(v0_2);
        }
        return;
    }

    public static android.graphics.Rect b(android.graphics.drawable.Drawable p5)
    {
        android.graphics.Rect v0_0 = android.os.Build$VERSION.SDK_INT;
        if (v0_0 < 29) {
            if ((p5 instanceof i0.a)) {
                ((i0.b) ((i0.a) p5)).getClass();
                p5 = 0;
            }
            try {
                if ((v0_0 < 29) && (n.l1.a)) {
                    int v5_1 = n.l1.b.invoke(p5, 0);
                    if (v5_1 != 0) {
                        return new android.graphics.Rect(n.l1.c.getInt(v5_1), n.l1.d.getInt(v5_1), n.l1.e.getInt(v5_1), n.l1.f.getInt(v5_1));
                    }
                }
            } catch (reflect.InvocationTargetException) {
            }
            return n.n1.c;
        } else {
            int v5_4 = n.m1.a(p5);
            return new android.graphics.Rect(l4.h.a(v5_4), l4.h.c(v5_4), l4.h.d(v5_4), l4.h.f(v5_4));
        }
    }

    public static android.graphics.PorterDuff$Mode c(int p1, android.graphics.PorterDuff$Mode p2)
    {
        if (p1 == 3) {
            return android.graphics.PorterDuff$Mode.SRC_OVER;
        } else {
            if (p1 == 5) {
                return android.graphics.PorterDuff$Mode.SRC_IN;
            } else {
                if (p1 == 9) {
                    return android.graphics.PorterDuff$Mode.SRC_ATOP;
                } else {
                    switch (p1) {
                        case 14:
                            return android.graphics.PorterDuff$Mode.MULTIPLY;
                        case 15:
                            return android.graphics.PorterDuff$Mode.SCREEN;
                        case 16:
                            return android.graphics.PorterDuff$Mode.ADD;
                        default:
                            return p2;
                    }
                }
            }
        }
    }
}
