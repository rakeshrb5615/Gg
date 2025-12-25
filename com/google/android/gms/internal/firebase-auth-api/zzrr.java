package com.google.android.gms.internal.firebase-auth-api;
final class zzrr implements com.google.android.gms.internal.firebase-auth-api.zzcc {
    private final com.google.android.gms.internal.firebase-auth-api.zzro zza;
    private final com.google.android.gms.internal.firebase-auth-api.zzpl zzb;
    private final com.google.android.gms.internal.firebase-auth-api.zzoo zzc;
    private final com.google.android.gms.internal.firebase-auth-api.zzoo zzd;

    private zzrr(com.google.android.gms.internal.firebase-auth-api.zzro p1, com.google.android.gms.internal.firebase-auth-api.zzpl p2, com.google.android.gms.internal.firebase-auth-api.zzoo p3, com.google.android.gms.internal.firebase-auth-api.zzoo p4)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        this.zzd = p4;
        return;
    }

    public synthetic zzrr(com.google.android.gms.internal.firebase-auth-api.zzro p1, com.google.android.gms.internal.firebase-auth-api.zzpl p2, com.google.android.gms.internal.firebase-auth-api.zzoo p3, com.google.android.gms.internal.firebase-auth-api.zzoo p4, com.google.android.gms.internal.firebase-auth-api.zzrq p5)
    {
        this(p1, p2, p3, p4);
        return;
    }

    public final void zza(byte[] p6, byte[] p7)
    {
        java.util.Iterator v0_2 = this.zzb.zza(p6).iterator();
        while (v0_2.hasNext()) {
            int v1_1 = ((com.google.android.gms.internal.firebase-auth-api.zzro) v0_2.next());
            v1_1.zza.zza(p6, p7);
            this.zzd.zza(v1_1.zzb, ((long) p7.length));
            return;
        }
        this.zzd.zza();
        throw new java.security.GeneralSecurityException("invalid MAC");
    }

    public final byte[] zza(byte[] p6)
    {
        try {
            com.google.android.gms.internal.firebase-auth-api.zzoo v0_3 = this.zza.zza.zza(p6);
            this.zzc.zza(this.zza.zzb, ((long) p6.length));
            return v0_3;
        } catch (java.security.GeneralSecurityException v6_1) {
            this.zzc.zza();
            throw v6_1;
        }
    }
}
