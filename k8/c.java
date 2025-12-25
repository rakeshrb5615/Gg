package k8;
public final class c implements java.util.concurrent.Executor, java.io.Closeable {
    public static final synthetic java.util.concurrent.atomic.AtomicLongFieldUpdater n;
    public static final synthetic java.util.concurrent.atomic.AtomicLongFieldUpdater o;
    public static final synthetic java.util.concurrent.atomic.AtomicIntegerFieldUpdater p;
    public static final d4.l q;
    private volatile synthetic int _isTerminated$volatile;
    public final int a;
    public final int b;
    public final long c;
    private volatile synthetic long controlState$volatile;
    public final String d;
    public final k8.f e;
    public final k8.f f;
    public final i8.p m;
    private volatile synthetic long parkedWorkersStack$volatile;

    static c()
    {
        k8.c.n = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(k8.c, "parkedWorkersStack$volatile");
        k8.c.o = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(k8.c, "controlState$volatile");
        k8.c.p = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(k8.c, "_isTerminated$volatile");
        k8.c.q = new d4.l("NOT_IN_STACK", 4, 0);
        return;
    }

    public c(int p3, int p4, long p5, String p7)
    {
        this.a = p3;
        this.b = p4;
        this.c = p5;
        this.d = p7;
        if (p3 < 1) {
            throw new IllegalArgumentException(v1.a.j("Core pool size ", p3, " should be at least 1").toString());
        } else {
            if (p4 < p3) {
                throw new IllegalArgumentException(v1.a.i("Max pool size ", p4, p3, " should be greater than or equals to core pool size ").toString());
            } else {
                if (p4 > 2097150) {
                    throw new IllegalArgumentException(v1.a.j("Max pool size ", p4, " should not exceed maximal supported number of threads 2097150").toString());
                } else {
                    if (p5 <= 0) {
                        String v3_9 = new StringBuilder("Idle worker keep alive time ");
                        v3_9.append(p5);
                        v3_9.append(" must be positive");
                        throw new IllegalArgumentException(v3_9.toString().toString());
                    } else {
                        this.e = new k8.f();
                        this.f = new k8.f();
                        this.m = new i8.p(((p3 + 1) * 2));
                        this.controlState$volatile = (((long) p3) << 42);
                        this._isTerminated$volatile = 0;
                        return;
                    }
                }
            }
        }
    }

    public final int c()
    {
        String v1_7;
        if (k8.c.p.get(this) == 0) {
            v1_7 = 0;
        } else {
            v1_7 = 1;
        }
        if (v1_7 == null) {
            String v1_1 = k8.c.o;
            int v4_0 = v1_1.get(this);
            long v8_1 = ((int) (v4_0 & 2097151));
            int v4_4 = (v8_1 - ((int) ((v4_0 & 4398044413952) >> 21)));
            if (v4_4 < 0) {
                v4_4 = 0;
            }
            if (v4_4 < this.a) {
                if (v8_1 < this.b) {
                    int v3_1 = (((int) (v1_1.get(this) & 2097151)) + 1);
                    if ((v3_1 <= 0) || (this.m.b(v3_1) != null)) {
                        throw new IllegalArgumentException("Failed requirement.");
                    } else {
                        k8.a v5_5 = new k8.a(this, v3_1);
                        this.m.c(v3_1, v5_5);
                        if (v3_1 != ((int) (2097151 & v1_1.incrementAndGet(this)))) {
                            throw new IllegalArgumentException("Failed requirement.");
                        } else {
                            int v4_5 = (v4_4 + 1);
                            v5_5.start();
                            return v4_5;
                        }
                    }
                } else {
                    return 0;
                }
            } else {
                return 0;
            }
        } else {
            return -1;
        }
    }

    public final void close()
    {
        if (k8.c.p.compareAndSet(this, 0, 1)) {
            java.util.concurrent.atomic.AtomicLongFieldUpdater v0_1;
            java.util.concurrent.atomic.AtomicLongFieldUpdater v0_4 = Thread.currentThread();
            if (!(v0_4 instanceof k8.a)) {
                v0_1 = 0;
            } else {
                v0_1 = ((k8.a) v0_4);
            }
            if ((v0_1 == null) || (!kotlin.jvm.internal.j.a(v0_1.n, this))) {
                v0_1 = 0;
            }
            try {
                Thread$UncaughtExceptionHandler v4_3 = ((int) (k8.c.o.get(this) & 2097151));
            } catch (java.util.concurrent.atomic.AtomicLongFieldUpdater v0_2) {
                throw v0_2;
            }
            if (1 <= v4_3) {
                long v1_3 = 1;
                do {
                    k8.m v5_1 = this.m.b(v1_3);
                    kotlin.jvm.internal.j.b(v5_1);
                    k8.m v5_2 = ((k8.a) v5_1);
                    if (v5_2 != v0_1) {
                        while (v5_2.getState() != Thread$State.TERMINATED) {
                            java.util.concurrent.locks.LockSupport.unpark(v5_2);
                            v5_2.join(10000);
                        }
                        k8.m v5_3 = v5_2.a;
                        k8.f v6_2 = this.f;
                        v5_3.getClass();
                        k8.i v7_3 = ((k8.i) k8.m.b.getAndSet(v5_3, 0));
                        if (v7_3 != null) {
                            v6_2.a(v7_3);
                        }
                        while(true) {
                            k8.i v7_4 = v5_3.a();
                            if (v7_4 == null) {
                                break;
                            }
                            v6_2.a(v7_4);
                        }
                    }
                } while(v1_3 == v4_3);
            }
            this.f.b();
            this.e.b();
            while(true) {
                long v1_6;
                if (v0_1 == null) {
                    v1_6 = ((k8.i) this.e.d());
                    if (v1_6 == 0) {
                        v1_6 = ((k8.i) this.f.d());
                        if (v1_6 == 0) {
                            break;
                        }
                    }
                } else {
                    v1_6 = v0_1.a(1);
                    if (v1_6 == 0) {
                    }
                }
                try {
                    v1_6.run();
                } catch (long v1_11) {
                    Thread v3_0 = Thread.currentThread();
                    v3_0.getUncaughtExceptionHandler().uncaughtException(v3_0, v1_11);
                }
            }
            if (v0_1 != null) {
                v0_1.h(k8.b.e);
            }
            k8.c.n.set(this, 0);
            k8.c.o.set(this, 0);
            return;
        } else {
            return;
        }
    }

    public final void execute(Runnable p2)
    {
        this.f(p2, 0);
        return;
    }

    public final void f(Runnable p9, boolean p10)
    {
        int v9_5;
        k8.k.f.getClass();
        String v0_2 = System.nanoTime();
        if (!(p9 instanceof k8.i)) {
            v9_5 = new k8.j(p9, v0_2, p10);
        } else {
            v9_5 = ((k8.i) p9);
            ((k8.i) p9).a = v0_2;
            ((k8.i) p9).b = p10;
        }
        String v1_0;
        String v10_1 = v9_5.b;
        String v0_1 = k8.c.o;
        if (v10_1 == null) {
            v1_0 = 0;
        } else {
            v1_0 = v0_1.addAndGet(this, 2097152);
        }
        k8.f v3_1;
        k8.f v3_0 = Thread.currentThread();
        if (!(v3_0 instanceof k8.a)) {
            v3_1 = 0;
        } else {
            v3_1 = ((k8.a) v3_0);
        }
        if ((v3_1 == null) || (!kotlin.jvm.internal.j.a(v3_1.n, this))) {
            v3_1 = 0;
        }
        if (v3_1 != null) {
            java.util.concurrent.atomic.AtomicReferenceArray v4_3 = v3_1.c;
            if ((v4_3 != k8.b.e) && ((v9_5.b) || (v4_3 != k8.b.b))) {
                v3_1.m = 1;
                k8.f v3_2 = v3_1.a;
                v3_2.getClass();
                v9_5 = ((k8.i) k8.m.b.getAndSet(v3_2, v9_5));
                if (v9_5 != 0) {
                    java.util.concurrent.atomic.AtomicReferenceArray v4_6 = v3_2.a;
                    java.util.concurrent.atomic.AtomicIntegerFieldUpdater v5_1 = k8.m.c;
                    if ((v5_1.get(v3_2) - k8.m.d.get(v3_2)) != 127) {
                        if (v9_5.b) {
                            k8.m.e.incrementAndGet(v3_2);
                        }
                        int v6_8 = (v5_1.get(v3_2) & 127);
                        while (v4_6.get(v6_8) != null) {
                            Thread.yield();
                        }
                        v4_6.lazySet(v6_8, v9_5);
                        v5_1.incrementAndGet(v3_2);
                        v9_5 = 0;
                    }
                } else {
                    v9_5 = 0;
                }
            }
        }
        if (v9_5 != 0) {
            int v9_6;
            if (!v9_5.b) {
                v9_6 = this.e.a(v9_5);
            } else {
                v9_6 = this.f.a(v9_5);
            }
            if (v9_6 == 0) {
                throw new java.util.concurrent.RejectedExecutionException(v1.a.n(new StringBuilder(), this.d, " was terminated"));
            }
        }
        if (v10_1 == null) {
            if ((!this.x()) && (!this.s(v0_1.get(this)))) {
                this.x();
                return;
            }
        } else {
            if ((!this.x()) && (!this.s(v1_0))) {
                this.x();
                return;
            }
        }
        return;
    }

    public final void i(k8.a p8, int p9, int p10)
    {
        do {
            long v3 = k8.c.n.get(this);
            Object v0_1 = ((int) (2097151 & v3));
            java.util.concurrent.atomic.AtomicLongFieldUpdater v1_3 = ((2097152 + v3) & -2097152);
            if (v0_1 == p9) {
                if (p10 != 0) {
                    v0_1 = p10;
                } else {
                    Object v0_2 = p8.c();
                    while (v0_2 != k8.c.q) {
                        if (v0_2 != null) {
                            Object v0_3 = ((k8.a) v0_2);
                            int v5_1 = v0_3.b();
                            if (v5_1 == 0) {
                                v0_2 = v0_3.c();
                            } else {
                                v0_1 = v5_1;
                            }
                        } else {
                            v0_1 = 0;
                        }
                    }
                    v0_1 = -1;
                }
            }
        } while((v0_1 < null) || (!k8.c.n.compareAndSet(this, v3, (((long) v0_1) | v1_3))));
        return;
    }

    public final boolean s(long p4)
    {
        int v0_2 = (((int) (2097151 & p4)) - ((int) ((p4 & 4398044413952) >> 21)));
        if (v0_2 < 0) {
            v0_2 = 0;
        }
        int v5 = this.a;
        if (v0_2 < v5) {
            int v0_3 = this.c();
            if ((v0_3 == 1) && (v5 > 1)) {
                this.c();
            }
            if (v0_3 > 0) {
                return 1;
            }
        }
        return 0;
    }

    public final String toString()
    {
        a5.o v0_1 = new java.util.ArrayList();
        long v1_2 = this.m;
        int v2_0 = v1_2.a();
        int v3_0 = 0;
        int v5_0 = 0;
        int v6 = 0;
        int v7 = 0;
        int v8 = 0;
        int v9_0 = 1;
        while (v9_0 < v2_0) {
            String v10_15 = ((k8.a) v1_2.b(v9_0));
            if (v10_15 != null) {
                int v12_2;
                int v11_8 = v10_15.a;
                v11_8.getClass();
                if (k8.m.b.get(v11_8) == null) {
                    v12_2 = (k8.m.c.get(v11_8) - k8.m.d.get(v11_8));
                } else {
                    v12_2 = ((k8.m.c.get(v11_8) - k8.m.d.get(v11_8)) + 1);
                }
                String v10_1 = v10_15.c.ordinal();
                if (v10_1 == null) {
                    v3_0++;
                    String v10_3 = new StringBuilder();
                    v10_3.append(v12_2);
                    v10_3.append(99);
                    v0_1.add(v10_3.toString());
                } else {
                    if (v10_1 == 1) {
                        v5_0++;
                        String v10_6 = new StringBuilder();
                        v10_6.append(v12_2);
                        v10_6.append(98);
                        v0_1.add(v10_6.toString());
                    } else {
                        if (v10_1 == 2) {
                            v6++;
                        } else {
                            if (v10_1 == 3) {
                                v7++;
                                if (v12_2 > 0) {
                                    String v10_9 = new StringBuilder();
                                    v10_9.append(v12_2);
                                    v10_9.append(100);
                                    v0_1.add(v10_9.toString());
                                }
                            } else {
                                if (v10_1 != 4) {
                                    throw new a5.o();
                                } else {
                                    v8++;
                                }
                            }
                        }
                    }
                }
            }
            v9_0++;
        }
        long v1_1 = k8.c.o.get(this);
        StringBuilder v4_1 = new StringBuilder();
        v4_1.append(this.d);
        v4_1.append(64);
        v4_1.append(d8.f0.j(this));
        v4_1.append("[Pool Size {core = ");
        int v9_5 = this.a;
        v4_1.append(v9_5);
        v4_1.append(", max = ");
        v4_1.append(this.b);
        v4_1.append("}, Worker States {CPU = ");
        v4_1.append(v3_0);
        v4_1.append(", blocking = ");
        v4_1.append(v5_0);
        v4_1.append(", parked = ");
        v4_1.append(v6);
        v4_1.append(", dormant = ");
        v4_1.append(v7);
        v4_1.append(", terminated = ");
        v4_1.append(v8);
        v4_1.append("}, running workers queues = ");
        v4_1.append(v0_1);
        v4_1.append(", global CPU queue size = ");
        v4_1.append(this.e.c());
        v4_1.append(", global blocking queue size = ");
        v4_1.append(this.f.c());
        v4_1.append(", Control State {created workers= ");
        v4_1.append(((int) (2097151 & v1_1)));
        v4_1.append(", blocking tasks = ");
        v4_1.append(((int) ((4398044413952 & v1_1) >> 21)));
        v4_1.append(", CPUs acquired = ");
        v4_1.append((v9_5 - ((int) ((v1_1 & 9223367638808264704) >> 42))));
        v4_1.append("}]");
        return v4_1.toString();
    }

    public final boolean x()
    {
        do {
            long v3 = k8.c.n.get(this);
            int v0_2 = ((k8.a) this.m.b(((int) (2097151 & v3))));
            if (v0_2 != 0) {
                boolean v1_2 = ((2097152 + v3) & -2097152);
                Object v5_1 = v0_2.c();
                while(true) {
                    int v6;
                    d4.l v9 = k8.c.q;
                    if (v5_1 != v9) {
                        if (v5_1 == null) {
                            break;
                        }
                        Object v5_2 = ((k8.a) v5_1);
                        v6 = v5_2.b();
                        if (v6 == 0) {
                            v5_1 = v5_2.c();
                        }
                    } else {
                        v6 = -1;
                    }
                    if ((v6 >= 0) && (k8.c.n.compareAndSet(this, v3, (((long) v6) | v1_2)))) {
                        v0_2.g(v9);
                    }
                }
                v6 = 0;
            } else {
                v0_2 = 0;
            }
            if (v0_2 != 0) {
            } else {
                return 0;
            }
        } while(!k8.a.o.compareAndSet(v0_2, -1, 0));
        java.util.concurrent.locks.LockSupport.unpark(v0_2);
        return 1;
    }
}
