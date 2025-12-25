package a1;
public final class b1 extends kotlin.jvm.internal.k implements u7.l {
    public final synthetic int a;
    public final synthetic Object b;
    public final synthetic Object c;

    public synthetic b1(int p1, Object p2, Object p3)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        super(1);
        return;
    }

    public final Object invoke(Object p15)
    {
        switch (this.a) {
            case 0:
                String v0_5 = h7.l.a;
                if (kotlin.jvm.internal.j.a(((String) p15), ((java.io.File) this.b).getName())) {
                    IllegalStateException v15_5 = ((f8.p) ((f8.q) this.c));
                    if ((v15_5.d(v0_5) instanceof f8.i)) {
                        d8.f0.t(new a1.d(v15_5, 0, 4));
                    }
                }
                return v0_5;
            case 1:
                ((a1.d0) this.b).invoke(((Throwable) p15));
                a1.d v1_0 = ((f8.c) ((j6.s) this.c).d);
                v1_0.g(0, ((Throwable) p15));
                do {
                    long v2_12;
                    v1_0.getClass();
                    String v0_8 = f8.c.c;
                    long v2_7 = v0_8.get(v1_0);
                    java.util.concurrent.atomic.AtomicLongFieldUpdater v7 = f8.c.b;
                    String v4_1 = v7.get(v1_0);
                    if (!v1_0.r(v4_1, 1)) {
                        if (v2_7 < (v4_1 & 1152921504606846975)) {
                            int v6_1 = f8.e.k;
                            long v2_11 = ((f8.k) f8.c.m.get(v1_0));
                            while (!v1_0.r(v7.get(v1_0), 1)) {
                                String v4_3 = v0_8.getAndIncrement(v1_0);
                                long v10_0 = ((long) f8.e.b);
                                long v12 = (v4_3 / v10_0);
                                long v3_7 = ((int) (v4_3 % v10_0));
                                if (v2_11.c != v12) {
                                    long v10_4 = v1_0.l(v12, v2_11);
                                    if (v10_4 != 0) {
                                        v2_11 = v10_4;
                                    }
                                }
                                long v10_5 = v1_0.z(v2_11, v3_7, v4_3, v6_1);
                                if (v10_5 != f8.e.m) {
                                    if (v10_5 != f8.e.o) {
                                        if (v10_5 == f8.e.n) {
                                            throw new IllegalStateException("unexpected");
                                        } else {
                                            v2_11.b();
                                            v2_12 = v10_5;
                                            long v3_1 = 0;
                                            if ((v2_12 instanceof f8.i)) {
                                                v2_12 = 0;
                                            }
                                            String v0_20 = h7.l.a;
                                            if (v2_12 != 0) {
                                                long v3_0;
                                                long v2_16 = ((a1.t0) v2_12).b;
                                                if (((Throwable) p15) != null) {
                                                    v3_0 = ((Throwable) p15);
                                                } else {
                                                    v3_0 = new java.util.concurrent.CancellationException("DataStore scope was cancelled before updateData could complete");
                                                }
                                                v2_16.O(v3_0);
                                                v3_1 = v0_20;
                                            }
                                        }
                                    } else {
                                        if (v4_3 < v1_0.p()) {
                                            v2_11.b();
                                        }
                                    }
                                } else {
                                    int v6_2;
                                    if (!(v6_1 instanceof d8.f2)) {
                                        v6_2 = 0;
                                    } else {
                                        v6_2 = ((d8.f2) v6_1);
                                    }
                                    if (v6_2 != 0) {
                                        v6_2.a(v2_11, v3_7);
                                    }
                                    v1_0.B(v4_3);
                                    v2_11.i();
                                }
                            }
                            v2_12 = new f8.h(v1_0.m());
                        }
                        v2_12 = f8.j.b;
                    } else {
                        v2_12 = new f8.h(v1_0.m());
                    }
                } while(v3_1 != 0);
                return v0_20;
            default:
                String v0_7 = ((t.i) this.b);
                if (((Throwable) p15) == null) {
                    IllegalStateException v15_11 = ((d8.j0) this.c).q();
                    v0_7.d = 1;
                    long v2_3 = v0_7.b;
                    if ((v2_3 != 0) && (v2_3.b.j(v15_11))) {
                        v0_7.a = 0;
                        v0_7.b = 0;
                        v0_7.c = 0;
                    }
                } else {
                    if (!(((Throwable) p15) instanceof java.util.concurrent.CancellationException)) {
                        v0_7.d = 1;
                        long v2_5 = v0_7.b;
                        if ((v2_5 != 0) && (v2_5.b.k(((Throwable) p15)))) {
                            v0_7.a = 0;
                            v0_7.b = 0;
                            v0_7.c = 0;
                        }
                    } else {
                        v0_7.d = 1;
                        IllegalStateException v15_14 = v0_7.b;
                        if ((v15_14 != null) && (v15_14.b.cancel(1))) {
                            v0_7.a = 0;
                            v0_7.b = 0;
                            v0_7.c = 0;
                        }
                    }
                }
                return h7.l.a;
        }
    }
}
