package com.google.android.gms.common.api.internal;
final class zaar extends com.google.android.gms.signin.internal.zac {
    private final ref.WeakReference zaa;

    public zaar(com.google.android.gms.common.api.internal.zaaw p2)
    {
        this.zaa = new ref.WeakReference(p2);
        return;
    }

    public final void zab(com.google.android.gms.signin.internal.zak p4)
    {
        com.google.android.gms.common.api.internal.zaaw v0_2 = ((com.google.android.gms.common.api.internal.zaaw) this.zaa.get());
        if (v0_2 != null) {
            com.google.android.gms.common.api.internal.zaaw.zak(v0_2).zal(new com.google.android.gms.common.api.internal.zaaq(this, v0_2, v0_2, p4));
            return;
        } else {
            return;
        }
    }
}
