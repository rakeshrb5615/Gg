package com.google.android.gms.internal.auth;
final class zzhf extends com.google.android.gms.internal.auth.zzhh {

    public zzhf(sun.misc.Unsafe p1)
    {
        super(p1);
        return;
    }

    public final double zza(Object p1, long p2)
    {
        return Double.longBitsToDouble(this.zzj(p1, p2));
    }

    public final float zzb(Object p1, long p2)
    {
        return Float.intBitsToFloat(this.zzi(p1, p2));
    }

    public final void zzc(Object p2, long p3, boolean p5)
    {
        if (!com.google.android.gms.internal.auth.zzhi.zza) {
            com.google.android.gms.internal.auth.zzhi.zzj(p2, p3, p5);
            return;
        } else {
            com.google.android.gms.internal.auth.zzhi.zzi(p2, p3, p5);
            return;
        }
    }

    public final void zzd(Object p7, long p8, double p10)
    {
        this.zzn(p7, p8, Double.doubleToLongBits(p10));
        return;
    }

    public final void zze(Object p1, long p2, float p4)
    {
        this.zzm(p1, p2, Float.floatToIntBits(p4));
        return;
    }

    public final boolean zzf(Object p2, long p3)
    {
        if (!com.google.android.gms.internal.auth.zzhi.zza) {
            return com.google.android.gms.internal.auth.zzhi.zzr(p2, p3);
        } else {
            return com.google.android.gms.internal.auth.zzhi.zzq(p2, p3);
        }
    }
}
