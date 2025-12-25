package com.google.android.gms.internal.fido;
final class zzay extends com.google.android.gms.internal.fido.zzaz {
    final transient int zza;
    final transient int zzb;
    final synthetic com.google.android.gms.internal.fido.zzaz zzc;

    public zzay(com.google.android.gms.internal.fido.zzaz p1, int p2, int p3)
    {
        this.zzc = p1;
        this.zza = p2;
        this.zzb = p3;
        return;
    }

    public final Object get(int p3)
    {
        com.google.android.gms.internal.fido.zzap.zza(p3, this.zzb, "index");
        return this.zzc.get((p3 + this.zza));
    }

    public final int size()
    {
        return this.zzb;
    }

    public final bridge synthetic java.util.List subList(int p1, int p2)
    {
        return this.zzg(p1, p2);
    }

    public final int zzb()
    {
        return ((this.zzc.zzc() + this.zza) + this.zzb);
    }

    public final int zzc()
    {
        return (this.zzc.zzc() + this.zza);
    }

    public final Object[] zze()
    {
        return this.zzc.zze();
    }

    public final com.google.android.gms.internal.fido.zzaz zzg(int p3, int p4)
    {
        com.google.android.gms.internal.fido.zzap.zze(p3, p4, this.zzb);
        int v1 = this.zza;
        return this.zzc.zzg((p3 + v1), (p4 + v1));
    }
}
