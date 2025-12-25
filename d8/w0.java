package d8;
public abstract class w0 extends d8.x0 implements d8.k0 {
    public static final synthetic java.util.concurrent.atomic.AtomicReferenceFieldUpdater m;
    public static final synthetic java.util.concurrent.atomic.AtomicReferenceFieldUpdater n;
    public static final synthetic java.util.concurrent.atomic.AtomicIntegerFieldUpdater o;
    private volatile synthetic Object _delayed$volatile;
    private volatile synthetic int _isCompleted$volatile;
    private volatile synthetic Object _queue$volatile;

    static w0()
    {
        d8.w0.m = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(d8.w0, Object, "_queue$volatile");
        d8.w0.n = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(d8.w0, Object, "_delayed$volatile");
        d8.w0.o = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(d8.w0, "_isCompleted$volatile");
        return;
    }

    public w0()
    {
        this._isCompleted$volatile = 0;
        return;
    }

    public final long B()
    {
        long v0_0 = d8.f0.c;
        Throwable v1_0 = d8.w0.m;
        if (!this.C()) {
            this.F();
            while(true) {
                Runnable v7_1;
                long v2_7 = v1_0.get(this);
                long v5_2 = 0;
                if (v2_7 != 0) {
                    if ((v2_7 instanceof i8.m)) {
                        break;
                    }
                    if (v2_7 == v0_0) {
                        v7_1 = 0;
                        if (v7_1 == null) {
                            int v8_1;
                            long v2_1 = this.e;
                            if ((v2_1 != 0) && (!v2_1.isEmpty())) {
                                v8_1 = 0;
                            } else {
                                v8_1 = 9223372036854775807;
                            }
                            if (v8_1 != 0) {
                                Throwable v1_1 = v1_0.get(this);
                                if (v1_1 == null) {
                                    long v0_8 = ((d8.v0) d8.w0.n.get(this));
                                    if (v0_8 != 0) {
                                        try {
                                            Throwable v1_3 = v0_8.a;
                                        } catch (Throwable v1_4) {
                                            throw v1_4;
                                        }
                                        if (v1_3 != null) {
                                            v5_2 = v1_3[0];
                                        }
                                        if (v5_2 != 0) {
                                            long v0_10 = (v5_2.a - System.nanoTime());
                                            if (v0_10 >= 0) {
                                                return v0_10;
                                            } else {
                                                return 0;
                                            }
                                        }
                                    }
                                } else {
                                    if (!(v1_1 instanceof i8.m)) {
                                        if (v1_1 != v0_0) {
                                            return 0;
                                        }
                                    } else {
                                        long v0_2 = i8.m.f.get(((i8.m) v1_1));
                                        if (((int) (1073741823 & v0_2)) != ((int) ((v0_2 & 1152921503533105152) >> 30))) {
                                            return 0;
                                        }
                                    }
                                }
                                return 9223372036854775807;
                            }
                        } else {
                            v7_1.run();
                            return 0;
                        }
                        return 0;
                    }
                    while (!v1_0.compareAndSet(this, v2_7, 0)) {
                        if (v1_0.get(this) != v2_7) {
                        }
                    }
                    v7_1 = ((Runnable) v2_7);
                }
            }
            Object v6_4 = ((i8.m) v2_7);
            Runnable v7_2 = v6_4.d();
            if (v7_2 == i8.m.g) {
                Object v6_5 = v6_4.c();
                while (!v1_0.compareAndSet(this, v2_7, v6_5)) {
                    if (v1_0.get(this) != v2_7) {
                        break;
                    }
                }
            } else {
                v7_1 = ((Runnable) v7_2);
            }
        }
        return 0;
    }

    public void E(Runnable p2)
    {
        this.F();
        if (!this.G(p2)) {
            d8.g0.p.E(p2);
            return;
        } else {
            Thread v2_1 = this.z();
            if (Thread.currentThread() != v2_1) {
                java.util.concurrent.locks.LockSupport.unpark(v2_1);
            }
            return;
        }
    }

    public final void F()
    {
        d8.v0 v0_2 = ((d8.v0) d8.w0.n.get(this));
        if (v0_2 != null) {
            if (i8.u.b.get(v0_2) != 0) {
                Throwable v1_0 = System.nanoTime();
                do {
                    int v3_1;
                    int v3_0 = v0_2.a;
                    d8.u0 v4 = 0;
                    if (v3_0 == 0) {
                        v3_1 = 0;
                    } else {
                        v3_1 = v3_0[0];
                    }
                    if (v3_1 != 0) {
                        int v3_2;
                        if ((v1_0 - v3_1.a) < 0) {
                            v3_2 = 0;
                        } else {
                            v3_2 = this.G(v3_1);
                        }
                        if (v3_2 != 0) {
                            v4 = v0_2.b(0);
                        }
                    }
                } while(v4 != null);
            } else {
                return;
            }
        }
        return;
    }

    public final boolean G(Runnable p7)
    {
        do {
            int v0_0 = d8.w0.m;
            Object v1_0 = v0_0.get(this);
            if (d8.w0.o.get(this) == 0) {
                if (v1_0 != null) {
                    if (!(v1_0 instanceof i8.m)) {
                        if (v1_0 != d8.f0.c) {
                            i8.m v3_1 = new i8.m(8, 1);
                            v3_1.a(((Runnable) v1_0));
                            v3_1.a(p7);
                            while (!v0_0.compareAndSet(this, v1_0, v3_1)) {
                                if (v0_0.get(this) != v1_0) {
                                }
                            }
                            return 1;
                        }
                    } else {
                        Object v4_8 = ((i8.m) v1_0);
                        int v5 = v4_8.a(p7);
                        if (v5 == 0) {
                            return 1;
                        } else {
                            if (v5 == 1) {
                                i8.m v3_2 = v4_8.c();
                                while (!v0_0.compareAndSet(this, v1_0, v3_2)) {
                                    if (v0_0.get(this) != v1_0) {
                                        break;
                                    }
                                }
                            } else {
                                if (v5 != 2) {
                                }
                            }
                        }
                    }
                    return 0;
                } else {
                }
                return 1;
            } else {
                return 0;
            }
        } while(!v0_0.compareAndSet(this, 0, p7));
        if (v0_0.get(this) != null) {
        } else {
            while (!v0_0.compareAndSet(this, 0, p7)) {
            }
        }
        return 1;
    }

    public final boolean H()
    {
        int v0_8;
        int v0_0 = this.e;
        if (v0_0 == 0) {
            v0_8 = 1;
        } else {
            v0_8 = v0_0.isEmpty();
        }
        if (v0_8 != 0) {
            int v0_2 = ((d8.v0) d8.w0.n.get(this));
            if (v0_2 != 0) {
                int v0_4;
                if (i8.u.b.get(v0_2) != 0) {
                    v0_4 = 0;
                } else {
                    v0_4 = 1;
                }
                if (v0_4 == 0) {
                    return 0;
                }
            }
            int v0_6 = d8.w0.m.get(this);
            if (v0_6 != 0) {
                if (!(v0_6 instanceof i8.m)) {
                    if (v0_6 != d8.f0.c) {
                        return 0;
                    }
                } else {
                    d4.l v3_4 = i8.m.f.get(((i8.m) v0_6));
                    if (((int) (1073741823 & v3_4)) != ((int) ((v3_4 & 1152921503533105152) >> 30))) {
                        return 0;
                    } else {
                        return 1;
                    }
                }
            }
            return 1;
        }
        return 0;
    }

    public final void I(long p6, d8.u0 p8)
    {
        d8.v0 v1_5;
        int v0_0 = d8.w0.n;
        Throwable v2 = 0;
        if (d8.w0.o.get(this) == 0) {
            d8.v0 v1_4 = ((d8.v0) v0_0.get(this));
            if (v1_4 == null) {
                d8.v0 v4_1 = new d8.v0();
                v4_1.c = p6;
                while (!v0_0.compareAndSet(this, 0, v4_1)) {
                    if (v0_0.get(this) != null) {
                        break;
                    }
                }
                d8.v0 v1_3 = v0_0.get(this);
                kotlin.jvm.internal.j.b(v1_3);
                v1_4 = ((d8.v0) v1_3);
            }
            v1_5 = p8.c(p6, v1_4, this);
        } else {
            v1_5 = 1;
        }
        if (v1_5 == null) {
            Thread v6_2 = ((d8.v0) v0_0.get(this));
            if (v6_2 != null) {
                try {
                    Throwable v7_0 = v6_2.a;
                } catch (Throwable v7_1) {
                    throw v7_1;
                }
                if (v7_0 != null) {
                    v2 = v7_0[0];
                }
            }
            if (v2 == p8) {
                Thread v6_3 = this.z();
                if (Thread.currentThread() != v6_3) {
                    java.util.concurrent.locks.LockSupport.unpark(v6_3);
                }
            }
        } else {
            if (v1_5 == 1) {
                this.D(p6, p8);
                return;
            } else {
                if (v1_5 != 2) {
                    throw new IllegalStateException("unexpected result");
                }
            }
        }
        return;
    }

    public d8.p0 c(long p2, d8.b2 p4, l7.h p5)
    {
        return d8.h0.a.c(p2, p4, p5);
    }

    public final void f(long p4, d8.n p6)
    {
        long v0_0 = 0;
        if (p4 > 0) {
            if (p4 < 9223372036854) {
                v0_0 = (1000000 * p4);
            } else {
                v0_0 = 9223372036854775807;
            }
        }
        if (v0_0 < 4611686018427387903) {
            d8.j v4_2 = System.nanoTime();
            d8.s0 v2_2 = new d8.s0(this, (v0_0 + v4_2), p6);
            this.I(v4_2, v2_2);
            p6.u(new d8.j(v2_2, 2));
        }
        return;
    }

    public final void i(l7.h p1, Runnable p2)
    {
        this.E(p2);
        return;
    }

    public void shutdown()
    {
        d8.z1.a.set(0);
        d8.w0.o.set(this, 1);
        d8.v0 v0_6 = d8.f0.c;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater v3 = d8.w0.m;
        do {
            Throwable v4_8 = v3.get(this);
            if (v4_8 != null) {
                if (!(v4_8 instanceof i8.m)) {
                    if (v4_8 != v0_6) {
                        i8.m v5_2 = new i8.m(8, 1);
                        v5_2.a(((Runnable) v4_8));
                        while (!v3.compareAndSet(this, v4_8, v5_2)) {
                            if (v3.get(this) != v4_8) {
                            }
                        }
                    }
                } else {
                    ((i8.m) v4_8).b();
                }
            } else {
            }
            while (this.B() <= 0) {
            }
            long v2_2 = System.nanoTime();
            while(true) {
                d8.v0 v0_5 = ((d8.v0) d8.w0.n.get(this));
                if (v0_5 == null) {
                    break;
                }
                try {
                    Throwable v4_6;
                    if (i8.u.b.get(v0_5) <= 0) {
                        v4_6 = 0;
                    } else {
                        v4_6 = v0_5.b(0);
                    }
                    if (v4_6 == null) {
                        break;
                    }
                    this.D(v2_2, v4_6);
                } catch (Throwable v1_1) {
                    throw v1_1;
                }
            }
            return;
        } while(!v3.compareAndSet(this, 0, v0_6));
        if (v3.get(this) != null) {
        } else {
            while (!v3.compareAndSet(this, 0, v0_6)) {
            }
        }
    }
}
