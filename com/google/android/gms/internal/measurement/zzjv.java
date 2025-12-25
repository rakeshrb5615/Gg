package com.google.android.gms.internal.measurement;
interface zzjv {

    public static Object zzh(com.google.android.gms.internal.measurement.zzju p2)
    {
        try {
            Throwable v2_1 = p2.zza();
            return v2_1;
        } catch (SecurityException) {
            long v0 = android.os.Binder.clearCallingIdentity();
            try {
                Throwable v2_2 = v2_1.zza();
                android.os.Binder.restoreCallingIdentity(v0);
                return v2_2;
            } catch (Throwable v2_3) {
                android.os.Binder.restoreCallingIdentity(v0);
                throw v2_3;
            }
        }
    }

    public abstract Object zze();
}
