package com.google.android.gms.internal.play_billing;
final class zzce extends com.google.android.gms.internal.play_billing.zzbt {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc;

    public zzce(Object[] p1, int p2, int p3)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        return;
    }

    public final Object get(int p3)
    {
        com.google.android.gms.internal.play_billing.zzbg.zza(p3, this.zzc, "index");
        Object v3_3 = this.zza[((p3 + p3) + this.zzb)];
        java.util.Objects.requireNonNull(v3_3);
        return v3_3;
    }

    public final int size()
    {
        return this.zzc;
    }

    public final boolean zzf()
    {
        return 1;
    }
}
