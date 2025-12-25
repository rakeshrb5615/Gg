package com.google.android.gms.internal.firebase-auth-api;
final class zzagc {
    private static final com.google.android.gms.common.logging.Logger zza;
    private final android.content.Context zzb;
    private final java.util.concurrent.ScheduledExecutorService zzc;
    private final java.util.HashMap zzd;

    static zzagc()
    {
        com.google.android.gms.internal.firebase-auth-api.zzagc.zza = new com.google.android.gms.common.logging.Logger("FirebaseAuth", new String[] {"SmsRetrieverHelper"}));
        return;
    }

    public zzagc(android.content.Context p2, java.util.concurrent.ScheduledExecutorService p3)
    {
        this.zzd = new java.util.HashMap();
        this.zzb = p2;
        this.zzc = p3;
        return;
    }

    public static bridge synthetic com.google.android.gms.common.logging.Logger zza()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzagc.zza;
    }

    public static String zza(String p1)
    {
        int v1_2 = java.util.regex.Pattern.compile("(?<!\\d)\\d{6}(?!\\d)").matcher(p1);
        if (!v1_2.find()) {
            return 0;
        } else {
            return v1_2.group();
        }
    }

    private static String zza(String p4, String p5)
    {
        com.google.android.gms.common.logging.Logger v5_4 = g2.g.e(p4, " ", p5);
        try {
            String v1_6 = java.security.MessageDigest.getInstance("SHA-256");
            v1_6.update(v5_4.getBytes(java.nio.charset.StandardCharsets.UTF_8));
            com.google.android.gms.common.logging.Logger v5_5 = android.util.Base64.encodeToString(java.util.Arrays.copyOf(v1_6.digest(), 9), 3).substring(0, 11);
            Object[] v2_1 = new StringBuilder("Package: ");
            v2_1.append(p4);
            v2_1.append(" -- Hash: ");
            v2_1.append(v5_5);
            Object[] v2_2 = new Object[0];
            com.google.android.gms.internal.firebase-auth-api.zzagc.zza.d(v2_1.toString(), v2_2);
            return v5_5;
        } catch (int v4_3) {
            Object[] v0_2 = new Object[0];
            com.google.android.gms.internal.firebase-auth-api.zzagc.zza.e(g2.g.l("NoSuchAlgorithm: ", v4_3.getMessage()), v0_2);
            return 0;
        }
    }

    public static bridge synthetic java.util.HashMap zza(com.google.android.gms.internal.firebase-auth-api.zzagc p0)
    {
        return p0.zzd;
    }

    public static synthetic void zza(com.google.android.gms.internal.firebase-auth-api.zzagc p0, String p1)
    {
        p0.zze(p1);
        return;
    }

    public static void zzb(com.google.android.gms.internal.firebase-auth-api.zzagc p7, String p8)
    {
        com.google.android.gms.internal.firebase-auth-api.zzagj v7_3 = ((com.google.android.gms.internal.firebase-auth-api.zzagj) p7.zzd.get(p8));
        if ((v7_3 != null) && ((!com.google.android.gms.internal.firebase-auth-api.zzac.zzc(v7_3.zzd)) && ((!com.google.android.gms.internal.firebase-auth-api.zzac.zzc(v7_3.zze)) && (!v7_3.zzb.isEmpty())))) {
            int v8_5 = v7_3.zzb.iterator();
            while (v8_5.hasNext()) {
                ((com.google.android.gms.internal.firebase-auth-api.zzael) v8_5.next()).zza(new y4.s(v7_3.zzd, v7_3.zze, 0, 0, 1));
            }
            v7_3.zzh = 1;
        }
        return;
    }

    public static synthetic void zzc(com.google.android.gms.internal.firebase-auth-api.zzagc p0, String p1)
    {
        p0.zzd(p1);
        return;
    }

    public static synthetic void zzd(com.google.android.gms.internal.firebase-auth-api.zzagc p0, String p1)
    {
        p0.zze(p1);
        return;
    }

    private final void zzd(String p4)
    {
        com.google.android.gms.internal.firebase-auth-api.zzagj v4_2 = ((com.google.android.gms.internal.firebase-auth-api.zzagj) this.zzd.get(p4));
        if ((v4_2 != null) && ((!v4_2.zzh) && (!com.google.android.gms.internal.firebase-auth-api.zzac.zzc(v4_2.zzd)))) {
            com.google.android.gms.internal.firebase-auth-api.zzael v1_1 = new Object[0];
            com.google.android.gms.internal.firebase-auth-api.zzagc.zza.w("Timed out waiting for SMS.", v1_1);
            int v0_3 = v4_2.zzb.iterator();
            while (v0_3.hasNext()) {
                ((com.google.android.gms.internal.firebase-auth-api.zzael) v0_3.next()).zza(v4_2.zzd);
            }
            v4_2.zzi = 1;
        }
        return;
    }

    private final void zze(String p2)
    {
        boolean v0_2 = ((com.google.android.gms.internal.firebase-auth-api.zzagj) this.zzd.get(p2));
        if (v0_2) {
            if (!v0_2.zzi) {
                this.zzd(p2);
            }
            this.zzb(p2);
            return;
        } else {
            return;
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzael zza(com.google.android.gms.internal.firebase-auth-api.zzael p2, String p3)
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzagh(this, p2, p3);
    }

    public final void zza(String p4, com.google.android.gms.internal.firebase-auth-api.zzael p5, long p6, boolean p8)
    {
        this.zzd.put(p4, new com.google.android.gms.internal.firebase-auth-api.zzagj(p6, p8));
        this.zzb(p5, p4);
        com.google.android.gms.internal.firebase-auth-api.zzage v5_10 = ((com.google.android.gms.internal.firebase-auth-api.zzagj) this.zzd.get(p4));
        if (v5_10.zza > 0) {
            v5_10.zzf = this.zzc.schedule(new com.google.android.gms.internal.firebase-auth-api.zzagf(this, p4), v5_10.zza, java.util.concurrent.TimeUnit.SECONDS);
            if (v5_10.zzc) {
                com.google.android.gms.internal.firebase-auth-api.zzage v5_3 = new com.google.android.gms.internal.firebase-auth-api.zzagg(this, p4);
                com.google.android.gms.tasks.Task v4_2 = new android.content.IntentFilter();
                v4_2.addAction("com.google.android.gms.auth.api.phone.SMS_RETRIEVED");
                e0.c.registerReceiver(this.zzb.getApplicationContext(), v5_3, v4_2, 2);
                com.google.android.gms.auth.api.phone.SmsRetriever.getClient(this.zzb).startSmsRetriever().addOnFailureListener(new com.google.android.gms.internal.firebase-auth-api.zzage(this));
                return;
            } else {
                android.content.Context v6_7 = new Object[0];
                com.google.android.gms.internal.firebase-auth-api.zzagc.zza.w("SMS auto-retrieval unavailable; SmsRetriever will not start.", v6_7);
                return;
            }
        } else {
            android.content.Context v6_8 = new Object[0];
            com.google.android.gms.internal.firebase-auth-api.zzagc.zza.w("Timeout of 0 specified; SmsRetriever will not start.", v6_8);
            return;
        }
    }

    public final String zzb()
    {
        try {
            String v2_2;
            com.google.android.gms.common.logging.Logger v1_2 = this.zzb.getPackageName();
        } catch (android.content.pm.PackageManager$NameNotFoundException) {
            int v0_1 = new Object[0];
            com.google.android.gms.internal.firebase-auth-api.zzagc.zza.e("Unable to find package to obtain hash.", v0_1);
            return 0;
        }
        if (android.os.Build$VERSION.SDK_INT >= 28) {
            v2_2 = a5.t.c(com.google.android.gms.common.wrappers.Wrappers.packageManager(this.zzb).getPackageInfo(v1_2, 134217728)).getApkContentsSigners();
        } else {
            v2_2 = com.google.android.gms.common.wrappers.Wrappers.packageManager(this.zzb).getPackageInfo(v1_2, 64).signatures;
        }
        com.google.android.gms.common.logging.Logger v1_1 = com.google.android.gms.internal.firebase-auth-api.zzagc.zza(v1_2, v2_2[0].toCharsString());
        if (v1_1 == null) {
            Object[] v3_2 = new Object[0];
            com.google.android.gms.internal.firebase-auth-api.zzagc.zza.e("Hash generation failed.", v3_2);
            return 0;
        } else {
            return v1_1;
        }
    }

    public final void zzb(com.google.android.gms.internal.firebase-auth-api.zzael p8, String p9)
    {
        String v9_3 = ((com.google.android.gms.internal.firebase-auth-api.zzagj) this.zzd.get(p9));
        if (v9_3 != null) {
            v9_3.zzb.add(p8);
            if (v9_3.zzg) {
                p8.zzb(v9_3.zzd);
            }
            if (v9_3.zzh) {
                p8.zza(new y4.s(v9_3.zzd, v9_3.zze, 0, 0, 1));
            }
            if (v9_3.zzi) {
                p8.zza(v9_3.zzd);
            }
        }
        return;
    }

    public final void zzb(String p4)
    {
        java.util.HashMap v0_4 = ((com.google.android.gms.internal.firebase-auth-api.zzagj) this.zzd.get(p4));
        if (v0_4 != null) {
            java.util.concurrent.ScheduledFuture v1_1 = v0_4.zzf;
            if ((v1_1 != null) && (!v1_1.isDone())) {
                v0_4.zzf.cancel(0);
            }
            v0_4.zzb.clear();
            this.zzd.remove(p4);
            return;
        } else {
            return;
        }
    }

    public final boolean zzc(String p2)
    {
        if (this.zzd.get(p2) == null) {
            return 0;
        } else {
            return 1;
        }
    }
}
