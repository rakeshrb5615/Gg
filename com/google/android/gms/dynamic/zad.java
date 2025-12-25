package com.google.android.gms.dynamic;
final class zad implements com.google.android.gms.dynamic.zah {
    final synthetic android.widget.FrameLayout zaa;
    final synthetic android.view.LayoutInflater zab;
    final synthetic android.view.ViewGroup zac;
    final synthetic android.os.Bundle zad;
    final synthetic com.google.android.gms.dynamic.DeferredLifecycleHelper zae;

    public zad(com.google.android.gms.dynamic.DeferredLifecycleHelper p1, android.widget.FrameLayout p2, android.view.LayoutInflater p3, android.view.ViewGroup p4, android.os.Bundle p5)
    {
        this.zae = p1;
        this.zaa = p2;
        this.zab = p3;
        this.zac = p4;
        this.zad = p5;
        return;
    }

    public final int zaa()
    {
        return 2;
    }

    public final void zab(com.google.android.gms.dynamic.LifecycleDelegate p4)
    {
        this.zaa.removeAllViews();
        this.zaa.addView(com.google.android.gms.dynamic.DeferredLifecycleHelper.zaa(this.zae).onCreateView(this.zab, this.zac, this.zad));
        return;
    }
}
