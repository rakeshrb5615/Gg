package com.google.android.gms.internal.play_billing;
final class zzbs extends com.google.android.gms.internal.play_billing.zzbt {
    final transient int zza;
    final transient int zzb;
    final synthetic com.google.android.gms.internal.play_billing.zzbt zzc;

    public zzbs(com.google.android.gms.internal.play_billing.zzbt p1, int p2, int p3)
    {
        java.util.Objects.requireNonNull(p1);
        this.zzc = p1;
        this.zza = p2;
        this.zzb = p3;
        return;
    }

    public final Object get(int p3)
    {
        com.google.android.gms.internal.play_billing.zzbg.zza(p3, this.zzb, "index");
        return this.zzc.get((p3 + this.zza));
    }

    public final int size()
    {
        return this.zzb;
    }

    public final bridge synthetic java.util.List subList(int p1, int p2)
    {
        return this.zzh(p1, p2);
    }

    public final int zzb()
    {
        return ((this.zzc.zzc() + this.zza) + this.zzb);
    }

    public final int zzc()
    {
        return (this.zzc.zzc() + this.zza);
    }

    public final boolean zzf()
    {
        return 1;
    }

    public final Object[] zzg()
    {
        return this.zzc.zzg();
    }

    public final com.google.android.gms.internal.play_billing.zzbt zzh(int p3, int p4)
    {
        com.google.android.gms.internal.play_billing.zzbg.zzd(p3, p4, this.zzb);
        int v0_1 = this.zza;
        return this.zzc.zzh((p3 + v0_1), (p4 + v0_1));
    }
}
