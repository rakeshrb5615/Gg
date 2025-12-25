package com.google.android.gms.internal.play_billing;
final class zzhl extends com.google.android.gms.internal.play_billing.zzhn {

    public zzhl(sun.misc.Unsafe p1)
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
        if (!com.google.android.gms.internal.play_billing.zzho.zzb) {
            com.google.android.gms.internal.play_billing.zzho.zzj(p2, p3, p5);
            return;
        } else {
            com.google.android.gms.internal.play_billing.zzho.zzi(p2, p3, p5);
            return;
        }
    }

    public final void zzd(Object p2, long p3, byte p5)
    {
        if (!com.google.android.gms.internal.play_billing.zzho.zzb) {
            com.google.android.gms.internal.play_billing.zzho.zzl(p2, p3, p5);
            return;
        } else {
            com.google.android.gms.internal.play_billing.zzho.zzk(p2, p3, p5);
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
        if (!com.google.android.gms.internal.play_billing.zzho.zzb) {
            return com.google.android.gms.internal.play_billing.zzho.zzu(p2, p3);
        } else {
            return com.google.android.gms.internal.play_billing.zzho.zzt(p2, p3);
        }
    }
}
