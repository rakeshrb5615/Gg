package com.google.android.gms.internal.firebase-auth-api;
final class zzqk {
    private final Class zza;
    private final com.google.android.gms.internal.firebase-auth-api.zzaaj zzb;

    private zzqk(Class p1, com.google.android.gms.internal.firebase-auth-api.zzaaj p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public synthetic zzqk(Class p1, com.google.android.gms.internal.firebase-auth-api.zzaaj p2, com.google.android.gms.internal.firebase-auth-api.zzqm p3)
    {
        this(p1, p2);
        return;
    }

    public final boolean equals(Object p4)
    {
        if ((p4 instanceof com.google.android.gms.internal.firebase-auth-api.zzqk)) {
            if ((!((com.google.android.gms.internal.firebase-auth-api.zzqk) p4).zza.equals(this.zza)) || (!((com.google.android.gms.internal.firebase-auth-api.zzqk) p4).zzb.equals(this.zzb))) {
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
        return java.util.Objects.hash(new Object[] {this.zza, this.zzb}));
    }

    public final String toString()
    {
        return g2.g.e(this.zza.getSimpleName(), ", object identifier: ", String.valueOf(this.zzb));
    }
}
