package com.google.android.gms.common;
public class PackageVerificationResult {
    private final String zza;
    private final boolean zzb;
    private final String zzc;
    private final Throwable zzd;

    private PackageVerificationResult(String p1, int p2, boolean p3, String p4, Throwable p5, com.google.android.gms.common.signatureverification.zza p6)
    {
        this.zza = p1;
        this.zzb = p3;
        this.zzc = p4;
        this.zzd = p5;
        return;
    }

    public static com.google.android.gms.common.PackageVerificationResult zza(String p7, String p8, Throwable p9, com.google.android.gms.common.signatureverification.zza p10)
    {
        return new com.google.android.gms.common.PackageVerificationResult(p7, 1, 0, p8, p9, 0);
    }

    public static com.google.android.gms.common.PackageVerificationResult zzd(String p7, int p8, com.google.android.gms.common.signatureverification.zza p9)
    {
        return new com.google.android.gms.common.PackageVerificationResult(p7, p8, 1, 0, 0, 0);
    }

    public final boolean zzb()
    {
        return this.zzb;
    }

    public final void zzc()
    {
        if (this.zzb) {
            return;
        } else {
            SecurityException v1_2 = this.zzd;
            String v0_3 = "PackageVerificationRslt: ".concat(String.valueOf(this.zzc));
            if (v1_2 == null) {
                throw new SecurityException(v0_3);
            } else {
                throw new SecurityException(v0_3, v1_2);
            }
        }
    }
}
