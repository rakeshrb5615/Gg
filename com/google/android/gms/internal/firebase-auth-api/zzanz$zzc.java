package com.google.android.gms.internal.firebase-auth-api;
abstract class zzanz$zzc {
    sun.misc.Unsafe zza;

    public zzanz$zzc(sun.misc.Unsafe p1)
    {
        this.zza = p1;
        return;
    }

    public abstract double zza();

    public abstract void zza();

    public abstract void zza();

    public abstract void zza();

    public final void zza(Object p2, long p3, int p5)
    {
        this.zza.putInt(p2, p3, p5);
        return;
    }

    public final void zza(Object p7, long p8, long p10)
    {
        this.zza.putLong(p7, p8, p10);
        return;
    }

    public abstract void zza();

    public final boolean zza()
    {
        Class v2_0 = this.zza;
        if (v2_0 != null) {
            try {
                Class v2_1 = v2_0.getClass();
                v2_1.getMethod("objectFieldOffset", new Class[] {reflect.Field}));
                v2_1.getMethod("arrayBaseOffset", new Class[] {Class}));
                v2_1.getMethod("arrayIndexScale", new Class[] {Class}));
                Class v4_2 = Long.TYPE;
                v2_1.getMethod("getInt", new Class[] {Object, v4_2}));
                v2_1.getMethod("putInt", new Class[] {Object, v4_2, Integer.TYPE}));
                v2_1.getMethod("getLong", new Class[] {Object, v4_2}));
                v2_1.getMethod("putLong", new Class[] {Object, v4_2, v4_2}));
                v2_1.getMethod("getObject", new Class[] {Object, v4_2}));
                v2_1.getMethod("putObject", new Class[] {Object, v4_2, Object}));
                return 1;
            } catch (Throwable v0_9) {
                com.google.android.gms.internal.firebase-auth-api.zzanz.zza(v0_9);
                return 0;
            }
        } else {
            return 0;
        }
    }

    public abstract float zzb();

    public final boolean zzb()
    {
        int v0_0 = this.zza;
        if (v0_0 != 0) {
            try {
                int v0_4 = v0_0.getClass();
                v0_4.getMethod("objectFieldOffset", new Class[] {reflect.Field}));
                v0_4.getMethod("getLong", new Class[] {Object, Long.TYPE}));
            } catch (int v0_2) {
                com.google.android.gms.internal.firebase-auth-api.zzanz.zza(v0_2);
                return 0;
            }
            if (com.google.android.gms.internal.firebase-auth-api.zzanz.zza() != null) {
                return 1;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }

    public abstract boolean zzc();

    public final int zzd(Object p2, long p3)
    {
        return this.zza.getInt(p2, p3);
    }

    public final long zze(Object p2, long p3)
    {
        return this.zza.getLong(p2, p3);
    }
}
