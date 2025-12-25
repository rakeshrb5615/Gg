package com.google.android.gms.internal.measurement;
final class zznu {
    public static final synthetic int zza;
    private static final com.google.android.gms.internal.measurement.zznu zzb;
    private final com.google.android.gms.internal.measurement.zzny zzc;
    private final java.util.concurrent.ConcurrentMap zzd;

    static zznu()
    {
        com.google.android.gms.internal.measurement.zznu.zzb = new com.google.android.gms.internal.measurement.zznu();
        return;
    }

    private zznu()
    {
        this.zzd = new java.util.concurrent.ConcurrentHashMap();
        this.zzc = new com.google.android.gms.internal.measurement.zznd();
        return;
    }

    public static com.google.android.gms.internal.measurement.zznu zza()
    {
        return com.google.android.gms.internal.measurement.zznu.zzb;
    }

    public final com.google.android.gms.internal.measurement.zznx zzb(Class p4)
    {
        com.google.android.gms.internal.measurement.zzmp.zza(p4, "messageType");
        java.util.concurrent.ConcurrentMap v1 = this.zzd;
        com.google.android.gms.internal.measurement.zznx v2_1 = ((com.google.android.gms.internal.measurement.zznx) v1.get(p4));
        if (v2_1 == null) {
            v2_1 = this.zzc.zza(p4);
            com.google.android.gms.internal.measurement.zzmp.zza(p4, "messageType");
            com.google.android.gms.internal.measurement.zznx v4_2 = ((com.google.android.gms.internal.measurement.zznx) v1.putIfAbsent(p4, v2_1));
            if (v4_2 != null) {
                return v4_2;
            }
        }
        return v2_1;
    }
}
