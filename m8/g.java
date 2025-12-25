package m8;
public class g {
    public static final synthetic java.util.concurrent.atomic.AtomicReferenceFieldUpdater b;
    public static final synthetic java.util.concurrent.atomic.AtomicLongFieldUpdater c;
    public static final synthetic java.util.concurrent.atomic.AtomicReferenceFieldUpdater d;
    public static final synthetic java.util.concurrent.atomic.AtomicLongFieldUpdater e;
    public static final synthetic java.util.concurrent.atomic.AtomicIntegerFieldUpdater f;
    private volatile synthetic int _availablePermits$volatile;
    public final d8.m a;
    private volatile synthetic long deqIdx$volatile;
    private volatile synthetic long enqIdx$volatile;
    private volatile synthetic Object head$volatile;
    private volatile synthetic Object tail$volatile;

    static g()
    {
        m8.g.b = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(m8.g, Object, "head$volatile");
        m8.g.c = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(m8.g, "deqIdx$volatile");
        m8.g.d = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(m8.g, Object, "tail$volatile");
        m8.g.e = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(m8.g, "enqIdx$volatile");
        m8.g.f = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(m8.g, "_availablePermits$volatile");
        return;
    }

    public g(int p7)
    {
        if ((p7 < null) || (p7 > 1)) {
            throw new IllegalArgumentException("The number of acquired permits should be in 0..1".toString());
        } else {
            m8.i v1_1 = new m8.i(0, 0, 2);
            this.head$volatile = v1_1;
            this.tail$volatile = v1_1;
            this._availablePermits$volatile = (1 - p7);
            this.a = new d8.m(this, 2);
            return;
        }
    }

    public final void a(m8.b p20)
    {
        d8.n v2 = p20.a;
        d8.m v3_2 = p20.b;
        do {
            Object v4_4 = m8.g.f.getAndDecrement(this);
            if (v4_4 > 1) {
                break;
            }
            h7.l v5_1 = h7.l.a;
            if (v4_4 <= null) {
                Object v4_1 = m8.g.d;
                int v7_1 = ((m8.i) v4_1.get(this));
                d4.l v8_1 = m8.g.e.getAndIncrement(this);
                long v11_2 = (v8_1 / ((long) m8.h.f));
                do {
                    Object v13 = i8.a.b(v7_1, v11_2, m8.e.a);
                    if (!i8.a.e(v13)) {
                        i8.r v14_1 = i8.a.c(v13);
                        while(true) {
                            i8.r v15_1 = ((i8.r) v4_1.get(this));
                            int v16 = v7_1;
                            v7_1 = v16;
                        }
                        if (v15_1.f()) {
                            v15_1.e();
                        }
                    }
                    Object v4_6 = ((m8.i) i8.a.c(v13));
                    int v6_9 = v4_6.e;
                    int v7_3 = ((int) (v8_1 % ((long) m8.h.f)));
                    while (!v6_9.compareAndSet(v7_3, 0, p20)) {
                        if (v6_9.get(v7_3) != null) {
                            d4.l v8_5 = m8.h.b;
                            while (!v6_9.compareAndSet(v7_3, v8_5, m8.h.c)) {
                                if (v6_9.get(v7_3) != v8_5) {
                                }
                            }
                            m8.c.g.set(v3_2, 0);
                            v2.A(v5_1, v2.c, new d8.m(new a6.i(v3_2, p20), 0));
                            return;
                        }
                    }
                    p20.a(v4_6, v7_3);
                    return;
                } while(v15_1.c < v14_1.c);
                if (!v14_1.j()) {
                    v7_1 = v16;
                }
                while (!v4_1.compareAndSet(this, v15_1, v14_1)) {
                    if (v4_1.get(this) != v15_1) {
                        if (v14_1.f()) {
                            v14_1.e();
                        }
                    }
                }
            } else {
                m8.c.g.set(v3_2, 0);
                v2.A(v5_1, v2.c, new d8.m(new a6.i(v3_2, p20), 0));
                return;
            }
        } while(v6_9.get(v7_3) != v8_5);
    }

    public final void b()
    {
        do {
            IllegalStateException v0_0 = m8.g.f;
            String v1_2 = v0_0.getAndIncrement(this);
            int v2_0 = 1;
            if (v1_2 < 1) {
                if (v1_2 >= null) {
                    break;
                }
                IllegalStateException v0_3 = m8.g.b;
                String v1_4 = ((m8.i) v0_3.get(this));
                Object v3_3 = m8.g.c.getAndIncrement(this);
                String v5_3 = (v3_3 / ((long) m8.h.f));
                do {
                    Object v8 = i8.a.b(v1_4, v5_3, m8.f.a);
                    if (!i8.a.e(v8)) {
                        i8.r v9_1 = i8.a.c(v8);
                        while(true) {
                            boolean v10_1 = ((i8.r) v0_3.get(this));
                            if (v10_1.c < v9_1.c) {
                            }
                            v9_1.e();
                        }
                    }
                    IllegalStateException v0_6 = ((m8.i) i8.a.c(v8));
                    String v1_6 = v0_6.e;
                    v0_6.b();
                    String v5_0 = 0;
                    if (v0_6.c <= v5_3) {
                        IllegalStateException v0_9 = ((int) (v3_3 % ((long) m8.h.f)));
                        Object v3_6 = v1_6.getAndSet(v0_9, m8.h.b);
                        if (v3_6 != null) {
                            if (v3_6 != m8.h.e) {
                                if (!(v3_6 instanceof d8.l)) {
                                    String v1_8 = new StringBuilder("unexpected: ");
                                    v1_8.append(v3_6);
                                    throw new IllegalStateException(v1_8.toString().toString());
                                } else {
                                    Object v3_7 = ((d8.l) v3_6);
                                    IllegalStateException v0_15 = v3_7.c(h7.l.a, this.a);
                                    if (v0_15 == null) {
                                        v2_0 = 0;
                                    } else {
                                        v3_7.e(v0_15);
                                    }
                                }
                            }
                        } else {
                            int v4_0 = 0;
                            while (v4_0 < m8.h.a) {
                                if (v1_6.get(v0_9) != m8.h.c) {
                                    v4_0++;
                                }
                            }
                            int v4_1 = m8.h.b;
                            while (!v1_6.compareAndSet(v0_9, v4_1, m8.h.d)) {
                                if (v1_6.get(v0_9) != v4_1) {
                                }
                                v2_0 = (1 ^ v5_0);
                            }
                            v5_0 = 1;
                        }
                    }
                    if (v2_0 != 0) {
                    }
                    return;
                } while(v9_1.j());
                while (!v0_3.compareAndSet(this, v10_1, v9_1)) {
                    if (v0_3.get(this) != v10_1) {
                        if (v9_1.f()) {
                        }
                    }
                }
                if (v10_1.f()) {
                    v10_1.e();
                }
            }
            do {
                String v1_5 = v0_0.get(this);
            } while((v1_5 <= 1) || (v0_0.compareAndSet(this, v1_5, 1)));
            throw new IllegalStateException("The number of released permits cannot be greater than 1".toString());
        } while(v2_0 != 0);
        return;
    }
}
