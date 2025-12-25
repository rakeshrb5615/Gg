package g8;
public final class m implements g8.d {
    public final synthetic int a;
    public final synthetic g8.d b;
    public final synthetic java.io.Serializable c;

    public m(a1.o p2, g8.d p3)
    {
        this.a = 1;
        this.c = p2;
        this.b = p3;
        return;
    }

    public m(g8.d p2, kotlin.jvm.internal.r p3)
    {
        this.a = 0;
        this.b = p2;
        this.c = p3;
        return;
    }

    public final Object a(Object p8, l7.c p9)
    {
        switch (this.a) {
            case 0:
                g8.l v0_2;
                if (!(p9 instanceof g8.l)) {
                    v0_2 = new g8.l(this, p9);
                } else {
                    v0_2 = ((g8.l) p9);
                    h7.l v1_5 = ((g8.l) p9).d;
                    if ((v1_5 & -2147483648) == 0) {
                    } else {
                        ((g8.l) p9).d = (v1_5 - -2147483648);
                    }
                }
                h8.a v9_3 = v0_2.b;
                h7.l v1_2 = m7.a.a;
                g8.d v2_0 = v0_2.d;
                if (v2_0 == null) {
                    c4.b.e0(v9_3);
                    try {
                        h8.a v9_4 = this.b;
                        v0_2.a = this;
                        v0_2.d = 1;
                    } catch (h8.a v9_5) {
                        kotlin.jvm.internal.r v8_2 = this;
                        ((kotlin.jvm.internal.r) v8_2.c).a = v9_5;
                        throw v9_5;
                    }
                    if (v9_4.a(p8, v0_2) != v1_2) {
                        v1_2 = h7.l.a;
                    }
                } else {
                    if (v2_0 != 1) {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    } else {
                        v8_2 = v0_2.a;
                        try {
                            c4.b.e0(v9_3);
                        } catch (h8.a v9_5) {
                        }
                    }
                }
                return v1_2;
            default:
                g8.l v0_7;
                if (!(p9 instanceof g8.q)) {
                    v0_7 = new g8.q(this, p9);
                } else {
                    v0_7 = ((g8.q) p9);
                    h7.l v1_3 = ((g8.q) p9).c;
                    if ((v1_3 & -2147483648) == 0) {
                    } else {
                        ((g8.q) p9).c = (v1_3 - -2147483648);
                    }
                }
                kotlin.jvm.internal.r v8_7;
                h8.a v9_11;
                g8.d v2_3;
                h8.a v9_7 = v0_7.b;
                h7.l v1_0 = m7.a.a;
                g8.d v2_2 = v0_7.c;
                int v4 = 1;
                if (v2_2 == null) {
                    c4.b.e0(v9_7);
                    h8.a v9_9 = ((a1.o) this.c);
                    v0_7.a = this;
                    v0_7.e = p8;
                    v0_7.c = 1;
                    h8.a v9_10 = v9_9.invoke(p8, v0_7);
                    if (v9_10 != v1_0) {
                        v2_3 = v9_10;
                        v9_11 = p8;
                        v8_7 = this;
                        if (!((Boolean) v2_3).booleanValue()) {
                            v4 = 0;
                            if (v4 == 0) {
                                throw new h8.a(v8_7);
                            } else {
                                v1_0 = h7.l.a;
                            }
                        } else {
                            g8.d v2_8 = v8_7.b;
                            v0_7.a = v8_7;
                            v0_7.e = 0;
                            v0_7.c = 2;
                            if (v2_8.a(v9_11, v0_7) != v1_0) {
                            }
                        }
                    }
                } else {
                    if (v2_2 == 1) {
                        kotlin.jvm.internal.r v8_8 = v0_7.e;
                        g8.d v2_5 = v0_7.a;
                        c4.b.e0(v9_7);
                        v9_11 = v8_8;
                        v8_7 = v2_5;
                        v2_3 = v9_7;
                    } else {
                        if (v2_2 != 2) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        } else {
                            v8_7 = v0_7.a;
                            c4.b.e0(v9_7);
                        }
                    }
                }
                return v1_0;
        }
    }
}
