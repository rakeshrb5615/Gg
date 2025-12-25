package com.google.android.gms.common.util;
public final class zzd {

    public static android.os.StrictMode$VmPolicy zza()
    {
        android.os.StrictMode$VmPolicy v0 = android.os.StrictMode.getVmPolicy();
        if (com.google.android.gms.common.util.PlatformVersion.isAtLeastS()) {
            android.os.StrictMode.setVmPolicy(com.google.android.gms.common.util.zzc.zza(new android.os.StrictMode$VmPolicy$Builder(v0)).build());
        }
        return v0;
    }
}
