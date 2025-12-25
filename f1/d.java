package f1;
public final class d {
    public static final ThreadLocal i;
    public final r.j a;
    public final java.util.ArrayList b;
    public final l6.c c;
    public final androidx.lifecycle.g0 d;
    public final k2.c e;
    public boolean f;
    public float g;
    public f1.b h;

    static d()
    {
        f1.d.i = new ThreadLocal();
        return;
    }

    public d(k2.c p4)
    {
        this.a = new r.j(0);
        this.b = new java.util.ArrayList();
        this.c = new l6.c(this, 16);
        this.d = new androidx.lifecycle.g0(this, 4);
        this.f = 0;
        this.g = 1065353216;
        this.e = p4;
        return;
    }

    public final void a(f1.g p5)
    {
        java.util.ArrayList v0 = this.b;
        if (v0.size() == 0) {
            ((android.view.Choreographer) this.e.b).postFrameCallback(new f1.c(this.d));
            if (android.os.Build$VERSION.SDK_INT >= 33) {
                this.g = android.animation.ValueAnimator.getDurationScale();
                if (this.h == null) {
                    this.h = new f1.b(this);
                }
                f1.b v1_6 = this.h;
                if (v1_6.a == null) {
                    f1.a v2_3 = new f1.a(v1_6);
                    v1_6.a = v2_3;
                    android.animation.ValueAnimator.registerDurationScaleChangeListener(v2_3);
                }
            }
        }
        if (!v0.contains(p5)) {
            v0.add(p5);
        }
        return;
    }
}
