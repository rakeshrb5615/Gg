package com.google.android.gms.internal.play_billing;
final class zzcc extends com.google.android.gms.internal.play_billing.zzbx {
    private final transient com.google.android.gms.internal.play_billing.zzbw zza;
    private final transient Object[] zzb;
    private final transient int zzc;

    public zzcc(com.google.android.gms.internal.play_billing.zzbw p1, Object[] p2, int p3, int p4)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p4;
        return;
    }

    public static bridge synthetic int zzi(com.google.android.gms.internal.play_billing.zzcc p0)
    {
        return p0.zzc;
    }

    public static bridge synthetic Object[] zzj(com.google.android.gms.internal.play_billing.zzcc p0)
    {
        return p0.zzb;
    }

    public final boolean contains(Object p4)
    {
        if ((p4 instanceof java.util.Map$Entry)) {
            Object v0_2 = ((java.util.Map$Entry) p4).getKey();
            int v4_4 = ((java.util.Map$Entry) p4).getValue();
            if ((v4_4 != 0) && (v4_4.equals(this.zza.get(v0_2)))) {
                return 1;
            }
        }
        return 0;
    }

    public final synthetic java.util.Iterator iterator()
    {
        return this.zzd().zzn(0);
    }

    public final int size()
    {
        return this.zzc;
    }

    public final int zza(Object[] p2, int p3)
    {
        return this.zzd().zza(p2, 0);
    }

    public final com.google.android.gms.internal.play_billing.zzch zze()
    {
        return this.zzd().zzn(0);
    }

    public final boolean zzf()
    {
        throw 0;
    }

    public final com.google.android.gms.internal.play_billing.zzbt zzh()
    {
        return new com.google.android.gms.internal.play_billing.zzcb(this);
    }
}
