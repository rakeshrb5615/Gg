package com.google.android.gms.internal.measurement;
public final class zzkb {
    public static final synthetic int zza;
    private static final r.e zzb;

    static zzkb()
    {
        com.google.android.gms.internal.measurement.zzkb.zzb = new r.e(0);
        return;
    }

    public static declared_synchronized android.net.Uri zza(String p4)
    {
        Throwable v0_0 = com.google.android.gms.internal.measurement.zzkb.zzb;
        android.net.Uri v2_5 = ((android.net.Uri) v0_0.get("com.google.android.gms.measurement"));
        if (v2_5 != null) {
            return v2_5;
        } else {
            android.net.Uri v2_3 = android.net.Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(android.net.Uri.encode("com.google.android.gms.measurement"))));
            v0_0.put("com.google.android.gms.measurement", v2_3);
            return v2_3;
        }
    }
}
