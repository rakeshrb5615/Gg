package n6;
public final synthetic class a implements com.google.android.gms.tasks.Continuation {
    public final synthetic n6.c a;
    public final synthetic com.google.android.gms.tasks.Task b;
    public final synthetic com.google.android.gms.tasks.Task c;
    public final synthetic long d;
    public final synthetic int e;

    public synthetic a(n6.c p1, com.google.android.gms.tasks.Task p2, com.google.android.gms.tasks.Task p3, long p4, int p6)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        this.e = p6;
        return;
    }

    public final Object then(com.google.android.gms.tasks.Task p18)
    {
        String v2_0 = this.a;
        com.google.android.gms.tasks.Task v0_10 = this.b;
        n6.k v3_7 = this.c;
        org.json.JSONObject v4_1 = this.d;
        org.json.JSONObject v6_0 = this.e;
        if (v0_10.isSuccessful()) {
            if (v3_7.isSuccessful()) {
                org.json.JSONObject v7_3;
                com.google.android.gms.tasks.Task v0_2 = ((n6.h) v0_10.getResult());
                n6.k v3_3 = ((n6.f) v3_7.getResult());
                org.json.JSONObject v7_1 = v0_2.b;
                int v8_0 = 0;
                if (v7_1 == null) {
                    if (v0_2.a == 1) {
                        v8_0 = 1;
                    }
                    v7_3 = Boolean.valueOf(v8_0);
                } else {
                    if (v7_1.f >= v4_1) {
                        v8_0 = 1;
                    }
                    v7_3 = Boolean.valueOf(v8_0);
                }
                if (v7_3.booleanValue()) {
                    if (v0_2.b != null) {
                        if (v3_3 == null) {
                            n6.k v3_8 = n6.f.c();
                            v3_3 = new n6.f(v3_8.a, v3_8.b, v3_8.c, v3_8.d, v3_8.e, v3_8.f);
                        }
                        com.google.android.gms.tasks.Task v0_13 = v0_2.b;
                        org.json.JSONObject v4_2 = v3_3.e;
                        org.json.JSONObject v6_1 = v0_13.b;
                        org.json.JSONObject v7_6 = v0_13.e;
                        org.json.JSONObject v5_3 = n6.f.a(new org.json.JSONObject(v0_13.a.toString())).b;
                        java.util.HashMap v9_5 = v3_3.b();
                        com.google.android.gms.tasks.Task v0_14 = v0_13.b();
                        java.util.HashSet v10_3 = new java.util.HashSet();
                        n6.k v3_10 = v3_3.b;
                        java.util.Iterator v11_1 = v3_10.keys();
                        while (v11_1.hasNext()) {
                            String v12_1 = ((String) v11_1.next());
                            if (v6_1.has(v12_1)) {
                                if (v3_10.get(v12_1).equals(v6_1.get(v12_1))) {
                                    if (((!v4_2.has(v12_1)) || (v7_6.has(v12_1))) && ((v4_2.has(v12_1)) || (!v7_6.has(v12_1)))) {
                                        if ((!v4_2.has(v12_1)) || ((!v7_6.has(v12_1)) || (v4_2.getJSONObject(v12_1).toString().equals(v7_6.getJSONObject(v12_1).toString())))) {
                                            if (v9_5.containsKey(v12_1) == v0_14.containsKey(v12_1)) {
                                                if ((!v9_5.containsKey(v12_1)) || ((!v0_14.containsKey(v12_1)) || (((java.util.Map) v9_5.get(v12_1)).equals(v0_14.get(v12_1))))) {
                                                    v5_3.remove(v12_1);
                                                } else {
                                                    v10_3.add(v12_1);
                                                }
                                            } else {
                                                v10_3.add(v12_1);
                                            }
                                        } else {
                                            v10_3.add(v12_1);
                                        }
                                    } else {
                                        v10_3.add(v12_1);
                                    }
                                } else {
                                    v10_3.add(v12_1);
                                }
                            } else {
                                v10_3.add(v12_1);
                            }
                        }
                        com.google.android.gms.tasks.Task v0_15 = v5_3.keys();
                        while (v0_15.hasNext()) {
                            v10_3.add(((String) v0_15.next()));
                        }
                        if (!v10_3.isEmpty()) {
                            com.google.android.gms.tasks.Task v0_18 = v2_0.a.iterator();
                            while (v0_18.hasNext()) {
                                ((n6.k) v0_18.next()).getClass();
                            }
                            return com.google.android.gms.tasks.Tasks.forResult(0);
                        } else {
                            android.util.Log.d("FirebaseRemoteConfig", "Config was fetched, but no params changed.");
                            return com.google.android.gms.tasks.Tasks.forResult(0);
                        }
                    } else {
                        android.util.Log.d("FirebaseRemoteConfig", "The fetch succeeded, but the backend had no updates.");
                        return com.google.android.gms.tasks.Tasks.forResult(0);
                    }
                } else {
                    android.util.Log.d("FirebaseRemoteConfig", "Fetched template version is the same as SDK\'s current version. Retrying fetch.");
                    v2_0.a(v6_0, v4_1);
                    return com.google.android.gms.tasks.Tasks.forResult(0);
                }
            } else {
                return com.google.android.gms.tasks.Tasks.forException(new m6.c("Failed to get activated config for auto-fetch", v3_7.getException()));
            }
        } else {
            return com.google.android.gms.tasks.Tasks.forException(new m6.c("Failed to auto-fetch config update.", v0_10.getException()));
        }
    }
}
