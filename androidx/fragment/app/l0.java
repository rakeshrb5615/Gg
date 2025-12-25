package androidx.fragment.app;
public final class l0 extends android.view.animation.AnimationSet implements java.lang.Runnable {
    public final android.view.ViewGroup a;
    public final android.view.View b;
    public boolean c;
    public boolean d;
    public boolean e;

    public l0(android.view.animation.Animation p2, android.view.ViewGroup p3, android.view.View p4)
    {
        super(0);
        super.e = 1;
        super.a = p3;
        super.b = p4;
        super.addAnimation(p2);
        p3.post(super);
        return;
    }

    public final boolean getTransformation(long p3, android.view.animation.Transformation p5)
    {
        this.e = 1;
        if (!this.c) {
            if (!super.getTransformation(p3, p5)) {
                this.c = 1;
                q0.v.a(this.a, this);
            }
            return 1;
        } else {
            return (this.d ^ 1);
        }
    }

    public final boolean getTransformation(long p3, android.view.animation.Transformation p5, float p6)
    {
        this.e = 1;
        if (!this.c) {
            if (!super.getTransformation(p3, p5, p6)) {
                this.c = 1;
                q0.v.a(this.a, this);
            }
            return 1;
        } else {
            return (this.d ^ 1);
        }
    }

    public final void run()
    {
        android.view.ViewGroup v1 = this.a;
        if ((this.c) || (!this.e)) {
            v1.endViewTransition(this.b);
            this.d = 1;
            return;
        } else {
            this.e = 0;
            v1.post(this);
            return;
        }
    }
}
