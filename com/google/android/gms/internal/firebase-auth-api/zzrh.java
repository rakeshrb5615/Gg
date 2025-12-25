package com.google.android.gms.internal.firebase-auth-api;
public final class zzrh extends com.google.android.gms.internal.firebase-auth-api.zzrn {
    private final int zza;
    private final int zzb;
    private final com.google.android.gms.internal.firebase-auth-api.zzrh$zzc zzc;
    private final com.google.android.gms.internal.firebase-auth-api.zzrh$zza zzd;

    private zzrh(int p1, int p2, com.google.android.gms.internal.firebase-auth-api.zzrh$zzc p3, com.google.android.gms.internal.firebase-auth-api.zzrh$zza p4)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        this.zzd = p4;
        return;
    }

    public synthetic zzrh(int p1, int p2, com.google.android.gms.internal.firebase-auth-api.zzrh$zzc p3, com.google.android.gms.internal.firebase-auth-api.zzrh$zza p4, com.google.android.gms.internal.firebase-auth-api.zzrj p5)
    {
        this(p1, p2, p3, p4);
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzrh$zzb zzd()
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzrh$zzb(0);
    }

    private final int zzg()
    {
        IllegalStateException v0_0 = this.zzc;
        if (v0_0 != com.google.android.gms.internal.firebase-auth-api.zzrh$zzc.zzd) {
            IllegalStateException v0_2;
            if (v0_0 != com.google.android.gms.internal.firebase-auth-api.zzrh$zzc.zza) {
                if (v0_0 != com.google.android.gms.internal.firebase-auth-api.zzrh$zzc.zzb) {
                    if (v0_0 != com.google.android.gms.internal.firebase-auth-api.zzrh$zzc.zzc) {
                        throw new IllegalStateException("Unknown variant");
                    } else {
                        v0_2 = this.zzb;
                    }
                } else {
                    v0_2 = this.zzb;
                }
            } else {
                v0_2 = this.zzb;
            }
            return (v0_2 + 5);
        } else {
            return this.zzb;
        }
    }

    public final boolean equals(Object p4)
    {
        if ((p4 instanceof com.google.android.gms.internal.firebase-auth-api.zzrh)) {
            if ((((com.google.android.gms.internal.firebase-auth-api.zzrh) p4).zza != this.zza) || ((((com.google.android.gms.internal.firebase-auth-api.zzrh) p4).zzg() != this.zzg()) || ((((com.google.android.gms.internal.firebase-auth-api.zzrh) p4).zzc != this.zzc) || (((com.google.android.gms.internal.firebase-auth-api.zzrh) p4).zzd != this.zzd)))) {
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
        return java.util.Objects.hash(new Object[] {com.google.android.gms.internal.firebase-auth-api.zzrh, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc, this.zzd}));
    }

    public final String toString()
    {
        int v2 = this.zzb;
        int v3 = this.zza;
        String v0_1 = v1.a.r("HMAC Parameters (variant: ", String.valueOf(this.zzc), ", hashType: ", String.valueOf(this.zzd), ", ");
        v0_1.append(v2);
        v0_1.append("-byte tags, and ");
        v0_1.append(v3);
        v0_1.append("-byte key)");
        return v0_1.toString();
    }

    public final boolean zza()
    {
        if (this.zzc == com.google.android.gms.internal.firebase-auth-api.zzrh$zzc.zzd) {
            return 0;
        } else {
            return 1;
        }
    }

    public final int zzb()
    {
        return this.zzb;
    }

    public final int zzc()
    {
        return this.zza;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzrh$zza zze()
    {
        return this.zzd;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzrh$zzc zzf()
    {
        return this.zzc;
    }
}
