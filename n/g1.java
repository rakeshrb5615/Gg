package n;
public final class g1 {
    public static final android.graphics.RectF l;
    public static final java.util.concurrent.ConcurrentHashMap m;
    public int a;
    public boolean b;
    public float c;
    public float d;
    public float e;
    public int[] f;
    public boolean g;
    public android.text.TextPaint h;
    public final android.widget.TextView i;
    public final android.content.Context j;
    public final n.d1 k;

    static g1()
    {
        n.g1.l = new android.graphics.RectF();
        n.g1.m = new java.util.concurrent.ConcurrentHashMap();
        return;
    }

    public g1(android.widget.TextView p3)
    {
        this.a = 0;
        this.b = 0;
        this.c = -1082130432;
        this.d = -1082130432;
        this.e = -1082130432;
        int[] v1_1 = new int[0];
        this.f = v1_1;
        this.g = 0;
        this.i = p3;
        this.j = p3.getContext();
        if (android.os.Build$VERSION.SDK_INT < 29) {
            this.k = new n.d1();
            return;
        } else {
            this.k = new n.e1();
            return;
        }
    }

    public static int[] b(int[] p6)
    {
        int[] v0_0 = p6.length;
        if (v0_0 != null) {
            java.util.Arrays.sort(p6);
            java.util.ArrayList v1_1 = new java.util.ArrayList();
            int v2 = 0;
            int v3_3 = 0;
            while (v3_3 < v0_0) {
                Integer v4_0 = p6[v3_3];
                if ((v4_0 > null) && (java.util.Collections.binarySearch(v1_1, Integer.valueOf(v4_0)) < 0)) {
                    v1_1.add(Integer.valueOf(v4_0));
                }
                v3_3++;
            }
            if (v0_0 != v1_1.size()) {
                int v6_1 = v1_1.size();
                int[] v0_1 = new int[v6_1];
                while (v2 < v6_1) {
                    v0_1[v2] = ((Integer) v1_1.get(v2)).intValue();
                    v2++;
                }
                return v0_1;
            }
        }
        return p6;
    }

    public static reflect.Method d(String p4)
    {
        try {
            Exception v1_0 = n.g1.m;
            String v2_4 = ((reflect.Method) v1_0.get(p4));
        } catch (Exception v1_1) {
            String v2_1 = new StringBuilder("Failed to retrieve TextView#");
            v2_1.append(p4);
            v2_1.append("() method");
            android.util.Log.w("ACTVAutoSizeHelper", v2_1.toString(), v1_1);
            return 0;
        }
        if (v2_4 == null) {
            v2_4 = android.widget.TextView.getDeclaredMethod(p4, 0);
            if (v2_4 != null) {
                v2_4.setAccessible(1);
                v1_0.put(p4, v2_4);
                return v2_4;
            }
        }
        return v2_4;
    }

    public static Object e(String p2, Object p3, Object p4)
    {
        try {
            String v2_3 = n.g1.d(p2).invoke(p3, 0);
            return v2_3;
        } catch (Exception v3_1) {
            String v0_1 = new StringBuilder("Failed to invoke TextView#");
            v0_1.append(v2_3);
            v0_1.append("() method");
            android.util.Log.w("ACTVAutoSizeHelper", v0_1.toString(), v3_1);
            return p4;
        } catch (String v2_4) {
            throw v2_4;
        }
    }

    public final void a()
    {
        if (this.f()) {
            if (this.b) {
                if ((this.i.getMeasuredHeight() > 0) && (this.i.getMeasuredWidth() > 0)) {
                    Throwable v0_7;
                    if (!this.k.b(this.i)) {
                        v0_7 = ((this.i.getMeasuredWidth() - this.i.getTotalPaddingLeft()) - this.i.getTotalPaddingRight());
                    } else {
                        v0_7 = 1048576;
                    }
                    int v1_8 = ((this.i.getHeight() - this.i.getCompoundPaddingBottom()) - this.i.getCompoundPaddingTop());
                    if ((v0_7 > null) && (v1_8 > 0)) {
                        android.graphics.RectF v2_4 = n.g1.l;
                        v2_4.setEmpty();
                        v2_4.right = ((float) v0_7);
                        v2_4.bottom = ((float) v1_8);
                        Throwable v0_13 = ((float) this.c(v2_4));
                        if (v0_13 != this.i.getTextSize()) {
                            this.g(0, v0_13);
                        }
                    } else {
                        return;
                    }
                }
            }
            this.b = 1;
            return;
        }
        return;
    }

    public final int c(android.graphics.RectF p19)
    {
        int v2_2 = this.f.length;
        if (v2_2 == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        } else {
            int v2_0 = (v2_2 - 1);
            int v5_0 = 0;
            int v4_1 = 1;
            while (v4_1 <= v2_0) {
                CharSequence v10;
                int v5_2 = ((v4_1 + v2_0) / 2);
                float v6_1 = this.f[v5_2];
                int v7_0 = this.i;
                int v8_0 = v7_0.getText();
                android.text.TextPaint v9_0 = v7_0.getTransformationMethod();
                if (v9_0 == null) {
                    v10 = v8_0;
                } else {
                    android.text.TextPaint v9_1 = v9_0.getTransformation(v8_0, v7_0);
                    if (v9_1 == null) {
                    } else {
                        v10 = v9_1;
                    }
                }
                int v13 = v7_0.getMaxLines();
                int v8_1 = this.h;
                if (v8_1 != 0) {
                    v8_1.reset();
                } else {
                    this.h = new android.text.TextPaint();
                }
                this.h.set(v7_0.getPaint());
                this.h.setTextSize(((float) v6_1));
                float v6_7 = n.c1.a(v10, ((android.text.Layout$Alignment) n.g1.e("getLayoutAlignment", v7_0, android.text.Layout$Alignment.ALIGN_NORMAL)), Math.round(p19.right), v13, this.i, this.h, this.k);
                if (((v13 == -1) || ((v6_7.getLineCount() <= v13) && (v6_7.getLineEnd((v6_7.getLineCount() - 1)) == v10.length()))) && (((float) v6_7.getHeight()) <= p19.bottom)) {
                    v5_0 = v4_1;
                    v4_1 = (v5_2 + 1);
                } else {
                    v5_0 = (v5_2 - 1);
                    v2_0 = v5_0;
                }
            }
            return this.f[v5_0];
        }
    }

    public final boolean f()
    {
        if ((!this.j()) || (this.a == 0)) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void g(int p4, float p5)
    {
        Exception v0_9;
        Exception v0_0 = this.j;
        if (v0_0 != null) {
            v0_9 = v0_0.getResources();
        } else {
            v0_9 = android.content.res.Resources.getSystem();
        }
        boolean v4_2 = android.util.TypedValue.applyDimension(p4, p5, v0_9.getDisplayMetrics());
        android.widget.TextView v5_1 = this.i;
        if (v4_2 != v5_1.getPaint().getTextSize()) {
            v5_1.getPaint().setTextSize(v4_2);
            boolean v4_1 = v5_1.isInLayout();
            if (v5_1.getLayout() != null) {
                this.b = 0;
                try {
                    Exception v0_8 = n.g1.d("nullLayouts");
                } catch (Exception v0_10) {
                    android.util.Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", v0_10);
                    if (v4_1) {
                        v5_1.forceLayout();
                    } else {
                        v5_1.requestLayout();
                    }
                    v5_1.invalidate();
                }
                if (v0_8 == null) {
                } else {
                    v0_8.invoke(v5_1, 0);
                }
            }
        }
        return;
    }

    public final boolean h()
    {
        int v1 = 0;
        if ((!this.j()) || (this.a != 1)) {
            this.b = 0;
        } else {
            if ((!this.g) || (this.f.length == 0)) {
                int[] v0_7 = (((int) Math.floor(((double) ((this.e - this.d) / this.c)))) + 1);
                int[] v3_4 = new int[v0_7];
                while (v1 < v0_7) {
                    v3_4[v1] = Math.round(((((float) v1) * this.c) + this.d));
                    v1++;
                }
                this.f = n.g1.b(v3_4);
            }
            this.b = 1;
        }
        return this.b;
    }

    public final boolean i()
    {
        int v4;
        int v0_0 = this.f;
        int v1_0 = v0_0.length;
        if (v1_0 <= 0) {
            v4 = 0;
        } else {
            v4 = 1;
        }
        this.g = v4;
        if (v4 != 0) {
            this.a = 1;
            this.d = ((float) v0_0[0]);
            this.e = ((float) v0_0[(v1_0 - 1)]);
            this.c = -1082130432;
        }
        return v4;
    }

    public final boolean j()
    {
        return ((this.i instanceof n.w) ^ 1);
    }

    public final void k(float p4, float p5, float p6)
    {
        if (p4 <= 0) {
            IllegalArgumentException v6_4 = new StringBuilder("Minimum auto-size text size (");
            v6_4.append(p4);
            v6_4.append("px) is less or equal to (0px)");
            throw new IllegalArgumentException(v6_4.toString());
        } else {
            if (p5 <= p4) {
                String v0_2 = new StringBuilder("Maximum auto-size text size (");
                v0_2.append(p5);
                v0_2.append("px) is less or equal to minimum auto-size text size (");
                v0_2.append(p4);
                v0_2.append("px)");
                throw new IllegalArgumentException(v0_2.toString());
            } else {
                if (p6 <= 0) {
                    String v5_4 = new StringBuilder("The auto-size step granularity (");
                    v5_4.append(p6);
                    v5_4.append("px) is less or equal to (0px)");
                    throw new IllegalArgumentException(v5_4.toString());
                } else {
                    this.a = 1;
                    this.d = p4;
                    this.e = p5;
                    this.c = p6;
                    this.g = 0;
                    return;
                }
            }
        }
    }
}
