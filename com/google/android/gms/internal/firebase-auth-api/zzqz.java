package com.google.android.gms.internal.firebase-auth-api;
public final class zzqz implements com.google.android.gms.internal.firebase-auth-api.zzpz {
    private static final com.google.android.gms.internal.firebase-auth-api.zzqz zza;

    static zzqz()
    {
        com.google.android.gms.internal.firebase-auth-api.zzqz.zza = new com.google.android.gms.internal.firebase-auth-api.zzqz();
        return;
    }

    private zzqz()
    {
        return;
    }

    public static void zzc()
    {
        com.google.android.gms.internal.firebase-auth-api.zzpa.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzqz.zza);
        return;
    }

    public final Class zza()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzqw;
    }

    public final synthetic Object zza(com.google.android.gms.internal.firebase-auth-api.zzob p6, com.google.android.gms.internal.firebase-auth-api.zzok p7, com.google.android.gms.internal.firebase-auth-api.zzqc p8)
    {
        String v7_0 = p6.zzc();
        if (v7_0 == null) {
            throw new java.security.GeneralSecurityException("no primary in primitive set");
        } else {
            String v0_3 = new com.google.android.gms.internal.firebase-auth-api.zzpn();
            String v1_1 = 0;
            while (v1_1 < p6.zza()) {
                com.google.android.gms.internal.firebase-auth-api.zzaaj v2_1 = p6.zza(v1_1);
                if (v2_1.zzc().equals(com.google.android.gms.internal.firebase-auth-api.zzbk.zza)) {
                    com.google.android.gms.internal.firebase-auth-api.zzaaj v2_4;
                    com.google.android.gms.internal.firebase-auth-api.zzqw v3_3 = ((com.google.android.gms.internal.firebase-auth-api.zzqw) p8.zza(v2_1));
                    com.google.android.gms.internal.firebase-auth-api.zzaaj v2_2 = v2_1.zzb();
                    if (!(v2_2 instanceof com.google.android.gms.internal.firebase-auth-api.zzrk)) {
                        if (!(v2_2 instanceof com.google.android.gms.internal.firebase-auth-api.zzof)) {
                            throw new java.security.GeneralSecurityException(g2.g.f("Cannot get output prefix for key of class ", v2_2.getClass().getName(), " with parameters ", String.valueOf(v2_2.zza())));
                        } else {
                            v2_4 = ((com.google.android.gms.internal.firebase-auth-api.zzof) v2_2).zzc();
                        }
                    } else {
                        v2_4 = ((com.google.android.gms.internal.firebase-auth-api.zzrk) v2_2).zze();
                    }
                    v0_3.zza(v2_4, v3_3);
                }
                v1_1++;
            }
            return new com.google.android.gms.internal.firebase-auth-api.zzqy(v0_3.zza(), ((com.google.android.gms.internal.firebase-auth-api.zzqw) p8.zza(v7_0)), 0);
        }
    }

    public final Class zzb()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzqw;
    }
}
