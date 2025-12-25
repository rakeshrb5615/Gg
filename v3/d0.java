package v3;
public final class d0 {
    public final int a;
    public final v3.p b;
    public final int[][] c;
    public final v3.p[] d;
    public final v3.b0 e;
    public final v3.b0 f;
    public final v3.b0 g;
    public final v3.b0 h;

    public d0(v3.c0 p2)
    {
        this.a = p2.a;
        this.b = p2.b;
        this.c = p2.c;
        this.d = p2.d;
        this.e = p2.e;
        this.f = p2.f;
        this.g = p2.g;
        this.h = p2.h;
        return;
    }

    public static void a(v3.c0 p11, android.content.Context p12, android.content.res.XmlResourceParser p13, android.util.AttributeSet p14, android.content.res.Resources$Theme p15)
    {
        int v0_1 = (p13.getDepth() + 1);
        while(true) {
            int[] v2_5 = p13.next();
            if (v2_5 == 1) {
                break;
            }
            v3.p v3_5 = p13.getDepth();
            if ((v3_5 < v0_1) && (v2_5 == 3)) {
                break;
            }
            if ((v2_5 == 2) && ((v3_5 <= v0_1) && (p13.getName().equals("item")))) {
                int[] v2_3;
                int[] v2_2 = p12.getResources();
                v3.p v3_1 = c3.a.r;
                if (p15 != null) {
                    v2_3 = p15.obtainStyledAttributes(p14, v3_1, 0, 0);
                } else {
                    v2_3 = v2_2.obtainAttributes(p14, v3_1);
                }
                v3.p v3_4 = v3.p.a(p12, v2_3.getResourceId(0, 0), v2_3.getResourceId(1, 0), new v3.a(((float) 0))).a();
                v2_3.recycle();
                int[] v2_4 = p14.getAttributeCount();
                int[] v5_1 = new int[v2_4];
                int v6_2 = 0;
                int v7_1 = 0;
                while (v6_2 < v2_4) {
                    int v8 = p14.getAttributeNameResource(v6_2);
                    if ((v8 != 2130969707) && (v8 != 2130969718)) {
                        int v9_2 = (v7_1 + 1);
                        if (!p14.getAttributeBooleanValue(v6_2, 0)) {
                            v8 = (- v8);
                        }
                        v5_1[v7_1] = v8;
                        v7_1 = v9_2;
                    }
                    v6_2++;
                }
                p11.a(android.util.StateSet.trimStateSet(v5_1, v7_1), v3_4);
            }
        }
        return;
    }

    public static v3.d0 b(android.content.Context p5, android.content.res.TypedArray p6, int p7)
    {
        Throwable v6_2 = p6.getResourceId(p7, 0);
        v3.d0 v7_1 = 0;
        if ((v6_2 != null) && (java.util.Objects.equals(p5.getResources().getResourceTypeName(v6_2), "xml"))) {
            v3.c0 v0_3 = new v3.c0();
            v0_3.b();
            try {
                Throwable v6_1 = p5.getResources().getXml(v6_2);
                try {
                    String v1_1 = android.util.Xml.asAttributeSet(v6_1);
                } catch (org.xmlpull.v1.XmlPullParserException v5_3) {
                    if (v6_1 != null) {
                        try {
                            v6_1.close();
                        } catch (Throwable v6_3) {
                            v5_3.addSuppressed(v6_3);
                        }
                    }
                    throw v5_3;
                }
                while(true) {
                    android.content.res.Resources$Theme v2_0 = v6_1.next();
                    if ((v2_0 == 2) || (v2_0 == 1)) {
                        break;
                    }
                }
                if (v2_0 != 2) {
                    throw new org.xmlpull.v1.XmlPullParserException("No start tag found");
                } else {
                    if (v6_1.getName().equals("selector")) {
                        v3.d0.a(v0_3, p5, v6_1, v1_1, p5.getTheme());
                    }
                    v6_1.close();
                    if (v0_3.a != 0) {
                        v7_1 = new v3.d0(v0_3);
                    }
                    return v7_1;
                }
            } catch (android.content.res.Resources$NotFoundException) {
                v0_3.b();
            }
        } else {
            return 0;
        }
    }

    public final v3.p c()
    {
        v3.p v0_0 = this.b;
        v3.d v1_0 = this.h;
        v3.d v2_1 = this.g;
        v3.d v3_1 = this.f;
        v3.d v4_1 = this.e;
        if ((v4_1 != null) || ((v3_1 != null) || ((v2_1 != null) || (v1_0 != null)))) {
            v3.p v0_1 = v0_0.f();
            if (v4_1 != null) {
                v0_1.e = v4_1.b;
            }
            if (v3_1 != null) {
                v0_1.f = v3_1.b;
            }
            if (v2_1 != null) {
                v0_1.h = v2_1.b;
            }
            if (v1_0 != null) {
                v0_1.g = v1_0.b;
            }
            return v0_1.a();
        } else {
            return v0_0;
        }
    }

    public final boolean d()
    {
        if (this.a <= 1) {
            int v0_6 = this.e;
            if ((v0_6 == 0) || (v0_6.a <= 1)) {
                int v0_8 = this.f;
                if ((v0_8 == 0) || (v0_8.a <= 1)) {
                    int v0_1 = this.g;
                    if ((v0_1 == 0) || (v0_1.a <= 1)) {
                        int v0_3 = this.h;
                        if ((v0_3 == 0) || (v0_3.a <= 1)) {
                            return 0;
                        }
                    }
                }
            }
        }
        return 1;
    }
}
