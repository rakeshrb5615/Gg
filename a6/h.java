package a6;
public final synthetic class h implements u7.l {
    public final synthetic a6.l a;
    public final synthetic String b;
    public final synthetic String c;
    public final synthetic e1.e d;

    public synthetic h(a6.l p1, String p2, String p3, e1.e p4)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        return;
    }

    public final Object invoke(Object p19)
    {
        e1.e v2_0 = this.a;
        Throwable v0_2 = this.b;
        String v3_7 = this.c;
        e1.e v4 = this.d;
        Long v6_9 = Long.valueOf(0);
        java.util.HashSet v8_1 = 0;
        if (!((String) c4.b.B(((e1.b) p19), a6.l.d, "")).equals(v0_2)) {
            java.util.HashSet v19_1;
            String v3_6 = a6.l.c;
            java.util.Set v9_1 = ((Long) c4.b.B(((e1.b) p19), v3_6, v6_9)).longValue();
            if ((v9_1 + 1) != 30) {
                v19_1 = 0;
            } else {
                Long v6_6 = ((Long) c4.b.B(((e1.b) p19), v3_6, v6_9)).longValue();
                String v3_2 = "";
                java.util.Set v9_0 = new java.util.HashSet();
                java.util.Iterator v10_2 = ((e1.b) p19).a().entrySet().iterator();
                String v13_0 = 0;
                while (v10_2.hasNext()) {
                    java.util.Map$Entry v14_2 = ((java.util.Map$Entry) v10_2.next());
                    if ((v14_2.getValue() instanceof java.util.Set)) {
                        java.util.Set v15_4 = ((java.util.Set) v14_2.getValue());
                        java.util.Iterator v16 = v15_4.iterator();
                        while (v16.hasNext()) {
                            java.util.HashSet v8_5 = ((String) v16.next());
                            if (v13_0 == null) {
                                v3_2 = ((e1.e) v14_2.getKey()).a;
                                v13_0 = v8_5;
                                v9_0 = v15_4;
                            } else {
                                if (v13_0.compareTo(v8_5) > 0) {
                                }
                            }
                        }
                    }
                }
                v19_1 = v8_1;
                java.util.HashSet v8_3 = new java.util.HashSet(v9_0);
                v8_3.remove(v13_0);
                ((e1.b) p19).e(c4.b.c0(v3_2), v8_3);
                v9_1 = (v6_6 - 1);
                ((e1.b) p19).d(a6.l.c, Long.valueOf(v9_1));
            }
            e1.e v2_2 = new java.util.HashSet(((java.util.Collection) c4.b.B(((e1.b) p19), v4, new java.util.HashSet())));
            v2_2.add(v0_2);
            java.util.Set v9_3 = (v9_1 + 1);
            ((e1.b) p19).e(v4, v2_2);
            ((e1.b) p19).d(a6.l.c, Long.valueOf(v9_3));
            ((e1.b) p19).d(a6.l.d, v0_2);
            return v19_1;
        } else {
            Long v6_0 = v2_0.c(((e1.b) p19), v0_2);
            if ((v6_0 != null) && (!v6_0.a.equals(v3_7))) {
                v2_0.d(((e1.b) p19), v0_2);
                String v3_5 = new java.util.HashSet(((java.util.Collection) c4.b.B(((e1.b) p19), v4, new java.util.HashSet())));
                v3_5.add(v0_2);
                ((e1.b) p19).e(v4, v3_5);
                return 0;
            } else {
                return 0;
            }
        }
    }
}
