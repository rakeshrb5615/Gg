package com.google.android.gms.internal.firebase-auth-api;
public final class zzkg extends com.google.android.gms.internal.firebase-auth-api.zzlg {
    private final com.google.android.gms.internal.firebase-auth-api.zzkg$zzf zza;
    private final com.google.android.gms.internal.firebase-auth-api.zzkg$zzc zzb;
    private final com.google.android.gms.internal.firebase-auth-api.zzkg$zzb zzc;
    private final com.google.android.gms.internal.firebase-auth-api.zzkg$zze zzd;

    private zzkg(com.google.android.gms.internal.firebase-auth-api.zzkg$zzf p1, com.google.android.gms.internal.firebase-auth-api.zzkg$zzc p2, com.google.android.gms.internal.firebase-auth-api.zzkg$zzb p3, com.google.android.gms.internal.firebase-auth-api.zzkg$zze p4)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        this.zzd = p4;
        return;
    }

    public synthetic zzkg(com.google.android.gms.internal.firebase-auth-api.zzkg$zzf p1, com.google.android.gms.internal.firebase-auth-api.zzkg$zzc p2, com.google.android.gms.internal.firebase-auth-api.zzkg$zzb p3, com.google.android.gms.internal.firebase-auth-api.zzkg$zze p4, com.google.android.gms.internal.firebase-auth-api.zzkj p5)
    {
        this(p1, p2, p3, p4);
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzkg$zzd zzc()
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzkg$zzd(0);
    }

    public final boolean equals(Object p4)
    {
        if ((p4 instanceof com.google.android.gms.internal.firebase-auth-api.zzkg)) {
            if ((this.zza != ((com.google.android.gms.internal.firebase-auth-api.zzkg) p4).zza) || ((this.zzb != ((com.google.android.gms.internal.firebase-auth-api.zzkg) p4).zzb) || ((this.zzc != ((com.google.android.gms.internal.firebase-auth-api.zzkg) p4).zzc) || (this.zzd != ((com.google.android.gms.internal.firebase-auth-api.zzkg) p4).zzd)))) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public final int hashCode()
    {
        return java.util.Objects.hash(new Object[] {com.google.android.gms.internal.firebase-auth-api.zzkg, this.zza, this.zzb, this.zzc, this.zzd}));
    }

    public final String toString()
    {
        String v0_2 = String.valueOf(this.zzd);
        String v1_3 = String.valueOf(this.zza);
        String v2_1 = String.valueOf(this.zzb);
        String v3_0 = String.valueOf(this.zzc);
        String v0_1 = v1.a.r("HPKE Parameters (Variant: ", v0_2, ", KemId: ", v1_3, ", KdfId: ");
        v0_1.append(v2_1);
        v0_1.append(", AeadId: ");
        v0_1.append(v3_0);
        v0_1.append(")");
        return v0_1.toString();
    }

    public final boolean zza()
    {
        if (this.zzd == com.google.android.gms.internal.firebase-auth-api.zzkg$zze.zzc) {
            return 0;
        } else {
            return 1;
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzkg$zzb zzb()
    {
        return this.zzc;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzkg$zzc zzd()
    {
        return this.zzb;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzkg$zzf zze()
    {
        return this.zza;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzkg$zze zzf()
    {
        return this.zzd;
    }
}
