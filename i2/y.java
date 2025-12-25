package i2;
public abstract class y {

    static y()
    {
        new java.util.HashMap();
        return;
    }

    public static void a(com.google.android.material.slider.Slider p2, android.view.MotionEvent p3, float p4, int p5)
    {
        if (p3 != 0) {
            float v3_7;
            float v4_9 = ((p2.getWidth() - p2.getPaddingLeft()) - p2.getPaddingRight());
            if (v4_9 > 0) {
                v3_7 = ((Math.min(Math.max(((p3.getX() - ((float) p2.getPaddingLeft())) / ((float) v4_9)), 0), 1065353216) * (p2.getValueTo() - p2.getValueFrom())) + p2.getValueFrom());
            } else {
                v3_7 = p2.getValue();
            }
            p4 = v3_7;
        }
        float v0_5 = new float[2];
        v0_5[0] = p2.getValue();
        v0_5[1] = p4;
        float v4_7 = android.animation.ValueAnimator.ofFloat(v0_5);
        v4_7.setDuration(((long) p5));
        v4_7.addUpdateListener(new i2.j(p2, 1));
        v4_7.start();
        return;
    }

    public static void b(android.view.View p4)
    {
        int v0_1;
        if (p4.getId() != 2131362369) {
            v0_1 = 1063675494;
        } else {
            v0_1 = 1064514355;
        }
        p4.postDelayed(new i2.r(p4, v0_1, 0), 0);
        return;
    }

    public static void c(com.google.android.material.slider.Slider p3)
    {
        i2.w v0_1 = new i2.w();
        v0_1.a = 0;
        v0_1.b = 0;
        p3.setOnTouchListener(new i2.u(v0_1, android.view.ViewConfiguration.get(p3.getContext()).getScaledTouchSlop(), p3));
        return;
    }

    public static void d(android.view.View p5)
    {
        if ((p5 != null) && (p5.getVisibility() == 0)) {
            int v0_0 = android.animation.ValueAnimator.ofInt(new int[] {p5.getHeight(), 0}));
            v0_0.addUpdateListener(new i2.s(p5, 0));
            v0_0.setDuration(((long) 250));
            v0_0.addListener(new i2.x(p5, 1));
            v0_0.start();
            p5.animate().alpha(0).setDuration(((long) 250)).start();
            return;
        } else {
            return;
        }
    }

    public static void e(android.view.View p3)
    {
        if ((p3 != null) && (p3.getVisibility() != 0)) {
            p3.setVisibility(0);
            p3.setAlpha(0);
            p3.measure(android.view.View$MeasureSpec.makeMeasureSpec(((android.view.View) p3.getParent()).getWidth(), -2147483648), 0);
            long v1_3 = p3.getMeasuredHeight();
            p3.getLayoutParams().height = 0;
            p3.requestLayout();
            p3.setTranslationY(((float) v1_3));
            int v0_2 = android.animation.ValueAnimator.ofInt(new int[] {0, v1_3}));
            v0_2.addUpdateListener(new i2.t(p3, v1_3));
            v0_2.setDuration(((long) 400));
            v0_2.start();
            p3.animate().alpha(1065353216).setDuration(((long) 400)).start();
            return;
        } else {
            return;
        }
    }

    public static void f(android.view.View p2)
    {
        p2.setAlpha(0);
        p2.setVisibility(0);
        p2.animate().alpha(1065353216).setDuration(((long) 400)).start();
        return;
    }

    public static void g(android.view.View p3, int p4)
    {
        p3.animate().alpha(0).setDuration(((long) p4)).withEndAction(new i2.v(p3, 1)).start();
        return;
    }

    public static void h(android.view.View p3, int p4, int p5)
    {
        if (p3.getVisibility() != 0) {
            p3.setAlpha(0);
            p3.setVisibility(0);
            p3.animate().alpha(1065353216).setDuration(((long) p4)).start();
            return;
        } else {
            p3.animate().alpha(0).setDuration(((long) p4)).withEndAction(new g0.k(p3, p5, 1)).start();
            return;
        }
    }

    public static void i(android.view.View p5, int p6)
    {
        if (p5.getVisibility() != 0) {
            p5.setVisibility(0);
            p5.setAlpha(0);
            p5.measure(android.view.View$MeasureSpec.makeMeasureSpec(((android.view.View) p5.getParent()).getWidth(), -2147483648), 0);
            android.animation.ValueAnimator v0_3 = p5.getMeasuredHeight();
            p5.getLayoutParams().height = 0;
            p5.requestLayout();
            android.animation.ValueAnimator v0_5 = android.animation.ValueAnimator.ofInt(new int[] {0, v0_3}));
            v0_5.addUpdateListener(new i2.s(p5, 2));
            v0_5.setDuration(((long) p6));
            v0_5.start();
            p5.animate().alpha(1065353216).setDuration(((long) p6)).start();
            return;
        } else {
            android.animation.ValueAnimator v0_8 = android.animation.ValueAnimator.ofInt(new int[] {p5.getHeight(), 0}));
            v0_8.addUpdateListener(new i2.s(p5, 1));
            v0_8.setDuration(((long) p6));
            v0_8.addListener(new i2.x(p5, 0));
            v0_8.start();
            p5.animate().alpha(0).setDuration(((long) p6)).start();
            return;
        }
    }
}
