package q0;
public final class v0 implements android.animation.ValueAnimator$AnimatorUpdateListener {
    public final synthetic q0.c1 a;
    public final synthetic q0.s1 b;
    public final synthetic q0.s1 c;
    public final synthetic int d;
    public final synthetic android.view.View e;

    public v0(q0.c1 p1, q0.s1 p2, q0.s1 p3, int p4, android.view.View p5)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        this.e = p5;
        return;
    }

    public final void onAnimationUpdate(android.animation.ValueAnimator p15)
    {
        q0.d1 v3_2;
        java.util.List v0_0 = this.a;
        android.view.View v1_0 = v0_0.a;
        v1_0.d(p15.getAnimatedFraction());
        int v15_4 = this.b;
        q0.p1 v2 = v15_4.a;
        android.view.View v1_2 = v1_0.b();
        q0.d1 v3_0 = android.os.Build$VERSION.SDK_INT;
        if (v3_0 < 34) {
            if (v3_0 < 30) {
                if (v3_0 < 29) {
                    v3_2 = new q0.d1(v15_4);
                } else {
                    v3_2 = new q0.f1(v15_4);
                }
            } else {
                v3_2 = new q0.g1(v15_4);
            }
        } else {
            v3_2 = new q0.h1(v15_4);
        }
        int v15_2 = 1;
        while (v15_2 <= 512) {
            if ((this.d & v15_2) != 0) {
                h0.b v4_6 = v2.f(v15_2);
                int v5_2 = this.c.a.f(v15_2);
                float v7_2 = (1065353216 - v1_2);
                v3_2.c(v15_2, q0.s1.e(v4_6, ((int) (((double) (((float) (v4_6.a - v5_2.a)) * v7_2)) + 4602678819172646912)), ((int) (((double) (((float) (v4_6.b - v5_2.b)) * v7_2)) + 4602678819172646912)), ((int) (((double) (((float) (v4_6.c - v5_2.c)) * v7_2)) + 4602678819172646912)), ((int) (((double) (((float) (v4_6.d - v5_2.d)) * v7_2)) + 4602678819172646912))));
            } else {
                v3_2.c(v15_2, v2.f(v15_2));
            }
            v15_2 <<= 1;
        }
        q0.x0.g(this.e, v3_2.b(), java.util.Collections.singletonList(v0_0));
        return;
    }
}
