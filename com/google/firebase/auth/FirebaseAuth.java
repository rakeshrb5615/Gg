package com.google.firebase.auth;
public class FirebaseAuth implements z4.a {
    public final q4.f a;
    public final java.util.concurrent.CopyOnWriteArrayList b;
    public final java.util.concurrent.CopyOnWriteArrayList c;
    public final java.util.concurrent.CopyOnWriteArrayList d;
    public final com.google.android.gms.internal.firebase-auth-api.zzacq e;
    public y4.l f;
    public final Object g;
    public final Object h;
    public final String i;
    public a5.z j;
    public final com.google.android.recaptcha.RecaptchaAction k;
    public final com.google.android.recaptcha.RecaptchaAction l;
    public final com.google.android.recaptcha.RecaptchaAction m;
    public final z4.t n;
    public final z4.x o;
    public final c6.b p;
    public final c6.b q;
    public z4.s r;
    public final java.util.concurrent.Executor s;
    public final java.util.concurrent.Executor t;

    public FirebaseAuth(q4.f p12, c6.b p13, c6.b p14, java.util.concurrent.Executor p15, java.util.concurrent.ScheduledExecutorService p16, java.util.concurrent.Executor p17)
    {
        q4.h v0_1;
        String v3_7 = new com.google.android.gms.internal.firebase-auth-api.zzacq(p12, p15, p16);
        p12.a();
        boolean v5_24 = p12.a;
        String v6_21 = p12.f();
        String v4_26 = new z4.t();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(v5_24);
        String v6_0 = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v6_21);
        v4_26.b = v6_0;
        boolean v5_0 = v5_24.getApplicationContext();
        v4_26.a = v5_0;
        y4.b v7_1 = new StringBuilder("com.google.firebase.auth.api.Store.");
        v7_1.append(v6_0);
        v4_26.c = v5_0.getSharedPreferences(v7_1.toString(), 0);
        android.content.SharedPreferences v8_2 = new String[0];
        v4_26.d = new com.google.android.gms.common.logging.Logger("StorageHelpers", v8_2);
        this.b = new java.util.concurrent.CopyOnWriteArrayList();
        this.c = new java.util.concurrent.CopyOnWriteArrayList();
        this.d = new java.util.concurrent.CopyOnWriteArrayList();
        this.g = new Object();
        this.h = new Object();
        this.k = com.google.android.recaptcha.RecaptchaAction.custom("getOobCode");
        this.l = com.google.android.recaptcha.RecaptchaAction.custom("signInWithPassword");
        this.m = com.google.android.recaptcha.RecaptchaAction.custom("signUpPassword");
        com.google.android.recaptcha.RecaptchaAction.custom("sendVerificationCode");
        com.google.android.recaptcha.RecaptchaAction.custom("mfaSmsEnrollment");
        com.google.android.recaptcha.RecaptchaAction.custom("mfaSmsSignIn");
        this.a = ((q4.f) com.google.android.gms.common.internal.Preconditions.checkNotNull(p12));
        this.e = ((com.google.android.gms.internal.firebase-auth-api.zzacq) com.google.android.gms.common.internal.Preconditions.checkNotNull(v3_7));
        q4.h v0_61 = ((z4.t) com.google.android.gms.common.internal.Preconditions.checkNotNull(v4_26));
        this.n = v0_61;
        this.o = ((z4.x) com.google.android.gms.common.internal.Preconditions.checkNotNull(z4.x.b));
        com.google.android.gms.common.internal.Preconditions.checkNotNull(z4.l.a);
        this.p = p13;
        this.q = p14;
        this.s = p15;
        this.t = p17;
        String v3_27 = v0_61.a("com.google.firebase.auth.FIREBASE_USER");
        if (!android.text.TextUtils.isEmpty(v3_27)) {
            try {
                String v4_1 = new org.json.JSONObject(v3_27);
            } catch (Exception) {
                String v3_3 = new Object[0];
                v0_61.d.i("Failed to restore user data from persistent storage.", v3_3);
                v0_1 = 0;
            }
            if ((!v4_1.has("type")) || (!"com.google.firebase.auth.internal.DefaultFirebaseUser".equalsIgnoreCase(v4_1.optString("type")))) {
            } else {
                v0_1 = v0_61.b(v4_1);
            }
        }
        this.f = v0_1;
        if (v0_1 != null) {
            q4.h v0_6;
            y4.d0 v2_3 = this.n;
            v2_3.getClass();
            com.google.android.gms.common.internal.Preconditions.checkNotNull(v0_1);
            q4.h v0_3 = v0_1.b.a;
            String v3_5 = new StringBuilder("com.google.firebase.auth.GET_TOKEN_RESPONSE.");
            v3_5.append(v0_3);
            q4.h v0_5 = v2_3.a(v3_5.toString());
            if (v0_5 == null) {
                v0_6 = 0;
            } else {
                try {
                    v0_6 = com.google.android.gms.internal.firebase-auth-api.zzahv.zzb(v0_5);
                } catch (com.google.android.gms.internal.firebase-auth-api.zzaao) {
                    String v3_6 = new Object[0];
                    v2_3.d.i("Failed to restore token data from persistent storage.", v3_6);
                }
            }
            if (v0_6 != null) {
                com.google.firebase.auth.FirebaseAuth.c(this, this.f, v0_6, 0, 0);
            }
        }
        this.o.a.getClass();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(this);
        q4.h v0_10 = this.a;
        v0_10.a();
        android.content.SharedPreferences v8_0 = v0_10.a.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0);
        q4.h v0_13 = v8_0.getString("firebaseAppName", "");
        y4.d0 v2_8 = this.a;
        v2_8.a();
        if (v2_8.b.equals(v0_13)) {
            if (!v8_0.contains("verifyAssertionRequest")) {
                if (!v8_0.contains("recaptchaToken")) {
                    if (v8_0.contains("statusCode")) {
                        boolean v5_3 = new com.google.android.gms.common.api.Status(v8_0.getInt("statusCode", 17062), v8_0.getString("statusMessage", ""));
                        v8_0.getLong("timestamp", 0);
                        z4.p.b(v8_0);
                        com.google.android.gms.tasks.Tasks.forException(com.google.android.gms.internal.firebase-auth-api.zzaen.zza(v5_3));
                    }
                } else {
                    q4.h v0_26 = v8_0.getString("recaptchaToken", "");
                    String v4_8 = v8_0.getString("operation", "");
                    v8_0.getLong("timestamp", 0);
                    v4_8.getClass();
                    if (v4_8.equals("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA")) {
                        com.google.android.gms.tasks.Tasks.forResult(v0_26);
                    }
                    z4.p.b(v8_0);
                }
            } else {
                q4.h v0_30 = ((com.google.android.gms.internal.firebase-auth-api.zzajb) com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromString(v8_0.getString("verifyAssertionRequest", ""), com.google.android.gms.internal.firebase-auth-api.zzajb.CREATOR));
                String v4_12 = v8_0.getString("operation", "");
                String v6_4 = v8_0.getString("tenantId", 0);
                String v9_1 = v8_0.getString("firebaseUserUid", "");
                v8_0.getLong("timestamp", 0);
                if (v6_4 != null) {
                    com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v6_4);
                    this.i = v6_4;
                    v0_30.zzb(v6_4);
                }
                v4_12.getClass();
                String v6_5 = -1;
                switch (v4_12.hashCode()) {
                    case -98509410:
                        if (v4_12.equals("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE")) {
                            v6_5 = 0;
                        } else {
                        }
                        break;
                    case 175006864:
                        if (v4_12.equals("com.google.firebase.auth.internal.NONGMSCORE_LINK")) {
                            v6_5 = 1;
                        } else {
                        }
                        break;
                    case 1450464913:
                        if (v4_12.equals("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN")) {
                            v6_5 = 2;
                        } else {
                        }
                        break;
                    default:
                }
                switch (v6_5) {
                    case 0:
                        if (!((z4.e) this.f).b.a.equals(v9_1)) {
                        } else {
                            String v4_25 = this.f;
                            q4.h v0_46 = y4.g0.z(v0_30);
                            com.google.android.gms.common.internal.Preconditions.checkNotNull(v4_25);
                            com.google.android.gms.common.internal.Preconditions.checkNotNull(v0_46);
                            q4.h v0_47 = v0_46.y();
                            if (!(v0_47 instanceof y4.d)) {
                                if (!(v0_47 instanceof y4.s)) {
                                    this.e.zzc(this.a, v4_25, v0_47, v4_25.x(), new y4.g(this, 0));
                                } else {
                                    this.e.zzb(this.a, v4_25, ((y4.s) v0_47), this.i, new y4.g(this, 0));
                                }
                            } else {
                                String v9_4;
                                q4.h v0_49 = ((y4.d) v0_47);
                                y4.b v7_3 = v0_49.b;
                                if (android.text.TextUtils.isEmpty(v7_3)) {
                                    v9_4 = "emailLink";
                                } else {
                                    v9_4 = "password";
                                }
                                if (!"password".equals(v9_4)) {
                                    String v6_18 = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v0_49.c);
                                    String vtmp93 = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v6_18);
                                    try {
                                        boolean v5_20 = new y4.b(v6_18);
                                    } catch (IllegalArgumentException) {
                                    }
                                    if (v5_20) {
                                        if (!android.text.TextUtils.equals(this.i, v5_20.b)) {
                                            com.google.android.gms.tasks.Tasks.forException(com.google.android.gms.internal.firebase-auth-api.zzaen.zza(new com.google.android.gms.common.api.Status(17072)));
                                        }
                                    }
                                    new y4.d0(this, 1, v4_25, v0_49).e(this, this.i, this.k);
                                } else {
                                    y4.d0 v2_39 = v0_49.a;
                                    boolean v5_23 = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v7_3);
                                    String v6_20 = v4_25.x();
                                    new y4.j0(this, v2_39, 1, v4_25, v5_23, v6_20).e(this, v6_20, this.l);
                                }
                            }
                        }
                        break;
                    case 1:
                        if (!((z4.e) this.f).b.a.equals(v9_1)) {
                        } else {
                            y4.d0 v2_33 = this.f;
                            q4.h v0_44 = y4.g0.z(v0_30);
                            com.google.android.gms.common.internal.Preconditions.checkNotNull(v0_44);
                            com.google.android.gms.common.internal.Preconditions.checkNotNull(v2_33);
                            this.e.zza(this.a, v2_33, v0_44.y(), 0, new y4.g(this, 0));
                        }
                        break;
                    case 2:
                        q4.h v0_32 = y4.g0.z(v0_30);
                        String v3_9 = this.a;
                        String v4_13 = this.e;
                        com.google.android.gms.common.internal.Preconditions.checkNotNull(v0_32);
                        q4.h v0_33 = v0_32.y();
                        if (!(v0_33 instanceof y4.d)) {
                            if (!(v0_33 instanceof y4.s)) {
                                v4_13.zza(v3_9, v0_33, this.i, new y4.f(this));
                            } else {
                                v4_13.zza(v3_9, ((y4.s) v0_33), this.i, new y4.f(this));
                            }
                        } else {
                            q4.h v0_35 = ((y4.d) v0_33);
                            if (!android.text.TextUtils.isEmpty(v0_35.c)) {
                                String v3_13 = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v0_35.c);
                                String vtmp82 = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v3_13);
                                try {
                                    String v4_15 = new y4.b(v3_13);
                                } catch (IllegalArgumentException) {
                                    v4_15 = 0;
                                }
                                if ((v4_15 == null) || (android.text.TextUtils.equals(this.i, v4_15.b))) {
                                    new y4.d0(this, 0, 0, v0_35).e(this, this.i, this.k);
                                } else {
                                    com.google.android.gms.tasks.Tasks.forException(com.google.android.gms.internal.firebase-auth-api.zzaen.zza(new com.google.android.gms.common.api.Status(17072)));
                                }
                            } else {
                                String v6_8 = this.i;
                                new y4.j0(this, v0_35.a, 0, 0, ((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(v0_35.b)), v6_8).e(this, v6_8, this.l);
                            }
                        }
                        break;
                    default:
                }
                z4.p.b(v8_0);
            }
        }
        return;
    }

    public static void b(com.google.firebase.auth.FirebaseAuth p3, y4.l p4)
    {
        if (p4 == null) {
            android.util.Log.d("FirebaseAuth", "Notifying auth state listeners about a sign-out event.");
        } else {
            java.util.concurrent.Executor v4_7 = ((z4.e) p4).b.a;
            StringBuilder v1_1 = new StringBuilder("Notifying auth state listeners about user ( ");
            v1_1.append(v4_7);
            v1_1.append(" ).");
            android.util.Log.d("FirebaseAuth", v1_1.toString());
        }
        p3.t.execute(new y4.i0(p3));
        return;
    }

    public static void c(com.google.firebase.auth.FirebaseAuth p18, y4.l p19, com.google.android.gms.internal.firebase-auth-api.zzahv p20, boolean p21, boolean p22)
    {
        long v2_4;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p19);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p20);
        long v2_15 = p18.f;
        if ((v2_15 == 0) || (!((z4.e) p19).b.a.equals(((z4.e) v2_15).b.a))) {
            v2_4 = 0;
        } else {
            v2_4 = 1;
        }
        if ((v2_4 != 0) || (!p22)) {
            long v2_14;
            int v5_5;
            int v5_0 = p18.f;
            if (v5_0 != 0) {
                int v5_4 = ((z4.e) v5_0).a.zzc().equals(p20.zzc());
                if ((v2_4 == 0) || (v5_4 == 0)) {
                    v5_5 = 1;
                } else {
                    v5_5 = 0;
                }
                if (v2_4 != 0) {
                    v2_14 = 0;
                } else {
                    v2_14 = 1;
                }
            } else {
                v2_14 = 1;
                v5_5 = 1;
            }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(p19);
            long v6_3 = p18.f;
            if ((v6_3 != 0) && (((z4.e) p19).b.a.equals(((z4.e) v6_3).b.a))) {
                p18.f.z(((z4.e) p19).e);
                if (!p19.y()) {
                    ((z4.e) p18.f).n = Boolean.FALSE;
                }
                java.util.ArrayList v8_6;
                com.google.android.gms.common.internal.Preconditions.checkNotNull(((z4.e) p19));
                long v6_12 = ((z4.e) p19).r;
                if (v6_12 == 0) {
                    v8_6 = new java.util.ArrayList();
                } else {
                    v8_6 = new java.util.ArrayList();
                    y4.z v9_3 = v6_12.a.iterator();
                    while (v9_3.hasNext()) {
                        v8_6.add(((y4.w) v9_3.next()));
                    }
                    long v6_14 = v6_12.b.iterator();
                    while (v6_14.hasNext()) {
                        v8_6.add(((y4.z) v6_14.next()));
                    }
                }
                long v6_15 = ((z4.e) p19).s;
                p18.f.A(v8_6);
                int v7_7 = ((z4.e) p18.f);
                if (v6_15 == 0) {
                    v7_7.getClass();
                    v6_15 = new java.util.ArrayList();
                }
                v7_7.s = v6_15;
            } else {
                p18.f = p19;
            }
            if (p21) {
                String v3_0;
                long v6_0 = p18.n;
                int v7_0 = p18.f;
                v6_0.getClass();
                com.google.android.gms.common.internal.Preconditions.checkNotNull(v7_0);
                java.util.ArrayList v8_0 = v6_0.d;
                y4.z v9_1 = new org.json.JSONObject();
                if (!(v7_0 instanceof z4.e)) {
                    v3_0 = 0;
                } else {
                    int v7_1 = ((z4.e) v7_0);
                    try {
                        v9_1.put("cachedTokenState", v7_1.a.zzf());
                        Object[] v11_3 = q4.f.e(v7_1.c);
                        v11_3.a();
                        v9_1.put("applicationName", v11_3.b);
                        v9_1.put("type", "com.google.firebase.auth.internal.DefaultFirebaseUser");
                    } catch (z4.i v0_3) {
                        long v2_16 = new Object[0];
                        v8_0.wtf("Failed to turn object into JSON", v0_3, v2_16);
                        throw new com.google.android.gms.internal.firebase-auth-api.zzaao(v0_3);
                    }
                    if (v7_1.e != null) {
                        String v10_6 = new org.json.JSONArray();
                        Object[] v11_6 = v7_1.e;
                        int v12_0 = v11_6.size();
                        if (v11_6.size() > 30) {
                            v8_0.w("Provider user info list size larger than max size, truncating list to %d. Actual list size: %d", new Object[] {Integer.valueOf(30), Integer.valueOf(v11_6.size())}));
                            v12_0 = 30;
                        }
                        String v13_3 = 0;
                        StringBuilder v14_1 = 0;
                        while (v13_3 < v12_0) {
                            int v17 = 1;
                            int v4_1 = ((z4.c) v11_6.get(v13_3));
                            if (v4_1.b.equals("firebase")) {
                                v14_1 = 1;
                            }
                            if ((v13_3 != (v12_0 - 1)) || (v14_1 != null)) {
                                v10_6.put(v4_1.zzb());
                                v13_3++;
                            }
                            if (v14_1 == null) {
                                String v3_4 = (v12_0 - 1);
                                while ((v3_4 < v11_6.size()) && (v3_4 >= null)) {
                                    int v4_5 = ((z4.c) v11_6.get(v3_4));
                                    if (!v4_5.b.equals("firebase")) {
                                        if (v3_4 == (v11_6.size() - 1)) {
                                            v10_6.put(v4_5.zzb());
                                        }
                                        v3_4++;
                                    } else {
                                        v10_6.put(v4_5.zzb());
                                        int v4_3 = v17;
                                    }
                                    if (v4_3 == 0) {
                                        v8_0.w("Malformed user object! No Firebase Auth provider id found. Provider user info list size: %d, trimmed size: %d", new Object[] {Integer.valueOf(v11_6.size()), Integer.valueOf(v12_0)}));
                                        if (v11_6.size() < 5) {
                                            String v3_9 = new StringBuilder("Provider user info list:\n");
                                            int v4_12 = v11_6.size();
                                            int v12_3 = 0;
                                            while (v12_3 < v4_12) {
                                                String v13_10 = v11_6.get(v12_3);
                                                v12_3++;
                                                String v13_12 = ((z4.c) v13_10).b;
                                                StringBuilder v14_3 = new StringBuilder();
                                                v14_3.append("Provider - ");
                                                v14_3.append(v13_12);
                                                v14_3.append("\n");
                                                v3_9.append(v14_3.toString());
                                            }
                                            Object[] v11_7 = new Object[0];
                                            v8_0.w(v3_9.toString(), v11_7);
                                        }
                                    }
                                }
                                v4_3 = v14_1;
                            }
                            v9_1.put("userInfos", v10_6);
                        }
                        v17 = 1;
                    }
                    v9_1.put("anonymous", v7_1.y());
                    v9_1.put("version", "2");
                    String v3_14 = v7_1.o;
                    if (v3_14 != null) {
                        String v10_8 = new org.json.JSONObject();
                        v10_8.put("lastSignInTimestamp", v3_14.a);
                        v10_8.put("creationTimestamp", v3_14.b);
                        v9_1.put("userMetadata", v10_8);
                    }
                    int v4_18;
                    com.google.android.gms.common.internal.Preconditions.checkNotNull(v7_1);
                    String v3_15 = v7_1.r;
                    if (v3_15 == null) {
                        v4_18 = new java.util.ArrayList();
                    } else {
                        v4_18 = new java.util.ArrayList();
                        String v10_10 = v3_15.a.iterator();
                        while (v10_10.hasNext()) {
                            v4_18.add(((y4.w) v10_10.next()));
                        }
                        String v3_17 = v3_15.b.iterator();
                        while (v3_17.hasNext()) {
                            v4_18.add(((y4.z) v3_17.next()));
                        }
                    }
                    if (!v4_18.isEmpty()) {
                        String v3_20 = new org.json.JSONArray();
                        String v10_12 = 0;
                        while (v10_12 < v4_18.size()) {
                            v3_20.put(((y4.p) v4_18.get(v10_12)).toJson());
                            v10_12++;
                        }
                        v9_1.put("userMultiFactorInfo", v3_20);
                    }
                    String v3_21 = v7_1.s;
                    if ((v3_21 != null) && (!v3_21.isEmpty())) {
                        int v4_23 = new org.json.JSONArray();
                        int v7_2 = 0;
                        while (v7_2 < v3_21.size()) {
                            String v10_15 = ((y4.e0) v3_21.get(v7_2));
                            Object[] v11_13 = new org.json.JSONObject();
                            v11_13.put("credentialId", v10_15.a);
                            v11_13.put("name", v10_15.b);
                            v11_13.put("displayName", v10_15.c);
                            v4_23.put(v11_13);
                            v7_2++;
                        }
                        v9_1.put("passkeyInfo", v4_23);
                    }
                    v3_0 = v9_1.toString();
                }
                if (!android.text.TextUtils.isEmpty(v3_0)) {
                    v6_0.c("com.google.firebase.auth.FIREBASE_USER", v3_0);
                }
            }
            if (v5_5 != 0) {
                String v3_23 = p18.f;
                if (v3_23 != null) {
                    ((z4.e) v3_23).a = ((com.google.android.gms.internal.firebase-auth-api.zzahv) com.google.android.gms.common.internal.Preconditions.checkNotNull(p20));
                }
                com.google.firebase.auth.FirebaseAuth.d(p18, p18.f);
            }
            if (v2_14 != 0) {
                com.google.firebase.auth.FirebaseAuth.b(p18, p18.f);
            }
            if (p21) {
                long v2_6 = p18.n;
                v2_6.getClass();
                com.google.android.gms.common.internal.Preconditions.checkNotNull(p19);
                com.google.android.gms.common.internal.Preconditions.checkNotNull(p20);
                v2_6.c(g2.g.l("com.google.firebase.auth.GET_TOKEN_RESPONSE.", ((z4.e) p19).b.a), p20.zzf());
            }
            long v1_5 = p18.f;
            if (v1_5 != 0) {
                if (p18.r == null) {
                    p18.r = new z4.s(((q4.f) com.google.android.gms.common.internal.Preconditions.checkNotNull(p18.a)));
                }
                z4.i v0_1 = p18.r;
                long v1_7 = ((z4.e) v1_5).a;
                v0_1.getClass();
                if (v1_7 != 0) {
                    long v2_11 = v1_7.zza();
                    if (v2_11 <= 0) {
                        v2_11 = 3600;
                    }
                    z4.i v0_2 = v0_1.a;
                    v0_2.a = ((v2_11 * 1000) + v1_7.zzb());
                    v0_2.b = -1;
                }
            }
        }
        return;
    }

    public static void d(com.google.firebase.auth.FirebaseAuth p4, y4.l p5)
    {
        if (p5 == null) {
            android.util.Log.d("FirebaseAuth", "Notifying id token listeners about a sign-out event.");
        } else {
            y4.i0 v1_8 = ((z4.e) p5).b.a;
            StringBuilder v2_0 = new StringBuilder("Notifying id token listeners about user ( ");
            v2_0.append(v1_8);
            v2_0.append(" ).");
            android.util.Log.d("FirebaseAuth", v2_0.toString());
        }
        java.util.concurrent.Executor v5_1;
        if (p5 == null) {
            v5_1 = 0;
        } else {
            v5_1 = ((z4.e) p5).a.zzc();
        }
        h6.b v0_2 = new h6.b();
        v0_2.a = v5_1;
        p4.t.execute(new y4.i0(p4, v0_2));
        return;
    }

    public static com.google.firebase.auth.FirebaseAuth getInstance()
    {
        return ((com.google.firebase.auth.FirebaseAuth) q4.f.d().b(com.google.firebase.auth.FirebaseAuth));
    }

    public static com.google.firebase.auth.FirebaseAuth getInstance(q4.f p1)
    {
        return ((com.google.firebase.auth.FirebaseAuth) p1.b(com.google.firebase.auth.FirebaseAuth));
    }

    public final void a()
    {
        b5.l v0_0 = this.n;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(v0_0);
        com.google.android.gms.internal.firebase-auth-api.zze v1_2 = this.f;
        if (v1_2 != null) {
            v0_0.getClass();
            com.google.android.gms.common.internal.Preconditions.checkNotNull(v1_2);
            v0_0.c.edit().remove(g2.g.l("com.google.firebase.auth.GET_TOKEN_RESPONSE.", ((z4.e) v1_2).b.a)).apply();
            this.f = 0;
        }
        v0_0.c.edit().remove("com.google.firebase.auth.FIREBASE_USER").apply();
        com.google.firebase.auth.FirebaseAuth.d(this, 0);
        com.google.firebase.auth.FirebaseAuth.b(this, 0);
        b5.l v0_4 = this.r;
        if (v0_4 != null) {
            b5.l v0_5 = v0_4.a;
            v0_5.c.removeCallbacks(v0_5.d);
        }
        return;
    }
}
