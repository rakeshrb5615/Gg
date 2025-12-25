package com.google.android.gms.internal.firebase-auth-api;
public final class zzeg extends com.google.android.gms.internal.firebase-auth-api.zzcy {
    private final int zza;
    private final com.google.android.gms.internal.firebase-auth-api.zzeg$zzb zzb;

    private zzeg(int p1, com.google.android.gms.internal.firebase-auth-api.zzeg$zzb p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public synthetic zzeg(int p1, com.google.android.gms.internal.firebase-auth-api.zzeg$zzb p2, com.google.android.gms.internal.firebase-auth-api.zzeh p3)
    {
        this(p1, p2);
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzeg$zza zzc()
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzeg$zza(0);
    }

    public final boolean equals(Object p4)
    {
        if ((p4 instanceof com.google.android.gms.internal.firebase-auth-api.zzeg)) {
            if ((((com.google.android.gms.internal.firebase-auth-api.zzeg) p4).zza != this.zza) || (((com.google.android.gms.internal.firebase-auth-api.zzeg) p4).zzb != this.zzb)) {
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
        return java.util.Objects.hash(new Object[] {com.google.android.gms.internal.firebase-auth-api.zzeg, Integer.valueOf(this.zza), this.zzb}));
    }

    public final String toString()
    {
        String v0_3 = String.valueOf(this.zzb);
        int v1 = this.zza;
        StringBuilder v2_1 = new StringBuilder("AesGcmSiv Parameters (variant: ");
        v2_1.append(v0_3);
        v2_1.append(", ");
        v2_1.append(v1);
        v2_1.append("-byte key)");
        return v2_1.toString();
    }

    public final boolean zza()
    {
        if (this.zzb == com.google.android.gms.internal.firebase-auth-api.zzeg$zzb.zzc) {
            return 0;
        } else {
            return 1;
        }
    }

    public final int zzb()
    {
        return this.zza;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzeg$zzb zzd()
    {
        return this.zzb;
    }
}
