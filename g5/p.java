package g5;
public final synthetic class p implements java.util.concurrent.Callable {
    public final synthetic int a;
    public final synthetic Object b;

    public synthetic p(Object p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final Object call()
    {
        switch (this.a) {
            case 0:
                Boolean v0_19 = ((g5.s) this.b).g;
                v0_19.getClass();
                h5.f.a();
                java.io.File v2_6 = v0_19.c;
                String v3_5 = ((m5.c) v2_6.c);
                org.json.JSONObject v4_5 = ((String) v2_6.b);
                v3_5.getClass();
                String v5_5 = 0;
                int v6_1 = 1;
                if (new java.io.File(((java.io.File) v3_5.d), v4_5).exists()) {
                    if (android.util.Log.isLoggable("FirebaseCrashlytics", 2)) {
                        android.util.Log.v("FirebaseCrashlytics", "Found previous crash marker.", 0);
                    }
                    Boolean v0_22 = ((m5.c) v2_6.c);
                    v0_22.getClass();
                    new java.io.File(((java.io.File) v0_22.d), v4_5).delete();
                } else {
                    Throwable v1_12 = ((m5.a) v0_19.m.b).c();
                    if (!v1_12.isEmpty()) {
                        v5_5 = ((String) v1_12.first());
                    }
                    if ((v5_5 == null) || (!v0_19.j.c(v5_5))) {
                        v6_1 = 0;
                    }
                }
                return Boolean.valueOf(v6_1);
            case 1:
                return ((m6.j) this.b).a();
            case 2:
                Boolean v0_13 = ((n6.o) this.b);
                Throwable v1_4 = 0;
                try {
                    java.io.File v2_1 = v0_13.a.openFileInput(v0_13.b);
                    try {
                        String v3_1 = v2_1.available();
                        org.json.JSONObject v4_1 = new byte[v3_1];
                        v2_1.read(v4_1, 0, v3_1);
                        v1_4 = n6.f.a(new org.json.JSONObject(new String(v4_1, "UTF-8")));
                    } catch (Throwable v1_2) {
                        if (v2_1 != null) {
                            v2_1.close();
                        }
                        throw v1_2;
                    }
                    v2_1.close();
                    return v1_4;
                } catch (java.io.FileNotFoundException) {
                    v2_1 = 0;
                    if (v2_1 == null) {
                        return v1_4;
                    } else {
                        v2_1.close();
                        return v1_4;
                    }
                } catch (java.io.File v2_9) {
                    v2_1 = 0;
                    v1_2 = v2_9;
                } catch (Throwable v1_5) {
                    throw v1_5;
                }
            default:
                Boolean v0_1 = ((o5.d) ((n0.a) this.b).c);
                Throwable v1_1 = ((d4.l) v0_1.f);
                Boolean v0_3 = ((o5.f) v0_1.b);
                java.io.File v2_0 = v1_1.b;
                h5.f.b();
                int v6_0 = 0;
                try {
                    java.util.HashMap v7 = d4.l.b(v0_3);
                    b8.g v8_1 = new b8.g(v2_0, v7);
                    v8_1.n("User-Agent", "Crashlytics Android SDK/20.0.3");
                    v8_1.n("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
                    d4.l.a(v8_1, v0_3);
                    Boolean v0_5 = new StringBuilder("Requesting settings from ");
                    v0_5.append(v2_0);
                    Boolean v0_6 = v0_5.toString();
                } catch (Boolean v0_10) {
                    android.util.Log.e("FirebaseCrashlytics", "Settings request failed.", v0_10);
                    return v6_0;
                }
                if (android.util.Log.isLoggable("FirebaseCrashlytics", 3)) {
                    android.util.Log.d("FirebaseCrashlytics", v0_6, 0);
                }
                Boolean v0_8 = new StringBuilder("Settings query params were: ");
                v0_8.append(v7);
                Boolean v0_9 = v0_8.toString();
                if (android.util.Log.isLoggable("FirebaseCrashlytics", 2)) {
                    android.util.Log.v("FirebaseCrashlytics", v0_9, 0);
                }
                v6_0 = v1_1.c(v8_1.f());
                return v6_0;
        }
    }
}
