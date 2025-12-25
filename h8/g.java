package h8;
public final class g extends n7.c implements g8.d {
    public final g8.d a;
    public final l7.h b;
    public final int c;
    public l7.h d;
    public l7.c e;

    public g(g8.d p3, l7.h p4)
    {
        super(h8.e.a, l7.i.a);
        super.a = p3;
        super.b = p4;
        super.c = ((Number) p4.fold(Integer.valueOf(0), new d8.x(3))).intValue();
        return;
    }

    public final Object a(Object p2, l7.c p3)
    {
        try {
            h7.l v2_1 = this.d(p3, p2);
            l7.h v3_1 = m7.a.a;
        } catch (h7.l v2_3) {
            this.d = new h8.c(v2_3, v3_1.getContext());
            throw v2_3;
        }
        if (v2_1 != v3_1) {
            return h7.l.a;
        } else {
            return v2_1;
        }
    }

    public final Object d(l7.c p12, Object p13)
    {
        StringBuilder v0_0 = p12.getContext();
        d8.f0.g(v0_0);
        int v1_14 = this.d;
        if (v1_14 != v0_0) {
            if ((v1_14 instanceof h8.c)) {
                int v1_17 = ((h8.c) v1_14);
                StringBuilder v0_1 = new StringBuilder("\n            Flow exception transparency is violated:\n                Previous \'emit\' call has thrown exception ");
                v0_1.append(v1_17.b);
                v0_1.append(", but then emission attempt of value \'");
                v0_1.append(p13);
                v0_1.append("\' has been detected.\n                Emissions from \'catch\' blocks are prohibited in order to avoid unspecified behaviour, \'Flow.catch\' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ");
                IllegalArgumentException v13_12 = v0_1.toString();
                kotlin.jvm.internal.j.e(v13_12, "<this>");
                StringBuilder v0_7 = a8.h.X(new a8.i(v13_12, 2));
                int v1_13 = new java.util.ArrayList();
                java.util.ArrayList v2_4 = v0_7.iterator();
                while (v2_4.hasNext()) {
                    int v3_0 = v2_4.next();
                    if (!b8.i.y0(((String) v3_0))) {
                        v1_13.add(v3_0);
                    }
                }
                java.util.ArrayList v2_6 = new java.util.ArrayList(i7.j.X(v1_13, 10));
                int v3_5 = v1_13.size();
                String v4_4 = 0;
                java.util.ArrayList v5_0 = 0;
                while (v5_0 < v3_5) {
                    String v6_1 = v1_13.get(v5_0);
                    v5_0++;
                    String v6_2 = ((String) v6_1);
                    int v7_0 = v6_2.length();
                    int v8 = 0;
                    while (v8 < v7_0) {
                        if (a.a.D(v6_2.charAt(v8))) {
                            v8++;
                        }
                        if (v8 == -1) {
                            v8 = v6_2.length();
                        }
                        v2_6.add(Integer.valueOf(v8));
                    }
                    v8 = -1;
                }
                java.util.ArrayList v2_10;
                int v1_15 = v2_6.iterator();
                if (v1_15.hasNext()) {
                    v2_10 = ((Comparable) v1_15.next());
                    while (v1_15.hasNext()) {
                        java.util.ArrayList v5_3 = ((Comparable) v1_15.next());
                        if (v2_10.compareTo(v5_3) > 0) {
                            v2_10 = v5_3;
                        }
                    }
                } else {
                    v2_10 = 0;
                }
                int v1_16;
                java.util.ArrayList v2_11 = ((Integer) v2_10);
                if (v2_11 == null) {
                    v1_16 = 0;
                } else {
                    v1_16 = v2_11.intValue();
                }
                IllegalArgumentException v13_13 = v13_12.length();
                v0_7.size();
                java.util.ArrayList v2_12 = a.a.y(v0_7);
                java.util.ArrayList v5_5 = new java.util.ArrayList();
                StringBuilder v0_8 = v0_7.iterator();
                while (v0_8.hasNext()) {
                    String v6_6 = v0_8.next();
                    int v7_1 = (v4_4 + 1);
                    if (v4_4 < null) {
                        a.a.V();
                        throw 0;
                    } else {
                        String v4_3;
                        String v6_7 = ((String) v6_6);
                        if (((v4_4 != null) && (v4_4 != v2_12)) || (!b8.i.y0(v6_7))) {
                            kotlin.jvm.internal.j.e(v6_7, "<this>");
                            if (v1_16 < 0) {
                                throw new IllegalArgumentException(v1.a.j("Requested character count ", v1_16, " is less than zero.").toString());
                            } else {
                                String v4_2 = v6_7.length();
                                if (v1_16 <= v4_2) {
                                    v4_2 = v1_16;
                                }
                                v4_3 = v6_7.substring(v4_2);
                                kotlin.jvm.internal.j.d(v4_3, "substring(...)");
                            }
                        } else {
                            v4_3 = 0;
                        }
                        if (v4_3 != null) {
                            v5_5.add(v4_3);
                        }
                        v4_4 = v7_1;
                    }
                }
                StringBuilder v0_10 = new StringBuilder(v13_13);
                i7.i.b0(v5_5, v0_10);
                throw new IllegalStateException(v0_10.toString().toString());
            } else {
                if (((Number) v0_0.fold(Integer.valueOf(0), new b8.q(1, this))).intValue() != this.c) {
                    IllegalArgumentException v13_6 = new StringBuilder("Flow invariant is violated:\n\t\tFlow was collected in ");
                    v13_6.append(this.b);
                    v13_6.append(",\n\t\tbut emission happened in ");
                    v13_6.append(v0_0);
                    v13_6.append(".\n\t\tPlease refer to \'flow\' documentation or use \'flowOn\' instead");
                    throw new IllegalStateException(v13_6.toString().toString());
                } else {
                    this.d = v0_0;
                }
            }
        }
        this.e = p12;
        int v1_10 = this.a;
        kotlin.jvm.internal.j.c(v1_10, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        String v12_7 = h8.i.a.b(v1_10, p13, this);
        if (!kotlin.jvm.internal.j.a(v12_7, m7.a.a)) {
            this.e = 0;
        }
        return v12_7;
    }

    public final n7.d getCallerFrame()
    {
        int v0_0 = this.e;
        if (!(v0_0 instanceof n7.d)) {
            return 0;
        } else {
            return ((n7.d) v0_0);
        }
    }

    public final l7.h getContext()
    {
        l7.i v0 = this.d;
        if (v0 == null) {
            v0 = l7.i.a;
        }
        return v0;
    }

    public final StackTraceElement getStackTraceElement()
    {
        return 0;
    }

    public final Object invokeSuspend(Object p4)
    {
        l7.c v0_0 = h7.h.a(p4);
        if (v0_0 != null) {
            this.d = new h8.c(v0_0, this.getContext());
        }
        l7.c v0_1 = this.e;
        if (v0_1 != null) {
            v0_1.resumeWith(p4);
        }
        return m7.a.a;
    }
}
