package com.google.android.gms.common.internal;
public final class RootTelemetryConfigManager {
    private static com.google.android.gms.common.internal.RootTelemetryConfigManager zza;
    private static final com.google.android.gms.common.internal.RootTelemetryConfiguration zzb;
    private com.google.android.gms.common.internal.RootTelemetryConfiguration zzc;

    static RootTelemetryConfigManager()
    {
        com.google.android.gms.common.internal.RootTelemetryConfigManager.zzb = new com.google.android.gms.common.internal.RootTelemetryConfiguration(0, 0, 0, 0, 0);
        return;
    }

    private RootTelemetryConfigManager()
    {
        return;
    }

    public static declared_synchronized com.google.android.gms.common.internal.RootTelemetryConfigManager getInstance()
    {
        if (com.google.android.gms.common.internal.RootTelemetryConfigManager.zza == null) {
            com.google.android.gms.common.internal.RootTelemetryConfigManager.zza = new com.google.android.gms.common.internal.RootTelemetryConfigManager();
        }
        return com.google.android.gms.common.internal.RootTelemetryConfigManager.zza;
    }

    public com.google.android.gms.common.internal.RootTelemetryConfiguration getConfig()
    {
        return this.zzc;
    }

    public final declared_synchronized void zza(com.google.android.gms.common.internal.RootTelemetryConfiguration p3)
    {
        if (p3 != null) {
            int v0_0 = this.zzc;
            if ((v0_0 != 0) && (v0_0.getVersion() >= p3.getVersion())) {
                return;
            } else {
                this.zzc = p3;
                return;
            }
        } else {
            this.zzc = com.google.android.gms.common.internal.RootTelemetryConfigManager.zzb;
            return;
        }
    }
}
