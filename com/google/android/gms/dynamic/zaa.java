package com.google.android.gms.dynamic;
final class zaa implements com.google.android.gms.dynamic.OnDelegateCreatedListener {
    final synthetic com.google.android.gms.dynamic.DeferredLifecycleHelper zaa;

    public zaa(com.google.android.gms.dynamic.DeferredLifecycleHelper p1)
    {
        this.zaa = p1;
        return;
    }

    public final void onDelegateCreated(com.google.android.gms.dynamic.LifecycleDelegate p3)
    {
        com.google.android.gms.dynamic.DeferredLifecycleHelper.zac(this.zaa, p3);
        com.google.android.gms.dynamic.DeferredLifecycleHelper v3_6 = com.google.android.gms.dynamic.DeferredLifecycleHelper.zab(this.zaa).iterator();
        while (v3_6.hasNext()) {
            ((com.google.android.gms.dynamic.zah) v3_6.next()).zab(com.google.android.gms.dynamic.DeferredLifecycleHelper.zaa(this.zaa));
        }
        com.google.android.gms.dynamic.DeferredLifecycleHelper.zab(this.zaa).clear();
        com.google.android.gms.dynamic.DeferredLifecycleHelper.zad(this.zaa, 0);
        return;
    }
}
