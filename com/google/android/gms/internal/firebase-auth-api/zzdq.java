package com.google.android.gms.internal.firebase-auth-api;
public final class zzdq extends com.google.android.gms.internal.firebase-auth-api.zzcy {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final com.google.android.gms.internal.firebase-auth-api.zzdq$zzb zzd;

    private zzdq(int p1, int p2, int p3, com.google.android.gms.internal.firebase-auth-api.zzdq$zzb p4)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        this.zzd = p4;
        return;
    }

    public synthetic zzdq(int p1, int p2, int p3, com.google.android.gms.internal.firebase-auth-api.zzdq$zzb p4, com.google.android.gms.internal.firebase-auth-api.zzdr p5)
    {
        this(p1, p2, p3, p4);
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzdq$zza zze()
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzdq$zza(0);
    }

    public final boolean equals(Object p4)
    {
        if ((p4 instanceof com.google.android.gms.internal.firebase-auth-api.zzdq)) {
            if ((((com.google.android.gms.internal.firebase-auth-api.zzdq) p4).zza != this.zza) || ((((com.google.android.gms.internal.firebase-auth-api.zzdq) p4).zzb != this.zzb) || ((((com.google.android.gms.internal.firebase-auth-api.zzdq) p4).zzc != this.zzc) || (((com.google.android.gms.internal.firebase-auth-api.zzdq) p4).zzd != this.zzd)))) {
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
        return java.util.Objects.hash(new Object[] {com.google.android.gms.internal.firebase-auth-api.zzdq, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), this.zzd}));
    }

    public final String toString()
    {
        String v0_5 = String.valueOf(this.zzd);
        int v1 = this.zzb;
        int v2 = this.zzc;
        int v3 = this.zza;
        StringBuilder v4_1 = new StringBuilder("AesEax Parameters (variant: ");
        v4_1.append(v0_5);
        v4_1.append(", ");
        v4_1.append(v1);
        v4_1.append("-byte IV, ");
        v4_1.append(v2);
        v4_1.append("-byte tag, and ");
        v4_1.append(v3);
        v4_1.append("-byte key)");
        return v4_1.toString();
    }

    public final boolean zza()
    {
        if (this.zzd == com.google.android.gms.internal.firebase-auth-api.zzdq$zzb.zzc) {
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

    public final int zzd()
    {
        return this.zzc;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzdq$zzb zzf()
    {
        return this.zzd;
    }
}
