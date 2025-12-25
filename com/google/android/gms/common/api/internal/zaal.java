package com.google.android.gms.common.api.internal;
final class zaal implements com.google.android.gms.common.internal.BaseGmsClient$ConnectionProgressReportCallbacks {
    private final ref.WeakReference zaa;
    private final com.google.android.gms.common.api.Api zab;
    private final boolean zac;

    public zaal(com.google.android.gms.common.api.internal.zaaw p2, com.google.android.gms.common.api.Api p3, boolean p4)
    {
        this.zaa = new ref.WeakReference(p2);
        this.zab = p3;
        this.zac = p4;
        return;
    }

    public static bridge synthetic boolean zaa(com.google.android.gms.common.api.internal.zaal p0)
    {
        return p0.zac;
    }

    public final void onReportServiceBinding(com.google.android.gms.common.ConnectionResult p5)
    {
        java.util.concurrent.locks.Lock v0_2 = ((com.google.android.gms.common.api.internal.zaaw) this.zaa.get());
        if (v0_2 != null) {
            com.google.android.gms.common.api.Api v1_0;
            if (android.os.Looper.myLooper() != com.google.android.gms.common.api.internal.zaaw.zak(v0_2).zag.getLooper()) {
                v1_0 = 0;
            } else {
                v1_0 = 1;
            }
            com.google.android.gms.common.internal.Preconditions.checkState(v1_0, "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            com.google.android.gms.common.api.internal.zaaw.zap(v0_2).lock();
            if (com.google.android.gms.common.api.internal.zaaw.zaw(v0_2, 0)) {
                if (!p5.isSuccess()) {
                    com.google.android.gms.common.api.internal.zaaw.zat(v0_2, p5, this.zab, this.zac);
                }
                if (com.google.android.gms.common.api.internal.zaaw.zax(v0_2)) {
                    com.google.android.gms.common.api.internal.zaaw.zau(v0_2);
                }
            } else {
            }
            com.google.android.gms.common.api.internal.zaaw.zap(v0_2).unlock();
            return;
        } else {
            return;
        }
    }
}
