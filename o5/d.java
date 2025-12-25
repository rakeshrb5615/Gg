package o5;
public final class d {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public static void d(org.json.JSONObject p1, String p2)
    {
        String v2_1 = u.e.b(p2);
        v2_1.append(p1.toString());
        String v1_2 = v2_1.toString();
        if (android.util.Log.isLoggable("FirebaseCrashlytics", 3)) {
            android.util.Log.d("FirebaseCrashlytics", v1_2, 0);
        }
        return;
    }

    public o5.c a(int p9)
    {
        o5.c v2 = 0;
        try {
            if (!u.e.a(2, p9)) {
                long v3_6 = ((j6.o) this.e).G();
                if (v3_6 == 0) {
                    if (android.util.Log.isLoggable("FirebaseCrashlytics", 3)) {
                        android.util.Log.d("FirebaseCrashlytics", "No cached settings data found.", 0);
                    }
                } else {
                    o5.c v5_2 = ((j6.o) this.c).E(v3_6);
                    o5.d.d(v3_6, "Loaded cached settings: ");
                    ((c5.c) this.d).getClass();
                    long v6_1 = System.currentTimeMillis();
                    if ((u.e.a(3, p9)) || (v5_2.c >= v6_1)) {
                        try {
                            if (android.util.Log.isLoggable("FirebaseCrashlytics", 2)) {
                                android.util.Log.v("FirebaseCrashlytics", "Returning cached settings.", 0);
                            }
                        } catch (Exception v9_5) {
                            v2 = v5_2;
                            android.util.Log.e("FirebaseCrashlytics", "Failed to get cached settings", v9_5);
                            return v2;
                        }
                        return v5_2;
                    } else {
                        if (android.util.Log.isLoggable("FirebaseCrashlytics", 2)) {
                            android.util.Log.v("FirebaseCrashlytics", "Cached settings have expired.", 0);
                            return 0;
                        }
                    }
                }
            }
        } catch (Exception v9_5) {
            android.util.Log.e("FirebaseCrashlytics", "Failed to get cached settings", v9_5);
            return v2;
        }
        return 0;
    }

    public o5.c b()
    {
        return ((o5.c) ((java.util.concurrent.atomic.AtomicReference) this.h).get());
    }

    public void c(r2.j p47, int p48)
    {
        String v1_0 = this;
        int v3_0 = p47;
        String v2_12 = p47.b;
        z2.c v8 = ((z2.c) this.f);
        s2.e v9 = ((s2.d) this.b).a(p47.a);
        boolean v4_1 = 0;
        while(true) {
            y2.h v11_1 = ((y2.h) v8);
            if (!((Boolean) v11_1.y(new x2.g(v1_0, v3_0, 0))).booleanValue()) {
                v11_1.y(new d5.a(v1_0, v3_0, v4_1));
                return;
            } else {
                Iterable v13_1 = ((Iterable) v11_1.y(new x2.g(v1_0, v3_0, 1)));
                if (v13_1.iterator().hasNext()) {
                    s2.a v10_1;
                    boolean v31_0;
                    java.util.ArrayList v20_0;
                    if (v9 != null) {
                        q2.n v15_7 = new java.util.ArrayList();
                        java.util.Iterator v16 = v13_1.iterator();
                        while (v16.hasNext()) {
                            v15_7.add(((y2.b) v16.next()).c);
                        }
                        if (v2_12 != null) {
                            String v14_3 = ((y2.c) v1_0.i);
                            java.util.Objects.requireNonNull(v14_3);
                            IllegalStateException v0_45 = ((u2.a) v11_1.y(new a5.a(v14_3, 22)));
                            int v6_20 = new r2.h();
                            v6_20.f = new java.util.HashMap();
                            v6_20.d = Long.valueOf(((a3.a) v1_0.g).b());
                            v6_20.e = Long.valueOf(((a3.a) v1_0.h).b());
                            v6_20.a = "GDT_CLIENT_METRICS";
                            String v14_5 = new o2.c("proto");
                            v0_45.getClass();
                            s2.a v10_31 = r2.o.a;
                            v10_31.getClass();
                            String v1_58 = new java.io.ByteArrayOutputStream();
                            try {
                                v10_31.e(v0_45, v1_58);
                            } catch (java.io.IOException) {
                            }
                            v6_20.c = new r2.m(v14_5, v1_58.toByteArray());
                            v15_7.add(((p2.c) v9).a(v6_20.b()));
                        }
                        IllegalStateException v0_2 = ((p2.c) v9);
                        String v1_2 = new java.util.HashMap();
                        int v6_0 = v15_7.size();
                        String v7_0 = 0;
                        while (v7_0 < v6_0) {
                            java.util.ArrayList v20_2;
                            s2.a v10_27 = v15_7.get(v7_0);
                            v7_0++;
                            s2.a v10_28 = ((r2.i) v10_27);
                            String v14_1 = v10_28.a;
                            if (v1_2.containsKey(v14_1)) {
                                v20_2 = v2_12;
                                ((java.util.List) v1_2.get(v14_1)).add(v10_28);
                            } else {
                                v20_2 = v2_12;
                                String v2_19 = new java.util.ArrayList();
                                v2_19.add(v10_28);
                                v1_2.put(v14_1, v2_19);
                            }
                            v2_12 = v20_2;
                        }
                        v20_0 = v2_12;
                        String v2_1 = new java.util.ArrayList();
                        String v1_4 = v1_2.entrySet().iterator();
                        while (v1_4.hasNext()) {
                            int v6_5 = ((java.util.Map$Entry) v1_4.next());
                            q2.n v15_3 = ((r2.i) ((java.util.List) v6_5.getValue()).get(0));
                            long v22 = v0_2.f.b();
                            long v24 = v0_2.e.b();
                            q2.n v15_5 = new q2.n(new q2.l(Integer.valueOf(v15_3.b("sdk-version")), v15_3.a("model"), v15_3.a("hardware"), v15_3.a("device"), v15_3.a("product"), v15_3.a("os-uild"), v15_3.a("manufacturer"), v15_3.a("fingerprint"), v15_3.a("locale"), v15_3.a("country"), v15_3.a("mcc_mnc"), v15_3.a("application_build")));
                            try {
                                int v27_1 = Integer.valueOf(Integer.parseInt(((String) v6_5.getKey())));
                                String v28_1 = 0;
                            } catch (NumberFormatException) {
                                v28_1 = ((String) v6_5.getKey());
                                v27_1 = 0;
                            }
                            s2.a v10_26 = new java.util.ArrayList();
                            int v6_8 = ((java.util.List) v6_5.getValue()).iterator();
                            while (v6_8.hasNext()) {
                                int v3_14;
                                String v7_3 = ((r2.i) v6_8.next());
                                byte[] v30_2 = v1_4;
                                String v1_17 = v7_3.c;
                                q2.t v21_4 = v7_3.j;
                                int v3_9 = v1_17.a;
                                String v1_18 = v1_17.b;
                                boolean v31_2 = v4_1;
                                if (!v3_9.equals(new o2.c("proto"))) {
                                    if (!v3_9.equals(new o2.c("json"))) {
                                        String v1_20 = "TRuntime.".concat("CctTransportBackend");
                                        if (android.util.Log.isLoggable(v1_20, 5)) {
                                            q2.p v5_7 = new StringBuilder("Received event of unsupported encoding ");
                                            v5_7.append(v3_9);
                                            v5_7.append(". Skipping...");
                                            android.util.Log.w(v1_20, v5_7.toString());
                                        }
                                    } else {
                                        int v3_13 = new String(v1_18, java.nio.charset.Charset.forName("UTF-8"));
                                        String v1_22 = new o5.d();
                                        v1_22.f = v3_13;
                                        v3_14 = v1_22;
                                        boolean v4_17;
                                        v3_14.a = Long.valueOf(v7_3.d);
                                        v3_14.d = Long.valueOf(v7_3.e);
                                        String v1_27 = ((String) v7_3.f.get("tz-offset"));
                                        if (v1_27 != null) {
                                            v4_17 = Long.valueOf(v1_27).longValue();
                                        } else {
                                            v4_17 = 0;
                                        }
                                        v3_14.g = Long.valueOf(v4_17);
                                        v3_14.h = new q2.v(((q2.h0) q2.h0.a.get(v7_3.b("net-type"))), ((q2.g0) q2.g0.a.get(v7_3.b("mobile-subtype"))));
                                        String v1_34 = v7_3.b;
                                        if (v1_34 != null) {
                                            v3_14.b = v1_34;
                                        }
                                        String v1_35 = v7_3.g;
                                        if (v1_35 != null) {
                                            v3_14.c = new q2.o(new q2.r(new q2.q(v1_35)));
                                        }
                                        String v1_38 = v7_3.i;
                                        if ((v1_38 != null) || (v21_4 != null)) {
                                            if (v1_38 == null) {
                                                v1_38 = 0;
                                            }
                                            boolean v4_28;
                                            if (v21_4 == null) {
                                                v4_28 = 0;
                                            } else {
                                                v4_28 = v21_4;
                                            }
                                            v3_14.i = new q2.p(v1_38, v4_28);
                                        }
                                        String v1_41;
                                        if (((Long) v3_14.a) != null) {
                                            v1_41 = "";
                                        } else {
                                            v1_41 = " eventTimeMs";
                                        }
                                        if (((Long) v3_14.d) == null) {
                                            v1_41 = v1_41.concat(" eventUptimeMs");
                                        }
                                        if (((Long) v3_14.g) == null) {
                                            v1_41 = g2.g.d(v1_41, " timezoneOffsetSeconds");
                                        }
                                        if (!v1_41.isEmpty()) {
                                            throw new IllegalStateException("Missing required properties:".concat(v1_41));
                                        } else {
                                            v10_26.add(new q2.s(((Long) v3_14.a).longValue(), ((Integer) v3_14.b), ((q2.o) v3_14.c), ((Long) v3_14.d).longValue(), ((byte[]) v3_14.e), ((String) v3_14.f), ((Long) v3_14.g).longValue(), ((q2.v) v3_14.h), ((q2.p) v3_14.i)));
                                        }
                                    }
                                } else {
                                    v3_14 = new o5.d();
                                    v3_14.e = v1_18;
                                }
                                v1_4 = v30_2;
                                v4_1 = v31_2;
                            }
                            byte[] v30_1 = v1_4;
                            v2_1.add(new q2.t(v22, v24, v15_5, v27_1, v28_1, v10_26));
                            v1_4 = v30_1;
                        }
                        q2.p v5_1;
                        v31_0 = v4_1;
                        String v1_6 = new q2.m(v2_1);
                        String v2_2 = v0_2.d;
                        if (v20_0 == null) {
                            v5_1 = 0;
                            try {
                                int v3_4 = new b8.g(v2_2, v1_6, v5_1, 10);
                                String v1_9 = new a5.a(v0_2, 16);
                                String v7_1 = 5;
                            } catch (IllegalStateException v0_13) {
                                c4.b.w(v0_13, "CctTransportBackend", "Could not make request to the backend");
                                String v1_14 = 2;
                                v10_1 = new s2.a(2, -1);
                                IllegalStateException v0_32 = v10_1.a;
                                if (v0_32 != v1_14) {
                                    v1_0 = this;
                                    v3_0 = p47;
                                    int v6_10 = v13_1;
                                    v4_1 = v31_0;
                                    v11_1.y(new a5.u(10, this, v6_10));
                                    if (v0_32 != 1) {
                                        if (v0_32 == 4) {
                                            IllegalStateException v0_34 = new java.util.HashMap();
                                            String v2_22 = v6_10.iterator();
                                            while (v2_22.hasNext()) {
                                                int v6_16 = ((y2.b) v2_22.next()).c.a;
                                                if (v0_34.containsKey(v6_16)) {
                                                    v0_34.put(v6_16, Integer.valueOf((((Integer) v0_34.get(v6_16)).intValue() + 1)));
                                                } else {
                                                    v0_34.put(v6_16, Integer.valueOf(1));
                                                }
                                            }
                                            v11_1.y(new a5.u(11, this, v0_34));
                                        }
                                    } else {
                                        v4_1 = Math.max(v4_1, v10_1.b);
                                        if (v20_0 != null) {
                                            v11_1.y(new a5.a(this, 24));
                                        }
                                    }
                                    v2_12 = v20_0;
                                } else {
                                    v11_1.y(new b5.b(this, v13_1, p47, v31_0));
                                    ((b8.g) this.d).s(p47, (p48 + 1), 1);
                                    return;
                                }
                            }
                            do {
                                IllegalStateException v0_6 = v1_9.d(v3_4);
                                String v2_5 = v0_6.b;
                                if (v2_5 == null) {
                                    v3_4 = 0;
                                } else {
                                    c4.b.v("CctTransportBackend", "Following redirect to: %s", v2_5);
                                    v3_4 = new b8.g(v2_5, ((q2.m) v3_4.c), ((String) v3_4.d), 10);
                                }
                                if (v3_4 == 0) {
                                    break;
                                }
                                v7_1--;
                            } while(v7_1 >= 1);
                            String v1_10 = v0_6.a;
                            if (v1_10 != 200) {
                                if ((v1_10 < 500) && (v1_10 != 404)) {
                                    if (v1_10 != 400) {
                                        IllegalStateException v0_4 = new s2.a(3, -1);
                                    } else {
                                        v0_4 = new s2.a(4, -1);
                                    }
                                } else {
                                    v0_4 = new s2.a(2, -1);
                                }
                            } else {
                                v10_1 = new s2.a(1, v0_6.c);
                                v1_14 = 2;
                            }
                        } else {
                            try {
                                int v3_1 = p2.a.a(v20_0);
                                v5_1 = v3_1.b;
                            } catch (IllegalArgumentException) {
                                v0_4 = new s2.a(3, -1);
                            }
                            if (v5_1 == null) {
                                v5_1 = 0;
                            } else {
                            }
                            int v3_2 = v3_1.a;
                            if (v3_2 == 0) {
                            } else {
                                v2_2 = p2.c.b(v3_2);
                            }
                        }
                        v10_1 = v0_4;
                    } else {
                        c4.b.v("Uploader", "Unknown backend for %s, deleting event batch for it...", v3_0);
                        v10_1 = new s2.a(3, -1);
                        v20_0 = v2_12;
                        v31_0 = v4_1;
                    }
                } else {
                    return;
                }
            }
        }
    }
}
