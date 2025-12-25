package com.google.android.gms.measurement.internal;
final synthetic class zzhr implements java.util.concurrent.Callable {
    private final synthetic com.google.android.gms.measurement.internal.zzht zza;
    private final synthetic String zzb;

    public synthetic zzhr(com.google.android.gms.measurement.internal.zzht p1, String p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final synthetic Object call()
    {
        Long v0_0 = this.zza;
        String v2_3 = this.zzb;
        String v1_3 = v0_0.zzg.zzj().zzu(v2_3);
        java.util.HashMap v3_1 = new java.util.HashMap();
        v3_1.put("platform", "android");
        v3_1.put("package_name", v2_3);
        v0_0.zzu.zzc().zzi();
        v3_1.put("gmp_version", Long.valueOf(133005));
        if (v1_3 != null) {
            Long v0_4 = v1_3.zzr();
            if (v0_4 != null) {
                v3_1.put("app_version", v0_4);
            }
            v3_1.put("app_version_int", Long.valueOf(v1_3.zzt()));
            v3_1.put("dynamite_version", Long.valueOf(v1_3.zzB()));
        }
        return v3_1;
    }
}
