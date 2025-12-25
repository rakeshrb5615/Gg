package com.google.android.gms.internal.firebase-auth-api;
public final class zzaeq extends android.os.AsyncTask {
    private static final com.google.android.gms.common.logging.Logger zza;
    private final String zzb;
    private final String zzc;
    private final ref.WeakReference zzd;
    private final android.net.Uri$Builder zze;
    private final String zzf;
    private final q4.f zzg;

    static zzaeq()
    {
        com.google.android.gms.internal.firebase-auth-api.zzaeq.zza = new com.google.android.gms.common.logging.Logger("FirebaseAuth", new String[] {"GetAuthDomainTask"}));
        return;
    }

    public zzaeq(String p4, String p5, android.content.Intent p6, q4.f p7, com.google.android.gms.internal.firebase-auth-api.zzaes p8)
    {
        this.zzb = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p4);
        this.zzg = ((q4.f) com.google.android.gms.common.internal.Preconditions.checkNotNull(p7));
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p5);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p6);
        ref.WeakReference v7_3 = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p6.getStringExtra("com.google.firebase.auth.KEY_API_KEY"));
        android.net.Uri$Builder v0_3 = android.net.Uri.parse(p8.zza(v7_3)).buildUpon();
        v0_3.appendPath("getProjectConfig").appendQueryParameter("key", v7_3).appendQueryParameter("androidPackageName", p4).appendQueryParameter("sha1Cert", ((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(p5)));
        this.zzc = v0_3.build().toString();
        this.zzd = new ref.WeakReference(p8);
        this.zze = p8.zza(p6, p4, p5);
        this.zzf = p6.getStringExtra("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN");
        return;
    }

    private final varargs com.google.android.gms.internal.firebase-auth-api.zzaep zza(Void[] p7)
    {
        boolean v2_10 = ((com.google.android.gms.internal.firebase-auth-api.zzaes) this.zzd.get());
        String v1_0 = v2_10.zza(new java.net.URL(this.zzc));
        v1_0.addRequestProperty("Content-Type", "application/json; charset=UTF-8");
        v1_0.setConnectTimeout(60000);
        new com.google.android.gms.internal.firebase-auth-api.zzafe(v2_10.zza(), this.zzg, com.google.android.gms.internal.firebase-auth-api.zzafc.zza().zzb()).zza(v1_0);
        boolean v2_3 = v1_0.getResponseCode();
        if (v2_3 == 200) {
            com.google.android.gms.internal.firebase-auth-api.zzaep v7_7 = new com.google.android.gms.internal.firebase-auth-api.zzahq();
            v7_7.zza(new String(com.google.android.gms.internal.firebase-auth-api.zzaeq.zza(v1_0.getInputStream(), 128)));
            if (android.text.TextUtils.isEmpty(this.zzf)) {
                com.google.android.gms.internal.firebase-auth-api.zzaep v7_9 = v7_7.zza().iterator();
                while (v7_9.hasNext()) {
                    String v1_11 = ((String) v7_9.next());
                    if (com.google.android.gms.internal.firebase-auth-api.zzaeq.zza(v1_11)) {
                        return com.google.android.gms.internal.firebase-auth-api.zzaep.zza(v1_11);
                    }
                }
                return 0;
            } else {
                if (v7_7.zza().contains(this.zzf)) {
                    return com.google.android.gms.internal.firebase-auth-api.zzaep.zza(this.zzf);
                } else {
                    return com.google.android.gms.internal.firebase-auth-api.zzaep.zzb("UNAUTHORIZED_DOMAIN");
                }
            }
        } else {
            String v1_13 = com.google.android.gms.internal.firebase-auth-api.zzaeq.zza(v1_0);
            StringBuilder v4_3 = new StringBuilder("Error getting project config. Failed with ");
            v4_3.append(v1_13);
            v4_3.append(" ");
            v4_3.append(v2_3);
            boolean v2_11 = new Object[0];
            com.google.android.gms.internal.firebase-auth-api.zzaeq.zza.e(v4_3.toString(), v2_11);
            return com.google.android.gms.internal.firebase-auth-api.zzaep.zzb(v1_13);
        }
    }

    private static String zza(java.net.HttpURLConnection p2)
    {
        try {
            if (p2.getResponseCode() >= 400) {
                String v2_10 = p2.getErrorStream();
                if (v2_10 != null) {
                    return ((String) com.google.android.gms.internal.firebase-auth-api.zzaex.zza(new String(com.google.android.gms.internal.firebase-auth-api.zzaeq.zza(v2_10, 128)), String));
                } else {
                    return "WEB_INTERNAL_ERROR:Could not retrieve the authDomain for this project but did not receive an error response from the network request. Please try again.";
                }
            }
        } catch (String v2_6) {
            int v1_3 = new Object[0];
            com.google.android.gms.internal.firebase-auth-api.zzaeq.zza.w("Error parsing error message from response body in getErrorMessageFromBody. ".concat(String.valueOf(v2_6)), v1_3);
        }
        return 0;
    }

    private final void zza(com.google.android.gms.internal.firebase-auth-api.zzaep p4)
    {
        String v1_3;
        android.net.Uri v4_1;
        Object[] v0_2 = ((com.google.android.gms.internal.firebase-auth-api.zzaes) this.zzd.get());
        if (p4 == null) {
            v1_3 = 0;
            v4_1 = 0;
        } else {
            v1_3 = p4.zza();
            v4_1 = p4.zzb();
        }
        if (v0_2 != null) {
            if (!android.text.TextUtils.isEmpty(v1_3)) {
                c6.b v2_1 = this.zze;
                if (v2_1 != null) {
                    v2_1.authority(v1_3);
                    v0_2.zza(this.zze.build(), this.zzb, com.google.firebase.auth.FirebaseAuth.getInstance(this.zzg).p);
                    return;
                }
            }
            v0_2.zza(this.zzb, w0.a.k(v4_1));
            return;
        } else {
            Object[] v0_4 = new Object[0];
            com.google.android.gms.internal.firebase-auth-api.zzaeq.zza.e("An error has occurred: the handler reference has returned null.", v0_4);
            return;
        }
    }

    private static boolean zza(String p5)
    {
        try {
            String v2_5 = new StringBuilder("https://");
            v2_5.append(p5);
            Object[] v1_1 = new java.net.URI(v2_5.toString()).getHost();
        } catch (Object[] v1_2) {
            Object[] v1_4 = new Object[0];
            com.google.android.gms.internal.firebase-auth-api.zzaeq.zza.e(g2.g.f("Error parsing URL for auth domain check: ", p5, ". ", v1_2.getMessage()), v1_4);
            return 0;
        }
        if ((v1_1 == null) || ((!v1_1.endsWith("firebaseapp.com")) && (!v1_1.endsWith("web.app")))) {
            return 0;
        } else {
            return 1;
        }
    }

    private static byte[] zza(java.io.InputStream p3, int p4)
    {
        java.io.ByteArrayOutputStream v4_1 = new java.io.ByteArrayOutputStream();
        byte[] v0_1 = new byte[128];
        while(true) {
            int v1 = p3.read(v0_1);
            if (v1 == -1) {
                break;
            }
            v4_1.write(v0_1, 0, v1);
        }
        byte[] v3_2 = v4_1.toByteArray();
        v4_1.close();
        return v3_2;
    }

    public final synthetic Object doInBackground(Object[] p1)
    {
        return this.zza(((Void[]) p1));
    }

    public final synthetic void onCancelled(Object p1)
    {
        this.zza(0);
        return;
    }

    public final synthetic void onPostExecute(Object p1)
    {
        this.zza(((com.google.android.gms.internal.firebase-auth-api.zzaep) p1));
        return;
    }
}
