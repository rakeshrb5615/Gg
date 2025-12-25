package a1;
public final class c0 extends n7.i implements u7.l {
    public final synthetic int a;
    public int b;
    public final synthetic a1.g0 c;
    public Object d;
    public final synthetic Object e;
    public final synthetic java.io.Serializable f;

    public c0(a1.g0 p2, l7.h p3, u7.p p4, l7.c p5)
    {
        this.a = 1;
        this.c = p2;
        this.e = p3;
        this.f = ((n7.i) p4);
        super(1, p5);
        return;
    }

    public c0(kotlin.jvm.internal.r p2, a1.g0 p3, kotlin.jvm.internal.p p4, l7.c p5)
    {
        this.a = 0;
        this.e = p2;
        this.c = p3;
        this.f = p4;
        super(1, p5);
        return;
    }

    public final l7.c create(l7.c p5)
    {
        switch (this.a) {
            case 0:
                return new a1.c0(((kotlin.jvm.internal.r) this.e), this.c, ((kotlin.jvm.internal.p) this.f), p5);
            default:
                return new a1.c0(this.c, ((l7.h) this.e), ((n7.i) this.f), p5);
        }
    }

    public final Object invoke(Object p2)
    {
        switch (this.a) {
            case 0:
                return ((a1.c0) this.create(((l7.c) p2))).invokeSuspend(h7.l.a);
            default:
                return ((a1.c0) this.create(((l7.c) p2))).invokeSuspend(h7.l.a);
        }
    }

    public final Object invokeSuspend(Object p10)
    {
        switch (this.a) {
            case 0:
                String v3_0;
                String v3_3;
                IllegalStateException v0_5 = ((kotlin.jvm.internal.p) this.f);
                Object v1_4 = ((kotlin.jvm.internal.r) this.e);
                h7.l v2_0 = m7.a.a;
                String v3_7 = this.b;
                int v6_0 = this.c;
                try {
                    if (v3_7 == null) {
                        c4.b.e0(p10);
                        this.d = v1_4;
                        this.b = 1;
                        p10 = v6_0.j(this);
                        if (p10 != v2_0) {
                            v3_0 = v1_4;
                            v3_0.a = p10;
                            IllegalStateException v10_5 = v6_0.h();
                            this.d = v0_5;
                            this.b = 2;
                            p10 = v10_5.e(this);
                            if (p10 != v2_0) {
                                v3_3 = v0_5;
                                v3_3.a = ((Number) p10).intValue();
                                v2_0 = h7.l.a;
                            } else {
                            }
                        } else {
                        }
                    } else {
                        if (v3_7 == 1) {
                            v3_0 = ((kotlin.jvm.internal.r) ((java.io.Serializable) this.d));
                            c4.b.e0(p10);
                        } else {
                            if (v3_7 == 2) {
                                v3_3 = ((kotlin.jvm.internal.p) ((java.io.Serializable) this.d));
                                c4.b.e0(p10);
                            } else {
                                if (v3_7 != 3) {
                                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                } else {
                                    v0_5 = ((kotlin.jvm.internal.p) ((java.io.Serializable) this.d));
                                    c4.b.e0(p10);
                                    v0_5.a = ((Number) p10).intValue();
                                }
                            }
                        }
                    }
                } catch (a1.b) {
                    IllegalStateException v10_6 = v1_4.a;
                    this.d = v0_5;
                    this.b = 3;
                    p10 = v6_0.k(v10_6, 1, this);
                    if (p10 != v2_0) {
                    }
                }
                return v2_0;
            default:
                Object v1_7;
                IllegalStateException v0_2 = m7.a.a;
                Object v1_5 = this.b;
                h7.l v2_1 = this.c;
                if (v1_5 == null) {
                    c4.b.e0(p10);
                    this.b = 1;
                    p10 = a1.g0.g(v2_1, 1, this);
                    if (p10 != v0_2) {
                        v1_7 = ((a1.c) p10);
                        IllegalStateException v10_14 = ((l7.h) this.e);
                        int v6_3 = new a1.d(((n7.i) this.f), ((a1.c) p10), 0);
                        this.d = ((a1.c) p10);
                        this.b = 2;
                        p10 = d8.f0.x(v10_14, v6_3, this);
                        if (p10 != v0_2) {
                            int v4_0;
                            int v4_3 = v1_7.b;
                            if (v4_3 == 0) {
                                v4_0 = 0;
                            } else {
                                v4_0 = v4_3.hashCode();
                            }
                            if (v4_0 != v1_7.c) {
                                throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                            } else {
                                if (!kotlin.jvm.internal.j.a(v1_7.b, p10)) {
                                    this.d = p10;
                                    this.b = 3;
                                    if (v2_1.k(p10, 1, this) == v0_2) {
                                        return v0_2;
                                    }
                                }
                                v0_2 = p10;
                            }
                        }
                    }
                } else {
                    if (v1_5 == 1) {
                        c4.b.e0(p10);
                    } else {
                        if (v1_5 == 2) {
                            v1_7 = ((a1.c) this.d);
                            c4.b.e0(p10);
                        } else {
                            if (v1_5 != 3) {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            } else {
                                v0_2 = this.d;
                                c4.b.e0(p10);
                            }
                        }
                    }
                }
                return v0_2;
        }
    }
}
