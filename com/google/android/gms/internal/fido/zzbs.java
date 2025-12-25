package com.google.android.gms.internal.fido;
final class zzbs extends com.google.android.gms.internal.fido.zzaz {
    static final com.google.android.gms.internal.fido.zzaz zza;
    final transient Object[] zzb;
    private final transient int zzc;

    static zzbs()
    {
        Object[] v2 = new Object[0];
        com.google.android.gms.internal.fido.zzbs.zza = new com.google.android.gms.internal.fido.zzbs(v2, 0);
        return;
    }

    public zzbs(Object[] p1, int p2)
    {
        this.zzb = p1;
        this.zzc = p2;
        return;
    }

    public final Object get(int p3)
    {
        com.google.android.gms.internal.fido.zzap.zza(p3, this.zzc, "index");
        Object v3_1 = this.zzb[p3];
        v3_1.getClass();
        return v3_1;
    }

    public final int size()
    {
        return this.zzc;
    }

    public final int zza(Object[] p3, int p4)
    {
        System.arraycopy(this.zzb, 0, p3, 0, this.zzc);
        return this.zzc;
    }

    public final int zzb()
    {
        return this.zzc;
    }

    public final int zzc()
    {
        return 0;
    }

    public final Object[] zze()
    {
        return this.zzb;
    }
}
