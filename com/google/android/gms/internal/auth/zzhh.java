package com.google.android.gms.internal.auth;
abstract class zzhh {
    final sun.misc.Unsafe zza;

    public zzhh(sun.misc.Unsafe p1)
    {
        this.zza = p1;
        return;
    }

    public abstract double zza();

    public abstract float zzb();

    public abstract void zzc();

    public abstract void zzd();

    public abstract void zze();

    public abstract boolean zzf();

    public final int zzg(Class p2)
    {
        return this.zza.arrayBaseOffset(p2);
    }

    public final int zzh(Class p2)
    {
        return this.zza.arrayIndexScale(p2);
    }

    public final int zzi(Object p2, long p3)
    {
        return this.zza.getInt(p2, p3);
    }

    public final long zzj(Object p2, long p3)
    {
        return this.zza.getLong(p2, p3);
    }

    public final long zzk(reflect.Field p3)
    {
        return this.zza.objectFieldOffset(p3);
    }

    public final Object zzl(Object p2, long p3)
    {
        return this.zza.getObject(p2, p3);
    }

    public final void zzm(Object p2, long p3, int p5)
    {
        this.zza.putInt(p2, p3, p5);
        return;
    }

    public final void zzn(Object p7, long p8, long p10)
    {
        this.zza.putLong(p7, p8, p10);
        return;
    }

    public final void zzo(Object p2, long p3, Object p5)
    {
        this.zza.putObject(p2, p3, p5);
        return;
    }
}
