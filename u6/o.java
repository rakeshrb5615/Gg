package u6;
public final class o {
    public final r6.g1 a;
    public final a1.h b;
    public final java.util.concurrent.atomic.AtomicReference c;

    public o(l7.h p2, r6.g1 p3, a1.h p4)
    {
        kotlin.jvm.internal.j.e(p2, "backgroundDispatcher");
        kotlin.jvm.internal.j.e(p3, "timeProvider");
        kotlin.jvm.internal.j.e(p4, "sessionConfigsDataStore");
        this.a = p3;
        this.b = p4;
        this.c = new java.util.concurrent.atomic.AtomicReference();
        d8.f0.p(d8.f0.b(p2), new u6.m(this, 0, 0));
        return;
    }

    public final u6.h a()
    {
        u6.h v0_0 = this.c;
        if (v0_0.get() == null) {
            String v1_4 = d8.f0.t(new u6.m(this, 0, 1));
            while (!v0_0.compareAndSet(0, v1_4)) {
                if (v0_0.get() != null) {
                    break;
                }
            }
        }
        u6.h v0_1 = v0_0.get();
        kotlin.jvm.internal.j.d(v0_1, "get(...)");
        return ((u6.h) v0_1);
    }

    public final boolean b()
    {
        int v0_4 = this.a().e;
        Integer v1_1 = this.a().d;
        if ((v0_4 == 0) || ((v1_1 == null) || ((this.a.a().c - v0_4.longValue()) >= ((long) v1_1.intValue())))) {
            return 1;
        } else {
            return 0;
        }
    }

    public final Object c(u6.h p6, n7.c p7)
    {
        String v0_2;
        if (!(p7 instanceof u6.n)) {
            v0_2 = new u6.n(this, p7);
        } else {
            v0_2 = ((u6.n) p7);
            m7.a v1_2 = ((u6.n) p7).c;
            if ((v1_2 & -2147483648) == 0) {
            } else {
                ((u6.n) p7).c = (v1_2 - -2147483648);
            }
        }
        String v7_1 = v0_2.a;
        m7.a v1_1 = m7.a.a;
        a1.o v2_0 = v0_2.c;
        try {
            if (v2_0 == null) {
                c4.b.e0(v7_1);
                String v7_2 = this.b;
                a1.o v2_2 = new a1.o(p6, 0);
                v0_2.c = 1;
                if (v7_2.a(v2_2, v0_2) == v1_1) {
                    return v1_1;
                }
            } else {
                if (v2_0 != 1) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                } else {
                    c4.b.e0(v7_1);
                }
            }
        } catch (String v6_4) {
            String v7_5 = new StringBuilder("Failed to update config values: ");
            v7_5.append(v6_4);
            android.util.Log.w("FirebaseSessions", v7_5.toString());
        }
        return h7.l.a;
    }
}
