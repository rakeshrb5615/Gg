package com.google.android.gms.internal.firebase-auth-api;
final class zzalg implements com.google.android.gms.internal.firebase-auth-api.zzamj {
    private static final com.google.android.gms.internal.firebase-auth-api.zzalg zza;

    static zzalg()
    {
        com.google.android.gms.internal.firebase-auth-api.zzalg.zza = new com.google.android.gms.internal.firebase-auth-api.zzalg();
        return;
    }

    private zzalg()
    {
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzalg zza()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzalg.zza;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzamk zza(Class p4)
    {
        if (!com.google.android.gms.internal.firebase-auth-api.zzalf.isAssignableFrom(p4)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(p4.getName()));
        } else {
            try {
                return ((com.google.android.gms.internal.firebase-auth-api.zzamk) com.google.android.gms.internal.firebase-auth-api.zzalf.zza(p4.asSubclass(com.google.android.gms.internal.firebase-auth-api.zzalf)).zza(com.google.android.gms.internal.firebase-auth-api.zzalf$zze.zzc, 0, 0));
            } catch (Exception v0_6) {
                throw new RuntimeException("Unable to get message info for ".concat(p4.getName()), v0_6);
            }
        }
    }

    public final boolean zzb(Class p2)
    {
        return com.google.android.gms.internal.firebase-auth-api.zzalf.isAssignableFrom(p2);
    }
}
