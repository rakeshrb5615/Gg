package com.google.android.gms.internal.auth;
final class zzdi extends com.google.android.gms.internal.auth.zzdh {
    private final Object zza;

    public zzdi(Object p1)
    {
        this.zza = p1;
        return;
    }

    public final boolean equals(Object p2)
    {
        if (!(p2 instanceof com.google.android.gms.internal.auth.zzdi)) {
            return 0;
        } else {
            return this.zza.equals(((com.google.android.gms.internal.auth.zzdi) p2).zza);
        }
    }

    public final int hashCode()
    {
        return (this.zza.hashCode() + 1502476572);
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("Optional.of(");
        v0_1.append(this.zza);
        v0_1.append(")");
        return v0_1.toString();
    }

    public final Object zza()
    {
        return this.zza;
    }

    public final boolean zzb()
    {
        return 1;
    }
}
