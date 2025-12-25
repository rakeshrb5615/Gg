package a1;
public final class l extends n7.i implements u7.l {
    public Object a;
    public java.io.Serializable b;
    public Object c;
    public Object d;
    public java.util.Iterator e;
    public int f;
    public int m;
    public final synthetic a1.g0 n;
    public final synthetic j6.s o;

    public l(a1.g0 p1, j6.s p2, l7.c p3)
    {
        this.n = p1;
        this.o = p2;
        super(1, p3);
        return;
    }

    public final l7.c create(l7.c p4)
    {
        return new a1.l(this.n, this.o, p4);
    }

    public final Object invoke(Object p2)
    {
        return ((a1.l) this.create(((l7.c) p2))).invokeSuspend(h7.l.a);
    }

    public final Object invokeSuspend(Object p14)
    {
        a1.k v9_0;
        kotlin.jvm.internal.o v11_0;
        m8.c v1_2;
        Object v2_5;
        kotlin.jvm.internal.r v4_1;
        int v0_1;
        kotlin.jvm.internal.r v10_1;
        m8.c v1_9;
        kotlin.jvm.internal.o v11_2;
        a1.k v9_2;
        m8.c v1_5;
        kotlin.jvm.internal.r v10_3;
        m8.c v1_11;
        kotlin.jvm.internal.o v12_0;
        int v0_0 = m7.a.a;
        m8.c v1_0 = this.m;
        Object v2_4 = this.o;
        a1.g0 v6 = this.n;
        if (v1_0 == null) {
            c4.b.e0(p14);
            v11_0 = m8.d.a();
            v10_1 = new kotlin.jvm.internal.o();
            v1_5 = new kotlin.jvm.internal.r();
            this.a = v11_0;
            this.b = v10_1;
            this.c = v1_5;
            this.d = v1_5;
            this.m = 1;
            p14 = a1.g0.g(v6, 1, this);
            if (p14 != v0_0) {
                v9_0 = v1_5;
                v1_5.a = ((a1.c) p14).b;
                Object v14_10 = new a1.k(v11_0, v10_1, v9_0, v6);
                m8.c v1_8 = ((java.util.List) v2_4.d);
                if (v1_8 == null) {
                    v2_4.d = 0;
                    this.a = v10_1;
                    this.b = v9_0;
                    this.c = v11_0;
                    this.d = 0;
                    this.e = 0;
                    this.m = 3;
                    v1_11 = ((m8.c) v11_0);
                    if (v1_11.d(this) != v0_0) {
                        v2_5 = v9_0;
                        v4_1 = v10_1;
                        try {
                            Object v14_2;
                            v4_1.a = 1;
                            ((m8.c) v1_11).f(0);
                            v1_2 = v2_5.a;
                        } catch (Object v14_1) {
                            ((m8.c) v1_2).f(0);
                            throw v14_1;
                        }
                        if (v1_2 == null) {
                            v14_2 = 0;
                        } else {
                            v14_2 = v1_2.hashCode();
                        }
                        Object v2_0 = v6.h();
                        this.a = v1_2;
                        this.b = 0;
                        this.c = 0;
                        this.f = v14_2;
                        this.m = 4;
                        Object v2_1 = v2_0.e(this);
                        if (v2_1 != v0_0) {
                            v0_1 = v14_2;
                            p14 = v2_1;
                        } else {
                            return v0_0;
                        }
                    }
                } else {
                    v1_9 = v1_8.iterator();
                    v12_0 = v11_0;
                    v11_2 = v10_1;
                    v10_3 = v9_0;
                    v9_2 = v14_10;
                    while (v1_9.hasNext()) {
                        Object v14_14 = ((u7.p) v1_9.next());
                        this.a = v12_0;
                        this.b = v11_2;
                        this.c = v10_3;
                        this.d = v9_2;
                        this.e = v1_9;
                        this.m = 2;
                        if (v14_14.invoke(v9_2, this) == v0_0) {
                            return v0_0;
                        }
                    }
                    v9_0 = v10_3;
                    v10_1 = v11_2;
                    v11_0 = v12_0;
                }
            }
        } else {
            if (v1_0 == 1) {
                v1_5 = ((kotlin.jvm.internal.r) this.d);
                v9_0 = ((kotlin.jvm.internal.r) this.c);
                v10_1 = ((kotlin.jvm.internal.o) this.b);
                v11_0 = ((m8.a) this.a);
                c4.b.e0(p14);
            } else {
                if (v1_0 == 2) {
                    v1_9 = this.e;
                    v9_2 = ((a1.k) this.d);
                    v10_3 = ((kotlin.jvm.internal.r) this.c);
                    v11_2 = ((kotlin.jvm.internal.o) this.b);
                    v12_0 = ((m8.a) this.a);
                    c4.b.e0(p14);
                } else {
                    if (v1_0 == 3) {
                        v1_11 = ((m8.a) this.c);
                        v2_5 = ((kotlin.jvm.internal.r) this.b);
                        v4_1 = ((kotlin.jvm.internal.o) this.a);
                        c4.b.e0(p14);
                    } else {
                        if (v1_0 != 4) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        } else {
                            v0_1 = this.f;
                            v1_2 = this.a;
                            c4.b.e0(p14);
                        }
                    }
                }
            }
        }
        return new a1.c(v1_2, v0_1, ((Number) p14).intValue());
    }
}
