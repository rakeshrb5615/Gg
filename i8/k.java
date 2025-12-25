package i8;
public class k {
    public static final synthetic java.util.concurrent.atomic.AtomicReferenceFieldUpdater a;
    private volatile synthetic Object _cur$volatile;

    static k()
    {
        i8.k.a = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(i8.k, Object, "_cur$volatile");
        return;
    }

    public k()
    {
        this._cur$volatile = new i8.m(8, 0);
        return;
    }

    public final boolean a(Runnable p5)
    {
        do {
            int v0_0 = i8.k.a;
            i8.m v1_1 = ((i8.m) v0_0.get(this));
            i8.m v2_1 = v1_1.a(p5);
            if (v2_1 == null) {
                return 1;
            } else {
                if (v2_1 == 1) {
                    i8.m v2_0 = v1_1.c();
                    while (!v0_0.compareAndSet(this, v1_1, v2_0)) {
                    }
                } else {
                    if (v2_1 != 2) {
                        break;
                    }
                    return 0;
                }
            }
        } while(v0_0.get(this) == v1_1);
    }

    public final void b()
    {
        do {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater v0 = i8.k.a;
            i8.m v1_1 = ((i8.m) v0.get(this));
            if (!v1_1.b()) {
                i8.m v2_1 = v1_1.c();
            } else {
                return;
            }
        } while(!v0.compareAndSet(this, v1_1, v2_1));
        if (v0.get(this) != v1_1) {
        }
    }

    public final int c()
    {
        int v0_7 = ((i8.m) i8.k.a.get(this));
        v0_7.getClass();
        int v0_8 = i8.m.f.get(v0_7);
        return ((((int) ((v0_8 & 1152921503533105152) >> 30)) - ((int) (1073741823 & v0_8))) & 1073741823);
    }

    public final Object d()
    {
        do {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater v0 = i8.k.a;
            i8.m v1_1 = ((i8.m) v0.get(this));
            i8.m v2_0 = v1_1.d();
            if (v2_0 == i8.m.g) {
                i8.m v2_1 = v1_1.c();
            } else {
                return v2_0;
            }
        } while(!v0.compareAndSet(this, v1_1, v2_1));
        if (v0.get(this) != v1_1) {
        }
    }
}
