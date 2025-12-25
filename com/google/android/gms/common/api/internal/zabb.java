package com.google.android.gms.common.api.internal;
final class zabb implements com.google.android.gms.common.api.ResultCallback {
    final synthetic com.google.android.gms.common.api.internal.StatusPendingResult zaa;
    final synthetic boolean zab;
    final synthetic com.google.android.gms.common.api.GoogleApiClient zac;
    final synthetic com.google.android.gms.common.api.internal.zabe zad;

    public zabb(com.google.android.gms.common.api.internal.zabe p1, com.google.android.gms.common.api.internal.StatusPendingResult p2, boolean p3, com.google.android.gms.common.api.GoogleApiClient p4)
    {
        this.zad = p1;
        this.zaa = p2;
        this.zab = p3;
        this.zac = p4;
        return;
    }

    public final bridge synthetic void onResult(com.google.android.gms.common.api.Result p2)
    {
        com.google.android.gms.auth.api.signin.internal.Storage.getInstance(com.google.android.gms.common.api.internal.zabe.zae(this.zad)).zac();
        if ((((com.google.android.gms.common.api.Status) p2).isSuccess()) && (this.zad.isConnected())) {
            com.google.android.gms.common.api.internal.zabe v0_3 = this.zad;
            v0_3.disconnect();
            v0_3.connect();
        }
        this.zaa.setResult(((com.google.android.gms.common.api.Status) p2));
        if (this.zab) {
            this.zac.disconnect();
        }
        return;
    }
}
