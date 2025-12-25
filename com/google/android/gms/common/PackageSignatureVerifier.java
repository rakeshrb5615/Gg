package com.google.android.gms.common;
public class PackageSignatureVerifier {
    static volatile com.google.android.gms.common.zzac zza;
    private static com.google.android.gms.common.zzad zzb;

    public PackageSignatureVerifier()
    {
        return;
    }

    private static declared_synchronized com.google.android.gms.common.zzad zza(android.content.Context p2)
    {
        if (com.google.android.gms.common.PackageSignatureVerifier.zzb == null) {
            com.google.android.gms.common.PackageSignatureVerifier.zzb = new com.google.android.gms.common.zzad(p2);
        }
        return com.google.android.gms.common.PackageSignatureVerifier.zzb;
    }

    public com.google.android.gms.common.PackageVerificationResult queryPackageSignatureVerified(android.content.Context p4, String p5)
    {
        String v0_0 = com.google.android.gms.common.GooglePlayServicesUtilLight.honorsDebugCertificates(p4);
        com.google.android.gms.common.PackageSignatureVerifier.zza(p4);
        String v1_3 = android.os.StrictMode.allowThreadDiskReads();
        try {
            com.google.android.gms.common.zzo.zzb();
            int v2_8 = com.google.android.gms.common.zzo.zzg.zzi();
            android.os.StrictMode.setThreadPolicy(v1_3);
        } catch (com.google.android.gms.common.PackageVerificationResult v4_1) {
            android.util.Log.e("GoogleCertificates", "Failed to get Google certificates from remote", v4_1);
            android.os.StrictMode.setThreadPolicy(v1_3);
            throw new com.google.android.gms.common.zzae();
        } catch (com.google.android.gms.common.PackageVerificationResult v4_1) {
        } catch (com.google.android.gms.common.PackageVerificationResult v4_2) {
            android.os.StrictMode.setThreadPolicy(v1_3);
            throw v4_2;
        }
        if (v2_8 == 0) {
        } else {
            int v2_1;
            com.google.android.gms.common.signatureverification.SignatureVerificationConfigurationProvider.zza().zza();
            String v1_1 = String.valueOf(p5);
            if (1 == v0_0) {
                v2_1 = "-1";
            } else {
                v2_1 = "-0";
            }
            String v1_2 = v1_1.concat(v2_1);
            if ((com.google.android.gms.common.PackageSignatureVerifier.zza == null) || (!com.google.android.gms.common.PackageSignatureVerifier.zza.zza().equals(v1_2))) {
                p5.getClass();
                com.google.android.gms.common.PackageSignatureVerifier.zza(p4);
                com.google.android.gms.common.PackageVerificationResult v4_6 = new com.google.android.gms.common.zzv(0);
                v4_6.zza(p5);
                v4_6.zzb(v0_0);
                v4_6.zzc(0);
                com.google.android.gms.common.PackageVerificationResult v4_8 = com.google.android.gms.common.zzo.zzc(v4_6.zzd());
                if (!v4_8.zza) {
                    String v0_4 = v4_8.zzb;
                    com.google.android.gms.common.internal.Preconditions.checkNotNull(v0_4);
                    return com.google.android.gms.common.PackageVerificationResult.zza(p5, v0_4, v4_8.zzc, 0);
                } else {
                    com.google.android.gms.common.PackageVerificationResult v4_12 = com.google.android.gms.common.PackageVerificationResult.zzd(p5, v4_8.zzd, 0);
                    com.google.android.gms.common.PackageSignatureVerifier.zza = new com.google.android.gms.common.zzac(v1_2, v4_12);
                    return v4_12;
                }
            } else {
                return com.google.android.gms.common.PackageSignatureVerifier.zza.zzb();
            }
        }
    }

    public com.google.android.gms.common.PackageVerificationResult queryPackageSignatureVerifiedWithRetry(android.content.Context p3, String p4)
    {
        try {
            SecurityException v0_0 = this.queryPackageSignatureVerified(p3, p4);
            v0_0.zzc();
            return v0_0;
        } catch (SecurityException v0_1) {
            com.google.android.gms.common.PackageVerificationResult v3_1 = this.queryPackageSignatureVerified(p3, p4);
            if (v3_1.zzb()) {
                android.util.Log.e("PkgSignatureVerifier", "Got flaky result during package signature verification", v0_1);
            }
            return v3_1;
        }
    }
}
