package g0;
public abstract class c {
    public static final ThreadLocal a;

    static c()
    {
        g0.c.a = new ThreadLocal();
        return;
    }

    public static android.content.res.ColorStateList a(android.content.res.Resources p4, android.content.res.XmlResourceParser p5, android.content.res.Resources$Theme p6)
    {
        android.util.AttributeSet v0 = android.util.Xml.asAttributeSet(p5);
        do {
            int v1 = p5.next();
        } while((v1 == 2) || (v1 == 1));
        if (v1 != 2) {
            throw new org.xmlpull.v1.XmlPullParserException("No start tag found");
        } else {
            return g0.c.b(p4, p5, v0, p6);
        }
    }

    public static android.content.res.ColorStateList b(android.content.res.Resources p36, org.xmlpull.v1.XmlPullParser p37, android.util.AttributeSet p38, android.content.res.Resources$Theme p39)
    {
        int v0_0 = p36;
        android.util.AttributeSet v1_0 = p38;
        android.content.res.Resources$Theme v2_2 = p39;
        int v3_3 = p37.getName();
        if (!v3_3.equals("selector")) {
            android.util.AttributeSet v1_2 = new StringBuilder();
            v1_2.append(p37.getPositionDescription());
            v1_2.append(": invalid color state list tag ");
            v1_2.append(v3_3);
            throw new org.xmlpull.v1.XmlPullParserException(v1_2.toString());
        } else {
            int v4_2 = 1;
            int v3_1 = (p37.getDepth() + 1);
            Object[] v6 = new int[][20];
            int[] v5_1 = new int[20];
            int v7_2 = 0;
            int v8 = 0;
            while(true) {
                float v9_6 = p37.next();
                if (v9_6 != v4_2) {
                    float v10_2 = p37.getDepth();
                    if ((v10_2 >= v3_1) || (v9_6 != 3)) {
                        if ((v9_6 != 2) || ((v10_2 > v3_1) || (!p37.getName().equals("item")))) {
                            break;
                        }
                        float v9_10;
                        float v9_9 = c0.a.a;
                        if (v2_2 != null) {
                            v9_10 = v2_2.obtainStyledAttributes(v1_0, v9_9, v7_2, v7_2);
                        } else {
                            v9_10 = v0_0.obtainAttributes(v1_0, v9_9);
                        }
                        float v10_3;
                        int v13_8 = v9_10.getResourceId(v7_2, -1);
                        if (v13_8 == -1) {
                            v10_3 = v9_10.getColor(v7_2, -65281);
                        } else {
                            float v12_6;
                            float v10_6 = g0.c.a;
                            int v16_3 = ((android.util.TypedValue) v10_6.get());
                            if (v16_3 != 0) {
                                v12_6 = v16_3;
                            } else {
                                v12_6 = new android.util.TypedValue();
                                v10_6.set(v12_6);
                            }
                            v0_0.getValue(v13_8, v12_6, v4_2);
                            float v10_7 = v12_6.type;
                            if ((v10_7 < 28) || (v10_7 > 31)) {
                                try {
                                    v10_3 = g0.c.a(v0_0, v0_0.getXml(v13_8), v2_2).getDefaultColor();
                                } catch (Exception) {
                                    v10_3 = v9_10.getColor(v7_2, -65281);
                                }
                            }
                        }
                        int v11_0;
                        if (!v9_10.hasValue(v4_2)) {
                            if (!v9_10.hasValue(3)) {
                                v11_0 = 1065353216;
                            } else {
                                v11_0 = v9_10.getFloat(3, 1065353216);
                            }
                        } else {
                            v11_0 = v9_10.getFloat(v4_2, 1065353216);
                        }
                        int v4_1;
                        int v16_0 = v4_2;
                        if ((android.os.Build$VERSION.SDK_INT < 31) || (!v9_10.hasValue(2))) {
                            v4_1 = v9_10.getFloat(4, -1082130432);
                        } else {
                            v4_1 = v9_10.getFloat(2, -1082130432);
                        }
                        v9_10.recycle();
                        float v9_0 = v1_0.getAttributeCount();
                        float v12_2 = new int[v9_0];
                        float v15_1 = v7_2;
                        int v13_0 = v15_1;
                        while (v15_1 < v9_0) {
                            float v14_21 = v1_0.getAttributeNameResource(v15_1);
                            if ((v14_21 != 16843173) && ((v14_21 != 16843551) && ((v14_21 != 2130968629) && (v14_21 != 2130969316)))) {
                                int v7_7 = (v13_0 + 1);
                                if (!v1_0.getAttributeBooleanValue(v15_1, 0)) {
                                    v14_21 = (- v14_21);
                                }
                                v12_2[v13_0] = v14_21;
                                v13_0 = v7_7;
                            }
                            v15_1++;
                            int v7 = 0;
                        }
                        float v9_3;
                        int v0_1 = android.util.StateSet.trimStateSet(v12_2, v13_0);
                        float v12_3 = 1120403456;
                        if ((v4_1 < 0) || (v4_1 > 1120403456)) {
                            v9_3 = 0;
                        } else {
                            v9_3 = v16_0;
                        }
                        if ((v11_0 != 1065353216) || (v9_3 != 0)) {
                            int v11_3 = c4.b.h(((int) ((((float) android.graphics.Color.alpha(v10_3)) * v11_0) + 1056964608)), 0, 255);
                            if (v9_3 == 0) {
                                int v31 = v0_1;
                                int v34_0 = v3_1;
                            } else {
                                int v0_2;
                                float v9_4 = g0.a.a(v10_3);
                                float v10_0 = v9_4.a;
                                float v9_5 = v9_4.b;
                                int v13_7 = g0.n.k;
                                if ((((double) v9_5) >= 4607182418800017408) && ((((double) Math.round(v4_1)) > 0) && (((double) Math.round(v4_1)) < 4636737291354636288))) {
                                    float v10_1;
                                    if (v10_0 >= 0) {
                                        v10_1 = Math.min(1135869952, v10_0);
                                    } else {
                                        v10_1 = 0;
                                    }
                                    float v21 = 0;
                                    float v15_2 = v9_5;
                                    int v20_3 = v16_0;
                                    int v7_1 = 0;
                                    while (Math.abs((v21 - v9_5)) >= 1053609165) {
                                        float v23_3 = 1148846080;
                                        float v26 = v12_3;
                                        float v25 = 0;
                                        float v24_1 = 1148846080;
                                        g0.a v27 = 0;
                                        while (Math.abs((v25 - v26)) > 1008981770) {
                                            float v14_18;
                                            float v32_6;
                                            float v30 = v12_3;
                                            float v12_4 = (((v26 - v25) / 1073741824) + v25);
                                            v31 = v0_1;
                                            int v0_5 = g0.a.b(v12_4, v15_2, v10_1).c(g0.n.k);
                                            int v34_2 = g0.b.d[v16_0];
                                            float v14_17 = (((g0.b.f(android.graphics.Color.blue(v0_5)) * v34_2[2]) + ((g0.b.f(android.graphics.Color.green(v0_5)) * v34_2[v16_0]) + (g0.b.f(android.graphics.Color.red(v0_5)) * v34_2[0]))) / v30);
                                            if (v14_17 > 1007753895) {
                                                v32_6 = v0_5;
                                                v14_18 = ((((float) Math.cbrt(((double) v14_17))) * 1122500608) - 1098907648);
                                            } else {
                                                v14_18 = (v14_17 * 1147261687);
                                                v32_6 = v0_5;
                                            }
                                            int v0_11 = Math.abs((v4_1 - v14_18));
                                            if (v0_11 >= 1045220557) {
                                                v34_0 = v3_1;
                                            } else {
                                                android.util.AttributeSet v1_8 = g0.a.a(v32_6);
                                                float v32_8 = v0_11;
                                                int v0_13 = g0.a.b(v1_8.c, v1_8.b, v10_1);
                                                v34_0 = v3_1;
                                                int v0_20 = ((float) (Math.pow(Math.sqrt(((double) (((v1_8.f - v0_13.f) * (v1_8.f - v0_13.f)) + (((v1_8.e - v0_13.e) * (v1_8.e - v0_13.e)) + ((v1_8.d - v0_13.d) * (v1_8.d - v0_13.d)))))), 4603849755075763241) * 4609028894647239311));
                                                if (v0_20 <= 1065353216) {
                                                    v24_1 = v0_20;
                                                    v23_3 = v32_8;
                                                    v27 = v1_8;
                                                }
                                            }
                                            if ((v23_3 != 0) || (v24_1 != 0)) {
                                                if (v14_18 >= v4_1) {
                                                    v26 = v12_4;
                                                } else {
                                                    v25 = v12_4;
                                                }
                                                android.content.res.Resources$Theme v2 = p39;
                                                v12_3 = v30;
                                                v0_1 = v31;
                                                v3_1 = v34_0;
                                            }
                                            int v0_24 = v27;
                                            if (v20_3 == 0) {
                                                if (v0_24 != 0) {
                                                    v7_1 = v0_24;
                                                    v21 = v15_2;
                                                } else {
                                                    v9_5 = v15_2;
                                                }
                                                v15_2 = (((v9_5 - v21) / 1073741824) + v21);
                                                v2 = p39;
                                                v12_3 = v30;
                                                v0_1 = v31;
                                                v3_1 = v34_0;
                                            } else {
                                                if (v0_24 == 0) {
                                                    v15_2 = (((v9_5 - v21) / 1073741824) + v21);
                                                    v2 = p39;
                                                    v12_3 = v30;
                                                    v0_1 = v31;
                                                    v3_1 = v34_0;
                                                    v20_3 = 0;
                                                } else {
                                                    v0_2 = v0_24.c(v13_7);
                                                }
                                            }
                                        }
                                        v31 = v0_1;
                                        v34_0 = v3_1;
                                        v30 = v12_3;
                                    }
                                    v31 = v0_1;
                                    v34_0 = v3_1;
                                    if (v7_1 != 0) {
                                        v0_2 = v7_1.c(v13_7);
                                    } else {
                                        v0_2 = g0.b.e(v4_1);
                                    }
                                } else {
                                    v31 = v0_1;
                                    v34_0 = v3_1;
                                    v0_2 = g0.b.e(v4_1);
                                }
                                v10_3 = v0_2;
                            }
                            v10_3 = ((16777215 & v10_3) | (v11_3 << 24));
                        } else {
                            v31 = v0_1;
                            v34_0 = v3_1;
                        }
                        int v0_31 = (v8 + 1);
                        android.content.res.Resources$Theme v2_16 = 8;
                        if (v0_31 > v5_1.length) {
                            android.util.AttributeSet v1_13;
                            if (v8 > 4) {
                                v1_13 = (v8 * 2);
                            } else {
                                v1_13 = 8;
                            }
                            android.util.AttributeSet v1_14 = new int[v1_13];
                            System.arraycopy(v5_1, 0, v1_14, 0, v8);
                            v5_1 = v1_14;
                        }
                        v5_1[v8] = v10_3;
                        if (v0_31 > v6.length) {
                            android.util.AttributeSet v1_17 = v6.getClass().getComponentType();
                            if (v8 > 4) {
                                v2_16 = (v8 * 2);
                            }
                            android.util.AttributeSet v1_19 = ((Object[]) reflect.Array.newInstance(v1_17, v2_16));
                            System.arraycopy(v6, 0, v1_19, 0, v8);
                            v6 = v1_19;
                        }
                        v6[v8] = v31;
                        v6 = ((int[][]) v6);
                        v1_0 = p38;
                        v2_2 = p39;
                        v8 = v0_31;
                        v4_2 = v16_0;
                        v3_1 = v34_0;
                        v7_2 = 0;
                        v0_0 = p36;
                    }
                }
                int v0_32 = new int[v8];
                android.util.AttributeSet v1_20 = new int[][v8];
                System.arraycopy(v5_1, 0, v0_32, 0, v8);
                System.arraycopy(v6, 0, v1_20, 0, v8);
                return new android.content.res.ColorStateList(v1_20, v0_32);
            }
            v0_0 = p36;
            v1_0 = p38;
            v2_2 = p39;
            v7_2 = 0;
        }
    }
}
