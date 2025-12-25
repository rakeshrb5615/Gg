package com.google.android.gms.internal.firebase-auth-api;
public final class zzok {
    public static final com.google.android.gms.internal.firebase-auth-api.zzok zza;
    private final java.util.Map zzb;

    static zzok()
    {
        com.google.android.gms.internal.firebase-auth-api.zzok.zza = new com.google.android.gms.internal.firebase-auth-api.zzoj().zza();
        return;
    }

    private zzok(java.util.Map p1)
    {
        this.zzb = p1;
        return;
    }

    public synthetic zzok(java.util.Map p1, com.google.android.gms.internal.firebase-auth-api.zzom p2)
    {
        this(p1);
        return;
    }

    public final boolean equals(Object p2)
    {
        if ((p2 instanceof com.google.android.gms.internal.firebase-auth-api.zzok)) {
            return this.zzb.equals(((com.google.android.gms.internal.firebase-auth-api.zzok) p2).zzb);
        } else {
            return 0;
        }
    }

    public final int hashCode()
    {
        return this.zzb.hashCode();
    }

    public final String toString()
    {
        return this.zzb.toString();
    }

    public final boolean zza()
    {
        return this.zzb.isEmpty();
    }
}
