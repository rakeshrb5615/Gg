package a5;
public final synthetic class u implements c6.a, m0.c, com.google.android.gms.tasks.OnCompleteListener, com.google.android.gms.tasks.Continuation, a5.f, com.google.android.gms.tasks.SuccessContinuation, z2.b, y2.f {
    public final synthetic int a;
    public final synthetic Object b;
    public final synthetic Object c;

    public synthetic u(int p1, Object p2, Object p3)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        return;
    }

    private final Object c(com.google.android.gms.tasks.Task p7)
    {
        android.content.SharedPreferences$Editor v0_1 = ((n6.i) this.b);
        Object v1_2 = ((java.util.Date) this.c);
        v0_1.getClass();
        if (!p7.isSuccessful()) {
            Object v1_3 = p7.getException();
            if (v1_3 != null) {
                if (!(v1_3 instanceof m6.e)) {
                    try {
                        v0_1.h.a.edit().putInt("last_fetch_status", 1).apply();
                        return p7;
                    } catch (Throwable v7_1) {
                        throw v7_1;
                    }
                } else {
                    try {
                        v0_1.h.a.edit().putInt("last_fetch_status", 2).apply();
                        return p7;
                    } catch (Throwable v7_2) {
                        throw v7_2;
                    }
                }
            } else {
                return p7;
            }
        } else {
            try {
                v0_1.h.a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", v1_2.getTime()).apply();
                return p7;
            } catch (Throwable v7_3) {
                throw v7_3;
            }
        }
    }

    public void a(c6.b p3)
    {
        c6.a v1_1 = ((c6.a) this.c);
        ((c6.a) this.b).a(p3);
        v1_1.a(p3);
        return;
    }

    public Object apply(Object p14)
    {
        java.util.HashSet v0_1 = ((y2.h) this.b);
        r2.j v1_2 = ((r2.j) this.c);
        Throwable v14_4 = v0_1.d;
        java.util.ArrayList v10 = v0_1.s(((android.database.sqlite.SQLiteDatabase) p14), v1_2, v14_4.b);
        String v3_0 = o2.d.values();
        r2.i v4_1 = v3_0.length;
        y2.b v5_0 = 0;
        while (v5_0 < v4_1) {
            String v6_0 = v3_0[v5_0];
            if (v6_0 != v1_2.c) {
                String v7_2 = (v14_4.b - v10.size());
                if (v7_2 <= null) {
                    break;
                }
                v10.addAll(v0_1.s(((android.database.sqlite.SQLiteDatabase) p14), v1_2.b(v6_0), v7_2));
            }
            v5_0++;
        }
        Throwable v14_3 = new java.util.HashMap();
        java.util.HashSet v0_8 = new StringBuilder("event_id IN (");
        r2.j v1_0 = 0;
        while (v1_0 < v10.size()) {
            v0_8.append(((y2.b) v10.get(v1_0)).a);
            if (v1_0 < (v10.size() - 1)) {
                v0_8.append(44);
            }
            v1_0++;
        }
        v0_8.append(41);
        r2.j v1_6 = ((android.database.sqlite.SQLiteDatabase) p14).query("event_metadata", new String[] {"event_id", "name", "value"}), v0_8.toString(), 0, 0, 0, 0);
        try {
            while (v1_6.moveToNext()) {
                long v2_0 = v1_6.getLong(0);
                java.util.HashSet v0_4 = ((java.util.Set) v14_3.get(Long.valueOf(v2_0)));
                if (v0_4 == null) {
                    v0_4 = new java.util.HashSet();
                    v14_3.put(Long.valueOf(v2_0), v0_4);
                }
                v0_4.add(new y2.g(v1_6.getString(1), v1_6.getString(2)));
            }
        } catch (java.util.HashSet v0_6) {
            Throwable v14_1 = v0_6;
            v1_6.close();
            throw v14_1;
        }
        v1_6.close();
        java.util.HashSet v0_10 = v10.listIterator();
        while (v0_10.hasNext()) {
            r2.j v1_9 = ((y2.b) v0_10.next());
            long v2_6 = v1_9.a;
            if (v14_3.containsKey(Long.valueOf(v2_6))) {
                r2.i v4_8 = v1_9.c.c();
                y2.b v5_5 = ((java.util.Set) v14_3.get(Long.valueOf(v2_6))).iterator();
                while (v5_5.hasNext()) {
                    String v6_6 = ((y2.g) v5_5.next());
                    v4_8.a(v6_6.a, v6_6.b);
                }
                v0_10.set(new y2.b(v2_6, v1_9.b, v4_8.b()));
            }
        }
        return v10;
    }

    public Object b()
    {
        switch (this.a) {
            case 10:
                String v1_7 = ((Iterable) this.c);
                int v0_11 = ((y2.h) ((y2.d) ((o5.d) this.b).c));
                v0_11.getClass();
                if (v1_7.iterator().hasNext()) {
                    String v2_3 = new StringBuilder("DELETE FROM events WHERE _id in ");
                    v2_3.append(y2.h.z(v1_7));
                    v0_11.c().compileStatement(v2_3.toString()).execute();
                }
                return 0;
            default:
                int v0_7 = ((o5.d) this.b);
                String v1_5 = ((java.util.HashMap) this.c).entrySet().iterator();
                while (v1_5.hasNext()) {
                    String v2_6 = ((java.util.Map$Entry) v1_5.next());
                    ((y2.h) ((y2.c) v0_7.i)).x(((long) ((Integer) v2_6.getValue()).intValue()), u2.c.m, ((String) v2_6.getKey()));
                }
                return 0;
        }
    }

    public Object e(a5.z p4)
    {
        switch (this.a) {
            case 4:
                String v4_3;
                a5.f v0_2 = ((String) this.b);
                String v4_13 = ((android.content.Context) p4.a(android.content.Context));
                switch (((l4.h) this.c).a) {
                    case 14:
                        String v4_6 = v4_13.getApplicationInfo();
                        if (v4_6 == null) {
                            v4_3 = "";
                        } else {
                            v4_3 = String.valueOf(v4_6.targetSdkVersion);
                        }
                        break;
                    case 15:
                        String v4_4 = v4_13.getApplicationInfo();
                        if (v4_4 == null) {
                        } else {
                            v4_3 = String.valueOf(v4_4.minSdkVersion);
                        }
                        break;
                    case 16:
                        if (!v4_13.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            if (!v4_13.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                                if (!v4_13.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                                    if (!v4_13.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                                    } else {
                                        v4_3 = "embedded";
                                    }
                                } else {
                                    v4_3 = "auto";
                                }
                            } else {
                                v4_3 = "watch";
                            }
                        } else {
                            v4_3 = "tv";
                        }
                        break;
                    default:
                        String v4_9 = v4_13.getPackageManager().getInstallerPackageName(v4_13.getPackageName());
                        if (v4_9 == null) {
                        } else {
                            v4_3 = com.google.firebase.FirebaseCommonRegistrar.a(v4_9);
                        }
                }
                return new l6.a(v0_2, v4_3);
            default:
                String v1_14 = ((a5.c) this.c);
                try {
                    android.os.Trace.beginSection(((String) this.b));
                    String v4_10 = v1_14.f.e(p4);
                    android.os.Trace.endSection();
                    return v4_10;
                } catch (String v4_11) {
                    android.os.Trace.endSection();
                    throw v4_11;
                }
        }
    }

    public void onCancel()
    {
        androidx.fragment.app.d v1_1 = ((androidx.fragment.app.d) this.c);
        ((f2.s) this.b).cancel();
        v1_1.run();
        return;
    }

    public void onComplete(com.google.android.gms.tasks.Task p2)
    {
        ((j6.g) this.b).a(((android.content.Intent) this.c));
        return;
    }

    public com.google.android.gms.tasks.Task then(Object p3)
    {
        n6.f v1_1 = ((n6.f) this.c);
        ((n6.d) this.b).c = com.google.android.gms.tasks.Tasks.forResult(v1_1);
        return com.google.android.gms.tasks.Tasks.forResult(v1_1);
    }

    public Object then(com.google.android.gms.tasks.Task p15)
    {
        switch (this.a) {
            case 3:
                try {
                    ((r.e) ((j6.j) this.b).b).remove(((String) this.c));
                    return p15;
                } catch (String v15_29) {
                    throw v15_29;
                }
            case 4:
            case 5:
            default:
                n6.i v0_5 = ((n6.l) this.b);
                String v15_35 = ((com.google.android.gms.tasks.Task) this.c);
                int v2_6 = v0_5.p;
                int v5 = 1;
                long v8_1 = 0;
                try {
                    if (!v15_35.isSuccessful()) {
                        throw new java.io.IOException(v15_35.getException());
                    } else {
                        String v15_38 = ((java.net.HttpURLConnection) v15_35.getResult());
                        v0_5.f = v15_38;
                        String v15_39 = v15_38.getInputStream();
                        try {
                            int v9_3 = v0_5.f.getErrorStream();
                            try {
                                Throwable v10_2 = v0_5.f.getResponseCode();
                                Throwable v11 = Integer.valueOf(v10_2);
                            } catch (Throwable v10_0) {
                                v11 = 0;
                                if (!v0_5.e) {
                                    android.util.Log.d("FirebaseRemoteConfig", "Exception connecting to real-time RC backend. Retrying the connection...", v10_0);
                                } else {
                                    v0_5.c = 8;
                                }
                                v0_5.b(v15_39, v9_3);
                                v0_5.b = 0;
                                if (v0_5.e) {
                                    v5 = 0;
                                } else {
                                    if (v11 != null) {
                                        if (!n6.l.d(v11.intValue())) {
                                        }
                                    }
                                }
                                if (v5 != 0) {
                                    v0_5.k(new java.util.Date(v2_6.currentTimeMillis()));
                                }
                                if (v5 != 0) {
                                    v0_5.h();
                                    v0_5.f = 0;
                                    v0_5.g = 0;
                                    return com.google.android.gms.tasks.Tasks.forResult(0);
                                } else {
                                    if (v11.intValue() != 200) {
                                        String v15_19 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", new Object[] {v11}));
                                        if (v11.intValue() == 403) {
                                            v15_19 = n6.l.f(v0_5.f.getErrorStream());
                                        }
                                        new m6.f(v11.intValue(), v15_19, 0);
                                        v0_5.g();
                                        v0_5.f = 0;
                                        v0_5.g = 0;
                                        return com.google.android.gms.tasks.Tasks.forResult(0);
                                    }
                                }
                                v0_5.b(v15_39, v9_3);
                                v0_5.b = 0;
                                if ((v0_5.e) || (!n6.l.d(v10_2))) {
                                    v5 = 0;
                                }
                                if (v5 != 0) {
                                    v0_5.k(new java.util.Date(v2_6.currentTimeMillis()));
                                }
                                if ((v5 == 0) && (v10_2 != 200)) {
                                    String v15_28 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", new Object[] {v11}));
                                    if (v10_2 == 403) {
                                        v15_28 = n6.l.f(v0_5.f.getErrorStream());
                                    }
                                    new m6.f(v10_2, v15_28, 0);
                                }
                            } catch (Throwable v3_1) {
                                v11 = 0;
                                v8_1 = v15_39;
                                v0_5.b(v8_1, v9_3);
                                v0_5.b = 0;
                                if (v0_5.e) {
                                    v5 = 0;
                                } else {
                                    if (v11 != null) {
                                        if (!n6.l.d(v11.intValue())) {
                                        }
                                    }
                                }
                                if (v5 != 0) {
                                    v0_5.k(new java.util.Date(v2_6.currentTimeMillis()));
                                }
                                if (v5 != 0) {
                                    v0_5.h();
                                } else {
                                    if (v11.intValue() == 200) {
                                    } else {
                                        String v15_8 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", new Object[] {v11}));
                                        if (v11.intValue() == 403) {
                                            v15_8 = n6.l.f(v0_5.f.getErrorStream());
                                        }
                                        new m6.f(v11.intValue(), v15_8, 0);
                                        v0_5.g();
                                    }
                                }
                                throw v3_1;
                            }
                            if (v10_2 == 200) {
                                try {
                                } catch (Throwable v10_0) {
                                }
                                v0_5.c = 8;
                                v0_5.q.e(0, n6.n.f);
                                n6.c v12_2 = v0_5.j(v0_5.f);
                                v0_5.g = v12_2;
                                v12_2.c();
                            }
                        } catch (Throwable v10_0) {
                            v9_3 = 0;
                            v11 = v9_3;
                        } catch (Throwable v3_1) {
                            v9_3 = 0;
                            v11 = 0;
                        }
                    }
                } catch (Throwable v10_0) {
                    v15_39 = 0;
                    v9_3 = 0;
                } catch (Throwable v3_1) {
                    v9_3 = 0;
                    v11 = 0;
                } catch (Throwable v3_1) {
                }
                v0_5.f = 0;
                v0_5.g = 0;
                return com.google.android.gms.tasks.Tasks.forResult(0);
            case 6:
                this.c(p15);
                return p15;
            case 7:
                return ((n6.i) this.b).b(p15, 0, ((java.util.HashMap) this.c));
        }
    }
}
