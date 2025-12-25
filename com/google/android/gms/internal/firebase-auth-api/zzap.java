package com.google.android.gms.internal.firebase-auth-api;
final class zzap extends com.google.android.gms.internal.firebase-auth-api.zzah {
    static final com.google.android.gms.internal.firebase-auth-api.zzah zza;
    private final transient Object[] zzb;
    private final transient int zzc;

    static zzap()
    {
        Object[] v2 = new Object[0];
        com.google.android.gms.internal.firebase-auth-api.zzap.zza = new com.google.android.gms.internal.firebase-auth-api.zzap(v2, 0);
        return;
    }

    public zzap(Object[] p1, int p2)
    {
        this.zzb = p1;
        this.zzc = p2;
        return;
    }

    public final Object get(int p2)
    {
        com.google.android.gms.internal.firebase-auth-api.zzu.zza(p2, this.zzc);
        Object v2_1 = this.zzb[p2];
        java.util.Objects.requireNonNull(v2_1);
        return v2_1;
    }

    public final int size()
    {
        return this.zzc;
    }

    public final int zza()
    {
        return this.zzc;
    }

    public final int zza(Object[] p4, int p5)
    {
        System.arraycopy(this.zzb, 0, p4, p5, this.zzc);
        return (p5 + this.zzc);
    }

    public final int zzb()
    {
        return 0;
    }

    public final Object[] zze()
    {
        return this.zzb;
    }
}
