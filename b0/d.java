package b0;
public final class d extends android.view.ViewGroup$MarginLayoutParams {
    public b0.a a;
    public boolean b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public android.view.View k;
    public android.view.View l;
    public boolean m;
    public boolean n;
    public final android.graphics.Rect o;

    public d()
    {
        super(-2, -2);
        super.b = 0;
        super.c = 0;
        super.d = 0;
        super.e = -1;
        super.f = -1;
        super.g = 0;
        super.h = 0;
        super.o = new android.graphics.Rect();
        return;
    }

    public d(android.content.Context p8, android.util.AttributeSet p9)
    {
        super(p8, p9);
        super.b = 0;
        super.c = 0;
        super.d = 0;
        super.e = -1;
        super.f = -1;
        super.g = 0;
        super.h = 0;
        super.o = new android.graphics.Rect();
        android.content.res.TypedArray v2_3 = p8.obtainStyledAttributes(p9, a0.a.b);
        super.c = v2_3.getInteger(0, 0);
        super.f = v2_3.getResourceId(1, -1);
        super.d = v2_3.getInteger(2, 0);
        super.e = v2_3.getInteger(6, -1);
        super.g = v2_3.getInt(5, 0);
        super.h = v2_3.getInt(4, 0);
        reflect.Constructor v4_4 = v2_3.hasValue(3);
        super.b = v4_4;
        if (v4_4 != null) {
            b0.a v8_2;
            String v1_6 = v2_3.getString(3);
            if (!android.text.TextUtils.isEmpty(v1_6)) {
                if (!v1_6.startsWith(".")) {
                    if (v1_6.indexOf(46) < 0) {
                        java.util.HashMap v5_1 = androidx.coordinatorlayout.widget.CoordinatorLayout.z;
                        if (!android.text.TextUtils.isEmpty(v5_1)) {
                            StringBuilder v6_2 = new StringBuilder();
                            v6_2.append(v5_1);
                            v6_2.append(46);
                            v6_2.append(v1_6);
                            v1_6 = v6_2.toString();
                        }
                    }
                } else {
                    reflect.Constructor v4_10 = new StringBuilder();
                    v4_10.append(p8.getPackageName());
                    v4_10.append(v1_6);
                    v1_6 = v4_10.toString();
                }
                reflect.Constructor v4_11 = androidx.coordinatorlayout.widget.CoordinatorLayout.B;
                java.util.HashMap v5_4 = ((java.util.Map) v4_11.get());
                if (v5_4 == null) {
                    v5_4 = new java.util.HashMap();
                    v4_11.set(v5_4);
                }
                reflect.Constructor v4_13 = ((reflect.Constructor) v5_4.get(v1_6));
                if (v4_13 == null) {
                    v4_13 = Class.forName(v1_6, 0, p8.getClassLoader()).getConstructor(androidx.coordinatorlayout.widget.CoordinatorLayout.A);
                    v4_13.setAccessible(1);
                    v5_4.put(v1_6, v4_13);
                }
                v8_2 = ((b0.a) v4_13.newInstance(new Object[] {p8, p9})));
            } else {
                v8_2 = 0;
            }
            super.a = v8_2;
        }
        v2_3.recycle();
        b0.a v8_4 = super.a;
        if (v8_4 != null) {
            v8_4.g(super);
        }
        return;
    }

    public d(android.view.ViewGroup$LayoutParams p2)
    {
        super(p2);
        super.b = 0;
        super.c = 0;
        super.d = 0;
        super.e = -1;
        super.f = -1;
        super.g = 0;
        super.h = 0;
        super.o = new android.graphics.Rect();
        return;
    }

    public d(android.view.ViewGroup$MarginLayoutParams p2)
    {
        super(p2);
        super.b = 0;
        super.c = 0;
        super.d = 0;
        super.e = -1;
        super.f = -1;
        super.g = 0;
        super.h = 0;
        super.o = new android.graphics.Rect();
        return;
    }

    public d(b0.d p2)
    {
        super(p2);
        super.b = 0;
        super.c = 0;
        super.d = 0;
        super.e = -1;
        super.f = -1;
        super.g = 0;
        super.h = 0;
        super.o = new android.graphics.Rect();
        return;
    }

    public final boolean a(int p2)
    {
        if (!p2) {
            return this.m;
        } else {
            if (p2 == 1) {
                return this.n;
            } else {
                return 0;
            }
        }
    }
}
