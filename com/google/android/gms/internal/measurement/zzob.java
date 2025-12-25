package com.google.android.gms.internal.measurement;
final class zzob implements java.util.Map$Entry, java.lang.Comparable {
    final synthetic com.google.android.gms.internal.measurement.zzoe zza;
    private final Comparable zzb;
    private Object zzc;

    public zzob(com.google.android.gms.internal.measurement.zzoe p1, Comparable p2, Object p3)
    {
        java.util.Objects.requireNonNull(p1);
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        return;
    }

    private static final boolean zzb(Object p0, Object p1)
    {
        if (p0 != 0) {
            return p0.equals(p1);
        } else {
            if (p1 == null) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    public final bridge synthetic int compareTo(Object p2)
    {
        return this.zzb.compareTo(((com.google.android.gms.internal.measurement.zzob) p2).zzb);
    }

    public final boolean equals(Object p5)
    {
        if (p5 != this) {
            if ((p5 instanceof java.util.Map$Entry)) {
                if ((!com.google.android.gms.internal.measurement.zzob.zzb(this.zzb, ((java.util.Map$Entry) p5).getKey())) || (!com.google.android.gms.internal.measurement.zzob.zzb(this.zzc, ((java.util.Map$Entry) p5).getValue()))) {
                    return 0;
                } else {
                    return 1;
                }
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public final synthetic Object getKey()
    {
        return this.zzb;
    }

    public final Object getValue()
    {
        return this.zzc;
    }

    public final int hashCode()
    {
        int v0_2;
        int v0_0 = this.zzb;
        int v1 = 0;
        if (v0_0 != 0) {
            v0_2 = v0_0.hashCode();
        } else {
            v0_2 = 0;
        }
        Object v2 = this.zzc;
        if (v2 != null) {
            v1 = v2.hashCode();
        }
        return (v0_2 ^ v1);
    }

    public final Object setValue(Object p2)
    {
        this.zza.zzh();
        Object v0_1 = this.zzc;
        this.zzc = p2;
        return v0_1;
    }

    public final String toString()
    {
        String v0_2 = String.valueOf(this.zzb);
        String v1_1 = String.valueOf(this.zzc);
        return v1.a.o(new StringBuilder(((v0_2.length() + 1) + v1_1.length())), v0_2, "=", v1_1);
    }

    public final Comparable zza()
    {
        return this.zzb;
    }
}
