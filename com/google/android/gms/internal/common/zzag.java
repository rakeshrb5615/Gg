package com.google.android.gms.internal.common;
final class zzag extends com.google.android.gms.internal.common.zzah {
    final transient int zza;
    final transient int zzb;
    final synthetic com.google.android.gms.internal.common.zzah zzc;

    public zzag(com.google.android.gms.internal.common.zzah p1, int p2, int p3)
    {
        java.util.Objects.requireNonNull(p1);
        this.zzc = p1;
        this.zza = p2;
        this.zzb = p3;
        return;
    }

    public final Object get(int p3)
    {
        com.google.android.gms.internal.common.zzr.zzb(p3, this.zzb, "index");
        return this.zzc.get((p3 + this.zza));
    }

    public final int size()
    {
        return this.zzb;
    }

    public final bridge synthetic java.util.List subList(int p1, int p2)
    {
        return this.zzi(p1, p2);
    }

    public final Object[] zzb()
    {
        return this.zzc.zzb();
    }

    public final int zzc()
    {
        return (this.zzc.zzc() + this.zza);
    }

    public final int zzd()
    {
        return ((this.zzc.zzc() + this.zza) + this.zzb);
    }

    public final boolean zzf()
    {
        return 1;
    }

    public final com.google.android.gms.internal.common.zzah zzi(int p3, int p4)
    {
        com.google.android.gms.internal.common.zzr.zzd(p3, p4, this.zzb);
        int v0_1 = this.zza;
        return this.zzc.zzi((p3 + v0_1), (p4 + v0_1));
    }
}
