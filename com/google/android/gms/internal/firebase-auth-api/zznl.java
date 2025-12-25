package com.google.android.gms.internal.firebase-auth-api;
public final class zznl {
    private final java.util.Map zza;
    private final java.util.Map zzb;

    private zznl(java.util.Map p1, java.util.Map p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public synthetic zznl(java.util.Map p1, java.util.Map p2, com.google.android.gms.internal.firebase-auth-api.zznn p3)
    {
        this(p1, p2);
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zznk zza()
    {
        return new com.google.android.gms.internal.firebase-auth-api.zznk(0);
    }

    public final Enum zza(Object p3)
    {
        java.security.GeneralSecurityException v0_3 = ((Enum) this.zzb.get(p3));
        if (v0_3 == null) {
            throw new java.security.GeneralSecurityException("Unable to convert object enum: ".concat(String.valueOf(p3)));
        } else {
            return v0_3;
        }
    }

    public final Object zza(Enum p3)
    {
        java.security.GeneralSecurityException v0_2 = this.zza.get(p3);
        if (v0_2 == null) {
            throw new java.security.GeneralSecurityException("Unable to convert proto enum: ".concat(String.valueOf(p3)));
        } else {
            return v0_2;
        }
    }
}
