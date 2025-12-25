package com.google.android.gms.internal.firebase-auth-api;
public final class zzso extends com.google.android.gms.internal.firebase-auth-api.zzst {
    private final com.google.android.gms.internal.firebase-auth-api.zzsr zza;
    private final com.google.android.gms.internal.firebase-auth-api.zzaal zzb;

    private zzso(com.google.android.gms.internal.firebase-auth-api.zzsr p1, com.google.android.gms.internal.firebase-auth-api.zzaal p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzso zza(com.google.android.gms.internal.firebase-auth-api.zzsr p2, com.google.android.gms.internal.firebase-auth-api.zzaal p3)
    {
        if (p2.zzb() != p3.zza()) {
            throw new java.security.GeneralSecurityException("Key size mismatch");
        } else {
            return new com.google.android.gms.internal.firebase-auth-api.zzso(p2, p3);
        }
    }

    public final synthetic com.google.android.gms.internal.firebase-auth-api.zzcb zza()
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzsr) this.zzc());
    }

    public final Integer zzb()
    {
        return 0;
    }

    public final synthetic com.google.android.gms.internal.firebase-auth-api.zzss zzc()
    {
        return this.zza;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzaal zzd()
    {
        return this.zzb;
    }
}
