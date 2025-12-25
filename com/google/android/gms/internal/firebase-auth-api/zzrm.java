package com.google.android.gms.internal.firebase-auth-api;
public final class zzrm implements com.google.android.gms.internal.firebase-auth-api.zzpz {
    private static final com.google.android.gms.internal.firebase-auth-api.zzrm zza;
    private static final com.google.android.gms.internal.firebase-auth-api.zzps zzb;

    static zzrm()
    {
        com.google.android.gms.internal.firebase-auth-api.zzrm.zza = new com.google.android.gms.internal.firebase-auth-api.zzrm();
        com.google.android.gms.internal.firebase-auth-api.zzrm.zzb = com.google.android.gms.internal.firebase-auth-api.zzps.zza(new com.google.android.gms.internal.firebase-auth-api.zzrp(), com.google.android.gms.internal.firebase-auth-api.zzof, com.google.android.gms.internal.firebase-auth-api.zzcc);
        return;
    }

    public zzrm()
    {
        return;
    }

    public static void zzc()
    {
        com.google.android.gms.internal.firebase-auth-api.zzpa.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzrm.zza);
        com.google.android.gms.internal.firebase-auth-api.zzpa.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzrm.zzb);
        return;
    }

    public final Class zza()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzcc;
    }

    public final synthetic Object zza(com.google.android.gms.internal.firebase-auth-api.zzob p10, com.google.android.gms.internal.firebase-auth-api.zzok p11, com.google.android.gms.internal.firebase-auth-api.zzqc p12)
    {
        String v0_1 = new com.google.android.gms.internal.firebase-auth-api.zzpn();
        String v1_2 = 0;
        while (v1_2 < p10.zza()) {
            int v2_3 = p10.zza(v1_2);
            if (v2_3.zzc().equals(com.google.android.gms.internal.firebase-auth-api.zzbk.zza)) {
                com.google.android.gms.internal.firebase-auth-api.zzaaj v4_6;
                com.google.android.gms.internal.firebase-auth-api.zzrr v3_6 = ((com.google.android.gms.internal.firebase-auth-api.zzcc) p12.zza(v2_3));
                com.google.android.gms.internal.firebase-auth-api.zzaaj v4_4 = v2_3.zzb();
                if (!(v4_4 instanceof com.google.android.gms.internal.firebase-auth-api.zzrk)) {
                    if (!(v4_4 instanceof com.google.android.gms.internal.firebase-auth-api.zzof)) {
                        throw new java.security.GeneralSecurityException(g2.g.f("Cannot get output prefix for key of class ", v4_4.getClass().getName(), " with parameters ", String.valueOf(v4_4.zza())));
                    } else {
                        v4_6 = ((com.google.android.gms.internal.firebase-auth-api.zzof) v4_4).zzc();
                    }
                } else {
                    v4_6 = ((com.google.android.gms.internal.firebase-auth-api.zzrk) v4_4).zze();
                }
                v0_1.zza(v4_6, new com.google.android.gms.internal.firebase-auth-api.zzro(v3_6, v2_3.zza()));
            }
            v1_2++;
        }
        com.google.android.gms.internal.firebase-auth-api.zzoo v7;
        com.google.android.gms.internal.firebase-auth-api.zzoo v6;
        if (p11.zza()) {
            v6 = com.google.android.gms.internal.firebase-auth-api.zzon.zza;
            v7 = v6;
        } else {
            String v1_1 = com.google.android.gms.internal.firebase-auth-api.zzow.zzb().zza();
            v7 = v1_1.zza(p10, p11, "mac", "verify");
            v6 = v1_1.zza(p10, p11, "mac", "compute");
        }
        return new com.google.android.gms.internal.firebase-auth-api.zzrr(new com.google.android.gms.internal.firebase-auth-api.zzro(((com.google.android.gms.internal.firebase-auth-api.zzcc) p12.zza(p10.zzc())), p10.zzc().zza()), v0_1.zza(), v6, v7, 0);
    }

    public final Class zzb()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzcc;
    }
}
