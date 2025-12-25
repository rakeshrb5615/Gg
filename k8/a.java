package k8;
public final class a extends java.lang.Thread {
    public static final synthetic java.util.concurrent.atomic.AtomicIntegerFieldUpdater o;
    public final k8.m a;
    public final kotlin.jvm.internal.r b;
    public k8.b c;
    public long d;
    public long e;
    public int f;
    private volatile int indexInArray;
    public boolean m;
    public final synthetic k8.c n;
    private volatile Object nextParkedWorker;
    private volatile synthetic int workerCtl$volatile;

    static a()
    {
        k8.a.o = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(k8.a, "workerCtl$volatile");
        return;
    }

    public a(k8.c p3, int p4)
    {
        this.n = p3;
        this.setDaemon(1);
        this.setContextClassLoader(k8.c.getClassLoader());
        this.a = new k8.m();
        this.b = new kotlin.jvm.internal.r();
        this.c = k8.b.d;
        this.nextParkedWorker = k8.c.q;
        int v3_6 = ((int) System.nanoTime());
        if (v3_6 == 0) {
            v3_6 = 42;
        }
        this.f = v3_6;
        this.f(p4);
        return;
    }

    public final k8.i a(boolean p12)
    {
        k8.c v3 = this.n;
        k8.i v8 = 0;
        int v9 = 1;
        k8.m v10 = this.a;
        if (this.c != k8.b.a) {
            do {
                long v4 = k8.c.o.get(v3);
                if (((int) ((9223367638808264704 & v4) >> 42)) != 0) {
                } else {
                    v10.getClass();
                    while(true) {
                        k8.i v12_1 = k8.m.b;
                        int v0_3 = ((k8.i) v12_1.get(v10));
                        if ((v0_3 == 0) || (v0_3.b != 1)) {
                            break;
                        }
                        while (!v12_1.compareAndSet(v10, v0_3, 0)) {
                            if (v12_1.get(v10) != v0_3) {
                            }
                            if (v8 != null) {
                                return v8;
                            } else {
                                k8.i v12_6 = ((k8.i) v3.f.d());
                                if (v12_6 == null) {
                                    v12_6 = this.i(1);
                                }
                                return v12_6;
                            }
                        }
                        v8 = v0_3;
                    }
                    k8.i v12_3 = k8.m.d.get(v10);
                    int v0_5 = k8.m.c.get(v10);
                    while ((v12_3 != v0_5) && (k8.m.e.get(v10) != 0)) {
                        v0_5--;
                        k8.i v1_12 = v10.b(v0_5, 1);
                        if (v1_12 != null) {
                            v8 = v1_12;
                            break;
                        }
                    }
                }
            } while(!k8.c.o.compareAndSet(v3, v4, (v4 - 4398046511104)));
            this.c = k8.b.a;
        }
        if (p12 == null) {
            k8.i v12_7 = this.e();
            if (v12_7 != null) {
                return v12_7;
            }
        } else {
            if (this.d((v3.a * 2)) != 0) {
                v9 = 0;
            }
            if (v9 != 0) {
                k8.i v12_11 = this.e();
                if (v12_11 != null) {
                    return v12_11;
                }
            }
            v10.getClass();
            k8.i v12_14 = ((k8.i) k8.m.b.getAndSet(v10, 0));
            if (v12_14 == null) {
                v12_14 = v10.a();
            }
            if (v12_14 == null) {
                if (v9 == 0) {
                    k8.i v12_15 = this.e();
                    if (v12_15 != null) {
                        return v12_15;
                    }
                }
            } else {
                return v12_14;
            }
        }
        return this.i(3);
    }

    public final int b()
    {
        return this.indexInArray;
    }

    public final Object c()
    {
        return this.nextParkedWorker;
    }

    public final int d(int p4)
    {
        int v0_0 = this.f;
        int v0_3 = (v0_0 ^ (v0_0 << 13));
        int v0_4 = (v0_3 ^ (v0_3 >> 17));
        int v0_5 = (v0_4 ^ (v0_4 << 5));
        this.f = v0_5;
        int v1_4 = (p4 - 1);
        if ((v1_4 & p4) != 0) {
            return ((v0_5 & 2147483647) % p4);
        } else {
            return (v0_5 & v1_4);
        }
    }

    public final k8.i e()
    {
        k8.c v1 = this.n;
        if (this.d(2) != 0) {
            k8.i v0_13 = ((k8.i) v1.f.d());
            if (v0_13 == null) {
                return ((k8.i) v1.e.d());
            } else {
                return v0_13;
            }
        } else {
            k8.i v0_6 = ((k8.i) v1.e.d());
            if (v0_6 == null) {
                return ((k8.i) v1.f.d());
            } else {
                return v0_6;
            }
        }
    }

    public final void f(int p3)
    {
        String v1_0;
        String v0_1 = new StringBuilder();
        v0_1.append(this.n.d);
        v0_1.append("-worker-");
        if (p3 != 0) {
            v1_0 = String.valueOf(p3);
        } else {
            v1_0 = "TERMINATED";
        }
        v0_1.append(v1_0);
        this.setName(v0_1.toString());
        this.indexInArray = p3;
        return;
    }

    public final void g(Object p1)
    {
        this.nextParkedWorker = p1;
        return;
    }

    public final boolean h(k8.b p7)
    {
        int v1_1;
        k8.b v0 = this.c;
        if (v0 != k8.b.a) {
            v1_1 = 0;
        } else {
            v1_1 = 1;
        }
        if (v1_1 != 0) {
            k8.c.o.addAndGet(this.n, 4398046511104);
        }
        if (v0 != p7) {
            this.c = p7;
        }
        return v1_1;
    }

    public final k8.i i(int p26)
    {
        k8.c v3 = this.n;
        int v2_1 = ((int) (k8.c.o.get(v3) & 2097151));
        int v4_0 = 0;
        if (v2_1 >= 2) {
            int v6_0 = this.d(v2_1);
            int v10 = 0;
            long v11 = 9223372036854775807;
            while (v10 < v2_1) {
                v6_0++;
                if (v6_0 > v2_1) {
                    v6_0 = 1;
                }
                long v5_5 = ((k8.a) v3.m.b(v6_0));
                if ((v5_5 != 0) && (v5_5 != this)) {
                    long v18_1;
                    long v7_4;
                    long v5_1 = v5_5.a;
                    if (p26 != 3) {
                        int v9;
                        v5_1.getClass();
                        long v7_3 = k8.m.d.get(v5_1);
                        boolean v8_1 = k8.m.c.get(v5_1);
                        if (p26 != 1) {
                            v9 = 0;
                        } else {
                            v9 = 1;
                        }
                        while (v7_3 != v8_1) {
                            v18_1 = 0;
                            if ((v9 == 0) || (k8.m.e.get(v5_1) != 0)) {
                                int v13_2 = (v7_3 + 1);
                                v7_4 = v5_1.b(v7_3, v9);
                                if (v7_4 != 0) {
                                    long v7_0;
                                    long v5_2;
                                    long v20;
                                    int v13_3 = this.b;
                                    if (v7_4 == 0) {
                                        while(true) {
                                            long v7_5 = k8.m.b;
                                            k8.i v14_1 = ((k8.i) v7_5.get(v5_1));
                                            if (v14_1 != null) {
                                                boolean v8_3;
                                                v20 = -1;
                                                if (!v14_1.b) {
                                                    v8_3 = 2;
                                                } else {
                                                    v8_3 = 1;
                                                }
                                                if ((v8_3 & p26) != 0) {
                                                    k8.k.f.getClass();
                                                    long v23 = v5_1;
                                                    boolean v8_7 = (System.nanoTime() - v14_1.a);
                                                    int v4_6 = k8.k.b;
                                                    if (v8_7 >= v4_6) {
                                                        int v4_7 = v23;
                                                        do {
                                                            v5_2 = 0;
                                                            if (!v7_5.compareAndSet(v4_7, v14_1, 0)) {
                                                            } else {
                                                                v13_3.a = v14_1;
                                                                v7_0 = -1;
                                                                if (v7_0 != v20) {
                                                                    if (v7_0 > v18_1) {
                                                                        v11 = Math.min(v11, v7_0);
                                                                    }
                                                                } else {
                                                                    k8.i v1_2 = ((k8.i) v13_3.a);
                                                                    v13_3.a = v5_2;
                                                                    return v1_2;
                                                                }
                                                                v10++;
                                                                v4_0 = 0;
                                                            }
                                                        } while(v7_5.get(v4_7) == v14_1);
                                                        v5_1 = v4_7;
                                                        v4_0 = 0;
                                                    } else {
                                                        v7_0 = (v4_6 - v8_7);
                                                        v5_2 = 0;
                                                    }
                                                }
                                            } else {
                                                v20 = -1;
                                            }
                                            v7_0 = -2;
                                            v5_2 = v4_0;
                                        }
                                    } else {
                                        v13_3.a = v7_4;
                                        v5_2 = v4_0;
                                        v7_0 = -1;
                                        v20 = -1;
                                    }
                                } else {
                                    v7_3 = v13_2;
                                }
                            }
                            v7_4 = v4_0;
                        }
                        v18_1 = 0;
                    } else {
                        v7_4 = v5_1.a();
                        v18_1 = 0;
                    }
                }
            }
            if (v11 == 9223372036854775807) {
                v11 = 0;
            }
            this.e = v11;
            return 0;
        } else {
            return 0;
        }
    }

    public final void run()
    {
        while(true) {
            Throwable v0_2 = 0;
            if (k8.c.p.get(this.n) == 0) {
                java.util.concurrent.atomic.AtomicLongFieldUpdater v4_5 = k8.b.e;
                if (this.c != v4_5) {
                    i8.p v3_4 = this.a(this.m);
                    if (v3_4 == null) {
                        this.m = 0;
                        if (this.e == 0) {
                            int v9_3 = k8.c.q;
                            if (this.nextParkedWorker == v9_3) {
                                i8.p v3_11 = this.n;
                                if (this.nextParkedWorker != v9_3) {
                                    while (k8.c.p.get(this.n) == 0) {
                                    }
                                    this.h(k8.b.e);
                                    return;
                                }
                                while(true) {
                                    long v19 = k8.c.n.get(v3_11);
                                    long v8_2 = ((v19 + 2097152) & -2097152);
                                    i8.p v10_0 = this.indexInArray;
                                    this.nextParkedWorker = v3_11.m.b(((int) (v19 & 2097151)));
                                    java.util.concurrent.atomic.AtomicIntegerFieldUpdater v18 = v3_11;
                                    if (k8.c.n.compareAndSet(v18, v19, (v8_2 | ((long) v10_0)))) {
                                        break;
                                    }
                                    v3_11 = v18;
                                }
                            } else {
                                k8.a.o.set(this, -1);
                                while (this.nextParkedWorker != k8.c.q) {
                                    i8.p v3_16 = k8.a.o;
                                    if (v3_16.get(this) != -1) {
                                        break;
                                    }
                                    int v9_4 = k8.c.p;
                                    if (v9_4.get(this.n) != 0) {
                                        break;
                                    }
                                    k8.b v12 = k8.b.e;
                                    if (this.c == v12) {
                                        break;
                                    }
                                    long v15_1;
                                    this.h(k8.b.c);
                                    Thread.interrupted();
                                    if (this.d != 0) {
                                        v15_1 = 2097151;
                                    } else {
                                        v15_1 = 2097151;
                                        this.d = (System.nanoTime() + this.n.c);
                                    }
                                    java.util.concurrent.locks.LockSupport.parkNanos(this.n.c);
                                    if ((System.nanoTime() - this.d) >= 0) {
                                        this.d = 0;
                                        int v6_11 = this.n;
                                        int v9_6;
                                        if (v9_4.get(v6_11) == 0) {
                                            v9_6 = 0;
                                        } else {
                                            v9_6 = 1;
                                        }
                                        if (v9_6 == 0) {
                                            int v9_0 = k8.c.o;
                                            if ((((int) (v9_0.get(v6_11) & v15_1)) > v6_11.a) && (v3_16.compareAndSet(this, -1, 1))) {
                                                i8.p v3_2 = this.indexInArray;
                                                this.f(0);
                                                v6_11.i(this, v3_2, 0);
                                                int v9_1 = ((int) (v9_0.getAndDecrement(v6_11) & v15_1));
                                                if (v9_1 != v3_2) {
                                                    k8.a v11_2 = v6_11.m.b(v9_1);
                                                    kotlin.jvm.internal.j.b(v11_2);
                                                    k8.a v11_3 = ((k8.a) v11_2);
                                                    v6_11.m.c(v3_2, v11_3);
                                                    v11_3.f(v3_2);
                                                    v6_11.i(v11_3, v9_1, v3_2);
                                                }
                                                v6_11.m.c(v9_1, 0);
                                                this.c = v12;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (v0_2 != null) {
                                break;
                            }
                            v0_2 = 1;
                        }
                    } else {
                        this.e = 0;
                        int v9_2 = this.n;
                        this.d = 0;
                        if (this.c == k8.b.c) {
                            this.c = k8.b.b;
                        }
                        if (!v3_4.b) {
                            try {
                                v3_4.run();
                            } catch (Throwable v0_6) {
                                i8.p v3_6 = Thread.currentThread();
                                v3_6.getUncaughtExceptionHandler().uncaughtException(v3_6, v0_6);
                            }
                        } else {
                            if ((this.h(k8.b.b)) && ((!v9_2.x()) && (!v9_2.s(k8.c.o.get(v9_2))))) {
                                v9_2.x();
                            }
                            try {
                                v3_4.run();
                            } catch (Throwable v0_12) {
                                i8.p v3_7 = Thread.currentThread();
                                v3_7.getUncaughtExceptionHandler().uncaughtException(v3_7, v0_12);
                            }
                            k8.c.o.addAndGet(v9_2, -2097152);
                            if (this.c != v4_5) {
                                this.c = k8.b.d;
                            }
                        }
                    }
                }
            }
            this.h(k8.b.e);
            return;
        }
        this.h(k8.b.c);
        Thread.interrupted();
        java.util.concurrent.locks.LockSupport.parkNanos(this.e);
        this.e = 0;
    }
}
