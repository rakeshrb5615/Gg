package f8;
public class c implements f8.g {
    public static final synthetic java.util.concurrent.atomic.AtomicLongFieldUpdater b;
    public static final synthetic java.util.concurrent.atomic.AtomicLongFieldUpdater c;
    public static final synthetic java.util.concurrent.atomic.AtomicLongFieldUpdater d;
    public static final synthetic java.util.concurrent.atomic.AtomicLongFieldUpdater e;
    public static final synthetic java.util.concurrent.atomic.AtomicReferenceFieldUpdater f;
    public static final synthetic java.util.concurrent.atomic.AtomicReferenceFieldUpdater m;
    public static final synthetic java.util.concurrent.atomic.AtomicReferenceFieldUpdater n;
    public static final synthetic java.util.concurrent.atomic.AtomicReferenceFieldUpdater o;
    public static final synthetic java.util.concurrent.atomic.AtomicReferenceFieldUpdater p;
    private volatile synthetic Object _closeCause$volatile;
    public final int a;
    private volatile synthetic long bufferEnd$volatile;
    private volatile synthetic Object bufferEndSegment$volatile;
    private volatile synthetic Object closeHandler$volatile;
    private volatile synthetic long completedExpandBuffersAndPauseFlag$volatile;
    private volatile synthetic Object receiveSegment$volatile;
    private volatile synthetic long receivers$volatile;
    private volatile synthetic Object sendSegment$volatile;
    private volatile synthetic long sendersAndCloseStatus$volatile;

    static c()
    {
        f8.c.b = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(f8.c, "sendersAndCloseStatus$volatile");
        f8.c.c = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(f8.c, "receivers$volatile");
        f8.c.d = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(f8.c, "bufferEnd$volatile");
        f8.c.e = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(f8.c, "completedExpandBuffersAndPauseFlag$volatile");
        f8.c.f = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(f8.c, Object, "sendSegment$volatile");
        f8.c.m = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(f8.c, Object, "receiveSegment$volatile");
        f8.c.n = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(f8.c, Object, "bufferEndSegment$volatile");
        f8.c.o = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(f8.c, Object, "_closeCause$volatile");
        f8.c.p = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(f8.c, Object, "closeHandler$volatile");
        return;
    }

    public c(int p9)
    {
        this.a = p9;
        if (p9 < null) {
            throw new IllegalArgumentException(v1.a.j("Invalid channel capacity: ", p9, ", should be >=0").toString());
        } else {
            long v0_1;
            if (p9 == null) {
                v0_1 = 0;
            } else {
                if (p9 == 2147483647) {
                    v0_1 = 9223372036854775807;
                } else {
                    v0_1 = ((long) p9);
                }
            }
            this.bufferEnd$volatile = v0_1;
            this.completedExpandBuffersAndPauseFlag$volatile = f8.c.d.get(this);
            f8.k v2_1 = new f8.k(0, 0, this, 3);
            this.sendSegment$volatile = v2_1;
            this.receiveSegment$volatile = v2_1;
            if (this.t()) {
                v2_1 = f8.e.a;
                kotlin.jvm.internal.j.c(v2_1, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
            }
            this.bufferEndSegment$volatile = v2_1;
            this._closeCause$volatile = f8.e.s;
            return;
        }
    }

    public static final f8.k a(f8.c p11, long p12, f8.k p14)
    {
        do {
            Object v1 = i8.a.b(p14, p12, f8.d.a);
            if (!i8.a.e(v1)) {
                int v2_2 = i8.a.c(v1);
                while(true) {
                    boolean v3_2 = f8.c.f;
                    long v4_1 = ((i8.r) v3_2.get(p11));
                    v4_1.e();
                }
            }
            boolean v3_1 = f8.c.c;
            if (!i8.a.e(v1)) {
                f8.k v14_2 = ((f8.k) i8.a.c(v1));
                long v0_3 = v14_2.c;
                if (v0_3 <= p12) {
                    return v14_2;
                } else {
                    long v12_4 = (((long) f8.e.b) * v0_3);
                    while(true) {
                        long v6_2;
                        long v7_1 = f8.c.b.get(p11);
                        long v4_4 = (1152921504606846975 & v7_1);
                        if (v4_4 >= v12_4) {
                            break;
                        }
                        v6_2 = p11;
                        if (!f8.c.b.compareAndSet(p11, v7_1, ((((long) ((int) (v7_1 >> 60))) << 60) + v4_4))) {
                        }
                        if ((v0_3 * ((long) f8.e.b)) < v3_1.get(v6_2)) {
                            v14_2.b();
                        }
                    }
                    v6_2 = p11;
                }
            } else {
                p11.i();
                if ((p14.c * ((long) f8.e.b)) < v3_1.get(p11)) {
                    p14.b();
                    return 0;
                }
            }
            return 0;
        } while(v4_1.c < v2_2.c);
        if (!v2_2.j()) {
        }
        while (!v3_2.compareAndSet(p11, v4_1, v2_2)) {
            if (v3_2.get(p11) != v4_1) {
                if (v2_2.f()) {
                    v2_2.e();
                }
            }
        }
        if (v4_1.f()) {
        }
    }

    public static final void c(f8.c p0, Object p1, d8.n p2)
    {
        p2.resumeWith(c4.b.p(p0.o()));
        return;
    }

    public static final int e(f8.c p4, f8.k p5, int p6, Object p7, long p8, Object p10, boolean p11)
    {
        p5.n(p6, p7);
        if (!p11) {
            boolean v0_1 = p5.l(p6);
            if (v0_1) {
                if ((v0_1 instanceof d8.f2)) {
                    p5.n(p6, 0);
                    if (!p4.x(v0_1, p7)) {
                        int v4_2 = f8.e.k;
                        if (p5.f.getAndSet(((p6 * 2) + 1), v4_2) != v4_2) {
                            p5.m(p6, 1);
                        }
                        return 5;
                    } else {
                        p5.o(p6, f8.e.i);
                        return 0;
                    }
                }
            } else {
                if (!p4.f(p8)) {
                    if (p10 != null) {
                        if (p5.k(p6, 0, p10)) {
                            return 2;
                        }
                    } else {
                        return 3;
                    }
                } else {
                    if (p5.k(p6, 0, f8.e.d)) {
                        return 1;
                    }
                }
            }
            return p4.A(p5, p6, p7, p8, p10, p11);
        } else {
            return p4.A(p5, p6, p7, p8, p10, p11);
        }
    }

    public static void q(f8.c p7)
    {
        java.util.concurrent.atomic.AtomicLongFieldUpdater v0 = f8.c.e;
        if ((v0.addAndGet(p7, 1) & 4611686018427387904) != 0) {
            while ((v0.get(p7) & 4611686018427387904) != 0) {
            }
        }
        return;
    }

    public static boolean y(Object p3)
    {
        if (!(p3 instanceof d8.l)) {
            StringBuilder v1_2 = new StringBuilder("Unexpected waiter: ");
            v1_2.append(p3);
            throw new IllegalStateException(v1_2.toString().toString());
        } else {
            IllegalStateException v0_3 = ((d8.l) p3).c(h7.l.a, 0);
            if (v0_3 == null) {
                return 0;
            } else {
                ((d8.l) p3).e(v0_3);
                return 1;
            }
        }
    }

    public final int A(f8.k p6, int p7, Object p8, long p9, Object p11, boolean p12)
    {
        do {
            d8.f2 v0_0 = p6.l(p7);
            if (v0_0 != null) {
                if (v0_0 != f8.e.e) {
                    d4.l v9_1 = f8.e.k;
                    if (v0_0 != v9_1) {
                        if (v0_0 != f8.e.h) {
                            if (v0_0 != f8.e.l) {
                                p6.n(p7, 0);
                                if ((v0_0 instanceof f8.t)) {
                                    v0_0 = ((f8.t) v0_0).a;
                                }
                                if (!this.x(v0_0, p8)) {
                                    if (p6.f.getAndSet(((p7 * 2) + 1), v9_1) != v9_1) {
                                        p6.m(p7, 1);
                                    }
                                    return 5;
                                } else {
                                    p6.o(p7, f8.e.i);
                                    return 0;
                                }
                            } else {
                                p6.n(p7, 0);
                                this.i();
                                return 4;
                            }
                        } else {
                            p6.n(p7, 0);
                            return 5;
                        }
                    } else {
                        p6.n(p7, 0);
                        return 5;
                    }
                } else {
                    if (p6.k(p7, v0_0, f8.e.d)) {
                    }
                }
            } else {
                if ((!this.f(p9)) || (p12)) {
                    if (!p12) {
                        if (p11 != 0) {
                        } else {
                            return 3;
                        }
                    } else {
                        if (p6.k(p7, 0, f8.e.j)) {
                            p6.i();
                            return 4;
                        }
                    }
                } else {
                    if (p6.k(p7, 0, f8.e.d)) {
                    }
                }
            }
            return 1;
        } while(!p6.k(p7, 0, p11));
        return 2;
    }

    public final void B(long p19)
    {
        f8.c v1 = this;
        if (!this.t()) {
            while(true) {
                java.util.concurrent.atomic.AtomicLongFieldUpdater v6 = f8.c.d;
                if (v6.get(v1) > p19) {
                    break;
                }
                v1 = this;
            }
            boolean v2_0 = 0;
            while(true) {
                long v3_0 = f8.c.e;
                if (v2_0 >= f8.e.c) {
                    break;
                }
                long v4_6 = v6.get(v1);
                if ((v4_6 != (4611686018427387903 & v3_0.get(v1))) || (v4_6 != v6.get(v1))) {
                    v2_0++;
                }
            }
            long v0_1 = v3_0;
            while(true) {
                boolean v2_1 = v0_1.get(v1);
                if (v0_1.compareAndSet(v1, v2_1, ((v2_1 & 4611686018427387903) + 4611686018427387904))) {
                    break;
                }
                v1 = this;
            }
            while(true) {
                int v14_2;
                long v4_2 = v6.get(v1);
                boolean v2_4 = v0_1.get(v1);
                long v12 = (v2_4 & 4611686018427387903);
                if ((v2_4 & 4611686018427387904) == 0) {
                    v14_2 = 0;
                } else {
                    v14_2 = 1;
                }
                if ((v4_2 == v12) && (v4_2 == v6.get(v1))) {
                    break;
                }
                if (v14_2 != 0) {
                    v1 = this;
                } else {
                    v1 = this;
                    v0_1.compareAndSet(this, v2_4, (4611686018427387904 + v12));
                }
            }
            while(true) {
                boolean v2_5 = v0_1.get(v1);
                if (v0_1.compareAndSet(v1, v2_5, (v2_5 & 4611686018427387903))) {
                    break;
                }
                v1 = this;
            }
        }
        return;
    }

    public Object b(Object p24, l7.c p25)
    {
        String v1_0 = this;
        String v0_0 = f8.c.f;
        int v2_5 = ((f8.k) v0_0.get(this));
        do {
            java.util.concurrent.atomic.AtomicLongFieldUpdater v9_1 = f8.c.b;
            String v3_7 = v9_1.getAndIncrement(this);
            long v5_0 = (v3_7 & 1152921504606846975);
            long v8_4 = this.r(v3_7, 0);
            String v13_1 = f8.e.b;
            String v3_3 = ((long) v13_1);
            int v14_3 = (v5_0 / v3_3);
            String v3_5 = ((int) (v5_0 % v3_3));
            h7.l v10_1 = h7.l.a;
            if (v2_5.c == v14_3) {
                d8.n v7_1 = f8.c.e(this, v2_5, v3_5, p24, v5_0, 0, v8_4);
                if (v7_1 == null) {
                    v2_5.b();
                    return v10_1;
                } else {
                    if (v7_1 != 1) {
                        if (v7_1 == 2) {
                            String v4 = this;
                            if (v8_4 != 0) {
                                v2_5.i();
                                String v0_13 = this.v(p24, p25);
                                if (v0_13 == m7.a.a) {
                                    return v0_13;
                                }
                            }
                        } else {
                            java.util.concurrent.atomic.AtomicLongFieldUpdater v15 = f8.c.c;
                            if (v7_1 == 3) {
                                d8.n v7_3 = d8.f0.k(q4.b.C(p25));
                                String v4_1 = p24;
                                long v8_9 = f8.c.e(this, v2_5, v3_5, p24, v5_0, v7_3, 0);
                                if (v8_9 == 0) {
                                    v2_5.b();
                                    v7_3.resumeWith(v10_1);
                                } else {
                                    if (v8_9 == 1) {
                                        v7_3.resumeWith(v10_1);
                                    } else {
                                        if (v8_9 == 2) {
                                            v7_3.a(v2_5, (v3_5 + v13_1));
                                        } else {
                                            String v4_0;
                                            String v3_2;
                                            if (v8_9 == 4) {
                                                v3_2 = p24;
                                                v4_0 = this;
                                                if (v5_0 < v15.get(this)) {
                                                    v2_5.b();
                                                }
                                            } else {
                                                String v13_2 = "unexpected";
                                                if (v8_9 != 5) {
                                                    throw new IllegalStateException("unexpected");
                                                } else {
                                                    v2_5.b();
                                                    String v0_7 = ((f8.k) v0_0.get(this));
                                                    while(true) {
                                                        String v3_1;
                                                        long v8_3;
                                                        int v2_0;
                                                        String v0_1;
                                                        int v2_7 = v9_1.getAndIncrement(v1_0);
                                                        long v5_1 = (v2_7 & 1152921504606846975);
                                                        int v2_8 = v1_0.r(v2_7, 0);
                                                        String v3_0 = f8.e.b;
                                                        java.util.concurrent.atomic.AtomicLongFieldUpdater v18 = v9_1;
                                                        long v8_0 = ((long) v3_0);
                                                        String v20 = v13_2;
                                                        long v12_1 = (v5_1 / v8_0);
                                                        long v8_2 = ((int) (v5_1 % v8_0));
                                                        java.util.concurrent.atomic.AtomicLongFieldUpdater v21 = v15;
                                                        if (v0_7.c == v12_1) {
                                                            v2_0 = v0_7;
                                                            v0_1 = v3_0;
                                                            v3_1 = v8_2;
                                                            v8_3 = v2_8;
                                                        } else {
                                                            long v12_3 = f8.c.a(v1_0, v12_1, v0_7);
                                                            if (v12_3 != 0) {
                                                                v0_1 = v3_0;
                                                                v3_1 = v8_2;
                                                                v8_3 = v2_8;
                                                                v2_0 = v12_3;
                                                            } else {
                                                                if (v2_8 != 0) {
                                                                    break;
                                                                }
                                                                v9_1 = v18;
                                                                v13_2 = v20;
                                                                v15 = v21;
                                                                int v14 = 2;
                                                            }
                                                        }
                                                        String v13_0 = f8.c.e(v1_0, v2_0, v3_1, v4_1, v5_1, v7_3, v8_3);
                                                        v4_0 = v1_0;
                                                        String v1_1 = v2_0;
                                                        v3_2 = v4_1;
                                                        if (v13_0 == null) {
                                                            v1_1.b();
                                                        } else {
                                                            if (v13_0 == 1) {
                                                            } else {
                                                                if (v13_0 == 2) {
                                                                    if (v8_3 == 0) {
                                                                        v7_3.a(v1_1, (v3_1 + v0_1));
                                                                        String v0_9 = v7_3.q();
                                                                        String v1_3 = m7.a.a;
                                                                        if (v0_9 != v1_3) {
                                                                            v0_9 = v10_1;
                                                                        }
                                                                        if (v0_9 == v1_3) {
                                                                            return v0_9;
                                                                        }
                                                                        return v10_1;
                                                                    } else {
                                                                        v1_1.i();
                                                                    }
                                                                } else {
                                                                    if (v13_0 == 3) {
                                                                        throw new IllegalStateException(v20);
                                                                    } else {
                                                                        if (v13_0 == 4) {
                                                                            if (v5_1 < v21.get(v4_0)) {
                                                                                v1_1.b();
                                                                            }
                                                                        } else {
                                                                            if (v13_0 == 5) {
                                                                                v1_1.b();
                                                                            }
                                                                            v0_7 = v1_1;
                                                                            v1_0 = v4_0;
                                                                            v9_1 = v18;
                                                                            v13_2 = v20;
                                                                            v15 = v21;
                                                                            v4_1 = v3_2;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    f8.c.c(v1_0, v4_1, v7_3);
                                                }
                                            }
                                            f8.c.c(v4_0, v3_2, v7_3);
                                        }
                                    }
                                }
                            } else {
                                if (v7_1 == 4) {
                                    if (v5_0 < v15.get(this)) {
                                        v2_5.b();
                                    }
                                    String v0_11 = this.v(p24, p25);
                                    if (v0_11 == m7.a.a) {
                                        return v0_11;
                                    }
                                } else {
                                }
                            }
                        }
                    }
                }
            } else {
                String v4_3 = f8.c.a(this, v14_3, v2_5);
                if (v4_3 != null) {
                    v2_5 = v4_3;
                } else {
                    if (v8_4 == 0) {
                        break;
                    }
                    String v0_12 = this.v(p24, p25);
                    if (v0_12 == m7.a.a) {
                        return v0_12;
                    }
                }
            }
            return v10_1;
        } while(v7_1 == 5);
    }

    public final void cancel(java.util.concurrent.CancellationException p2)
    {
        if (p2 == null) {
            p2 = new java.util.concurrent.CancellationException("Channel was cancelled");
        }
        this.g(1, p2);
        return;
    }

    public Object d(Object p16)
    {
        Throwable v1_1;
        java.util.concurrent.atomic.AtomicLongFieldUpdater v8 = f8.c.b;
        Throwable v1_4 = v8.get(this);
        int v9_0 = 0;
        long v11_1 = 1152921504606846975;
        if (!this.r(v1_4, 0)) {
            v1_1 = (this.f((v1_4 & 1152921504606846975)) ^ 1);
        } else {
            v1_1 = 0;
        }
        f8.i v13 = f8.j.b;
        if (v1_1 == null) {
            int v6_0 = f8.e.j;
            Throwable v1_5 = ((f8.k) f8.c.f.get(this));
            while(true) {
                int v2_0 = v8.getAndIncrement(this);
                long v4 = (v2_0 & v11_1);
                boolean v7 = this.r(v2_0, v9_0);
                int v14 = f8.e.b;
                int v2_1 = ((long) v14);
                long v11_0 = (v4 / v2_1);
                int v2_3 = ((int) (v4 % v2_1));
                if (v1_5.c == v11_0) {
                    int v9_2 = f8.c.e(this, v1_5, v2_3, p16, v4, v6_0, v7);
                    boolean v3_3 = h7.l.a;
                    if (v9_2 == 0) {
                        break;
                    }
                    if (v9_2 == 1) {
                        return v3_3;
                    } else {
                        if (v9_2 == 2) {
                            if (!v7) {
                                int v6_1;
                                if (!(v6_0 instanceof d8.f2)) {
                                    v6_1 = 0;
                                } else {
                                    v6_1 = ((d8.f2) v6_0);
                                }
                                if (v6_1 != 0) {
                                    v6_1.a(v1_5, (v2_3 + v14));
                                }
                                v1_5.i();
                                return v13;
                            } else {
                                v1_5.i();
                                return new f8.h(this.o());
                            }
                        } else {
                            if (v9_2 == 3) {
                                throw new IllegalStateException("unexpected");
                            } else {
                                if (v9_2 == 4) {
                                    if (v4 < f8.c.c.get(this)) {
                                        v1_5.b();
                                    }
                                    return new f8.h(this.o());
                                } else {
                                    if (v9_2 == 5) {
                                        v1_5.b();
                                    }
                                    v9_0 = 0;
                                }
                            }
                        }
                    }
                } else {
                    boolean v3_1 = f8.c.a(this, v11_0, v1_5);
                    if (v3_1) {
                        v1_5 = v3_1;
                    } else {
                        if (!v7) {
                            v9_0 = 0;
                        } else {
                            return new f8.h(this.o());
                        }
                    }
                }
                v11_1 = 1152921504606846975;
            }
            v1_5.b();
            return v3_3;
        } else {
            return v13;
        }
    }

    public final boolean f(long p5)
    {
        if ((p5 >= f8.c.d.get(this)) && (p5 >= (f8.c.c.get(this) + ((long) this.a)))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean g(boolean p13, Throwable p14)
    {
        f8.c v4_0;
        java.util.concurrent.atomic.AtomicLongFieldUpdater v3 = f8.c.b;
        if (p13 == null) {
            v4_0 = this;
        } else {
            do {
                long v5_4 = v3.get(this);
                if (((int) (v5_4 >> 60)) != 0) {
                } else {
                    v4_0 = this;
                }
            } while(!v3.compareAndSet(this, v5_4, ((v5_4 & 1152921504606846975) + (((long) 1) << 60))));
        }
        long v5_1 = f8.e.s;
        do {
            int v10_2;
            Object v6_0 = f8.c.o;
            if (!v6_0.compareAndSet(this, v5_1, p14)) {
            } else {
                v10_2 = 1;
            }
            if (p13 == null) {
                do {
                    Throwable v13_3;
                    long v7_4;
                    long v5_2 = v3.get(this);
                    Throwable v13_2 = ((int) (v5_2 >> 60));
                    if (v13_2 == null) {
                        v13_3 = (v5_2 & 1152921504606846975);
                        v7_4 = ((long) 2);
                    } else {
                        if (v13_2 != 1) {
                            break;
                        }
                        v13_3 = (v5_2 & 1152921504606846975);
                        v7_4 = ((long) 3);
                    }
                } while(!v3.compareAndSet(v4_0, v5_2, ((v7_4 << 60) + v13_3)));
            } else {
                do {
                    long v5_3 = v3.get(this);
                } while(!v3.compareAndSet(v4_0, v5_3, ((((long) 3) << 60) + (v5_3 & 1152921504606846975))));
            }
            this.i();
            if (v10_2 != 0) {
                do {
                    d4.l v0_1;
                    Throwable v13_7 = f8.c.p;
                    u7.l v14_2 = v13_7.get(this);
                    if (v14_2 != null) {
                        v0_1 = f8.e.r;
                    } else {
                        v0_1 = f8.e.q;
                    }
                    while (!v13_7.compareAndSet(this, v14_2, v0_1)) {
                    }
                    if (v14_2 != null) {
                        kotlin.jvm.internal.u.a(1, v14_2);
                        ((u7.l) v14_2).invoke(this.m());
                        return v10_2;
                    }
                } while(v13_7.get(this) == v14_2);
            }
            return v10_2;
        } while(v6_0.get(this) == v5_1);
        v10_2 = 0;
    }

    public final f8.k h(long p13)
    {
        boolean v0_1 = f8.c.n.get(this);
        long v1_10 = ((f8.k) f8.c.f.get(this));
        if (v1_10.c > ((f8.k) v0_1).c) {
            v0_1 = v1_10;
        }
        long v1_2 = ((f8.k) f8.c.m.get(this));
        if (v1_2.c > ((f8.k) v0_1).c) {
            v0_1 = v1_2;
        }
        boolean v0_2 = ((i8.b) v0_1);
        do {
            v0_2.getClass();
            long v1_3 = i8.b.a;
            Object v2_3 = v1_3.get(v0_2);
            int v3_0 = i8.a.a;
            Object v4_3 = 0;
            if (v2_3 != v3_0) {
                Object v2_4 = ((i8.b) v2_3);
                if (v2_4 != null) {
                    v0_2 = v2_4;
                    break;
                }
                while (!v1_3.compareAndSet(v0_2, 0, v3_0)) {
                }
            }
            boolean v0_3 = ((f8.k) v0_2);
            if (this.s()) {
                long v1_6 = v0_3;
                while(true) {
                    int v5_2 = (f8.e.b - 1);
                    long v8_3;
                    if (-1 >= v5_2) {
                        v1_6 = ((f8.k) ((i8.b) i8.b.b.get(v1_6)));
                        if (v1_6 == 0) {
                            v8_3 = -1;
                        }
                    } else {
                        v8_3 = ((v1_6.c * ((long) f8.e.b)) + ((long) v5_2));
                        if (v8_3 < f8.c.c.get(this)) {
                        }
                        do {
                            boolean v10_6 = v1_6.l(v5_2);
                            if ((v10_6) && (v10_6 != f8.e.e)) {
                                if (v10_6 == f8.e.d) {
                                    if (v8_3 != -1) {
                                        this.j(v8_3);
                                    }
                                    long v1_12 = v0_3;
                                    while (v1_12 != 0) {
                                        int v5_0 = (f8.e.b - 1);
                                        while (-1 < v5_0) {
                                            if (((v1_12.c * ((long) f8.e.b)) + ((long) v5_0)) < p13) {
                                                if (v4_3 != null) {
                                                    if ((v4_3 instanceof java.util.ArrayList)) {
                                                        Object v4_1 = ((java.util.ArrayList) v4_3);
                                                        int v13_3 = (v4_1.size() - 1);
                                                        while (-1 < v13_3) {
                                                            this.w(((d8.f2) v4_1.get(v13_3)), 1);
                                                            v13_3--;
                                                        }
                                                    } else {
                                                        this.w(((d8.f2) v4_3), 1);
                                                        return v0_3;
                                                    }
                                                }
                                                return v0_3;
                                            }
                                            do {
                                                d8.f2 v6_3 = v1_12.l(v5_0);
                                                if ((v6_3 != null) && (v6_3 != f8.e.e)) {
                                                    if (!(v6_3 instanceof f8.t)) {
                                                        if ((v6_3 instanceof d8.f2)) {
                                                        }
                                                    } else {
                                                        if (v1_12.k(v5_0, v6_3, f8.e.l)) {
                                                            v4_3 = i8.a.f(v4_3, ((f8.t) v6_3).a);
                                                            v1_12.m(v5_0, 1);
                                                        }
                                                    }
                                                } else {
                                                    if (v1_12.k(v5_0, v6_3, f8.e.l)) {
                                                        v1_12.i();
                                                    }
                                                }
                                                v5_0--;
                                            } while(!v1_12.k(v5_0, v6_3, f8.e.l));
                                            v4_3 = i8.a.f(v4_3, v6_3);
                                            v1_12.m(v5_0, 1);
                                        }
                                        v1_12 = ((f8.k) ((i8.b) i8.b.b.get(v1_12)));
                                    }
                                }
                            } else {
                            }
                            v5_2--;
                            while (-1 < v5_2) {
                            }
                        } while(!v1_6.k(v5_2, v10_6, f8.e.l));
                        v1_6.i();
                    }
                }
            }
        } while(v1_3.get(v0_2) == null);
    }

    public final void i()
    {
        this.r(f8.c.b.get(this), 0);
        return;
    }

    public final void j(long p10)
    {
        f8.k v0_2 = ((f8.k) f8.c.m.get(this));
        do {
            d4.l v1_3 = f8.c.c;
            f8.k v3_1 = v1_3.get(this);
            if (p10 >= Math.max((((long) this.a) + v3_1), f8.c.d.get(this))) {
                if (!v1_3.compareAndSet(this, v3_1, (1 + v3_1))) {
                    break;
                }
                long v5_3 = ((long) f8.e.b);
                int v7_1 = (v3_1 / v5_3);
                d4.l v1_2 = ((int) (v3_1 % v5_3));
                if (v0_2.c != v7_1) {
                    long v5_7 = this.l(v7_1, v0_2);
                }
                long v5_8 = v3_1;
                f8.k v3_0 = v0_2;
                if (this.z(v3_0, v1_2, v5_8, 0) != f8.e.o) {
                    v3_0.b();
                } else {
                    if (v5_8 < this.p()) {
                        v3_0.b();
                    }
                }
                v0_2 = v3_0;
                break;
            } else {
                return;
            }
        } while(v5_7 != 0);
    }

    public final void k()
    {
        if (!this.t()) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater v6 = f8.c.n;
            boolean v7 = ((f8.k) v6.get(this));
            while(true) {
                long v8 = f8.c.d.getAndIncrement(this);
                String v2_2 = (v8 / ((long) f8.e.b));
                if (this.p() <= v8) {
                    break;
                }
                if (v7.c != v2_2) {
                    do {
                        String v4_5 = i8.a.b(v7, v2_2, f8.d.a);
                        if (!i8.a.e(v4_5)) {
                            d8.f2 v5_3 = i8.a.c(v4_5);
                            do {
                                boolean v10_3 = ((i8.r) v6.get(this));
                                if (v10_3.c < v5_3.c) {
                                    if (!v5_3.j()) {
                                    }
                                    while (!v6.compareAndSet(this, v10_3, v5_3)) {
                                        if (v6.get(this) != v10_3) {
                                        }
                                    }
                                    if (v10_3.f()) {
                                        v10_3.e();
                                    }
                                }
                            } while(!v5_3.f());
                            v5_3.e();
                        }
                        boolean v10_5 = 0;
                        if (!i8.a.e(v4_5)) {
                            IllegalStateException v0_13 = ((f8.k) i8.a.c(v4_5));
                            String v4_6 = v0_13.c;
                            if (v4_6 <= v2_2) {
                                v10_5 = v0_13;
                            } else {
                                String v4_7 = (v4_6 * ((long) f8.e.b));
                                if (!f8.c.d.compareAndSet(this, (1 + v8), v4_7)) {
                                    f8.c.q(this);
                                } else {
                                    IllegalStateException v0_18 = f8.c.e;
                                    if ((v0_18.addAndGet(this, (v4_7 - v8)) & 4611686018427387904) == 0) {
                                        if (v10_5) {
                                            v7 = v10_5;
                                        }
                                        IllegalStateException v0_21 = ((int) (v8 % ((long) f8.e.b)));
                                        String v2_24 = v7.l(v0_21);
                                        String v4_0 = f8.c.c;
                                        if ((!(v2_24 instanceof d8.f2)) || ((v8 < v4_0.get(this)) || (!v7.k(v0_21, v2_24, f8.e.g)))) {
                                            do {
                                                String v2_0 = v7.l(v0_21);
                                                if (!(v2_0 instanceof d8.f2)) {
                                                    if (v2_0 != f8.e.j) {
                                                        if (v2_0 != null) {
                                                            if ((v2_0 != f8.e.d) && ((v2_0 != f8.e.h) && ((v2_0 != f8.e.i) && ((v2_0 != f8.e.k) && (v2_0 != f8.e.l))))) {
                                                            }
                                                        } else {
                                                            if (v7.k(v0_21, v2_0, f8.e.e)) {
                                                            }
                                                        }
                                                    } else {
                                                        f8.c.q(this);
                                                    }
                                                } else {
                                                    if (v8 >= v4_0.get(this)) {
                                                        if (v7.k(v0_21, v2_0, f8.e.g)) {
                                                            if (!f8.c.y(v2_0)) {
                                                                v7.o(v0_21, f8.e.j);
                                                                v7.i();
                                                            } else {
                                                                v7.o(v0_21, f8.e.d);
                                                            }
                                                        }
                                                    } else {
                                                        if (v7.k(v0_21, v2_0, new f8.t(((d8.f2) v2_0)))) {
                                                        }
                                                    }
                                                }
                                            } while(v2_0 != f8.e.f);
                                            StringBuilder v3_13 = new StringBuilder("Unexpected cell state: ");
                                            v3_13.append(v2_0);
                                            throw new IllegalStateException(v3_13.toString().toString());
                                        } else {
                                            if (!f8.c.y(v2_24)) {
                                                v7.o(v0_21, f8.e.j);
                                                v7.i();
                                            } else {
                                                v7.o(v0_21, f8.e.d);
                                            }
                                        }
                                        f8.c.q(this);
                                        return;
                                    }
                                    while ((v0_18.get(this) & 4611686018427387904) != 0) {
                                    }
                                }
                            }
                        } else {
                            this.i();
                            this.u(v2_2, v7);
                            f8.c.q(this);
                        }
                    } while(!v5_3.j());
                }
            }
            if ((v7.c < v2_2) && (v7.c() != null)) {
                this.u(v2_2, v7);
            }
            f8.c.q(this);
            return;
        } else {
            return;
        }
    }

    public final f8.k l(long p10, f8.k p12)
    {
        while(true) {
            Object v1 = i8.a.b(p12, p10, f8.d.a);
            if (!i8.a.e(v1)) {
                int v2_2 = i8.a.c(v1);
                while(true) {
                    boolean v3_10 = f8.c.m;
                    f8.c v4_1 = ((i8.r) v3_10.get(this));
                    if (v4_1.c < v2_2.c) {
                        if (!v2_2.j()) {
                            break;
                        }
                        while (!v3_10.compareAndSet(this, v4_1, v2_2)) {
                            if (v3_10.get(this) != v4_1) {
                                if (v2_2.f()) {
                                    v2_2.e();
                                }
                            }
                        }
                        if (v4_1.f()) {
                            v4_1.e();
                        }
                    }
                }
            }
            if (!i8.a.e(v1)) {
                f8.k v12_2 = ((f8.k) i8.a.c(v1));
                long v0_6 = v12_2.c;
                if ((!this.t()) && (p10 <= (f8.c.d.get(this) / ((long) f8.e.b)))) {
                    while(true) {
                        boolean v3_6 = f8.c.n;
                        f8.c v4_3 = ((i8.r) v3_6.get(this));
                        if ((v4_3.c >= v0_6) || (!v12_2.j())) {
                            if (v0_6 <= p10) {
                                return v12_2;
                            } else {
                                long v7_1 = (v0_6 * ((long) f8.e.b));
                                do {
                                    Object v5_12 = f8.c.c.get(this);
                                } while((v5_12 < v7_1) && (!f8.c.c.compareAndSet(this, v5_12, v7_1)));
                                if ((v0_6 * ((long) f8.e.b)) < this.p()) {
                                    v12_2.b();
                                }
                            }
                            return 0;
                        }
                        while (!v3_6.compareAndSet(this, v4_3, v12_2)) {
                            if (v3_6.get(this) != v4_3) {
                                if (v12_2.f()) {
                                    v12_2.e();
                                }
                            }
                        }
                        if (v4_3.f()) {
                            v4_3.e();
                        }
                    }
                }
            } else {
                this.i();
                if ((p12.c * ((long) f8.e.b)) < this.p()) {
                    p12.b();
                    return 0;
                }
            }
            return 0;
        }
    }

    public final Throwable m()
    {
        return ((Throwable) f8.c.o.get(this));
    }

    public final Throwable n()
    {
        f8.l v0_0 = this.m();
        if (v0_0 == null) {
            v0_0 = new f8.l("Channel was closed");
        }
        return v0_0;
    }

    public final Throwable o()
    {
        f8.m v0_0 = this.m();
        if (v0_0 == null) {
            v0_0 = new f8.m("Channel was closed");
        }
        return v0_0;
    }

    public final long p()
    {
        return (f8.c.b.get(this) & 1152921504606846975);
    }

    public final boolean r(long p14, boolean p16)
    {
        long v0_6 = ((int) (p14 >> 60));
        if ((v0_6 != 0) && (v0_6 != 1)) {
            java.util.concurrent.atomic.AtomicLongFieldUpdater v4 = f8.c.c;
            if (v0_6 == 2) {
                this.h((1152921504606846975 & p14));
                if (!p16) {
                    return 1;
                }
                while(true) {
                    long v0_2 = f8.c.m;
                    d8.f2 v3_3 = ((f8.k) v0_2.get(this));
                    int v7_0 = v4.get(this);
                    if (this.p() > v7_0) {
                        Object v5_7 = ((long) f8.e.b);
                        long v9_0 = (v7_0 / v5_7);
                        if (v3_3.c != v9_0) {
                            v3_3 = this.l(v9_0, v3_3);
                            if (v3_3 == null) {
                                break;
                            }
                        }
                        v3_3.b();
                        long v0_7 = ((int) (v7_0 % v5_7));
                        do {
                            Object v5_9 = v3_3.l(v0_7);
                            if ((v5_9 != null) && (v5_9 != f8.e.e)) {
                                if ((v5_9 == f8.e.d) || ((v5_9 != f8.e.j) && ((v5_9 != f8.e.l) && ((v5_9 != f8.e.i) && ((v5_9 != f8.e.h) && ((v5_9 == f8.e.g) || ((v5_9 != f8.e.f) && (v7_0 == v4.get(this))))))))) {
                                    return 0;
                                }
                            } else {
                            }
                            f8.c.c.compareAndSet(this, v7_0, (v7_0 + 1));
                        } while(!v3_3.k(v0_7, v5_9, f8.e.h));
                        this.k();
                    }
                }
                if (((f8.k) v0_2.get(this)).c < v9_0) {
                    return 1;
                }
            } else {
                if (v0_6 != 3) {
                    throw new IllegalStateException(g2.g.c(v0_6, "unexpected close status: ").toString());
                } else {
                    long v0_21 = this.h((1152921504606846975 & p14));
                    Object v5_1 = 0;
                    while(true) {
                        int v6_0 = (f8.e.b - 1);
                        if (-1 >= v6_0) {
                            break;
                        }
                        long v8_2 = ((v0_21.c * ((long) f8.e.b)) + ((long) v6_0));
                        do {
                            boolean v10_3 = v0_21.l(v6_0);
                            if (v10_3 != f8.e.i) {
                                if (v10_3 != f8.e.d) {
                                    if ((v10_3 != f8.e.e) && (v10_3)) {
                                        if ((!(v10_3 instanceof d8.f2)) && (!(v10_3 instanceof f8.t))) {
                                            d8.f2 v11_5 = f8.e.g;
                                            if ((v10_3 != v11_5) && (v10_3 != f8.e.f)) {
                                                if (v10_3 != v11_5) {
                                                }
                                            } else {
                                                if (v5_1 == null) {
                                                    return 1;
                                                } else {
                                                    if ((v5_1 instanceof java.util.ArrayList)) {
                                                        Object v5_2 = ((java.util.ArrayList) v5_1);
                                                        long v0_5 = (v5_2.size() - 1);
                                                        while (-1 < v0_5) {
                                                            this.w(((d8.f2) v5_2.get(v0_5)), 0);
                                                            v0_5--;
                                                        }
                                                        return 1;
                                                    } else {
                                                        this.w(((d8.f2) v5_1), 0);
                                                        return 1;
                                                    }
                                                }
                                            }
                                        } else {
                                            if (v8_2 < v4.get(this)) {
                                            } else {
                                                d8.f2 v11_10;
                                                if (!(v10_3 instanceof f8.t)) {
                                                    v11_10 = ((d8.f2) v10_3);
                                                } else {
                                                    v11_10 = ((f8.t) v10_3).a;
                                                }
                                            }
                                        }
                                    } else {
                                        if (v0_21.k(v6_0, v10_3, f8.e.l)) {
                                            v0_21.i();
                                        }
                                    }
                                } else {
                                    if (v8_2 < v4.get(this)) {
                                    } else {
                                        if (v0_21.k(v6_0, v10_3, f8.e.l)) {
                                            v0_21.n(v6_0, 0);
                                            v0_21.i();
                                        }
                                    }
                                }
                                v6_0--;
                                while (-1 < v6_0) {
                                }
                                v0_21 = ((f8.k) ((i8.b) i8.b.b.get(v0_21)));
                                if (v0_21 == 0) {
                                }
                            }
                        } while(!v0_21.k(v6_0, v10_3, f8.e.l));
                        v5_1 = i8.a.f(v5_1, v11_10);
                        v0_21.n(v6_0, 0);
                        v0_21.i();
                    }
                }
            }
            return 1;
        }
        return 0;
    }

    public boolean s()
    {
        return 0;
    }

    public final boolean t()
    {
        int v0_2 = f8.c.d.get(this);
        if ((v0_2 != 0) && (v0_2 != 9223372036854775807)) {
            return 0;
        } else {
            return 1;
        }
    }

    public final String toString()
    {
        String v1_4 = new StringBuilder();
        String v2_21 = ((int) (f8.c.b.get(this) >> 60));
        if (v2_21 == 2) {
            v1_4.append("closed,");
        } else {
            if (v2_21 == 3) {
                v1_4.append("cancelled,");
            }
        }
        String v2_11 = new StringBuilder("capacity=");
        v2_11.append(this.a);
        v2_11.append(44);
        v1_4.append(v2_11.toString());
        v1_4.append("data=[");
        String v2_14 = new f8.k[3];
        int v6_7 = 0;
        v2_14[0] = f8.c.m.get(this);
        String v7_23 = 1;
        v2_14[1] = f8.c.f.get(this);
        v2_14[2] = f8.c.n.get(this);
        String v2_16 = i7.h.V(v2_14);
        String v3_8 = new java.util.ArrayList();
        String v2_17 = v2_16.iterator();
        while (v2_17.hasNext()) {
            int v4_2 = v2_17.next();
            if (((f8.k) v4_2) != f8.e.a) {
                v3_8.add(v4_2);
            }
        }
        String v2_19 = v3_8.iterator();
        if (!v2_19.hasNext()) {
            throw new java.util.NoSuchElementException();
        } else {
            String v3_10 = v2_19.next();
            if (v2_19.hasNext()) {
                StringBuilder v8_8 = ((f8.k) v3_10).c;
                do {
                    int v4_8 = v2_19.next();
                    long v10_2 = ((f8.k) v4_8).c;
                    if (v8_8 > v10_2) {
                        v3_10 = v4_8;
                        v8_8 = v10_2;
                    }
                } while(v2_19.hasNext());
            }
            String v3_11 = ((f8.k) v3_10);
            long v10_3 = f8.c.c.get(this);
            long v12_1 = this.p();
            while(true) {
                int v4_1 = v6_7;
                if (v4_1 < f8.e.b) {
                    break;
                }
                v3_11 = ((f8.k) v3_11.c());
                if (v3_11 != null) {
                    v6_7 = 0;
                }
                if (v1_4.length() == 0) {
                    throw new java.util.NoSuchElementException("Char sequence is empty.");
                } else {
                    if (v1_4.charAt(b8.i.t0(v1_4)) == 44) {
                        kotlin.jvm.internal.j.d(v1_4.deleteCharAt((v1_4.length() - 1)), "deleteCharAt(...)");
                    }
                    v1_4.append("]");
                    return v1_4.toString();
                }
            }
            StringBuilder v8_1 = ((v3_11.c * ((long) f8.e.b)) + ((long) v4_1));
            long v14_2 = v8_1 cmp v12_1;
            if ((v14_2 < 0) || (v8_1 < v10_3)) {
                String v7_19;
                Object v15_1 = v3_11.l(v4_1);
                int v16_0 = v7_23;
                int v6_1 = v3_11.f.get((v4_1 * 2));
                if (!(v15_1 instanceof d8.l)) {
                    if (!(v15_1 instanceof f8.t)) {
                        if ((!kotlin.jvm.internal.j.a(v15_1, f8.e.f)) && (!kotlin.jvm.internal.j.a(v15_1, f8.e.g))) {
                            if ((v15_1 != null) && ((!v15_1.equals(f8.e.e)) && ((!v15_1.equals(f8.e.i)) && ((!v15_1.equals(f8.e.h)) && ((!v15_1.equals(f8.e.k)) && ((!v15_1.equals(f8.e.j)) && (!v15_1.equals(f8.e.l)))))))) {
                                v7_19 = v15_1.toString();
                                if (v6_1 == 0) {
                                    int v6_3 = new StringBuilder();
                                    v6_3.append(v7_19);
                                    v6_3.append(44);
                                    v1_4.append(v6_3.toString());
                                } else {
                                    StringBuilder v8_5 = new StringBuilder("(");
                                    v8_5.append(v7_19);
                                    v8_5.append(44);
                                    v8_5.append(v6_1);
                                    v8_5.append("),");
                                    v1_4.append(v8_5.toString());
                                }
                            }
                        } else {
                            v7_19 = "resuming_sender";
                        }
                    } else {
                        String v7_21 = new StringBuilder("EB(");
                        v7_21.append(v15_1);
                        v7_21.append(41);
                        v7_19 = v7_21.toString();
                    }
                } else {
                    String v7_22 = v8_1 cmp v10_3;
                    if ((v7_22 >= null) || (v14_2 < 0)) {
                        if ((v14_2 >= 0) || (v7_22 < null)) {
                            v7_19 = "cont";
                        } else {
                            v7_19 = "send";
                        }
                    } else {
                        v7_19 = "receive";
                    }
                }
                v4_1++;
                v7_23 = v16_0;
                while (v4_1 >= f8.e.b) {
                }
            }
        }
    }

    public final void u(long p5, f8.k p7)
    {
        while (p7.c < p5) {
            Object v0_8 = ((f8.k) p7.c());
            if (v0_8 == null) {
                break;
            }
            p7 = v0_8;
        }
        do {
            if (p7.d()) {
                boolean v5_2 = ((f8.k) p7.c());
                if (v5_2) {
                    p7 = v5_2;
                }
            }
            do {
                boolean v5_3 = f8.c.n;
                i8.r v6_1 = ((i8.r) v5_3.get(this));
                if (v6_1.c >= p7.c) {
                    break;
                }
                if (!p7.j()) {
                }
                while (!v5_3.compareAndSet(this, v6_1, p7)) {
                    if (v5_3.get(this) != v6_1) {
                        if (p7.f()) {
                            p7.e();
                        }
                    }
                    return;
                }
            } while(!v6_1.f());
            return;
        } while(v6_1.c >= p7.c);
    }

    public final Object v(Object p2, l7.c p3)
    {
        h7.l v2_3 = new d8.n(1, q4.b.C(p3));
        v2_3.r();
        v2_3.resumeWith(c4.b.p(this.o()));
        h7.l v2_1 = v2_3.q();
        if (v2_1 != m7.a.a) {
            return h7.l.a;
        } else {
            return v2_1;
        }
    }

    public final void w(d8.f2 p3, boolean p4)
    {
        if (!(p3 instanceof d8.l)) {
            if (!(p3 instanceof f8.b)) {
                StringBuilder v0_4 = new StringBuilder("Unexpected waiter: ");
                v0_4.append(p3);
                throw new IllegalStateException(v0_4.toString().toString());
            } else {
                h7.g v4_2 = ((f8.b) p3).b;
                kotlin.jvm.internal.j.b(v4_2);
                ((f8.b) p3).b = 0;
                ((f8.b) p3).a = f8.e.l;
                h7.g v3_5 = ((f8.b) p3).c.m();
                if (v3_5 != null) {
                    v4_2.resumeWith(c4.b.p(v3_5));
                    return;
                } else {
                    v4_2.resumeWith(Boolean.FALSE);
                    return;
                }
            }
        } else {
            h7.g v4_4;
            if (p4 == null) {
                v4_4 = this.o();
            } else {
                v4_4 = this.n();
            }
            ((l7.c) p3).resumeWith(c4.b.p(v4_4));
            return;
        }
    }

    public final boolean x(Object p5, Object p6)
    {
        if (!(p5 instanceof f8.b)) {
            if (!(p5 instanceof d8.l)) {
                StringBuilder v0_1 = new StringBuilder("Unexpected receiver type: ");
                v0_1.append(p5);
                throw new IllegalStateException(v0_1.toString().toString());
            } else {
                IllegalStateException v6_2 = ((d8.l) p5).c(p6, 0);
                if (v6_2 == null) {
                    return 0;
                } else {
                    ((d8.l) p5).e(v6_2);
                    return 1;
                }
            }
        } else {
            StringBuilder v0_2 = ((f8.b) p5).b;
            kotlin.jvm.internal.j.b(v0_2);
            ((f8.b) p5).b = 0;
            ((f8.b) p5).a = p6;
            String v5_6 = v0_2.c(Boolean.TRUE, 0);
            if (v5_6 == null) {
                return 0;
            } else {
                v0_2.e(v5_6);
                return 1;
            }
        }
    }

    public final Object z(f8.k p9, int p10, long p11, Object p13)
    {
        java.util.concurrent.atomic.AtomicReferenceArray v0 = p9.f;
        d8.f2 v1_2 = p9.l(p10);
        java.util.concurrent.atomic.AtomicLongFieldUpdater v5 = f8.c.b;
        if (v1_2 != null) {
            if ((v1_2 == f8.e.d) && (p9.k(p10, v1_2, f8.e.i))) {
                this.k();
                Object v11_2 = v0.get((p10 * 2));
                p9.n(p10, 0);
                return v11_2;
            }
        } else {
            if (p11 >= (v5.get(this) & 1152921504606846975)) {
                if (p13 != null) {
                    if (p9.k(p10, v1_2, p13)) {
                        this.k();
                        return f8.e.m;
                    }
                } else {
                    return f8.e.n;
                }
            }
        }
        do {
            d8.f2 v1_4 = p9.l(p10);
            if ((v1_4 != null) && (v1_4 != f8.e.e)) {
                if (v1_4 != f8.e.d) {
                    d4.l v6_5 = f8.e.j;
                    if (v1_4 != v6_5) {
                        if (v1_4 != f8.e.h) {
                            if (v1_4 != f8.e.l) {
                            } else {
                                this.k();
                                return f8.e.o;
                            }
                        } else {
                            return f8.e.o;
                        }
                    } else {
                        return f8.e.o;
                    }
                } else {
                    if (p9.k(p10, v1_4, f8.e.i)) {
                        this.k();
                        Object v11_8 = v0.get((p10 * 2));
                        p9.n(p10, 0);
                        return v11_8;
                    }
                }
            } else {
                if (p11 >= (v5.get(this) & 1152921504606846975)) {
                    if (p13 != null) {
                        if (p9.k(p10, v1_4, p13)) {
                            this.k();
                            return f8.e.m;
                        }
                    } else {
                        return f8.e.n;
                    }
                } else {
                    if (p9.k(p10, v1_4, f8.e.h)) {
                        this.k();
                        return f8.e.o;
                    }
                }
            }
        } while((v1_4 == f8.e.g) || (!p9.k(p10, v1_4, f8.e.f)));
        Object v11_3 = (v1_4 instanceof f8.t);
        if (v11_3 != null) {
            v1_4 = ((f8.t) v1_4).a;
        }
        if (!f8.c.y(v1_4)) {
            p9.o(p10, v6_5);
            p9.i();
            if (v11_3 != null) {
                this.k();
            }
            return f8.e.o;
        } else {
            p9.o(p10, f8.e.i);
            this.k();
            Object v11_6 = v0.get((p10 * 2));
            p9.n(p10, 0);
            return v11_6;
        }
    }
}
