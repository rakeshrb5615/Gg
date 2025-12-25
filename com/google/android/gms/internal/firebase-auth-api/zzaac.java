package com.google.android.gms.internal.firebase-auth-api;
final class zzaac implements com.google.android.gms.internal.firebase-auth-api.zzsq {
    private final com.google.android.gms.internal.firebase-auth-api.zzsq zza;
    private final com.google.android.gms.internal.firebase-auth-api.zzsq zzb;

    private zzaac(com.google.android.gms.internal.firebase-auth-api.zzsq p1, com.google.android.gms.internal.firebase-auth-api.zzsq p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public synthetic zzaac(com.google.android.gms.internal.firebase-auth-api.zzsq p1, com.google.android.gms.internal.firebase-auth-api.zzsq p2, com.google.android.gms.internal.firebase-auth-api.zzaab p3)
    {
        this(p1, p2);
        return;
    }

    public final byte[] zza(byte[] p3, int p4)
    {
        if (p3.length > 64) {
            return this.zzb.zza(p3, p4);
        } else {
            return this.zza.zza(p3, p4);
        }
    }
}
