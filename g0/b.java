package g0;
public abstract class b {
    public static final float[][] a;
    public static final float[][] b;
    public static final float[] c;
    public static final float[][] d;
    public static final Object e;
    public static reflect.Method f;
    public static boolean g;

    static synthetic b()
    {
        float[] v1_0 = new float[3];
        v1_0 = {1053652383, 1059484093, -1118648123};
        float[] v2_2 = new float[3];
        v2_2 = {-1098898655, 1067067965, 1027330407};
        float[] v3_1 = new float[3];
        v3_1 = {-1157087275, 1028162020, 1064566818};
        g0.b.a = new float[][] {v1_0, v2_2, v3_1});
        float[] v1_1 = new float[3];
        v1_1 = {1072584765, -1082036021, 1041810539};
        float[] v2_0 = new float[3];
        v2_0 = {1053190625, 1059002158, -1139603558};
        float[] v3_0 = new float[3];
        v3_0 = {-1132345847, -1123302273, 1065772348};
        g0.b.b = new float[][] {v1_1, v2_0, v3_0});
        float[] v1_3 = new float[3];
        v1_3 = {1119754256, 1120403456, 1121567769};
        g0.b.c = v1_3;
        float[] v1_4 = new float[3];
        v1_4 = {1054023191, 1052187149, 1043912633};
        float[] v2_1 = new float[3];
        v2_1 = {1046066128, 1060575065, 1033100696};
        Object v0_1 = new float[3];
        v0_1 = {1017006063, 1039404073, 1064520140};
        g0.b.d = new float[][] {v1_4, v2_1, v0_1});
        g0.b.e = new Object();
        return;
    }

    public static int b(android.content.Context p2, int p3, int p4)
    {
        android.util.TypedValue v0_1 = new android.util.TypedValue();
        p2.getTheme().resolveAttribute(p3, v0_1, 1);
        if (v0_1.resourceId == 0) {
            return p4;
        } else {
            return p3;
        }
    }

    public static g0.d c(android.content.res.TypedArray p3, org.xmlpull.v1.XmlPullParser p4, android.content.res.Resources$Theme p5, String p6, int p7)
    {
        if (p4.getAttributeValue("http://schemas.android.com/apk/res/android", p6) != null) {
            String v4_7 = new android.util.TypedValue();
            p3.getValue(p7, v4_7);
            int v1 = v4_7.type;
            if ((v1 < 28) || (v1 > 31)) {
                try {
                    int v3_2 = g0.d.c(p3.getResources(), p3.getResourceId(p7, 0), p5);
                } catch (int v3_3) {
                    android.util.Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", v3_3);
                    v3_2 = 0;
                }
                if (v3_2 != 0) {
                    return v3_2;
                }
            } else {
                return new g0.d(0, 0, v4_7.data);
            }
        }
        return new g0.d(0, 0, 0);
    }

    public static boolean d(org.xmlpull.v1.XmlPullParser p1, String p2)
    {
        if (p1.getAttributeValue("http://schemas.android.com/apk/res/android", p2) == null) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int e(float p15)
    {
        if (p15 >= 1065353216) {
            if (p15 <= 1120272384) {
                int v15_1;
                float v1_5 = ((p15 + 1098907648) / 1122500608);
                if (p15 <= 1090519040) {
                    v15_1 = (p15 / 1147261687);
                } else {
                    v15_1 = ((v1_5 * v1_5) * v1_5);
                }
                int v5_2;
                float v3_3 = ((v1_5 * v1_5) * v1_5);
                if (v3_3 <= 1007753895) {
                    v5_2 = 0;
                } else {
                    v5_2 = 1;
                }
                float v8_2;
                if (v5_2 == 0) {
                    v8_2 = (((v1_5 * 1122500608) - 1098907648) / 1147261687);
                } else {
                    v8_2 = v3_3;
                }
                if (v5_2 == 0) {
                    v3_3 = (((v1_5 * 1122500608) - 1098907648) / 1147261687);
                }
                float[] v0_3 = g0.b.c;
                return h0.a.c(((double) (v8_2 * v0_3[0])), ((double) (v15_1 * v0_3[1])), ((double) (v3_3 * v0_3[2])));
            } else {
                return -1;
            }
        } else {
            return -16777216;
        }
    }

    public static float f(int p6)
    {
        float v6_3;
        float v6_5 = (((float) p6) / 1132396544);
        if (v6_5 > 1025879782) {
            v6_3 = ((float) Math.pow(((double) ((v6_5 + 1029785518) / 1065814589)), 4612586738567610368));
        } else {
            v6_3 = (v6_5 / 1095678034);
        }
        return (v6_3 * 1120403456);
    }

    public static android.content.res.TypedArray g(android.content.res.Resources p0, android.content.res.Resources$Theme p1, android.util.AttributeSet p2, int[] p3)
    {
        if (p1 != null) {
            return p1.obtainStyledAttributes(p2, p3, 0, 0);
        } else {
            return p0.obtainAttributes(p2, p3);
        }
    }

    public static g0.e j(android.content.res.XmlResourceParser p24, android.content.res.Resources p25)
    {
        do {
            n0.d v1_6 = p24.next();
        } while((v1_6 == 2) || (v1_6 == 1));
        if (v1_6 != 2) {
            throw new org.xmlpull.v1.XmlPullParserException("No start tag found");
        } else {
            p24.require(2, 0, "font-family");
            if (!p24.getName().equals("font-family")) {
                g0.b.l(p24);
                return 0;
            } else {
                java.util.ArrayList v4_3 = p25.obtainAttributes(android.util.Xml.asAttributeSet(p24), c0.a.b);
                g0.g v7_2 = v4_3.getString(0);
                int v9_5 = v4_3.getString(5);
                n0.d v11_3 = v4_3.getString(6);
                String v12 = v4_3.getString(2);
                int v13 = v4_3.getResourceId(1, 0);
                int v18_0 = v4_3.getInteger(3, 1);
                int v19_1 = v4_3.getInteger(4, 500);
                int v20_1 = v4_3.getString(7);
                v4_3.recycle();
                if ((v7_2 == null) || ((v9_5 == 0) || (v11_3 == null))) {
                    java.util.ArrayList v4_5 = new java.util.ArrayList();
                    while (p24.next() != 3) {
                        if (p24.getEventType() == 2) {
                            if (!p24.getName().equals("font")) {
                                g0.b.l(p24);
                            } else {
                                g0.g v7_8 = p25.obtainAttributes(android.util.Xml.asAttributeSet(p24), c0.a.c);
                                int v9_8 = 8;
                                if (!v7_8.hasValue(8)) {
                                    v9_8 = 1;
                                }
                                int v9_0;
                                int v18_1 = v7_8.getInt(v9_8, 400);
                                if (!v7_8.hasValue(6)) {
                                    v9_0 = 2;
                                } else {
                                    v9_0 = 6;
                                }
                                int v23;
                                if (1 != v7_8.getInt(v9_0, 0)) {
                                    v23 = 0;
                                } else {
                                    v23 = 1;
                                }
                                int v9_2 = 9;
                                if (!v7_8.hasValue(9)) {
                                    v9_2 = 3;
                                }
                                n0.d v11_2;
                                if (!v7_8.hasValue(7)) {
                                    v11_2 = 4;
                                } else {
                                    v11_2 = 7;
                                }
                                int v9_4;
                                String v22 = v7_8.getString(v11_2);
                                int v19_0 = v7_8.getInt(v9_2, 0);
                                if (!v7_8.hasValue(5)) {
                                    v9_4 = 0;
                                } else {
                                    v9_4 = 5;
                                }
                                int v20_0 = v7_8.getResourceId(v9_4, 0);
                                String v21 = v7_8.getString(v9_4);
                                v7_8.recycle();
                                while (p24.next() != 3) {
                                    g0.b.l(p24);
                                }
                                v4_5.add(new g0.g(v18_1, v19_0, v20_0, v21, v22, v23));
                            }
                        }
                    }
                    if (!v4_5.isEmpty()) {
                        n0.d v1_8 = new g0.g[0];
                        return new g0.f(((g0.g[]) v4_5.toArray(v1_8)));
                    } else {
                        return 0;
                    }
                }
                while (p24.next() != 3) {
                    g0.b.l(p24);
                }
                g0.g v17_2;
                g0.f v0_2 = g0.b.k(p25, v13);
                if (v12 == null) {
                    v17_2 = 0;
                } else {
                    v17_2 = new n0.d(v7_2, v9_5, v12, v0_2);
                }
                return new g0.h(new n0.d(v7_2, v9_5, v11_3, v0_2), v17_2, v18_0, v19_1, v20_1);
            }
        }
    }

    public static java.util.List k(android.content.res.Resources p8, int p9)
    {
        if (p9 != 0) {
            android.content.res.TypedArray v0 = p8.obtainTypedArray(p9);
            try {
                if (v0.length() != 0) {
                    java.util.ArrayList v1_2 = new java.util.ArrayList();
                    if (v0.getType(0) != 1) {
                        String[] v8_1 = p8.getStringArray(p9);
                        int v9_2 = new java.util.ArrayList();
                        String[] v3_1 = v8_1.length;
                        java.util.ArrayList v4_1 = 0;
                        while (v4_1 < v3_1) {
                            v9_2.add(android.util.Base64.decode(v8_1[v4_1], 0));
                            v4_1++;
                        }
                        v1_2.add(v9_2);
                    } else {
                        int v9_3 = 0;
                        while (v9_3 < v0.length()) {
                            String[] v3_3 = v0.getResourceId(v9_3, 0);
                            if (v3_3 != null) {
                                String[] v3_4 = p8.getStringArray(v3_3);
                                java.util.ArrayList v4_3 = new java.util.ArrayList();
                                int v5_2 = v3_4.length;
                                int v6 = 0;
                                while (v6 < v5_2) {
                                    v4_3.add(android.util.Base64.decode(v3_4[v6], 0));
                                    v6++;
                                }
                                v1_2.add(v4_3);
                            }
                            v9_3++;
                        }
                    }
                    v0.recycle();
                    return v1_2;
                } else {
                    v0.recycle();
                    return java.util.Collections.EMPTY_LIST;
                }
            } catch (String[] v8_2) {
                v0.recycle();
                throw v8_2;
            }
        } else {
            return java.util.Collections.EMPTY_LIST;
        }
    }

    public static void l(org.xmlpull.v1.XmlPullParser p3)
    {
        int v0 = 1;
        while (v0 > 0) {
            int v1 = p3.next();
            if (v1 == 2) {
                v0++;
            } else {
                if (v1 == 3) {
                    v0--;
                }
            }
        }
        return;
    }

    public static float m()
    {
        return (((float) Math.pow(((((double) 1112014848) + 4625196817309499392) / 4637863191261478912), 4613937818241073152)) * 1120403456);
    }

    public void a(int p4)
    {
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new g0.k(this, p4, 0));
        return;
    }

    public abstract void h();

    public abstract void i();
}
