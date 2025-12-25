package x8;
public class d extends x8.j0 {
    public static final h.f h;
    public static x8.d i;
    public static final java.util.concurrent.locks.ReentrantLock j;
    public static final java.util.concurrent.locks.Condition k;
    public static final long l;
    public static final long m;
    public int e;
    public int f;
    public long g;

    static d()
    {
        long v0_5 = new h.f(7, 0);
        long v1_4 = new x8.d[8];
        v0_5.c = v1_4;
        x8.d.h = v0_5;
        long v0_7 = new java.util.concurrent.locks.ReentrantLock();
        x8.d.j = v0_7;
        long v0_1 = v0_7.newCondition();
        kotlin.jvm.internal.j.d(v0_1, "newCondition(...)");
        x8.d.k = v0_1;
        long v0_3 = java.util.concurrent.TimeUnit.SECONDS.toMillis(60);
        x8.d.l = v0_3;
        x8.d.m = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(v0_3);
        return;
    }

    public d()
    {
        this.f = -1;
        return;
    }

    public final void h()
    {
        if ((this.c != 0) || (this.a)) {
            java.util.concurrent.locks.ReentrantLock v0_2 = x8.d.j;
            v0_2.lock();
            try {
                if (this.e != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                } else {
                    this.e = 1;
                    c5.c.e(this);
                    v0_2.unlock();
                    return;
                }
            } catch (String v1_1) {
                v0_2.unlock();
                throw v1_1;
            }
        } else {
            return;
        }
    }

    public final boolean i()
    {
        java.util.concurrent.locks.ReentrantLock v0 = x8.d.j;
        v0.lock();
        try {
            h.f v1_1 = this.e;
            int v2 = 0;
            this.e = 0;
        } catch (h.f v1_2) {
            v0.unlock();
            throw v1_2;
        }
        if (v1_1 != 1) {
            if (v1_1 == 2) {
                v2 = 1;
            }
            v0.unlock();
            return v2;
        } else {
            x8.d.h.g(this);
            v0.unlock();
            return 0;
        }
    }

    public java.io.IOException j(java.io.IOException p1)
    {
        throw 0;
    }

    public void k()
    {
        return;
    }
}
