package com.google.android.gms.internal.firebase-auth-api;
public final class zzop {
    private static final com.google.android.gms.internal.firebase-auth-api.zzor zza;
    private static final com.google.android.gms.internal.firebase-auth-api.zzop zzb;
    private final java.util.Map zzc;

    static zzop()
    {
        com.google.android.gms.internal.firebase-auth-api.zzop.zza = new com.google.android.gms.internal.firebase-auth-api.zzos();
        com.google.android.gms.internal.firebase-auth-api.zzop.zzb = com.google.android.gms.internal.firebase-auth-api.zzop.zzb();
        return;
    }

    public zzop()
    {
        this.zzc = new java.util.HashMap();
        return;
    }

    public static synthetic com.google.android.gms.internal.firebase-auth-api.zzof zza(com.google.android.gms.internal.firebase-auth-api.zzoi p3, Integer p4)
    {
        java.security.GeneralSecurityException v3_4 = p3.zzb().zza();
        com.google.android.gms.internal.firebase-auth-api.zzch v0_4 = com.google.android.gms.internal.firebase-auth-api.zznq.zza().zza(v3_4.zzf());
        if (!com.google.android.gms.internal.firebase-auth-api.zznq.zza().zzb(v3_4.zzf())) {
            throw new java.security.GeneralSecurityException("Creating new keys is not allowed.");
        } else {
            com.google.android.gms.internal.firebase-auth-api.zzch v0_0 = v0_4.zza(v3_4.zze());
            return new com.google.android.gms.internal.firebase-auth-api.zzof(com.google.android.gms.internal.firebase-auth-api.zzqb.zza(v0_0.zzf(), v0_0.zze(), v0_0.zzb(), v3_4.zzd(), p4), com.google.android.gms.internal.firebase-auth-api.zzbf.zza());
        }
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzop zza()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzop.zzb;
    }

    private final declared_synchronized com.google.android.gms.internal.firebase-auth-api.zzbi zzb(com.google.android.gms.internal.firebase-auth-api.zzcb p3, Integer p4)
    {
        try {
            StringBuilder v0_4 = ((com.google.android.gms.internal.firebase-auth-api.zzor) this.zzc.get(p3.getClass()));
        } catch (String v3_3) {
            throw v3_3;
        }
        if (v0_4 == null) {
            String v3_5 = String.valueOf(p3);
            StringBuilder v0_2 = new StringBuilder("Cannot create a new key for parameters ");
            v0_2.append(v3_5);
            v0_2.append(": no key creator for this class was registered.");
            throw new java.security.GeneralSecurityException(v0_2.toString());
        } else {
            return v0_4.zza(p3, p4);
        }
    }

    private static com.google.android.gms.internal.firebase-auth-api.zzop zzb()
    {
        java.security.GeneralSecurityException v0_1 = new com.google.android.gms.internal.firebase-auth-api.zzop();
        try {
            v0_1.zza(com.google.android.gms.internal.firebase-auth-api.zzop.zza, com.google.android.gms.internal.firebase-auth-api.zzoi);
            return v0_1;
        } catch (java.security.GeneralSecurityException v0_2) {
            throw new IllegalStateException("unexpected error.", v0_2);
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzbi zza(com.google.android.gms.internal.firebase-auth-api.zzcb p1, Integer p2)
    {
        return this.zzb(p1, p2);
    }

    public final declared_synchronized void zza(com.google.android.gms.internal.firebase-auth-api.zzor p3, Class p4)
    {
        StringBuilder v0_5 = ((com.google.android.gms.internal.firebase-auth-api.zzor) this.zzc.get(p4));
        if (v0_5 != null) {
            if (!v0_5.equals(p3)) {
                String v4_1 = String.valueOf(p4);
                StringBuilder v0_2 = new StringBuilder("Different key creator for parameters class ");
                v0_2.append(v4_1);
                v0_2.append(" already inserted");
                throw new java.security.GeneralSecurityException(v0_2.toString());
            } else {
            }
        }
        this.zzc.put(p4, p3);
        return;
    }
}
