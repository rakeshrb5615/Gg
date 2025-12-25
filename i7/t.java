package i7;
public final class t extends n7.h implements u7.p {
    public Object b;
    public java.util.Iterator c;
    public int d;
    public int e;
    public int f;
    public synthetic Object m;
    public final synthetic java.util.Iterator n;

    public t(java.util.Iterator p1, l7.c p2)
    {
        this.n = p1;
        super(2, p2);
        return;
    }

    public final l7.c create(Object p3, l7.c p4)
    {
        i7.t v0_1 = new i7.t(this.n, p4);
        v0_1.m = p3;
        return v0_1;
    }

    public final Object invoke(Object p1, Object p2)
    {
        return ((i7.t) this.create(((a8.g) p1), ((l7.c) p2))).invokeSuspend(h7.l.a);
    }

    public final Object invokeSuspend(Object p18)
    {
        int v3_1;
        int v8_1;
        i7.s v6_7;
        i7.s v9_4;
        int v10_0;
        int v16_0;
        m7.a v1_5 = ((a8.g) this.m);
        String v2_1 = m7.a.a;
        int v3_4 = this.f;
        i7.s v6_5 = 1;
        if (v3_4 == 0) {
            v16_0 = 1;
            c4.b.e0(p18);
            v3_1 = 0;
            v6_7 = 0;
            v10_0 = new java.util.ArrayList(20);
            v9_4 = this.n;
            v8_1 = 20;
            while (v9_4.hasNext()) {
                int v11_1 = v9_4.next();
                if (v3_1 <= 0) {
                    v10_0.add(v11_1);
                    if (v10_0.size() == 20) {
                        this.m = v1_5;
                        this.b = v10_0;
                        this.c = v9_4;
                        this.d = v8_1;
                        this.e = v6_7;
                        this.f = v16_0;
                        v1_5.d(v10_0, this);
                        return v2_1;
                    }
                } else {
                    v3_1--;
                }
            }
            if (!v10_0.isEmpty()) {
                this.m = 0;
                this.b = 0;
                this.c = 0;
                this.d = v8_1;
                this.e = v6_7;
                this.f = 2;
                v1_5.d(v10_0, this);
                return v2_1;
            }
        } else {
            if (v3_4 == 1) {
                v16_0 = 1;
                v3_1 = this.e;
                i7.s v6_8 = this.d;
                int v8_2 = this.c;
                c4.b.e0(p18);
                v10_0 = new java.util.ArrayList(20);
                v9_4 = v8_2;
                v8_1 = v6_8;
                v6_7 = v3_1;
            } else {
                if (v3_4 != 2) {
                    i7.s v9_3;
                    i7.s v6_6;
                    int v3_0;
                    if (v3_4 == 3) {
                        v3_0 = this.e;
                        int v10_1 = this.d;
                        int v11_4 = this.c;
                        i7.s v12_1 = ((i7.s) this.b);
                        c4.b.e0(p18);
                        v12_1.c();
                        while(true) {
                            int v13_2 = v12_1.b;
                            Object[] v14 = v12_1.a;
                            if (!v11_4.hasNext()) {
                                v6_6 = v10_1;
                                v9_3 = v12_1;
                            } else {
                                Object v15_1 = v11_4.next();
                                int v16_1 = v6_5;
                                if (v12_1.b() == v13_2) {
                                    throw new IllegalStateException("ring buffer is full");
                                } else {
                                    Object[] v4_15 = v12_1.d;
                                    v14[((v12_1.c + v4_15) % v13_2)] = v15_1;
                                    v12_1.d = (v4_15 + 1);
                                    if (v12_1.b() == v13_2) {
                                        if (v12_1.d >= 20) {
                                            break;
                                        }
                                        int v13_1 = ((v13_2 + (v13_2 >> 1)) + 1);
                                        if (v13_1 > 20) {
                                            v13_1 = 20;
                                        }
                                        Object[] v4_8;
                                        if (v12_1.c != 0) {
                                            Object[] v4_7 = new Object[v13_1];
                                            v4_8 = v12_1.toArray(v4_7);
                                        } else {
                                            v4_8 = java.util.Arrays.copyOf(v14, v13_1);
                                            kotlin.jvm.internal.j.d(v4_8, "copyOf(...)");
                                        }
                                        v12_1 = new i7.s(v4_8, v12_1.d);
                                    }
                                    v6_5 = v16_1;
                                }
                            }
                        }
                        Object[] v4_4 = new java.util.ArrayList(v12_1);
                        this.m = v1_5;
                        this.b = v12_1;
                        this.c = v11_4;
                        this.d = v10_1;
                        this.e = v3_0;
                        this.f = 3;
                        v1_5.d(v4_4, this);
                        return v2_1;
                    } else {
                        if (v3_4 == 4) {
                            v3_0 = this.e;
                            v6_6 = this.d;
                            v9_3 = ((i7.s) this.b);
                            c4.b.e0(p18);
                            v9_3.c();
                        } else {
                            if (v3_4 != 5) {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                            c4.b.e0(p18);
                            return h7.l.a;
                        }
                    }
                    if (v9_3.d <= 20) {
                        if (v9_3.isEmpty()) {
                            return h7.l.a;
                        } else {
                            this.m = 0;
                            this.b = 0;
                            this.c = 0;
                            this.d = v6_6;
                            this.e = v3_0;
                            this.f = 5;
                            v1_5.d(v9_3, this);
                            return v2_1;
                        }
                    } else {
                        Object[] v4_12 = new java.util.ArrayList(v9_3);
                        this.m = v1_5;
                        this.b = v9_3;
                        this.c = 0;
                        this.d = v6_6;
                        this.e = v3_0;
                        this.f = 4;
                        v1_5.d(v4_12, this);
                        return v2_1;
                    }
                }
            }
        }
        return h7.l.a;
    }
}
