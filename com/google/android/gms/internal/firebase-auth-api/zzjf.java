package com.google.android.gms.internal.firebase-auth-api;
public final class zzjf extends com.google.android.gms.internal.firebase-auth-api.zzjj {
    private final int zza;
    private final com.google.android.gms.internal.firebase-auth-api.zzjf$zza zzb;

    private zzjf(int p1, com.google.android.gms.internal.firebase-auth-api.zzjf$zza p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public synthetic zzjf(int p1, com.google.android.gms.internal.firebase-auth-api.zzjf$zza p2, com.google.android.gms.internal.firebase-auth-api.zzji p3)
    {
        this(p1, p2);
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzjf$zzb zzc()
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzjf$zzb(0);
    }

    public final boolean equals(Object p4)
    {
        if ((p4 instanceof com.google.android.gms.internal.firebase-auth-api.zzjf)) {
            if ((((com.google.android.gms.internal.firebase-auth-api.zzjf) p4).zza != this.zza) || (((com.google.android.gms.internal.firebase-auth-api.zzjf) p4).zzb != this.zzb)) {
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
        return java.util.Objects.hash(new Object[] {com.google.android.gms.internal.firebase-auth-api.zzjf, Integer.valueOf(this.zza), this.zzb}));
    }

    public final String toString()
    {
        String v0_3 = String.valueOf(this.zzb);
        int v1 = this.zza;
        StringBuilder v2_1 = new StringBuilder("AesSiv Parameters (variant: ");
        v2_1.append(v0_3);
        v2_1.append(", ");
        v2_1.append(v1);
        v2_1.append("-byte key)");
        return v2_1.toString();
    }

    public final boolean zza()
    {
        if (this.zzb == com.google.android.gms.internal.firebase-auth-api.zzjf$zza.zzc) {
            return 0;
        } else {
            return 1;
        }
    }

    public final int zzb()
    {
        return this.zza;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzjf$zza zzd()
    {
        return this.zzb;
    }
}
