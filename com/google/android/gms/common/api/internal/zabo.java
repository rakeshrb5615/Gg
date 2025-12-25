package com.google.android.gms.common.api.internal;
final class zabo implements java.lang.Runnable {
    final synthetic com.google.android.gms.common.api.internal.zabp zaa;

    public zabo(com.google.android.gms.common.api.internal.zabp p1)
    {
        this.zaa = p1;
        return;
    }

    public final void run()
    {
        String v0_1 = this.zaa.zaa;
        com.google.android.gms.common.api.internal.zabq.zae(v0_1).disconnect(com.google.android.gms.common.api.internal.zabq.zae(v0_1).getClass().getName().concat(" disconnecting because it was signed out."));
        return;
    }
}
