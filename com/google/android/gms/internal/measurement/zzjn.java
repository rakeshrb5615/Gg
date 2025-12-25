package com.google.android.gms.internal.measurement;
final class zzjn extends com.google.android.gms.internal.measurement.zzkh {
    private final android.content.Context zza;
    private final l4.f zzb;

    public zzjn(android.content.Context p1, l4.f p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final boolean equals(Object p5)
    {
        if (p5 != this) {
            if (((p5 instanceof com.google.android.gms.internal.measurement.zzkh)) && (this.zza.equals(((com.google.android.gms.internal.measurement.zzkh) p5).zza()))) {
                l4.f v1_1 = this.zzb;
                if (v1_1 != null) {
                    if (!v1_1.equals(((com.google.android.gms.internal.measurement.zzkh) p5).zzb())) {
                        return 0;
                    }
                } else {
                    if (((com.google.android.gms.internal.measurement.zzkh) p5).zzb() != null) {
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
        int v2_1;
        int v0_4 = (this.zza.hashCode() ^ 1000003);
        int v2_0 = this.zzb;
        if (v2_0 != 0) {
            v2_1 = v2_0.hashCode();
        } else {
            v2_1 = 0;
        }
        return ((v0_4 * 1000003) ^ v2_1);
    }

    public final String toString()
    {
        String v0_2 = this.zza.toString();
        String v1_4 = v0_2.length();
        String v2_1 = String.valueOf(this.zzb);
        StringBuilder v3_1 = new StringBuilder((((v1_4 + 45) + v2_1.length()) + 1));
        v3_1.append("FlagsContext{context=");
        v3_1.append(v0_2);
        v3_1.append(", hermeticFileOverrides=");
        v3_1.append(v2_1);
        v3_1.append("}");
        return v3_1.toString();
    }

    public final android.content.Context zza()
    {
        return this.zza;
    }

    public final l4.f zzb()
    {
        return this.zzb;
    }
}
