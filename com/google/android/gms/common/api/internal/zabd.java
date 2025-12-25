package com.google.android.gms.common.api.internal;
final class zabd extends com.google.android.gms.common.api.internal.zabw {
    private final ref.WeakReference zaa;

    public zabd(com.google.android.gms.common.api.internal.zabe p2)
    {
        this.zaa = new ref.WeakReference(p2);
        return;
    }

    public final void zaa()
    {
        com.google.android.gms.common.api.internal.zabe v0_2 = ((com.google.android.gms.common.api.internal.zabe) this.zaa.get());
        if (v0_2 != null) {
            com.google.android.gms.common.api.internal.zabe.zai(v0_2);
            return;
        } else {
            return;
        }
    }
}
