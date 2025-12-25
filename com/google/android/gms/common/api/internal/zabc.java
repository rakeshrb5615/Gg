package com.google.android.gms.common.api.internal;
final class zabc extends com.google.android.gms.internal.base.zau {
    final synthetic com.google.android.gms.common.api.internal.zabe zaa;

    public zabc(com.google.android.gms.common.api.internal.zabe p1, android.os.Looper p2)
    {
        this.zaa = p1;
        super(p2);
        return;
    }

    public final void handleMessage(android.os.Message p3)
    {
        com.google.android.gms.common.api.internal.zabe v3_1 = p3.what;
        if (v3_1 == 1) {
            com.google.android.gms.common.api.internal.zabe.zaj(this.zaa);
            return;
        } else {
            if (v3_1 == 2) {
                com.google.android.gms.common.api.internal.zabe.zai(this.zaa);
                return;
            } else {
                String v0_2 = new StringBuilder("Unknown message id: ");
                v0_2.append(v3_1);
                android.util.Log.w("GoogleApiClientImpl", v0_2.toString());
                return;
            }
        }
    }
}
