package com.google.android.gms.internal.fido;
final class zzbw extends com.google.android.gms.internal.fido.zzbr implements java.io.Serializable {
    final com.google.android.gms.internal.fido.zzbr zza;

    public zzbw(com.google.android.gms.internal.fido.zzbr p1)
    {
        this.zza = p1;
        return;
    }

    public final int compare(Object p2, Object p3)
    {
        return this.zza.compare(p3, p2);
    }

    public final boolean equals(Object p2)
    {
        if (p2 != this) {
            if (!(p2 instanceof com.google.android.gms.internal.fido.zzbw)) {
                return 0;
            } else {
                return this.zza.equals(((com.google.android.gms.internal.fido.zzbw) p2).zza);
            }
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        return (- this.zza.hashCode());
    }

    public final String toString()
    {
        return this.zza.toString().concat(".reverse()");
    }

    public final com.google.android.gms.internal.fido.zzbr zza()
    {
        return this.zza;
    }
}
