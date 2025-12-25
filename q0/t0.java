package q0;
public final class t0 {
    public final ref.WeakReference a;

    public t0(android.view.View p2)
    {
        this.a = new ref.WeakReference(p2);
        return;
    }

    public final void a(float p2)
    {
        android.view.ViewPropertyAnimator v0_2 = ((android.view.View) this.a.get());
        if (v0_2 != null) {
            v0_2.animate().alpha(p2);
        }
        return;
    }

    public final void b()
    {
        android.view.ViewPropertyAnimator v0_2 = ((android.view.View) this.a.get());
        if (v0_2 != null) {
            v0_2.animate().cancel();
        }
        return;
    }

    public final void c(long p2)
    {
        android.view.ViewPropertyAnimator v0_2 = ((android.view.View) this.a.get());
        if (v0_2 != null) {
            v0_2.animate().setDuration(p2);
        }
        return;
    }

    public final void d(q0.u0 p4)
    {
        int v0_2 = ((android.view.View) this.a.get());
        if (v0_2 != 0) {
            if (p4 == null) {
                v0_2.animate().setListener(0);
            } else {
                v0_2.animate().setListener(new f2.o(p4, v0_2));
                return;
            }
        }
        return;
    }

    public final void e(float p2)
    {
        android.view.ViewPropertyAnimator v0_2 = ((android.view.View) this.a.get());
        if (v0_2 != null) {
            v0_2.animate().translationY(p2);
        }
        return;
    }
}
