package com.google.android.gms.common.api.internal;
final class zabh extends com.google.android.gms.internal.base.zau {
    final synthetic com.google.android.gms.common.api.internal.zabi zaa;

    public zabh(com.google.android.gms.common.api.internal.zabi p1, android.os.Looper p2)
    {
        this.zaa = p1;
        super(p2);
        return;
    }

    public final void handleMessage(android.os.Message p3)
    {
        String v0_0 = p3.what;
        if (v0_0 == 1) {
            ((com.google.android.gms.common.api.internal.zabg) p3.obj).zab(this.zaa);
            return;
        } else {
            if (v0_0 == 2) {
                throw ((RuntimeException) p3.obj);
            } else {
                RuntimeException v3_4 = new StringBuilder("Unknown message id: ");
                v3_4.append(v0_0);
                android.util.Log.w("GACStateManager", v3_4.toString());
                return;
            }
        }
    }
}
