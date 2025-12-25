package com.google.android.gms.common;
final class zac implements android.content.DialogInterface$OnClickListener {
    final synthetic android.app.Activity zaa;
    final synthetic int zab;
    final synthetic e.c zac;
    final synthetic com.google.android.gms.common.GoogleApiAvailability zad;

    public zac(com.google.android.gms.common.GoogleApiAvailability p1, android.app.Activity p2, int p3, e.c p4)
    {
        this.zad = p1;
        this.zaa = p2;
        this.zab = p3;
        this.zac = p4;
        return;
    }

    public final void onClick(android.content.DialogInterface p3, int p4)
    {
        p3.dismiss();
        e.c v3_3 = this.zad.getErrorResolutionPendingIntent(this.zaa, this.zab, 0);
        if (v3_3 != null) {
            e.c v3_4 = v3_3.getIntentSender();
            kotlin.jvm.internal.j.e(v3_4, "intentSender");
            this.zac.a(new e.k(v3_4, 0, 0, 0));
            return;
        } else {
            return;
        }
    }
}
