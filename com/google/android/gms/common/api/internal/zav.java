package com.google.android.gms.common.api.internal;
final class zav implements java.lang.Runnable {
    final synthetic com.google.android.gms.common.api.internal.zaaa zaa;

    public zav(com.google.android.gms.common.api.internal.zaaa p1)
    {
        this.zaa = p1;
        return;
    }

    public final void run()
    {
        com.google.android.gms.common.api.internal.zaaa.zaj(this.zaa).lock();
        try {
            com.google.android.gms.common.api.internal.zaaa.zap(this.zaa);
            com.google.android.gms.common.api.internal.zaaa.zaj(this.zaa).unlock();
            return;
        } catch (Throwable v0_1) {
            com.google.android.gms.common.api.internal.zaaa.zaj(this.zaa).unlock();
            throw v0_1;
        }
    }
}
