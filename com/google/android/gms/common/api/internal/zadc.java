package com.google.android.gms.common.api.internal;
public final class zadc {
    public static final com.google.android.gms.common.api.Status zaa;
    final java.util.Set zab;
    private final com.google.android.gms.common.api.internal.zadb zac;

    static zadc()
    {
        com.google.android.gms.common.api.internal.zadc.zaa = new com.google.android.gms.common.api.Status(8, "The connection to Google Play services was lost");
        return;
    }

    public zadc()
    {
        this.zab = java.util.Collections.synchronizedSet(java.util.Collections.newSetFromMap(new java.util.WeakHashMap()));
        this.zac = new com.google.android.gms.common.api.internal.zadb(this);
        return;
    }

    public final void zaa(com.google.android.gms.common.api.internal.BasePendingResult p2)
    {
        this.zab.add(p2);
        p2.zan(this.zac);
        return;
    }

    public final void zab()
    {
        int v1 = 0;
        int v2_0 = new com.google.android.gms.common.api.internal.BasePendingResult[0];
        com.google.android.gms.common.api.internal.BasePendingResult[] v0_2 = ((com.google.android.gms.common.api.internal.BasePendingResult[]) this.zab.toArray(v2_0));
        int v2_1 = v0_2.length;
        while (v1 < v2_1) {
            com.google.android.gms.common.api.internal.BasePendingResult v3 = v0_2[v1];
            v3.zan(0);
            if (v3.zam()) {
                this.zab.remove(v3);
            }
            v1++;
        }
        return;
    }
}
