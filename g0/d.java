package g0;
public final class d {
    public final synthetic int a;
    public int b;
    public Object c;
    public Object d;

    public synthetic d()
    {
        this.a = 3;
        return;
    }

    public d(int p2)
    {
        this.a = 1;
        int v2_2 = new Object[(p2 * 2)];
        this.c = v2_2;
        this.b = 0;
        return;
    }

    public d(android.graphics.Shader p2, android.content.res.ColorStateList p3, int p4)
    {
        this.a = 0;
        this.c = p2;
        this.d = p3;
        this.b = p4;
        return;
    }

    public d(android.widget.ImageView p2)
    {
        this.a = 2;
        this.b = 0;
        this.c = p2;
        return;
    }

    public static g0.d c(android.content.res.Resources p30, int p31, android.content.res.Resources$Theme p32)
    {
        Float v2_9 = p30.getXml(p31);
        android.util.AttributeSet v3 = android.util.Xml.asAttributeSet(v2_9);
        do {
            int v4_6 = v2_9.next();
        } while((v4_6 == 2) || (v4_6 == 1));
        if (v4_6 != 2) {
            throw new org.xmlpull.v1.XmlPullParserException("No start tag found");
        } else {
            int v4_2 = v2_9.getName();
            v4_2.getClass();
            if (v4_2.equals("gradient")) {
                int v4_3 = v2_9.getName();
                if (!v4_3.equals("gradient")) {
                    String v24_1 = v2_9;
                    int v1_18 = new StringBuilder();
                    v1_18.append(v24_1.getPositionDescription());
                    v1_18.append(": invalid gradient color tag ");
                    v1_18.append(v4_3);
                    throw new org.xmlpull.v1.XmlPullParserException(v1_18.toString());
                } else {
                    float[] v12_3;
                    int v4_5 = g0.b.g(p30, p32, v3, c0.a.d);
                    if (v2_9.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") == null) {
                        v12_3 = 0;
                    } else {
                        v12_3 = v4_5.getFloat(8, 0);
                    }
                    int v13_8;
                    if (v2_9.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") == null) {
                        v13_8 = 0;
                    } else {
                        v13_8 = v4_5.getFloat(9, 0);
                    }
                    int v14_8;
                    if (v2_9.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") == null) {
                        v14_8 = 0;
                    } else {
                        v14_8 = v4_5.getFloat(10, 0);
                    }
                    int v15_8;
                    if (v2_9.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") == null) {
                        v15_8 = 0;
                    } else {
                        v15_8 = v4_5.getFloat(11, 0);
                    }
                    int v8_19;
                    if (v2_9.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") == null) {
                        v8_19 = 0;
                    } else {
                        v8_19 = v4_5.getFloat(3, 0);
                    }
                    int v9_0;
                    if (v2_9.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") == null) {
                        v9_0 = 0;
                    } else {
                        v9_0 = v4_5.getFloat(4, 0);
                    }
                    android.graphics.RadialGradient v11_2;
                    if (v2_9.getAttributeValue("http://schemas.android.com/apk/res/android", "type") == null) {
                        v11_2 = 0;
                    } else {
                        v11_2 = v4_5.getInt(2, 0);
                    }
                    int v6_2;
                    if (v2_9.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") == null) {
                        v6_2 = 0;
                    } else {
                        v6_2 = v4_5.getColor(0, 0);
                    }
                    int[] v20_1;
                    if (v2_9.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") == null) {
                        v20_1 = 0;
                    } else {
                        v20_1 = 1;
                    }
                    int v5_2;
                    if (v2_9.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") == null) {
                        v5_2 = 0;
                    } else {
                        v5_2 = v4_5.getColor(7, 0);
                    }
                    float[] v12_0;
                    float[] v21_0;
                    if (v2_9.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") == null) {
                        v21_0 = v12_3;
                        v12_0 = 0;
                    } else {
                        v21_0 = v12_3;
                        v12_0 = v4_5.getColor(1, 0);
                    }
                    android.graphics.Shader$TileMode v22_0;
                    int v10_7;
                    if (v2_9.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") == null) {
                        v22_0 = v13_8;
                        v10_7 = 0;
                    } else {
                        v22_0 = v13_8;
                        v10_7 = v4_5.getInt(6, 0);
                    }
                    int v13_2;
                    if (v2_9.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") == null) {
                        v13_2 = 0;
                    } else {
                        v13_2 = v4_5.getFloat(5, 0);
                    }
                    v4_5.recycle();
                    int v4_1 = (v2_9.getDepth() + 1);
                    String v24_0 = v2_9;
                    java.util.ArrayList v7_5 = new java.util.ArrayList(20);
                    int v25 = v13_2;
                    int v13_5 = new java.util.ArrayList(20);
                    while(true) {
                        int v27;
                        Float v2_1 = v24_0.next();
                        int v26 = v14_8;
                        if (v2_1 == 1) {
                            v27 = v15_8;
                        } else {
                            int v14_1 = v24_0.getDepth();
                            v27 = v15_8;
                            if ((v14_1 >= v4_1) || (v2_1 != 3)) {
                                if ((v2_1 == 2) && ((v14_1 <= v4_1) && (v24_0.getName().equals("item")))) {
                                    Float v2_5 = g0.b.g(p30, p32, v3, c0.a.e);
                                    int v15_5 = v2_5.hasValue(0);
                                    int v19_1 = v2_5.hasValue(1);
                                    if ((v15_5 == 0) || (v19_1 == 0)) {
                                        break;
                                    }
                                    int v28 = v2_5.getColor(0, 0);
                                    float v29 = v2_5.getFloat(1, 0);
                                    v2_5.recycle();
                                    v13_5.add(Integer.valueOf(v28));
                                    v7_5.add(Float.valueOf(v29));
                                }
                                v14_8 = v26;
                                v15_8 = v27;
                            }
                        }
                        android.graphics.Shader$TileMode v0_4;
                        if (v13_5.size() <= 0) {
                            v0_4 = 0;
                        } else {
                            v0_4 = new k2.c(v13_5, v7_5);
                        }
                        if (v0_4 == null) {
                            if (v20_1 == null) {
                                v0_4 = new k2.c(v6_2, v12_0);
                            } else {
                                v0_4 = new k2.c(v6_2, v5_2, v12_0);
                            }
                        }
                        android.graphics.RadialGradient v11_3;
                        if (v11_2 == 1) {
                            if (v25 <= 0) {
                                throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires \'gradientRadius\' attribute with radial type");
                            } else {
                                android.graphics.Shader$TileMode v0_11;
                                if (v10_7 == 1) {
                                    v0_11 = android.graphics.Shader$TileMode.REPEAT;
                                } else {
                                    if (v10_7 == 2) {
                                        v0_11 = android.graphics.Shader$TileMode.MIRROR;
                                    } else {
                                        v0_11 = android.graphics.Shader$TileMode.CLAMP;
                                    }
                                }
                                v11_3 = new android.graphics.RadialGradient(v8_19, v9_0, v25, ((int[]) v0_4.b), ((float[]) v0_4.c), v0_11);
                            }
                        } else {
                            if (v11_2 == 2) {
                                v11_3 = new android.graphics.SweepGradient(v8_19, v9_0, ((int[]) v0_4.b), ((float[]) v0_4.c));
                            } else {
                                android.graphics.Shader$TileMode v0_15;
                                if (v10_7 == 1) {
                                    v0_15 = android.graphics.Shader$TileMode.REPEAT;
                                } else {
                                    if (v10_7 == 2) {
                                        v0_15 = android.graphics.Shader$TileMode.MIRROR;
                                    } else {
                                        v0_15 = android.graphics.Shader$TileMode.CLAMP;
                                    }
                                }
                                v11_3 = new android.graphics.LinearGradient(v21_0, v22_0, v26, v27, ((int[]) v0_4.b), ((float[]) v0_4.c), v0_15);
                            }
                        }
                        return new g0.d(v11_3, 0, 0);
                    }
                    int v1_10 = new StringBuilder();
                    v1_10.append(v24_0.getPositionDescription());
                    v1_10.append(": <item> tag requires a \'color\' attribute and a \'offset\' attribute!");
                    throw new org.xmlpull.v1.XmlPullParserException(v1_10.toString());
                }
            } else {
                if (!v4_2.equals("selector")) {
                    int v1_13 = new StringBuilder();
                    v1_13.append(v2_9.getPositionDescription());
                    v1_13.append(": unsupported complex color tag ");
                    v1_13.append(v4_2);
                    throw new org.xmlpull.v1.XmlPullParserException(v1_13.toString());
                } else {
                    android.graphics.Shader$TileMode v0_23 = g0.c.b(p30, v2_9, v3, p32);
                    return new g0.d(0, v0_23, v0_23.getDefaultColor());
                }
            }
        }
    }

    public void a()
    {
        int[] v0_1 = ((android.widget.ImageView) this.c);
        android.graphics.drawable.Drawable v1 = v0_1.getDrawable();
        if (v1 != null) {
            n.n1.a(v1);
        }
        if (v1 != null) {
            n.v2 v2_1 = ((n.v2) this.d);
            if (v2_1 != null) {
                n.u.e(v1, v2_1, v0_1.getDrawableState());
            }
        }
        return;
    }

    public m4.n b()
    {
        IllegalArgumentException v0_1 = ((m4.e) this.d);
        if (v0_1 != null) {
            throw v0_1.a();
        } else {
            IllegalArgumentException v0_2 = m4.n.b(this.b, ((Object[]) this.c), this);
            m4.e v1_1 = ((m4.e) this.d);
            if (v1_1 != null) {
                throw v1_1.a();
            } else {
                return v0_2;
            }
        }
    }

    public String d()
    {
        String v0_1 = new StringBuilder("$");
        String v1_2 = (this.b + 1);
        int v2 = 0;
        while (v2 < v1_2) {
            String v3_2 = ((Object[]) this.c)[v2];
            if (!(v3_2 instanceof q8.d)) {
                if (v3_2 != u8.h.a) {
                    v0_1.append("[\'");
                    v0_1.append(v3_2);
                    v0_1.append("\']");
                }
            } else {
                String v3_4 = ((q8.d) v3_2);
                if (!kotlin.jvm.internal.j.a(v3_4.c(), q8.f.g)) {
                    String v4_7 = ((int[]) this.d)[v2];
                    if (v4_7 >= null) {
                        v0_1.append(".");
                        v0_1.append(v3_4.e(v4_7));
                    }
                } else {
                    if (((int[]) this.d)[v2] != -1) {
                        v0_1.append("[");
                        v0_1.append(((int[]) this.d)[v2]);
                        v0_1.append("]");
                    }
                }
            }
            v2++;
        }
        String v0_2 = v0_1.toString();
        kotlin.jvm.internal.j.d(v0_2, "toString(...)");
        return v0_2;
    }

    public boolean e()
    {
        if (((android.graphics.Shader) this.c) == null) {
            int v0_4 = ((android.content.res.ColorStateList) this.d);
            if ((v0_4 != 0) && (v0_4.isStateful())) {
                return 1;
            }
        }
        return 0;
    }

    public void f(android.util.AttributeSet p9, int p10)
    {
        android.widget.ImageView v1_1 = ((android.widget.ImageView) this.c);
        int[] v3 = g.a.f;
        b8.g v7 = b8.g.p(v1_1.getContext(), p9, v3, p10);
        Throwable v0_4 = ((android.content.res.TypedArray) v7.c);
        q0.q0.m(v1_1, v1_1.getContext(), v3, p9, ((android.content.res.TypedArray) v7.c), p10);
        android.graphics.PorterDuff$Mode v9_1 = v1_1.getDrawable();
        if (v9_1 == null) {
            boolean v2_2 = v0_4.getResourceId(1, -1);
            if (v2_2 != -1) {
                v9_1 = j5.t1.A(v1_1.getContext(), v2_2);
                if (v9_1 != null) {
                    v1_1.setImageDrawable(v9_1);
                }
            }
        }
        if (v9_1 != null) {
            n.n1.a(v9_1);
        }
        if (v0_4.hasValue(2)) {
            v1_1.setImageTintList(v7.h(2));
        }
        if (v0_4.hasValue(3)) {
            v1_1.setImageTintMode(n.n1.c(v0_4.getInt(3, -1), 0));
        }
        v7.r();
        return;
    }

    public void g(Object p4, Object p5)
    {
        Object[] v0_5 = ((this.b + 1) * 2);
        int v1_3 = ((Object[]) this.c);
        if (v0_5 > v1_3.length) {
            this.c = java.util.Arrays.copyOf(v1_3, c4.b.y(v1_3.length, v0_5));
        }
        q4.b.e(p4, p5);
        Object[] v0_4 = ((Object[]) this.c);
        int v1_0 = this.b;
        int v2_0 = (v1_0 * 2);
        v0_4[v2_0] = p4;
        v0_4[(v2_0 + 1)] = p5;
        this.b = (v1_0 + 1);
        return;
    }

    public void h(java.util.Collection p4)
    {
        if (p4 != null) {
            Object v1_4 = ((p4.size() + this.b) * 2);
            Object v0_7 = ((Object[]) this.c);
            if (v1_4 > v0_7.length) {
                this.c = java.util.Arrays.copyOf(v0_7, c4.b.y(v0_7.length, v1_4));
            }
        }
        java.util.Iterator v4_1 = p4.iterator();
        while (v4_1.hasNext()) {
            Object v0_4 = ((java.util.Map$Entry) v4_1.next());
            this.g(v0_4.getKey(), v0_4.getValue());
        }
        return;
    }

    public String toString()
    {
        switch (this.a) {
            case 3:
                return this.d();
            default:
                return super.toString();
        }
    }
}
