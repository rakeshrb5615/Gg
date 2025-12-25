package com.google.android.recaptcha.internal;
final class zzpp extends com.google.android.recaptcha.internal.zzpr {

    public zzpp(sun.misc.Unsafe p1)
    {
        super(p1);
        return;
    }

    public final double zza(Object p2, long p3)
    {
        return Double.longBitsToDouble(this.zza.getLong(p2, p3));
    }

    public final float zzb(Object p2, long p3)
    {
        return Float.intBitsToFloat(this.zza.getInt(p2, p3));
    }

    public final void zzc(Object p2, long p3, boolean p5)
    {
        if (!com.google.android.recaptcha.internal.zzps.zzb) {
            com.google.android.recaptcha.internal.zzps.zzj(p2, p3, p5);
            return;
        } else {
            com.google.android.recaptcha.internal.zzps.zzi(p2, p3, p5);
            return;
        }
    }

    public final void zzd(Object p2, long p3, byte p5)
    {
        if (!com.google.android.recaptcha.internal.zzps.zzb) {
            com.google.android.recaptcha.internal.zzps.zzl(p2, p3, p5);
            return;
        } else {
            com.google.android.recaptcha.internal.zzps.zzk(p2, p3, p5);
            return;
        }
    }

    public final void zze(Object p7, long p8, double p10)
    {
        this.zza.putLong(p7, p8, Double.doubleToLongBits(p10));
        return;
    }

    public final void zzf(Object p2, long p3, float p5)
    {
        this.zza.putInt(p2, p3, Float.floatToIntBits(p5));
        return;
    }

    public final boolean zzg(Object p2, long p3)
    {
        if (!com.google.android.recaptcha.internal.zzps.zzb) {
            return com.google.android.recaptcha.internal.zzps.zzu(p2, p3);
        } else {
            return com.google.android.recaptcha.internal.zzps.zzt(p2, p3);
        }
    }
}
