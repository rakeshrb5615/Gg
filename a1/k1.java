package a1;
public final class k1 implements a1.s0 {
    public final m8.c a;
    public final l6.c b;
    public final l6.c c;

    public k1(String p3)
    {
        this.a = m8.d.a();
        this.b = new l6.c(1);
        this.c = new l6.c(new a1.j1(2, 0));
        return;
    }

    public final Object a(u7.l p8, n7.c p9)
    {
        a1.h1 v0_2;
        if (!(p9 instanceof a1.h1)) {
            v0_2 = new a1.h1(this, p9);
        } else {
            v0_2 = ((a1.h1) p9);
            m7.a v1_2 = ((a1.h1) p9).e;
            if ((v1_2 & -2147483648) == 0) {
            } else {
                ((a1.h1) p9).e = (v1_2 - -2147483648);
            }
        }
        Throwable v9_2;
        m8.c v8_4;
        Throwable v9_1 = v0_2.c;
        m7.a v1_1 = m7.a.a;
        u7.l v2_0 = v0_2.e;
        if (v2_0 == null) {
            c4.b.e0(v9_1);
            v0_2.a = p8;
            v9_2 = this.a;
            v0_2.b = v9_2;
            v0_2.e = 1;
            if (v9_2.d(v0_2) != v1_1) {
                try {
                    v0_2.a = v9_2;
                    v0_2.b = 0;
                    v0_2.e = 2;
                    m8.c v8_2 = p8.invoke(v0_2);
                } catch (m8.c v8_3) {
                    Throwable v9_3 = v8_3;
                    v8_4 = v9_2;
                    ((m8.c) v8_4).f(0);
                    throw v9_3;
                }
                if (v8_2 != v1_1) {
                    v9_1 = v8_2;
                    v8_4 = v9_2;
                } else {
                    return v1_1;
                }
            }
        } else {
            if (v2_0 == 1) {
                m8.c v8_1 = v0_2.b;
                u7.l v2_3 = ((u7.l) v0_2.a);
                c4.b.e0(v9_1);
                v9_2 = v8_1;
                p8 = v2_3;
            } else {
                if (v2_0 != 2) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                } else {
                    v8_4 = ((m8.a) v0_2.a);
                    try {
                        c4.b.e0(v9_1);
                    } catch (Throwable v9_3) {
                    }
                }
            }
        }
        ((m8.c) v8_4).f(0);
        return v9_1;
    }

    public final Object b(u7.p p7, n7.c p8)
    {
        Throwable v0_2;
        if (!(p8 instanceof a1.i1)) {
            v0_2 = new a1.i1(this, p8);
        } else {
            v0_2 = ((a1.i1) p8);
            m7.a v1_2 = ((a1.i1) p8).e;
            if ((v1_2 & -2147483648) == 0) {
            } else {
                ((a1.i1) p8).e = (v1_2 - -2147483648);
            }
        }
        boolean v7_3;
        Throwable v0_3;
        Throwable v8_1 = v0_2.c;
        m7.a v1_1 = m7.a.a;
        boolean v2_0 = v0_2.e;
        if (!v2_0) {
            c4.b.e0(v8_1);
            Throwable v8_2 = this.a;
            boolean v2_1 = v8_2.e();
            try {
                Boolean v5 = Boolean.valueOf(v2_1);
                v0_2.a = v8_2;
                v0_2.b = v2_1;
                v0_2.e = 1;
                boolean v7_1 = p7.invoke(v5, v0_2);
            } catch (boolean v7_2) {
                v0_3 = v8_2;
                Throwable v8_3 = v7_2;
                v7_3 = v2_1;
                if (v7_3) {
                    v0_3.f(0);
                }
                throw v8_3;
            }
            if (v7_1 != v1_1) {
                v0_3 = v8_2;
                v8_1 = v7_1;
                v7_3 = v2_1;
            } else {
                return v1_1;
            }
        } else {
            if (v2_0 != 1) {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            } else {
                v7_3 = v0_2.b;
                v0_3 = v0_2.a;
                try {
                    c4.b.e0(v8_1);
                } catch (Throwable v8_3) {
                }
            }
        }
        if (v7_3) {
            v0_3.f(0);
        }
        return v8_1;
    }

    public final Object c(a1.f0 p2)
    {
        return new Integer(((java.util.concurrent.atomic.AtomicInteger) this.b.b).incrementAndGet());
    }

    public final g8.c d()
    {
        return this.c;
    }

    public final Object e(n7.c p2)
    {
        return new Integer(((java.util.concurrent.atomic.AtomicInteger) this.b.b).get());
    }
}
