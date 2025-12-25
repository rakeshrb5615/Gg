package com.google.android.gms.common.api.internal;
abstract class zabg {
    private final com.google.android.gms.common.api.internal.zabf zaa;

    public zabg(com.google.android.gms.common.api.internal.zabf p1)
    {
        this.zaa = p1;
        return;
    }

    public abstract void zaa();

    public final void zab(com.google.android.gms.common.api.internal.zabi p3)
    {
        com.google.android.gms.common.api.internal.zabi.zah(p3).lock();
        try {
            if (com.google.android.gms.common.api.internal.zabi.zag(p3) == this.zaa) {
                this.zaa();
            }
        } catch (Throwable v0_2) {
            com.google.android.gms.common.api.internal.zabi.zah(p3).unlock();
            throw v0_2;
        }
        com.google.android.gms.common.api.internal.zabi.zah(p3).unlock();
        return;
    }
}
