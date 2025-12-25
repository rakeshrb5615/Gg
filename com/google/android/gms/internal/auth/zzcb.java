package com.google.android.gms.internal.auth;
public final class zzcb {
    public static final android.net.Uri zza;
    public static final android.net.Uri zzb;
    public static final java.util.regex.Pattern zzc;
    public static final java.util.regex.Pattern zzd;
    static java.util.HashMap zze;
    static final java.util.HashMap zzf;
    static final java.util.HashMap zzg;
    static final java.util.HashMap zzh;
    static final java.util.HashMap zzi;
    static final String[] zzj;
    private static final java.util.concurrent.atomic.AtomicBoolean zzk;
    private static Object zzl;
    private static boolean zzm;

    static zzcb()
    {
        com.google.android.gms.internal.auth.zzcb.zza = android.net.Uri.parse("content://com.google.android.gsf.gservices");
        com.google.android.gms.internal.auth.zzcb.zzb = android.net.Uri.parse("content://com.google.android.gsf.gservices/prefix");
        com.google.android.gms.internal.auth.zzcb.zzc = java.util.regex.Pattern.compile("^(1|true|t|on|yes|y)$", 2);
        com.google.android.gms.internal.auth.zzcb.zzd = java.util.regex.Pattern.compile("^(0|false|f|off|no|n)$", 2);
        com.google.android.gms.internal.auth.zzcb.zzk = new java.util.concurrent.atomic.AtomicBoolean();
        com.google.android.gms.internal.auth.zzcb.zzf = new java.util.HashMap();
        com.google.android.gms.internal.auth.zzcb.zzg = new java.util.HashMap();
        com.google.android.gms.internal.auth.zzcb.zzh = new java.util.HashMap();
        com.google.android.gms.internal.auth.zzcb.zzi = new java.util.HashMap();
        String[] v0_16 = new String[0];
        com.google.android.gms.internal.auth.zzcb.zzj = v0_16;
        return;
    }

    public zzcb()
    {
        return;
    }

    public static String zza(android.content.ContentResolver p10, String p11, String p12)
    {
        android.database.Cursor v3 = 0;
        if (com.google.android.gms.internal.auth.zzcb.zze != null) {
            if (com.google.android.gms.internal.auth.zzcb.zzk.getAndSet(0)) {
                com.google.android.gms.internal.auth.zzcb.zze.clear();
                com.google.android.gms.internal.auth.zzcb.zzf.clear();
                com.google.android.gms.internal.auth.zzcb.zzg.clear();
                com.google.android.gms.internal.auth.zzcb.zzh.clear();
                com.google.android.gms.internal.auth.zzcb.zzi.clear();
                com.google.android.gms.internal.auth.zzcb.zzl = new Object();
                com.google.android.gms.internal.auth.zzcb.zzm = 0;
            }
        } else {
            com.google.android.gms.internal.auth.zzcb.zzk.set(0);
            com.google.android.gms.internal.auth.zzcb.zze = new java.util.HashMap();
            com.google.android.gms.internal.auth.zzcb.zzl = new Object();
            com.google.android.gms.internal.auth.zzcb.zzm = 0;
            p10.registerContentObserver(com.google.android.gms.internal.auth.zzcb.zza, 1, new com.google.android.gms.internal.auth.zzca(0));
        }
        Throwable v0_14 = com.google.android.gms.internal.auth.zzcb.zzl;
        if (!com.google.android.gms.internal.auth.zzcb.zze.containsKey(p11)) {
            android.database.Cursor v10_1 = p10.query(com.google.android.gms.internal.auth.zzcb.zza, 0, 0, new String[] {p11}), 0);
            if (v10_1 != null) {
                try {
                    if (v10_1.moveToFirst()) {
                        android.database.Cursor v12_1 = v10_1.getString(1);
                        if ((v12_1 != null) && (v12_1.equals(0))) {
                            v12_1 = 0;
                        }
                        com.google.android.gms.internal.auth.zzcb.zzc(v0_14, p11, v12_1);
                        if (v12_1 != null) {
                            v3 = v12_1;
                        }
                        v10_1.close();
                        return v3;
                    } else {
                        com.google.android.gms.internal.auth.zzcb.zzc(v0_14, p11, 0);
                        v10_1.close();
                        return 0;
                    }
                } catch (Throwable v0_16) {
                    Throwable v11_1 = v0_16;
                    v10_1.close();
                    throw v11_1;
                }
            } else {
                return 0;
            }
        } else {
            android.database.Cursor v10_4 = ((String) com.google.android.gms.internal.auth.zzcb.zze.get(p11));
            if (v10_4 != null) {
                v3 = v10_4;
            } else {
            }
            return v3;
        }
    }

    public static synthetic java.util.concurrent.atomic.AtomicBoolean zzb()
    {
        return com.google.android.gms.internal.auth.zzcb.zzk;
    }

    private static void zzc(Object p2, String p3, String p4)
    {
        if (p2 == com.google.android.gms.internal.auth.zzcb.zzl) {
            com.google.android.gms.internal.auth.zzcb.zze.put(p3, p4);
        }
        return;
    }
}
