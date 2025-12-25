package d8;
public abstract class a extends d8.r1 implements l7.c, d8.c0 {
    public final l7.h c;

    public a(l7.h p1, boolean p2)
    {
        super(p2);
        super.x(((d8.e1) p1.get(d8.b0.b)));
        super.c = p1.plus(super);
        return;
    }

    public final void F(Object p3)
    {
        if (!(p3 instanceof d8.w)) {
            this.P(p3);
            return;
        } else {
            int v3_1;
            if (d8.w.b.get(((d8.w) p3)) == 0) {
                v3_1 = 0;
            } else {
                v3_1 = 1;
            }
            this.O(v3_1, ((d8.w) p3).a);
            return;
        }
    }

    public void O(boolean p1, Throwable p2)
    {
        return;
    }

    public void P(Object p1)
    {
        return;
    }

    public final void Q(d8.d0 p4, d8.a p5, u7.p p6)
    {
        m7.a v4_1 = p4.ordinal();
        Object v0_0 = h7.l.a;
        if (v4_1 == null) {
            try {
                i8.a.h(v0_0, q4.b.C(q4.b.k(p5, this, p6)));
                return;
            } catch (m7.a v4_2) {
                this.resumeWith(c4.b.p(v4_2));
                throw v4_2;
            }
        } else {
            if (v4_1 != 1) {
                if (v4_1 == 2) {
                    kotlin.jvm.internal.j.e(p6, "<this>");
                    q4.b.C(q4.b.k(p5, this, p6)).resumeWith(v0_0);
                } else {
                    if (v4_1 != 3) {
                        throw new a5.o();
                    } else {
                        try {
                            m7.a v4_8 = this.c;
                            Object v0_3 = i8.a.l(v4_8, 0);
                        } catch (m7.a v4_10) {
                            this.resumeWith(c4.b.p(v4_10));
                            return;
                        }
                        Object v5_2;
                        if ((p6 instanceof n7.a)) {
                            kotlin.jvm.internal.u.a(2, p6);
                            v5_2 = p6.invoke(p5, this);
                        } else {
                            v5_2 = q4.b.U(p6, p5, this);
                        }
                        i8.a.g(v4_8, v0_3);
                        if (v5_2 != m7.a.a) {
                            this.resumeWith(v5_2);
                            return;
                        }
                    }
                }
            }
            return;
        }
    }

    public final l7.h a()
    {
        return this.c;
    }

    public final l7.h getContext()
    {
        return this.c;
    }

    public final String l()
    {
        return this.getClass().getSimpleName().concat(" was cancelled");
    }

    public final void resumeWith(Object p3)
    {
        d4.l v0_0 = h7.h.a(p3);
        if (v0_0 != null) {
            p3 = new d8.w(0, v0_0);
        }
        Object v3_2 = this.B(p3);
        if (v3_2 != d8.f0.e) {
            this.g(v3_2);
            return;
        } else {
            return;
        }
    }

    public final void w(a5.o p2)
    {
        d8.f0.l(p2, this.c);
        return;
    }
}
