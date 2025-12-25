package g2;
public final class q extends g2.h {
    public static final android.graphics.PorterDuff$Mode p;
    public g2.o b;
    public android.graphics.PorterDuffColorFilter c;
    public android.graphics.ColorFilter d;
    public boolean e;
    public boolean f;
    public final float[] m;
    public final android.graphics.Matrix n;
    public final android.graphics.Rect o;

    static q()
    {
        g2.q.p = android.graphics.PorterDuff$Mode.SRC_IN;
        return;
    }

    public q()
    {
        this.f = 1;
        g2.o v0_5 = new float[9];
        this.m = v0_5;
        this.n = new android.graphics.Matrix();
        this.o = new android.graphics.Rect();
        g2.o v0_3 = new g2.o();
        v0_3.c = 0;
        v0_3.d = g2.q.p;
        v0_3.b = new g2.n();
        this.b = v0_3;
        return;
    }

    public q(g2.o p2)
    {
        this.f = 1;
        android.content.res.ColorStateList v0_4 = new float[9];
        this.m = v0_4;
        this.n = new android.graphics.Matrix();
        this.o = new android.graphics.Rect();
        this.b = p2;
        this.c = this.a(p2.c, p2.d);
        return;
    }

    public final android.graphics.PorterDuffColorFilter a(android.content.res.ColorStateList p3, android.graphics.PorterDuff$Mode p4)
    {
        if ((p3 != 0) && (p4 != null)) {
            return new android.graphics.PorterDuffColorFilter(p3.getColorForState(this.getState(), 0), p4);
        } else {
            return 0;
        }
    }

    public final boolean canApplyTheme()
    {
        int v0_0 = this.a;
        if (v0_0 != 0) {
            v0_0.canApplyTheme();
        }
        return 0;
    }

    public final void draw(android.graphics.Canvas p19)
    {
        android.graphics.Rect v2_0 = this.a;
        if (v2_0 == null) {
            android.graphics.Rect v2_1 = this.o;
            this.copyBounds(v2_1);
            if ((v2_1.width() > 0) && (v2_1.height() > 0)) {
                android.graphics.Paint v3_1 = this.d;
                if (v3_1 == null) {
                    v3_1 = this.c;
                }
                android.graphics.Bitmap v4_1 = this.n;
                p19.getMatrix(v4_1);
                int v5_10 = this.m;
                v4_1.getValues(v5_10);
                int v6_16 = Math.abs(v5_10[0]);
                int v7_2 = Math.abs(v5_10[4]);
                boolean v9_6 = Math.abs(v5_10[1]);
                int v5_13 = Math.abs(v5_10[3]);
                if ((v9_6 != 0) || (v5_13 != 0)) {
                    v6_16 = 1065353216;
                    v7_2 = 1065353216;
                }
                int v6_20 = ((int) (((float) v2_1.height()) * v7_2));
                int v5_19 = Math.min(2048, ((int) (((float) v2_1.width()) * v6_16)));
                int v6_21 = Math.min(2048, v6_20);
                if ((v5_19 > 0) && (v6_21 > 0)) {
                    int v7_4 = p19.save();
                    p19.translate(((float) v2_1.left), ((float) v2_1.top));
                    if ((this.isAutoMirrored()) && (this.getLayoutDirection() == 1)) {
                        p19.translate(((float) v2_1.width()), 0);
                        p19.scale(-1082130432, 1065353216);
                    }
                    v2_1.offsetTo(0, 0);
                    boolean v9_15 = this.b;
                    android.graphics.Bitmap v10_3 = v9_15.f;
                    if ((v10_3 == null) || ((v5_19 != v10_3.getWidth()) || (v6_21 != v9_15.f.getHeight()))) {
                        v9_15.f = android.graphics.Bitmap.createBitmap(v5_19, v6_21, android.graphics.Bitmap$Config.ARGB_8888);
                        v9_15.k = 1;
                    }
                    if (this.f) {
                        int v16_1 = v5_19;
                        int v17_1 = v6_21;
                        int v5_20 = this.b;
                        if ((v5_20.k) || ((v5_20.g != v5_20.c) || ((v5_20.h != v5_20.d) || ((v5_20.j != v5_20.e) || (v5_20.i != v5_20.b.getRootAlpha()))))) {
                            int v5_2 = this.b;
                            v5_2.f.eraseColor(0);
                            g2.n v12_0 = v5_2.b;
                            v12_0.a(v12_0.g, g2.n.p, new android.graphics.Canvas(v5_2.f), v16_1, v17_1);
                            int v5_3 = this.b;
                            v5_3.g = v5_3.c;
                            v5_3.h = v5_3.d;
                            v5_3.i = v5_3.b.getRootAlpha();
                            v5_3.j = v5_3.e;
                            v5_3.k = 0;
                        }
                    } else {
                        boolean v9_3 = this.b;
                        v9_3.f.eraseColor(0);
                        g2.n v12_1 = v9_3.b;
                        v12_1.a(v12_1.g, g2.n.p, new android.graphics.Canvas(v9_3.f), v5_19, v6_21);
                    }
                    android.graphics.Paint v3_2;
                    android.graphics.Bitmap v4_2 = this.b;
                    if ((v4_2.b.getRootAlpha() < 255) || (v3_1 != null)) {
                        if (v4_2.l == null) {
                            int v5_8 = new android.graphics.Paint();
                            v4_2.l = v5_8;
                            v5_8.setFilterBitmap(1);
                        }
                        v4_2.l.setAlpha(v4_2.b.getRootAlpha());
                        v4_2.l.setColorFilter(v3_1);
                        v3_2 = v4_2.l;
                    } else {
                        v3_2 = 0;
                    }
                    p19.drawBitmap(v4_2.f, 0, v2_1, v3_2);
                    p19.restoreToCount(v7_4);
                }
            }
            return;
        } else {
            v2_0.draw(p19);
            return;
        }
    }

    public final int getAlpha()
    {
        int v0_0 = this.a;
        if (v0_0 == 0) {
            return this.b.b.getRootAlpha();
        } else {
            return v0_0.getAlpha();
        }
    }

    public final int getChangingConfigurations()
    {
        int v0_0 = this.a;
        if (v0_0 == 0) {
            return (super.getChangingConfigurations() | this.b.getChangingConfigurations());
        } else {
            return v0_0.getChangingConfigurations();
        }
    }

    public final android.graphics.ColorFilter getColorFilter()
    {
        android.graphics.ColorFilter v0_0 = this.a;
        if (v0_0 == null) {
            return this.d;
        } else {
            return v0_0.getColorFilter();
        }
    }

    public final android.graphics.drawable.Drawable$ConstantState getConstantState()
    {
        if (this.a == null) {
            this.b.a = this.getChangingConfigurations();
            return this.b;
        } else {
            return new g2.p(this.a.getConstantState());
        }
    }

    public final int getIntrinsicHeight()
    {
        int v0_0 = this.a;
        if (v0_0 == 0) {
            return ((int) this.b.b.i);
        } else {
            return v0_0.getIntrinsicHeight();
        }
    }

    public final int getIntrinsicWidth()
    {
        int v0_0 = this.a;
        if (v0_0 == 0) {
            return ((int) this.b.b.h);
        } else {
            return v0_0.getIntrinsicWidth();
        }
    }

    public final int getOpacity()
    {
        int v0_0 = this.a;
        if (v0_0 == 0) {
            return -3;
        } else {
            return v0_0.getOpacity();
        }
    }

    public final void inflate(android.content.res.Resources p2, org.xmlpull.v1.XmlPullParser p3, android.util.AttributeSet p4)
    {
        int v0_0 = this.a;
        if (v0_0 == 0) {
            this.inflate(p2, p3, p4, 0);
            return;
        } else {
            v0_0.inflate(p2, p3, p4);
            return;
        }
    }

    public final void inflate(android.content.res.Resources p29, org.xmlpull.v1.XmlPullParser p30, android.util.AttributeSet p31, android.content.res.Resources$Theme p32)
    {
        org.xmlpull.v1.XmlPullParserException v0_32 = this.a;
        if (v0_32 == null) {
            org.xmlpull.v1.XmlPullParserException v0_27;
            g2.o v6 = this.b;
            v6.b = new g2.n();
            r.e v7_0 = g0.b.g(p29, p32, p31, g2.a.a);
            java.util.ArrayDeque v8_4 = this.b;
            int v9_0 = v8_4.b;
            if (g0.b.d(p30, "tintMode")) {
                v0_27 = v7_0.getInt(6, -1);
            } else {
                v0_27 = -1;
            }
            android.graphics.PorterDuff$Mode v12_0 = android.graphics.PorterDuff$Mode.SRC_IN;
            if (v0_27 == 3) {
                v12_0 = android.graphics.PorterDuff$Mode.SRC_OVER;
            } else {
                if (v0_27 != 5) {
                    if (v0_27 == 9) {
                        v12_0 = android.graphics.PorterDuff$Mode.SRC_ATOP;
                    } else {
                        switch (v0_27) {
                            case 14:
                                v12_0 = android.graphics.PorterDuff$Mode.MULTIPLY;
                                break;
                            case 15:
                                v12_0 = android.graphics.PorterDuff$Mode.SCREEN;
                                break;
                            case 16:
                                v12_0 = android.graphics.PorterDuff$Mode.ADD;
                                break;
                            default:
                        }
                    }
                }
            }
            v8_4.d = v12_0;
            android.content.res.ColorStateList v16 = 0;
            String v10_11 = 1;
            if (p30.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
                org.xmlpull.v1.XmlPullParserException v0_31 = new android.util.TypedValue();
                v7_0.getValue(1, v0_31);
                int v14_45 = v0_31.type;
                if (v14_45 == 2) {
                    String v3_10 = new StringBuilder("Failed to resolve attribute at index 1: ");
                    v3_10.append(v0_31);
                    throw new UnsupportedOperationException(v3_10.toString());
                } else {
                    if ((v14_45 < 28) || (v14_45 > 31)) {
                        org.xmlpull.v1.XmlPullParserException v0_34 = v7_0.getResources();
                        try {
                            v16 = g0.c.a(v0_34, v0_34.getXml(v7_0.getResourceId(1, 0)), p32);
                        } catch (org.xmlpull.v1.XmlPullParserException v0_35) {
                            android.util.Log.e("CSLCompat", "Failed to inflate ColorStateList.", v0_35);
                        }
                    } else {
                        v16 = android.content.res.ColorStateList.valueOf(v0_31.data);
                    }
                }
            }
            org.xmlpull.v1.XmlPullParserException v0_38 = v16;
            if (v0_38 != null) {
                v8_4.c = v0_38;
            }
            org.xmlpull.v1.XmlPullParserException v0_39 = v8_4.e;
            if (p30.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
                v0_39 = v7_0.getBoolean(5, v0_39);
            }
            v8_4.e = v0_39;
            org.xmlpull.v1.XmlPullParserException v0_0 = v9_0.j;
            if (p30.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
                v0_0 = v7_0.getFloat(7, v0_0);
            }
            v9_0.j = v0_0;
            org.xmlpull.v1.XmlPullParserException v0_1 = v9_0.k;
            if (p30.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
                v0_1 = v7_0.getFloat(8, v0_1);
            }
            v9_0.k = v0_1;
            if (v9_0.j <= 0) {
                String v2_2 = new StringBuilder();
                v2_2.append(v7_0.getPositionDescription());
                v2_2.append("<vector> tag requires viewportWidth > 0");
                throw new org.xmlpull.v1.XmlPullParserException(v2_2.toString());
            } else {
                if (v0_1 <= 0) {
                    String v2_5 = new StringBuilder();
                    v2_5.append(v7_0.getPositionDescription());
                    v2_5.append("<vector> tag requires viewportHeight > 0");
                    throw new org.xmlpull.v1.XmlPullParserException(v2_5.toString());
                } else {
                    v9_0.h = v7_0.getDimension(3, v9_0.h);
                    org.xmlpull.v1.XmlPullParserException v0_11 = v7_0.getDimension(2, v9_0.i);
                    v9_0.i = v0_11;
                    if (v9_0.h <= 0) {
                        String v2_8 = new StringBuilder();
                        v2_8.append(v7_0.getPositionDescription());
                        v2_8.append("<vector> tag requires width > 0");
                        throw new org.xmlpull.v1.XmlPullParserException(v2_8.toString());
                    } else {
                        if (v0_11 <= 0) {
                            String v2_11 = new StringBuilder();
                            v2_11.append(v7_0.getPositionDescription());
                            v2_11.append("<vector> tag requires height > 0");
                            throw new org.xmlpull.v1.XmlPullParserException(v2_11.toString());
                        } else {
                            org.xmlpull.v1.XmlPullParserException v0_19 = v9_0.getAlpha();
                            if (p30.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                                v0_19 = v7_0.getFloat(4, v0_19);
                            }
                            v9_0.setAlpha(v0_19);
                            org.xmlpull.v1.XmlPullParserException v0_20 = v7_0.getString(0);
                            if (v0_20 != null) {
                                v9_0.m = v0_20;
                                v9_0.o.put(v0_20, v9_0);
                            }
                            v7_0.recycle();
                            v6.a = this.getChangingConfigurations();
                            v6.k = 1;
                            org.xmlpull.v1.XmlPullParserException v0_22 = this.b;
                            r.e v7_1 = v0_22.b;
                            java.util.ArrayDeque v8_13 = new java.util.ArrayDeque();
                            r.e v7_2 = v7_1.o;
                            v8_13.push(v7_1.g);
                            int v9_2 = p30.getEventType();
                            int v11_2 = (p30.getDepth() + 1);
                            int v21_1 = 1;
                            while ((v9_2 != v10_11) && ((p30.getDepth() >= v11_2) || (v9_2 != 3))) {
                                String v25;
                                int v24;
                                if (v9_2 != 2) {
                                    v25 = v11_2;
                                    int v18 = 9;
                                    int v20 = 7;
                                    v24 = 1;
                                    if ((v9_2 == 3) && ("group".equals(p30.getName()))) {
                                        v8_13.pop();
                                    }
                                } else {
                                    int v9_5 = p30.getName();
                                    String v10_4 = ((g2.k) v8_13.peek());
                                    v25 = v11_2;
                                    if (!"path".equals(v9_5)) {
                                        int v19 = -1;
                                        if (!"clip-path".equals(v9_5)) {
                                            if ("group".equals(v9_5)) {
                                                int v9_8 = new g2.k();
                                                int v11_5 = g0.b.g(p29, p32, p31, g2.a.b);
                                                int v13_5 = v9_8.c;
                                                if (g0.b.d(p30, "rotation")) {
                                                    v13_5 = v11_5.getFloat(5, v13_5);
                                                }
                                                v9_8.c = v13_5;
                                                v9_8.d = v11_5.getFloat(1, v9_8.d);
                                                v9_8.e = v11_5.getFloat(2, v9_8.e);
                                                int v13_10 = v9_8.f;
                                                if (p30.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                                    v13_10 = v11_5.getFloat(3, v13_10);
                                                }
                                                v9_8.f = v13_10;
                                                int v13_11 = v9_8.g;
                                                if (p30.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                                    v13_11 = v11_5.getFloat(4, v13_11);
                                                }
                                                v9_8.g = v13_11;
                                                int v13_12 = v9_8.h;
                                                if (p30.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                                    v13_12 = v11_5.getFloat(6, v13_12);
                                                }
                                                v9_8.h = v13_12;
                                                int v13_13 = v9_8.i;
                                                if (p30.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                                    v13_13 = v11_5.getFloat(7, v13_13);
                                                }
                                                v9_8.i = v13_13;
                                                int v14_20 = v11_5.getString(0);
                                                if (v14_20 != 0) {
                                                    v9_8.k = v14_20;
                                                }
                                                v9_8.c();
                                                v11_5.recycle();
                                                v10_4.b.add(v9_8);
                                                v8_13.push(v9_8);
                                                if (v9_8.getGroupName() != null) {
                                                    v7_2.put(v9_8.getGroupName(), v9_8);
                                                }
                                                v0_22.a = v0_22.a;
                                                int v17 = 6;
                                                int v22 = 4;
                                                v24 = 1;
                                                v9_2 = p30.next();
                                                v10_11 = v24;
                                                v11_2 = v25;
                                            }
                                        } else {
                                            int v9_11 = new g2.i();
                                            if (p30.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                                int v11_8 = g0.b.g(p29, p32, p31, g2.a.d);
                                                int v14_21 = v11_8.getString(0);
                                                if (v14_21 != 0) {
                                                    v9_11.b = v14_21;
                                                }
                                                int v13_16 = v11_8.getString(1);
                                                if (v13_16 != 0) {
                                                    v9_11.a = a.a.m(v13_16);
                                                }
                                                int v15_5;
                                                if (g0.b.d(p30, "fillType")) {
                                                    v15_5 = v11_8.getInt(2, 0);
                                                } else {
                                                    v15_5 = 0;
                                                }
                                                v9_11.c = v15_5;
                                                v11_8.recycle();
                                            }
                                            v10_4.b.add(v9_11);
                                            if (v9_11.getPathName() != null) {
                                                v7_2.put(v9_11.getPathName(), v9_11);
                                            }
                                            v0_22.a = v0_22.a;
                                        }
                                        int v15 = 2;
                                    } else {
                                        int v9_14 = new g2.j();
                                        v9_14.e = 0;
                                        v9_14.g = 1065353216;
                                        v9_14.h = 1065353216;
                                        v9_14.i = 0;
                                        v9_14.j = 1065353216;
                                        v9_14.k = 0;
                                        int v14_25 = android.graphics.Paint$Cap.BUTT;
                                        v9_14.l = v14_25;
                                        int v13_21 = android.graphics.Paint$Join.MITER;
                                        v9_14.m = v13_21;
                                        int v21_2 = v13_21;
                                        v9_14.n = 1082130432;
                                        int v13_24 = g0.b.g(p29, p32, p31, g2.a.c);
                                        if (p30.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                            int v26_0 = v14_25;
                                            int v14_26 = v13_24.getString(0);
                                            if (v14_26 != 0) {
                                                v9_14.b = v14_26;
                                            }
                                            int v14_27 = v13_24.getString(2);
                                            if (v14_27 != 0) {
                                                v9_14.a = a.a.m(v14_27);
                                            }
                                            v9_14.f = g0.b.c(v13_24, p30, p32, "fillColor", 1);
                                            int v11_15 = v9_14.h;
                                            if (p30.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                                v11_15 = v13_24.getFloat(12, v11_15);
                                            }
                                            int v14_32;
                                            v9_14.h = v11_15;
                                            if (p30.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") == null) {
                                                v14_32 = -1;
                                            } else {
                                                v14_32 = v13_24.getInt(8, -1);
                                            }
                                            int v14_34;
                                            if (v14_32 == 0) {
                                                v14_34 = v26_0;
                                            } else {
                                                if (v14_32 == 1) {
                                                    v14_34 = android.graphics.Paint$Cap.ROUND;
                                                } else {
                                                    if (v14_32 == 2) {
                                                        v14_34 = android.graphics.Paint$Cap.SQUARE;
                                                    } else {
                                                        v14_34 = v9_14.l;
                                                    }
                                                }
                                            }
                                            int v11_25;
                                            v9_14.l = v14_34;
                                            if (p30.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") == null) {
                                                v11_25 = -1;
                                            } else {
                                                v11_25 = v13_24.getInt(9, -1);
                                            }
                                            int v11_27;
                                            if (v11_25 == 0) {
                                                v11_27 = v21_2;
                                            } else {
                                                if (v11_25 == 1) {
                                                    v11_27 = android.graphics.Paint$Join.ROUND;
                                                } else {
                                                    if (v11_25 == 2) {
                                                        v11_27 = android.graphics.Paint$Join.BEVEL;
                                                    } else {
                                                        v11_27 = v9_14.m;
                                                    }
                                                }
                                            }
                                            v9_14.m = v11_27;
                                            int v11_28 = v9_14.n;
                                            if (p30.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                                v11_28 = v13_24.getFloat(10, v11_28);
                                            }
                                            v9_14.n = v11_28;
                                            v9_14.d = g0.b.c(v13_24, p30, p32, "strokeColor", 3);
                                            int v11_31 = v9_14.g;
                                            if (p30.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                                v11_31 = v13_24.getFloat(11, v11_31);
                                            }
                                            v9_14.g = v11_31;
                                            int v11_32 = v9_14.e;
                                            if (p30.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                                v11_32 = v13_24.getFloat(4, v11_32);
                                            }
                                            v9_14.e = v11_32;
                                            int v11_33 = v9_14.j;
                                            if (p30.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                                v11_33 = v13_24.getFloat(6, v11_33);
                                            }
                                            v9_14.j = v11_33;
                                            int v11_34 = v9_14.k;
                                            if (p30.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                                v11_34 = v13_24.getFloat(7, v11_34);
                                            }
                                            v9_14.k = v11_34;
                                            int v11_35 = v9_14.i;
                                            if (p30.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                                v11_35 = v13_24.getFloat(5, v11_35);
                                            }
                                            v9_14.i = v11_35;
                                            int v11_36 = v9_14.c;
                                            if (p30.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                                v11_36 = v13_24.getInt(13, v11_36);
                                            }
                                            v9_14.c = v11_36;
                                        }
                                        v13_24.recycle();
                                        v10_4.b.add(v9_14);
                                        if (v9_14.getPathName() != null) {
                                            v7_2.put(v9_14.getPathName(), v9_14);
                                        }
                                        v0_22.a = v0_22.a;
                                        v15 = 2;
                                        v19 = -1;
                                        v21_1 = 0;
                                    }
                                }
                            }
                            if (v21_1 != 0) {
                                throw new org.xmlpull.v1.XmlPullParserException("no path defined");
                            } else {
                                this.c = this.a(v6.c, v6.d);
                                return;
                            }
                        }
                    }
                }
            }
        } else {
            v0_32.inflate(p29, p30, p31, p32);
            return;
        }
    }

    public final void invalidateSelf()
    {
        android.graphics.drawable.Drawable v0 = this.a;
        if (v0 == null) {
            super.invalidateSelf();
            return;
        } else {
            v0.invalidateSelf();
            return;
        }
    }

    public final boolean isAutoMirrored()
    {
        boolean v0_0 = this.a;
        if (!v0_0) {
            return this.b.e;
        } else {
            return v0_0.isAutoMirrored();
        }
    }

    public final boolean isStateful()
    {
        boolean v0_0 = this.a;
        if (!v0_0) {
            if (!super.isStateful()) {
                boolean v0_10 = this.b;
                if (v0_10) {
                    boolean v0_11 = v0_10.b;
                    if (v0_11.n == null) {
                        v0_11.n = Boolean.valueOf(v0_11.g.a());
                    }
                    if (v0_11.n.booleanValue()) {
                        return 1;
                    } else {
                        boolean v0_4 = this.b.c;
                        if ((v0_4) && (v0_4.isStateful())) {
                            return 1;
                        }
                    }
                }
                return 0;
            }
            return 1;
        } else {
            return v0_0.isStateful();
        }
    }

    public final android.graphics.drawable.Drawable mutate()
    {
        int v0_0 = this.a;
        if (v0_0 == 0) {
            if ((!this.e) && (super.mutate() == this)) {
                boolean v1_1 = this.b;
                int v0_5 = new g2.o();
                v0_5.c = 0;
                v0_5.d = g2.q.p;
                if (v1_1) {
                    v0_5.a = v1_1.a;
                    android.graphics.PorterDuff$Mode v2_4 = new g2.n(v1_1.b);
                    v0_5.b = v2_4;
                    if (v1_1.b.e != null) {
                        v2_4.e = new android.graphics.Paint(v1_1.b.e);
                    }
                    if (v1_1.b.d != null) {
                        v0_5.b.d = new android.graphics.Paint(v1_1.b.d);
                    }
                    v0_5.c = v1_1.c;
                    v0_5.d = v1_1.d;
                    v0_5.e = v1_1.e;
                }
                this.b = v0_5;
                this.e = 1;
            }
            return this;
        } else {
            v0_0.mutate();
            return this;
        }
    }

    public final void onBoundsChange(android.graphics.Rect p2)
    {
        android.graphics.drawable.Drawable v0 = this.a;
        if (v0 != null) {
            v0.setBounds(p2);
        }
        return;
    }

    public final boolean onStateChange(int[] p6)
    {
        g2.o v0_0 = this.a;
        if (v0_0 == null) {
            int v1_1;
            g2.o v0_1 = this.b;
            int v1_2 = v0_1.c;
            if (v1_2 == 0) {
                v1_1 = 0;
            } else {
                int v3_7 = v0_1.d;
                if (v3_7 == 0) {
                } else {
                    this.c = this.a(v1_2, v3_7);
                    this.invalidateSelf();
                    v1_1 = 1;
                }
            }
            int v3_0 = v0_1.b;
            if (v3_0.n == null) {
                v3_0.n = Boolean.valueOf(v3_0.g.a());
            }
            if (v3_0.n.booleanValue()) {
                boolean v6_1 = v0_1.b.g.b(p6);
                v0_1.k = (v0_1.k | v6_1);
                if (v6_1) {
                    this.invalidateSelf();
                    return 1;
                }
            }
            return v1_1;
        } else {
            return v0_0.setState(p6);
        }
    }

    public final void scheduleSelf(Runnable p2, long p3)
    {
        android.graphics.drawable.Drawable v0 = this.a;
        if (v0 == null) {
            super.scheduleSelf(p2, p3);
            return;
        } else {
            v0.scheduleSelf(p2, p3);
            return;
        }
    }

    public final void setAlpha(int p2)
    {
        g2.n v0_0 = this.a;
        if (v0_0 == null) {
            if (this.b.b.getRootAlpha() != p2) {
                this.b.b.setRootAlpha(p2);
                this.invalidateSelf();
            }
            return;
        } else {
            v0_0.setAlpha(p2);
            return;
        }
    }

    public final void setAutoMirrored(boolean p2)
    {
        g2.o v0_0 = this.a;
        if (v0_0 == null) {
            this.b.e = p2;
            return;
        } else {
            v0_0.setAutoMirrored(p2);
            return;
        }
    }

    public final void setColorFilter(android.graphics.ColorFilter p2)
    {
        android.graphics.drawable.Drawable v0 = this.a;
        if (v0 == null) {
            this.d = p2;
            this.invalidateSelf();
            return;
        } else {
            v0.setColorFilter(p2);
            return;
        }
    }

    public final void setTint(int p2)
    {
        android.graphics.drawable.Drawable v0 = this.a;
        if (v0 == null) {
            this.setTintList(android.content.res.ColorStateList.valueOf(p2));
            return;
        } else {
            q4.b.Q(v0, p2);
            return;
        }
    }

    public final void setTintList(android.content.res.ColorStateList p3)
    {
        android.graphics.PorterDuff$Mode v0_0 = this.a;
        if (v0_0 == null) {
            android.graphics.PorterDuff$Mode v0_1 = this.b;
            if (v0_1.c != p3) {
                v0_1.c = p3;
                this.c = this.a(p3, v0_1.d);
                this.invalidateSelf();
            }
            return;
        } else {
            v0_0.setTintList(p3);
            return;
        }
    }

    public final void setTintMode(android.graphics.PorterDuff$Mode p3)
    {
        android.content.res.ColorStateList v0_0 = this.a;
        if (v0_0 == null) {
            android.content.res.ColorStateList v0_1 = this.b;
            if (v0_1.d != p3) {
                v0_1.d = p3;
                this.c = this.a(v0_1.c, p3);
                this.invalidateSelf();
            }
            return;
        } else {
            v0_0.setTintMode(p3);
            return;
        }
    }

    public final boolean setVisible(boolean p2, boolean p3)
    {
        android.graphics.drawable.Drawable v0 = this.a;
        if (v0 == null) {
            return super.setVisible(p2, p3);
        } else {
            return v0.setVisible(p2, p3);
        }
    }

    public final void unscheduleSelf(Runnable p2)
    {
        android.graphics.drawable.Drawable v0 = this.a;
        if (v0 == null) {
            super.unscheduleSelf(p2);
            return;
        } else {
            v0.unscheduleSelf(p2);
            return;
        }
    }
}
