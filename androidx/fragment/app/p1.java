package androidx.fragment.app;
public final class p1 implements android.transition.Transition$TransitionListener {
    public final synthetic android.view.View a;
    public final synthetic java.util.ArrayList b;

    public p1(android.view.View p1, java.util.ArrayList p2)
    {
        this.a = p1;
        this.b = p2;
        return;
    }

    public final void onTransitionCancel(android.transition.Transition p1)
    {
        return;
    }

    public final void onTransitionEnd(android.transition.Transition p5)
    {
        p5.removeListener(this);
        this.a.setVisibility(8);
        java.util.ArrayList v5_2 = this.b;
        int v0_1 = v5_2.size();
        int v2 = 0;
        while (v2 < v0_1) {
            ((android.view.View) v5_2.get(v2)).setVisibility(0);
            v2++;
        }
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

    public final void onTransitionStart(android.transition.Transition p1)
    {
        p1.removeListener(this);
        p1.addListener(this);
        return;
    }
}
