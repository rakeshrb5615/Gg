package com.google.android.gms.internal.firebase-auth-api;
public final class zzfz extends com.google.android.gms.internal.firebase-auth-api.zzcy {
    private final com.google.android.gms.internal.firebase-auth-api.zzfz$zza zza;
    private final int zzb;

    private zzfz(com.google.android.gms.internal.firebase-auth-api.zzfz$zza p1, int p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzfz zza(com.google.android.gms.internal.firebase-auth-api.zzfz$zza p1, int p2)
    {
        if ((p2 < 8) || (p2 > 12)) {
            throw new java.security.GeneralSecurityException("Salt size must be between 8 and 12 bytes");
        } else {
            return new com.google.android.gms.internal.firebase-auth-api.zzfz(p1, p2);
        }
    }

    public final boolean equals(Object p4)
    {
        if ((p4 instanceof com.google.android.gms.internal.firebase-auth-api.zzfz)) {
            if ((((com.google.android.gms.internal.firebase-auth-api.zzfz) p4).zza != this.zza) || (((com.google.android.gms.internal.firebase-auth-api.zzfz) p4).zzb != this.zzb)) {
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
        return java.util.Objects.hash(new Object[] {com.google.android.gms.internal.firebase-auth-api.zzfz, this.zza, Integer.valueOf(this.zzb)}));
    }

    public final String toString()
    {
        String v0_3 = String.valueOf(this.zza);
        int v1 = this.zzb;
        StringBuilder v2_1 = new StringBuilder("X-AES-GCM Parameters (variant: ");
        v2_1.append(v0_3);
        v2_1.append("salt_size_bytes: ");
        v2_1.append(v1);
        v2_1.append(")");
        return v2_1.toString();
    }

    public final boolean zza()
    {
        if (this.zza == com.google.android.gms.internal.firebase-auth-api.zzfz$zza.zzb) {
            return 0;
        } else {
            return 1;
        }
    }

    public final int zzb()
    {
        return this.zzb;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzfz$zza zzc()
    {
        return this.zza;
    }
}
