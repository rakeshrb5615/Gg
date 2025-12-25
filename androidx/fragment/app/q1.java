package androidx.fragment.app;
public final class q1 implements android.transition.Transition$TransitionListener {
    public final synthetic Object a;
    public final synthetic java.util.ArrayList b;
    public final synthetic Object c;
    public final synthetic java.util.ArrayList d;
    public final synthetic androidx.fragment.app.s1 e;

    public q1(androidx.fragment.app.s1 p1, Object p2, java.util.ArrayList p3, Object p4, java.util.ArrayList p5)
    {
        this.e = p1;
        this.a = p2;
        this.b = p3;
        this.c = p4;
        this.d = p5;
        return;
    }

    public final void onTransitionCancel(android.transition.Transition p1)
    {
        return;
    }

    public final void onTransitionEnd(android.transition.Transition p1)
    {
        p1.removeListener(this);
        return;
    }

    public final void onTransitionPause(android.transition.Transition p1)
    {
        return;
    }

    public final void onTransitionResume(android.transition.Transition p1)
    {
        return;
    }

    public final void onTransitionStart(android.transition.Transition p4)
    {
        androidx.fragment.app.s1 v0 = this.e;
        Object v1_0 = this.a;
        if (v1_0 != null) {
            v0.t(v1_0, this.b, 0);
        }
        Object v1_1 = this.c;
        if (v1_1 != null) {
            v0.t(v1_1, this.d, 0);
        }
        return;
    }
}
