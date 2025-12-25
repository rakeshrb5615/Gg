package a1;
public final class g extends n7.i implements u7.p {
    public java.util.Iterator a;
    public c1.d b;
    public Object c;
    public int d;
    public synthetic Object e;
    public final synthetic java.util.List f;
    public final synthetic java.util.ArrayList m;

    public g(java.util.List p1, java.util.ArrayList p2, l7.c p3)
    {
        this.f = p1;
        this.m = p2;
        super(2, p3);
        return;
    }

    public final l7.c create(Object p4, l7.c p5)
    {
        a1.g v0_1 = new a1.g(this.f, this.m, p5);
        v0_1.e = p4;
        return v0_1;
    }

    public final Object invoke(Object p1, Object p2)
    {
        return ((a1.g) this.create(p1, ((l7.c) p2))).invokeSuspend(h7.l.a);
    }

    public final Object invokeSuspend(Object p11)
    {
        java.util.Iterator v1_1;
        java.util.List v4_0;
        java.util.Iterator v1_2;
        java.util.Iterator v5_0;
        c1.d v6_2;
        String v0_0 = m7.a.a;
        java.util.Iterator v1_0 = this.d;
        if (v1_0 == null) {
            c4.b.e0(p11);
            p11 = this.e;
            v1_2 = this.f.iterator();
            v4_0 = this.m;
            if (!v1_2.hasNext()) {
                return p11;
            } else {
                java.util.Iterator v5_3 = ((c1.d) v1_2.next());
                this.e = v4_0;
                this.a = v1_2;
                this.b = v5_3;
                this.c = p11;
                this.d = 1;
                c1.d v6_3 = v5_3.a(p11, this);
                if (v6_3 != v0_0) {
                    v1_1 = p11;
                    p11 = v6_3;
                    v6_2 = v5_3;
                    v5_0 = v1_2;
                    if (!((Boolean) p11).booleanValue()) {
                        p11 = v1_1;
                    } else {
                        v4_0.add(new a1.f(v6_2, 0, 0));
                        this.e = v4_0;
                        this.a = v5_0;
                        this.b = 0;
                        this.c = 0;
                        this.d = 2;
                        p11 = v6_2.b.b(new c1.f(((android.content.SharedPreferences) v6_2.e.getValue()), v6_2.f), v1_1, this);
                        if (p11 == v0_0) {
                            return v0_0;
                        }
                    }
                    v1_2 = v5_0;
                }
            }
        } else {
            if (v1_0 == 1) {
                v1_1 = this.c;
                java.util.List v4_1 = this.b;
                v5_0 = this.a;
                c1.d v6_1 = ((java.util.List) this.e);
                c4.b.e0(p11);
                v6_2 = v4_1;
                v4_0 = v6_1;
            } else {
                if (v1_0 != 2) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                } else {
                    v1_2 = this.a;
                    v4_0 = ((java.util.List) this.e);
                    c4.b.e0(p11);
                }
            }
        }
        return v0_0;
    }
}
