package r6;
public final class y0 extends n7.i implements u7.p {
    public final synthetic int a;
    public int b;
    public final synthetic r6.c1 c;

    public synthetic y0(r6.c1 p1, l7.c p2, int p3)
    {
        this.a = p3;
        this.c = p1;
        super(2, p2);
        return;
    }

    public final l7.c create(Object p3, l7.c p4)
    {
        switch (this.a) {
            case 0:
                return new r6.y0(this.c, p4, 0);
            default:
                return new r6.y0(this.c, p4, 1);
        }
    }

    public final Object invoke(Object p2, Object p3)
    {
        switch (this.a) {
            case 0:
                return ((r6.y0) this.create(((d8.c0) p2), ((l7.c) p3))).invokeSuspend(h7.l.a);
            default:
                return ((r6.y0) this.create(((d8.c0) p2), ((l7.c) p3))).invokeSuspend(h7.l.a);
        }
    }

    public final Object invokeSuspend(Object p7)
    {
        switch (this.a) {
            case 0:
                r6.f1 v0_1 = m7.a.a;
                int v1_3 = this.b;
                if (v1_3 == 0) {
                    c4.b.e0(p7);
                    String v7_13 = this.c;
                    k2.c v4_2 = new k2.c(19, v7_13.e.b(), new r6.x0(v7_13, 0));
                    int v1_2 = new a1.s(v7_13, 2);
                    this.b = 1;
                    if (v4_2.f(v1_2, this) != v0_1) {
                        v0_1 = h7.l.a;
                    }
                } else {
                    if (v1_3 != 1) {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    } else {
                        c4.b.e0(p7);
                    }
                }
                return v0_1;
            default:
                r6.f1 v0_3 = m7.a.a;
                int v1_4 = this.b;
                k2.c v4_3 = this.c;
                try {
                    if (v1_4 == 0) {
                        c4.b.e0(p7);
                        String v7_4 = v4_3.e;
                        int v1_6 = new r6.a1(v4_3, 0, 0);
                        this.b = 1;
                        if (v7_4.a(v1_6, this) != v0_3) {
                            v0_3 = h7.l.a;
                        }
                    } else {
                        if (v1_4 != 1) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        } else {
                            c4.b.e0(p7);
                        }
                    }
                } catch (String v7_8) {
                    r6.f1 v0_6 = new StringBuilder("App backgrounded, failed to update data. Message: ");
                    v0_6.append(v7_8.getMessage());
                    android.util.Log.d("FirebaseSessions", v0_6.toString());
                    String v7_11 = v4_3.h;
                    if (v7_11 == null) {
                        kotlin.jvm.internal.j.i("localSessionData");
                        throw 0;
                    } else {
                        v4_3.h = r6.h0.a(v7_11, 0, v4_3.d.a(), 0, 5);
                    }
                }
                return v0_3;
        }
    }
}
