package v3;
public final class p {
    public j5.t1 a;
    public j5.t1 b;
    public j5.t1 c;
    public j5.t1 d;
    public v3.d e;
    public v3.d f;
    public v3.d g;
    public v3.d h;
    public v3.f i;
    public v3.f j;
    public v3.f k;
    public v3.f l;

    public p()
    {
        this.a = new v3.n();
        this.b = new v3.n();
        this.c = new v3.n();
        this.d = new v3.n();
        this.e = new v3.a(0);
        this.f = new v3.a(0);
        this.g = new v3.a(0);
        this.h = new v3.a(0);
        this.i = new v3.f();
        this.j = new v3.f();
        this.k = new v3.f();
        this.l = new v3.f();
        return;
    }

    public static v3.o a(android.content.Context p6, int p7, int p8, v3.a p9)
    {
        j5.t1 v0_1 = new android.view.ContextThemeWrapper(p6, p7);
        if (p8 != null) {
            v0_1.getTheme().applyStyle(p8, 1);
        }
        android.content.res.TypedArray v7_3 = v0_1.obtainStyledAttributes(c3.a.z);
        try {
            v3.d v8_2 = v7_3.getInt(0, 0);
            j5.t1 v0_3 = v7_3.getInt(3, v8_2);
            int v1_1 = v7_3.getInt(4, v8_2);
            int v2_1 = v7_3.getInt(2, v8_2);
            Throwable v6_2 = v7_3.getInt(1, v8_2);
            v3.d v8_4 = v3.p.c(v7_3, 5, p9);
            j5.t1 v9_2 = v3.p.c(v7_3, 8, v8_4);
            v3.d v3_1 = v3.p.c(v7_3, 9, v8_4);
            v3.d v4_1 = v3.p.c(v7_3, 7, v8_4);
            v3.d v8_5 = v3.p.c(v7_3, 6, v8_4);
            v3.o v5_2 = new v3.o();
            v5_2.a = q4.b.j(v0_3);
            v5_2.e = v9_2;
            v5_2.b = q4.b.j(v1_1);
            v5_2.f = v3_1;
            v5_2.c = q4.b.j(v2_1);
            v5_2.g = v4_1;
            v5_2.d = q4.b.j(v6_2);
            v5_2.h = v8_5;
            v7_3.recycle();
            return v5_2;
        } catch (Throwable v6_4) {
            v7_3.recycle();
            throw v6_4;
        }
    }

    public static v3.o b(android.content.Context p3, android.util.AttributeSet p4, int p5, int p6)
    {
        v3.a v0_1 = new v3.a(((float) 0));
        android.content.res.TypedArray v4_1 = p3.obtainStyledAttributes(p4, c3.a.r, p5, p6);
        int v5_1 = v4_1.getResourceId(0, 0);
        int v6_1 = v4_1.getResourceId(1, 0);
        v4_1.recycle();
        return v3.p.a(p3, v5_1, v6_1, v0_1);
    }

    public static v3.d c(android.content.res.TypedArray p2, int p3, v3.d p4)
    {
        float v3_1 = p2.peekValue(p3);
        if (v3_1 != 0) {
            int v0 = v3_1.type;
            if (v0 != 5) {
                if (v0 == 6) {
                    return new v3.m(v3_1.getFraction(1065353216, 1065353216));
                }
            } else {
                return new v3.a(((float) android.util.TypedValue.complexToDimensionPixelSize(v3_1.data, p2.getResources().getDisplayMetrics())));
            }
        }
        return p4;
    }

    public final boolean d()
    {
        if ((!(this.b instanceof v3.n)) || ((!(this.a instanceof v3.n)) || ((!(this.c instanceof v3.n)) || (!(this.d instanceof v3.n))))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean e(android.graphics.RectF p6)
    {
        if ((!this.l.getClass().equals(v3.f)) || ((!this.j.getClass().equals(v3.f)) || ((!this.i.getClass().equals(v3.f)) || (!this.k.getClass().equals(v3.f))))) {
            int v0_10 = 0;
        } else {
            v0_10 = 1;
        }
        boolean v6_3;
        float v1_2 = this.e.a(p6);
        if ((this.f.a(p6) != v1_2) || ((this.h.a(p6) != v1_2) || (this.g.a(p6) != v1_2))) {
            v6_3 = 0;
        } else {
            v6_3 = 1;
        }
        if ((v0_10 == 0) || ((!v6_3) || (!this.d()))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final v3.o f()
    {
        v3.o v0_1 = new v3.o();
        v0_1.a = this.a;
        v0_1.b = this.b;
        v0_1.c = this.c;
        v0_1.d = this.d;
        v0_1.e = this.e;
        v0_1.f = this.f;
        v0_1.g = this.g;
        v0_1.h = this.h;
        v0_1.i = this.i;
        v0_1.j = this.j;
        v0_1.k = this.k;
        v0_1.l = this.l;
        return v0_1;
    }

    public final String toString()
    {
        String v0_2 = new StringBuilder("[");
        v0_2.append(this.e);
        v0_2.append(", ");
        v0_2.append(this.f);
        v0_2.append(", ");
        v0_2.append(this.g);
        v0_2.append(", ");
        v0_2.append(this.h);
        v0_2.append("]");
        return v0_2.toString();
    }
}
