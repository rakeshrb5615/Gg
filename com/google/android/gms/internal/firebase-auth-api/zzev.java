package com.google.android.gms.internal.firebase-auth-api;
public final class zzev extends com.google.android.gms.internal.firebase-auth-api.zzcy {
    private final String zza;
    private final com.google.android.gms.internal.firebase-auth-api.zzev$zza zzb;

    private zzev(String p1, com.google.android.gms.internal.firebase-auth-api.zzev$zza p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzev zza(String p1, com.google.android.gms.internal.firebase-auth-api.zzev$zza p2)
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzev(p1, p2);
    }

    public final boolean equals(Object p4)
    {
        if ((p4 instanceof com.google.android.gms.internal.firebase-auth-api.zzev)) {
            if ((!((com.google.android.gms.internal.firebase-auth-api.zzev) p4).zza.equals(this.zza)) || (!((com.google.android.gms.internal.firebase-auth-api.zzev) p4).zzb.equals(this.zzb))) {
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
        return java.util.Objects.hash(new Object[] {com.google.android.gms.internal.firebase-auth-api.zzev, this.zza, this.zzb}));
    }

    public final String toString()
    {
        String v0_0 = this.zza;
        String v1_1 = String.valueOf(this.zzb);
        StringBuilder v2_1 = new StringBuilder("LegacyKmsAead Parameters (keyUri: ");
        v2_1.append(v0_0);
        v2_1.append(", variant: ");
        v2_1.append(v1_1);
        v2_1.append(")");
        return v2_1.toString();
    }

    public final boolean zza()
    {
        if (this.zzb == com.google.android.gms.internal.firebase-auth-api.zzev$zza.zzb) {
            return 0;
        } else {
            return 1;
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzev$zza zzb()
    {
        return this.zzb;
    }

    public final String zzc()
    {
        return this.zza;
    }
}
