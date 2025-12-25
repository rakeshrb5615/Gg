package i8;
public abstract class b {
    public static final synthetic java.util.concurrent.atomic.AtomicReferenceFieldUpdater a;
    public static final synthetic java.util.concurrent.atomic.AtomicReferenceFieldUpdater b;
    private volatile synthetic Object _next$volatile;
    private volatile synthetic Object _prev$volatile;

    static b()
    {
        i8.b.a = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(i8.b, Object, "_next$volatile");
        i8.b.b = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(i8.b, Object, "_prev$volatile");
        return;
    }

    public b(i8.r p1)
    {
        this._prev$volatile = p1;
        return;
    }

    public final void b()
    {
        i8.b.b.set(this, 0);
        return;
    }

    public final i8.b c()
    {
        i8.b v0_1 = i8.b.a.get(this);
        if (v0_1 != i8.a.a) {
            return ((i8.b) v0_1);
        } else {
            return 0;
        }
    }

    public abstract boolean d();

    public final void e()
    {
        if (this.c() == null) {
            return;
        }
        do {
            boolean v0_1 = i8.b.b;
            i8.b v1_2 = ((i8.b) v0_1.get(this));
            if ((v1_2 != null) && (v1_2.d())) {
                v1_2 = ((i8.b) v0_1.get(v1_2));
                while ((v1_2 == null) || (!v1_2.d())) {
                }
            }
            Object v2_0 = this.c();
            kotlin.jvm.internal.j.b(v2_0);
            while (v2_0.d()) {
                Object v3_1 = v2_0.c();
                if (v3_1 == null) {
                    break;
                }
                v2_0 = v3_1;
            }
        } while(v0_1.get(v2_0) == Object v3_2);
        do {
            i8.b v4_2;
            v3_2 = v0_1.get(v2_0);
            if (((i8.b) v3_2) != null) {
                v4_2 = v1_2;
            } else {
                v4_2 = 0;
            }
            while (!v0_1.compareAndSet(v2_0, v3_2, v4_2)) {
            }
            if (v1_2 != null) {
                i8.b.a.set(v1_2, v2_0);
            }
            if (((v2_0.d()) && (v2_0.c() != null)) || ((v1_2 != null) && (v1_2.d()))) {
            } else {
                return;
            }
        } while(v0_1.get(v2_0) == v3_2);
    }
}
