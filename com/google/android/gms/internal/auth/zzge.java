package com.google.android.gms.internal.auth;
final class zzge {
    private static final com.google.android.gms.internal.auth.zzge zza;
    private final com.google.android.gms.internal.auth.zzgi zzb;
    private final java.util.concurrent.ConcurrentMap zzc;

    static zzge()
    {
        com.google.android.gms.internal.auth.zzge.zza = new com.google.android.gms.internal.auth.zzge();
        return;
    }

    private zzge()
    {
        this.zzc = new java.util.concurrent.ConcurrentHashMap();
        this.zzb = new com.google.android.gms.internal.auth.zzfo();
        return;
    }

    public static com.google.android.gms.internal.auth.zzge zza()
    {
        return com.google.android.gms.internal.auth.zzge.zza;
    }

    public final com.google.android.gms.internal.auth.zzgh zzb(Class p3)
    {
        com.google.android.gms.internal.auth.zzez.zzf(p3, "messageType");
        com.google.android.gms.internal.auth.zzgh v1_3 = ((com.google.android.gms.internal.auth.zzgh) this.zzc.get(p3));
        if (v1_3 != null) {
            return v1_3;
        } else {
            com.google.android.gms.internal.auth.zzgh v1_0 = this.zzb.zza(p3);
            com.google.android.gms.internal.auth.zzez.zzf(p3, "messageType");
            com.google.android.gms.internal.auth.zzez.zzf(v1_0, "schema");
            com.google.android.gms.internal.auth.zzgh v3_2 = ((com.google.android.gms.internal.auth.zzgh) this.zzc.putIfAbsent(p3, v1_0));
            if (v3_2 != null) {
                return v3_2;
            } else {
                return v1_0;
            }
        }
    }
}
