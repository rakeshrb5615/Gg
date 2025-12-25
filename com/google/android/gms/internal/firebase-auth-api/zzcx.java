package com.google.android.gms.internal.firebase-auth-api;
public final class zzcx implements com.google.android.gms.internal.firebase-auth-api.zzpz {
    private static final com.google.android.gms.internal.firebase-auth-api.zzcx zza;
    private static final com.google.android.gms.internal.firebase-auth-api.zzps zzb;

    static zzcx()
    {
        com.google.android.gms.internal.firebase-auth-api.zzcx.zza = new com.google.android.gms.internal.firebase-auth-api.zzcx();
        com.google.android.gms.internal.firebase-auth-api.zzcx.zzb = com.google.android.gms.internal.firebase-auth-api.zzps.zza(new com.google.android.gms.internal.firebase-auth-api.zzda(), com.google.android.gms.internal.firebase-auth-api.zzof, com.google.android.gms.internal.firebase-auth-api.zzba);
        return;
    }

    public zzcx()
    {
        return;
    }

    public static void zza(com.google.android.gms.internal.firebase-auth-api.zzpy p1)
    {
        p1.zza(com.google.android.gms.internal.firebase-auth-api.zzcx.zza);
        return;
    }

    public static void zzc()
    {
        com.google.android.gms.internal.firebase-auth-api.zzpa.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzcx.zza);
        com.google.android.gms.internal.firebase-auth-api.zzpa.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzcx.zzb);
        return;
    }

    public final Class zza()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzba;
    }

    public final synthetic Object zza(com.google.android.gms.internal.firebase-auth-api.zzob p10, com.google.android.gms.internal.firebase-auth-api.zzok p11, com.google.android.gms.internal.firebase-auth-api.zzqc p12)
    {
        String v0_1 = new com.google.android.gms.internal.firebase-auth-api.zzpn();
        String v1_2 = 0;
        while (v1_2 < p10.zza()) {
            int v2_3 = p10.zza(v1_2);
            if (v2_3.zzc().equals(com.google.android.gms.internal.firebase-auth-api.zzbk.zza)) {
                com.google.android.gms.internal.firebase-auth-api.zzaaj v3_7;
                com.google.android.gms.internal.firebase-auth-api.zzaaj v3_5 = v2_3.zzb();
                if (!(v3_5 instanceof com.google.android.gms.internal.firebase-auth-api.zzcw)) {
                    if (!(v3_5 instanceof com.google.android.gms.internal.firebase-auth-api.zzof)) {
                        throw new java.security.GeneralSecurityException(g2.g.f("Cannot get output prefix for key of class ", v3_5.getClass().getName(), " with parameters ", String.valueOf(v3_5.zza())));
                    } else {
                        v3_7 = ((com.google.android.gms.internal.firebase-auth-api.zzof) v3_5).zzc();
                    }
                } else {
                    v3_7 = ((com.google.android.gms.internal.firebase-auth-api.zzcw) v3_5).zzd();
                }
                v0_1.zza(v3_7, new com.google.android.gms.internal.firebase-auth-api.zzcz(((com.google.android.gms.internal.firebase-auth-api.zzba) p12.zza(v2_3)), v2_3.zza()));
            }
            v1_2++;
        }
        com.google.android.gms.internal.firebase-auth-api.zzoo v6;
        com.google.android.gms.internal.firebase-auth-api.zzoo v7;
        if (p11.zza()) {
            v6 = com.google.android.gms.internal.firebase-auth-api.zzon.zza;
            v7 = v6;
        } else {
            String v1_1 = com.google.android.gms.internal.firebase-auth-api.zzow.zzb().zza();
            v7 = v1_1.zza(p10, p11, "aead", "decrypt");
            v6 = v1_1.zza(p10, p11, "aead", "encrypt");
        }
        return new com.google.android.gms.internal.firebase-auth-api.zzdc(new com.google.android.gms.internal.firebase-auth-api.zzcz(((com.google.android.gms.internal.firebase-auth-api.zzba) p12.zza(p10.zzc())), p10.zzc().zza()), v0_1.zza(), v6, v7, 0);
    }

    public final Class zzb()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzba;
    }
}
