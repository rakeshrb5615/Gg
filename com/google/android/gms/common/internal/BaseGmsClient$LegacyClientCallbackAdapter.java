package com.google.android.gms.common.internal;
public class BaseGmsClient$LegacyClientCallbackAdapter implements com.google.android.gms.common.internal.BaseGmsClient$ConnectionProgressReportCallbacks {
    final synthetic com.google.android.gms.common.internal.BaseGmsClient zza;

    public BaseGmsClient$LegacyClientCallbackAdapter(com.google.android.gms.common.internal.BaseGmsClient p1)
    {
        java.util.Objects.requireNonNull(p1);
        this.zza = p1;
        return;
    }

    public final void onReportServiceBinding(com.google.android.gms.common.ConnectionResult p3)
    {
        if (!p3.isSuccess()) {
            com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener v0_2 = this.zza;
            if (v0_2.zzl() != null) {
                v0_2.zzl().onConnectionFailed(p3);
            }
            return;
        } else {
            com.google.android.gms.common.internal.BaseGmsClient v3_1 = this.zza;
            v3_1.getRemoteService(0, v3_1.getScopes());
            return;
        }
    }
}
