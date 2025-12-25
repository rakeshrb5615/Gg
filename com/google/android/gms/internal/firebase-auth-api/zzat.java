package com.google.android.gms.internal.firebase-auth-api;
final class zzat extends com.google.android.gms.internal.firebase-auth-api.zzaq {
    private final transient com.google.android.gms.internal.firebase-auth-api.zzal zza;
    private final transient com.google.android.gms.internal.firebase-auth-api.zzah zzb;

    public zzat(com.google.android.gms.internal.firebase-auth-api.zzal p1, com.google.android.gms.internal.firebase-auth-api.zzah p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final boolean contains(Object p2)
    {
        if (this.zza.get(p2) == null) {
            return 0;
        } else {
            return 1;
        }
    }

    public final synthetic java.util.Iterator iterator()
    {
        return this.zzd();
    }

    public final int size()
    {
        return this.zza.size();
    }

    public final int zza(Object[] p2, int p3)
    {
        return this.zzc().zza(p2, p3);
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzah zzc()
    {
        return this.zzb;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzay zzd()
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzay) this.zzc().iterator());
    }
}
