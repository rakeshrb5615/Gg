package androidx.lifecycle;
public final class a0 extends androidx.lifecycle.b0 implements androidx.lifecycle.s {
    public final androidx.lifecycle.u e;
    public final synthetic androidx.lifecycle.c0 f;

    public a0(androidx.lifecycle.c0 p1, androidx.lifecycle.u p2, androidx.lifecycle.e0 p3)
    {
        this.f = p1;
        super(p1, p3);
        super.e = p2;
        return;
    }

    public final void b()
    {
        this.e.getLifecycle().b(this);
        return;
    }

    public final void c(androidx.lifecycle.u p3, androidx.lifecycle.n p4)
    {
        androidx.lifecycle.c0 v3_0 = this.e;
        androidx.lifecycle.o v4_0 = ((androidx.lifecycle.w) v3_0.getLifecycle()).c;
        if (v4_0 != androidx.lifecycle.o.a) {
            androidx.lifecycle.e0 v0_4 = 0;
            while (v0_4 != v4_0) {
                this.a(this.e());
                v0_4 = v4_0;
                v4_0 = ((androidx.lifecycle.w) v3_0.getLifecycle()).c;
            }
            return;
        } else {
            this.f.g(this.a);
            return;
        }
    }

    public final boolean d(androidx.lifecycle.u p2)
    {
        if (this.e != p2) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean e()
    {
        int v0_1;
        if (((androidx.lifecycle.w) this.e.getLifecycle()).c.compareTo(androidx.lifecycle.o.d) < 0) {
            v0_1 = 0;
        } else {
            v0_1 = 1;
        }
        return v0_1;
    }
}
