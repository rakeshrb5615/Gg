package com.google.android.gms.common.api.internal;
public class BasePendingResult$CallbackHandler extends com.google.android.gms.internal.base.zau {

    public BasePendingResult$CallbackHandler()
    {
        super(android.os.Looper.getMainLooper());
        return;
    }

    public BasePendingResult$CallbackHandler(android.os.Looper p1)
    {
        super(p1);
        return;
    }

    public final void handleMessage(android.os.Message p3)
    {
        RuntimeException v0_0 = p3.what;
        if (v0_0 == 1) {
            com.google.android.gms.common.api.internal.BasePendingResult v3_6 = ((android.util.Pair) p3.obj);
            com.google.android.gms.common.api.internal.BasePendingResult v3_8 = ((com.google.android.gms.common.api.Result) v3_6.second);
            try {
                ((com.google.android.gms.common.api.ResultCallback) v3_6.first).onResult(v3_8);
                return;
            } catch (RuntimeException v0_1) {
                com.google.android.gms.common.api.internal.BasePendingResult.zal(v3_8);
                throw v0_1;
            }
        } else {
            if (v0_0 == 2) {
                ((com.google.android.gms.common.api.internal.BasePendingResult) p3.obj).forceFailureUnlessReady(com.google.android.gms.common.api.Status.RESULT_TIMEOUT);
                return;
            } else {
                android.util.Log.wtf("BasePendingResult", g2.g.c(v0_0, "Don\'t know how to handle message: "), new Exception());
                return;
            }
        }
    }

    public final void zaa(com.google.android.gms.common.api.ResultCallback p2, com.google.android.gms.common.api.Result p3)
    {
        this.sendMessage(this.obtainMessage(1, new android.util.Pair(((com.google.android.gms.common.api.ResultCallback) com.google.android.gms.common.internal.Preconditions.checkNotNull(p2)), p3)));
        return;
    }
}
