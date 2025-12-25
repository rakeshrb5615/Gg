package com.google.android.recaptcha.internal;
final class zzpa implements java.util.Map$Entry, java.lang.Comparable {
    final synthetic com.google.android.recaptcha.internal.zzpe zza;
    private final Comparable zzb;
    private Object zzc;

    public zzpa(com.google.android.recaptcha.internal.zzpe p1, Comparable p2, Object p3)
    {
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
        return this.zzb.compareTo(((com.google.android.recaptcha.internal.zzpa) p2).zzb);
    }

    public final boolean equals(Object p5)
    {
        if (p5 != this) {
            if ((p5 instanceof java.util.Map$Entry)) {
                if ((!com.google.android.recaptcha.internal.zzpa.zzb(this.zzb, ((java.util.Map$Entry) p5).getKey())) || (!com.google.android.recaptcha.internal.zzpa.zzb(this.zzc, ((java.util.Map$Entry) p5).getValue()))) {
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
        com.google.android.recaptcha.internal.zzpe.zzi(this.zza);
        Object v0_1 = this.zzc;
        this.zzc = p2;
        return v0_1;
    }

    public final String toString()
    {
        return g2.g.e(String.valueOf(this.zzb), "=", String.valueOf(this.zzc));
    }

    public final Comparable zza()
    {
        return this.zzb;
    }
}
