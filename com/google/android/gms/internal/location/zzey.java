package com.google.android.gms.internal.location;
final class zzey extends com.google.android.gms.internal.location.zzex {
    static final com.google.android.gms.internal.location.zzex zza;
    final transient Object[] zzb;
    private final transient int zzc;

    static zzey()
    {
        Object[] v2 = new Object[0];
        com.google.android.gms.internal.location.zzey.zza = new com.google.android.gms.internal.location.zzey(v2, 0);
        return;
    }

    public zzey(Object[] p1, int p2)
    {
        this.zzb = p1;
        this.zzc = p2;
        return;
    }

    public final Object get(int p3)
    {
        com.google.android.gms.internal.location.zzer.zzc(p3, this.zzc, "index");
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
        System.arraycopy(this.zzb, 0, p3, 0, this.zzc);
        return this.zzc;
    }
}
