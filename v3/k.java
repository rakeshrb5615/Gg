package v3;
public class k extends android.graphics.drawable.Drawable implements v3.a0 {
    public static final android.graphics.Paint K;
    public static final v3.j[] L;
    public android.graphics.PorterDuffColorFilter A;
    public final android.graphics.RectF B;
    public final boolean C;
    public boolean D;
    public v3.p E;
    public f1.h F;
    public final f1.g[] G;
    public float[] H;
    public float[] I;
    public a5.a J;
    public final v3.h a;
    public v3.i b;
    public final v3.y[] c;
    public final v3.y[] d;
    public final java.util.BitSet e;
    public boolean f;
    public boolean m;
    public final android.graphics.Matrix n;
    public final android.graphics.Path o;
    public final android.graphics.Path p;
    public final android.graphics.RectF q;
    public final android.graphics.RectF r;
    public final android.graphics.Region s;
    public final android.graphics.Region t;
    public final android.graphics.Paint u;
    public final android.graphics.Paint v;
    public final u3.a w;
    public final v3.h x;
    public final v3.r y;
    public android.graphics.PorterDuffColorFilter z;

    static k()
    {
        int v0_4 = new android.graphics.Paint(1);
        v3.k.K = v0_4;
        v0_4.setColor(-1);
        v0_4.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff$Mode.DST_OUT));
        int v0_2 = new v3.j[4];
        v3.k.L = v0_2;
        int v0_3 = 0;
        while(true) {
            v3.j[] v1_1 = v3.k.L;
            if (v0_3 >= v1_1.length) {
                break;
            }
            v1_1[v0_3] = new v3.j(v0_3);
            v0_3++;
        }
        return;
    }

    public k()
    {
        this(new v3.p());
        return;
    }

    public k(android.content.Context p1, android.util.AttributeSet p2, int p3, int p4)
    {
        this(v3.p.b(p1, p2, p3, p4).a());
        return;
    }

    public k(v3.i p7)
    {
        android.graphics.RectF v4_5;
        this.a = new v3.h(this);
        android.graphics.Paint v1_17 = new v3.y[4];
        this.c = v1_17;
        android.graphics.Paint v1_18 = new v3.y[4];
        this.d = v1_18;
        this.e = new java.util.BitSet(8);
        this.n = new android.graphics.Matrix();
        this.o = new android.graphics.Path();
        this.p = new android.graphics.Path();
        this.q = new android.graphics.RectF();
        this.r = new android.graphics.RectF();
        this.s = new android.graphics.Region();
        this.t = new android.graphics.Region();
        android.graphics.Paint v1_16 = new android.graphics.Paint(1);
        this.u = v1_16;
        android.graphics.Paint v3_1 = new android.graphics.Paint(1);
        this.v = v3_1;
        this.w = new u3.a();
        if (android.os.Looper.getMainLooper().getThread() != Thread.currentThread()) {
            v4_5 = new v3.r();
        } else {
            v4_5 = v3.q.a;
        }
        this.y = v4_5;
        this.B = new android.graphics.RectF();
        this.C = 1;
        this.D = 1;
        f1.g[] v0_3 = new f1.g[4];
        this.G = v0_3;
        this.b = p7;
        v3_1.setStyle(android.graphics.Paint$Style.STROKE);
        v1_16.setStyle(android.graphics.Paint$Style.FILL);
        this.u();
        this.s(this.getState());
        this.x = new v3.h(this);
        return;
    }

    public k(v3.p p2)
    {
        this(new v3.i(p2));
        return;
    }

    public static float c(android.graphics.RectF p3, v3.p p4, float[] p5)
    {
        if (p5) {
            int v1 = 1;
            if (p5.length > 1) {
                while (v1 < p5.length) {
                    if (p5[v1] == p5[0]) {
                        v1++;
                    } else {
                        return -1082130432;
                    }
                }
            }
            if (p4.d()) {
                return p5[0];
            }
        } else {
            if (p4.e(p3)) {
                return p4.e.a(p3);
            }
        }
        return -1082130432;
    }

    public void a()
    {
        this.invalidateSelf();
        return;
    }

    public final void b(android.graphics.RectF p9, android.graphics.Path p10)
    {
        float v0_0 = this.b;
        this.y.a(v0_0.a, this.H, v0_0.j, p9, this.x, p10);
        if (this.b.i != 1065353216) {
            android.graphics.RectF v9_3 = this.n;
            v9_3.reset();
            v9_3.setScale(this.b.i, this.b.i, (p9.width() / 1073741824), (p9.height() / 1073741824));
            p10.transform(v9_3);
        }
        p10.computeBounds(this.B, 1);
        return;
    }

    public final int d(int p7)
    {
        int v0_0 = this.b;
        int v1_10 = ((v0_0.n + 0) + v0_0.m);
        int v0_3 = v0_0.c;
        if ((v0_3 != 0) && ((v0_3.a) && (h0.a.h(p7, 255) == v0_3.d))) {
            int v1_7;
            int v4_1 = v0_3.e;
            if ((v4_1 > 0) && (v1_10 > 0)) {
                v1_7 = Math.min((((((float) Math.log1p(((double) (v1_10 / v4_1)))) * 1083179008) + 1073741824) / 1120403456), 1065353216);
            } else {
                v1_7 = 0;
            }
            int v4_8 = android.graphics.Color.alpha(p7);
            int v7_2 = j5.t1.L(h0.a.h(p7, 255), v0_3.b, v1_7);
            if (v1_7 > 0) {
                int v0_1 = v0_3.c;
                if (v0_1 != 0) {
                    v7_2 = h0.a.e(h0.a.h(v0_1, p3.a.f), v7_2);
                }
            }
            p7 = h0.a.h(v7_2, v4_8);
        }
        return p7;
    }

    public void draw(android.graphics.Canvas p20)
    {
        String v2_15;
        int v3_4 = this.u;
        v3_4.setColorFilter(this.z);
        int v7 = v3_4.getAlpha();
        String v2_18 = this.b.l;
        v3_4.setAlpha((((v2_18 + (v2_18 >> 7)) * v7) >> 8));
        android.graphics.Paint v8 = this.v;
        v8.setColorFilter(this.A);
        v8.setStrokeWidth(this.b.k);
        int v9 = v8.getAlpha();
        String v2_9 = this.b.l;
        v8.setAlpha((((v2_9 + (v2_9 >> 7)) * v9) >> 8));
        String v2_14 = this.b.r;
        if ((v2_14 != android.graphics.Paint$Style.FILL_AND_STROKE) && (v2_14 != android.graphics.Paint$Style.FILL)) {
            v2_15 = v3_4;
        } else {
            v2_15 = v3_4;
            int v3_5 = this.o;
            if (this.f) {
                this.b(this.h(), v3_5);
                this.f = 0;
            }
            boolean v4_24 = this.b;
            float[] v5_10 = v4_24.o;
            int v6_9 = 1;
            if ((v5_10 != 1) && (v4_24.p > 0)) {
                if (v5_10 != 2) {
                    if (v4_24.a.e(this.h())) {
                        this.f(p20, v2_15, v3_5, this.b.a, this.H, this.h());
                        if (this.k()) {
                            if (this.m) {
                                IllegalStateException v1_6 = this.b.a;
                                int v3_0 = v1_6.f();
                                float[] v5_7 = this.a;
                                v3_0.e = v5_7.a(v1_6.e);
                                v3_0.f = v5_7.a(v1_6.f);
                                v3_0.h = v5_7.a(v1_6.h);
                                v3_0.g = v5_7.a(v1_6.g);
                                this.E = v3_0.a();
                                IllegalStateException v1_10 = this.H;
                                if (v1_10 != null) {
                                    if (this.I == null) {
                                        IllegalStateException v1_12 = new float[v1_10.length];
                                        this.I = v1_12;
                                    }
                                    IllegalStateException v1_13 = this.j();
                                    int v3_2 = 0;
                                    while(true) {
                                        boolean v4_15 = this.H;
                                        if (v3_2 >= v4_15.length) {
                                            break;
                                        }
                                        this.I[v3_2] = Math.max(0, (v4_15[v3_2] - v1_13));
                                        v3_2++;
                                    }
                                } else {
                                    this.I = 0;
                                }
                                float v13_21 = this.E;
                                float v14_10 = this.I;
                                float v15_0 = this.b.j;
                                int v3_3 = this.r;
                                v3_3.set(this.h());
                                v3_3.inset(this.j(), this.j());
                                this.y.a(v13_21, v14_10, v15_0, v3_3, 0, this.p);
                                this.m = 0;
                            }
                            this.g(p20);
                        }
                        v2_15.setAlpha(v7);
                        v8.setAlpha(v9);
                        return;
                    } else {
                        boolean v4_27 = this.H;
                        if (v4_27) {
                            if (v4_27.length > 1) {
                                while (v6_9 < v4_27.length) {
                                    if (v4_27[v6_9] == v4_27[0]) {
                                        v6_9++;
                                    } else {
                                        if ((v3_5.isConvex()) || (android.os.Build$VERSION.SDK_INT >= 29)) {
                                        }
                                        p20.save();
                                        p20.translate(((float) ((int) (((double) this.b.q) * Math.sin(Math.toRadians(((double) 0)))))), ((float) ((int) (Math.cos(Math.toRadians(((double) 0))) * ((double) this.b.q)))));
                                        if (this.C) {
                                            boolean v4_2 = this.B;
                                            float[] v5_4 = ((int) (v4_2.width() - ((float) this.getBounds().width())));
                                            int v6_5 = ((int) (v4_2.height() - ((float) this.getBounds().height())));
                                            if ((v5_4 < null) || (v6_5 < 0)) {
                                                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                                            } else {
                                                boolean v4_6 = android.graphics.Bitmap.createBitmap((((this.b.p * 2) + ((int) v4_2.width())) + v5_4), (((this.b.p * 2) + ((int) v4_2.height())) + v6_5), android.graphics.Bitmap$Config.ARGB_8888);
                                                android.graphics.Canvas v12_1 = new android.graphics.Canvas(v4_6);
                                                float[] v5_5 = ((float) ((this.getBounds().left - this.b.p) - v5_4));
                                                int v6_6 = ((float) ((this.getBounds().top - this.b.p) - v6_5));
                                                v12_1.translate((- v5_5), (- v6_6));
                                                this.e(v12_1);
                                                p20.drawBitmap(v4_6, v5_5, v6_6, 0);
                                                v4_6.recycle();
                                                p20.restore();
                                            }
                                        } else {
                                            this.e(p20);
                                            p20.restore();
                                        }
                                    }
                                }
                            }
                            if (this.b.a.d()) {
                            }
                        }
                    }
                }
            }
        }
    }

    public final void e(android.graphics.Canvas p9)
    {
        if (this.e.cardinality() > 0) {
            android.util.Log.w("k", "Compatibility shadow requested but can\'t be drawn for all operations in this shape.");
        }
        float v1_2 = this.o;
        int v2_0 = this.w;
        if (this.b.q != 0) {
            p9.drawPath(v1_2, v2_0.a);
        }
        android.graphics.Paint v3_0 = 0;
        while (v3_0 < 4) {
            double v6_3 = v3.y.b;
            this.c[v3_0].a(v6_3, v2_0, this.b.p, p9);
            this.d[v3_0].a(v6_3, v2_0, this.b.p, p9);
            v3_0++;
        }
        if (this.C) {
            float v0_4 = ((int) (Math.sin(Math.toRadians(((double) 0))) * ((double) this.b.q)));
            int v2_8 = ((int) (Math.cos(Math.toRadians(((double) 0))) * ((double) this.b.q)));
            p9.translate(((float) (- v0_4)), ((float) (- v2_8)));
            p9.drawPath(v1_2, v3.k.K);
            p9.translate(((float) v0_4), ((float) v2_8));
        }
        return;
    }

    public final void f(android.graphics.Canvas p1, android.graphics.Paint p2, android.graphics.Path p3, v3.p p4, float[] p5, android.graphics.RectF p6)
    {
        float v4_1 = v3.k.c(p6, p4, p5);
        if (v4_1 < 0) {
            p1.drawPath(p3, p2);
            return;
        } else {
            p1.drawRoundRect(p6, (v4_1 * this.b.j), (v4_1 * this.b.j), p2);
            return;
        }
    }

    public void g(android.graphics.Canvas p8)
    {
        v3.p v4 = this.E;
        float[] v5 = this.I;
        android.graphics.RectF v6 = this.r;
        v6.set(this.h());
        v6.inset(this.j(), this.j());
        this.f(p8, this.v, this.p, v4, v5, v6);
        return;
    }

    public int getAlpha()
    {
        return this.b.l;
    }

    public final android.graphics.drawable.Drawable$ConstantState getConstantState()
    {
        return this.b;
    }

    public int getOpacity()
    {
        return -3;
    }

    public void getOutline(android.graphics.Outline p4)
    {
        if (this.b.o != 2) {
            boolean v0_6 = this.h();
            if (!v0_6.isEmpty()) {
                int v1_1 = v3.k.c(v0_6, this.b.a, this.H);
                if (v1_1 < 0) {
                    android.graphics.Path v2_3 = this.o;
                    if (this.f) {
                        this.b(v0_6, v2_3);
                        this.f = 0;
                    }
                    boolean v0_3 = android.os.Build$VERSION.SDK_INT;
                    if (v0_3 < 30) {
                        if (v0_3 < 29) {
                            if (v2_3.isConvex()) {
                                o3.a.a(p4, v2_3);
                            }
                        } else {
                            try {
                                o3.a.a(p4, v2_3);
                            } catch (IllegalArgumentException) {
                            }
                            return;
                        }
                    } else {
                        o3.b.a(p4, v2_3);
                        return;
                    }
                } else {
                    p4.setRoundRect(this.getBounds(), (v1_1 * this.b.j));
                    return;
                }
            }
        }
        return;
    }

    public final boolean getPadding(android.graphics.Rect p2)
    {
        android.graphics.Rect v0_1 = this.b.h;
        if (v0_1 == null) {
            return super.getPadding(p2);
        } else {
            p2.set(v0_1);
            return 1;
        }
    }

    public final android.graphics.Region getTransparentRegion()
    {
        android.graphics.Region v1 = this.s;
        v1.set(this.getBounds());
        android.graphics.Region$Op v2_1 = this.o;
        this.b(this.h(), v2_1);
        android.graphics.Region v0_2 = this.t;
        v0_2.setPath(v2_1, v1);
        v1.op(v0_2, android.graphics.Region$Op.DIFFERENCE);
        return v1;
    }

    public final android.graphics.RectF h()
    {
        android.graphics.RectF v1 = this.q;
        v1.set(this.getBounds());
        return v1;
    }

    public final float i()
    {
        float v0_0 = this.H;
        if (v0_0 == 0) {
            float v0_2 = this.h();
            v3.d v2_15 = this.b.a;
            v3.r v3_5 = this.y;
            v3_5.getClass();
            v3.d v2_0 = v2_15.e.a(v0_2);
            float v4_1 = this.b.a;
            v3_5.getClass();
            float v4_4 = (v4_1.h.a(v0_2) + v2_0);
            v3.d v2_2 = this.b.a;
            v3_5.getClass();
            float v4_5 = (v4_4 - v2_2.g.a(v0_2));
            v3.d v2_6 = this.b.a;
            v3_5.getClass();
            return ((v4_5 - v2_6.f.a(v0_2)) / 1073741824);
        } else {
            return ((((v0_0[3] + v0_0[2]) - v0_0[1]) - v0_0[0]) / 1073741824);
        }
    }

    public final void invalidateSelf()
    {
        this.f = 1;
        this.m = 1;
        super.invalidateSelf();
        return;
    }

    public boolean isStateful()
    {
        if (!super.isStateful()) {
            int v0_13 = this.b.f;
            if ((v0_13 == 0) || (!v0_13.isStateful())) {
                this.b.getClass();
                int v0_2 = this.b.e;
                if ((v0_2 == 0) || (!v0_2.isStateful())) {
                    int v0_5 = this.b.d;
                    if ((v0_5 == 0) || (!v0_5.isStateful())) {
                        int v0_8 = this.b.b;
                        if ((v0_8 == 0) || (!v0_8.d())) {
                            return 0;
                        }
                    }
                }
            }
        }
        return 1;
    }

    public final float j()
    {
        if (!this.k()) {
            return 0;
        } else {
            return (this.v.getStrokeWidth() / 1073741824);
        }
    }

    public final boolean k()
    {
        int v0_1 = this.b.r;
        if (((v0_1 != android.graphics.Paint$Style.FILL_AND_STROKE) && (v0_1 != android.graphics.Paint$Style.STROKE)) || (this.v.getStrokeWidth() <= 0)) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void l(android.content.Context p3)
    {
        this.b.c = new p3.a(p3);
        this.v();
        return;
    }

    public final void m(f1.h p9)
    {
        if (this.F != p9) {
            this.F = p9;
            int v1 = 0;
            while(true) {
                f1.g v2_1 = this.G;
                if (v1 >= v2_1.length) {
                    break;
                }
                if (v2_1[v1] == null) {
                    v2_1[v1] = new f1.g(this, v3.k.L[v1]);
                }
                f1.g v2_0 = v2_1[v1];
                f1.h v3_4 = new f1.h();
                double v4_3 = ((float) p9.b);
                if (v4_3 < 0) {
                    throw new IllegalArgumentException("Damping ratio must be non-negative");
                } else {
                    v3_4.b = ((double) v4_3);
                    v3_4.c = 0;
                    double v4_4 = ((float) (p9.a * p9.a));
                    if (v4_4 <= 0) {
                        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
                    } else {
                        v3_4.a = Math.sqrt(((double) v4_4));
                        v3_4.c = 0;
                        v2_0.j = v3_4;
                        v1++;
                    }
                }
            }
            this.t(this.getState(), 1);
            this.invalidateSelf();
        }
        return;
    }

    public android.graphics.drawable.Drawable mutate()
    {
        this.b = new v3.i(this.b);
        return this;
    }

    public final void n(float p3)
    {
        v3.i v0 = this.b;
        if (v0.n != p3) {
            v0.n = p3;
            this.v();
        }
        return;
    }

    public final void o(android.content.res.ColorStateList p3)
    {
        v3.i v0 = this.b;
        if (v0.d != p3) {
            v0.d = p3;
            this.onStateChange(this.getState());
        }
        return;
    }

    public void onBoundsChange(android.graphics.Rect p3)
    {
        this.f = 1;
        this.m = 1;
        super.onBoundsChange(p3);
        if ((this.b.b != null) && (!p3.isEmpty())) {
            this.t(this.getState(), this.D);
        }
        this.D = p3.isEmpty();
        return;
    }

    public boolean onStateChange(int[] p3)
    {
        int v1 = 0;
        if (this.b.b != null) {
            this.t(p3, 0);
        }
        boolean v3_1 = this.s(p3);
        boolean v0_2 = this.u();
        if ((v3_1) || (v0_2)) {
            v1 = 1;
        }
        if (v1 != 0) {
            this.invalidateSelf();
        }
        return v1;
    }

    public final void p()
    {
        v3.i v0 = this.b;
        if (v0.o != 2) {
            v0.o = 2;
            super.invalidateSelf();
        }
        return;
    }

    public final void q(v3.d0 p3)
    {
        int v0_0 = this.b;
        if (v0_0.b != p3) {
            v0_0.b = p3;
            this.t(this.getState(), 1);
            this.invalidateSelf();
        }
        return;
    }

    public final void r(android.content.res.ColorStateList p3)
    {
        v3.i v0 = this.b;
        if (v0.e != p3) {
            v0.e = p3;
            this.onStateChange(this.getState());
        }
        return;
    }

    public final boolean s(int[] p6)
    {
        int v0_2;
        if (this.b.d == null) {
            v0_2 = 0;
        } else {
            int v0_3 = this.u;
            android.graphics.Paint v2_3 = v0_3.getColor();
            int v3_0 = this.b.d.getColorForState(p6, v2_3);
            if (v2_3 == v3_0) {
            } else {
                v0_3.setColor(v3_0);
                v0_2 = 1;
            }
        }
        if (this.b.e != null) {
            android.graphics.Paint v2_2 = this.v;
            int v3_1 = v2_2.getColor();
            int v6_1 = this.b.e.getColorForState(p6, v3_1);
            if (v3_1 != v6_1) {
                v2_2.setColor(v6_1);
                return 1;
            }
        }
        return v0_2;
    }

    public void setAlpha(int p3)
    {
        v3.i v0 = this.b;
        if (v0.l != p3) {
            v0.l = p3;
            super.invalidateSelf();
        }
        return;
    }

    public void setColorFilter(android.graphics.ColorFilter p1)
    {
        this.b.getClass();
        super.invalidateSelf();
        return;
    }

    public final void setShapeAppearanceModel(v3.p p2)
    {
        v3.i v0 = this.b;
        v0.a = p2;
        v0.b = 0;
        this.H = 0;
        this.I = 0;
        this.invalidateSelf();
        return;
    }

    public final void setTint(int p1)
    {
        this.setTintList(android.content.res.ColorStateList.valueOf(p1));
        return;
    }

    public void setTintList(android.content.res.ColorStateList p2)
    {
        this.b.f = p2;
        this.u();
        super.invalidateSelf();
        return;
    }

    public void setTintMode(android.graphics.PorterDuff$Mode p3)
    {
        v3.i v0 = this.b;
        if (v0.g != p3) {
            v0.g = p3;
            this.u();
            super.invalidateSelf();
        }
        return;
    }

    public final void t(int[] p17, boolean p18)
    {
        android.graphics.RectF v2 = this.h();
        if ((this.b.b != null) && (!v2.isEmpty())) {
            int v3_1;
            if (this.F != null) {
                v3_1 = 0;
            } else {
                v3_1 = 1;
            }
            int v3_2 = (p18 | v3_1);
            if (this.H == null) {
                f1.g v6_2 = new float[4];
                this.H = v6_2;
            }
            f1.g v6_4 = this.b.b;
            f1.g[] v8_0 = v6_4.d;
            f1.g v9_0 = v6_4.a;
            int[][] v10 = v6_4.c;
            v3.b0 v11 = v6_4.h;
            v3.b0 v12 = v6_4.g;
            v3.b0 v13 = v6_4.f;
            f1.g v6_5 = v6_4.e;
            int v14_0 = 0;
            while (v14_0 < v9_0) {
                if (!android.util.StateSet.stateSetMatches(v10[v14_0], p17)) {
                    v14_0++;
                }
                if (v14_0 < 0) {
                    int v14_1 = 0;
                    while (v14_1 < v9_0) {
                        if (!android.util.StateSet.stateSetMatches(v10[v14_1], android.util.StateSet.WILD_CARD)) {
                            v14_1++;
                        } else {
                            int v15_0 = v14_1;
                        }
                        v14_0 = v15_0;
                    }
                    v15_0 = -1;
                }
                if ((v6_5 != null) || ((v13 != null) || ((v12 != null) || (v11 != null)))) {
                    int v4_5 = v8_0[v14_0].f();
                    if (v6_5 != null) {
                        v4_5.e = v6_5.c(p17);
                    }
                    if (v13 != null) {
                        v4_5.f = v13.c(p17);
                    }
                    if (v12 != null) {
                        v4_5.h = v12.c(p17);
                    }
                    if (v11 != null) {
                        v4_5.g = v11.c(p17);
                    }
                    v3.p v1_2 = v4_5.a();
                } else {
                    v1_2 = v8_0[v14_0];
                }
                int v4_0 = 0;
                while (v4_0 < 4) {
                    f1.g v6_10;
                    this.y.getClass();
                    if (v4_0 == 1) {
                        v6_10 = v1_2.g;
                    } else {
                        if (v4_0 == 2) {
                            v6_10 = v1_2.h;
                        } else {
                            if (v4_0 == 3) {
                                v6_10 = v1_2.e;
                            } else {
                                v6_10 = v1_2.f;
                            }
                        }
                    }
                    f1.g v6_13 = v6_10.a(v2);
                    if (v3_2 != 0) {
                        this.H[v4_0] = v6_13;
                    }
                    f1.g[] v8_2 = this.G;
                    f1.g v9_1 = v8_2[v4_0];
                    if (v9_1 != null) {
                        v9_1.a(v6_13);
                        if (v3_2 != 0) {
                            v8_2[v4_0].d();
                        }
                    }
                    v4_0++;
                }
                if (v3_2 != 0) {
                    this.invalidateSelf();
                }
            }
            v14_0 = -1;
        }
        return;
    }

    public final boolean u()
    {
        int v5_1;
        int v0_0 = this.z;
        android.graphics.PorterDuffColorFilter v1 = this.A;
        android.graphics.PorterDuffColorFilter v2_2 = this.b;
        int v3_3 = v2_2.f;
        android.graphics.PorterDuffColorFilter v2_8 = v2_2.g;
        if ((v3_3 != 0) && (v2_8 != null)) {
            v5_1 = new android.graphics.PorterDuffColorFilter(this.d(v3_3.getColorForState(this.getState(), 0)), v2_8);
        } else {
            android.graphics.PorterDuffColorFilter v2_1 = this.u.getColor();
            int v3_2 = this.d(v2_1);
            if (v3_2 == v2_1) {
                v5_1 = 0;
            } else {
                v5_1 = new android.graphics.PorterDuffColorFilter(v3_2, android.graphics.PorterDuff$Mode.SRC_IN);
            }
        }
        this.z = v5_1;
        this.b.getClass();
        this.A = 0;
        this.b.getClass();
        if ((java.util.Objects.equals(v0_0, this.z)) && (java.util.Objects.equals(v1, this.A))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void v()
    {
        v3.i v0_0 = this.b;
        int v1_5 = (v0_0.n + 0);
        v0_0.p = ((int) Math.ceil(((double) (1061158912 * v1_5))));
        this.b.q = ((int) Math.ceil(((double) (v1_5 * 1048576000))));
        this.u();
        super.invalidateSelf();
        return;
    }
}
