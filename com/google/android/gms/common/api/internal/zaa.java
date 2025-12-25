package com.google.android.gms.common.api.internal;
final class zaa extends com.google.android.gms.common.api.internal.LifecycleCallback {
    private java.util.List zaa;

    private zaa(com.google.android.gms.common.api.internal.LifecycleFragment p2)
    {
        super(p2);
        super.zaa = new java.util.ArrayList();
        super.mLifecycleFragment.addCallback("LifecycleObserverOnStop", super);
        return;
    }

    public static bridge synthetic com.google.android.gms.common.api.internal.zaa zaa(android.app.Activity p3)
    {
        Throwable v0_0 = com.google.android.gms.common.api.internal.LifecycleCallback.getFragment(p3);
        com.google.android.gms.common.api.internal.zaa v1_2 = ((com.google.android.gms.common.api.internal.zaa) v0_0.getCallbackOrNull("LifecycleObserverOnStop", com.google.android.gms.common.api.internal.zaa));
        if (v1_2 == null) {
            v1_2 = new com.google.android.gms.common.api.internal.zaa(v0_0);
        }
        return v1_2;
    }

    public static bridge synthetic void zab(com.google.android.gms.common.api.internal.zaa p0, Runnable p1)
    {
        p0.zac(p1);
        return;
    }

    private final declared_synchronized void zac(Runnable p2)
    {
        this.zaa.add(p2);
        return;
    }

    public final void onStop()
    {
        Throwable v0_0 = this.zaa;
        this.zaa = new java.util.ArrayList();
        Throwable v0_1 = v0_0.iterator();
        while (v0_1.hasNext()) {
            ((Runnable) v0_1.next()).run();
        }
        return;
    }
}
