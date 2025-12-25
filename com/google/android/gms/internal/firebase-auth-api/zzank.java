package com.google.android.gms.internal.firebase-auth-api;
final class zzank implements java.lang.Comparable, java.util.Map$Entry {
    private final Comparable zza;
    private Object zzb;
    private final synthetic com.google.android.gms.internal.firebase-auth-api.zzang zzc;

    public zzank(com.google.android.gms.internal.firebase-auth-api.zzang p1, Comparable p2, Object p3)
    {
        java.util.Objects.requireNonNull(p1);
        this.zzc = p1;
        this.zza = p2;
        this.zzb = p3;
        return;
    }

    public zzank(com.google.android.gms.internal.firebase-auth-api.zzang p2, java.util.Map$Entry p3)
    {
        this(p2, ((Comparable) p3.getKey()), p3.getValue());
        return;
    }

    private static boolean zza(Object p0, Object p1)
    {
        if (p0 != 0) {
            return p0.equals(p1);
        } else {
            if (p1 != null) {
                return 0;
            } else {
                return 1;
            }
        }
    }

    public final synthetic int compareTo(Object p2)
    {
        return ((Comparable) this.getKey()).compareTo(((Comparable) ((com.google.android.gms.internal.firebase-auth-api.zzank) p2).getKey()));
    }

    public final boolean equals(Object p5)
    {
        if (p5 != this) {
            if ((p5 instanceof java.util.Map$Entry)) {
                if ((!com.google.android.gms.internal.firebase-auth-api.zzank.zza(this.zza, ((java.util.Map$Entry) p5).getKey())) || (!com.google.android.gms.internal.firebase-auth-api.zzank.zza(this.zzb, ((java.util.Map$Entry) p5).getValue()))) {
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
        return this.zza;
    }

    public final Object getValue()
    {
        return this.zzb;
    }

    public final int hashCode()
    {
        int v0_2;
        int v0_0 = this.zza;
        int v1 = 0;
        if (v0_0 != 0) {
            v0_2 = v0_0.hashCode();
        } else {
            v0_2 = 0;
        }
        Object v2 = this.zzb;
        if (v2 != null) {
            v1 = v2.hashCode();
        }
        return (v0_2 ^ v1);
    }

    public final Object setValue(Object p2)
    {
        com.google.android.gms.internal.firebase-auth-api.zzang.zzd(this.zzc);
        Object v0_1 = this.zzb;
        this.zzb = p2;
        return v0_1;
    }

    public final String toString()
    {
        return g2.g.e(String.valueOf(this.zza), "=", String.valueOf(this.zzb));
    }
}
