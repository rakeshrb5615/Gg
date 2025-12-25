package a1;
public final class f extends n7.i implements u7.l {
    public final synthetic int a;
    public int b;
    public final synthetic Object c;

    public synthetic f(Object p1, l7.c p2, int p3)
    {
        this.a = p3;
        this.c = p1;
        super(1, p2);
        return;
    }

    public final l7.c create(l7.c p4)
    {
        switch (this.a) {
            case 0:
                return new a1.f(((c1.d) this.c), p4, 0);
            default:
                return new a1.f(((a1.c0) this.c), p4, 1);
        }
    }

    public final Object invoke(Object p2)
    {
        switch (this.a) {
            case 0:
                return ((a1.f) this.create(((l7.c) p2))).invokeSuspend(h7.l.a);
            default:
                return ((a1.f) this.create(((l7.c) p2))).invokeSuspend(h7.l.a);
        }
    }

    public final Object invokeSuspend(Object p7)
    {
        switch (this.a) {
            case 0:
                String v0_1 = m7.a.a;
                android.content.Context v1_4 = this.b;
                h7.l v2_0 = h7.l.a;
                if (v1_4 == null) {
                    c4.b.e0(p7);
                    String v7_11 = ((c1.d) this.c);
                    this.b = 1;
                    android.content.Context v1_3 = ((android.content.SharedPreferences) v7_11.e.getValue()).edit();
                    java.util.Set v3_0 = v7_11.f;
                    if (v3_0 != null) {
                        java.util.Iterator v4 = v3_0.iterator();
                        while (v4.hasNext()) {
                            v1_3.remove(((String) v4.next()));
                        }
                    } else {
                        v1_3.clear();
                    }
                    if (!v1_3.commit()) {
                        throw new java.io.IOException("Unable to delete migrated keys from SharedPreferences.");
                    } else {
                        if (((android.content.SharedPreferences) v7_11.e.getValue()).getAll().isEmpty()) {
                            android.content.Context v1_11 = v7_11.c;
                            if (v1_11 != null) {
                                String v7_3 = v7_11.d;
                                if (v7_3 != null) {
                                    c1.b.a(v1_11, v7_3);
                                }
                            }
                        }
                        if (v3_0 != null) {
                            v3_0.clear();
                        }
                        if (v2_0 != v0_1) {
                            v0_1 = v2_0;
                        }
                    }
                } else {
                    if (v1_4 != 1) {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    } else {
                        c4.b.e0(p7);
                    }
                }
                return v0_1;
            default:
                String v0_4 = m7.a.a;
                android.content.Context v1_12 = this.b;
                if (v1_12 == null) {
                    c4.b.e0(p7);
                    String v7_7 = ((a1.c0) this.c);
                    this.b = 1;
                    p7 = v7_7.invoke(this);
                    if (p7 == v0_4) {
                        p7 = v0_4;
                    }
                } else {
                    if (v1_12 != 1) {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    } else {
                        c4.b.e0(p7);
                    }
                }
                return p7;
        }
    }
}
