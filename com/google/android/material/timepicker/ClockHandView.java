package com.google.android.material.timepicker;
 class ClockHandView extends android.view.View {
    public static final synthetic int t;
    public final android.animation.ValueAnimator a;
    public boolean b;
    public final java.util.ArrayList c;
    public final int d;
    public final float e;
    public final android.graphics.Paint f;
    public final android.graphics.RectF m;
    public final int n;
    public float o;
    public boolean p;
    public double q;
    public int r;
    public int s;

    public ClockHandView(android.content.Context p8, android.util.AttributeSet p9)
    {
        super(p8, p9, 2130969464);
        android.animation.ValueAnimator v1_1 = new android.animation.ValueAnimator();
        super.a = v1_1;
        super.c = new java.util.ArrayList();
        android.graphics.Paint v2_3 = new android.graphics.Paint();
        super.f = v2_3;
        super.m = new android.graphics.RectF();
        super.s = 1;
        android.content.res.TypedArray v9_1 = p8.obtainStyledAttributes(p9, c3.a.e, 2130969464, 2132018451);
        j5.t1.P(p8, 2130969523, 200);
        j5.t1.Q(p8, 2130969539, d3.a.b);
        super.r = v9_1.getDimensionPixelSize(1, 0);
        super.d = v9_1.getDimensionPixelSize(2, 0);
        float v5_2 = super.getResources();
        super.n = v5_2.getDimensionPixelSize(2131165986);
        super.e = ((float) v5_2.getDimensionPixelSize(2131165984));
        int v0_4 = v9_1.getColor(0, 0);
        v2_3.setAntiAlias(1);
        v2_3.setColor(v0_4);
        super.b(0);
        android.view.ViewConfiguration.get(p8).getScaledTouchSlop();
        super.setImportantForAccessibility(2);
        v9_1.recycle();
        v1_1.addUpdateListener(new com.google.android.material.timepicker.d(super));
        v1_1.addListener(new com.google.android.material.timepicker.e());
        return;
    }

    public final int a(int p2)
    {
        if (p2 != 2) {
            return this.r;
        } else {
            return Math.round((((float) this.r) * 1059648963));
        }
    }

    public final void b(float p2)
    {
        this.a.cancel();
        this.c(p2);
        return;
    }

    public final void c(float p7)
    {
        float v7_1 = (p7 % 1135869952);
        this.o = v7_1;
        this.q = Math.toRadians(((double) (v7_1 - 1119092736)));
        int v2_2 = ((float) this.a(this.s));
        com.google.android.material.timepicker.ClockFaceView v3_4 = ((((float) Math.cos(this.q)) * v2_2) + ((float) (this.getWidth() / 2)));
        int v2_4 = ((v2_2 * ((float) Math.sin(this.q))) + ((float) (this.getHeight() / 2)));
        java.util.ArrayList v0_6 = ((float) this.d);
        this.m.set((v3_4 - v0_6), (v2_4 - v0_6), (v3_4 + v0_6), (v2_4 + v0_6));
        java.util.ArrayList v0_9 = this.c;
        int v1_5 = v0_9.size();
        int v2_6 = 0;
        while (v2_6 < v1_5) {
            com.google.android.material.timepicker.ClockFaceView v3_6 = v0_9.get(v2_6);
            v2_6++;
            com.google.android.material.timepicker.ClockFaceView v3_8 = ((com.google.android.material.timepicker.ClockFaceView) ((com.google.android.material.timepicker.f) v3_6));
            if (Math.abs((v3_8.M - v7_1)) > 981668463) {
                v3_8.M = v7_1;
                v3_8.n();
            }
        }
        this.invalidate();
        return;
    }

    public final void onDraw(android.graphics.Canvas p14)
    {
        super.onDraw(p14);
        float v0_1 = (this.getHeight() / 2);
        int v1_3 = (this.getWidth() / 2);
        double v2_5 = this.a(this.s);
        float v4 = ((float) v1_3);
        android.graphics.Canvas v3_0 = ((float) v2_5);
        float v6_0 = ((((float) Math.cos(this.q)) * v3_0) + v4);
        float v5_5 = ((float) v0_1);
        android.graphics.Canvas v3_2 = ((v3_0 * ((float) Math.sin(this.q))) + v5_5);
        android.graphics.Paint v8 = this.f;
        v8.setStrokeWidth(0);
        float v7_4 = this.d;
        p14.drawCircle(v6_0, v3_2, ((float) v7_4), v8);
        double v2_2 = ((double) ((float) (v2_5 - v7_4)));
        float v6_2 = ((float) (v1_3 + ((int) (Math.cos(this.q) * v2_2))));
        float v7_5 = ((float) (v0_1 + ((int) (v2_2 * Math.sin(this.q)))));
        v8.setStrokeWidth(((float) this.n));
        p14.drawLine(v4, v5_5, v6_2, v7_5, v8);
        p14.drawCircle(v4, v5_5, this.e, v8);
        return;
    }

    public final void onLayout(boolean p1, int p2, int p3, int p4, int p5)
    {
        this = super.onLayout(p1, p2, p3, p4, p5);
        if (!this.a.isRunning()) {
            this.b(this.o);
        }
        return;
    }

    public final boolean onTouchEvent(android.view.MotionEvent p10)
    {
        int v5_0;
        int v0_1;
        int v0_0 = p10.getActionMasked();
        float v1_0 = p10.getX();
        int v10_1 = p10.getY();
        int v4 = 0;
        if (v0_0 == 0) {
            this.p = 0;
            v5_0 = 1;
            v0_1 = 0;
        } else {
            if ((v0_0 == 1) || (v0_0 == 2)) {
                v0_1 = this.p;
                if (this.b) {
                    int v5_10;
                    if (((float) Math.hypot(((double) (v1_0 - ((float) (this.getWidth() / 2)))), ((double) (v10_1 - ((float) (this.getHeight() / 2)))))) > (((float) this.a(2)) + android.util.TypedValue.applyDimension(1, ((float) 12), this.getContext().getResources().getDisplayMetrics()))) {
                        v5_10 = 1;
                    } else {
                        v5_10 = 2;
                    }
                    this.s = v5_10;
                }
                v5_0 = 0;
            } else {
                v0_1 = 0;
                v5_0 = 0;
            }
        }
        float v6_7 = this.p;
        int v10_3 = ((int) Math.toDegrees(Math.atan2(((double) (v10_1 - ((float) (this.getHeight() / 2)))), ((double) (v1_0 - ((float) (this.getWidth() / 2)))))));
        float v1_5 = (v10_3 + 90);
        if (v1_5 < 0) {
            v1_5 = (v10_3 + 450);
        }
        int v10_6;
        float v1_6 = ((float) v1_5);
        if (this.o == v1_6) {
            v10_6 = 0;
        } else {
            v10_6 = 1;
        }
        if ((v5_0 == 0) || (v10_6 == 0)) {
            if ((v10_6 != 0) || (v0_1 != 0)) {
                this.b(v1_6);
                v4 = 1;
            }
        }
        this.p = (v6_7 | v4);
        return 1;
    }
}
