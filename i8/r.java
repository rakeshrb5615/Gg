package i8;
public abstract class r extends i8.b implements d8.u1 {
    public static final synthetic java.util.concurrent.atomic.AtomicIntegerFieldUpdater d;
    public final long c;
    private volatile synthetic int cleanedAndPointers$volatile;

    static r()
    {
        i8.r.d = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(i8.r, "cleanedAndPointers$volatile");
        return;
    }

    public r(long p1, i8.r p3, int p4)
    {
        super(p3);
        super.c = p1;
        super.cleanedAndPointers$volatile = (p4 << 16);
        return;
    }

    public final boolean d()
    {
        if ((i8.r.d.get(this) == this.g()) && (this.c() != null)) {
            return 1;
        } else {
            return 0;
        }
    }

    public final boolean f()
    {
        if ((i8.r.d.addAndGet(this, -65536) == this.g()) && (this.c() != null)) {
            return 1;
        } else {
            return 0;
        }
    }

    public abstract int g();

    public abstract void h();

    public final void i()
    {
        if (i8.r.d.incrementAndGet(this) == this.g()) {
            this.e();
        }
        return;
    }

    public final boolean j()
    {
        do {
            int v0_0 = i8.r.d;
            int v1 = v0_0.get(this);
            if ((v1 == this.g()) && (this.c() != null)) {
                return 0;
            } else {
            }
        } while(!v0_0.compareAndSet(this, v1, (65536 + v1)));
        return 1;
    }
}
