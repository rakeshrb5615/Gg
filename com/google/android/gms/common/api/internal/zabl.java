package com.google.android.gms.common.api.internal;
final class zabl implements com.google.android.gms.common.api.internal.BackgroundDetector$BackgroundStateChangeListener {
    final synthetic com.google.android.gms.common.api.internal.GoogleApiManager zaa;

    public zabl(com.google.android.gms.common.api.internal.GoogleApiManager p1)
    {
        this.zaa = p1;
        return;
    }

    public final void onBackgroundStateChanged(boolean p4)
    {
        android.os.Handler v0_0 = this.zaa;
        com.google.android.gms.common.api.internal.GoogleApiManager.zad(v0_0).sendMessage(com.google.android.gms.common.api.internal.GoogleApiManager.zad(v0_0).obtainMessage(1, Boolean.valueOf(p4)));
        return;
    }
}
