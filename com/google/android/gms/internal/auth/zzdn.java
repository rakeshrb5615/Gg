package com.google.android.gms.internal.auth;
public final class zzdn {

    public static com.google.android.gms.internal.auth.zzdj zza(com.google.android.gms.internal.auth.zzdj p1)
    {
        if ((p1 instanceof com.google.android.gms.internal.auth.zzdl)) {
            return p1;
        } else {
            if (!(p1 instanceof com.google.android.gms.internal.auth.zzdk)) {
                if (!(p1 instanceof java.io.Serializable)) {
                    return new com.google.android.gms.internal.auth.zzdl(p1);
                } else {
                    return new com.google.android.gms.internal.auth.zzdk(p1);
                }
            } else {
                return p1;
            }
        }
    }

    public static com.google.android.gms.internal.auth.zzdj zzb(Object p1)
    {
        return new com.google.android.gms.internal.auth.zzdm(p1);
    }
}
