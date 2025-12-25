package com.google.android.gms.internal.auth;
final class zzdf extends com.google.android.gms.internal.auth.zzdh {
    static final com.google.android.gms.internal.auth.zzdf zza;

    static zzdf()
    {
        com.google.android.gms.internal.auth.zzdf.zza = new com.google.android.gms.internal.auth.zzdf();
        return;
    }

    private zzdf()
    {
        return;
    }

    public final boolean equals(Object p1)
    {
        if (p1 != this) {
            return 0;
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        return 2040732332;
    }

    public final String toString()
    {
        return "Optional.absent()";
    }

    public final Object zza()
    {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public final boolean zzb()
    {
        return 0;
    }
}
