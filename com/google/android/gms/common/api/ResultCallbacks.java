package com.google.android.gms.common.api;
public abstract class ResultCallbacks implements com.google.android.gms.common.api.ResultCallback {

    public ResultCallbacks()
    {
        return;
    }

    public abstract void onFailure();

    public final void onResult(com.google.android.gms.common.api.Result p4)
    {
        RuntimeException v0_0 = p4.getStatus();
        if (!v0_0.isSuccess()) {
            this.onFailure(v0_0);
            if ((p4 instanceof com.google.android.gms.common.api.Releasable)) {
                try {
                    ((com.google.android.gms.common.api.Releasable) p4).release();
                    return;
                } catch (RuntimeException v0_1) {
                    android.util.Log.w("ResultCallbacks", "Unable to release ".concat(String.valueOf(p4)), v0_1);
                }
            }
            return;
        } else {
            this.onSuccess(p4);
            return;
        }
    }

    public abstract void onSuccess();
}
