package com.google.android.gms.internal.firebase-auth-api;
public final class zzjm implements com.google.android.gms.internal.firebase-auth-api.zzpz {
    private static final com.google.android.gms.internal.firebase-auth-api.zzjm zza;
    private static final com.google.android.gms.internal.firebase-auth-api.zzps zzb;

    static zzjm()
    {
        com.google.android.gms.internal.firebase-auth-api.zzjm.zza = new com.google.android.gms.internal.firebase-auth-api.zzjm();
        com.google.android.gms.internal.firebase-auth-api.zzjm.zzb = com.google.android.gms.internal.firebase-auth-api.zzps.zza(new com.google.android.gms.internal.firebase-auth-api.zzjl(), com.google.android.gms.internal.firebase-auth-api.zzof, com.google.android.gms.internal.firebase-auth-api.zzbe);
        return;
    }

    public zzjm()
    {
        return;
    }

    public static void zzc()
    {
        com.google.android.gms.internal.firebase-auth-api.zzpa.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzjm.zza);
        com.google.android.gms.internal.firebase-auth-api.zzpa.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzjm.zzb);
        return;
    }

    public final Class zza()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzbe;
    }

    public final synthetic Object zza(com.google.android.gms.internal.firebase-auth-api.zzob p7, com.google.android.gms.internal.firebase-auth-api.zzok p8, com.google.android.gms.internal.firebase-auth-api.zzqc p9)
    {
        String v0_1 = new com.google.android.gms.internal.firebase-auth-api.zzpn();
        String v1_2 = 0;
        while (v1_2 < p7.zza()) {
            int v2_2 = p7.zza(v1_2);
            if (v2_2.zzc().equals(com.google.android.gms.internal.firebase-auth-api.zzbk.zza)) {
                com.google.android.gms.internal.firebase-auth-api.zzaaj v4_5;
                com.google.android.gms.internal.firebase-auth-api.zzjo v3_6 = ((com.google.android.gms.internal.firebase-auth-api.zzbe) p9.zza(v2_2));
                com.google.android.gms.internal.firebase-auth-api.zzaaj v4_3 = v2_2.zzb();
                if (!(v4_3 instanceof com.google.android.gms.internal.firebase-auth-api.zzjk)) {
                    if (!(v4_3 instanceof com.google.android.gms.internal.firebase-auth-api.zzof)) {
                        throw new java.security.GeneralSecurityException(g2.g.f("Cannot get output prefix for key of class ", v4_3.getClass().getName(), " with parameters ", String.valueOf(v4_3.zza())));
                    } else {
                        v4_5 = ((com.google.android.gms.internal.firebase-auth-api.zzof) v4_3).zzc();
                    }
                } else {
                    v4_5 = ((com.google.android.gms.internal.firebase-auth-api.zzjk) v4_3).zze();
                }
                v0_1.zza(v4_5, new com.google.android.gms.internal.firebase-auth-api.zzjo(v3_6, v2_2.zza()));
            }
            v1_2++;
        }
        String v8_1;
        int v2_1;
        if (p8.zza()) {
            v2_1 = com.google.android.gms.internal.firebase-auth-api.zzon.zza;
            v8_1 = v2_1;
        } else {
            String v1_1 = com.google.android.gms.internal.firebase-auth-api.zzow.zzb().zza();
            v2_1 = v1_1.zza(p7, p8, "daead", "encrypt");
            v8_1 = v1_1.zza(p7, p8, "daead", "decrypt");
        }
        return new com.google.android.gms.internal.firebase-auth-api.zzjn(new com.google.android.gms.internal.firebase-auth-api.zzjo(((com.google.android.gms.internal.firebase-auth-api.zzbe) p9.zza(p7.zzc())), p7.zzc().zza()), v0_1.zza(), v2_1, v8_1);
    }

    public final Class zzb()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzbe;
    }
}
