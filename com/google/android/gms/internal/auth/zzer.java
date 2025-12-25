package com.google.android.gms.internal.auth;
final class zzer implements com.google.android.gms.internal.auth.zzfu {
    private static final com.google.android.gms.internal.auth.zzer zza;

    static zzer()
    {
        com.google.android.gms.internal.auth.zzer.zza = new com.google.android.gms.internal.auth.zzer();
        return;
    }

    private zzer()
    {
        return;
    }

    public static com.google.android.gms.internal.auth.zzer zza()
    {
        return com.google.android.gms.internal.auth.zzer.zza;
    }

    public final com.google.android.gms.internal.auth.zzft zzb(Class p4)
    {
        if (!com.google.android.gms.internal.auth.zzeu.isAssignableFrom(p4)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(p4.getName()));
        } else {
            try {
                return ((com.google.android.gms.internal.auth.zzft) com.google.android.gms.internal.auth.zzeu.zza(p4.asSubclass(com.google.android.gms.internal.auth.zzeu)).zzi(3, 0, 0));
            } catch (Exception v0_6) {
                throw new RuntimeException("Unable to get message info for ".concat(p4.getName()), v0_6);
            }
        }
    }

    public final boolean zzc(Class p2)
    {
        return com.google.android.gms.internal.auth.zzeu.isAssignableFrom(p2);
    }
}
