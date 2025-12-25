package c;
public final class k implements c.j, android.view.ViewTreeObserver$OnDrawListener, java.lang.Runnable {
    public final long a;
    public Runnable b;
    public boolean c;
    public final synthetic c.n d;

    public k(c.n p5)
    {
        this.d = p5;
        this.a = (android.os.SystemClock.uptimeMillis() + ((long) 10000));
        return;
    }

    public final void a(android.view.View p2)
    {
        if (!this.c) {
            this.c = 1;
            p2.getViewTreeObserver().addOnDrawListener(this);
        }
        return;
    }

    public final void execute(Runnable p3)
    {
        kotlin.jvm.internal.j.e(p3, "runnable");
        this.b = p3;
        android.view.View v3_3 = this.d.getWindow().getDecorView();
        kotlin.jvm.internal.j.d(v3_3, "getDecorView(...)");
        if (!this.c) {
            v3_3.postOnAnimation(new androidx.lifecycle.g0(this, 1));
            return;
        } else {
            if (!kotlin.jvm.internal.j.a(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
                v3_3.postInvalidate();
                return;
            } else {
                v3_3.invalidate();
                return;
            }
        }
    }

    public final void onDraw()
    {
        android.view.View v0_0 = this.b;
        if (v0_0 == null) {
            if (android.os.SystemClock.uptimeMillis() > this.a) {
                this.c = 0;
                this.d.getWindow().getDecorView().post(this);
            }
        } else {
            v0_0.run();
            this.b = 0;
            try {
                if (this.d.getFullyDrawnReporter().b) {
                    this.c = 0;
                    this.d.getWindow().getDecorView().post(this);
                    return;
                }
            } catch (android.view.View v0_7) {
                throw v0_7;
            }
        }
        return;
    }

    public final void run()
    {
        this.d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        return;
    }
}
