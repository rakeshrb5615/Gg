package com.google.android.gms.internal.firebase-auth-api;
final class zzdc implements com.google.android.gms.internal.firebase-auth-api.zzba {
    private final com.google.android.gms.internal.firebase-auth-api.zzcz zza;
    private final com.google.android.gms.internal.firebase-auth-api.zzpl zzb;
    private final com.google.android.gms.internal.firebase-auth-api.zzoo zzc;
    private final com.google.android.gms.internal.firebase-auth-api.zzoo zzd;

    private zzdc(com.google.android.gms.internal.firebase-auth-api.zzcz p1, com.google.android.gms.internal.firebase-auth-api.zzpl p2, com.google.android.gms.internal.firebase-auth-api.zzoo p3, com.google.android.gms.internal.firebase-auth-api.zzoo p4)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        this.zzd = p4;
        return;
    }

    public synthetic zzdc(com.google.android.gms.internal.firebase-auth-api.zzcz p1, com.google.android.gms.internal.firebase-auth-api.zzpl p2, com.google.android.gms.internal.firebase-auth-api.zzoo p3, com.google.android.gms.internal.firebase-auth-api.zzoo p4, com.google.android.gms.internal.firebase-auth-api.zzdb p5)
    {
        this(p1, p2, p3, p4);
        return;
    }

    public final byte[] zza(byte[] p7, byte[] p8)
    {
        java.util.Iterator v0_2 = this.zzb.zza(p7).iterator();
        while (v0_2.hasNext()) {
            int v1_1 = ((com.google.android.gms.internal.firebase-auth-api.zzcz) v0_2.next());
            byte[] v2_1 = v1_1.zza.zza(p7, p8);
            this.zzd.zza(v1_1.zzb, ((long) p7.length));
            return v2_1;
        }
        this.zzd.zza();
        throw new java.security.GeneralSecurityException("decryption failed");
    }

    public final byte[] zzb(byte[] p5, byte[] p6)
    {
        try {
            com.google.android.gms.internal.firebase-auth-api.zzoo v6_2 = this.zza.zza.zzb(p5, p6);
            this.zzc.zza(this.zza.zzb, ((long) p5.length));
            return v6_2;
        } catch (java.security.GeneralSecurityException v5_1) {
            this.zzc.zza();
            throw v5_1;
        }
    }
}
