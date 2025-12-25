package g5;
public final class n {
    public static final g5.h r;
    public static final java.nio.charset.Charset s;
    public final android.content.Context a;
    public final g5.v b;
    public final k2.c c;
    public final m5.c d;
    public final h5.f e;
    public final g5.y f;
    public final m5.c g;
    public final g5.a h;
    public final i5.e i;
    public final d5.b j;
    public final e5.a k;
    public final g5.k l;
    public final a5.z m;
    public g5.u n;
    public final com.google.android.gms.tasks.TaskCompletionSource o;
    public final com.google.android.gms.tasks.TaskCompletionSource p;
    public final com.google.android.gms.tasks.TaskCompletionSource q;

    static n()
    {
        g5.n.r = new g5.h(1);
        g5.n.s = java.nio.charset.Charset.forName("UTF-8");
        return;
    }

    public n(android.content.Context p3, g5.y p4, g5.v p5, m5.c p6, k2.c p7, g5.a p8, m5.c p9, i5.e p10, a5.z p11, d5.b p12, e5.a p13, g5.k p14, h5.f p15)
    {
        this.o = new com.google.android.gms.tasks.TaskCompletionSource();
        this.p = new com.google.android.gms.tasks.TaskCompletionSource();
        this.q = new com.google.android.gms.tasks.TaskCompletionSource();
        new java.util.concurrent.atomic.AtomicBoolean(0);
        this.a = p3;
        this.f = p4;
        this.b = p5;
        this.g = p6;
        this.c = p7;
        this.h = p8;
        this.d = p9;
        this.i = p10;
        this.j = p12;
        this.k = p13;
        this.l = p14;
        this.m = p11;
        this.e = p15;
        return;
    }

    public static com.google.android.gms.tasks.Task a(g5.n p9)
    {
        p9.getClass();
        java.util.ArrayList v1_1 = new java.util.ArrayList();
        java.util.Iterator v2_1 = m5.c.e(((java.io.File) p9.g.d).listFiles(g5.n.r)).iterator();
        while (v2_1.hasNext()) {
            java.io.File v3_2 = ((java.io.File) v2_1.next());
            try {
                long v7 = Long.parseLong(v3_2.getName().substring(3));
            } catch (NumberFormatException) {
                com.google.android.gms.tasks.Task v5_9 = new StringBuilder("Could not parse app exception timestamp from file ");
                v5_9.append(v3_2.getName());
                android.util.Log.w("FirebaseCrashlytics", v5_9.toString(), 0);
                v3_2.delete();
            }
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            android.util.Log.w("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists", 0);
            com.google.android.gms.tasks.Task v5_6 = com.google.android.gms.tasks.Tasks.forResult(0);
            v1_1.add(v5_6);
        }
        return com.google.android.gms.tasks.Tasks.whenAll(v1_1);
    }

    public final void b(boolean p33, o5.d p34, boolean p35)
    {
        m5.a v3_0 = this.j;
        h5.f.a();
        java.io.File v6_20 = this.m;
        boolean v5_0 = new java.util.ArrayList(((m5.a) v6_20.b).c());
        if (v5_0.size() > p33) {
            j6.o v2_8;
            int v11_13;
            boolean v30;
            int v17;
            j5.z0 v31_0;
            int v16;
            java.util.Iterator v9_1 = ((String) v5_0.get(p33));
            if ((!p35) || (!p34.b().b.b)) {
                v31_0 = v5_0;
                v30 = v6_20;
                v2_8 = 2;
                v11_13 = 0;
                v16 = 4;
                v17 = 8;
                if (android.util.Log.isLoggable("FirebaseCrashlytics", 2)) {
                    android.util.Log.v("FirebaseCrashlytics", "ANR feature disabled.", 0);
                }
            } else {
                String v0_32 = this.g;
                j5.a0 v15_0 = android.os.Build$VERSION.SDK_INT;
                v16 = 4;
                if (v15_0 < 30) {
                    v31_0 = v5_0;
                    v30 = v6_20;
                    v2_8 = 2;
                    v11_13 = 0;
                    v17 = 8;
                    String v0_61 = g2.g.c(v15_0, "ANR feature enabled, but device is API ");
                    if (android.util.Log.isLoggable("FirebaseCrashlytics", 2)) {
                        android.util.Log.v("FirebaseCrashlytics", v0_61, 0);
                    }
                } else {
                    int v12_45 = ((android.app.ActivityManager) this.a.getSystemService("activity")).getHistoricalProcessExitReasons(0, 0, 0);
                    if (v12_45.size() == 0) {
                        v31_0 = v5_0;
                        v30 = v6_20;
                        v17 = 8;
                        String v0_92 = g2.g.l("No ApplicationExitInfo available. Session: ", v9_1);
                        v2_8 = 2;
                        if (android.util.Log.isLoggable("FirebaseCrashlytics", 2)) {
                            v11_13 = 0;
                            android.util.Log.v("FirebaseCrashlytics", v0_92, 0);
                            if ((p35) && (v3_0.c(v9_1))) {
                                String v0_54 = g2.g.l("Finalizing native report for session ", v9_1);
                                if (android.util.Log.isLoggable("FirebaseCrashlytics", v2_8)) {
                                    android.util.Log.v("FirebaseCrashlytics", v0_54, v11_13);
                                }
                                v3_0.a(v9_1).getClass();
                                String v0_57 = new StringBuilder("No minidump data found for session ");
                                v0_57.append(v9_1);
                                android.util.Log.w("FirebaseCrashlytics", v0_57.toString(), v11_13);
                                String v0_60 = new StringBuilder("No Tombstones data found for session ");
                                v0_60.append(v9_1);
                                android.util.Log.i("FirebaseCrashlytics", v0_60.toString(), v11_13);
                                android.util.Log.w("FirebaseCrashlytics", "No native core present", v11_13);
                            }
                            String v0_65;
                            IllegalStateException v1_27;
                            if (!p33) {
                                v1_27 = 0;
                                this.l.a(v11_13);
                                v0_65 = 0;
                            } else {
                                v1_27 = 0;
                                v0_65 = ((String) v31_0.get(0));
                            }
                            byte v7_42 = (System.currentTimeMillis() / 1000);
                            m5.a v3_3 = ((m5.a) v30.b);
                            boolean v5_17 = v3_3.b;
                            v5_17.a(".com.google.firebase.crashlytics");
                            v5_17.a(".com.google.firebase.crashlytics-ndk");
                            if (!((String) v5_17.b).isEmpty()) {
                                v5_17.a(".com.google.firebase.crashlytics.files.v1");
                                java.util.Iterator v9_10 = new StringBuilder(".com.google.firebase.crashlytics.files.v2");
                                v9_10.append(java.io.File.pathSeparator);
                                java.util.Iterator v9_11 = v9_10.toString();
                                g5.t v10_8 = ((java.io.File) v5_17.c);
                                if (v10_8.exists()) {
                                    java.util.Iterator v9_12 = v10_8.list(new m5.b(v9_11));
                                    if (v9_12 != null) {
                                        g5.t v10_9 = v9_12.length;
                                        int v11_20 = v1_27;
                                        while (v11_20 < v10_9) {
                                            v5_17.a(v9_12[v11_20]);
                                            v11_20++;
                                        }
                                    }
                                }
                            }
                            java.util.Iterator v9_13 = v3_3.c();
                            if (v0_65 != null) {
                                v9_13.remove(v0_65);
                            }
                            g5.t v10_10 = v17;
                            if (v9_13.size() > v10_10) {
                                while (v9_13.size() > v10_10) {
                                    String v0_70 = ((String) v9_13.last());
                                    int v11_22 = g2.g.l("Removing session over cap: ", v0_70);
                                    if (android.util.Log.isLoggable("FirebaseCrashlytics", 3)) {
                                        android.util.Log.d("FirebaseCrashlytics", v11_22, 0);
                                    }
                                    m5.c.d(new java.io.File(((java.io.File) v5_17.e), v0_70));
                                    v9_13.remove(v0_70);
                                }
                            }
                            java.util.Iterator v9_14 = v9_13.iterator();
                            while (v9_14.hasNext()) {
                                g5.t v10_12 = ((String) v9_14.next());
                                String v0_79 = g2.g.l("Finalizing report for session ", v10_12);
                                if (android.util.Log.isLoggable("FirebaseCrashlytics", 2)) {
                                    android.util.Log.v("FirebaseCrashlytics", v0_79, 0);
                                }
                                int v11_27 = m5.a.g;
                                int v12_48 = new java.io.File(((java.io.File) v5_17.e), v10_12);
                                v12_48.mkdirs();
                                String v0_82 = m5.c.e(v12_48.listFiles(m5.a.i));
                                if (!v0_82.isEmpty()) {
                                    java.util.Collections.sort(v0_82);
                                    int v12_51 = new java.util.ArrayList();
                                    java.io.File v13_8 = v0_82.iterator();
                                    java.util.ArrayList v14_9 = v1_27;
                                    while (v13_8.hasNext()) {
                                        j5.a0 v15_11 = ((java.io.File) v13_8.next());
                                        try {
                                            String v0_109 = m5.a.e(v15_11);
                                            v11_27.getClass();
                                            try {
                                                IllegalStateException v1_41 = new android.util.JsonReader(new java.io.StringReader(v0_109));
                                                try {
                                                    String v0_110 = k5.a.e(v1_41);
                                                } catch (String v0_111) {
                                                    java.io.File v6_40 = v0_111;
                                                    try {
                                                        v1_41.close();
                                                    } catch (String v0_112) {
                                                        v6_40.addSuppressed(v0_112);
                                                    }
                                                    throw v6_40;
                                                }
                                                v1_41.close();
                                                java.io.File v6_42;
                                                v12_51.add(v0_110);
                                                if (v14_9 != null) {
                                                    v6_42 = 1;
                                                } else {
                                                    String v0_114 = v15_11.getName();
                                                    if ((!v0_114.startsWith("event")) || (!v0_114.endsWith("_"))) {
                                                        v6_42 = 0;
                                                    }
                                                }
                                                v14_9 = v6_42;
                                                java.io.File v6 = 1;
                                            } catch (String v0_113) {
                                                throw new java.io.IOException(v0_113);
                                            }
                                        } catch (String v0_115) {
                                            IllegalStateException v1_47 = new StringBuilder("Could not add event to report for ");
                                            v1_47.append(v15_11);
                                            android.util.Log.w("FirebaseCrashlytics", v1_47.toString(), v0_115);
                                        }
                                    }
                                    if (!v12_51.isEmpty()) {
                                        String v0_87 = new i5.g(v5_17).d(v10_12);
                                        IllegalStateException v1_34 = v3_3.d.b;
                                        java.io.File v6_31;
                                        if (!java.util.Objects.equals(v1_34.b, v10_12)) {
                                            j5.a0 v15_4 = new java.io.File(((java.io.File) v1_34.a.e), v10_12);
                                            v15_4.mkdirs();
                                            java.io.File v6_27 = m5.c.e(v15_4.listFiles(g5.j.d));
                                            if (!v6_27.isEmpty()) {
                                                v6_31 = ((java.io.File) java.util.Collections.min(v6_27, g5.j.e)).getName().substring(v16);
                                            } else {
                                                android.util.Log.w("FirebaseCrashlytics", "Unable to read App Quality Sessions session id.", 0);
                                                v6_31 = 0;
                                            }
                                        } else {
                                            v6_31 = v1_34.c;
                                        }
                                        IllegalStateException v1_36 = v5_17.b(v10_12, "report");
                                        try {
                                            j5.a0 v15_6 = m5.a.e(v1_36);
                                            v11_27.getClass();
                                            int v11_28 = k5.a.i(v15_6);
                                            j5.a0 v15_7 = v11_28.a();
                                            int v11_29 = v11_28.k;
                                        } catch (String v0_91) {
                                            int v12 = 0;
                                            j6.o v2_31 = new StringBuilder("Could not synthesize final report file for ");
                                            v2_31.append(v1_36);
                                            android.util.Log.w("FirebaseCrashlytics", v2_31.toString(), v0_91);
                                        }
                                        if (v11_29 == 0) {
                                            String v0_94 = v15_7.a();
                                            j6.o v2_19 = v0_94.a();
                                            v2_19.g = v6_31;
                                            String v0_95 = v0_94.k;
                                            if (v0_95 != null) {
                                                String v0_96 = v0_95.a();
                                                v0_96.c = v6_31;
                                                v2_19.j = v0_96.a();
                                            }
                                            String v0_98 = v2_19.a();
                                            j6.o v2_20 = v0_98.k;
                                            if (v2_20 == null) {
                                                v12 = 0;
                                                throw new IllegalStateException("Reports without sessions cannot have events added to them.");
                                            } else {
                                                String v0_101 = v0_98.a();
                                                j6.o v2_22 = v2_20.a();
                                                v2_22.k = v12_51;
                                                v0_101.j = v2_22.a();
                                                String v0_103 = v0_101.a();
                                                j6.o v2_24 = v0_103.k;
                                                if (v2_24 != null) {
                                                    int v11_32 = new StringBuilder("appQualitySessionId: ");
                                                    v11_32.append(v6_31);
                                                    java.io.File v6_33 = v11_32.toString();
                                                    if (!android.util.Log.isLoggable("FirebaseCrashlytics", 3)) {
                                                    } else {
                                                        android.util.Log.d("FirebaseCrashlytics", v6_33, 0);
                                                    }
                                                    java.io.File v6_35;
                                                    if (v14_9 == null) {
                                                        v6_35 = new java.io.File(((java.io.File) v5_17.f), ((j5.j0) v2_24).b);
                                                    } else {
                                                        v6_35 = new java.io.File(((java.io.File) v5_17.m), ((j5.j0) v2_24).b);
                                                    }
                                                    m5.a.f(v6_35, k5.a.a.q(v0_103));
                                                    m5.c.d(new java.io.File(((java.io.File) v5_17.e), v10_12));
                                                    v1_27 = 0;
                                                    v16 = 4;
                                                } else {
                                                    v12 = 0;
                                                }
                                            }
                                        } else {
                                            int v11_30 = v11_29.a();
                                            v11_30.e = Long.valueOf(v7_42);
                                            v11_30.f = v14_9;
                                            v11_30.m = ((byte) (v11_30.m | 2));
                                            if (v0_87 != null) {
                                                v11_30.h = new j5.j1(v0_87);
                                            }
                                            v15_7.j = v11_30.a();
                                        }
                                    } else {
                                        String v0_106 = new StringBuilder("Could not parse event files for session ");
                                        v0_106.append(v10_12);
                                        android.util.Log.w("FirebaseCrashlytics", v0_106.toString(), 0);
                                        int v11 = 3;
                                    }
                                } else {
                                    String v0_118 = v1.a.l("Session ", v10_12, " has no events.");
                                    if (android.util.Log.isLoggable("FirebaseCrashlytics", 2)) {
                                        android.util.Log.v("FirebaseCrashlytics", v0_118, 0);
                                    }
                                    v12 = 0;
                                }
                            }
                            v3_3.c.b();
                            String v0_74 = v3_3.b();
                            IllegalStateException v1_29 = v0_74.size();
                            if (v1_29 > 4) {
                                String v0_76 = v0_74.subList(4, v1_29).iterator();
                                while (v0_76.hasNext()) {
                                    ((java.io.File) v0_76.next()).delete();
                                }
                            }
                            return;
                        }
                    } else {
                        j5.a0 v15_9 = new i5.e(v0_32);
                        v17 = 8;
                        v15_9.b = i5.e.c;
                        if (v9_1 != null) {
                            v15_9.b = new i5.l(v0_32.b(v9_1, "userlog"));
                        }
                        String v0_7;
                        byte v7_45 = this.e;
                        g5.t v10_17 = new i5.g(v0_32);
                        int v8_3 = new m5.c(v9_1, v0_32, v7_45);
                        ((i5.d) ((java.util.concurrent.atomic.AtomicMarkableReference) ((i5.n) v8_3.e).b).getReference()).c(v10_17.c(v9_1, 0));
                        ((i5.d) ((java.util.concurrent.atomic.AtomicMarkableReference) ((i5.n) v8_3.f).b).getReference()).c(v10_17.c(v9_1, 1));
                        ((java.util.concurrent.atomic.AtomicMarkableReference) v8_3.n).set(v10_17.d(v9_1), 0);
                        byte v7_14 = ((h.f) v8_3.m);
                        java.io.File v13_1 = v0_32.b(v9_1, "rollouts-state");
                        if ((v13_1.exists()) && (v13_1.length() != 0)) {
                            try {
                                java.util.ArrayList v14_1 = new java.io.FileInputStream(v13_1);
                                try {
                                    v0_7 = i5.g.b(g5.g.i(v14_1));
                                    j6.o v2_2 = new StringBuilder("Loaded rollouts state:\n");
                                    v2_2.append(v0_7);
                                    v2_2.append("\nfor session ");
                                    v2_2.append(v9_1);
                                    j6.o v2_3 = v2_2.toString();
                                } catch (String v0_5) {
                                    android.util.Log.w("FirebaseCrashlytics", "Error deserializing rollouts state.", v0_5);
                                    i5.g.f(v13_1);
                                    g5.g.b(v14_1, "Failed to close rollouts state file.");
                                    v0_7 = java.util.Collections.EMPTY_LIST;
                                }
                                if (android.util.Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    android.util.Log.d("FirebaseCrashlytics", v2_3, 0);
                                }
                                g5.g.b(v14_1, "Failed to close rollouts state file.");
                            } catch (String v0_5) {
                                v14_1 = 0;
                            } catch (String v0_4) {
                                int v8_0 = 0;
                                g5.g.b(v8_0, "Failed to close rollouts state file.");
                                throw v0_4;
                            } catch (String v0_4) {
                                v8_0 = v14_1;
                            }
                        } else {
                            String v0_9 = new StringBuilder("The file has a length of zero for session: ");
                            v0_9.append(v9_1);
                            i5.g.g(v13_1, v0_9.toString());
                            v0_7 = java.util.Collections.EMPTY_LIST;
                        }
                        v7_14.h(v0_7);
                        j6.o v2_7 = ((m5.a) v6_20.b);
                        g5.t v10_2 = v2_7.b.b(v9_1, "start-time").lastModified();
                        String v0_15 = v12_45.iterator();
                        while (v0_15.hasNext()) {
                            byte v7_19 = ((android.app.ApplicationExitInfo) v0_15.next());
                            if (v7_19.getTimestamp() < v10_2) {
                                break;
                            }
                            if (v7_19.getReason() != 6) {
                            }
                            if (v7_19 != 0) {
                                g5.t v10_4 = ((g5.t) v6_20.a);
                                try {
                                    String v0_20;
                                    String v0_17 = v7_19.getTraceInputStream();
                                } catch (String v0_18) {
                                    int v11_7 = new StringBuilder("Could not get input trace in application exit info: ");
                                    v11_7.append(v7_19.toString());
                                    v11_7.append(" Error: ");
                                    v11_7.append(v0_18);
                                    android.util.Log.w("FirebaseCrashlytics", v11_7.toString(), 0);
                                    v0_20 = 0;
                                    int v11_10 = new j5.c0();
                                    v11_10.d = v7_19.getImportance();
                                    v11_10.j = ((byte) (v11_10.j | 4));
                                    int v12_10 = v7_19.getProcessName();
                                    if (v12_10 == 0) {
                                        throw new NullPointerException("Null processName");
                                    } else {
                                        IllegalStateException v1_2;
                                        v11_10.b = v12_10;
                                        v11_10.c = v7_19.getReason();
                                        v11_10.j = ((byte) (v11_10.j | 2));
                                        v11_10.g = v7_19.getTimestamp();
                                        v11_10.j = ((byte) (v11_10.j | 32));
                                        v11_10.a = v7_19.getPid();
                                        v11_10.j = ((byte) (v11_10.j | 1));
                                        v11_10.e = v7_19.getPss();
                                        v11_10.j = ((byte) (v11_10.j | 8));
                                        v11_10.f = v7_19.getRss();
                                        v11_10.j = ((byte) (v11_10.j | 16));
                                        v11_10.h = v0_20;
                                        String v0_26 = v11_10.a();
                                        byte v7_26 = v10_4.a.getResources().getConfiguration().orientation;
                                        int v11_12 = new j5.o0();
                                        v11_12.b = "anr";
                                        int v12_29 = v0_26.g;
                                        v11_12.a = v12_29;
                                        v11_12.g = ((byte) (v11_12.g | 1));
                                        java.util.ArrayList v14_6 = v10_4.c;
                                        int v29 = v7_26;
                                        if ((!v10_4.e.b().b.c) || (v14_6.c.size() <= 0)) {
                                            v31_0 = v5_0;
                                            v30 = v6_20;
                                            v1_2 = 0;
                                        } else {
                                            byte v7_34 = new java.util.ArrayList();
                                            java.util.ArrayList v14_7 = v14_6.c;
                                            v30 = v6_20;
                                            java.io.File v6_0 = v14_7.size();
                                            IllegalStateException v1_3 = 0;
                                            while (v1_3 < v6_0) {
                                                int v34_1 = (v1_3 + 1);
                                                IllegalStateException v1_19 = ((g5.d) v14_7.get(v1_3));
                                                j5.q0 v22_6 = v6_0;
                                                java.io.File v6_19 = v1_19.a;
                                                if (v6_19 == null) {
                                                    throw new NullPointerException("Null libraryName");
                                                } else {
                                                    j5.r0 v23_3 = v14_7;
                                                    java.util.ArrayList v14_8 = v1_19.b;
                                                    if (v14_8 == null) {
                                                        throw new NullPointerException("Null arch");
                                                    } else {
                                                        IllegalStateException v1_22 = v1_19.c;
                                                        if (v1_22 == null) {
                                                            throw new NullPointerException("Null buildId");
                                                        } else {
                                                            j5.z0 v31_1 = v5_0;
                                                            v7_34.add(new j5.e0(v14_8, v6_19, v1_22));
                                                            v1_3 = v34_1;
                                                            v6_0 = v22_6;
                                                            v14_7 = v23_3;
                                                            v5_0 = v31_1;
                                                        }
                                                    }
                                                }
                                            }
                                            v31_0 = v5_0;
                                            v1_2 = java.util.Collections.unmodifiableList(v7_34);
                                        }
                                        boolean v5_2 = new j5.c0();
                                        v5_2.d = v0_26.d;
                                        java.io.File v6_4 = ((byte) (v5_2.j | 4));
                                        v5_2.j = v6_4;
                                        byte v7_35 = v0_26.b;
                                        if (v7_35 == 0) {
                                            throw new NullPointerException("Null processName");
                                        } else {
                                            IllegalStateException v1_6;
                                            v5_2.b = v7_35;
                                            v5_2.c = v0_26.c;
                                            java.io.File v6_6 = ((byte) (v6_4 | 2));
                                            v5_2.g = v12_29;
                                            java.io.File v6_8 = ((byte) (v6_6 | 32));
                                            v5_2.a = v0_26.a;
                                            java.io.File v6_10 = ((byte) (v6_8 | 1));
                                            v5_2.e = v0_26.e;
                                            java.io.File v6_12 = ((byte) (v6_10 | 8));
                                            v5_2.f = v0_26.f;
                                            v5_2.j = ((byte) (v6_12 | 16));
                                            v5_2.h = v0_26.h;
                                            v5_2.i = v1_2;
                                            String v0_31 = v5_2.a();
                                            if (v0_31.d == 100) {
                                                v1_6 = 0;
                                            } else {
                                                v1_6 = 1;
                                            }
                                            IllegalStateException v1_7 = Boolean.valueOf(v1_6);
                                            boolean v5_4 = v0_31.b;
                                            java.io.File v6_15 = v0_31.a;
                                            byte v7_38 = v0_31.d;
                                            kotlin.jvm.internal.j.e(v5_4, "processName");
                                            if ((8 & 4) != 0) {
                                                v7_38 = 0;
                                            }
                                            int v12_36 = new j5.y0();
                                            v12_36.a = v5_4;
                                            v12_36.b = v6_15;
                                            boolean v5_7 = ((byte) (v12_36.e | 1));
                                            v12_36.c = v7_38;
                                            boolean v5_9 = ((byte) (v5_7 | 2));
                                            v12_36.d = 0;
                                            v12_36.e = ((byte) (v5_9 | 4));
                                            boolean v5_12 = v12_36.a();
                                            String v26_0 = g5.t.e();
                                            j5.z0 v27_0 = v10_4.a();
                                            if (v27_0 == null) {
                                                throw new NullPointerException("Null binaries");
                                            } else {
                                                j5.q0 v22_2 = new j5.r0(0, 0, v0_31, v26_0, v27_0);
                                                if (((byte) 1) != 1) {
                                                    String v0_36 = new StringBuilder();
                                                    if (((byte) 1) == 0) {
                                                        v0_36.append(" uiOrientation");
                                                    }
                                                    throw new IllegalStateException(g2.g.g("Missing required properties:", v0_36));
                                                } else {
                                                    String v0_38 = v29;
                                                    v11_12.c = new j5.q0(v22_2, 0, 0, v1_7, v5_12, 0, v29);
                                                    v11_12.d = v10_4.b(v0_38);
                                                    String v0_40 = v11_12.a();
                                                    IllegalStateException v1_15 = g2.g.l("Persisting anr for session ", v9_1);
                                                    if (android.util.Log.isLoggable("FirebaseCrashlytics", 3)) {
                                                        android.util.Log.d("FirebaseCrashlytics", v1_15, 0);
                                                    }
                                                    v2_7.d(a5.z.j(a5.z.i(v0_40, v15_9, v8_3, java.util.Collections.EMPTY_MAP), v8_3), v9_1, 1);
                                                }
                                            }
                                        }
                                    }
                                }
                                if (v0_17 == null) {
                                } else {
                                    v0_20 = a5.z.l(v0_17);
                                }
                            } else {
                                String v0_50 = g2.g.l("No relevant ApplicationExitInfo occurred during session: ", v9_1);
                                if (android.util.Log.isLoggable("FirebaseCrashlytics", 2)) {
                                    android.util.Log.v("FirebaseCrashlytics", v0_50, 0);
                                }
                                v31_0 = v5_0;
                                v30 = v6_20;
                            }
                            v2_8 = 2;
                        }
                        v7_19 = 0;
                    }
                    v11_13 = 0;
                }
            }
        } else {
            if (android.util.Log.isLoggable("FirebaseCrashlytics", 2)) {
                android.util.Log.v("FirebaseCrashlytics", "No open sessions to be closed.", 0);
                return;
            }
        }
        return;
    }

    public final void c(String p34, Boolean p35)
    {
        int v10_3 = (System.currentTimeMillis() / 1000);
        Throwable v0_58 = g2.g.l("Opening a new session with ID ", p34);
        if (android.util.Log.isLoggable("FirebaseCrashlytics", 3)) {
            android.util.Log.d("FirebaseCrashlytics", v0_58, 0);
        }
        java.io.FileOutputStream v7_23;
        Throwable v0_2 = java.util.Locale.US;
        String v2_7 = this.f;
        boolean v3_9 = this.h;
        if (v3_9.d == null) {
            v7_23 = 1;
        } else {
            v7_23 = 4;
        }
        String v14_7 = new j5.l1(v2_7.c, v3_9.f, v3_9.g, v2_7.c().a, g2.g.a(v7_23), v3_9.h);
        String v15_1 = android.os.Build$VERSION.RELEASE;
        String v2_12 = android.os.Build$VERSION.CODENAME;
        long v5_16 = new j5.n1(g5.g.g());
        boolean v3_19 = this.a;
        int v6_13 = new android.os.StatFs(android.os.Environment.getDataDirectory().getPath());
        String v27_1 = (((long) v6_13.getBlockCount()) * ((long) v6_13.getBlockSize()));
        int v6_16 = g5.f.a;
        java.nio.charset.Charset v8_3 = android.os.Build.CPU_ABI;
        if (!android.text.TextUtils.isEmpty(v8_3)) {
            java.io.FileOutputStream v7_34 = ((g5.f) g5.f.b.get(v8_3.toLowerCase(v0_2)));
            if (v7_34 != null) {
                v6_16 = v7_34;
            }
        } else {
            if (android.util.Log.isLoggable("FirebaseCrashlytics", 2)) {
                android.util.Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", 0);
            }
        }
        a5.z v13_2;
        j5.a0 v31;
        int v17_0;
        j5.i0 v9_0;
        g5.a v32;
        j5.i0 v9_9 = android.os.Build.MODEL;
        boolean v3_20 = android.os.Build.MANUFACTURER;
        int v6_18 = android.os.Build.PRODUCT;
        this.j.d(p34, v10_3, new j5.k1(v14_7, v5_16, new j5.m1(v6_16.ordinal(), Runtime.getRuntime().availableProcessors(), g5.g.a(v3_19), v27_1, g5.g.f(), g5.g.c())));
        if ((!p35.booleanValue()) || (p34 == null)) {
            v13_2 = v2_12;
            v31 = v3_20;
            v32 = v6_18;
            v17_0 = v9_9;
            v9_0 = 4;
        } else {
            long v5_1 = v3_20;
            boolean v3_0 = this.d;
            try {
                v3_0.b = p34;
            } catch (Throwable v0_1) {
                throw v0_1;
            }
            v31 = v5_1;
            v17_0 = v9_9;
            v13_2 = v2_12;
            v32 = v6_18;
            v9_0 = 4;
            ((h5.f) v3_0.d).b.a(new i2.e(v3_0, p34, java.util.Collections.unmodifiableMap(new java.util.HashMap(((i5.d) ((java.util.concurrent.atomic.AtomicMarkableReference) ((i5.n) v3_0.e).b).getReference()).a)), ((h.f) v3_0.m).d(), 2));
        }
        String v2_4 = this.i;
        ((i5.c) v2_4.b).a();
        v2_4.b = i5.e.c;
        if (p34 != null) {
            v2_4.b = new i5.l(((m5.c) v2_4.a).b(p34, "userlog"));
        }
        this.l.a(p34);
        String v2_6 = this.m;
        boolean v3_8 = ((g5.t) v2_6.a);
        long v5_7 = new j5.a0();
        v5_7.a = "20.0.3";
        int v6_2 = v3_8.c;
        java.io.FileOutputStream v7_12 = v6_2.a;
        if (v7_12 == null) {
            throw new NullPointerException("Null gmpAppId");
        } else {
            v5_7.b = v7_12;
            java.io.FileOutputStream v7_13 = v3_8.b;
            int v12_4 = v7_13.c().a;
            if (v12_4 == 0) {
                throw new NullPointerException("Null installationUuid");
            } else {
                v5_7.d = v12_4;
                v5_7.e = v7_13.c().b;
                v5_7.f = v7_13.c().c;
                int v12_9 = v6_2.f;
                if (v12_9 == 0) {
                    throw new NullPointerException("Null buildVersion");
                } else {
                    v5_7.h = v12_9;
                    String v14_4 = v6_2.g;
                    if (v14_4 == null) {
                        throw new NullPointerException("Null displayVersion");
                    } else {
                        v5_7.i = v14_4;
                        v5_7.c = v9_0;
                        v5_7.m = ((byte) (v5_7.m | 1));
                        j5.i0 v9_5 = new j5.i0();
                        v9_5.f = 0;
                        Throwable v1_8 = ((byte) (v9_5.m | 2));
                        v9_5.d = v10_3;
                        v9_5.m = ((byte) (v1_8 | 1));
                        if (p34 == null) {
                            throw new NullPointerException("Null identifier");
                        } else {
                            v9_5.b = p34;
                            Throwable v1_12 = g5.t.g;
                            if (v1_12 == null) {
                                throw new NullPointerException("Null generator");
                            } else {
                                v9_5.a = v1_12;
                                Throwable v1_14 = v7_13.c;
                                if (v1_14 == null) {
                                    throw new NullPointerException("Null identifier");
                                } else {
                                    int v4_2 = v7_13.c().a;
                                    int v6_4 = v6_2.h;
                                    if (((k2.c) v6_4.c) == null) {
                                        v6_4.c = new k2.c(v6_4);
                                    }
                                    java.io.FileOutputStream v7_20 = ((k2.c) v6_4.c);
                                    String v28_1 = ((String) v7_20.b);
                                    if (v7_20 == null) {
                                        v6_4.c = new k2.c(v6_4);
                                    }
                                    v9_5.g = new j5.k0(v1_14, v12_9, v14_4, v4_2, v28_1, ((String) ((k2.c) v6_4.c).c));
                                    Throwable v1_18 = new j5.h1();
                                    v1_18.a = 3;
                                    v1_18.e = ((byte) (v1_18.e | 1));
                                    if (v15_1 == null) {
                                        throw new NullPointerException("Null version");
                                    } else {
                                        v1_18.b = v15_1;
                                        if (v13_2 == null) {
                                            throw new NullPointerException("Null buildVersion");
                                        } else {
                                            v1_18.c = v13_2;
                                            v1_18.d = g5.g.g();
                                            v1_18.e = ((byte) (v1_18.e | 2));
                                            v9_5.i = v1_18.a();
                                            Throwable v1_23 = new android.os.StatFs(android.os.Environment.getDataDirectory().getPath());
                                            int v6_8 = 7;
                                            if (!android.text.TextUtils.isEmpty(v8_3)) {
                                                Throwable v0_23 = ((Integer) g5.t.f.get(v8_3.toLowerCase(v0_2)));
                                                if (v0_23 != null) {
                                                    v6_8 = v0_23.intValue();
                                                }
                                            }
                                            Throwable v0_25 = Runtime.getRuntime().availableProcessors();
                                            boolean v3_12 = g5.g.a(v3_8.a);
                                            java.io.FileOutputStream v7_26 = (((long) v1_23.getBlockCount()) * ((long) v1_23.getBlockSize()));
                                            Throwable v1_25 = g5.g.f();
                                            int v10_2 = g5.g.c();
                                            j5.m0 v11_1 = new j5.m0();
                                            v11_1.a = v6_8;
                                            int v6_11 = ((byte) (v11_1.j | 1));
                                            v11_1.j = v6_11;
                                            if (v17_0 == 0) {
                                                throw new NullPointerException("Null model");
                                            } else {
                                                v11_1.b = v17_0;
                                                v11_1.c = v0_25;
                                                Throwable v0_29 = ((byte) (v6_11 | 2));
                                                v11_1.d = v3_12;
                                                Throwable v0_31 = ((byte) (v0_29 | 4));
                                                v11_1.e = v7_26;
                                                Throwable v0_33 = ((byte) (v0_31 | 8));
                                                v11_1.f = v1_25;
                                                Throwable v0_35 = ((byte) (v0_33 | 16));
                                                v11_1.g = v10_2;
                                                v11_1.j = ((byte) (v0_35 | 32));
                                                Throwable v0_38 = v31;
                                                if (v0_38 == null) {
                                                    throw new NullPointerException("Null manufacturer");
                                                } else {
                                                    v11_1.h = v0_38;
                                                    Throwable v0_41 = v32;
                                                    if (v0_41 == null) {
                                                        throw new NullPointerException("Null modelClass");
                                                    } else {
                                                        v11_1.i = v0_41;
                                                        v9_5.j = v11_1.a();
                                                        v9_5.l = 3;
                                                        v9_5.m = ((byte) (v9_5.m | 4));
                                                        v5_7.j = v9_5.a();
                                                        Throwable v0_49 = v5_7.a();
                                                        Throwable v1_31 = ((m5.a) v2_6.b).b;
                                                        boolean v3_13 = v0_49.k;
                                                        if (v3_13) {
                                                            int v4_18 = ((j5.j0) v3_13).b;
                                                            try {
                                                                m5.a.g.getClass();
                                                                m5.a.f(v1_31.b(v4_18, "report"), k5.a.a.q(v0_49));
                                                                Throwable v0_52 = v1_31.b(v4_18, "start-time");
                                                                long v5_13 = ((j5.j0) v3_13).d;
                                                                boolean v3_16 = new java.io.OutputStreamWriter(new java.io.FileOutputStream(v0_52), m5.a.e);
                                                            } catch (Throwable v0_55) {
                                                                Throwable v1_35 = g2.g.l("Could not persist report for session ", v4_18);
                                                                if (android.util.Log.isLoggable("FirebaseCrashlytics", 3)) {
                                                                    android.util.Log.d("FirebaseCrashlytics", v1_35, v0_55);
                                                                }
                                                            }
                                                            try {
                                                                v3_16.write("");
                                                                v0_52.setLastModified((v5_13 * 1000));
                                                            } catch (Throwable v0_53) {
                                                                Throwable v1_33 = v0_53;
                                                                try {
                                                                    v3_16.close();
                                                                } catch (Throwable v0_54) {
                                                                    v1_33.addSuppressed(v0_54);
                                                                }
                                                                throw v1_33;
                                                            }
                                                            v3_16.close();
                                                            return;
                                                        } else {
                                                            if (android.util.Log.isLoggable("FirebaseCrashlytics", 3)) {
                                                                android.util.Log.d("FirebaseCrashlytics", "Could not get session for report", 0);
                                                                return;
                                                            }
                                                        }
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final boolean d(o5.d p6)
    {
        h5.f.a();
        String v0_0 = this.n;
        if ((v0_0 == null) || (!v0_0.e.get())) {
            if (android.util.Log.isLoggable("FirebaseCrashlytics", 2)) {
                android.util.Log.v("FirebaseCrashlytics", "Finalizing previously open sessions.", 0);
            }
            try {
                this.b(1, p6, 1);
            } catch (String v6_2) {
                android.util.Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", v6_2);
                return 0;
            }
            if (android.util.Log.isLoggable("FirebaseCrashlytics", 2)) {
                android.util.Log.v("FirebaseCrashlytics", "Closed all previously open sessions.", 0);
            }
            return 1;
        } else {
            android.util.Log.w("FirebaseCrashlytics", "Skipping session finalization because a crash has already occurred.", 0);
            return 0;
        }
    }

    public final String e()
    {
        Throwable v0_1;
        byte[] v2_1 = this.a;
        Throwable v0_7 = g5.g.d(v2_1, "com.google.firebase.crashlytics.version_control_info", "string");
        if (v0_7 != null) {
            v0_1 = v2_1.getResources().getString(v0_7);
        } else {
            v0_1 = 0;
        }
        if (v0_1 == null) {
            Throwable v0_4;
            Throwable v0_3 = g5.n.getClassLoader();
            if (v0_3 != null) {
                v0_4 = v0_3.getResourceAsStream("META-INF/version-control-info.textproto");
            } else {
                android.util.Log.w("FirebaseCrashlytics", "Couldn\'t get Class Loader", 0);
                v0_4 = 0;
            }
            if (v0_4 == null) {
                if (v0_4 != null) {
                    v0_4.close();
                }
                android.util.Log.i("FirebaseCrashlytics", "No version control information found", 0);
                return 0;
            } else {
                try {
                    if (android.util.Log.isLoggable("FirebaseCrashlytics", 3)) {
                        android.util.Log.d("FirebaseCrashlytics", "Read version control info from file", 0);
                    }
                } catch (String v1_6) {
                    try {
                        v0_4.close();
                    } catch (Throwable v0_8) {
                        v1_6.addSuppressed(v0_8);
                    }
                    throw v1_6;
                }
                String v1_2 = new java.io.ByteArrayOutputStream();
                byte[] v2_4 = new byte[1024];
                while(true) {
                    int v4_1 = v0_4.read(v2_4);
                    if (v4_1 == -1) {
                        break;
                    }
                    v1_2.write(v2_4, 0, v4_1);
                }
                byte[] v2_5 = v1_2.toByteArray();
                v1_2.close();
                String v1_3 = android.util.Base64.encodeToString(v2_5, 0);
                v0_4.close();
                return v1_3;
            }
        } else {
            if (android.util.Log.isLoggable("FirebaseCrashlytics", 3)) {
                android.util.Log.d("FirebaseCrashlytics", "Read version control info from string resource", 0);
            }
            return android.util.Base64.encodeToString(v0_1.getBytes(g5.n.s), 0);
        }
    }

    public final void f()
    {
        try {
            String v1_2 = this.e();
        } catch (String v1_1) {
            android.util.Log.w("FirebaseCrashlytics", "Unable to save version control info", v1_1);
            return;
        }
        if (v1_2 == null) {
            return;
        } else {
            try {
                this.d.f(v1_2);
            } catch (String v1_4) {
                int v3_4 = this.a;
                if (v3_4 != 0) {
                    if ((v3_4.getApplicationInfo().flags & 2) != 0) {
                        throw v1_4;
                    } else {
                    }
                }
                android.util.Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", 0);
            }
            android.util.Log.i("FirebaseCrashlytics", "Saved version control info", 0);
            return;
        }
    }

    public final void g(com.google.android.gms.tasks.Task p7)
    {
        com.google.android.gms.tasks.Task v0_0 = this.o;
        k2.c v2_11 = ((m5.a) this.m.b).b;
        if ((m5.c.e(((java.io.File) v2_11.f).listFiles()).isEmpty()) && ((m5.c.e(((java.io.File) v2_11.m).listFiles()).isEmpty()) && (m5.c.e(((java.io.File) v2_11.n).listFiles()).isEmpty()))) {
            if (android.util.Log.isLoggable("FirebaseCrashlytics", 2)) {
                android.util.Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", 0);
            }
            v0_0.trySetResult(Boolean.FALSE);
            return;
        } else {
            com.google.android.gms.tasks.Task v0_4;
            k2.c v2_10 = d5.d.a;
            v2_10.c("Crash reports are available to be sent.");
            int v3_8 = this.b;
            if (!v3_8.a()) {
                v2_10.b("Automatic data collection is disabled.");
                v2_10.c("Notifying that unsent reports are available.");
                v0_0.trySetResult(Boolean.TRUE);
                com.google.android.gms.tasks.Task v0_3 = v3_8.c.getTask().onSuccessTask(new a6.e());
                v2_10.b("Waiting for send/deleteUnsentReports to be called.");
                v0_4 = h5.b.a(v0_3, this.p.getTask());
            } else {
                if (android.util.Log.isLoggable("FirebaseCrashlytics", 3)) {
                    android.util.Log.d("FirebaseCrashlytics", "Automatic data collection is enabled. Allowing upload.", 0);
                }
                v0_0.trySetResult(Boolean.FALSE);
                v0_4 = com.google.android.gms.tasks.Tasks.forResult(Boolean.TRUE);
            }
            v0_4.onSuccessTask(this.e.a, new k2.c(this, p7, 15, 0));
            return;
        }
    }
}
