package com.google.android.gms.internal.firebase-auth-api;
public final class zzqi {
    private final java.util.Map zza;
    private final java.util.Map zzb;
    private final java.util.Map zzc;
    private final java.util.Map zzd;

    private zzqi(com.google.android.gms.internal.firebase-auth-api.zzqh p3)
    {
        this.zza = new java.util.HashMap(com.google.android.gms.internal.firebase-auth-api.zzqh.zzb(p3));
        this.zzb = new java.util.HashMap(com.google.android.gms.internal.firebase-auth-api.zzqh.zza(p3));
        this.zzc = new java.util.HashMap(com.google.android.gms.internal.firebase-auth-api.zzqh.zzd(p3));
        this.zzd = new java.util.HashMap(com.google.android.gms.internal.firebase-auth-api.zzqh.zzc(p3));
        return;
    }

    public synthetic zzqi(com.google.android.gms.internal.firebase-auth-api.zzqh p1, com.google.android.gms.internal.firebase-auth-api.zzqm p2)
    {
        this(p1);
        return;
    }

    public static bridge synthetic java.util.Map zza(com.google.android.gms.internal.firebase-auth-api.zzqi p0)
    {
        return p0.zzb;
    }

    public static bridge synthetic java.util.Map zzb(com.google.android.gms.internal.firebase-auth-api.zzqi p0)
    {
        return p0.zza;
    }

    public static bridge synthetic java.util.Map zzc(com.google.android.gms.internal.firebase-auth-api.zzqi p0)
    {
        return p0.zzd;
    }

    public static bridge synthetic java.util.Map zzd(com.google.android.gms.internal.firebase-auth-api.zzqi p0)
    {
        return p0.zzc;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzbi zza(com.google.android.gms.internal.firebase-auth-api.zzqf p5, com.google.android.gms.internal.firebase-auth-api.zzch p6)
    {
        String v0_4 = new com.google.android.gms.internal.firebase-auth-api.zzqk(p5.getClass(), p5.zzc(), 0);
        if (!this.zzb.containsKey(v0_4)) {
            throw new java.security.GeneralSecurityException(v1.a.l("No Key Parser for requested key type ", String.valueOf(v0_4), " available"));
        } else {
            return ((com.google.android.gms.internal.firebase-auth-api.zznt) this.zzb.get(v0_4)).zza(p5, p6);
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzcb zza(com.google.android.gms.internal.firebase-auth-api.zzqf p5)
    {
        String v0_5 = new com.google.android.gms.internal.firebase-auth-api.zzqk(p5.getClass(), p5.zzc(), 0);
        if (!this.zzd.containsKey(v0_5)) {
            throw new java.security.GeneralSecurityException(v1.a.l("No Parameters Parser for requested key type ", String.valueOf(v0_5), " available"));
        } else {
            return ((com.google.android.gms.internal.firebase-auth-api.zzpd) this.zzd.get(v0_5)).zza(p5);
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzqf zza(com.google.android.gms.internal.firebase-auth-api.zzbi p4, Class p5, com.google.android.gms.internal.firebase-auth-api.zzch p6)
    {
        String v0_2 = new com.google.android.gms.internal.firebase-auth-api.zzqj(p4.getClass(), p5, 0);
        if (!this.zza.containsKey(v0_2)) {
            throw new java.security.GeneralSecurityException(v1.a.l("No Key serializer for ", String.valueOf(v0_2), " available"));
        } else {
            return ((com.google.android.gms.internal.firebase-auth-api.zznx) this.zza.get(v0_2)).zza(p4, p6);
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzqf zza(com.google.android.gms.internal.firebase-auth-api.zzcb p4, Class p5)
    {
        String v0_2 = new com.google.android.gms.internal.firebase-auth-api.zzqj(p4.getClass(), p5, 0);
        if (!this.zzc.containsKey(v0_2)) {
            throw new java.security.GeneralSecurityException(v1.a.l("No Key Format serializer for ", String.valueOf(v0_2), " available"));
        } else {
            return ((com.google.android.gms.internal.firebase-auth-api.zzph) this.zzc.get(v0_2)).zza(p4);
        }
    }

    public final boolean zzb(com.google.android.gms.internal.firebase-auth-api.zzqf p4)
    {
        return this.zzb.containsKey(new com.google.android.gms.internal.firebase-auth-api.zzqk(p4.getClass(), p4.zzc(), 0));
    }

    public final boolean zzc(com.google.android.gms.internal.firebase-auth-api.zzqf p4)
    {
        return this.zzd.containsKey(new com.google.android.gms.internal.firebase-auth-api.zzqk(p4.getClass(), p4.zzc(), 0));
    }
}
