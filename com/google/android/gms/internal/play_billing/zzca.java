package com.google.android.gms.internal.play_billing;
final class zzca extends com.google.android.gms.internal.play_billing.zzbt {
    static final com.google.android.gms.internal.play_billing.zzbt zza;
    final transient Object[] zzb;
    private final transient int zzc;

    static zzca()
    {
        Object[] v2 = new Object[0];
        com.google.android.gms.internal.play_billing.zzca.zza = new com.google.android.gms.internal.play_billing.zzca(v2, 0);
        return;
    }

    public zzca(Object[] p1, int p2)
    {
        this.zzb = p1;
        this.zzc = p2;
        return;
    }

    public final Object get(int p3)
    {
        com.google.android.gms.internal.play_billing.zzbg.zza(p3, this.zzc, "index");
        Object v3_1 = this.zzb[p3];
        java.util.Objects.requireNonNull(v3_1);
        return v3_1;
    }

    public final int size()
    {
        return this.zzc;
    }

    public final int zza(Object[] p3, int p4)
    {
        int v0 = this.zzc;
        System.arraycopy(this.zzb, 0, p3, 0, v0);
        return v0;
    }

    public final int zzb()
    {
        return this.zzc;
    }

    public final int zzc()
    {
        return 0;
    }

    public final boolean zzf()
    {
        return 0;
    }

    public final Object[] zzg()
    {
        return this.zzb;
    }
}
