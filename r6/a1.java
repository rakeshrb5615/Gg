package r6;
public final class a1 extends n7.i implements u7.p {
    public final synthetic int a;
    public synthetic Object b;
    public final synthetic r6.c1 c;

    public synthetic a1(r6.c1 p1, l7.c p2, int p3)
    {
        this.a = p3;
        this.c = p1;
        super(2, p2);
        return;
    }

    public final l7.c create(Object p4, l7.c p5)
    {
        switch (this.a) {
            case 0:
                r6.a1 v0_3 = new r6.a1(this.c, p5, 0);
                v0_3.b = p4;
                return v0_3;
            default:
                r6.a1 v0_1 = new r6.a1(this.c, p5, 1);
                v0_1.b = p4;
                return v0_1;
        }
    }

    public final Object invoke(Object p2, Object p3)
    {
        switch (this.a) {
            case 0:
                return ((r6.a1) this.create(((r6.h0) p2), ((l7.c) p3))).invokeSuspend(h7.l.a);
            default:
                return ((r6.a1) this.create(((r6.h0) p2), ((l7.c) p3))).invokeSuspend(h7.l.a);
        }
    }

    public final Object invokeSuspend(Object p17)
    {
        java.util.Map v2_6 = this.c;
        switch (this.a) {
            case 0:
                c4.b.e0(p17);
                return r6.h0.a(((r6.h0) this.b), 0, v2_6.d.a(), 0, 5);
            default:
                int v10_0;
                c4.b.e0(p17);
                r6.h0 v1_1 = ((r6.h0) this.b);
                int v4_4 = v2_6.d(v1_1);
                r6.c0 v5 = v2_6.f;
                java.util.Map v6_0 = v1_1.c;
                if (v6_0 == null) {
                    android.util.Log.d("FirebaseSessions", "No process data map");
                    v10_0 = 1;
                } else {
                    v5.getClass();
                    if (!v5.f) {
                        r6.m0 v9_4 = r6.e0.a(v5.a);
                        java.util.ArrayList v11_1 = new java.util.ArrayList();
                        boolean v12_0 = v9_4.size();
                        String v13_0 = 0;
                        while (v13_0 < v12_0) {
                            int v10_2;
                            int v14_3 = v9_4.get(v13_0);
                            v13_0++;
                            int v14_4 = ((r6.d0) v14_3);
                            String v15_3 = ((r6.a0) v6_0.get(v14_4.a));
                            if (v15_3 == null) {
                                v10_2 = 0;
                            } else {
                                v10_2 = new h7.f(v14_4, v15_3);
                            }
                            if (v10_2 != 0) {
                                v11_1.add(v10_2);
                            }
                        }
                        if (!v11_1.isEmpty()) {
                            r6.m0 v9_6 = v11_1.size();
                            int v10_1 = 0;
                            while (v10_1 < v9_6) {
                                boolean v12_1 = v11_1.get(v10_1);
                                v10_1++;
                                boolean v12_2 = ((h7.f) v12_1);
                                String v13_2 = ((r6.d0) v12_2.a);
                                boolean v12_4 = ((r6.a0) v12_2.b);
                                String v13_3 = v13_2.b;
                                if (!kotlin.jvm.internal.j.a(v5.a(), v13_2.a)) {
                                    if (v13_3 == v12_4.a) {
                                        v10_0 = 0;
                                        if (v10_0 != 0) {
                                            android.util.Log.d("FirebaseSessions", "Cold app start detected");
                                        }
                                        r6.q0 v7_3 = v2_6.c(v1_1);
                                        if (v10_0 == 0) {
                                            if (v7_3 != null) {
                                                v6_0 = v5.b(v6_0);
                                            }
                                        } else {
                                            v6_0 = v5.b(i7.o.a);
                                        }
                                        r6.m0 v9_0;
                                        if (v10_0 == 0) {
                                            v9_0 = v1_1.a;
                                        } else {
                                            v9_0 = 0;
                                        }
                                        if ((v4_4 == 0) && (v10_0 == 0)) {
                                            if (v7_3 != null) {
                                                v1_1 = r6.h0.a(v1_1, 0, 0, v5.b(v6_0), 3);
                                            }
                                        } else {
                                            r6.h0 v1_3 = v2_6.b.a(v9_0);
                                            java.util.Map v2_3 = ((r6.s0) v2_6.c);
                                            d8.f0.p(d8.f0.b(v2_3.e), new r6.q0(v2_3, v1_3, 0));
                                            v5.f = 1;
                                            v1_1 = new r6.h0(v1_3, 0, v6_0);
                                        }
                                        return v1_1;
                                    }
                                } else {
                                    if ((v13_3 == v12_4.a) && (kotlin.jvm.internal.j.a(((String) v5.d.getValue()), v12_4.b))) {
                                    }
                                }
                            }
                        }
                        v10_0 = 1;
                    }
                }
        }
    }
}
