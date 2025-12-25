package com.google.android.gms.common.signatureverification;
public final class zzd {
    private static com.google.android.gms.common.signatureverification.SignatureVerificationConfiguration zza;

    public static declared_synchronized void zza(com.google.android.gms.common.signatureverification.SignatureVerificationConfiguration p2)
    {
        try {
            if (com.google.android.gms.common.signatureverification.zzd.zza != null) {
                throw new IllegalStateException("Redundantly setting SignatureVerificationConfiguration");
            } else {
                com.google.android.gms.common.signatureverification.zzd.zza = p2;
                return;
            }
        } catch (IllegalStateException v2_3) {
            throw v2_3;
        }
    }

    public static synthetic com.google.android.gms.common.signatureverification.SignatureVerificationConfiguration zzb()
    {
        return com.google.android.gms.common.signatureverification.zzd.zzc();
    }

    private static declared_synchronized com.google.android.gms.common.signatureverification.SignatureVerificationConfiguration zzc()
    {
        if (com.google.android.gms.common.signatureverification.zzd.zza == null) {
            com.google.android.gms.common.signatureverification.zzd.zza(new com.google.android.gms.common.signatureverification.zzb());
        }
        return com.google.android.gms.common.signatureverification.zzd.zza;
    }
}
