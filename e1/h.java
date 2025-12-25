package e1;
public final class h implements a1.f1 {
    public static final e1.h a;

    static h()
    {
        e1.h.a = new e1.h();
        return;
    }

    public final void a(Object p7, a1.n1 p8)
    {
        IllegalStateException v7_4 = ((e1.b) p7).a();
        String v0_2 = d1.d.n();
        IllegalStateException v7_9 = v7_4.entrySet().iterator();
        while (v7_9.hasNext()) {
            d1.h v1_2;
            d1.h v1_24 = ((java.util.Map$Entry) v7_9.next());
            String v2_1 = ((e1.e) v1_24.getKey());
            d1.h v1_25 = v1_24.getValue();
            String v2_2 = v2_1.a;
            if (!(v1_25 instanceof Boolean)) {
                if (!(v1_25 instanceof Float)) {
                    if (!(v1_25 instanceof Double)) {
                        if (!(v1_25 instanceof Integer)) {
                            if (!(v1_25 instanceof Long)) {
                                if (!(v1_25 instanceof String)) {
                                    if (!(v1_25 instanceof java.util.Set)) {
                                        if (!(v1_25 instanceof byte[])) {
                                            throw new IllegalStateException("PreferencesSerializer does not support type: ".concat(v1_25.getClass().getName()));
                                        } else {
                                            d1.g v3_16 = d1.h.D();
                                            d1.h v1_26 = ((byte[]) v1_25);
                                            d1.h v1_27 = androidx.datastore.preferences.protobuf.g.c(v1_26, 0, v1_26.length);
                                            v3_16.d();
                                            d1.h.p(((d1.h) v3_16.b), v1_27);
                                            v1_2 = ((d1.h) v3_16.a());
                                        }
                                    } else {
                                        d1.g v3_17 = d1.h.D();
                                        d1.h v4_13 = d1.f.o();
                                        d1.h v1_29 = ((java.util.Set) v1_25);
                                        v4_13.d();
                                        d1.f.l(((d1.f) v4_13.b), v1_29);
                                        v3_17.d();
                                        d1.h.n(((d1.h) v3_17.b), ((d1.f) v4_13.a()));
                                        v1_2 = ((d1.h) v3_17.a());
                                    }
                                } else {
                                    d1.g v3_18 = d1.h.D();
                                    d1.h v1_33 = ((String) v1_25);
                                    v3_18.d();
                                    d1.h.m(((d1.h) v3_18.b), v1_33);
                                    v1_2 = ((d1.h) v3_18.a());
                                }
                            } else {
                                d1.g v3_0 = d1.h.D();
                                d1.h v4_2 = ((Number) v1_25).longValue();
                                v3_0.d();
                                d1.h.l(((d1.h) v3_0.b), v4_2);
                                v1_2 = ((d1.h) v3_0.a());
                            }
                        } else {
                            d1.g v3_1 = d1.h.D();
                            d1.h v1_8 = ((Number) v1_25).intValue();
                            v3_1.d();
                            d1.h.s(((d1.h) v3_1.b), v1_8);
                            v1_2 = ((d1.h) v3_1.a());
                        }
                    } else {
                        d1.g v3_2 = d1.h.D();
                        d1.h v4_5 = ((Number) v1_25).doubleValue();
                        v3_2.d();
                        d1.h.o(((d1.h) v3_2.b), v4_5);
                        v1_2 = ((d1.h) v3_2.a());
                    }
                } else {
                    d1.g v3_3 = d1.h.D();
                    d1.h v1_15 = ((Number) v1_25).floatValue();
                    v3_3.d();
                    d1.h.r(((d1.h) v3_3.b), v1_15);
                    v1_2 = ((d1.h) v3_3.a());
                }
            } else {
                d1.g v3_4 = d1.h.D();
                d1.h v1_18 = ((Boolean) v1_25).booleanValue();
                v3_4.d();
                d1.h.q(((d1.h) v3_4.b), v1_18);
                v1_2 = ((d1.h) v3_4.a());
            }
            v0_2.getClass();
            v2_2.getClass();
            v0_2.d();
            d1.d.l(((d1.d) v0_2.b)).put(v2_2, v1_2);
        }
        IllegalStateException v7_3 = ((d1.d) v0_2.a());
        String v0_1 = v7_3.a(0);
        if (v0_1 > 4096) {
            v0_1 = 4096;
        }
        d1.h v1_22 = new androidx.datastore.preferences.protobuf.l(p8, v0_1);
        v7_3.b(v1_22);
        if (v1_22.f > 0) {
            v1_22.u0();
        }
        return;
    }

    public final Object b()
    {
        return new e1.b(1);
    }

    public final Object c(java.io.FileInputStream p7)
    {
        try {
            a1.b v7_1 = d1.d.o(p7);
            String v1_1 = new e1.f[0];
            e1.b v2_1 = new e1.b(0);
            String v1_8 = ((e1.f[]) java.util.Arrays.copyOf(v1_1, 0));
            kotlin.jvm.internal.j.e(v1_8, "pairs");
            v2_1.b();
        } catch (a1.b v7_6) {
            throw new a1.b("Unable to parse preferences proto.", v7_6);
        }
        if (v1_8.length > 0) {
            throw 0;
        } else {
            a1.b v7_7 = v7_1.m();
            kotlin.jvm.internal.j.d(v7_7, "preferencesProto.preferencesMap");
            a1.b v7_9 = v7_7.entrySet().iterator();
            while (v7_9.hasNext()) {
                e1.e v3_14;
                byte[] v0_19 = ((java.util.Map$Entry) v7_9.next());
                String v1_4 = ((String) v0_19.getKey());
                byte[] v0_21 = ((d1.h) v0_19.getValue());
                kotlin.jvm.internal.j.d(v1_4, "name");
                kotlin.jvm.internal.j.d(v0_21, "value");
                e1.e v3_12 = v0_21.C();
                if (v3_12 != null) {
                    v3_14 = e1.g.a[u.e.c(v3_12)];
                } else {
                    v3_14 = -1;
                }
                switch (v3_14) {
                    case -1:
                        throw new a1.b("Value case is null.", 0);
                        break;
                    case 0:
                    default:
                        throw new a5.o();
                        break;
                    case 1:
                        v2_1.e(new e1.e(v1_4), Boolean.valueOf(v0_21.t()));
                        break;
                    case 2:
                        v2_1.e(new e1.e(v1_4), Float.valueOf(v0_21.x()));
                        break;
                    case 3:
                        v2_1.e(new e1.e(v1_4), Double.valueOf(v0_21.w()));
                        break;
                    case 4:
                        v2_1.e(new e1.e(v1_4), Integer.valueOf(v0_21.y()));
                        break;
                    case 5:
                        v2_1.e(new e1.e(v1_4), Long.valueOf(v0_21.z()));
                        break;
                    case 6:
                        e1.e v3_20 = new e1.e(v1_4);
                        byte[] v0_28 = v0_21.A();
                        kotlin.jvm.internal.j.d(v0_28, "value.string");
                        v2_1.e(v3_20, v0_28);
                        break;
                    case 7:
                        String v1_9 = c4.b.c0(v1_4);
                        byte[] v0_26 = v0_21.B().n();
                        kotlin.jvm.internal.j.d(v0_26, "value.stringSet.stringsList");
                        v2_1.e(v1_9, i7.i.n0(v0_26));
                        break;
                    case 8:
                        byte[] v0_24;
                        e1.e v3_16 = new e1.e(v1_4);
                        byte[] v0_23 = v0_21.u();
                        String v1_6 = v0_23.size();
                        if (v1_6 != null) {
                            byte[] v5_1 = new byte[v1_6];
                            v0_23.d(v1_6, v5_1);
                            v0_24 = v5_1;
                        } else {
                            v0_24 = androidx.datastore.preferences.protobuf.x.b;
                        }
                        kotlin.jvm.internal.j.d(v0_24, "value.bytes.toByteArray()");
                        v2_1.e(v3_16, v0_24);
                        break;
                    case 9:
                        throw new a1.b("Value not set.", 0);
                        break;
                }
            }
            return new e1.b(i7.r.s0(v2_1.a()), 1);
        }
    }
}
