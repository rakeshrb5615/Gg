package com.google.android.gms.common.api.internal;
abstract class zaav implements java.lang.Runnable {
    final synthetic com.google.android.gms.common.api.internal.zaaw zab;

    public synthetic zaav(com.google.android.gms.common.api.internal.zaaw p1, com.google.android.gms.common.api.internal.zaau p2)
    {
        this.zab = p1;
        return;
    }

    public final void run()
    {
        com.google.android.gms.common.api.internal.zaaw.zap(this.zab).lock();
        try {
            if (!Thread.interrupted()) {
                this.zaa();
            }
        } catch (java.util.concurrent.locks.Lock v0_6) {
            com.google.android.gms.common.api.internal.zaaw.zak(this.zab).zam(v0_6);
        } catch (java.util.concurrent.locks.Lock v0_1) {
            com.google.android.gms.common.api.internal.zaaw.zap(this.zab).unlock();
            throw v0_1;
        }
        com.google.android.gms.common.api.internal.zaaw.zap(this.zab).unlock();
        return;
    }

    public abstract void zaa();
}
