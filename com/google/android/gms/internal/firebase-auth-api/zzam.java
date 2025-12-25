package com.google.android.gms.internal.firebase-auth-api;
final class zzam extends com.google.android.gms.internal.firebase-auth-api.zzah {
    private final transient int zza;
    private final transient int zzb;
    private final synthetic com.google.android.gms.internal.firebase-auth-api.zzah zzc;

    public zzam(com.google.android.gms.internal.firebase-auth-api.zzah p1, int p2, int p3)
    {
        java.util.Objects.requireNonNull(p1);
        this.zzc = p1;
        this.zza = p2;
        this.zzb = p3;
        return;
    }

    public final Object get(int p3)
    {
        com.google.android.gms.internal.firebase-auth-api.zzu.zza(p3, this.zzb);
        return this.zzc.get((p3 + this.zza));
    }

    public final int size()
    {
        return this.zzb;
    }

    public final synthetic java.util.List subList(int p1, int p2)
    {
        return this.zza(p1, p2);
    }

    public final int zza()
    {
        return ((this.zzc.zzb() + this.zza) + this.zzb);
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzah zza(int p3, int p4)
    {
        com.google.android.gms.internal.firebase-auth-api.zzu.zza(p3, p4, this.zzb);
        int v1 = this.zza;
        return ((com.google.android.gms.internal.firebase-auth-api.zzah) this.zzc.subList((p3 + v1), (p4 + v1)));
    }

    public final int zzb()
    {
        return (this.zzc.zzb() + this.zza);
    }

    public final Object[] zze()
    {
        return this.zzc.zze();
    }
}
