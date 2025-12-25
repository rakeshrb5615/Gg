package com.google.android.gms.common.api;
public abstract class ResolvingResultCallbacks extends com.google.android.gms.common.api.ResultCallbacks {
    private final android.app.Activity zza;
    private final int zzb;

    public ResolvingResultCallbacks(android.app.Activity p2, int p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2, "Activity must not be null");
        this.zza = p2;
        this.zzb = p3;
        return;
    }

    public final void onFailure(com.google.android.gms.common.api.Status p3)
    {
        if (!p3.hasResolution()) {
            this.onUnresolvableFailure(p3);
            return;
        } else {
            try {
                p3.startResolutionForResult(this.zza, this.zzb);
                return;
            } catch (com.google.android.gms.common.api.Status v3_3) {
                android.util.Log.e("ResolvingResultCallback", "Failed to start resolution", v3_3);
                this.onUnresolvableFailure(new com.google.android.gms.common.api.Status(8));
                return;
            }
        }
    }

    public abstract void onSuccess();

    public abstract void onUnresolvableFailure();
}
