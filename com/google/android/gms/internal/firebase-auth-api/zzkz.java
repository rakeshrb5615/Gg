package com.google.android.gms.internal.firebase-auth-api;
public final class zzkz implements com.google.android.gms.internal.firebase-auth-api.zzpz {
    private static final com.google.android.gms.internal.firebase-auth-api.zzkz zza;
    private static final com.google.android.gms.internal.firebase-auth-api.zzps zzb;

    static zzkz()
    {
        com.google.android.gms.internal.firebase-auth-api.zzkz.zza = new com.google.android.gms.internal.firebase-auth-api.zzkz();
        com.google.android.gms.internal.firebase-auth-api.zzkz.zzb = com.google.android.gms.internal.firebase-auth-api.zzps.zza(new com.google.android.gms.internal.firebase-auth-api.zzky(), com.google.android.gms.internal.firebase-auth-api.zzof, com.google.android.gms.internal.firebase-auth-api.zzbd);
        return;
    }

    public zzkz()
    {
        return;
    }

    public static void zza(com.google.android.gms.internal.firebase-auth-api.zzpy p1)
    {
        p1.zza(com.google.android.gms.internal.firebase-auth-api.zzkz.zza);
        return;
    }

    public static void zzc()
    {
        com.google.android.gms.internal.firebase-auth-api.zzpa.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzkz.zza);
        com.google.android.gms.internal.firebase-auth-api.zzpa.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzkz.zzb);
        return;
    }

    public final Class zza()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzbd;
    }

    public final synthetic Object zza(com.google.android.gms.internal.firebase-auth-api.zzob p7, com.google.android.gms.internal.firebase-auth-api.zzok p8, com.google.android.gms.internal.firebase-auth-api.zzqc p9)
    {
        String v0_1 = new com.google.android.gms.internal.firebase-auth-api.zzpn();
        String v1_1 = 0;
        while (v1_1 < p7.zza()) {
            int v2_1 = p7.zza(v1_1);
            if (v2_1.zzc().equals(com.google.android.gms.internal.firebase-auth-api.zzbk.zza)) {
                com.google.android.gms.internal.firebase-auth-api.zzaaj v4_3;
                com.google.android.gms.internal.firebase-auth-api.zzbd v3_3 = ((com.google.android.gms.internal.firebase-auth-api.zzbd) p9.zza(v2_1));
                com.google.android.gms.internal.firebase-auth-api.zzaaj v4_1 = v2_1.zzb();
                if (!(v4_1 instanceof com.google.android.gms.internal.firebase-auth-api.zzlj)) {
                    if (!(v4_1 instanceof com.google.android.gms.internal.firebase-auth-api.zzof)) {
                        throw new java.security.GeneralSecurityException(g2.g.f("Cannot get output prefix for key of class ", v4_1.getClass().getName(), " with parameters ", String.valueOf(v4_1.zza())));
                    } else {
                        v4_3 = ((com.google.android.gms.internal.firebase-auth-api.zzof) v4_1).zzc();
                    }
                } else {
                    v4_3 = ((com.google.android.gms.internal.firebase-auth-api.zzlj) v4_1).zzh();
                }
                v0_1.zza(v4_3, new com.google.android.gms.internal.firebase-auth-api.zzlb(v3_3, v2_1.zza()));
            }
            v1_1++;
        }
        java.security.GeneralSecurityException v7_1;
        if (p8.zza()) {
            v7_1 = com.google.android.gms.internal.firebase-auth-api.zzon.zza;
        } else {
            v7_1 = com.google.android.gms.internal.firebase-auth-api.zzow.zzb().zza().zza(p7, p8, "hybrid_decrypt", "decrypt");
        }
        return new com.google.android.gms.internal.firebase-auth-api.zzla(v0_1.zza(), v7_1);
    }

    public final Class zzb()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzbd;
    }
}
