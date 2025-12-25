package com.google.android.gms.internal.measurement;
public final class zzji {
    private static com.google.android.gms.internal.measurement.zzjh zza;

    public static declared_synchronized void zza(com.google.android.gms.internal.measurement.zzjh p2)
    {
        try {
            if (com.google.android.gms.internal.measurement.zzji.zza != null) {
                throw new IllegalStateException("init() already called");
            } else {
                com.google.android.gms.internal.measurement.zzji.zza = p2;
                return;
            }
        } catch (IllegalStateException v2_3) {
            throw v2_3;
        }
    }

    public static declared_synchronized com.google.android.gms.internal.measurement.zzjh zzb()
    {
        if (com.google.android.gms.internal.measurement.zzji.zza == null) {
            com.google.android.gms.internal.measurement.zzji.zza(new com.google.android.gms.internal.measurement.zzjl());
        }
        return com.google.android.gms.internal.measurement.zzji.zza;
    }
}
