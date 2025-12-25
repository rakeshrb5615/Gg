package r4;
public final class c {
    public final c6.b a;
    public Integer b;

    public c(c6.b p1)
    {
        this.a = p1;
        this.b = 0;
        return;
    }

    public static boolean a(java.util.ArrayList p6, r4.b p7)
    {
        String v0 = p7.a;
        String v7_1 = p7.b;
        int v1 = p6.size();
        int v3 = 0;
        while (v3 < v1) {
            boolean v4_3 = p6.get(v3);
            v3++;
            boolean v4_0 = ((r4.b) v4_3);
            if ((v4_0.a.equals(v0)) && (v4_0.b.equals(v7_1))) {
                return 1;
            }
        }
        return 0;
    }

    public final java.util.ArrayList b()
    {
        java.util.Iterator v0_5 = ((u4.c) ((u4.b) this.a.get()));
        v0_5.getClass();
        java.util.ArrayList v1_1 = new java.util.ArrayList();
        java.util.Iterator v0_2 = v0_5.a.getConditionalUserProperties("frc", "").iterator();
        while (v0_2.hasNext()) {
            Long v2_4 = ((android.os.Bundle) v0_2.next());
            Object vtmp7 = com.google.android.gms.common.internal.Preconditions.checkNotNull(v2_4);
            u4.a v3_2 = new u4.a();
            v3_2.a = ((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(((String) com.google.android.gms.measurement.internal.zzjh.zzb(v2_4, "origin", String, 0))));
            v3_2.b = ((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(((String) com.google.android.gms.measurement.internal.zzjh.zzb(v2_4, "name", String, 0))));
            v3_2.c = com.google.android.gms.measurement.internal.zzjh.zzb(v2_4, "value", Object, 0);
            v3_2.d = ((String) com.google.android.gms.measurement.internal.zzjh.zzb(v2_4, "trigger_event_name", String, 0));
            long v4_16 = Long.valueOf(0);
            v3_2.e = ((Long) com.google.android.gms.measurement.internal.zzjh.zzb(v2_4, "trigger_timeout", Long, v4_16)).longValue();
            v3_2.f = ((String) com.google.android.gms.measurement.internal.zzjh.zzb(v2_4, "timed_out_event_name", String, 0));
            v3_2.g = ((android.os.Bundle) com.google.android.gms.measurement.internal.zzjh.zzb(v2_4, "timed_out_event_params", android.os.Bundle, 0));
            v3_2.h = ((String) com.google.android.gms.measurement.internal.zzjh.zzb(v2_4, "triggered_event_name", String, 0));
            v3_2.i = ((android.os.Bundle) com.google.android.gms.measurement.internal.zzjh.zzb(v2_4, "triggered_event_params", android.os.Bundle, 0));
            v3_2.j = ((Long) com.google.android.gms.measurement.internal.zzjh.zzb(v2_4, "time_to_live", Long, v4_16)).longValue();
            v3_2.k = ((String) com.google.android.gms.measurement.internal.zzjh.zzb(v2_4, "expired_event_name", String, 0));
            v3_2.l = ((android.os.Bundle) com.google.android.gms.measurement.internal.zzjh.zzb(v2_4, "expired_event_params", android.os.Bundle, 0));
            v3_2.n = ((Boolean) com.google.android.gms.measurement.internal.zzjh.zzb(v2_4, "active", Boolean, Boolean.FALSE)).booleanValue();
            v3_2.m = ((Long) com.google.android.gms.measurement.internal.zzjh.zzb(v2_4, "creation_timestamp", Long, v4_16)).longValue();
            v3_2.o = ((Long) com.google.android.gms.measurement.internal.zzjh.zzb(v2_4, "triggered_timestamp", Long, v4_16)).longValue();
            v1_1.add(v3_2);
        }
        return v1_1;
    }

    public final void c(java.util.ArrayList p23)
    {
        NumberFormatException v0_0 = this.a;
        if (v0_0.get() == null) {
            throw new r4.a("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        } else {
            java.util.ArrayDeque v2_0 = new java.util.ArrayList();
            int v4_0 = p23.size();
            int v6_0 = 0;
            while(true) {
                u4.a v7_0 = "";
                if (v6_0 >= v4_0) {
                    break;
                }
                Object vtmp3 = p23.get(v6_0);
                v6_0++;
                boolean v9_10 = ((java.util.Map) vtmp3);
                long v11_34 = new java.util.ArrayList();
                String v13_5 = 0;
                while (v13_5 < 5) {
                    String v14_4 = r4.b.g[v13_5];
                    if (!v9_10.containsKey(v14_4)) {
                        v11_34.add(v14_4);
                    }
                    v13_5++;
                }
                if (!v11_34.isEmpty()) {
                    throw new r4.a(String.format("The following keys are missing from the experiment info map: %s", new Object[] {v11_34})));
                } else {
                    long v17_1 = r4.b.h.parse(((String) v9_10.get("experimentStartTime")));
                    long v18 = Long.parseLong(((String) v9_10.get("triggerTimeoutMillis")));
                    long v20 = Long.parseLong(((String) v9_10.get("timeToLiveMillis")));
                    if (v9_10.containsKey("triggerEvent")) {
                        v7_0 = ((String) v9_10.get("triggerEvent"));
                    }
                    v2_0.add(new r4.b(((String) v9_10.get("experimentId")), ((String) v9_10.get("variantId")), v7_0, v17_1, v18, v20));
                }
            }
            if (!v2_0.isEmpty()) {
                if (v0_0.get() == null) {
                    throw new r4.a("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
                } else {
                    java.util.ArrayList v3_0 = this.b();
                    int v4_7 = new java.util.ArrayList();
                    com.google.android.gms.measurement.api.AppMeasurementSdk v8_11 = v3_0.size();
                    boolean v9_8 = 0;
                    while (v9_8 < v8_11) {
                        com.google.android.gms.measurement.api.AppMeasurementSdk v15_0;
                        int v10_1 = v3_0.get(v9_8);
                        v9_8++;
                        int v10_2 = ((u4.a) v10_1);
                        long v11_29 = v10_2.d;
                        if (v11_29 == 0) {
                            v15_0 = "";
                        } else {
                            v15_0 = v11_29;
                        }
                        v4_7.add(new r4.b(v10_2.b, String.valueOf(v10_2.c), v15_0, new java.util.Date(v10_2.m), v10_2.e, v10_2.j));
                    }
                    java.util.ArrayList v3_4 = new java.util.ArrayList();
                    int v5_4 = v4_7.size();
                    int v6_4 = 0;
                    while (v6_4 < v5_4) {
                        u4.a v7_6 = v4_7.get(v6_4);
                        v6_4++;
                        u4.a v7_7 = ((r4.b) v7_6);
                        if (!r4.c.a(v2_0, v7_7)) {
                            v3_4.add(v7_7.a());
                        }
                    }
                    int v5_5 = v3_4.size();
                    int v6_3 = 0;
                    while (v6_3 < v5_5) {
                        u4.a v7_3 = v3_4.get(v6_3);
                        v6_3++;
                        ((u4.c) ((u4.b) v0_0.get())).a.clearConditionalUserProperty(((u4.a) v7_3).b, 0, 0);
                    }
                    java.util.ArrayList v3_9 = new java.util.ArrayList();
                    int v5_6 = v2_0.size();
                    int v6_2 = 0;
                    while (v6_2 < v5_6) {
                        u4.a v7_1 = v2_0.get(v6_2);
                        v6_2++;
                        u4.a v7_2 = ((r4.b) v7_1);
                        if (!r4.c.a(v4_7, v7_2)) {
                            v3_9.add(v7_2);
                        }
                    }
                    java.util.ArrayDeque v2_11 = new java.util.ArrayDeque(this.b());
                    if (this.b == null) {
                        this.b = Integer.valueOf(((u4.c) ((u4.b) v0_0.get())).a.getMaxUserProperties("frc"));
                    }
                    int v4_17 = this.b.intValue();
                    int v5_8 = v3_9.size();
                    int v6_5 = 0;
                    while (v6_5 < v5_8) {
                        u4.a v7_14 = v3_9.get(v6_5);
                        v6_5++;
                        u4.a v7_15 = ((r4.b) v7_14);
                        while (v2_11.size() >= v4_17) {
                            ((u4.c) ((u4.b) v0_0.get())).a.clearConditionalUserProperty(((u4.a) v2_11.pollFirst()).b, 0, 0);
                        }
                        u4.a v7_16 = v7_15.a();
                        com.google.android.gms.measurement.api.AppMeasurementSdk v8_15 = ((u4.c) ((u4.b) v0_0.get()));
                        v8_15.getClass();
                        boolean v9_11 = v7_16.a;
                        if ((v9_11) && (!v9_11.isEmpty())) {
                            long v11_48 = v7_16.c;
                            if (((v11_48 == 0) || (com.google.android.gms.measurement.internal.zzlt.zzb(v11_48) != null)) && ((v4.a.a(v9_11)) && (v4.a.c(v9_11, v7_16.b)))) {
                                long v11_3 = v7_16.k;
                                if ((v11_3 == 0) || ((v4.a.b(v7_16.l, v11_3)) && (v4.a.d(v9_11, v7_16.k, v7_16.l)))) {
                                    long v11_7 = v7_16.h;
                                    if ((v11_7 == 0) || ((v4.a.b(v7_16.i, v11_7)) && (v4.a.d(v9_11, v7_16.h, v7_16.i)))) {
                                        long v11_11 = v7_16.f;
                                        if ((v11_11 == 0) || ((v4.a.b(v7_16.g, v11_11)) && (v4.a.d(v9_11, v7_16.f, v7_16.g)))) {
                                            com.google.android.gms.measurement.api.AppMeasurementSdk v8_0 = v8_15.a;
                                            boolean v9_2 = new android.os.Bundle();
                                            long v11_14 = v7_16.a;
                                            if (v11_14 != 0) {
                                                v9_2.putString("origin", v11_14);
                                            }
                                            long v11_15 = v7_16.b;
                                            if (v11_15 != 0) {
                                                v9_2.putString("name", v11_15);
                                            }
                                            long v11_16 = v7_16.c;
                                            if (v11_16 != 0) {
                                                com.google.android.gms.measurement.internal.zzjh.zza(v9_2, v11_16);
                                            }
                                            long v11_17 = v7_16.d;
                                            if (v11_17 != 0) {
                                                v9_2.putString("trigger_event_name", v11_17);
                                            }
                                            v9_2.putLong("trigger_timeout", v7_16.e);
                                            long v11_19 = v7_16.f;
                                            if (v11_19 != 0) {
                                                v9_2.putString("timed_out_event_name", v11_19);
                                            }
                                            long v11_20 = v7_16.g;
                                            if (v11_20 != 0) {
                                                v9_2.putBundle("timed_out_event_params", v11_20);
                                            }
                                            long v11_21 = v7_16.h;
                                            if (v11_21 != 0) {
                                                v9_2.putString("triggered_event_name", v11_21);
                                            }
                                            long v11_22 = v7_16.i;
                                            if (v11_22 != 0) {
                                                v9_2.putBundle("triggered_event_params", v11_22);
                                            }
                                            v9_2.putLong("time_to_live", v7_16.j);
                                            long v11_24 = v7_16.k;
                                            if (v11_24 != 0) {
                                                v9_2.putString("expired_event_name", v11_24);
                                            }
                                            long v11_25 = v7_16.l;
                                            if (v11_25 != 0) {
                                                v9_2.putBundle("expired_event_params", v11_25);
                                            }
                                            v9_2.putLong("creation_timestamp", v7_16.m);
                                            v9_2.putBoolean("active", v7_16.n);
                                            v9_2.putLong("triggered_timestamp", v7_16.o);
                                            v8_0.setConditionalUserProperty(v9_2);
                                        }
                                    }
                                }
                            }
                        }
                        v2_11.offer(v7_16);
                    }
                }
            } else {
                if (v0_0.get() == null) {
                    throw new r4.a("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
                } else {
                    java.util.ArrayDeque v2_2 = this.b();
                    java.util.ArrayList v3_1 = v2_2.size();
                    int v5_3 = 0;
                    while (v5_3 < v3_1) {
                        int v4_3 = v2_2.get(v5_3);
                        v5_3++;
                        ((u4.c) ((u4.b) v0_0.get())).a.clearConditionalUserProperty(((u4.a) v4_3).b, 0, 0);
                    }
                }
            }
            return;
        }
    }
}
