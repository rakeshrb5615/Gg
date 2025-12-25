package com.google.android.gms.internal.firebase-auth-api;
public abstract class zznt {
    private final com.google.android.gms.internal.firebase-auth-api.zzaaj zza;
    private final Class zzb;

    private zznt(com.google.android.gms.internal.firebase-auth-api.zzaaj p1, Class p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public synthetic zznt(com.google.android.gms.internal.firebase-auth-api.zzaaj p1, Class p2, com.google.android.gms.internal.firebase-auth-api.zznu p3)
    {
        this(p1, p2);
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zznt zza(com.google.android.gms.internal.firebase-auth-api.zznv p1, com.google.android.gms.internal.firebase-auth-api.zzaaj p2, Class p3)
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzns(p2, p3, p1);
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzaaj zza()
    {
        return this.zza;
    }

    public abstract com.google.android.gms.internal.firebase-auth-api.zzbi zza();

    public final Class zzb()
    {
        return this.zzb;
    }
}
