package q0;
public final class v implements android.view.ViewTreeObserver$OnPreDrawListener, android.view.View$OnAttachStateChangeListener {
    public final android.view.View a;
    public android.view.ViewTreeObserver b;
    public final Runnable c;

    public v(android.view.View p1, Runnable p2)
    {
        this.a = p1;
        this.b = p1.getViewTreeObserver();
        this.c = p2;
        return;
    }

    public static void a(android.view.View p1, Runnable p2)
    {
        if (p1 == null) {
            throw new NullPointerException("view == null");
        } else {
            q0.v v0_1 = new q0.v(p1, p2);
            p1.getViewTreeObserver().addOnPreDrawListener(v0_1);
            p1.addOnAttachStateChangeListener(v0_1);
            return;
        }
    }

    public final boolean onPreDraw()
    {
        android.view.View v1 = this.a;
        if (!this.b.isAlive()) {
            v1.getViewTreeObserver().removeOnPreDrawListener(this);
        } else {
            this.b.removeOnPreDrawListener(this);
        }
        v1.removeOnAttachStateChangeListener(this);
        this.c.run();
        return 1;
    }

    public final void onViewAttachedToWindow(android.view.View p1)
    {
        this.b = p1.getViewTreeObserver();
        return;
    }

    public final void onViewDetachedFromWindow(android.view.View p2)
    {
        android.view.View v0 = this.a;
        if (!this.b.isAlive()) {
            v0.getViewTreeObserver().removeOnPreDrawListener(this);
        } else {
            this.b.removeOnPreDrawListener(this);
        }
        v0.removeOnAttachStateChangeListener(this);
        return;
    }
}
