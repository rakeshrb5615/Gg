package com.google.android.gms.common;
final class zad extends com.google.android.gms.internal.base.zau {
    final synthetic com.google.android.gms.common.GoogleApiAvailability zaa;
    private final android.content.Context zab;

    public zad(com.google.android.gms.common.GoogleApiAvailability p1, android.content.Context p2)
    {
        android.content.Context v1_3;
        this.zaa = p1;
        if (android.os.Looper.myLooper() != null) {
            v1_3 = android.os.Looper.myLooper();
        } else {
            v1_3 = android.os.Looper.getMainLooper();
        }
        super(v1_3);
        super.zab = p2.getApplicationContext();
        return;
    }

    public final void handleMessage(android.os.Message p3)
    {
        com.google.android.gms.common.GoogleApiAvailability v3_1 = p3.what;
        if (v3_1 == 1) {
            com.google.android.gms.common.GoogleApiAvailability v3_4 = this.zaa;
            int v0_5 = v3_4.isGooglePlayServicesAvailable(this.zab);
            if (v3_4.isUserResolvableError(v0_5)) {
                this.zaa.showErrorNotification(this.zab, v0_5);
            }
            return;
        } else {
            int v0_2 = new StringBuilder("Don\'t know how to handle this message: ");
            v0_2.append(v3_1);
            android.util.Log.w("GoogleApiAvailability", v0_2.toString());
            return;
        }
    }
}
