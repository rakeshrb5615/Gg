package q1;
public final class c extends androidx.lifecycle.d0 implements androidx.loader.content.d {
    public final androidx.loader.content.e l;
    public Object m;
    public q1.d n;

    public c(androidx.loader.content.e p2)
    {
        this.l = p2;
        p2.registerListener(0, this);
        return;
    }

    public final void e()
    {
        this.l.startLoading();
        return;
    }

    public final void f()
    {
        this.l.stopLoading();
        return;
    }

    public final void g(androidx.lifecycle.e0 p1)
    {
        super.g(p1);
        this.m = 0;
        this.n = 0;
        return;
    }

    public final void i()
    {
        Object v0 = this.m;
        q1.d v1 = this.n;
        if ((v0 != null) && (v1 != null)) {
            super.g(v1);
            this.d(v0, v1);
        }
        return;
    }

    public final String toString()
    {
        String v0_2 = new StringBuilder(64);
        v0_2.append("LoaderInfo{");
        v0_2.append(Integer.toHexString(System.identityHashCode(this)));
        v0_2.append(" #0 : ");
        p0.e.a(this.l, v0_2);
        v0_2.append("}}");
        return v0_2.toString();
    }
}
