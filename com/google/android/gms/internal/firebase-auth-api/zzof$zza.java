package com.google.android.gms.internal.firebase-auth-api;
final class zzof$zza extends com.google.android.gms.internal.firebase-auth-api.zzcb {
    private final String zza;
    private final com.google.android.gms.internal.firebase-auth-api.zzxz zzb;

    private zzof$zza(String p1, com.google.android.gms.internal.firebase-auth-api.zzxz p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public synthetic zzof$zza(String p1, com.google.android.gms.internal.firebase-auth-api.zzxz p2, com.google.android.gms.internal.firebase-auth-api.zzog p3)
    {
        this(p1, p2);
        return;
    }

    public final String toString()
    {
        String v1_1;
        String v0_0 = this.zza;
        String v1_3 = com.google.android.gms.internal.firebase-auth-api.zzoe.zza[this.zzb.ordinal()];
        if (v1_3 == 1) {
            v1_1 = "TINK";
        } else {
            if (v1_3 == 2) {
                v1_1 = "LEGACY";
            } else {
                if (v1_3 == 3) {
                    v1_1 = "RAW";
                } else {
                    if (v1_3 == 4) {
                        v1_1 = "CRUNCHY";
                    } else {
                        v1_1 = "UNKNOWN";
                    }
                }
            }
        }
        int v2_4 = new StringBuilder("(typeUrl=");
        v2_4.append(v0_0);
        v2_4.append(", outputPrefixType=");
        v2_4.append(v1_1);
        v2_4.append(")");
        return v2_4.toString();
    }

    public final boolean zza()
    {
        if (this.zzb == com.google.android.gms.internal.firebase-auth-api.zzxz.zzd) {
            return 0;
        } else {
            return 1;
        }
    }
}
