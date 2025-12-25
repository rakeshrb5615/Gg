package com.google.android.gms.common.internal;
public final class zzg extends com.google.android.gms.common.internal.zza {
    final synthetic com.google.android.gms.common.internal.BaseGmsClient zze;

    public zzg(com.google.android.gms.common.internal.BaseGmsClient p1, int p2, android.os.Bundle p3)
    {
        java.util.Objects.requireNonNull(p1);
        this.zze = p1;
        super(p1, p2, p3);
        return;
    }

    public final boolean zza()
    {
        this.zze.zzc.onReportServiceBinding(com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS);
        return 1;
    }

    public final void zzb(com.google.android.gms.common.ConnectionResult p3)
    {
        com.google.android.gms.common.internal.BaseGmsClient v0 = this.zze;
        if ((!v0.enableLocalFallback()) || (!v0.zzg())) {
            v0.zzc.onReportServiceBinding(p3);
            v0.onConnectionFailed(p3);
            return;
        } else {
            v0.zzf(16);
            return;
        }
    }
}
