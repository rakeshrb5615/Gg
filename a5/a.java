package a5;
public final synthetic class a implements a5.f, c6.a, com.google.android.gms.tasks.Continuation, com.google.android.gms.tasks.OnSuccessListener, com.google.android.gms.tasks.OnCompleteListener, com.google.android.gms.tasks.SuccessContinuation, okhttp3.EventListener$Factory, z2.b, y6.p {
    public final synthetic int a;
    public final synthetic Object b;

    public synthetic a(Object p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public void a(c6.b p6)
    {
        switch (this.a) {
            case 3:
                java.util.concurrent.atomic.AtomicReference v0_5 = ((d5.b) this.b);
                v0_5.getClass();
                if (android.util.Log.isLoggable("FirebaseCrashlytics", 3)) {
                    android.util.Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", 0);
                }
                v0_5.b.set(((d5.b) p6.get()));
                return;
            default:
                java.util.concurrent.atomic.AtomicReference v0_4 = ((d5.c) this.b);
                d5.b v6_7 = ((m6.j) ((p6.a) p6.get())).a().i;
                ((java.util.Set) v6_7.e).add(v0_4);
                int v1_4 = ((n6.d) v6_7.b).b();
                v1_4.addOnSuccessListener(((java.util.concurrent.Executor) v6_7.d), new h5.a(v6_7, v1_4, v0_4, 5));
                if (android.util.Log.isLoggable("FirebaseCrashlytics", 3)) {
                    android.util.Log.d("FirebaseCrashlytics", "Registering RemoteConfig Rollouts subscriber", 0);
                }
                return;
        }
    }

    public Object b()
    {
        long v4_5 = this.b;
        switch (this.a) {
            case 22:
                long v4_8 = ((y2.h) ((y2.c) v4_5));
                v4_8.getClass();
                Integer v0_20 = new j6.s(12, 0);
                v0_20.c = 0;
                v0_20.d = new java.util.ArrayList();
                v0_20.e = 0;
                v0_20.b = "";
                int v1_11 = new java.util.HashMap();
                r2.j v5_9 = v4_8.c();
                v5_9.beginTransaction();
                try {
                    StringBuilder v3_7 = new String[0];
                    Integer v0_2 = ((u2.a) y2.h.A(v5_9.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", v3_7), new h5.a(v4_8, v1_11, v0_20, 9)));
                    v5_9.setTransactionSuccessful();
                    v5_9.endTransaction();
                    return v0_2;
                } catch (Integer v0_3) {
                    v5_9.endTransaction();
                    throw v0_3;
                }
            case 23:
                long v4_4 = ((y2.h) ((y2.d) v4_5));
                r2.j v5_6 = (v4_4.b.b() - v4_4.d.d);
                Integer v0_16 = v4_4.c();
                v0_16.beginTransaction();
                try {
                    r2.j v5_8 = new String[] {String.valueOf(v5_6)});
                    String v2_3 = v0_16.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", v5_8);
                    try {
                        while (v2_3.moveToNext()) {
                            v4_4.x(((long) v2_3.getInt(0)), u2.c.c, v2_3.getString(1));
                        }
                    } catch (int v1_2) {
                        v2_3.close();
                        throw v1_2;
                    }
                    v2_3.close();
                    int v1_4 = v0_16.delete("events", "timestamp_ms < ?", v5_8);
                    v0_16.setTransactionSuccessful();
                    v0_16.endTransaction();
                    v0_16 = Integer.valueOf(v1_4);
                    return v0_16;
                } catch (int v1_5) {
                    v0_16.endTransaction();
                    throw v1_5;
                }
            case 24:
                Integer v0_21 = ((y2.h) ((y2.c) ((o5.d) v4_5).i));
                int v1_1 = v0_21.c();
                v1_1.beginTransaction();
                try {
                    v1_1.compileStatement("DELETE FROM log_event_dropped").execute();
                    StringBuilder v3_5 = new StringBuilder("UPDATE global_log_event_state SET last_metrics_upload_ms=");
                    v3_5.append(v0_21.b.b());
                    v1_1.compileStatement(v3_5.toString()).execute();
                    v1_1.setTransactionSuccessful();
                    v1_1.endTransaction();
                    return 0;
                } catch (Integer v0_13) {
                    v1_1.endTransaction();
                    throw v0_13;
                }
            default:
                long v4_0 = ((j6.s) v4_5);
                Integer v0_9 = ((Iterable) ((y2.h) ((y2.d) v4_0.c)).i(new r2.q(13))).iterator();
                while (v0_9.hasNext()) {
                    ((b8.g) v4_0.d).s(((r2.j) v0_9.next()), 1, 0);
                }
                return 0;
        }
    }

    public Object c()
    {
        RuntimeException v1_0 = this.b;
        switch (this.a) {
            case 26:
                RuntimeException v1_5 = ((reflect.Constructor) v1_0);
                try {
                    IllegalAccessException v0_7 = v1_5.newInstance(0);
                    return v0_7;
                } catch (reflect.InvocationTargetException v3_1) {
                    StringBuilder v5_3 = new StringBuilder("Failed to invoke constructor \'");
                    v5_3.append(b7.c.b(v1_5));
                    v5_3.append(v0_7);
                    throw new RuntimeException(v5_3.toString(), v3_1);
                } catch (reflect.InvocationTargetException v3_0) {
                    StringBuilder v5_1 = new StringBuilder("Failed to invoke constructor \'");
                    v5_1.append(b7.c.b(v1_5));
                    v5_1.append(v0_7);
                    throw new RuntimeException(v5_1.toString(), v3_0.getCause());
                } catch (IllegalAccessException v0_1) {
                    throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", v0_1);
                }
            default:
                RuntimeException v1_7 = ((Class) v1_0);
                try {
                    return y6.v.a.a(v1_7);
                } catch (IllegalAccessException v0_6) {
                    reflect.InvocationTargetException v3_3 = new StringBuilder("Unable to create instance of ");
                    v3_3.append(v1_7);
                    v3_3.append(". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.");
                    throw new RuntimeException(v3_3.toString(), v0_6);
                }
        }
    }

    public p2.b d(b8.g p22)
    {
        java.io.InputStream v2_17 = ((p2.c) this.b);
        java.io.InputStream v3_12 = ((java.net.URL) p22.b);
        p2.b v6_9 = "TRuntime.".concat("CctTransportBackend");
        if (android.util.Log.isLoggable(v6_9, 4)) {
            android.util.Log.i(v6_9, String.format("Making request to: %s", new Object[] {v3_12})));
        }
        java.io.InputStream v3_10 = ((java.net.HttpURLConnection) v3_12.openConnection());
        v3_10.setConnectTimeout(30000);
        v3_10.setReadTimeout(v2_17.g);
        v3_10.setDoOutput(1);
        v3_10.setInstanceFollowRedirects(0);
        v3_10.setRequestMethod("POST");
        v3_10.setRequestProperty("User-Agent", "datatransport/3.3.0 android/");
        v3_10.setRequestProperty("Content-Encoding", "gzip");
        v3_10.setRequestProperty("Content-Type", "application/json");
        v3_10.setRequestProperty("Accept-Encoding", "gzip");
        java.util.HashMap v9_4 = ((String) p22.d);
        if (v9_4 != null) {
            v3_10.setRequestProperty("X-Goog-Api-Key", v9_4);
        }
        try {
            java.io.OutputStream v13 = v3_10.getOutputStream();
            try {
                java.util.zip.GZIPOutputStream v14_1 = new java.util.zip.GZIPOutputStream(v13);
                try {
                    Throwable v0_10 = ((q2.m) p22.c);
                    java.io.InputStream v2_20 = ((v5.d) v2_17.a.b);
                    v5.e v15_3 = new v5.e(new java.io.BufferedWriter(new java.io.OutputStreamWriter(v14_1)), v2_20.a, v2_20.b, v2_20.c, v2_20.d);
                    v15_3.h(v0_10);
                    v15_3.j();
                    v15_3.b.flush();
                } catch (Throwable v0_12) {
                    java.io.InputStream v2_22 = v0_12;
                    try {
                        v14_1.close();
                    } catch (Throwable v0_13) {
                        v2_22.addSuppressed(v0_13);
                    }
                    throw v2_22;
                }
                v14_1.close();
                if (v13 != null) {
                    v13.close();
                }
                Throwable v0_4 = v3_10.getResponseCode();
                java.io.InputStream v2_2 = Integer.valueOf(v0_4);
                Throwable v4_0 = "TRuntime.".concat("CctTransportBackend");
                if (android.util.Log.isLoggable(v4_0, 4)) {
                    android.util.Log.i(v4_0, String.format("Status Code: %d", new Object[] {v2_2})));
                }
                c4.b.v("CctTransportBackend", "Content-Type: %s", v3_10.getHeaderField("Content-Type"));
                c4.b.v("CctTransportBackend", "Content-Encoding: %s", v3_10.getHeaderField("Content-Encoding"));
                if ((v0_4 != 302) && ((v0_4 != 301) && (v0_4 != 307))) {
                    if (v0_4 == 200) {
                        java.io.InputStream v2_11 = v3_10.getInputStream();
                        try {
                            java.io.InputStream v3_3;
                            if (!"gzip".equals(v3_10.getHeaderField("Content-Encoding"))) {
                                v3_3 = v2_11;
                            } else {
                                v3_3 = new java.util.zip.GZIPInputStream(v2_11);
                            }
                            try {
                                p2.b v6_1 = new p2.b(v0_4, 0, q2.u.a(new java.io.BufferedReader(new java.io.InputStreamReader(v3_3))).a);
                            } catch (Throwable v0_5) {
                                Throwable v4_7 = v0_5;
                                if (v3_3 != null) {
                                    try {
                                        v3_3.close();
                                    } catch (Throwable v0_6) {
                                        v4_7.addSuppressed(v0_6);
                                    }
                                }
                                throw v4_7;
                            }
                            if (v3_3 != null) {
                                v3_3.close();
                            }
                            if (v2_11 != null) {
                                v2_11.close();
                            }
                            return v6_1;
                        } catch (Throwable v0_7) {
                            java.io.InputStream v3_5 = v0_7;
                            if (v2_11 != null) {
                                try {
                                    v2_11.close();
                                } catch (Throwable v0_8) {
                                    v3_5.addSuppressed(v0_8);
                                }
                            }
                            throw v3_5;
                        }
                    } else {
                        return new p2.b(v0_4, 0, 0);
                    }
                } else {
                    return new p2.b(v0_4, new java.net.URL(v3_10.getHeaderField("Location")), 0);
                }
            } catch (Throwable v0_14) {
                java.io.InputStream v2_23 = v0_14;
                if (v13 != null) {
                    try {
                        v13.close();
                    } catch (Throwable v0_15) {
                        v2_23.addSuppressed(v0_15);
                    }
                }
                throw v2_23;
            }
        } catch (Throwable v0_2) {
            c4.b.w(v0_2, "CctTransportBackend", "Couldn\'t open connection, returning with 500");
            Throwable v0_1 = new p2.b(500, 0, 0);
            return v0_1;
        } catch (Throwable v0_2) {
        } catch (Throwable v0_16) {
            c4.b.w(v0_16, "CctTransportBackend", "Couldn\'t encode request, returning with 400");
            v0_1 = new p2.b(400, 0, 0);
            return v0_1;
        } catch (Throwable v0_16) {
        }
    }

    public Object e(a5.z p49)
    {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                g5.o v2_21 = ((com.google.firebase.crashlytics.CrashlyticsRegistrar) this.b);
                String v3_0 = System.currentTimeMillis();
                int v7_7 = ((q4.f) p49.a(q4.f));
                g5.n v5_5 = ((d6.d) p49.a(d6.d));
                Boolean v6_4 = p49.h(d5.b);
                int v8_14 = p49.h(u4.b);
                int v9_14 = p49.h(p6.a);
                d5.b v10_3 = ((java.util.concurrent.ExecutorService) p49.e(v2_21.a));
                int v11_13 = ((java.util.concurrent.ExecutorService) p49.e(v2_21.b));
                Exception v0_4 = ((java.util.concurrent.ExecutorService) p49.e(v2_21.c));
                v7_7.a();
                g5.k v13_5 = v7_7.a;
                h5.f v14_8 = v13_5.getPackageName();
                long v19 = v3_0;
                h5.f v15_14 = new StringBuilder("Initializing Firebase Crashlytics 20.0.3 for ");
                v15_14.append(v14_8);
                android.util.Log.i("FirebaseCrashlytics", v15_14.toString(), 0);
                String v3_14 = new h5.f(v10_3, v11_13);
                d5.b v10_10 = new m5.c(v13_5);
                int v11_25 = new g5.v(v7_7);
                h5.f v15_17 = new g5.y(v13_5, v14_8, v5_5, v11_25);
                g5.n v5_36 = new d5.b(v6_4);
                Boolean v6_23 = new c5.b(v8_14);
                h5.f v14_12 = new g5.k(v11_25, v10_10);
                int v16_1 = v3_14;
                String v3_15 = s6.d.a;
                java.util.ArrayList v17_1 = v5_36;
                g5.n v5_41 = s6.c.a(v3_15);
                int v18_4 = v7_7;
                if (v5_41.b == null) {
                    v5_41.b = v14_12;
                    int v7_48 = new StringBuilder("Subscriber ");
                    v7_48.append(v3_15);
                    v7_48.append(" registered.");
                    android.util.Log.d("FirebaseSessions", v7_48.toString());
                    v5_41.a.f(0);
                } else {
                    g5.n v5_43 = new StringBuilder("Subscriber ");
                    v5_43.append(v3_15);
                    v5_43.append(" already registered.");
                    android.util.Log.d("FirebaseSessions", v5_43.toString());
                }
                int v8_0 = v15_17;
                boolean v4_0 = v13_5;
                g5.k v13_0 = v10_10;
                d5.b v10_0 = v11_25;
                int v7_0 = v18_4;
                int v9_1 = new g5.s(v7_0, v8_0, v17_1, v10_0, new c5.a(v6_23), new c5.a(v6_23), v13_0, v14_12, new l6.c(v9_14, 11), v16_1);
                Boolean v6_2 = v13_0;
                String v3_4 = v16_1;
                int v11_2 = v9_1.o;
                v7_0.a();
                h5.f v15_2 = v7_0.c.b;
                int v7_3 = g5.g.d(v4_0, "com.google.firebase.crashlytics.mapping_file_id", "string");
                if (v7_3 == 0) {
                    v7_3 = g5.g.d(v4_0, "com.crashlytics.android.build_id", "string");
                }
                int v7_5;
                if (v7_3 == 0) {
                    v7_5 = 0;
                } else {
                    v7_5 = v4_0.getResources().getString(v7_3);
                }
                Integer v31_0;
                boolean v32_0;
                int v8_9;
                int v9_8;
                c5.a v12_5 = new java.util.ArrayList();
                g5.k v13_2 = g5.g.d(v4_0, "com.google.firebase.crashlytics.build_ids_lib", "array");
                g5.y v26_0 = v8_0;
                int v8_2 = g5.g.d(v4_0, "com.google.firebase.crashlytics.build_ids_arch", "array");
                String v22_0 = v15_2;
                h5.f v14_1 = g5.g.d(v4_0, "com.google.firebase.crashlytics.build_ids_build_id", "array");
                if ((v13_2 != null) && ((v8_2 != 0) && (v14_1 != null))) {
                    g5.k v13_3 = v4_0.getResources().getStringArray(v13_2);
                    int v8_3 = v4_0.getResources().getStringArray(v8_2);
                    h5.f v14_2 = v4_0.getResources().getStringArray(v14_1);
                    if ((v13_3.length == v14_2.length) && (v8_3.length == v14_2.length)) {
                        boolean v1_3 = 0;
                        while (v1_3 < v14_2.length) {
                            int v18_0 = v1_3;
                            Integer v31_1 = v11_2;
                            boolean v32_1 = v9_1;
                            v12_5.add(new g5.d(v13_3[v18_0], v8_3[v18_0], v14_2[v18_0]));
                            v1_3 = (v18_0 + 1);
                            v11_2 = v31_1;
                            v9_1 = v32_1;
                        }
                        v32_0 = v9_1;
                        v31_0 = v11_2;
                    } else {
                        v32_0 = v9_1;
                        v31_0 = v11_2;
                        boolean v1_6 = String.format("Lengths did not match: %d %d %d", new Object[] {Integer.valueOf(v13_3.length), Integer.valueOf(v8_3.length), Integer.valueOf(v14_2.length)}));
                        if (android.util.Log.isLoggable("FirebaseCrashlytics", 3)) {
                            android.util.Log.d("FirebaseCrashlytics", v1_6, 0);
                        }
                    }
                    v8_9 = 3;
                    v9_8 = 0;
                } else {
                    v32_0 = v9_1;
                    v31_0 = v11_2;
                    boolean v1_8 = String.format("Could not find resources: %d %d %d", new Object[] {Integer.valueOf(v13_2), Integer.valueOf(v8_2), Integer.valueOf(v14_1)}));
                    v8_9 = 3;
                    if (!android.util.Log.isLoggable("FirebaseCrashlytics", 3)) {
                    } else {
                        v9_8 = 0;
                        android.util.Log.d("FirebaseCrashlytics", v1_8, 0);
                    }
                }
                boolean v1_10 = g2.g.l("Mapping file ID is: ", v7_5);
                if (android.util.Log.isLoggable("FirebaseCrashlytics", v8_9)) {
                    android.util.Log.d("FirebaseCrashlytics", v1_10, v9_8);
                }
                boolean v1_11 = v12_5.size();
                int v8_13 = 0;
                while (v8_13 < v1_11) {
                    int v9_20 = v12_5.get(v8_13);
                    v8_13++;
                    int v9_21 = ((g5.d) v9_20);
                    int v9_22 = v9_21.c;
                    int v18_3 = v1_11;
                    boolean v1_51 = v1.a.r("Build id for ", v9_21.a, " on ", v9_21.b, ": ");
                    v1_51.append(v9_22);
                    boolean v1_52 = v1_51.toString();
                    if (android.util.Log.isLoggable("FirebaseCrashlytics", 3)) {
                        android.util.Log.d("FirebaseCrashlytics", v1_52, 0);
                    }
                    v1_11 = v18_3;
                }
                g5.k v13_4 = v4_0;
                h5.f v15_12 = v22_0;
                h5.f v14_3 = v26_0;
                try {
                    boolean v4_1 = g5.a.a(v13_4, v14_3, v15_12, v7_5, v12_5, new k2.c(v4_0));
                    g5.y v26_1 = v14_3;
                    int v7_9 = new StringBuilder("Installer package name is: ");
                    v7_9.append(v4_1.d);
                    int v7_10 = v7_9.toString();
                } catch (Exception v0_1) {
                    String v3_5 = "FirebaseCrashlytics";
                    android.util.Log.e("FirebaseCrashlytics", "Error retrieving app package info.", v0_1);
                    boolean v4_2 = 0;
                    Exception v0_23 = (System.currentTimeMillis() - v19);
                    if (v0_23 > 16) {
                        g5.o v2_20 = new StringBuilder("Initializing Crashlytics blocked main for ");
                        v2_20.append(v0_23);
                        v2_20.append(" ms");
                        Exception v0_25 = v2_20.toString();
                        if (android.util.Log.isLoggable(v3_5, 3)) {
                            android.util.Log.d(v3_5, v0_25, 0);
                        }
                    }
                    return v4_2;
                }
                if (android.util.Log.isLoggable("FirebaseCrashlytics", 2)) {
                    android.util.Log.v("FirebaseCrashlytics", v7_10, 0);
                }
                int v7_12 = new c5.c();
                int v11_10 = v4_1.f;
                c5.a v12_6 = v4_1.g;
                h5.f v14_4 = v26_1.d();
                int v9_16 = new c5.c();
                int v8_16 = new j6.o(v9_16, 9);
                boolean v1_17 = new j6.o(v6_2);
                o5.f v21_0 = v14_4;
                h5.f v14_7 = new d4.l(v1.a.l("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", v15_12, "/settings"), v7_12);
                int v7_13 = g5.y.h;
                g5.v v36_0 = v4_1;
                String v23 = g2.g.e(android.os.Build.MANUFACTURER.replaceAll(v7_13, ""), "/", android.os.Build.MODEL.replaceAll(v7_13, ""));
                String v24 = android.os.Build$VERSION.INCREMENTAL.replaceAll(v7_13, "");
                String v25 = android.os.Build$VERSION.RELEASE.replaceAll(v7_13, "");
                boolean v4_8 = g5.g.d(v13_4, "com.google.firebase.crashlytics.mapping_file_id", "string");
                if (!v4_8) {
                    v4_8 = g5.g.d(v13_4, "com.crashlytics.android.build_id", "string");
                }
                boolean v4_10;
                if (!v4_8) {
                    v4_10 = 0;
                } else {
                    v4_10 = v13_4.getResources().getString(v4_8);
                }
                boolean v4_11 = new String[] {v4_10, v15_12, v12_6, v11_10});
                g5.n v5_13 = new java.util.ArrayList();
                Boolean v6_10 = 0;
                while (v6_10 < 4) {
                    int v7_44 = v4_11[v6_10];
                    String v22_3 = v4_11;
                    if (v7_44 != 0) {
                        v5_13.add(v7_44.replace("-", "").toLowerCase(java.util.Locale.US));
                    }
                    v6_10++;
                    v4_11 = v22_3;
                }
                java.util.Collections.sort(v5_13);
                boolean v4_13 = new StringBuilder();
                Boolean v6_11 = v5_13.size();
                int v7_15 = 0;
                while (v7_15 < v6_11) {
                    String v22_2 = v5_13.get(v7_15);
                    v7_15++;
                    int v27_1 = v5_13;
                    v4_13.append(((String) v22_2));
                    v5_13 = v27_1;
                }
                int v27_0;
                boolean v4_14 = v4_13.toString();
                if (v4_14.length() <= 0) {
                    v27_0 = 0;
                } else {
                    v27_0 = g5.g.h(v4_14);
                }
                g5.n v5_15;
                if (v21_0 == null) {
                    v5_15 = 1;
                } else {
                    v5_15 = 4;
                }
                boolean v1_28;
                g5.n v5_16 = new o5.f(v15_12, v23, v24, v25, v26_1, v27_0, v12_6, v11_10, g2.g.a(v5_15));
                Boolean v6_13 = new o5.d();
                int v7_17 = new java.util.concurrent.atomic.AtomicReference();
                v6_13.h = v7_17;
                v6_13.i = new java.util.concurrent.atomic.AtomicReference(new com.google.android.gms.tasks.TaskCompletionSource());
                v6_13.a = v13_4;
                v6_13.b = v5_16;
                v6_13.d = v9_16;
                v6_13.c = v8_16;
                v6_13.e = v1_17;
                v6_13.f = v14_7;
                v6_13.g = v10_0;
                v7_17.set(c5.c.m(v9_16));
                boolean v1_20 = ((java.util.concurrent.atomic.AtomicReference) v6_13.i);
                g5.n v5_18 = ((java.util.concurrent.atomic.AtomicReference) v6_13.h);
                if (!((android.content.Context) v6_13.a).getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", "").equals(((o5.f) v6_13.b).f)) {
                    g5.o v2_6 = v6_13.a(3);
                    if (v2_6 != null) {
                        v5_18.set(v2_6);
                        ((com.google.android.gms.tasks.TaskCompletionSource) v1_20.get()).trySetResult(v2_6);
                    }
                    boolean v1_24 = ((g5.v) v6_13.g);
                    v1_28 = h5.b.a(v1_24.f.getTask(), v1_24.c.getTask()).onSuccessTask(v3_4.a, new n0.a(v6_13, v3_4, 3, 0));
                } else {
                    g5.o v2_5 = v6_13.a(1);
                    if (v2_5 == null) {
                    } else {
                        v5_18.set(v2_5);
                        ((com.google.android.gms.tasks.TaskCompletionSource) v1_20.get()).trySetResult(v2_5);
                        v1_28 = com.google.android.gms.tasks.Tasks.forResult(0);
                    }
                }
                String v3_9;
                v1_28.addOnFailureListener(v0_4, new a5.t(5));
                int v9_19 = v32_0;
                Exception v0_6 = v9_19.i;
                g5.o v2_12 = v9_19.a;
                if (v2_12 == null) {
                    v3_9 = 1;
                } else {
                    g5.n v5_21 = v2_12.getResources();
                    if (v5_21 == null) {
                    } else {
                        int v7_25 = g5.g.d(v2_12, "com.crashlytics.RequireBuildId", "bool");
                        if (v7_25 <= 0) {
                            String v3_8 = g5.g.d(v2_12, "com.crashlytics.RequireBuildId", "string");
                            if (v3_8 <= null) {
                            } else {
                                v3_9 = Boolean.parseBoolean(v2_12.getString(v3_8));
                            }
                        } else {
                            v3_9 = v5_21.getBoolean(v7_25);
                        }
                    }
                }
                g5.n v5_23 = v36_0;
                if (v3_9 != null) {
                    v3_5 = "FirebaseCrashlytics";
                    if (android.text.TextUtils.isEmpty(v5_23.b)) {
                        android.util.Log.e("FirebaseCrashlytics", ".");
                        android.util.Log.e("FirebaseCrashlytics", ".     |  | ");
                        android.util.Log.e("FirebaseCrashlytics", ".     |  |");
                        android.util.Log.e("FirebaseCrashlytics", ".     |  |");
                        android.util.Log.e("FirebaseCrashlytics", ".   \\ |  | /");
                        android.util.Log.e("FirebaseCrashlytics", ".    \\    /");
                        android.util.Log.e("FirebaseCrashlytics", ".     \\  /");
                        android.util.Log.e("FirebaseCrashlytics", ".      \\/");
                        android.util.Log.e("FirebaseCrashlytics", ".");
                        android.util.Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app\'s build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                        android.util.Log.e("FirebaseCrashlytics", ".");
                        android.util.Log.e("FirebaseCrashlytics", ".      /\\");
                        android.util.Log.e("FirebaseCrashlytics", ".     /  \\");
                        android.util.Log.e("FirebaseCrashlytics", ".    /    \\");
                        android.util.Log.e("FirebaseCrashlytics", ".   / |  | \\");
                        android.util.Log.e("FirebaseCrashlytics", ".     |  |");
                        android.util.Log.e("FirebaseCrashlytics", ".     |  |");
                        android.util.Log.e("FirebaseCrashlytics", ".     |  |");
                        android.util.Log.e("FirebaseCrashlytics", ".");
                        throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app\'s build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                    }
                } else {
                    v3_5 = "FirebaseCrashlytics";
                    if (android.util.Log.isLoggable("FirebaseCrashlytics", 2)) {
                        android.util.Log.v("FirebaseCrashlytics", "Configured not to require a build ID.", 0);
                    }
                }
                boolean v1_35 = new g5.e().a;
                try {
                    v9_19.f = new k2.c(16, "crash_marker", v0_6);
                    v9_19.e = new k2.c(16, "initialization_marker", v0_6);
                    int v8_24 = v31_0;
                    int v7_35 = new m5.c(v1_35, v0_6, v8_24);
                    d5.b v10_7 = new i5.e(v0_6);
                    boolean v4_18 = new p5.a[1];
                    v4_18[0] = new v3.f();
                    Exception v0_19 = new n0.a(v4_18);
                    boolean v4_19 = v9_19.n;
                    v4_19.getClass();
                    ((a5.v) v4_19.b).a(new a5.a(new d5.c(v7_35), 4));
                    g5.v v36_1 = v5_23;
                    m5.c v40_0 = v6_13;
                    k2.c v38_0 = v7_35;
                    m5.c v37_0 = v10_7;
                    Exception v0_20 = v40_0;
                    v9_19.g = new g5.n(v9_19.a, v9_19.h, v9_19.b, v9_19.i, v9_19.f, v36_1, v38_0, v37_0, a5.z.m(v9_19.a, v9_19.h, v9_19.i, v36_1, v37_0, v38_0, v0_19, v40_0, v9_19.c, v9_19.l, v9_19.o), v9_19.m, v9_19.k, v9_19.l, v9_19.o);
                    boolean v4_25 = v9_19.e;
                    g5.n v5_26 = ((m5.c) v4_25.c);
                    boolean v4_27 = ((String) v4_25.b);
                    v5_26.getClass();
                    boolean v4_28 = new java.io.File(((java.io.File) v5_26.d), v4_27).exists();
                } catch (Exception v0_21) {
                    android.util.Log.e(v3_5, "Crashlytics was not started due to an exception during initialization", v0_21);
                    v9_19.g = 0;
                    v4_2 = new c5.c();
                }
                Boolean.TRUE.equals(((Boolean) v8_24.a.a.submit(new g5.p(v9_19, 0)).get(3, java.util.concurrent.TimeUnit.SECONDS)));
                g5.n v5_34 = v9_19.g;
                Boolean v6_21 = Thread.getDefaultUncaughtExceptionHandler();
                v5_34.e.a.a(new a5.i(6, v5_34, v1_35));
                int v7_42 = new g5.u(new l6.c(v5_34, 18), v0_20, v6_21, v5_34.j);
                v5_34.n = v7_42;
                Thread.setDefaultUncaughtExceptionHandler(v7_42);
                if (v4_28) {
                    if (v2_12.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                        boolean v1_43 = ((android.net.ConnectivityManager) v2_12.getSystemService("connectivity")).getActiveNetworkInfo();
                        if (!v1_43) {
                            if (android.util.Log.isLoggable(v3_5, 3)) {
                                android.util.Log.d(v3_5, "Successfully configured exception handler.", 0);
                            }
                            v8_24.a.a(new g5.o(v9_19, v0_20, 0));
                        } else {
                            if (!v1_43.isConnectedOrConnecting()) {
                            }
                        }
                    }
                    if (android.util.Log.isLoggable(v3_5, 3)) {
                        android.util.Log.d(v3_5, "Crashlytics did not finish previous background initialization. Initializing synchronously.", 0);
                    }
                    v9_19.b(v0_20);
                }
        }
    }

    public void onComplete(com.google.android.gms.tasks.Task p2)
    {
        switch (this.a) {
            case 11:
                j6.c0.a(((android.content.Intent) this.b));
                return;
            case 12:
                ((j6.e0) this.b).b.trySetResult(0);
                return;
            default:
                ((java.util.concurrent.ScheduledFuture) this.b).cancel(0);
                return;
        }
    }

    public void onSuccess(Object p11)
    {
        IllegalStateException v1_0 = this.b;
        switch (this.a) {
            case 8:
                com.chilllive.chillwallpaperproject.MainActivity v2_1 = ((com.chilllive.chillwallpaperproject.MainActivity) v1_0);
                IllegalStateException v1_3 = ((c4.a) p11).b;
                if (((c4.a) p11).a == 2) {
                    IllegalStateException v0_6 = ((byte) (((byte) (0 | 1)) | 2));
                    if (v0_6 == 3) {
                        int v9_0;
                        if (v1_3 == null) {
                            v9_0 = 0;
                        } else {
                            v9_0 = v1_3;
                        }
                        if (v9_0 != 0) {
                            v2_1.e0 = 1;
                            int v9_5 = ((byte) (((byte) (0 | 1)) | 2));
                            try {
                                if (v9_5 == 3) {
                                    android.content.IntentSender v3_2;
                                    v2_1.b0.getClass();
                                    if (v1_3 == null) {
                                        v3_2 = 0;
                                    } else {
                                        v3_2 = v1_3;
                                    }
                                    if (v3_2 != null) {
                                        if (!((c4.a) p11).c) {
                                            ((c4.a) p11).c = 1;
                                            if (v1_3 == null) {
                                                v1_3 = 0;
                                            } else {
                                            }
                                            v2_1.startIntentSenderForResult(v1_3.getIntentSender(), 100, 0, 0, 0, 0, 0);
                                        } else {
                                        }
                                    }
                                } else {
                                    String v11_3 = new StringBuilder();
                                    if ((v9_5 & 1) == 0) {
                                        v11_3.append(" appUpdateType");
                                    }
                                    if ((v9_5 & 2) == 0) {
                                        v11_3.append(" allowAssetPackDeletion");
                                    }
                                    throw new IllegalStateException("Missing required properties:".concat(v11_3.toString()));
                                }
                            } catch (IllegalStateException v0_12) {
                                v0_12.printStackTrace();
                            }
                        }
                    } else {
                        String v11_8 = new StringBuilder();
                        if ((v0_6 & 1) == 0) {
                            v11_8.append(" appUpdateType");
                        }
                        if ((v0_6 & 2) == 0) {
                            v11_8.append(" allowAssetPackDeletion");
                        }
                        throw new IllegalStateException("Missing required properties:".concat(v11_8.toString()));
                    }
                }
                return;
            case 18:
                Object vtmp2 = ((u0.c) v1_0).invoke(p11);
                return;
            case 19:
                Object vtmp3 = ((u0.c) v1_0).invoke(p11);
                return;
            case 20:
                Object vtmp4 = ((u0.c) v1_0).invoke(p11);
                return;
            default:
                Object vtmp1 = ((u0.c) v1_0).invoke(p11);
                return;
        }
    }

    public com.google.android.gms.tasks.Task then(Object p2)
    {
        return com.google.android.gms.tasks.Tasks.forResult(((n6.h) this.b));
    }

    public Object then(com.google.android.gms.tasks.Task p4)
    {
        switch (this.a) {
            case 5:
                ((java.util.concurrent.CountDownLatch) this.b).countDown();
                return 0;
            case 6:
                return ((com.google.android.gms.tasks.Task) ((g5.l) this.b).call());
            case 7:
                ((Runnable) this.b).run();
                return com.google.android.gms.tasks.Tasks.forResult(0);
            default:
                ((a5.z) this.b).getClass();
                java.io.IOException v4_9 = ((android.os.Bundle) p4.getResult(java.io.IOException));
                if (v4_9 == null) {
                    throw new java.io.IOException("SERVICE_NOT_AVAILABLE");
                } else {
                    Throwable v1_1 = v4_9.getString("registration_id");
                    if (v1_1 == null) {
                        v1_1 = v4_9.getString("unregistered");
                        if (v1_1 == null) {
                            Throwable v1_4 = v4_9.getString("error");
                            if ("RST".equals(v1_4)) {
                                throw new java.io.IOException("INSTANCE_ID_RESET");
                            } else {
                                if (v1_4 == null) {
                                    Throwable v1_6 = new StringBuilder("Unexpected response: ");
                                    v1_6.append(v4_9);
                                    android.util.Log.w("FirebaseMessaging", v1_6.toString(), new Throwable());
                                    throw new java.io.IOException("SERVICE_NOT_AVAILABLE");
                                } else {
                                    throw new java.io.IOException(v1_4);
                                }
                            }
                        }
                    }
                    return v1_1;
                }
        }
    }
}
