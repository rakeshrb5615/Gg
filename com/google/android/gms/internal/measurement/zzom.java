package com.google.android.gms.internal.measurement;
final class zzom extends com.google.android.gms.internal.measurement.zzoo {

    public zzom(sun.misc.Unsafe p1)
    {
        super(p1);
        return;
    }

    public final void zza(Object p2, long p3, byte p5)
    {
        if (!com.google.android.gms.internal.measurement.zzop.zzb) {
            com.google.android.gms.internal.measurement.zzop.zzt(p2, p3, p5);
            return;
        } else {
            com.google.android.gms.internal.measurement.zzop.zzs(p2, p3, p5);
            return;
        }
    }

    public final boolean zzb(Object p2, long p3)
    {
        if (!com.google.android.gms.internal.measurement.zzop.zzb) {
            return com.google.android.gms.internal.measurement.zzop.zzv(p2, p3);
        } else {
            return com.google.android.gms.internal.measurement.zzop.zzu(p2, p3);
        }
    }

    public final void zzc(Object p2, long p3, boolean p5)
    {
        if (!com.google.android.gms.internal.measurement.zzop.zzb) {
            com.google.android.gms.internal.measurement.zzop.zzx(p2, p3, p5);
            return;
        } else {
            com.google.android.gms.internal.measurement.zzop.zzw(p2, p3, p5);
            return;
        }
    }

    public final float zzd(Object p2, long p3)
    {
        return Float.intBitsToFloat(this.zza.getInt(p2, p3));
    }

    public final void zze(Object p2, long p3, float p5)
    {
        this.zza.putInt(p2, p3, Float.floatToIntBits(p5));
        return;
    }

    public final double zzf(Object p2, long p3)
    {
        return Double.longBitsToDouble(this.zza.getLong(p2, p3));
    }

    public final void zzg(Object p7, long p8, double p10)
    {
        this.zza.putLong(p7, p8, Double.doubleToLongBits(p10));
        return;
    }
}
