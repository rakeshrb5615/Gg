package n7;
public abstract class c extends n7.a {
    private final l7.h _context;
    private transient l7.c intercepted;

    public c(l7.c p2)
    {
        int v0;
        if (p2 == null) {
            v0 = 0;
        } else {
            v0 = p2.getContext();
        }
        this(p2, v0);
        return;
    }

    public c(l7.c p1, l7.h p2)
    {
        super(p1);
        super._context = p2;
        return;
    }

    public l7.h getContext()
    {
        l7.h v0 = this._context;
        kotlin.jvm.internal.j.b(v0);
        return v0;
    }

    public final l7.c intercepted()
    {
        d8.a0 v0_0 = this.intercepted;
        if (v0_0 != null) {
            return v0_0;
        } else {
            n7.c v1_0;
            d8.a0 v0_4 = ((l7.e) this.getContext().get(l7.d.a));
            if (v0_4 == null) {
                v1_0 = this;
            } else {
                v1_0 = new i8.f(((d8.a0) v0_4), this);
            }
            this.intercepted = v1_0;
            return v1_0;
        }
    }

    public void releaseIntercepted()
    {
        int v0_0 = this.intercepted;
        if ((v0_0 != 0) && (v0_0 != this)) {
            kotlin.jvm.internal.j.b(this.getContext().get(l7.d.a));
            int v0_1 = ((i8.f) v0_0);
            boolean v1_0 = i8.f.n;
            while (v1_0.get(v0_1) == i8.a.c) {
            }
            int v0_3;
            int v0_2 = v1_0.get(v0_1);
            if (!(v0_2 instanceof d8.n)) {
                v0_3 = 0;
            } else {
                v0_3 = ((d8.n) v0_2);
            }
            if (v0_3 != 0) {
                v0_3.n();
            }
        }
        this.intercepted = n7.b.a;
        return;
    }
}
