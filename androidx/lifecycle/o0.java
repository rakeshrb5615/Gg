package androidx.lifecycle;
public final class o0 implements androidx.lifecycle.s, java.lang.AutoCloseable {
    public final String a;
    public final androidx.lifecycle.n0 b;
    public boolean c;

    public o0(String p1, androidx.lifecycle.n0 p2)
    {
        this.a = p1;
        this.b = p2;
        return;
    }

    public final void c(androidx.lifecycle.u p2, androidx.lifecycle.n p3)
    {
        if (p3 == androidx.lifecycle.n.ON_DESTROY) {
            this.c = 0;
            p2.getLifecycle().b(this);
        }
        return;
    }

    public final void close()
    {
        return;
    }

    public final void f(b2.e p2, androidx.lifecycle.p p3)
    {
        kotlin.jvm.internal.j.e(p2, "registry");
        kotlin.jvm.internal.j.e(p3, "lifecycle");
        if (this.c) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        } else {
            this.c = 1;
            p3.a(this);
            p2.c(this.a, ((c.f) this.b.a.f));
            return;
        }
    }
}
