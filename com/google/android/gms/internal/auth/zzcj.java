package com.google.android.gms.internal.auth;
public final synthetic class zzcj {

    public static Object zza(com.google.android.gms.internal.auth.zzck p2)
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
}
