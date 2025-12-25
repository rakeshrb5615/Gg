package e1;
public final class c extends n7.i implements u7.p {
    public final synthetic int a;
    public int b;
    public synthetic Object c;
    public final synthetic n7.i d;

    public c(u7.p p1, l7.c p2, int p3)
    {
        this.a = p3;
        switch (p3) {
            case 1:
                this.d = ((n7.i) p1);
                super(2, p2);
                return;
            default:
                super.d = ((n7.i) p1);
                super(2, p2);
                return;
        }
    }

    public final l7.c create(Object p4, l7.c p5)
    {
        switch (this.a) {
            case 0:
                e1.c v0_3 = new e1.c(this.d, p5, 0);
                v0_3.c = p4;
                return v0_3;
            default:
                e1.c v0_1 = new e1.c(this.d, p5, 1);
                v0_1.c = p4;
                return v0_1;
        }
    }

    public final Object invoke(Object p2, Object p3)
    {
        switch (this.a) {
            case 0:
                return ((e1.c) this.create(((e1.b) p2), ((l7.c) p3))).invokeSuspend(h7.l.a);
            default:
                return ((e1.c) this.create(((e1.b) p2), ((l7.c) p3))).invokeSuspend(h7.l.a);
        }
    }

    public final Object invokeSuspend(Object p5)
    {
        switch (this.a) {
            case 0:
                e1.b v0_2 = m7.a.a;
                n7.i v1_1 = this.b;
                if (v1_1 == null) {
                    c4.b.e0(p5);
                    java.util.concurrent.atomic.AtomicBoolean v5_16 = ((e1.b) this.c);
                    this.b = 1;
                    p5 = this.d.invoke(v5_16, this);
                    if (p5 != v0_2) {
                        v0_2 = ((e1.b) p5);
                        kotlin.jvm.internal.j.c(((e1.b) p5), "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
                        ((java.util.concurrent.atomic.AtomicBoolean) ((e1.b) p5).b.b).set(1);
                    }
                } else {
                    if (v1_1 != 1) {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    } else {
                        c4.b.e0(p5);
                    }
                }
                return v0_2;
            default:
                e1.b v0_4 = m7.a.a;
                n7.i v1_2 = this.b;
                if (v1_2 == null) {
                    c4.b.e0(p5);
                    n7.i v1_4 = new e1.b(i7.r.s0(((e1.b) this.c).a()), 0);
                    this.c = v1_4;
                    this.b = 1;
                    if (this.d.invoke(v1_4, this) != v0_4) {
                        v0_4 = v1_4;
                    }
                } else {
                    if (v1_2 != 1) {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    } else {
                        v0_4 = ((e1.b) this.c);
                        c4.b.e0(p5);
                    }
                }
                return v0_4;
        }
    }
}
