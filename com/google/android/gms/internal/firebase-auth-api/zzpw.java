package com.google.android.gms.internal.firebase-auth-api;
public final class zzpw {
    private final java.util.Map zza;
    private final java.util.Map zzb;

    private zzpw(com.google.android.gms.internal.firebase-auth-api.zzpy p3)
    {
        this.zza = new java.util.HashMap(com.google.android.gms.internal.firebase-auth-api.zzpy.zza(p3));
        this.zzb = new java.util.HashMap(com.google.android.gms.internal.firebase-auth-api.zzpy.zzb(p3));
        return;
    }

    public synthetic zzpw(com.google.android.gms.internal.firebase-auth-api.zzpy p1, com.google.android.gms.internal.firebase-auth-api.zzqa p2)
    {
        this(p1);
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzpy zza()
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzpy(0);
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzpy zza(com.google.android.gms.internal.firebase-auth-api.zzpw p2)
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzpy(p2, 0);
    }

    public static synthetic Object zza(com.google.android.gms.internal.firebase-auth-api.zzpw p0, com.google.android.gms.internal.firebase-auth-api.zzpz p1, com.google.android.gms.internal.firebase-auth-api.zzoa p2)
    {
        return p0.zza(p2.zzb(), p1.zza());
    }

    public static bridge synthetic java.util.Map zzb(com.google.android.gms.internal.firebase-auth-api.zzpw p0)
    {
        return p0.zza;
    }

    public static bridge synthetic java.util.Map zzc(com.google.android.gms.internal.firebase-auth-api.zzpw p0)
    {
        return p0.zzb;
    }

    public final Object zza(com.google.android.gms.internal.firebase-auth-api.zzbi p4, Class p5)
    {
        String v0_2 = new com.google.android.gms.internal.firebase-auth-api.zzpx(p4.getClass(), p5, 0);
        if (!this.zza.containsKey(v0_2)) {
            throw new java.security.GeneralSecurityException(v1.a.l("No PrimitiveConstructor for ", String.valueOf(v0_2), " available, see https://developers.google.com/tink/faq/registration_errors"));
        } else {
            return ((com.google.android.gms.internal.firebase-auth-api.zzps) this.zza.get(v0_2)).zza(p4);
        }
    }

    public final Object zza(com.google.android.gms.internal.firebase-auth-api.zzob p2, com.google.android.gms.internal.firebase-auth-api.zzok p3, Class p4)
    {
        if (!this.zzb.containsKey(p4)) {
            throw new java.security.GeneralSecurityException("No wrapper found for ".concat(String.valueOf(p4)));
        } else {
            String v4_2 = ((com.google.android.gms.internal.firebase-auth-api.zzpz) this.zzb.get(p4));
            return v4_2.zza(p2, p3, new com.google.android.gms.internal.firebase-auth-api.zzpv(this, v4_2));
        }
    }
}
