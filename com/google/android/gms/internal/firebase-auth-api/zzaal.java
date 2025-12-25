package com.google.android.gms.internal.firebase-auth-api;
public final class zzaal {
    private final com.google.android.gms.internal.firebase-auth-api.zzaaj zza;

    private zzaal(com.google.android.gms.internal.firebase-auth-api.zzaaj p1)
    {
        this.zza = p1;
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzaal zza(int p1)
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzaal(com.google.android.gms.internal.firebase-auth-api.zzaaj.zza(com.google.android.gms.internal.firebase-auth-api.zzqd.zza(p1)));
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzaal zza(byte[] p0, com.google.android.gms.internal.firebase-auth-api.zzch p1)
    {
        if (p1 == null) {
            throw new NullPointerException("SecretKeyAccess required");
        } else {
            return new com.google.android.gms.internal.firebase-auth-api.zzaal(com.google.android.gms.internal.firebase-auth-api.zzaaj.zza(p0));
        }
    }

    public final int zza()
    {
        return this.zza.zza();
    }

    public final byte[] zza(com.google.android.gms.internal.firebase-auth-api.zzch p2)
    {
        if (p2 == null) {
            throw new NullPointerException("SecretKeyAccess required");
        } else {
            return this.zza.zzb();
        }
    }
}
