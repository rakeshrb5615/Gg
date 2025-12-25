package com.google.android.gms.internal.firebase-auth-api;
final class zzmu implements com.google.android.gms.internal.firebase-auth-api.zzmf {
    private final com.google.android.gms.internal.firebase-auth-api.zzlz zza;
    private final com.google.android.gms.internal.firebase-auth-api.zzmt zzb;

    public zzmu(com.google.android.gms.internal.firebase-auth-api.zzlz p2)
    {
        this.zza = p2;
        try {
            com.google.android.gms.internal.firebase-auth-api.zzmx v2_1 = com.google.android.gms.internal.firebase-auth-api.zzmv.zzb();
        } catch (java.security.GeneralSecurityException) {
            v2_1 = new com.google.android.gms.internal.firebase-auth-api.zzmx(0);
        }
        this.zzb = v2_1;
        return;
    }

    public final byte[] zza()
    {
        if (!java.util.Arrays.equals(this.zza.zzb(), com.google.android.gms.internal.firebase-auth-api.zzmk.zzf)) {
            throw new java.security.GeneralSecurityException("Could not determine HPKE KEM ID");
        } else {
            return com.google.android.gms.internal.firebase-auth-api.zzmk.zzb;
        }
    }

    public final byte[] zza(byte[] p11, com.google.android.gms.internal.firebase-auth-api.zzme p12)
    {
        com.google.android.gms.internal.firebase-auth-api.zzlz v2 = this.zza;
        return v2.zza(0, this.zzb.zza(p12.zza().zzb(), p11), "eae_prk", com.google.android.gms.internal.firebase-auth-api.zzyz.zza(new byte[][] {p11, p12.zzb().zzb()})), "shared_secret", com.google.android.gms.internal.firebase-auth-api.zzmk.zza(com.google.android.gms.internal.firebase-auth-api.zzmk.zzb), v2.zza());
    }
}
