package z;
public final class b {
    public boolean a;
    public int b;
    public int c;
    public float d;
    public String e;
    public boolean f;
    public int g;

    public b(z.b p2, Object p3)
    {
        this.a = 0;
        p2.getClass();
        this.b = p2.b;
        this.b(p3);
        return;
    }

    public static void a(android.content.Context p16, android.content.res.XmlResourceParser p17, java.util.HashMap p18)
    {
        android.content.res.TypedArray v0_1 = p16.obtainStyledAttributes(android.util.Xml.asAttributeSet(p17), z.r.d);
        z.b v1_3 = v0_1.getIndexCount();
        String v4_0 = 0;
        int v6 = 0;
        int v7_0 = 0;
        int v8 = 0;
        Integer v5_0 = 0;
        while (v6 < v1_3) {
            StringBuilder v9_3 = v0_1.getIndex(v6);
            int v10_0 = 1;
            if (v9_3 != null) {
                if (v9_3 != 10) {
                    if (v9_3 != 1) {
                        int v12 = 3;
                        if (v9_3 != 3) {
                            v12 = 4;
                            if (v9_3 != 2) {
                                if (v9_3 != 7) {
                                    if (v9_3 != 4) {
                                        v12 = 5;
                                        if (v9_3 != 5) {
                                            if (v9_3 != 6) {
                                                if (v9_3 != 9) {
                                                    v10_0 = 8;
                                                    if (v9_3 != 8) {
                                                        v6++;
                                                    } else {
                                                        Integer v5_1 = v0_1.getResourceId(v9_3, -1);
                                                        if (v5_1 == -1) {
                                                            v5_1 = v0_1.getInt(v9_3, -1);
                                                        }
                                                        v5_0 = Integer.valueOf(v5_1);
                                                    }
                                                } else {
                                                    v5_0 = v0_1.getString(v9_3);
                                                    v7_0 = v12;
                                                }
                                            } else {
                                                v5_0 = Integer.valueOf(v0_1.getInteger(v9_3, -1));
                                            }
                                            v7_0 = v10_0;
                                        } else {
                                            v5_0 = Float.valueOf(v0_1.getFloat(v9_3, 2143289344));
                                            v7_0 = 2;
                                        }
                                    } else {
                                        v5_0 = Float.valueOf(v0_1.getDimension(v9_3, 0));
                                    }
                                } else {
                                    v5_0 = Float.valueOf(android.util.TypedValue.applyDimension(1, v0_1.getDimension(v9_3, 0), p16.getResources().getDisplayMetrics()));
                                }
                                v7_0 = 7;
                            } else {
                                v5_0 = Integer.valueOf(v0_1.getColor(v9_3, 0));
                            }
                        } else {
                            v5_0 = Integer.valueOf(v0_1.getColor(v9_3, 0));
                        }
                    } else {
                        v5_0 = Boolean.valueOf(v0_1.getBoolean(v9_3, 0));
                        v7_0 = 6;
                    }
                } else {
                    v4_0 = v0_1.getString(v9_3);
                    v8 = 1;
                }
            } else {
                v4_0 = v0_1.getString(v9_3);
                if ((v4_0 != null) && (v4_0.length() > 0)) {
                    StringBuilder v9_2 = new StringBuilder();
                    v9_2.append(Character.toUpperCase(v4_0.charAt(0)));
                    v9_2.append(v4_0.substring(1));
                    v4_0 = v9_2.toString();
                }
            }
        }
        if ((v4_0 != null) && (v5_0 != null)) {
            z.b v1_1 = new z.b();
            v1_1.b = v7_0;
            v1_1.a = v8;
            v1_1.b(v5_0);
            p18.put(v4_0, v1_1);
        }
        v0_1.recycle();
        return;
    }

    public final void b(Object p2)
    {
        switch (u.e.c(this.b)) {
            case 0:
            case 7:
                this.c = ((Integer) p2).intValue();
                return;
            case 1:
                this.d = ((Float) p2).floatValue();
                return;
            case 2:
            case 3:
                this.g = ((Integer) p2).intValue();
                return;
            case 4:
                this.e = ((String) p2);
                return;
            case 5:
                this.f = ((Boolean) p2).booleanValue();
                return;
            case 6:
                this.d = ((Float) p2).floatValue();
                return;
            default:
                return;
        }
    }
}
