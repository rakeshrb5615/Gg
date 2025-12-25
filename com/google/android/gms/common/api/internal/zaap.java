package com.google.android.gms.common.api.internal;
final class zaap extends com.google.android.gms.common.api.internal.zaav {
    final synthetic com.google.android.gms.common.api.internal.zaaw zaa;
    private final java.util.ArrayList zac;

    public zaap(com.google.android.gms.common.api.internal.zaaw p2, java.util.ArrayList p3)
    {
        this.zaa = p2;
        super(p2, 0);
        super.zac = p3;
        return;
    }

    public final void zaa()
    {
        java.util.ArrayList v0_0 = this.zaa;
        com.google.android.gms.common.api.internal.zaaw.zak(v0_0).zag.zad = com.google.android.gms.common.api.internal.zaaw.zao(v0_0);
        java.util.ArrayList v0_2 = this.zac;
        int v1_2 = v0_2.size();
        int v2 = 0;
        while (v2 < v1_2) {
            java.util.Set v4_0 = this.zaa;
            ((com.google.android.gms.common.api.Api$Client) v0_2.get(v2)).getRemoteService(com.google.android.gms.common.api.internal.zaaw.zam(v4_0), com.google.android.gms.common.api.internal.zaaw.zak(v4_0).zag.zad);
            v2++;
        }
        return;
    }
}
