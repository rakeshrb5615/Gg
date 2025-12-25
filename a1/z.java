package a1;
public final class z extends n7.i implements u7.l {
    public Throwable a;
    public int b;
    public final synthetic a1.g0 c;

    public z(a1.g0 p1, l7.c p2)
    {
        this.c = p1;
        super(1, p2);
        return;
    }

    public final l7.c create(l7.c p3)
    {
        return new a1.z(this.c, p3);
    }

    public final Object invoke(Object p2)
    {
        return ((a1.z) this.create(((l7.c) p2))).invokeSuspend(h7.l.a);
    }

    public final Object invokeSuspend(Object p6)
    {
        h7.f v6_2;
        a1.d1 v0_0 = m7.a.a;
        h7.f v1_0 = this.b;
        a1.g0 v2 = this.c;
        try {
            if (v1_0 == null) {
                c4.b.e0(p6);
                this.b = 1;
                p6 = a1.g0.g(v2, 1, this);
                if (p6 != v0_0) {
                    v6_2 = ((a1.l1) p6);
                } else {
                    return v0_0;
                }
            } else {
                if (v1_0 == 1) {
                    c4.b.e0(p6);
                } else {
                    if (v1_0 != 2) {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    } else {
                        a1.d1 v0_1 = this.a;
                        c4.b.e0(p6);
                        v6_2 = new a1.d1(((Number) p6).intValue(), v0_1);
                    }
                }
            }
        } catch (h7.f v6_1) {
            h7.f v1_1 = v2.h();
            this.a = v6_1;
            this.b = 2;
            h7.f v1_2 = v1_1.e(this);
            if (v1_2 != v0_0) {
                v0_1 = v6_1;
                p6 = v1_2;
            }
        }
        return new h7.f(v6_2, Boolean.TRUE);
    }
}
