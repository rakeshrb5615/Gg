package com.google.android.gms.internal.firebase-auth-api;
final class zzla implements com.google.android.gms.internal.firebase-auth-api.zzbd {
    private final com.google.android.gms.internal.firebase-auth-api.zzpl zza;
    private final com.google.android.gms.internal.firebase-auth-api.zzoo zzb;

    public zzla(com.google.android.gms.internal.firebase-auth-api.zzpl p1, com.google.android.gms.internal.firebase-auth-api.zzoo p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final byte[] zza(byte[] p7, byte[] p8)
    {
        java.util.Iterator v0_2 = this.zza.zza(p7).iterator();
        while (v0_2.hasNext()) {
            int v1_1 = ((com.google.android.gms.internal.firebase-auth-api.zzlb) v0_2.next());
            byte[] v2_1 = v1_1.zza.zza(p7, p8);
            this.zzb.zza(v1_1.zzb, ((long) p7.length));
            return v2_1;
        }
        this.zzb.zza();
        throw new java.security.GeneralSecurityException("decryption failed");
    }
}
