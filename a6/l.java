package a6;
public final class l {
    public static final e1.e b;
    public static final e1.e c;
    public static final e1.e d;
    public final q5.d a;

    static l()
    {
        a6.l.b = new e1.e("fire-global");
        a6.l.c = new e1.e("fire-count");
        a6.l.d = new e1.e("last-used-date");
        return;
    }

    public l(android.content.Context p3, String p4)
    {
        this.a = new q5.d(p3, g2.g.l("FirebaseHeartBeat", p4));
        return;
    }

    public final declared_synchronized java.util.ArrayList a()
    {
        Throwable v0_1 = new java.util.ArrayList();
        long v1_2 = this.b(System.currentTimeMillis());
        java.util.Iterator v2_4 = this.a;
        v2_4.getClass();
        java.util.Iterator v2_3 = ((java.util.Map) d8.f0.t(new q5.b(v2_4, 0, 0))).entrySet().iterator();
        while (v2_3.hasNext()) {
            String v3_4 = ((java.util.Map$Entry) v2_3.next());
            if ((v3_4.getValue() instanceof java.util.Set)) {
                a6.a v4_5 = new java.util.HashSet(((java.util.Set) v3_4.getValue()));
                v4_5.remove(v1_2);
                if (!v4_5.isEmpty()) {
                    v0_1.add(new a6.a(((e1.e) v3_4.getKey()).a, new java.util.ArrayList(v4_5)));
                }
            }
        }
        this.a.a(new a6.k(System.currentTimeMillis()));
        return v0_1;
    }

    public final declared_synchronized String b(long p2)
    {
        return new java.util.Date(p2).toInstant().atOffset(java.time.ZoneOffset.UTC).toLocalDateTime().format(java.time.format.DateTimeFormatter.ISO_LOCAL_DATE);
    }

    public final declared_synchronized e1.e c(e1.b p4, String p5)
    {
        e1.e v4_8 = p4.a().entrySet().iterator();
        while (v4_8.hasNext()) {
            java.util.Map$Entry v0_1 = ((java.util.Map$Entry) v4_8.next());
            if ((v0_1.getValue() instanceof java.util.Set)) {
                java.util.Iterator v1_4 = ((java.util.Set) v0_1.getValue()).iterator();
                while (v1_4.hasNext()) {
                    if (p5.equals(((String) v1_4.next()))) {
                        return c4.b.c0(((e1.e) v0_1.getKey()).a);
                    }
                }
            }
        }
        return 0;
    }

    public final declared_synchronized void d(e1.b p4, String p5)
    {
        e1.e v0 = this.c(p4, p5);
        if (v0 != null) {
            java.util.HashSet v1_1 = new java.util.HashSet(((java.util.Collection) c4.b.B(p4, v0, new java.util.HashSet())));
            v1_1.remove(p5);
            if (!v1_1.isEmpty()) {
                p4.e(v0, v1_1);
            } else {
                p4.c(v0);
            }
            return;
        } else {
            return;
        }
    }

    public final declared_synchronized boolean e(e1.e p10, long p11)
    {
        try {
            Throwable v0_0 = this.a;
            v0_0.getClass();
            kotlin.jvm.internal.j.e(p10, "key");
        } catch (Throwable v0_6) {
            throw v0_6;
        }
        if (!this.b(((Long) d8.f0.t(new a1.d(v0_0, p10, 0, 9))).longValue()).equals(this.b(p11))) {
            q5.d v4 = this.a;
            Long v6 = Long.valueOf(p11);
            v4.getClass();
            d8.f0.t(new a1.t(v4, p10, v6, 0, 4));
            return 1;
        } else {
            return 0;
        }
    }
}
