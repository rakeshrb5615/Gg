package com.google.android.gms.internal.fido;
final class zzat extends com.google.android.gms.internal.fido.zzbr implements java.io.Serializable {
    final java.util.Comparator zza;

    public zzat(java.util.Comparator p1)
    {
        p1.getClass();
        this.zza = p1;
        return;
    }

    public final int compare(Object p2, Object p3)
    {
        return this.zza.compare(p2, p3);
    }

    public final boolean equals(Object p2)
    {
        if (p2 != this) {
            if (!(p2 instanceof com.google.android.gms.internal.fido.zzat)) {
                return 0;
            } else {
                return this.zza.equals(((com.google.android.gms.internal.fido.zzat) p2).zza);
            }
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        return this.zza.hashCode();
    }

    public final String toString()
    {
        return this.zza.toString();
    }
}
