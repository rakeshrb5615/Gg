package com.google.android.gms.internal.firebase-auth-api;
final class zzoc extends com.google.android.gms.internal.firebase-auth-api.zzod implements com.google.android.gms.internal.firebase-auth-api.zzcd {

    public zzoc(String p2, Class p3, com.google.android.gms.internal.firebase-auth-api.zzamv p4)
    {
        super(p2, p3, com.google.android.gms.internal.firebase-auth-api.zzwx$zzb.zzc, p4);
        return;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzwx zzc(com.google.android.gms.internal.firebase-auth-api.zzajv p5)
    {
        java.security.GeneralSecurityException v5_1 = com.google.android.gms.internal.firebase-auth-api.zzoz.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzqb.zza(this.zza, p5, this.zzb, com.google.android.gms.internal.firebase-auth-api.zzxz.zzd, 0), com.google.android.gms.internal.firebase-auth-api.zzbf.zza());
        if (!(v5_1 instanceof com.google.android.gms.internal.firebase-auth-api.zzce)) {
            throw new java.security.GeneralSecurityException("Key not private key");
        } else {
            java.security.GeneralSecurityException v5_7 = ((com.google.android.gms.internal.firebase-auth-api.zzqb) com.google.android.gms.internal.firebase-auth-api.zzoz.zza().zza(((com.google.android.gms.internal.firebase-auth-api.zzce) v5_1).zzc(), com.google.android.gms.internal.firebase-auth-api.zzqb, com.google.android.gms.internal.firebase-auth-api.zzbf.zza()));
            return ((com.google.android.gms.internal.firebase-auth-api.zzwx) ((com.google.android.gms.internal.firebase-auth-api.zzalf) com.google.android.gms.internal.firebase-auth-api.zzwx.zza().zza(v5_7.zzf()).zza(v5_7.zzd()).zza(v5_7.zza()).zze()));
        }
    }
}
