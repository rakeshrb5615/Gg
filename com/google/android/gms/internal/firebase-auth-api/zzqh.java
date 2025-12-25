package com.google.android.gms.internal.firebase-auth-api;
public final class zzqh {
    private final java.util.Map zza;
    private final java.util.Map zzb;
    private final java.util.Map zzc;
    private final java.util.Map zzd;

    public zzqh()
    {
        this.zza = new java.util.HashMap();
        this.zzb = new java.util.HashMap();
        this.zzc = new java.util.HashMap();
        this.zzd = new java.util.HashMap();
        return;
    }

    public zzqh(com.google.android.gms.internal.firebase-auth-api.zzqi p3)
    {
        this.zza = new java.util.HashMap(com.google.android.gms.internal.firebase-auth-api.zzqi.zzb(p3));
        this.zzb = new java.util.HashMap(com.google.android.gms.internal.firebase-auth-api.zzqi.zza(p3));
        this.zzc = new java.util.HashMap(com.google.android.gms.internal.firebase-auth-api.zzqi.zzd(p3));
        this.zzd = new java.util.HashMap(com.google.android.gms.internal.firebase-auth-api.zzqi.zzc(p3));
        return;
    }

    public static bridge synthetic java.util.Map zza(com.google.android.gms.internal.firebase-auth-api.zzqh p0)
    {
        return p0.zzb;
    }

    public static bridge synthetic java.util.Map zzb(com.google.android.gms.internal.firebase-auth-api.zzqh p0)
    {
        return p0.zza;
    }

    public static bridge synthetic java.util.Map zzc(com.google.android.gms.internal.firebase-auth-api.zzqh p0)
    {
        return p0.zzd;
    }

    public static bridge synthetic java.util.Map zzd(com.google.android.gms.internal.firebase-auth-api.zzqh p0)
    {
        return p0.zzc;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzqh zza(com.google.android.gms.internal.firebase-auth-api.zznt p5)
    {
        String v0_3 = new com.google.android.gms.internal.firebase-auth-api.zzqk(p5.zzb(), p5.zza(), 0);
        if (!this.zzb.containsKey(v0_3)) {
            this.zzb.put(v0_3, p5);
            return this;
        } else {
            String v1_3 = ((com.google.android.gms.internal.firebase-auth-api.zznt) this.zzb.get(v0_3));
            if ((!v1_3.equals(p5)) || (!p5.equals(v1_3))) {
                throw new java.security.GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(String.valueOf(v0_3)));
            } else {
                return this;
            }
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzqh zza(com.google.android.gms.internal.firebase-auth-api.zznx p5)
    {
        String v0_3 = new com.google.android.gms.internal.firebase-auth-api.zzqj(p5.zza(), p5.zzb(), 0);
        if (!this.zza.containsKey(v0_3)) {
            this.zza.put(v0_3, p5);
            return this;
        } else {
            String v1_3 = ((com.google.android.gms.internal.firebase-auth-api.zznx) this.zza.get(v0_3));
            if ((!v1_3.equals(p5)) || (!p5.equals(v1_3))) {
                throw new java.security.GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(String.valueOf(v0_3)));
            } else {
                return this;
            }
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzqh zza(com.google.android.gms.internal.firebase-auth-api.zzpd p5)
    {
        String v0_3 = new com.google.android.gms.internal.firebase-auth-api.zzqk(p5.zzb(), p5.zza(), 0);
        if (!this.zzd.containsKey(v0_3)) {
            this.zzd.put(v0_3, p5);
            return this;
        } else {
            String v1_3 = ((com.google.android.gms.internal.firebase-auth-api.zzpd) this.zzd.get(v0_3));
            if ((!v1_3.equals(p5)) || (!p5.equals(v1_3))) {
                throw new java.security.GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(String.valueOf(v0_3)));
            } else {
                return this;
            }
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzqh zza(com.google.android.gms.internal.firebase-auth-api.zzph p5)
    {
        String v0_3 = new com.google.android.gms.internal.firebase-auth-api.zzqj(p5.zza(), p5.zzb(), 0);
        if (!this.zzc.containsKey(v0_3)) {
            this.zzc.put(v0_3, p5);
            return this;
        } else {
            String v1_3 = ((com.google.android.gms.internal.firebase-auth-api.zzph) this.zzc.get(v0_3));
            if ((!v1_3.equals(p5)) || (!p5.equals(v1_3))) {
                throw new java.security.GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(String.valueOf(v0_3)));
            } else {
                return this;
            }
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzqi zza()
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzqi(this, 0);
    }
}
