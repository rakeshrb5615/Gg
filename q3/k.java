package q3;
public abstract class k {
    public static final int[] a;
    public static final int[] b;
    public static final a2.q c;

    static synthetic k()
    {
        q3.k.a = new int[] {2130968876});
        q3.k.b = new int[] {2130968883});
        q3.k.c = new a2.q(2);
        return;
    }

    public static void a(android.content.Context p1, android.util.AttributeSet p2, int p3, int p4)
    {
        int v2_2 = p1.obtainStyledAttributes(p2, c3.a.G, p3, p4);
        String v3_7 = v2_2.getBoolean(1, 0);
        v2_2.recycle();
        if (v3_7 != null) {
            int v2_1 = new android.util.TypedValue();
            if ((!p1.getTheme().resolveAttribute(2130969278, v2_1, 1)) || ((v2_1.type == 18) && (v2_1.data == 0))) {
                q3.k.c(p1, q3.k.b, "Theme.MaterialComponents");
            }
        }
        q3.k.c(p1, q3.k.a, "Theme.AppCompat");
        return;
    }

    public static varargs void b(android.content.Context p5, android.util.AttributeSet p6, int[] p7, int p8, int p9, int[] p10)
    {
        android.content.res.TypedArray v0_1 = p5.obtainStyledAttributes(p6, c3.a.G, p8, p9);
        int v2 = 0;
        if (v0_1.getBoolean(2, 0)) {
            if (p10.length != 0) {
                IllegalArgumentException v5_1 = p5.obtainStyledAttributes(p6, p7, p8, p9);
                int v7_1 = 0;
                while (v7_1 < p10.length) {
                    if (v5_1.getResourceId(p10[v7_1], -1) != -1) {
                        v7_1++;
                    } else {
                        v5_1.recycle();
                    }
                }
                v5_1.recycle();
                v2 = 1;
            } else {
                if (v0_1.getResourceId(0, -1) != -1) {
                }
            }
            v0_1.recycle();
            if (v2 == 0) {
                throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
            } else {
                return;
            }
        } else {
            v0_1.recycle();
            return;
        }
    }

    public static void c(android.content.Context p2, int[] p3, String p4)
    {
        IllegalArgumentException v2_1 = p2.obtainStyledAttributes(p3);
        String v0_1 = 0;
        while (v0_1 < p3.length) {
            if (!v2_1.hasValue(v0_1)) {
                v2_1.recycle();
                throw new IllegalArgumentException(v1.a.l("The style on this component requires your app theme to be ", p4, " (or a descendant)."));
            } else {
                v0_1++;
            }
        }
        v2_1.recycle();
        return;
    }

    public static android.view.ViewGroup d(x3.e p2)
    {
        android.view.ViewGroup v0_0 = p2.getRootView();
        android.view.ViewGroup v1_2 = ((android.view.ViewGroup) v0_0.findViewById(16908290));
        if (v1_2 == null) {
            if ((v0_0 == p2) || (!(v0_0 instanceof android.view.ViewGroup))) {
                return 0;
            } else {
                return ((android.view.ViewGroup) v0_0);
            }
        } else {
            return v1_2;
        }
    }

    public static java.util.ArrayList e(com.google.android.material.appbar.MaterialToolbar p4, CharSequence p5)
    {
        java.util.ArrayList v0_1 = new java.util.ArrayList();
        int v1 = 0;
        while (v1 < p4.getChildCount()) {
            android.widget.TextView v2_2 = p4.getChildAt(v1);
            if ((v2_2 instanceof android.widget.TextView)) {
                android.widget.TextView v2_0 = ((android.widget.TextView) v2_2);
                if (android.text.TextUtils.equals(v2_0.getText(), p5)) {
                    v0_1.add(v2_0);
                }
            }
            v1++;
        }
        return v0_1;
    }

    public static varargs android.content.res.TypedArray f(android.content.Context p0, android.util.AttributeSet p1, int[] p2, int p3, int p4, int[] p5)
    {
        q3.k.a(p0, p1, p3, p4);
        q3.k.b(p0, p1, p2, p3, p4, p5);
        return p0.obtainStyledAttributes(p1, p2, p3, p4);
    }

    public static android.graphics.PorterDuff$Mode g(int p1, android.graphics.PorterDuff$Mode p2)
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
