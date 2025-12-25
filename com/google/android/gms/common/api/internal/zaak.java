package com.google.android.gms.common.api.internal;
final class zaak implements java.lang.Runnable {
    final synthetic com.google.android.gms.common.api.internal.zaaw zaa;

    public zaak(com.google.android.gms.common.api.internal.zaaw p1)
    {
        this.zaa = p1;
        return;
    }

    public final void run()
    {
        android.content.Context v0_0 = this.zaa;
        com.google.android.gms.common.api.internal.zaaw.zaf(v0_0).cancelAvailabilityErrorNotifications(com.google.android.gms.common.api.internal.zaaw.zac(v0_0));
        return;
    }
}
