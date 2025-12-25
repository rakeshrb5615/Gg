package com.google.android.gms.internal.firebase-auth-api;
public final class zzdi extends com.google.android.gms.internal.firebase-auth-api.zzcy {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final com.google.android.gms.internal.firebase-auth-api.zzdi$zzc zze;
    private final com.google.android.gms.internal.firebase-auth-api.zzdi$zza zzf;

    private zzdi(int p1, int p2, int p3, int p4, com.google.android.gms.internal.firebase-auth-api.zzdi$zzc p5, com.google.android.gms.internal.firebase-auth-api.zzdi$zza p6)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        this.zzd = p4;
        this.zze = p5;
        this.zzf = p6;
        return;
    }

    public synthetic zzdi(int p1, int p2, int p3, int p4, com.google.android.gms.internal.firebase-auth-api.zzdi$zzc p5, com.google.android.gms.internal.firebase-auth-api.zzdi$zza p6, com.google.android.gms.internal.firebase-auth-api.zzdk p7)
    {
        this(p1, p2, p3, p4, p5, p6);
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzdi$zzb zzf()
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzdi$zzb(0);
    }

    public final boolean equals(Object p4)
    {
        if ((p4 instanceof com.google.android.gms.internal.firebase-auth-api.zzdi)) {
            if ((((com.google.android.gms.internal.firebase-auth-api.zzdi) p4).zza != this.zza) || ((((com.google.android.gms.internal.firebase-auth-api.zzdi) p4).zzb != this.zzb) || ((((com.google.android.gms.internal.firebase-auth-api.zzdi) p4).zzc != this.zzc) || ((((com.google.android.gms.internal.firebase-auth-api.zzdi) p4).zzd != this.zzd) || ((((com.google.android.gms.internal.firebase-auth-api.zzdi) p4).zze != this.zze) || (((com.google.android.gms.internal.firebase-auth-api.zzdi) p4).zzf != this.zzf)))))) {
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
        Integer.valueOf(this.zza);
        Integer.valueOf(this.zzb);
        Integer.valueOf(this.zzc);
        Integer.valueOf(this.zzd);
        com.google.android.gms.internal.firebase-auth-api.zzdi$zzc v6 = this.zze;
        return java.util.Objects.hash(new Object[] {com.google.android.gms.internal.firebase-auth-api.zzdi, this.zzf}));
    }

    public final String toString()
    {
        int v2 = this.zzc;
        int v3 = this.zzd;
        int v4 = this.zza;
        int v5 = this.zzb;
        String v0_1 = v1.a.r("AesCtrHmacAead Parameters (variant: ", String.valueOf(this.zze), ", hashType: ", String.valueOf(this.zzf), ", ");
        v0_1.append(v2);
        v0_1.append("-byte IV, and ");
        v0_1.append(v3);
        v0_1.append("-byte tags, and ");
        v0_1.append(v4);
        v0_1.append("-byte AES key, and ");
        v0_1.append(v5);
        v0_1.append("-byte HMAC key)");
        return v0_1.toString();
    }

    public final boolean zza()
    {
        if (this.zze == com.google.android.gms.internal.firebase-auth-api.zzdi$zzc.zzc) {
            return 0;
        } else {
            return 1;
        }
    }

    public final int zzb()
    {
        return this.zza;
    }

    public final int zzc()
    {
        return this.zzb;
    }

    public final int zzd()
    {
        return this.zzc;
    }

    public final int zze()
    {
        return this.zzd;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzdi$zza zzg()
    {
        return this.zzf;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzdi$zzc zzh()
    {
        return this.zze;
    }
}
