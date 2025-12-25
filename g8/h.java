package g8;
public final class h implements g8.c {
    public final synthetic l6.c a;
    public final synthetic a1.q b;

    public h(l6.c p1, a1.q p2)
    {
        this.a = p1;
        this.b = p2;
        return;
    }

    public final Object f(g8.d p9, n7.c p10)
    {
        g8.g v0_2;
        if (!(p10 instanceof g8.g)) {
            v0_2 = new g8.g(this, p10);
        } else {
            v0_2 = ((g8.g) p10);
            m7.a v1_2 = ((g8.g) p10).b;
            if ((v1_2 & -2147483648) == 0) {
            } else {
                ((g8.g) p10).b = (v1_2 - -2147483648);
            }
        }
        a1.q v2_1;
        Throwable v9_5;
        Throwable v10_1 = v0_2.a;
        m7.a v1_1 = m7.a.a;
        a1.q v2_0 = v0_2.b;
        if (v2_0 == null) {
            c4.b.e0(v10_1);
            try {
                Throwable v10_2 = this.a;
                v0_2.d = this;
                v0_2.e = p9;
                v0_2.b = 1;
            } catch (Throwable v9_1) {
                v2_1 = this;
                Throwable v10_5 = new g8.b0(v9_1);
                a1.q v2_3 = v2_1.b;
                v0_2.d = v9_1;
                v0_2.e = 0;
                v0_2.b = 2;
                if (g8.z.a(v10_5, v2_3, v9_1, v0_2) != v1_1) {
                    throw v9_1;
                } else {
                    return v1_1;
                }
            }
            if (v10_2.f(p9, v0_2) != v1_1) {
                v2_1 = this;
                Throwable v10_8 = new h8.g(p9, v0_2.getContext());
                try {
                    Throwable v9_2 = v2_1.b;
                    v0_2.d = v10_8;
                    v0_2.e = 0;
                    v0_2.b = 3;
                } catch (Throwable v9_4) {
                    Throwable v10_9 = v9_4;
                    v9_5 = v10_8;
                    v9_5.releaseIntercepted();
                    throw v10_9;
                }
                if (v9_2.b(v10_8, 0, v0_2) != v1_1) {
                    v9_5 = v10_8;
                }
            }
        } else {
            if (v2_0 == 1) {
                p9 = v0_2.e;
                v2_1 = ((g8.h) v0_2.d);
                try {
                    c4.b.e0(v10_1);
                } catch (Throwable v9_1) {
                }
            } else {
                if (v2_0 == 2) {
                    v9_1 = ((Throwable) v0_2.d);
                    c4.b.e0(v10_1);
                } else {
                    if (v2_0 != 3) {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    } else {
                        v9_5 = ((h8.g) v0_2.d);
                        try {
                            c4.b.e0(v10_1);
                        } catch (Throwable v10_9) {
                        }
                    }
                }
            }
        }
        v9_5.releaseIntercepted();
        return h7.l.a;
    }
}
