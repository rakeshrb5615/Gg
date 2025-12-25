package d8;
public final class g0 extends d8.w0 implements java.lang.Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final d8.g0 p;
    public static final long q;

    static g0()
    {
        long v0_1 = new d8.g0();
        d8.g0.p = v0_1;
        v0_1.A(0);
        try {
            long v1_0 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000);
        } catch (SecurityException) {
            v1_0 = Long.valueOf(v1_0);
        }
        d8.g0.q = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(v1_0.longValue());
        return;
    }

    public final void D(long p1, d8.u0 p3)
    {
        throw new java.util.concurrent.RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final void E(Runnable p3)
    {
        if (d8.g0.debugStatus == 4) {
            throw new java.util.concurrent.RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        } else {
            super.E(p3);
            return;
        }
    }

    public final declared_synchronized void J()
    {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater v0_3;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater v0_0 = d8.g0.debugStatus;
        if ((v0_0 != 2) && (v0_0 != 3)) {
            v0_3 = 0;
        } else {
            v0_3 = 1;
        }
        if (v0_3 != null) {
            d8.g0.debugStatus = 3;
            d8.w0.m.set(this, 0);
            d8.w0.n.set(this, 0);
            this.notifyAll();
            return;
        } else {
            return;
        }
    }

    public final d8.p0 c(long p3, d8.b2 p5, l7.h p6)
    {
        long v0_0 = 0;
        if (p3 > 0) {
            if (p3 < 9223372036854) {
                v0_0 = (1000000 * p3);
            } else {
                v0_0 = 9223372036854775807;
            }
        }
        if (v0_0 >= 4611686018427387903) {
            return d8.t1.a;
        } else {
            d8.t1 v3_3 = System.nanoTime();
            d8.t0 v6_2 = new d8.t0((v0_0 + v3_3), p5);
            this.I(v3_3, v6_2);
            return v6_2;
        }
    }

    public final void run()
    {
        d8.z1.a.set(this);
        try {
        } catch (boolean v0_14) {
            d8.g0._thread = 0;
            this.J();
            if (!this.H()) {
                this.z();
            }
            throw v0_14;
        }
        boolean v0_1;
        boolean v0_8 = d8.g0.debugStatus;
        if ((v0_8 != 2) && (v0_8 != 3)) {
            v0_1 = 0;
        } else {
            v0_1 = 1;
        }
        if (!v0_1) {
            d8.g0.debugStatus = 1;
            this.notifyAll();
            long v9_0 = 9223372036854775807;
            while(true) {
                Thread.interrupted();
                long v11 = this.B();
                if (v11 != 9223372036854775807) {
                    v9_0 = 9223372036854775807;
                } else {
                    long v15_0 = System.nanoTime();
                    if (v9_0 == 9223372036854775807) {
                        v9_0 = (d8.g0.q + v15_0);
                    }
                    long v15_1 = (v9_0 - v15_0);
                    if (v15_1 <= 0) {
                        break;
                    }
                    if (v11 > v15_1) {
                        v11 = v15_1;
                    }
                }
                if (v11 > 0) {
                    boolean v0_10;
                    boolean v0_9 = d8.g0.debugStatus;
                    if ((v0_9 != 2) && (v0_9 != 3)) {
                        v0_10 = 0;
                    } else {
                        v0_10 = 1;
                    }
                    if (!v0_10) {
                        java.util.concurrent.locks.LockSupport.parkNanos(this, v11);
                    } else {
                        d8.g0._thread = 0;
                        this.J();
                        if (!this.H()) {
                            this.z();
                        }
                    }
                }
            }
            d8.g0._thread = 0;
            this.J();
            if (this.H()) {
                return;
            } else {
                this.z();
                return;
            }
        } else {
            d8.g0._thread = 0;
            this.J();
            if (!this.H()) {
                this.z();
                return;
            }
        }
        return;
    }

    public final void shutdown()
    {
        d8.g0.debugStatus = 4;
        super.shutdown();
        return;
    }

    public final String toString()
    {
        return "DefaultExecutor";
    }

    public final Thread z()
    {
        Thread v0_0 = d8.g0._thread;
        if (v0_0 != null) {
            return v0_0;
        } else {
            Thread v0_1 = d8.g0._thread;
            if (v0_1 == null) {
                v0_1 = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                d8.g0._thread = v0_1;
                v0_1.setContextClassLoader(d8.g0.p.getClass().getClassLoader());
                v0_1.setDaemon(1);
                v0_1.start();
            }
            return v0_1;
        }
    }
}
