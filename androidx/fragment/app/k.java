package androidx.fragment.app;
public final class k extends android.animation.AnimatorListenerAdapter {
    public final synthetic androidx.fragment.app.n a;
    public final synthetic android.view.View b;
    public final synthetic boolean c;
    public final synthetic androidx.fragment.app.y1 d;
    public final synthetic androidx.fragment.app.h e;

    public k(androidx.fragment.app.n p1, android.view.View p2, boolean p3, androidx.fragment.app.y1 p4, androidx.fragment.app.h p5)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        this.e = p5;
        return;
    }

    public final void onAnimationEnd(android.animation.Animator p4)
    {
        kotlin.jvm.internal.j.e(p4, "anim");
        String v0_4 = this.b;
        this.a.a.endViewTransition(v0_4);
        androidx.fragment.app.y1 v1 = this.d;
        if (this.c) {
            String v4_10 = v1.a;
            kotlin.jvm.internal.j.d(v0_4, "viewToAnimate");
            v1.a.a(v0_4, v4_10);
        }
        this.e.a();
        if (androidx.fragment.app.b1.H(2)) {
            String v4_6 = new StringBuilder("Animator from operation ");
            v4_6.append(v1);
            v4_6.append(" has ended.");
            android.util.Log.v("FragmentManager", v4_6.toString());
        }
        return;
    }
}
