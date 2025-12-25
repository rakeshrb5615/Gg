package a6;
public final synthetic class i implements u7.l {
    public final synthetic int a;
    public final synthetic Object b;

    public synthetic i(Object p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public synthetic i(m8.c p1, m8.b p2)
    {
        this.a = 4;
        this.b = p1;
        return;
    }

    public final Object invoke(Object p12)
    {
        switch (this.a) {
            case 0:
                String v0_19 = ((a6.l) this.b);
                String v1_5 = a6.l.c;
                String v2_5 = ((e1.b) p12).a().entrySet().iterator();
                long v5 = 0;
                while (v2_5.hasNext()) {
                    long v7_4 = ((java.util.Map$Entry) v2_5.next());
                    if ((v7_4.getValue() instanceof java.util.Set)) {
                        e1.e v8_3 = ((e1.e) v7_4.getKey());
                        long v7_6 = ((java.util.Set) v7_4.getValue());
                        java.util.HashSet v9_1 = v0_19.b(System.currentTimeMillis());
                        if (!v7_6.contains(v9_1)) {
                            ((e1.b) p12).c(v8_3);
                        } else {
                            long v7_8 = new Object[] {v9_1});
                            java.util.HashSet v9_3 = new java.util.HashSet(1);
                            long v7_9 = v7_8[0];
                            java.util.Objects.requireNonNull(v7_9);
                            if (!v9_3.add(v7_9)) {
                                String v0_2 = new StringBuilder("duplicate element: ");
                                v0_2.append(v7_9);
                                throw new IllegalArgumentException(v0_2.toString());
                            } else {
                                ((e1.b) p12).d(v8_3, java.util.Collections.unmodifiableSet(v9_3));
                                v5++;
                            }
                        }
                    }
                }
                if (v5 != 0) {
                    ((e1.b) p12).d(v1_5, Long.valueOf(v5));
                } else {
                    ((e1.b) p12).c(v1_5);
                }
                return 0;
            case 1:
                String v0_17 = ((e.e) this.b);
                kotlin.jvm.internal.j.e(p12, "it");
                return v0_17.invoke();
            case 2:
                return ((b8.f) this.b).c(((Integer) p12).intValue());
            case 3:
                IllegalArgumentException v12_12;
                if (p12 != ((i7.a) this.b)) {
                    v12_12 = String.valueOf(p12);
                } else {
                    v12_12 = "(this Collection)";
                }
                return v12_12;
            case 4:
                ((m8.c) this.b).f(0);
                return h7.l.a;
            case 5:
                String v0_13 = ((r6.i0) this.b);
                kotlin.jvm.internal.j.e(((a1.b) p12), "ex");
                android.util.Log.w("FirebaseSessions", "CorruptionException in session data DataStore", ((a1.b) p12));
                return new r6.h0(v0_13.a.a(0), 0, 0);
            default:
                String v0_6 = ((s8.m) this.b);
                IllegalArgumentException v12_5 = ((Integer) p12).intValue();
                String v1_3 = new StringBuilder();
                v1_3.append(v0_6.e[v12_5]);
                v1_3.append(": ");
                v1_3.append(v0_6.i(v12_5).b());
                return v1_3.toString();
        }
    }
}
