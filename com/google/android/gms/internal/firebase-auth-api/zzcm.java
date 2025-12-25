package com.google.android.gms.internal.firebase-auth-api;
final class zzcm {

    static zzcm()
    {
        java.nio.charset.Charset.forName("UTF-8");
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzxk zza(com.google.android.gms.internal.firebase-auth-api.zzxh p4)
    {
        com.google.android.gms.internal.firebase-auth-api.zzxk$zza v0_1 = com.google.android.gms.internal.firebase-auth-api.zzxk.zza().zza(p4.zzb());
        com.google.android.gms.internal.firebase-auth-api.zzxk v4_5 = p4.zze().iterator();
        while (v4_5.hasNext()) {
            com.google.android.gms.internal.firebase-auth-api.zzxk$zzb v1_2 = ((com.google.android.gms.internal.firebase-auth-api.zzxh$zzb) v4_5.next());
            v0_1.zza(((com.google.android.gms.internal.firebase-auth-api.zzxk$zzb) ((com.google.android.gms.internal.firebase-auth-api.zzalf) com.google.android.gms.internal.firebase-auth-api.zzxk$zzb.zza().zza(v1_2.zzb().zzf()).zza(v1_2.zzc()).zza(v1_2.zzf()).zza(v1_2.zza()).zze())));
        }
        return ((com.google.android.gms.internal.firebase-auth-api.zzxk) ((com.google.android.gms.internal.firebase-auth-api.zzalf) v0_1.zze()));
    }

    public static void zzb(com.google.android.gms.internal.firebase-auth-api.zzxh p9)
    {
        String v0_0 = p9.zzb();
        java.security.GeneralSecurityException v9_8 = p9.zze().iterator();
        int v3 = 0;
        int v4 = 0;
        String v5 = 1;
        while (v9_8.hasNext()) {
            com.google.android.gms.internal.firebase-auth-api.zzwx$zzb v6_2 = ((com.google.android.gms.internal.firebase-auth-api.zzxh$zzb) v9_8.next());
            if (v6_2.zzc() == com.google.android.gms.internal.firebase-auth-api.zzxc.zzb) {
                if (!v6_2.zzg()) {
                    throw new java.security.GeneralSecurityException(String.format("key %d has no key data", new Object[] {Integer.valueOf(v6_2.zza())})));
                } else {
                    if (v6_2.zzf() == com.google.android.gms.internal.firebase-auth-api.zzxz.zza) {
                        throw new java.security.GeneralSecurityException(String.format("key %d has unknown prefix", new Object[] {Integer.valueOf(v6_2.zza())})));
                    } else {
                        if (v6_2.zzc() == com.google.android.gms.internal.firebase-auth-api.zzxc.zza) {
                            throw new java.security.GeneralSecurityException(String.format("key %d has unknown status", new Object[] {Integer.valueOf(v6_2.zza())})));
                        } else {
                            if (v6_2.zza() == v0_0) {
                                if (v4 != 0) {
                                    throw new java.security.GeneralSecurityException("keyset contains multiple primary keys");
                                } else {
                                    v4 = 1;
                                }
                            }
                            if (v6_2.zzb().zzb() != com.google.android.gms.internal.firebase-auth-api.zzwx$zzb.zzd) {
                                v5 = 0;
                            }
                            v3++;
                        }
                    }
                }
            }
        }
        if (v3 == 0) {
            throw new java.security.GeneralSecurityException("keyset must contain at least one ENABLED key");
        } else {
            if ((v4 == 0) && (v5 == null)) {
                throw new java.security.GeneralSecurityException("keyset doesn\'t contain a valid primary key");
            } else {
                return;
            }
        }
    }
}
