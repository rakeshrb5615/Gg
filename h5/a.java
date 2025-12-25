package h5;
public final synthetic class a implements com.google.android.gms.tasks.Continuation, com.google.android.gms.tasks.OnCompleteListener, com.google.android.gms.tasks.SuccessContinuation, com.google.android.gms.tasks.OnSuccessListener, z2.b, y2.f {
    public final synthetic int a;
    public final synthetic Object b;
    public final synthetic Object c;
    public final synthetic Object d;

    public synthetic a(Object p1, Object p2, Object p3, int p4)
    {
        this.a = p4;
        this.b = p1;
        this.c = p2;
        this.d = p3;
        return;
    }

    public Object apply(Object p27)
    {
        int v7_22 = 5;
        int v8_17 = 4;
        byte[] v9_17 = 3;
        int v10_11 = u2.c.d;
        int v11_3 = 2;
        int v12_0 = 1;
        r2.j v13_0 = this.d;
        java.util.ArrayList v14_0 = this.c;
        y2.b v2_2 = 0;
        y2.h v15_1 = ((y2.h) this.b);
        switch (this.a) {
            case 7:
                Throwable v0_17;
                java.util.ArrayList v14_2 = ((r2.i) v14_0);
                Throwable v0_2 = v14_2.c;
                h5.a v1_17 = v14_2.a;
                r2.j v13_2 = ((r2.j) v13_0);
                android.content.ContentValues v6_0 = Integer.valueOf(0);
                int v7_5 = v15_1.d;
                if ((v15_1.c().compileStatement("PRAGMA page_size").simpleQueryForLong() * v15_1.c().compileStatement("PRAGMA page_count").simpleQueryForLong()) < v7_5.a) {
                    long v4_7;
                    long v4_4 = y2.h.f(((android.database.sqlite.SQLiteDatabase) p27), v13_2);
                    if (v4_4 == 0) {
                        long v4_6 = new android.content.ContentValues();
                        v4_6.put("backend_name", v13_2.a);
                        v4_6.put("priority", Integer.valueOf(b3.a.a(v13_2.c)));
                        v4_6.put("next_request_ms", v6_0);
                        String v5_7 = v13_2.b;
                        if (v5_7 != null) {
                            v4_6.put("extras", android.util.Base64.encodeToString(v5_7, 0));
                        }
                        v4_7 = ((android.database.sqlite.SQLiteDatabase) p27).insert("transport_contexts", 0, v4_6);
                    } else {
                        v4_7 = v4_4.longValue();
                    }
                    byte[] v9_4;
                    int v7_6 = v7_5.e;
                    int v8_10 = v0_2.b;
                    if (v8_10.length > v7_6) {
                        v9_4 = 0;
                    } else {
                        v9_4 = 1;
                    }
                    Throwable v0_10;
                    int v10_2 = new android.content.ContentValues();
                    v10_2.put("context_id", Long.valueOf(v4_7));
                    v10_2.put("transport_name", v1_17);
                    v10_2.put("timestamp_ms", Long.valueOf(v14_2.d));
                    v10_2.put("uptime_ms", Long.valueOf(v14_2.e));
                    v10_2.put("payload_encoding", v0_2.a.a);
                    v10_2.put("code", v14_2.b);
                    v10_2.put("num_attempts", v6_0);
                    v10_2.put("inline", Boolean.valueOf(v9_4));
                    if (v9_4 == null) {
                        v0_10 = new byte[0];
                    } else {
                        v0_10 = v8_10;
                    }
                    v10_2.put("payload", v0_10);
                    v10_2.put("product_id", v14_2.g);
                    v10_2.put("pseudonymous_id", v14_2.h);
                    v10_2.put("experiment_ids_clear_blob", v14_2.i);
                    v10_2.put("experiment_ids_encrypted_blob", v14_2.j);
                    long v4_16 = ((android.database.sqlite.SQLiteDatabase) p27).insert("events", 0, v10_2);
                    if (v9_4 == null) {
                        h5.a v1_30 = ((int) Math.ceil((((double) v8_10.length) / ((double) v7_6))));
                        int v12_3 = 1;
                        while (v12_3 <= v1_30) {
                            android.content.ContentValues v6_6 = java.util.Arrays.copyOfRange(v8_10, ((v12_3 - 1) * v7_6), Math.min((v12_3 * v7_6), v8_10.length));
                            byte[] v9_11 = new android.content.ContentValues();
                            v9_11.put("event_id", Long.valueOf(v4_16));
                            v9_11.put("sequence_num", Integer.valueOf(v12_3));
                            v9_11.put("bytes", v6_6);
                            ((android.database.sqlite.SQLiteDatabase) p27).insert("event_payloads", 0, v9_11);
                            v12_3++;
                        }
                    }
                    h5.a v1_34 = java.util.Collections.unmodifiableMap(v14_2.f).entrySet().iterator();
                    while (v1_34.hasNext()) {
                        String v3_3 = ((java.util.Map$Entry) v1_34.next());
                        android.content.ContentValues v6_2 = new android.content.ContentValues();
                        v6_2.put("event_id", Long.valueOf(v4_16));
                        v6_2.put("name", ((String) v3_3.getKey()));
                        v6_2.put("value", ((String) v3_3.getValue()));
                        ((android.database.sqlite.SQLiteDatabase) p27).insert("event_metadata", 0, v6_2);
                    }
                    v0_17 = Long.valueOf(v4_16);
                } else {
                    v15_1.x(1, v10_11, v1_17);
                    v0_17 = Long.valueOf(-1);
                }
                return v0_17;
            case 8:
                java.util.ArrayList v14_1 = ((java.util.ArrayList) v14_0);
                r2.j v13_1 = ((r2.j) v13_0);
                while (((android.database.Cursor) p27).moveToNext()) {
                    y2.b v2_14;
                    long v4_14 = ((android.database.Cursor) p27).getLong(0);
                    if (((android.database.Cursor) p27).getInt(7) == 0) {
                        v2_14 = 0;
                    } else {
                        v2_14 = v12_0;
                    }
                    android.content.ContentValues v6_7 = new r2.h();
                    v6_7.f = new java.util.HashMap();
                    int v7_15 = ((android.database.Cursor) p27).getString(v12_0);
                    if (v7_15 == 0) {
                        throw new NullPointerException("Null transportName");
                    } else {
                        v6_7.a = v7_15;
                        v6_7.d = Long.valueOf(((android.database.Cursor) p27).getLong(v11_3));
                        v6_7.e = Long.valueOf(((android.database.Cursor) p27).getLong(3));
                        if (v2_14 == null) {
                            int v10_10;
                            int v10_9 = ((android.database.Cursor) p27).getString(4);
                            if (v10_9 != 0) {
                                v10_10 = new o2.c(v10_9);
                            } else {
                                v10_10 = y2.h.f;
                            }
                            int v7_1 = v15_1.c().query("event_payloads", new String[] {"bytes"}), "event_id = ?", new String[] {String.valueOf(v4_14)}), 0, 0, "sequence_num");
                            try {
                                int v8_1 = new java.util.ArrayList();
                                byte[] v9_0 = 0;
                            } catch (Throwable v0_1) {
                                int v27_1 = v7_1;
                                v27_1.close();
                                throw v0_1;
                            }
                            while (v7_1.moveToNext()) {
                                int v12_2 = v7_1.getBlob(0);
                                v8_1.add(v12_2);
                                v9_0 += v12_2.length;
                                int v12 = 1;
                            }
                            byte[] v9_18 = new byte[v9_0];
                            int v11_0 = 0;
                            int v12_1 = 0;
                            while (v11_0 < v8_1.size()) {
                                h5.a v1_2 = ((byte[]) v8_1.get(v11_0));
                                v27_1 = v7_1;
                                try {
                                    int v20_0 = v8_1;
                                    System.arraycopy(v1_2, 0, v9_18, v12_1, v1_2.length);
                                    v12_1 += v1_2.length;
                                    v11_0++;
                                    v7_1 = v27_1;
                                    v8_1 = v20_0;
                                } catch (Throwable v0_1) {
                                }
                            }
                            v7_1.close();
                            v6_7.c = new r2.m(v10_10, v9_18);
                        } else {
                            int v8_4;
                            byte[] v9_1 = ((android.database.Cursor) p27).getString(4);
                            if (v9_1 != null) {
                                v8_4 = new o2.c(v9_1);
                            } else {
                                v8_4 = y2.h.f;
                            }
                            v6_7.c = new r2.m(v8_4, ((android.database.Cursor) p27).getBlob(5));
                        }
                        if (!((android.database.Cursor) p27).isNull(6)) {
                            v6_7.b = Integer.valueOf(((android.database.Cursor) p27).getInt(6));
                        }
                        if (!((android.database.Cursor) p27).isNull(8)) {
                            v6_7.g = Integer.valueOf(((android.database.Cursor) p27).getInt(8));
                        }
                        if (!((android.database.Cursor) p27).isNull(9)) {
                            v6_7.h = ((android.database.Cursor) p27).getString(9);
                        }
                        if (!((android.database.Cursor) p27).isNull(10)) {
                            v6_7.i = ((android.database.Cursor) p27).getBlob(10);
                        }
                        if (!((android.database.Cursor) p27).isNull(11)) {
                            v6_7.j = ((android.database.Cursor) p27).getBlob(11);
                        }
                        v14_1.add(new y2.b(v4_14, v13_1, v6_7.b()));
                        v11_3 = 2;
                        v12_0 = 1;
                    }
                }
                return 0;
            default:
                java.util.ArrayList v14_3 = ((java.util.HashMap) v14_0);
                r2.j v13_3 = ((j6.s) v13_0);
                Throwable v0_20 = ((java.util.ArrayList) v13_3.d);
                v15_1.getClass();
                while (((android.database.Cursor) p27).moveToNext()) {
                    y2.b v2_34;
                    android.content.ContentValues v6_14 = ((android.database.Cursor) p27).getString(v2_2);
                    y2.b v2_32 = ((android.database.Cursor) p27).getInt(1);
                    u2.c v16_2 = u2.c.b;
                    if (v2_32 != null) {
                        if (v2_32 != 1) {
                            if (v2_32 != 2) {
                                if (v2_32 != v9_17) {
                                    if (v2_32 != v8_17) {
                                        if (v2_32 != v7_22) {
                                            if (v2_32 != 6) {
                                                c4.b.v("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(v2_32));
                                                v2_34 = v16_2;
                                            } else {
                                                v16_2 = u2.c.n;
                                            }
                                        } else {
                                            v16_2 = u2.c.m;
                                        }
                                    } else {
                                        v16_2 = u2.c.f;
                                    }
                                } else {
                                    v16_2 = u2.c.e;
                                }
                            } else {
                                v2_34 = v10_11;
                            }
                        } else {
                            v16_2 = u2.c.c;
                        }
                    }
                    int v7_21 = ((android.database.Cursor) p27).getLong(2);
                    if (!v14_3.containsKey(v6_14)) {
                        v14_3.put(v6_14, new java.util.ArrayList());
                    }
                    ((java.util.List) v14_3.get(v6_14)).add(new u2.d(v7_21, v2_34));
                    v2_2 = 0;
                    v7_22 = 5;
                    v8_17 = 4;
                    v9_17 = 3;
                }
                y2.b v2_17 = v14_3.entrySet().iterator();
                while (v2_17.hasNext()) {
                    String v3_13 = ((java.util.Map$Entry) v2_17.next());
                    new java.util.ArrayList();
                    v0_20.add(new u2.e(((String) v3_13.getKey()), java.util.Collections.unmodifiableList(((java.util.List) v3_13.getValue()))));
                }
                y2.b v2_19 = v15_1.b.b();
                android.content.ContentValues v6_9 = v15_1.c();
                v6_9.beginTransaction();
                try {
                    byte[] v9_12 = new String[0];
                    int v7_14 = v6_9.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", v9_12);
                    try {
                        v7_14.moveToNext();
                        int v10_8 = new u2.g(v7_14.getLong(0), v2_19);
                    } catch (Throwable v0_21) {
                        v7_14.close();
                        throw v0_21;
                    }
                    v7_14.close();
                    v6_9.setTransactionSuccessful();
                    v6_9.endTransaction();
                    v13_3.c = v10_8;
                    v6_9 = new u2.f((v15_1.c().compileStatement("PRAGMA page_size").simpleQueryForLong() * v15_1.c().compileStatement("PRAGMA page_count").simpleQueryForLong()), y2.a.f.a);
                    v13_3.e = new u2.b(v6_9);
                    v13_3.b = ((String) v15_1.e.get());
                    return new u2.a(((u2.g) v13_3.c), java.util.Collections.unmodifiableList(v0_20), ((u2.b) v13_3.e), ((String) v13_3.b));
                } catch (Throwable v0_25) {
                    v6_9.endTransaction();
                    throw v0_25;
                }
        }
    }

    public Object b()
    {
        int v0_1 = ((w2.a) this.b);
        r2.j v1_1 = ((r2.j) this.c);
        int v2_4 = ((r2.i) this.d);
        int v3_2 = ((y2.h) v0_1.d);
        v3_2.getClass();
        h5.a v4_5 = v1_1.c;
        int v5_0 = v2_4.a;
        String v6 = v1_1.a;
        String v7_1 = "TRuntime.".concat("SQLiteEventStore");
        if (android.util.Log.isLoggable(v7_1, 3)) {
            StringBuilder v8_4 = new StringBuilder("Storing event with priority=");
            v8_4.append(v4_5);
            v8_4.append(", name=");
            v8_4.append(v5_0);
            v8_4.append(" for destination ");
            v8_4.append(v6);
            android.util.Log.d(v7_1, v8_4.toString());
        }
        ((Long) v3_2.i(new h5.a(v3_2, v2_4, v1_1, 7))).getClass();
        v0_1.a.s(v1_1, 1, 0);
        return 0;
    }

    public void onComplete(com.google.android.gms.tasks.Task p5)
    {
        a5.t v0_1 = ((k2.c) this.b);
        int v1_1 = ((android.app.Activity) this.c);
        if (!p5.isSuccessful()) {
            c4.b.F(((android.content.Context) this.d));
            return;
        } else {
            com.google.android.gms.tasks.Task v5_10;
            com.google.android.gms.tasks.Task v5_3 = ((h4.b) ((h4.a) p5.getResult()));
            if (!v5_3.b) {
                android.content.Intent v2_2 = new android.content.Intent(v1_1, com.google.android.play.core.common.PlayCoreDialogWrapperActivity);
                v2_2.putExtra("confirmation_intent", v5_3.a);
                v2_2.putExtra("window_flags", v1_1.getWindow().getDecorView().getWindowSystemUiVisibility());
                com.google.android.gms.tasks.Task v5_9 = new com.google.android.gms.tasks.TaskCompletionSource();
                v2_2.putExtra("result_receiver", new h4.c(((android.os.Handler) v0_1.c), v5_9));
                v1_1.startActivity(v2_2);
                v5_10 = v5_9.getTask();
            } else {
                v5_10 = com.google.android.gms.tasks.Tasks.forResult(0);
            }
            v5_10.addOnCompleteListener(new a5.t(17));
            return;
        }
    }

    public void onSuccess(Object p5)
    {
        String v0_1 = ((j6.s) this.b);
        try {
            q6.d v5_4 = ((n6.f) ((com.google.android.gms.tasks.Task) this.c).getResult());
        } catch (q6.d v5_1) {
            android.util.Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscriber. Continuing to listen for changes.", v5_1);
            return;
        }
        if (v5_4 == null) {
            return;
        } else {
            ((java.util.concurrent.Executor) v0_1.d).execute(new o6.a(((d5.c) this.d), ((n0.a) v0_1.c).g(v5_4), 1));
            return;
        }
    }

    public com.google.android.gms.tasks.Task then(Object p9)
    {
        String v4_2;
        android.content.Context v0_1 = ((com.google.firebase.messaging.FirebaseMessaging) this.b);
        android.content.Intent v1_1 = ((String) this.c);
        j6.j v2_1 = ((j6.t) this.d);
        String v3_3 = com.google.firebase.messaging.FirebaseMessaging.c(v0_1.b);
        String v5_0 = v0_1.a;
        v5_0.a();
        if (!"[DEFAULT]".equals(v5_0.b)) {
            v4_2 = v5_0.f();
        } else {
            v4_2 = "";
        }
        String v5_3 = j6.t.a(((String) p9), v0_1.h.a(), System.currentTimeMillis());
        if (v5_3 != null) {
            android.content.SharedPreferences$Editor v6_4 = ((android.content.SharedPreferences) v3_3.b).edit();
            StringBuilder v7_1 = new StringBuilder();
            v7_1.append(v4_2);
            v7_1.append("|T|");
            v7_1.append(v1_1);
            v7_1.append("|*");
            v6_4.putString(v7_1.toString(), v5_3);
            v6_4.commit();
        }
        if ((v2_1 == null) || (!((String) p9).equals(v2_1.a))) {
            String v3_0 = v0_1.a;
            v3_0.a();
            if ("[DEFAULT]".equals(v3_0.b)) {
                if (android.util.Log.isLoggable("FirebaseMessaging", 3)) {
                    j6.j v2_7 = new StringBuilder("Invoking onNewToken for app: ");
                    v3_0.a();
                    v2_7.append(v3_0.b);
                    android.util.Log.d("FirebaseMessaging", v2_7.toString());
                }
                android.content.Intent v1_8 = new android.content.Intent("com.google.firebase.messaging.NEW_TOKEN");
                v1_8.putExtra("token", ((String) p9));
                new j6.j(v0_1.b).b(v1_8);
            }
        }
        return com.google.android.gms.tasks.Tasks.forResult(((String) p9));
    }

    public Object then(com.google.android.gms.tasks.Task p7)
    {
        switch (this.a) {
            case 0:
                com.google.android.gms.tasks.Task v0_14 = ((com.google.android.gms.tasks.TaskCompletionSource) this.b);
                if (!p7.isSuccessful()) {
                    if (p7.getException() == null) {
                        if (((java.util.concurrent.atomic.AtomicBoolean) this.c).getAndSet(1)) {
                            ((com.google.android.gms.tasks.CancellationTokenSource) this.d).cancel();
                        }
                    } else {
                        v0_14.trySetException(p7.getException());
                    }
                } else {
                    v0_14.trySetResult(p7.getResult());
                }
                return com.google.android.gms.tasks.Tasks.forResult(0);
            case 3:
                com.google.android.gms.tasks.Task v7_10;
                com.google.android.gms.tasks.Task v7_8 = ((m6.b) this.b);
                com.google.android.gms.tasks.Task v0_12 = ((com.google.android.gms.tasks.Task) this.c);
                boolean v1_14 = ((com.google.android.gms.tasks.Task) this.d);
                v7_8.getClass();
                if ((v0_12.isSuccessful()) && (v0_12.getResult() != null)) {
                    com.google.android.gms.tasks.Task v0_9 = ((n6.f) v0_12.getResult());
                    if (v1_14.isSuccessful()) {
                        boolean v1_6 = ((n6.f) v1_14.getResult());
                        if ((v1_6) && (v0_9.c.equals(v1_6.c))) {
                            v7_10 = com.google.android.gms.tasks.Tasks.forResult(Boolean.FALSE);
                            return v7_10;
                        }
                    }
                    boolean v1_9 = v7_8.d;
                    java.util.Date v2_7 = v1_9.a;
                    v7_10 = com.google.android.gms.tasks.Tasks.call(v2_7, new j6.h(2, v1_9, v0_9)).onSuccessTask(v2_7, new a5.u(5, v1_9, v0_9)).continueWith(v7_8.b, new m6.a(v7_8));
                } else {
                    v7_10 = com.google.android.gms.tasks.Tasks.forResult(Boolean.FALSE);
                }
                return v7_10;
            default:
                com.google.android.gms.tasks.Task v7_2;
                com.google.android.gms.tasks.Task v7_19 = ((n6.l) this.b);
                com.google.android.gms.tasks.Task v0_16 = ((com.google.android.gms.tasks.Task) this.c);
                boolean v1_16 = ((com.google.android.gms.tasks.Task) this.d);
                if (v0_16.isSuccessful()) {
                    if (v1_16.isSuccessful()) {
                        try {
                            java.util.Date v2_1 = new java.net.URL(v7_19.c(v7_19.n));
                        } catch (com.google.android.gms.tasks.Task v7_1) {
                            v7_2 = com.google.android.gms.tasks.Tasks.forException(new m6.c("Failed to open HTTP stream connection", v7_1));
                        }
                        java.util.Date v2_3 = ((java.net.HttpURLConnection) v2_1.openConnection());
                        v7_19.i(v2_3, ((String) v1_16.getResult()), ((d6.a) v0_16.getResult()).a);
                        v7_2 = com.google.android.gms.tasks.Tasks.forResult(v2_3);
                    } else {
                        v7_2 = com.google.android.gms.tasks.Tasks.forException(new m6.c("Firebase Installations failed to get installation ID for config update listener connection.", v1_16.getException()));
                    }
                } else {
                    v7_2 = com.google.android.gms.tasks.Tasks.forException(new m6.c("Firebase Installations failed to get installation auth token for config update listener connection.", v0_16.getException()));
                }
                return v7_2;
        }
    }
}
