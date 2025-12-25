package com.google.android.gms.internal.auth;
final class zzcd extends com.google.android.gms.internal.auth.zzda {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.auth.zzdj zzb;

    public zzcd(android.content.Context p1, com.google.android.gms.internal.auth.zzdj p2)
    {
        if (p1 == null) {
            throw new NullPointerException("Null context");
        } else {
            this.zza = p1;
            this.zzb = p2;
            return;
        }
    }

    public final boolean equals(Object p5)
    {
        if (p5 != this) {
            if (((p5 instanceof com.google.android.gms.internal.auth.zzda)) && (this.zza.equals(((com.google.android.gms.internal.auth.zzda) p5).zza()))) {
                com.google.android.gms.internal.auth.zzdj v1_1 = this.zzb;
                if (v1_1 != null) {
                    if (!v1_1.equals(((com.google.android.gms.internal.auth.zzda) p5).zzb())) {
                        return 0;
                    }
                } else {
                    if (((com.google.android.gms.internal.auth.zzda) p5).zzb() != null) {
                        return 0;
                    }
                }
                return 1;
            }
            return 0;
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        int v1_0;
        int v0_4 = ((this.zza.hashCode() ^ 1000003) * 1000003);
        int v1_2 = this.zzb;
        if (v1_2 != 0) {
            v1_0 = v1_2.hashCode();
        } else {
            v1_0 = 0;
        }
        return (v0_4 ^ v1_0);
    }

    public final String toString()
    {
        String v0_4 = this.zza.toString();
        String v1_1 = String.valueOf(this.zzb);
        StringBuilder v2_1 = new StringBuilder("FlagsContext{context=");
        v2_1.append(v0_4);
        v2_1.append(", hermeticFileOverrides=");
        v2_1.append(v1_1);
        v2_1.append("}");
        return v2_1.toString();
    }

    public final android.content.Context zza()
    {
        return this.zza;
    }

    public final com.google.android.gms.internal.auth.zzdj zzb()
    {
        return this.zzb;
    }
}
