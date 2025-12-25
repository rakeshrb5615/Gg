package com.google.android.gms.internal.firebase-auth-api;
final class zzjn implements com.google.android.gms.internal.firebase-auth-api.zzbe {
    private final com.google.android.gms.internal.firebase-auth-api.zzpl zza;
    private final com.google.android.gms.internal.firebase-auth-api.zzoo zzb;

    public zzjn(com.google.android.gms.internal.firebase-auth-api.zzjo p1, com.google.android.gms.internal.firebase-auth-api.zzpl p2, com.google.android.gms.internal.firebase-auth-api.zzoo p3, com.google.android.gms.internal.firebase-auth-api.zzoo p4)
    {
        this.zza = p2;
        this.zzb = p4;
        return;
    }

    public final byte[] zza(byte[] p7, byte[] p8)
    {
        java.util.Iterator v0_2 = this.zza.zza(p7).iterator();
        while (v0_2.hasNext()) {
            int v1_1 = ((com.google.android.gms.internal.firebase-auth-api.zzjo) v0_2.next());
            byte[] v2_1 = v1_1.zza.zza(p7, p8);
            this.zzb.zza(v1_1.zzb, ((long) p7.length));
            return v2_1;
        }
        this.zzb.zza();
        throw new java.security.GeneralSecurityException("decryption failed");
    }
}
