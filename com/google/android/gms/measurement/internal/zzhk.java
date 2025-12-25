package com.google.android.gms.measurement.internal;
public final class zzhk {
    final com.google.android.gms.measurement.internal.zzic zza;

    public zzhk(com.google.android.gms.measurement.internal.zzpg p1)
    {
        this.zza = p1.zzag();
        return;
    }

    public final boolean zza()
    {
        int v0 = 0;
        int v1_0 = this.zza;
        com.google.android.gms.measurement.internal.zzgs v2_6 = com.google.android.gms.common.wrappers.Wrappers.packageManager(v1_0.zzaY());
        if (v2_6 != null) {
            if (v2_6.getPackageInfo("com.android.vending", 128).versionCode >= 80837300) {
                v0 = 1;
            }
            return v0;
        } else {
            v1_0.zzaV().zzk().zza("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return 0;
        }
    }
}
