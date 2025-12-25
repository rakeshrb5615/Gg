package s3;
public final class d {
    public final android.content.res.ColorStateList a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;
    public final float h;
    public final boolean i;
    public final float j;
    public android.content.res.ColorStateList k;
    public float l;
    public final int m;
    public boolean n;
    public boolean o;
    public android.graphics.Typeface p;

    public d(android.content.Context p8, int p9)
    {
        this.n = 0;
        this.o = 0;
        int[] v1_2 = p8.obtainStyledAttributes(p9, g.a.w);
        this.l = v1_2.getDimension(0, 0);
        int v3_0 = 3;
        this.k = j5.t1.v(p8, v1_2, 3);
        j5.t1.v(p8, v1_2, 4);
        j5.t1.v(p8, v1_2, 5);
        this.d = v1_2.getInt(2, 0);
        this.e = v1_2.getInt(1, 1);
        float v5_1 = 12;
        if (!v1_2.hasValue(12)) {
            v5_1 = 10;
        }
        this.m = v1_2.getResourceId(v5_1, 0);
        this.b = v1_2.getString(v5_1);
        v1_2.getBoolean(14, 0);
        this.a = j5.t1.v(p8, v1_2, 6);
        this.f = v1_2.getFloat(7, 0);
        this.g = v1_2.getFloat(8, 0);
        this.h = v1_2.getFloat(9, 0);
        v1_2.recycle();
        android.content.res.TypedArray v8_1 = p8.obtainStyledAttributes(p9, c3.a.u);
        this.i = v8_1.hasValue(0);
        this.j = v8_1.getFloat(0, 0);
        if (!v8_1.hasValue(3)) {
            v3_0 = 1;
        }
        this.c = v8_1.getString(v3_0);
        v8_1.recycle();
        return;
    }

    public final void a()
    {
        int v1 = this.d;
        if (this.p == null) {
            android.graphics.Typeface v0_10 = this.b;
            if (v0_10 != null) {
                this.p = android.graphics.Typeface.create(v0_10, v1);
            }
        }
        if (this.p == null) {
            int v2 = this.e;
            if (v2 == 1) {
                this.p = android.graphics.Typeface.SANS_SERIF;
            } else {
                if (v2 == 2) {
                    this.p = android.graphics.Typeface.SERIF;
                } else {
                    if (v2 == 3) {
                        this.p = android.graphics.Typeface.MONOSPACE;
                    } else {
                        this.p = android.graphics.Typeface.DEFAULT;
                    }
                }
            }
            this.p = android.graphics.Typeface.create(this.p, v1);
        }
        return;
    }

    public final void b(android.content.Context p10, q4.b p11)
    {
        if (!this.c(p10)) {
            this.a();
        }
        int v3 = this.m;
        if (v3 == 0) {
            this.n = 1;
        }
        if (!this.n) {
            try {
                s3.b v6_1 = new s3.b(this, p11);
            } catch (android.content.res.Resources$NotFoundException) {
                this.n = 1;
                p11.I(1);
                return;
            } catch (String v0_2) {
                int v10_2 = v0_2;
                String v0_4 = new StringBuilder("Error loading font ");
                v0_4.append(this.b);
                android.util.Log.d("TextAppearance", v0_4.toString(), v10_2);
                this.n = 1;
                p11.I(-3);
                return;
            }
            if (!p10.isRestricted()) {
                g0.m.a(p10, v3, new android.util.TypedValue(), 0, v6_1, 0, 0);
                return;
            } else {
                v6_1.a(-4);
                return;
            }
        } else {
            p11.J(this.p, 1);
            return;
        }
    }

    public final boolean c(android.content.Context p11)
    {
        if (!this.n) {
            int[] v3_3 = this.m;
            if (v3_3 != null) {
                android.content.res.TypedArray v11_1;
                String v2_0;
                android.graphics.Typeface v9 = 0;
                if (!p11.isRestricted()) {
                    v2_0 = p11;
                    v11_1 = g0.m.a(p11, v3_3, new android.util.TypedValue(), 0, 0, 0, 1);
                } else {
                    v2_0 = p11;
                    v11_1 = 0;
                }
                if (v11_1 == null) {
                    if (!this.o) {
                        String v2_5;
                        this.o = 1;
                        android.content.res.TypedArray v11_3 = v2_0.getResources();
                        String v2_1 = this.m;
                        try {
                            if ((v2_1 != null) && (v11_3.getResourceTypeName(v2_1).equals("font"))) {
                                String v2_2 = v11_3.getXml(v2_1);
                                while (v2_2.getEventType() != 1) {
                                    if ((v2_2.getEventType() != 2) || (!v2_2.getName().equals("font-family"))) {
                                        v2_2.next();
                                    } else {
                                        android.content.res.TypedArray v11_4 = v11_3.obtainAttributes(android.util.Xml.asAttributeSet(v2_2), c0.a.b);
                                        v2_5 = v11_4.getString(7);
                                        v11_4.recycle();
                                    }
                                }
                                v2_5 = 0;
                            }
                        } catch (Throwable) {
                        }
                        if (v2_5 != null) {
                            android.content.res.TypedArray v11_5 = android.graphics.Typeface.create(v2_5, 0);
                            if (v11_5 != android.graphics.Typeface.DEFAULT) {
                                v9 = android.graphics.Typeface.create(v11_5, this.d);
                            }
                        }
                    }
                    if (v9 != null) {
                        this.p = v9;
                        this.n = 1;
                        return 1;
                    }
                } else {
                    this.p = v11_1;
                    this.n = 1;
                    return 1;
                }
            }
            return 0;
        } else {
            return 1;
        }
    }

    public final void d(android.content.Context p3, android.text.TextPaint p4, q4.b p5)
    {
        int v3_4;
        this.e(p3, p4, p5);
        int v3_1 = this.k;
        if (v3_1 == 0) {
            v3_4 = -16777216;
        } else {
            v3_4 = v3_1.getColorForState(p4.drawableState, v3_1.getDefaultColor());
        }
        int v3_3;
        p4.setColor(v3_4);
        int v3_2 = this.a;
        if (v3_2 == 0) {
            v3_3 = 0;
        } else {
            v3_3 = v3_2.getColorForState(p4.drawableState, v3_2.getDefaultColor());
        }
        p4.setShadowLayer(this.h, this.f, this.g, v3_3);
        return;
    }

    public final void e(android.content.Context p2, android.text.TextPaint p3, q4.b p4)
    {
        if ((this.c(p2)) && (this.n)) {
            android.graphics.Typeface v0_4 = this.p;
            if (v0_4 != null) {
                this.f(p2, p3, v0_4);
                return;
            }
        }
        this.a();
        this.f(p2, p3, this.p);
        this.b(p2, new s3.c(this, p2, p3, p4));
        return;
    }

    public final void f(android.content.Context p1, android.text.TextPaint p2, android.graphics.Typeface p3)
    {
        float v1_12 = k0.a.b(p1.getResources().getConfiguration(), p3);
        if (v1_12 != 0) {
            p3 = v1_12;
        }
        int v3_3;
        p2.setTypeface(p3);
        float v1_4 = ((~ p3.getStyle()) & this.d);
        if ((v1_4 & 1) == 0) {
            v3_3 = 0;
        } else {
            v3_3 = 1;
        }
        float v1_6;
        p2.setFakeBoldText(v3_3);
        if ((v1_4 & 2) == 0) {
            v1_6 = 0;
        } else {
            v1_6 = -1098907648;
        }
        p2.setTextSkewX(v1_6);
        p2.setTextSize(this.l);
        p2.setFontVariationSettings(this.c);
        if (this.i) {
            p2.setLetterSpacing(this.j);
        }
        return;
    }
}
