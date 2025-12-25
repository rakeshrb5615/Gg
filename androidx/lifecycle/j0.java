package androidx.lifecycle;
public final class j0 implements androidx.lifecycle.u {
    public static final androidx.lifecycle.j0 o;
    public int a;
    public int b;
    public boolean c;
    public boolean d;
    public android.os.Handler e;
    public final androidx.lifecycle.w f;
    public final androidx.lifecycle.g0 m;
    public final androidx.lifecycle.z0 n;

    static j0()
    {
        androidx.lifecycle.j0.o = new androidx.lifecycle.j0();
        return;
    }

    public j0()
    {
        this.c = 1;
        this.d = 1;
        this.f = new androidx.lifecycle.w(this);
        this.m = new androidx.lifecycle.g0(this, 0);
        this.n = new androidx.lifecycle.z0(this);
        return;
    }

    public final void a()
    {
        android.os.Handler v0_3 = (this.b + 1);
        this.b = v0_3;
        if (v0_3 == 1) {
            if (!this.c) {
                android.os.Handler v0_5 = this.e;
                kotlin.jvm.internal.j.b(v0_5);
                v0_5.removeCallbacks(this.m);
            } else {
                this.f.e(androidx.lifecycle.n.ON_RESUME);
                this.c = 0;
                return;
            }
        }
        return;
    }

    public final androidx.lifecycle.p getLifecycle()
    {
        return this.f;
    }
}
