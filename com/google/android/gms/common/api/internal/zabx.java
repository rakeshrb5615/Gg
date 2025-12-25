package com.google.android.gms.common.api.internal;
public final class zabx extends android.content.BroadcastReceiver {
    android.content.Context zaa;
    private final com.google.android.gms.common.api.internal.zabw zab;

    public zabx(com.google.android.gms.common.api.internal.zabw p1)
    {
        this.zab = p1;
        return;
    }

    public final void onReceive(android.content.Context p1, android.content.Intent p2)
    {
        com.google.android.gms.common.api.internal.zabw v1_2;
        com.google.android.gms.common.api.internal.zabw v1_0 = p2.getData();
        if (v1_0 == null) {
            v1_2 = 0;
        } else {
            v1_2 = v1_0.getSchemeSpecificPart();
        }
        if ("com.google.android.gms".equals(v1_2)) {
            this.zab.zaa();
            this.zab();
        }
        return;
    }

    public final void zaa(android.content.Context p1)
    {
        this.zaa = p1;
        return;
    }

    public final declared_synchronized void zab()
    {
        int v0_0 = this.zaa;
        if (v0_0 != 0) {
            v0_0.unregisterReceiver(this);
        }
        this.zaa = 0;
        return;
    }
}
