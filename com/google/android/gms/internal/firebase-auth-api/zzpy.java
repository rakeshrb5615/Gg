package com.google.android.gms.internal.firebase-auth-api;
public final class zzpy {
    private final java.util.Map zza;
    private final java.util.Map zzb;

    private zzpy()
    {
        this.zza = new java.util.HashMap();
        this.zzb = new java.util.HashMap();
        return;
    }

    private zzpy(com.google.android.gms.internal.firebase-auth-api.zzpw p3)
    {
        this.zza = new java.util.HashMap(com.google.android.gms.internal.firebase-auth-api.zzpw.zzb(p3));
        this.zzb = new java.util.HashMap(com.google.android.gms.internal.firebase-auth-api.zzpw.zzc(p3));
        return;
    }

    public synthetic zzpy(com.google.android.gms.internal.firebase-auth-api.zzpw p1, com.google.android.gms.internal.firebase-auth-api.zzqa p2)
    {
        this(p1);
        return;
    }

    public synthetic zzpy(com.google.android.gms.internal.firebase-auth-api.zzqa p1)
    {
        return;
    }

    public static bridge synthetic java.util.Map zza(com.google.android.gms.internal.firebase-auth-api.zzpy p0)
    {
        return p0.zza;
    }

    public static bridge synthetic java.util.Map zzb(com.google.android.gms.internal.firebase-auth-api.zzpy p0)
    {
        return p0.zzb;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzpw zza()
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzpw(this, 0);
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzpy zza(com.google.android.gms.internal.firebase-auth-api.zzps p5)
    {
        if (p5 == null) {
            throw new NullPointerException("primitive constructor must be non-null");
        } else {
            String v0_0 = new com.google.android.gms.internal.firebase-auth-api.zzpx(p5.zza(), p5.zzb(), 0);
            if (!this.zza.containsKey(v0_0)) {
                this.zza.put(v0_0, p5);
                return this;
            } else {
                String v1_5 = ((com.google.android.gms.internal.firebase-auth-api.zzps) this.zza.get(v0_0));
                if ((!v1_5.equals(p5)) || (!p5.equals(v1_5))) {
                    throw new java.security.GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(String.valueOf(v0_0)));
                } else {
                    return this;
                }
            }
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzpy zza(com.google.android.gms.internal.firebase-auth-api.zzpz p4)
    {
        if (p4 == null) {
            throw new NullPointerException("wrapper must be non-null");
        } else {
            String v0_3 = p4.zzb();
            if (!this.zzb.containsKey(v0_3)) {
                this.zzb.put(v0_3, p4);
                return this;
            } else {
                String v1_3 = ((com.google.android.gms.internal.firebase-auth-api.zzpz) this.zzb.get(v0_3));
                if ((!v1_3.equals(p4)) || (!p4.equals(v1_3))) {
                    throw new java.security.GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(String.valueOf(v0_3)));
                } else {
                    return this;
                }
            }
        }
    }
}
