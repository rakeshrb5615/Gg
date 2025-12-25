package com.google.android.gms.internal.firebase-auth-api;
public final class zzqu extends com.google.android.gms.internal.firebase-auth-api.zzrn {
    private final int zza;
    private final int zzb;
    private final com.google.android.gms.internal.firebase-auth-api.zzqu$zza zzc;

    private zzqu(int p1, int p2, com.google.android.gms.internal.firebase-auth-api.zzqu$zza p3)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        return;
    }

    public synthetic zzqu(int p1, int p2, com.google.android.gms.internal.firebase-auth-api.zzqu$zza p3, com.google.android.gms.internal.firebase-auth-api.zzqx p4)
    {
        this(p1, p2, p3);
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzqu$zzb zzd()
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzqu$zzb(0);
    }

    private final int zzf()
    {
        IllegalStateException v0_0 = this.zzc;
        if (v0_0 != com.google.android.gms.internal.firebase-auth-api.zzqu$zza.zzd) {
            IllegalStateException v0_2;
            if (v0_0 != com.google.android.gms.internal.firebase-auth-api.zzqu$zza.zza) {
                if (v0_0 != com.google.android.gms.internal.firebase-auth-api.zzqu$zza.zzb) {
                    if (v0_0 != com.google.android.gms.internal.firebase-auth-api.zzqu$zza.zzc) {
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
        if ((p4 instanceof com.google.android.gms.internal.firebase-auth-api.zzqu)) {
            if ((((com.google.android.gms.internal.firebase-auth-api.zzqu) p4).zza != this.zza) || ((((com.google.android.gms.internal.firebase-auth-api.zzqu) p4).zzf() != this.zzf()) || (((com.google.android.gms.internal.firebase-auth-api.zzqu) p4).zzc != this.zzc))) {
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
        return java.util.Objects.hash(new Object[] {com.google.android.gms.internal.firebase-auth-api.zzqu, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc}));
    }

    public final String toString()
    {
        String v0_4 = String.valueOf(this.zzc);
        int v1 = this.zzb;
        int v2 = this.zza;
        StringBuilder v3_1 = new StringBuilder("AES-CMAC Parameters (variant: ");
        v3_1.append(v0_4);
        v3_1.append(", ");
        v3_1.append(v1);
        v3_1.append("-byte tags, and ");
        v3_1.append(v2);
        v3_1.append("-byte key)");
        return v3_1.toString();
    }

    public final boolean zza()
    {
        if (this.zzc == com.google.android.gms.internal.firebase-auth-api.zzqu$zza.zzd) {
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

    public final com.google.android.gms.internal.firebase-auth-api.zzqu$zza zze()
    {
        return this.zzc;
    }
}
