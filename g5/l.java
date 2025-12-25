package g5;
public final class l implements java.util.concurrent.Callable {
    public final synthetic long a;
    public final synthetic Throwable b;
    public final synthetic Thread c;
    public final synthetic o5.d d;
    public final synthetic g5.n e;

    public l(g5.n p1, long p2, Throwable p4, Thread p5, o5.d p6)
    {
        this.e = p1;
        this.a = p2;
        this.b = p4;
        this.c = p5;
        this.d = p6;
        return;
    }

    public final Object call()
    {
        java.util.List v7_3;
        Boolean v4_2 = this.a;
        l6.c v2_17 = (v4_2 / 1000);
        int v6_7 = this.e;
        com.google.android.gms.tasks.Task v0_42 = ((m5.a) v6_7.m.b).c();
        if (v0_42.isEmpty()) {
            v7_3 = 0;
        } else {
            v7_3 = ((String) v0_42.first());
        }
        if (v7_3 != null) {
            v6_7.c.k();
            com.google.android.gms.tasks.Task v0_22 = v6_7.m;
            v0_22.getClass();
            g5.t v10_1 = "Persisting fatal event for session ".concat(v7_3);
            if (android.util.Log.isLoggable("FirebaseCrashlytics", 2)) {
                android.util.Log.v("FirebaseCrashlytics", v10_1, 0);
            }
            g5.t v10_3 = ((g5.t) v0_22.a);
            String v11_6 = v10_3.a;
            int v12_8 = v11_6.getResources().getConfiguration().orientation;
            j5.q0 v13_2 = v10_3.d;
            j5.r0 v14_2 = new java.util.Stack();
            int v15_4 = this.b;
            while (v15_4 != 0) {
                v14_2.push(v15_4);
                v15_4 = v15_4.getCause();
            }
            int v20_0 = 0;
            while (!v14_2.isEmpty()) {
                int v15_2 = ((Throwable) v14_2.pop());
                v20_0 = new j6.s(v15_2.getLocalizedMessage(), v15_2.getClass().getName(), v13_2.f(v15_2.getStackTrace()), v20_0, 10);
            }
            Boolean v17_1;
            int v15_6 = v20_0;
            j5.r0 v14_4 = new j5.o0();
            v14_4.b = "crash";
            v14_4.a = v2_17;
            v14_4.g = ((byte) (v14_4.g | 1));
            j5.c2 v18_2 = d5.e.a.b(v11_6);
            l6.c v2_24 = ((j5.z0) v18_2).c;
            if (v2_24 <= null) {
                v17_1 = 0;
            } else {
                l6.c v2_25;
                if (v2_24 == 100) {
                    v2_25 = 0;
                } else {
                    v2_25 = 1;
                }
                v17_1 = Boolean.valueOf(v2_25);
            }
            java.util.ArrayList v19_1 = d5.e.a(v11_6);
            int v8_5 = new java.util.ArrayList();
            String v11_8 = ((StackTraceElement[]) v15_6.d);
            g5.l v3_10 = this.c;
            int v20_1 = v12_8;
            int v12_9 = v3_10.getName();
            int v16_3 = v14_4;
            if (v12_9 == 0) {
                throw new NullPointerException("Null name");
            } else {
                String v11_0 = g5.t.d(v11_8, 4);
                if (v11_0 == null) {
                    throw new NullPointerException("Null frames");
                } else {
                    long v24 = v4_2;
                    g5.n v26 = v6_7;
                    if (((byte) 1) != 1) {
                        com.google.android.gms.tasks.Task v0_3 = new StringBuilder();
                        if (((byte) 1) == 0) {
                            v0_3.append(" importance");
                        }
                        throw new IllegalStateException(g2.g.g("Missing required properties:", v0_3));
                    } else {
                        int v27 = v7_3;
                        v8_5.add(new j5.v0(v12_9, 4, v11_0));
                        int v6_5 = Thread.getAllStackTraces().entrySet().iterator();
                        while (v6_5.hasNext()) {
                            java.io.File v23;
                            java.util.List v7_5 = ((java.util.Map$Entry) v6_5.next());
                            String v11_2 = ((Thread) v7_5.getKey());
                            if (v11_2.equals(v3_10)) {
                                v23 = v3_10;
                            } else {
                                java.util.List v7_8 = v13_2.f(((StackTraceElement[]) v7_5.getValue()));
                                String v11_3 = v11_2.getName();
                                if (v11_3 == null) {
                                    throw new NullPointerException("Null name");
                                } else {
                                    java.util.List v7_9 = g5.t.d(v7_8, 0);
                                    if (v7_9 == null) {
                                        throw new NullPointerException("Null frames");
                                    } else {
                                        if (((byte) 1) != 1) {
                                            com.google.android.gms.tasks.Task v0_35 = new StringBuilder();
                                            if (((byte) 1) == 0) {
                                                v0_35.append(" importance");
                                            }
                                            throw new IllegalStateException(g2.g.g("Missing required properties:", v0_35));
                                        } else {
                                            v23 = v3_10;
                                            v8_5.add(new j5.v0(v11_3, 0, v7_9));
                                        }
                                    }
                                }
                            }
                            v3_10 = v23;
                        }
                        java.util.List v29 = java.util.Collections.unmodifiableList(v8_5);
                        j5.t0 v30 = g5.t.c(v15_6, 0);
                        j5.u0 v32 = g5.t.e();
                        java.util.List v33 = v10_3.a();
                        if (v33 == null) {
                            throw new NullPointerException("Null binaries");
                        } else {
                            j5.r0 v28_1 = new j5.r0(v29, v30, 0, v32, v33);
                            if (((byte) 1) != 1) {
                                com.google.android.gms.tasks.Task v0_8 = new StringBuilder();
                                if (((byte) 1) == 0) {
                                    v0_8.append(" uiOrientation");
                                }
                                throw new IllegalStateException(g2.g.g("Missing required properties:", v0_8));
                            } else {
                                h5.c v1_9 = v16_3;
                                l6.c v2_1 = v20_1;
                                v1_9.c = new j5.q0(v28_1, 0, 0, v17_1, v18_2, v19_1, v20_1);
                                v1_9.d = v10_3.b(v2_1);
                                g5.l v3_2 = ((m5.c) v0_22.e);
                                int v8_1 = v27;
                                ((m5.a) v0_22.b).d(a5.z.j(a5.z.i(v1_9.a(), ((i5.e) v0_22.d), v3_2, i7.o.a), v3_2), v8_1, 1);
                                h5.c v1_13 = v26;
                                try {
                                    l6.c v2_5 = v1_13.g;
                                    g5.l v3_4 = new StringBuilder(".ae");
                                    v3_4.append(v24);
                                    com.google.android.gms.tasks.Task v0_15 = v3_4.toString();
                                    v2_5.getClass();
                                } catch (com.google.android.gms.tasks.Task v0_20) {
                                    android.util.Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", v0_20);
                                    com.google.android.gms.tasks.Task v0_21 = this.d;
                                    v1_13.b(0, v0_21, 0);
                                    v1_13.c(new g5.e().a, Boolean.FALSE);
                                    if (v1_13.b.a()) {
                                        return ((com.google.android.gms.tasks.TaskCompletionSource) ((java.util.concurrent.atomic.AtomicReference) v0_21.i).get()).getTask().onSuccessTask(v1_13.e.a, new l6.c(this, v8_1));
                                    } else {
                                        return com.google.android.gms.tasks.Tasks.forResult(0);
                                    }
                                }
                                if (!new java.io.File(((java.io.File) v2_5.d), v0_15).createNewFile()) {
                                    throw new java.io.IOException("Create new file failed.");
                                } else {
                                }
                            }
                        }
                    }
                }
            }
        } else {
            android.util.Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", 0);
            return com.google.android.gms.tasks.Tasks.forResult(0);
        }
    }
}
