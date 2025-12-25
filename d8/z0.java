package d8;
public final class z0 extends d8.y0 implements d8.k0 {
    public final java.util.concurrent.Executor c;

    public z0(java.util.concurrent.Executor p2)
    {
        this.c = p2;
        if ((p2 instanceof java.util.concurrent.ScheduledThreadPoolExecutor)) {
            ((java.util.concurrent.ScheduledThreadPoolExecutor) p2).setRemoveOnCancelPolicy(1);
        }
        return;
    }

    public final d8.p0 c(long p5, d8.b2 p7, l7.h p8)
    {
        d8.g0 v0_6;
        d8.g0 v0_0 = this.c;
        java.util.concurrent.ScheduledFuture v2 = 0;
        if (!(v0_0 instanceof java.util.concurrent.ScheduledExecutorService)) {
            v0_6 = 0;
        } else {
            v0_6 = ((java.util.concurrent.ScheduledExecutorService) v0_0);
        }
        if (v0_6 != null) {
            try {
                v2 = v0_6.schedule(p7, p5, java.util.concurrent.TimeUnit.MILLISECONDS);
            } catch (d8.g0 v0_1) {
                java.util.concurrent.CancellationException v1_2 = new java.util.concurrent.CancellationException("The task was rejected");
                v1_2.initCause(v0_1);
                d8.g0 v0_4 = ((d8.e1) p8.get(d8.b0.b));
                if (v0_4 != null) {
                    v0_4.cancel(v1_2);
                }
            }
        }
        if (v2 == null) {
            return d8.g0.p.c(p5, p7, p8);
        } else {
            return new d8.o0(v2);
        }
    }

    public final void close()
    {
        int v0_1;
        int v0_0 = this.c;
        if (!(v0_0 instanceof java.util.concurrent.ExecutorService)) {
            v0_1 = 0;
        } else {
            v0_1 = ((java.util.concurrent.ExecutorService) v0_0);
        }
        if (v0_1 != 0) {
            v0_1.shutdown();
        }
        return;
    }

    public final boolean equals(Object p2)
    {
        if ((!(p2 instanceof d8.z0)) || (((d8.z0) p2).c != this.c)) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void f(long p6, d8.n p8)
    {
        d8.e1 v0_6;
        d8.e1 v0_0 = this.c;
        java.util.concurrent.ScheduledFuture v2 = 0;
        if (!(v0_0 instanceof java.util.concurrent.ScheduledExecutorService)) {
            v0_6 = 0;
        } else {
            v0_6 = ((java.util.concurrent.ScheduledExecutorService) v0_0);
        }
        if (v0_6 != null) {
            l7.h v3_0 = p8.e;
            try {
                v2 = v0_6.schedule(new b5.l(4, this, p8), p6, java.util.concurrent.TimeUnit.MILLISECONDS);
            } catch (d8.e1 v0_1) {
                java.util.concurrent.CancellationException v1_2 = new java.util.concurrent.CancellationException("The task was rejected");
                v1_2.initCause(v0_1);
                d8.e1 v0_4 = ((d8.e1) v3_0.get(d8.b0.b));
                if (v0_4 != null) {
                    v0_4.cancel(v1_2);
                }
            }
        }
        if (v2 == null) {
            d8.g0.p.f(p6, p8);
            return;
        } else {
            p8.u(new d8.j(v2, 0));
            return;
        }
    }

    public final int hashCode()
    {
        return System.identityHashCode(this.c);
    }

    public final void i(l7.h p4, Runnable p5)
    {
        try {
            this.c.execute(p5);
            return;
        } catch (k8.d v0_4) {
            java.util.concurrent.CancellationException v1_1 = new java.util.concurrent.CancellationException("The task was rejected");
            v1_1.initCause(v0_4);
            k8.d v0_2 = ((d8.e1) p4.get(d8.b0.b));
            if (v0_2 != null) {
                v0_2.cancel(v1_1);
            }
            k8.d.c.i(p4, p5);
            return;
        }
    }

    public final String toString()
    {
        return this.c.toString();
    }
}
