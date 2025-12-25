package q0;
public final class s0 extends n7.h implements u7.p {
    public int b;
    public synthetic Object c;
    public final synthetic android.view.View d;

    public s0(android.view.View p1, l7.c p2)
    {
        this.d = p1;
        super(2, p2);
        return;
    }

    public final l7.c create(Object p3, l7.c p4)
    {
        q0.s0 v0_1 = new q0.s0(this.d, p4);
        v0_1.c = p3;
        return v0_1;
    }

    public final Object invoke(Object p1, Object p2)
    {
        return ((q0.s0) this.create(((a8.g) p1), ((l7.c) p2))).invokeSuspend(h7.l.a);
    }

    public final Object invokeSuspend(Object p8)
    {
        String v0_0 = m7.a.a;
        a8.g v1_0 = this.b;
        boolean v2_0 = this.d;
        if (v1_0 == null) {
            c4.b.e0(p8);
            h7.l v8_9 = ((a8.g) this.c);
            this.c = v8_9;
            this.b = 1;
            v8_9.d(v2_0, this);
            return v0_0;
        } else {
            h7.l v4 = h7.l.a;
            if (v1_0 == 1) {
                a8.g v1_2 = ((a8.g) this.c);
                c4.b.e0(p8);
                if ((v2_0 instanceof android.view.ViewGroup)) {
                    h7.l v8_5;
                    boolean v2_1 = ((android.view.ViewGroup) v2_0);
                    this.c = 0;
                    this.b = 2;
                    v1_2.getClass();
                    h7.l v8_4 = new a8.l(new a8.b(v2_1, 3));
                    if (v8_4.b.hasNext()) {
                        v1_2.c = v8_4;
                        v1_2.a = 2;
                        v1_2.d = this;
                        v8_5 = v0_0;
                    } else {
                        v8_5 = v4;
                    }
                    if (v8_5 != v0_0) {
                        v8_5 = v4;
                    }
                    if (v8_5 == v0_0) {
                        return v0_0;
                    }
                }
                return v4;
            } else {
                if (v1_0 != 2) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                } else {
                    c4.b.e0(p8);
                    return v4;
                }
            }
        }
    }
}
