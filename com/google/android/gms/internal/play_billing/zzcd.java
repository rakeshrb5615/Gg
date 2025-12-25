package com.google.android.gms.internal.play_billing;
final class zzcd extends com.google.android.gms.internal.play_billing.zzbx {
    private final transient com.google.android.gms.internal.play_billing.zzbw zza;
    private final transient com.google.android.gms.internal.play_billing.zzbt zzb;

    public zzcd(com.google.android.gms.internal.play_billing.zzbw p1, com.google.android.gms.internal.play_billing.zzbt p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final boolean contains(Object p2)
    {
        if (this.zza.get(p2) == null) {
            return 0;
        } else {
            return 1;
        }
    }

    public final synthetic java.util.Iterator iterator()
    {
        return this.zzb.zzn(0);
    }

    public final int size()
    {
        return this.zza.size();
    }

    public final int zza(Object[] p2, int p3)
    {
        return this.zzb.zza(p2, 0);
    }

    public final com.google.android.gms.internal.play_billing.zzbt zzd()
    {
        return this.zzb;
    }

    public final com.google.android.gms.internal.play_billing.zzch zze()
    {
        return this.zzb.zzn(0);
    }

    public final boolean zzf()
    {
        throw 0;
    }
}
