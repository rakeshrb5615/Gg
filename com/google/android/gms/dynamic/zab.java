package com.google.android.gms.dynamic;
final class zab implements com.google.android.gms.dynamic.zah {
    final synthetic android.app.Activity zaa;
    final synthetic android.os.Bundle zab;
    final synthetic android.os.Bundle zac;
    final synthetic com.google.android.gms.dynamic.DeferredLifecycleHelper zad;

    public zab(com.google.android.gms.dynamic.DeferredLifecycleHelper p1, android.app.Activity p2, android.os.Bundle p3, android.os.Bundle p4)
    {
        this.zad = p1;
        this.zaa = p2;
        this.zab = p3;
        this.zac = p4;
        return;
    }

    public final int zaa()
    {
        return 0;
    }

    public final void zab(com.google.android.gms.dynamic.LifecycleDelegate p4)
    {
        com.google.android.gms.dynamic.DeferredLifecycleHelper.zaa(this.zad).onInflate(this.zaa, this.zab, this.zac);
        return;
    }
}
