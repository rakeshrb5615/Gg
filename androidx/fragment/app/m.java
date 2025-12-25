package androidx.fragment.app;
public final class m implements android.view.animation.Animation$AnimationListener {
    public final synthetic androidx.fragment.app.y1 a;
    public final synthetic androidx.fragment.app.n b;
    public final synthetic android.view.View c;
    public final synthetic androidx.fragment.app.h d;

    public m(android.view.View p1, androidx.fragment.app.h p2, androidx.fragment.app.n p3, androidx.fragment.app.y1 p4)
    {
        this.a = p4;
        this.b = p3;
        this.c = p1;
        this.d = p2;
        return;
    }

    public final void onAnimationEnd(android.view.animation.Animation p6)
    {
        kotlin.jvm.internal.j.e(p6, "animation");
        String v6_5 = this.b;
        v6_5.a.post(new androidx.fragment.app.l(v6_5, this.c, this.d, 0));
        if (androidx.fragment.app.b1.H(2)) {
            String v6_4 = new StringBuilder("Animation from operation ");
            v6_4.append(this.a);
            v6_4.append(" has ended.");
            android.util.Log.v("FragmentManager", v6_4.toString());
        }
        return;
    }

    public final void onAnimationRepeat(android.view.animation.Animation p2)
    {
        kotlin.jvm.internal.j.e(p2, "animation");
        return;
    }

    public final void onAnimationStart(android.view.animation.Animation p2)
    {
        kotlin.jvm.internal.j.e(p2, "animation");
        if (androidx.fragment.app.b1.H(2)) {
            String v2_5 = new StringBuilder("Animation from operation ");
            v2_5.append(this.a);
            v2_5.append(" has reached onAnimationStart.");
            android.util.Log.v("FragmentManager", v2_5.toString());
        }
        return;
    }
}
