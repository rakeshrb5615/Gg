package com.google.android.gms.internal.firebase-auth-api;
public final class zznk {
    private java.util.Map zza;
    private java.util.Map zzb;

    private zznk()
    {
        this.zza = new java.util.HashMap();
        this.zzb = new java.util.HashMap();
        return;
    }

    public synthetic zznk(com.google.android.gms.internal.firebase-auth-api.zznn p1)
    {
        return;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zznk zza(Enum p2, Object p3)
    {
        this.zza.put(p2, p3);
        this.zzb.put(p3, p2);
        return this;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zznl zza()
    {
        return new com.google.android.gms.internal.firebase-auth-api.zznl(java.util.Collections.unmodifiableMap(this.zza), java.util.Collections.unmodifiableMap(this.zzb), 0);
    }
}
