package u6;
public final class k {
    public final u6.p a;
    public final u6.p b;

    public k(u6.p p2, u6.p p3)
    {
        kotlin.jvm.internal.j.e(p2, "localOverrideSettings");
        kotlin.jvm.internal.j.e(p3, "remoteSettings");
        this.a = p2;
        this.b = p3;
        return;
    }

    public final double a()
    {
        double v0_5 = this.a.b();
        if (v0_5 != 0) {
            double v5_1 = v0_5.doubleValue();
            if ((0 <= v5_1) && (v5_1 <= 4607182418800017408)) {
                return v5_1;
            }
        }
        double v0_3 = this.b.b();
        if (v0_3 != 0) {
            double v5_0 = v0_3.doubleValue();
            if ((0 <= v5_0) && (v5_0 <= 4607182418800017408)) {
                return v5_0;
            }
        }
        return 4607182418800017408;
    }

    public final Object b(n7.c p6)
    {
        String v0_2;
        if (!(p6 instanceof u6.j)) {
            v0_2 = new u6.j(this, p6);
        } else {
            v0_2 = ((u6.j) p6);
            m7.a v1_2 = ((u6.j) p6).d;
            if ((v1_2 & -2147483648) == 0) {
            } else {
                ((u6.j) p6).d = (v1_2 - -2147483648);
            }
        }
        int v2_1;
        h7.l v6_1 = v0_2.b;
        m7.a v1_1 = m7.a.a;
        int v2_0 = v0_2.d;
        if (v2_0 == 0) {
            c4.b.e0(v6_1);
            v0_2.a = this;
            v0_2.d = 1;
            if (this.a.c(v0_2) != v1_1) {
                v2_1 = this;
                h7.l v6_4 = v2_1.b;
                v0_2.a = 0;
                v0_2.d = 2;
                if (v6_4.c(v0_2) == v1_1) {
                    return v1_1;
                }
            }
        } else {
            if (v2_0 == 1) {
                v2_1 = v0_2.a;
                c4.b.e0(v6_1);
            } else {
                if (v2_0 != 2) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                } else {
                    c4.b.e0(v6_1);
                }
            }
        }
        return h7.l.a;
    }
}
