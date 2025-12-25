package com.google.android.gms.internal.measurement;
public final class zzcf {
    private static final ThreadLocal zza;

    static zzcf()
    {
        com.google.android.gms.internal.measurement.zzcf.zza = new com.google.android.gms.internal.measurement.zzce();
        return;
    }

    public static android.content.SharedPreferences zza(android.content.Context p0, String p1, int p2, com.google.android.gms.internal.measurement.zzca p3)
    {
        Boolean v2_3;
        com.google.android.gms.internal.measurement.zzbv.zza();
        if (!p1.equals("")) {
            v2_3 = 0;
        } else {
            v2_3 = new com.google.android.gms.internal.measurement.zzcd();
        }
        if (v2_3 == null) {
            Boolean v2_5 = com.google.android.gms.internal.measurement.zzcf.zza;
            if (!((Boolean) v2_5.get()).booleanValue()) {
                throw new IllegalArgumentException();
            } else {
                v2_5.set(Boolean.FALSE);
                try {
                    Throwable v0_3 = p0.getSharedPreferences(p1, 0);
                    v2_5.set(Boolean.TRUE);
                    return v0_3;
                } catch (Throwable v0_4) {
                    com.google.android.gms.internal.measurement.zzcf.zza.set(Boolean.TRUE);
                    throw v0_4;
                }
            }
        } else {
            return v2_3;
        }
    }
}
