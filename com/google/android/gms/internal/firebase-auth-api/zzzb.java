package com.google.android.gms.internal.firebase-auth-api;
public final class zzzb implements com.google.android.gms.internal.firebase-auth-api.zzbd {
    private final java.security.interfaces.ECPrivateKey zza;
    private final com.google.android.gms.internal.firebase-auth-api.zzzd zzb;
    private final String zzc;
    private final byte[] zzd;
    private final com.google.android.gms.internal.firebase-auth-api.zzzh zze;
    private final com.google.android.gms.internal.firebase-auth-api.zzlr zzf;
    private final byte[] zzg;

    private zzzb(java.security.interfaces.ECPrivateKey p2, byte[] p3, String p4, com.google.android.gms.internal.firebase-auth-api.zzzh p5, com.google.android.gms.internal.firebase-auth-api.zzlr p6, byte[] p7)
    {
        this.zza = p2;
        this.zzb = new com.google.android.gms.internal.firebase-auth-api.zzzd(p2);
        this.zzd = p3;
        this.zzc = p4;
        this.zze = p5;
        this.zzf = p6;
        this.zzg = p7;
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzbd zza(com.google.android.gms.internal.firebase-auth-api.zzke p9)
    {
        java.security.interfaces.ECPrivateKey v3 = com.google.android.gms.internal.firebase-auth-api.zzzf.zza(((com.google.android.gms.internal.firebase-auth-api.zzzi) com.google.android.gms.internal.firebase-auth-api.zzze.zza.zza(((com.google.android.gms.internal.firebase-auth-api.zzkb) ((com.google.android.gms.internal.firebase-auth-api.zzlg) p9.zza())).zzd())), com.google.android.gms.internal.firebase-auth-api.zzne.zza(p9.zzf().zza(com.google.android.gms.internal.firebase-auth-api.zzbf.zza())));
        com.google.android.gms.internal.firebase-auth-api.zzkb v0_2 = new byte[0];
        if (((com.google.android.gms.internal.firebase-auth-api.zzkb) ((com.google.android.gms.internal.firebase-auth-api.zzlg) p9.zza())).zzh() != null) {
            v0_2 = ((com.google.android.gms.internal.firebase-auth-api.zzkb) ((com.google.android.gms.internal.firebase-auth-api.zzlg) p9.zza())).zzh().zzb();
        }
        return new com.google.android.gms.internal.firebase-auth-api.zzzb(v3, v0_2, com.google.android.gms.internal.firebase-auth-api.zzze.zza(((com.google.android.gms.internal.firebase-auth-api.zzkb) ((com.google.android.gms.internal.firebase-auth-api.zzlg) p9.zza())).zze()), ((com.google.android.gms.internal.firebase-auth-api.zzzh) com.google.android.gms.internal.firebase-auth-api.zzze.zzb.zza(((com.google.android.gms.internal.firebase-auth-api.zzkb) ((com.google.android.gms.internal.firebase-auth-api.zzlg) p9.zza())).zzf())), com.google.android.gms.internal.firebase-auth-api.zzln.zza(((com.google.android.gms.internal.firebase-auth-api.zzkb) ((com.google.android.gms.internal.firebase-auth-api.zzlg) p9.zza()))), p9.zzh().zzb());
    }

    public final byte[] zza(byte[] p11, byte[] p12)
    {
        if (!com.google.android.gms.internal.firebase-auth-api.zzqn.zza(this.zzg, p11)) {
            throw new java.security.GeneralSecurityException("Invalid ciphertext (output prefix mismatch)");
        } else {
            int v1_4;
            com.google.android.gms.internal.firebase-auth-api.zzlr v0_5 = this.zzg.length;
            int v2_0 = this.zze;
            int v1_3 = com.google.android.gms.internal.firebase-auth-api.zzzf.zza(this.zza.getParams().getCurve());
            int v2_1 = v2_0.ordinal();
            if (v2_1 == 0) {
                v1_3 *= 2;
                v1_4 = (v1_3 + 1);
            } else {
                if (v2_1 == 1) {
                } else {
                    if (v2_1 != 2) {
                        throw new java.security.GeneralSecurityException("unknown EC point format");
                    } else {
                        v1_4 = (v1_3 * 2);
                    }
                }
            }
            int v1_5 = (v1_4 + v0_5);
            if (p11.length < v1_5) {
                throw new java.security.GeneralSecurityException("ciphertext too short");
            } else {
                return this.zzf.zza(this.zzb.zza(java.util.Arrays.copyOfRange(p11, v0_5, v1_5), this.zzc, this.zzd, p12, this.zzf.zza(), this.zze), p11, v1_5);
            }
        }
    }
}
