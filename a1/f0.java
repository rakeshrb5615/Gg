package a1;
public final class f0 extends n7.i implements u7.p {
    public kotlin.jvm.internal.p a;
    public int b;
    public synthetic Object c;
    public final synthetic kotlin.jvm.internal.p d;
    public final synthetic a1.g0 e;
    public final synthetic Object f;
    public final synthetic boolean m;

    public f0(kotlin.jvm.internal.p p1, a1.g0 p2, Object p3, boolean p4, l7.c p5)
    {
        this.d = p1;
        this.e = p2;
        this.f = p3;
        this.m = p4;
        super(2, p5);
        return;
    }

    public final l7.c create(Object p7, l7.c p8)
    {
        a1.f0 v0_1 = new a1.f0(this.d, this.e, this.f, this.m, p8);
        v0_1.c = p7;
        return v0_1;
    }

    public final Object invoke(Object p1, Object p2)
    {
        return ((a1.f0) this.create(((a1.q0) p1), ((l7.c) p2))).invokeSuspend(h7.l.a);
    }

    public final Object invokeSuspend(Object p8)
    {
        int v1_3;
        a1.q0 v6_0;
        a1.c v0_0 = m7.a.a;
        int v1_0 = this.b;
        Object v2 = this.f;
        int v3_0 = this.e;
        kotlin.jvm.internal.p v4 = this.d;
        if (v1_0 == 0) {
            c4.b.e0(p8);
            h7.l v8_1 = ((a1.q0) this.c);
            int v1_1 = v3_0.h();
            this.c = v8_1;
            this.a = v4;
            this.b = 1;
            int v1_2 = v1_1.c(this);
            if (v1_2 != v0_0) {
                v6_0 = v8_1;
                p8 = v1_2;
                v1_3 = v4;
                v1_3.a = ((Number) p8).intValue();
                this.c = 0;
                this.a = 0;
                this.b = 2;
                if (v6_0.b(v2, this) == v0_0) {
                    return v0_0;
                }
            }
        } else {
            if (v1_0 == 1) {
                v1_3 = this.a;
                v6_0 = ((a1.q0) this.c);
                c4.b.e0(p8);
            } else {
                if (v1_0 != 2) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                } else {
                    c4.b.e0(p8);
                }
            }
        }
        if (this.m) {
            int v1_4;
            h7.l v8_9 = v3_0.h;
            if (v2 == null) {
                v1_4 = 0;
            } else {
                v1_4 = v2.hashCode();
            }
            v8_9.l(new a1.c(v2, v1_4, v4.a));
        }
        return h7.l.a;
    }
}
