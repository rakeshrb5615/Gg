package androidx.fragment.app;
public final class r1 implements android.transition.Transition$TransitionListener {
    public final synthetic androidx.fragment.app.d a;

    public r1(androidx.fragment.app.d p1)
    {
        this.a = p1;
        return;
    }

    public final void onTransitionCancel(android.transition.Transition p1)
    {
        return;
    }

    public final void onTransitionEnd(android.transition.Transition p1)
    {
        this.a.run();
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
        return;
    }
}
