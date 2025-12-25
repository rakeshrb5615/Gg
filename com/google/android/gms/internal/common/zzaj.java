package com.google.android.gms.internal.common;
final class zzaj extends com.google.android.gms.internal.common.zzah {
    static final com.google.android.gms.internal.common.zzah zza;
    final transient Object[] zzb;
    private final transient int zzc;

    static zzaj()
    {
        Object[] v2 = new Object[0];
        com.google.android.gms.internal.common.zzaj.zza = new com.google.android.gms.internal.common.zzaj(v2, 0);
        return;
    }

    public zzaj(Object[] p1, int p2)
    {
        this.zzb = p1;
        this.zzc = p2;
        return;
    }

    public final Object get(int p3)
    {
        com.google.android.gms.internal.common.zzr.zzb(p3, this.zzc, "index");
        Object v3_1 = this.zzb[p3];
        java.util.Objects.requireNonNull(v3_1);
        return v3_1;
    }

    public final int size()
    {
        return this.zzc;
    }

    public final Object[] zzb()
    {
        return this.zzb;
    }

    public final int zzc()
    {
        return 0;
    }

    public final int zzd()
    {
        return this.zzc;
    }

    public final boolean zzf()
    {
        return 0;
    }

    public final int zzg(Object[] p3, int p4)
    {
        int v0 = this.zzc;
        System.arraycopy(this.zzb, 0, p3, 0, v0);
        return v0;
    }
}
