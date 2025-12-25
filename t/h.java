package t;
public abstract class h implements p4.b {
    public static final boolean d;
    public static final java.util.logging.Logger e;
    public static final q4.b f;
    public static final Object m;
    public volatile Object a;
    public volatile t.d b;
    public volatile t.g c;

    static h()
    {
        t.h.d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        t.h.e = java.util.logging.Logger.getLogger(t.h.getName());
        try {
            t.f v5_1 = new t.e(java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(t.g, Thread, "a"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(t.g, t.g, "b"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(t.h, t.g, "c"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(t.h, t.d, "b"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(t.h, Object, "a"));
            Object v0_2 = 0;
        } catch (Object v0_2) {
            v5_1 = new t.f(27);
        }
        t.h.f = v5_1;
        if (v0_2 != null) {
            t.h.e.log(java.util.logging.Level.SEVERE, "SafeAtomicHelper is broken!", v0_2);
        }
        t.h.m = new Object();
        return;
    }

    public static void d(t.h p4)
    {
        do {
            t.d v0_0 = p4.c;
        } while(!t.h.f.d(p4, v0_0, t.g.c));
    }

    public static void e(Runnable p4, java.util.concurrent.Executor p5)
    {
        try {
            p5.execute(p4);
            return;
        } catch (RuntimeException v0) {
            StringBuilder v2_1 = new StringBuilder("RuntimeException while executing runnable ");
            v2_1.append(p4);
            v2_1.append(" with executor ");
            v2_1.append(p5);
            t.h.e.log(java.util.logging.Level.SEVERE, v2_1.toString(), v0);
            return;
        }
    }

    public static Object f(Object p2)
    {
        if ((p2 instanceof t.a)) {
            int v2_4 = ((t.a) p2).b;
            java.util.concurrent.ExecutionException v0_5 = new java.util.concurrent.CancellationException("Task was cancelled.");
            v0_5.initCause(v2_4);
            throw v0_5;
        } else {
            if ((p2 instanceof t.c)) {
                throw new java.util.concurrent.ExecutionException(((t.c) p2).a);
            } else {
                if (p2 == t.h.m) {
                    p2 = 0;
                }
                return p2;
            }
        }
    }

    public static Object g(t.h p1)
    {
        Thread v0_0 = 0;
        try {
            while(true) {
                p1 = p1.get();
                v0_0 = 1;
            }
        } catch (InterruptedException) {
        } catch (Throwable v1_1) {
            if (v0_0 != null) {
                Thread.currentThread().interrupt();
            }
            throw v1_1;
        }
        if (v0_0 != null) {
            Thread.currentThread().interrupt();
        }
        return p1;
    }

    public final void a(b5.l p5, java.util.concurrent.Executor p6)
    {
        t.d v0_0 = this.b;
        t.d v1 = t.d.d;
        if (v0_0 != v1) {
            t.d v2_1 = new t.d(p5, p6);
            do {
                v2_1.c = v0_0;
                if (!t.h.f.b(this, v0_0, v2_1)) {
                    v0_0 = this.b;
                } else {
                    return;
                }
            } while(v0_0 != v1);
        }
        t.h.e(p5, p6);
        return;
    }

    public final void b(StringBuilder p4)
    {
        try {
            String v1_4;
            String v1_2 = t.h.g(this);
            p4.append("SUCCESS, result=[");
        } catch (String v1_1) {
            p4.append("FAILURE, cause=[");
            p4.append(v1_1.getCause());
            p4.append("]");
            return;
        } catch (java.util.concurrent.ExecutionException) {
            p4.append("CANCELLED");
            return;
        } catch (String v0_4) {
            p4.append("UNKNOWN, cause=[");
            p4.append(v0_4.getClass());
            p4.append(" thrown from get()]");
            return;
        }
        if (v1_2 != this) {
            v1_4 = String.valueOf(v1_2);
        } else {
            v1_4 = "this future";
        }
        p4.append(v1_4);
        p4.append("]");
        return;
    }

    public void c()
    {
        return;
    }

    public final boolean cancel(boolean p7)
    {
        t.a v3_2;
        Object v0 = this.a;
        if (v0 != null) {
            v3_2 = 0;
        } else {
            v3_2 = 1;
        }
        if (v3_2 != null) {
            t.a v3_0;
            if (!t.h.d) {
                if (!p7) {
                    v3_0 = t.a.d;
                } else {
                    v3_0 = t.a.c;
                }
            } else {
                v3_0 = new t.a(p7, new java.util.concurrent.CancellationException("Future.cancel() was called."));
            }
            if (t.h.f.c(this, v0, v3_0)) {
                t.h.d(this);
                return 1;
            }
        }
        return 0;
    }

    public final Object get()
    {
        Object v0_0 = t.g.c;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        } else {
            t.g v1_3 = this.a;
            if (v1_3 == null) {
                t.g v1_1 = this.c;
                if (v1_1 != v0_0) {
                    t.g v2_1 = new t.g();
                    do {
                        q4.b v3 = t.h.f;
                        v3.M(v2_1, v1_1);
                        if (!v3.d(this, v1_1, v2_1)) {
                            v1_1 = this.c;
                        }
                        do {
                            java.util.concurrent.locks.LockSupport.park(this);
                            if (Thread.interrupted()) {
                                this.i(v2_1);
                                throw new InterruptedException();
                            } else {
                                Object v0_6 = this.a;
                            }
                        } while(v0_6 == null);
                        return t.h.f(v0_6);
                    } while(v1_1 != v0_0);
                }
                return t.h.f(this.a);
            } else {
                return t.h.f(v1_3);
            }
        }
    }

    public final Object get(long p18, java.util.concurrent.TimeUnit p20)
    {
        long v4_3 = t.g.c;
        long v5_0 = p20.toNanos(p18);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        } else {
            int v7_0 = this.a;
            if (v7_0 == 0) {
                String v9_1;
                if (v5_0 <= 0) {
                    v9_1 = 0;
                } else {
                    v9_1 = (System.nanoTime() + v5_0);
                }
                if (v5_0 >= 1000) {
                    t.g v13_1 = this.c;
                    if (v13_1 != v4_3) {
                        String v14_1 = new t.g();
                        do {
                            long v15_0 = t.h.f;
                            v15_0.M(v14_1, v13_1);
                            if (!v15_0.d(this, v13_1, v14_1)) {
                                v13_1 = this.c;
                            }
                            do {
                                java.util.concurrent.locks.LockSupport.parkNanos(this, v5_0);
                                if (Thread.interrupted()) {
                                    this.i(v14_1);
                                    throw new InterruptedException();
                                } else {
                                    long v4_5 = this.a;
                                    if (v4_5 == 0) {
                                        v5_0 = (v9_1 - System.nanoTime());
                                    } else {
                                        return t.h.f(v4_5);
                                    }
                                }
                                while (v5_0 > 0) {
                                    long v4_0 = this.a;
                                    if (v4_0 == 0) {
                                        if (Thread.interrupted()) {
                                            throw new InterruptedException();
                                        } else {
                                            v5_0 = (v9_1 - System.nanoTime());
                                        }
                                    } else {
                                        return t.h.f(v4_0);
                                    }
                                }
                                long v4_9 = this.toString();
                                java.util.concurrent.TimeUnit v10_0 = java.util.Locale.ROOT;
                                String v9_4 = p20.toString().toLowerCase(v10_0);
                                t.g v13_4 = new StringBuilder("Waited ");
                                v13_4.append(p18);
                                v13_4.append(" ");
                                v13_4.append(p20.toString().toLowerCase(v10_0));
                                String v2_3 = v13_4.toString();
                                if ((v5_0 + 1000) < 0) {
                                    int v7_4;
                                    String v2_1 = g2.g.d(v2_3, " (plus ");
                                    long v5_1 = (- v5_0);
                                    t.g v13_6 = p20.convert(v5_1, java.util.concurrent.TimeUnit.NANOSECONDS);
                                    long v5_2 = (v5_1 - p20.toNanos(v13_6));
                                    String v3_4 = v13_6 cmp 0;
                                    if ((v3_4 != null) && (v5_2 <= 1000)) {
                                        v7_4 = 0;
                                    } else {
                                        v7_4 = 1;
                                    }
                                    if (v3_4 > null) {
                                        String v3_6 = new StringBuilder();
                                        v3_6.append(v2_1);
                                        v3_6.append(v13_6);
                                        v3_6.append(" ");
                                        v3_6.append(v9_4);
                                        String v2_0 = v3_6.toString();
                                        if (v7_4 != 0) {
                                            v2_0 = g2.g.d(v2_0, ",");
                                        }
                                        v2_1 = g2.g.d(v2_0, " ");
                                    }
                                    if (v7_4 != 0) {
                                        String v1_3 = new StringBuilder();
                                        v1_3.append(v2_1);
                                        v1_3.append(v5_2);
                                        v1_3.append(" nanoseconds ");
                                        v2_1 = v1_3.toString();
                                    }
                                    v2_3 = g2.g.d(v2_1, "delay)");
                                }
                                if (!this.isDone()) {
                                    throw new java.util.concurrent.TimeoutException(g2.g.e(v2_3, " for ", v4_9));
                                } else {
                                    throw new java.util.concurrent.TimeoutException(g2.g.d(v2_3, " but future completed as timeout expired"));
                                }
                            } while(v5_0 >= 1000);
                            this.i(v14_1);
                        } while(v13_1 != v4_3);
                    }
                    return t.h.f(this.a);
                }
            } else {
                return t.h.f(v7_0);
            }
        }
    }

    public String h()
    {
        if (!(this instanceof java.util.concurrent.ScheduledFuture)) {
            return 0;
        } else {
            int v0_4 = new StringBuilder("remaining delay=[");
            v0_4.append(((java.util.concurrent.ScheduledFuture) this).getDelay(java.util.concurrent.TimeUnit.MILLISECONDS));
            v0_4.append(" ms]");
            return v0_4.toString();
        }
    }

    public final void i(t.g p5)
    {
        p5.a = 0;
        do {
            boolean v5_3 = this.c;
            if (v5_3 == t.g.c) {
                break;
            }
            t.g v1_0 = 0;
        } while(!v5_3);
        return;
    }

    public final boolean isCancelled()
    {
        return (this.a instanceof t.a);
    }

    public final boolean isDone()
    {
        int v0_1;
        if (this.a == null) {
            v0_1 = 0;
        } else {
            v0_1 = 1;
        }
        return v0_1;
    }

    public boolean j(Object p3)
    {
        if (p3 == 0) {
            p3 = t.h.m;
        }
        if (!t.h.f.c(this, 0, p3)) {
            return 0;
        } else {
            t.h.d(this);
            return 1;
        }
    }

    public boolean k(Throwable p3)
    {
        p3.getClass();
        if (!t.h.f.c(this, 0, new t.c(p3))) {
            return 0;
        } else {
            t.h.d(this);
            return 1;
        }
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder();
        v0_1.append(super.toString());
        v0_1.append("[status=");
        if (!(this.a instanceof t.a)) {
            if (!this.isDone()) {
                try {
                    String v1_1 = this.h();
                } catch (String v1_2) {
                    String v3_1 = new StringBuilder("Exception thrown from implementation: ");
                    v3_1.append(v1_2.getClass());
                    v1_1 = v3_1.toString();
                }
                if ((v1_1 == null) || (v1_1.isEmpty())) {
                    if (!this.isDone()) {
                        v0_1.append("PENDING");
                    } else {
                        this.b(v0_1);
                    }
                } else {
                    v0_1.append("PENDING, info=[");
                    v0_1.append(v1_1);
                    v0_1.append("]");
                }
            } else {
                this.b(v0_1);
            }
        } else {
            v0_1.append("CANCELLED");
        }
        v0_1.append("]");
        return v0_1.toString();
    }
}
