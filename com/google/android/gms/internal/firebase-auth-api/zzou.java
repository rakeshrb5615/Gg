package com.google.android.gms.internal.firebase-auth-api;
public final class zzou {
    private static final com.google.android.gms.internal.firebase-auth-api.zzou zza;
    private final java.util.Map zzb;

    static zzou()
    {
        com.google.android.gms.internal.firebase-auth-api.zzou.zza = new com.google.android.gms.internal.firebase-auth-api.zzou();
        return;
    }

    public zzou()
    {
        this.zzb = new java.util.HashMap();
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzou zza()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzou.zza;
    }

    public final declared_synchronized void zza(com.google.android.gms.internal.firebase-auth-api.zzot p2, Class p3)
    {
        java.util.Map v0_3 = ((com.google.android.gms.internal.firebase-auth-api.zzot) this.zzb.get(p3));
        if (v0_3 != null) {
            if (!v0_3.equals(p2)) {
                throw new java.security.GeneralSecurityException("Different key creator for parameters class already inserted");
            } else {
            }
        }
        this.zzb.put(p3, p2);
        return;
    }
}
