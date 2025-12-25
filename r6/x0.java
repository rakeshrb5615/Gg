package r6;
public final class x0 extends n7.i implements u7.q {
    public int a;
    public synthetic g8.d b;
    public synthetic Throwable c;
    public final synthetic r6.c1 d;

    public x0(r6.c1 p1, l7.c p2)
    {
        this.d = p1;
        super(3, p2);
        return;
    }

    public final Object b(Object p3, Object p4, Object p5)
    {
        r6.x0 v0_1 = new r6.x0(this.d, ((l7.c) p5));
        v0_1.b = ((g8.d) p3);
        v0_1.c = ((Throwable) p4);
        return v0_1.invokeSuspend(h7.l.a);
    }

    public final Object invokeSuspend(Object p9)
    {
        String v0_0 = m7.a.a;
        String v1_0 = this.a;
        if (v1_0 == null) {
            c4.b.e0(p9);
            h7.l v9_5 = this.b;
            String v1_5 = this.c;
            String v4_0 = this.d.b.a(0);
            r6.h0 v3_0 = new r6.h0(v4_0, 0, 0);
            StringBuilder v6_1 = new StringBuilder("Init session datastore failed with exception message: ");
            v6_1.append(v1_5.getMessage());
            v6_1.append(". Emit fallback session ");
            v6_1.append(v4_0.a);
            android.util.Log.d("FirebaseSessions", v6_1.toString());
            this.b = 0;
            this.a = 1;
            if (v9_5.a(v3_0, this) == v0_0) {
                return v0_0;
            }
        } else {
            if (v1_0 != 1) {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            } else {
                c4.b.e0(p9);
            }
        }
        return h7.l.a;
    }
}
