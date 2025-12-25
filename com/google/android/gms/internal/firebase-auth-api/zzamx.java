package com.google.android.gms.internal.firebase-auth-api;
final class zzamx {
    private static final com.google.android.gms.internal.firebase-auth-api.zzamx zza;
    private final com.google.android.gms.internal.firebase-auth-api.zzane zzb;
    private final java.util.concurrent.ConcurrentMap zzc;

    static zzamx()
    {
        com.google.android.gms.internal.firebase-auth-api.zzamx.zza = new com.google.android.gms.internal.firebase-auth-api.zzamx();
        return;
    }

    private zzamx()
    {
        this.zzc = new java.util.concurrent.ConcurrentHashMap();
        this.zzb = new com.google.android.gms.internal.firebase-auth-api.zzama();
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzamx zza()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzamx.zza;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzanb zza(Class p3)
    {
        com.google.android.gms.internal.firebase-auth-api.zzalh.zza(p3, "messageType");
        com.google.android.gms.internal.firebase-auth-api.zzanb v1_2 = ((com.google.android.gms.internal.firebase-auth-api.zzanb) this.zzc.get(p3));
        if (v1_2 == null) {
            v1_2 = this.zzb.zza(p3);
            com.google.android.gms.internal.firebase-auth-api.zzalh.zza(p3, "messageType");
            com.google.android.gms.internal.firebase-auth-api.zzalh.zza(v1_2, "schema");
            com.google.android.gms.internal.firebase-auth-api.zzanb v3_2 = ((com.google.android.gms.internal.firebase-auth-api.zzanb) this.zzc.putIfAbsent(p3, v1_2));
            if (v3_2 != null) {
                return v3_2;
            }
        }
        return v1_2;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzanb zza(Object p1)
    {
        return this.zza(p1.getClass());
    }
}
