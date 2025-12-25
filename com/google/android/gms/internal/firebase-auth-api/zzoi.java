package com.google.android.gms.internal.firebase-auth-api;
public final class zzoi extends com.google.android.gms.internal.firebase-auth-api.zzcb {
    private final com.google.android.gms.internal.firebase-auth-api.zzqe zza;

    public zzoi(com.google.android.gms.internal.firebase-auth-api.zzqe p1)
    {
        this.zza = p1;
        return;
    }

    public final boolean equals(Object p4)
    {
        if ((p4 instanceof com.google.android.gms.internal.firebase-auth-api.zzoi)) {
            int v4_5 = ((com.google.android.gms.internal.firebase-auth-api.zzoi) p4).zza;
            if ((!this.zza.zza().zzd().equals(v4_5.zza().zzd())) || ((!this.zza.zza().zzf().equals(v4_5.zza().zzf())) || (!this.zza.zza().zze().equals(v4_5.zza().zze())))) {
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
        return java.util.Objects.hash(new Object[] {this.zza.zza(), this.zza.zzc()}));
    }

    public final String toString()
    {
        String v1_2;
        String v0_5 = this.zza.zza().zzf();
        String v1_1 = com.google.android.gms.internal.firebase-auth-api.zzoh.zza[this.zza.zza().zzd().ordinal()];
        if (v1_1 == 1) {
            v1_2 = "TINK";
        } else {
            if (v1_1 == 2) {
                v1_2 = "LEGACY";
            } else {
                if (v1_1 == 3) {
                    v1_2 = "RAW";
                } else {
                    if (v1_1 == 4) {
                        v1_2 = "CRUNCHY";
                    } else {
                        v1_2 = "UNKNOWN";
                    }
                }
            }
        }
        int v2_6 = new StringBuilder("(typeUrl=");
        v2_6.append(v0_5);
        v2_6.append(", outputPrefixType=");
        v2_6.append(v1_2);
        v2_6.append(")");
        return v2_6.toString();
    }

    public final boolean zza()
    {
        if (this.zza.zza().zzd() == com.google.android.gms.internal.firebase-auth-api.zzxz.zzd) {
            return 0;
        } else {
            return 1;
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzqe zzb()
    {
        return this.zza;
    }
}
