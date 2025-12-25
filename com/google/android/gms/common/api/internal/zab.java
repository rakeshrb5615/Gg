package com.google.android.gms.common.api.internal;
public final class zab extends com.google.android.gms.common.api.internal.ActivityLifecycleObserver {
    private final ref.WeakReference zaa;

    public zab(com.google.android.gms.common.api.internal.zaa p2)
    {
        this.zaa = new ref.WeakReference(p2);
        return;
    }

    public final com.google.android.gms.common.api.internal.ActivityLifecycleObserver onStopCallOnce(Runnable p2)
    {
        String v0_2 = ((com.google.android.gms.common.api.internal.zaa) this.zaa.get());
        if (v0_2 == null) {
            throw new IllegalStateException("The target activity has already been GC\'d");
        } else {
            com.google.android.gms.common.api.internal.zaa.zab(v0_2, p2);
            return this;
        }
    }
}
