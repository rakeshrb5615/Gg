package i5;
public final class g {
    public static final java.nio.charset.Charset b;
    public final m5.c a;

    static g()
    {
        i5.g.b = java.nio.charset.Charset.forName("UTF-8");
        return;
    }

    public g(m5.c p1)
    {
        this.a = p1;
        return;
    }

    public static java.util.HashMap a(String p5)
    {
        org.json.JSONObject v0_1 = new org.json.JSONObject(p5);
        java.util.HashMap v5_2 = new java.util.HashMap();
        java.util.Iterator v1 = v0_1.keys();
        while (v1.hasNext()) {
            String v2_1 = ((String) v1.next());
            String v4 = 0;
            if (!v0_1.isNull(v2_1)) {
                v4 = v0_1.optString(v2_1, 0);
            }
            v5_2.put(v2_1, v4);
        }
        return v5_2;
    }

    public static java.util.ArrayList b(String p13)
    {
        org.json.JSONArray v13_2 = new org.json.JSONObject(p13).getJSONArray("rolloutsState");
        java.util.ArrayList v1_1 = new java.util.ArrayList();
        int v3 = 0;
        while (v3 < v13_2.length()) {
            String v4_0 = v13_2.getString(v3);
            try {
                Exception v0_4 = new org.json.JSONObject(v4_0);
                String v7 = v0_4.getString("rolloutId");
                String v8 = v0_4.getString("parameterKey");
                String v5_3 = v0_4.getString("parameterValue");
                String v10 = v0_4.getString("variantId");
                long v11 = v0_4.getLong("templateVersion");
            } catch (Exception v0_6) {
                String v5_5 = new StringBuilder("Failed de-serializing rollouts state. ");
                v5_5.append(v4_0);
                android.util.Log.w("FirebaseCrashlytics", v5_5.toString(), v0_6);
                v3++;
            }
            if (v5_3.length() > 256) {
                v5_3 = v5_3.substring(0, 256);
            }
            v1_1.add(new i5.b(v7, v8, v5_3, v10, v11));
        }
        return v1_1;
    }

    public static String e(java.util.List p6)
    {
        java.util.HashMap v0_1 = new java.util.HashMap();
        org.json.JSONArray v1_1 = new org.json.JSONArray();
        int v2 = 0;
        while (v2 < p6.size()) {
            try {
                v1_1.put(new org.json.JSONObject(i5.m.a.q(p6.get(v2))));
            } catch (org.json.JSONException v3_2) {
                android.util.Log.w("FirebaseCrashlytics", "Exception parsing rollout assignment!", v3_2);
            }
            v2++;
        }
        v0_1.put("rolloutsState", v1_1);
        return new org.json.JSONObject(v0_1).toString();
    }

    public static void f(java.io.File p2)
    {
        if ((p2.exists()) && (p2.delete())) {
            int v0_4 = new StringBuilder("Deleted corrupt file: ");
            v0_4.append(p2.getAbsolutePath());
            android.util.Log.i("FirebaseCrashlytics", v0_4.toString(), 0);
        }
        return;
    }

    public static void g(java.io.File p2, String p3)
    {
        if ((p2.exists()) && (p2.delete())) {
            android.util.Log.i("FirebaseCrashlytics", g2.g.f("Deleted corrupt file: ", p2.getAbsolutePath(), "\nReason: ", p3), 0);
        }
        return;
    }

    public final java.util.Map c(String p7, boolean p8)
    {
        Throwable v8_3;
        Exception v1_0 = this.a;
        if (p8 == null) {
            v8_3 = v1_0.b(p7, "keys");
        } else {
            v8_3 = v1_0.b(p7, "internal-keys");
        }
        if ((v8_3.exists()) && (v8_3.length() != 0)) {
            try {
                Exception v1_5 = new java.io.FileInputStream(v8_3);
                try {
                    Throwable v7_5 = i5.g.a(g5.g.i(v1_5));
                    g5.g.b(v1_5, "Failed to close user metadata file.");
                    return v7_5;
                } catch (Throwable v7_3) {
                    android.util.Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", v7_3);
                    i5.g.f(v8_3);
                    g5.g.b(v1_5, "Failed to close user metadata file.");
                    return java.util.Collections.EMPTY_MAP;
                }
            } catch (Exception v1_6) {
                v1_5 = 0;
                v7_3 = v1_6;
                android.util.Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", v7_3);
                i5.g.f(v8_3);
                g5.g.b(v1_5, "Failed to close user metadata file.");
                return java.util.Collections.EMPTY_MAP;
            } catch (Throwable v8_1) {
                v1_5 = 0;
                Throwable v7_2 = v8_1;
                g5.g.b(v1_5, "Failed to close user metadata file.");
                throw v7_2;
            } catch (Throwable v7_2) {
            }
            v7_5 = i5.g.a(g5.g.i(v1_5));
            g5.g.b(v1_5, "Failed to close user metadata file.");
            return v7_5;
        } else {
            StringBuilder v0_2 = new StringBuilder("The file has a length of zero for session: ");
            v0_2.append(p7);
            i5.g.g(v8_3, v0_2.toString());
            return java.util.Collections.EMPTY_MAP;
        }
    }

    public final String d(String p12)
    {
        java.io.File v2_1 = this.a.b(p12, "user-data");
        int v6 = 0;
        if ((v2_1.exists()) && (v2_1.length() != 0)) {
            try {
                int v3_2 = new java.io.FileInputStream(v2_1);
                try {
                    int v7_3;
                    StringBuilder v8_1 = new org.json.JSONObject(g5.g.i(v3_2));
                } catch (String v12_2) {
                    android.util.Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", v12_2);
                    i5.g.f(v2_1);
                    g5.g.b(v3_2, "Failed to close user metadata file.");
                    return 0;
                }
                if (v8_1.isNull("userId")) {
                    v7_3 = 0;
                } else {
                    v7_3 = v8_1.optString("userId", 0);
                }
                StringBuilder v8_3 = new StringBuilder("Loaded userId ");
                v8_3.append(v7_3);
                v8_3.append(" for session ");
                v8_3.append(p12);
                String v12_3 = v8_3.toString();
                if (android.util.Log.isLoggable("FirebaseCrashlytics", 3)) {
                    android.util.Log.d("FirebaseCrashlytics", v12_3, 0);
                }
                g5.g.b(v3_2, "Failed to close user metadata file.");
                return v7_3;
            } catch (String v12_2) {
                v3_2 = 0;
                android.util.Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", v12_2);
                i5.g.f(v2_1);
                g5.g.b(v3_2, "Failed to close user metadata file.");
                return 0;
            } catch (String v12_1) {
                g5.g.b(v6, "Failed to close user metadata file.");
                throw v12_1;
            } catch (String v12_1) {
                v6 = v3_2;
            }
        } else {
            String v12_4 = g2.g.l("No userId set for session ", p12);
            if (android.util.Log.isLoggable("FirebaseCrashlytics", 3)) {
                android.util.Log.d("FirebaseCrashlytics", v12_4, 0);
            }
            i5.g.f(v2_1);
            return 0;
        }
    }

    public final void h(String p6, java.util.Map p7, boolean p8)
    {
        Throwable v6_2;
        String v1_0 = this.a;
        if (p8 == null) {
            v6_2 = v1_0.b(p6, "keys");
        } else {
            v6_2 = v1_0.b(p6, "internal-keys");
        }
        String v8_1 = 0;
        try {
            Exception v7_1 = new org.json.JSONObject(p7).toString();
            String v1_4 = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(v6_2), i5.g.b));
            try {
                v1_4.write(v7_1);
                v1_4.flush();
                g5.g.b(v1_4, "Failed to close key/value metadata file.");
                return;
            } catch (Exception v7_2) {
                v8_1 = v1_4;
                android.util.Log.w("FirebaseCrashlytics", "Error serializing key/value metadata.", v7_2);
                i5.g.f(v6_2);
                g5.g.b(v8_1, "Failed to close key/value metadata file.");
                return;
            } catch (Throwable v6_1) {
                v8_1 = v1_4;
                g5.g.b(v8_1, "Failed to close key/value metadata file.");
                throw v6_1;
            }
        } catch (Exception v7_2) {
            android.util.Log.w("FirebaseCrashlytics", "Error serializing key/value metadata.", v7_2);
            i5.g.f(v6_2);
            g5.g.b(v8_1, "Failed to close key/value metadata file.");
            return;
        } catch (Throwable v6_1) {
        }
        v1_4.write(v7_1);
        v1_4.flush();
        g5.g.b(v1_4, "Failed to close key/value metadata file.");
        return;
    }

    public final void i(String p7, java.util.List p8)
    {
        java.io.File v1_1 = this.a.b(p7, "rollouts-state");
        if (!p8.isEmpty()) {
            try {
                String v8_1 = i5.g.e(p8);
                Exception v2_1 = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(v1_1), i5.g.b));
                try {
                    v2_1.write(v8_1);
                    v2_1.flush();
                    g5.g.b(v2_1, "Failed to close rollouts state file.");
                    return;
                } catch (Throwable v7_2) {
                    android.util.Log.w("FirebaseCrashlytics", "Error serializing rollouts state.", v7_2);
                    i5.g.f(v1_1);
                    g5.g.b(v2_1, "Failed to close rollouts state file.");
                    return;
                }
            } catch (String v8_3) {
                v2_1 = 0;
                v7_2 = v8_3;
                android.util.Log.w("FirebaseCrashlytics", "Error serializing rollouts state.", v7_2);
                i5.g.f(v1_1);
                g5.g.b(v2_1, "Failed to close rollouts state file.");
                return;
            } catch (String v8_2) {
                v2_1 = 0;
                Throwable v7_1 = v8_2;
                g5.g.b(v2_1, "Failed to close rollouts state file.");
                throw v7_1;
            } catch (Throwable v7_1) {
            }
            v2_1.write(v8_1);
            v2_1.flush();
            g5.g.b(v2_1, "Failed to close rollouts state file.");
            return;
        } else {
            String v8_6 = new StringBuilder("Rollout state is empty for session: ");
            v8_6.append(p7);
            i5.g.g(v1_1, v8_6.toString());
            return;
        }
    }
}
