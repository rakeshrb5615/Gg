package com.android.billingclient.api;
final class zzcc implements android.content.ServiceConnection {
    final synthetic com.android.billingclient.api.zzce zza;

    public synthetic zzcc(com.android.billingclient.api.zzce p1, com.android.billingclient.api.zzcd p2)
    {
        java.util.Objects.requireNonNull(p1);
        this.zza = p1;
        return;
    }

    public final void onServiceConnected(android.content.ComponentName p2, android.os.IBinder p3)
    {
        com.google.android.gms.internal.play_billing.zzc.zzm("BillingClientTesting", "Billing Override Service connected.");
        com.android.billingclient.api.zzce v2_1 = this.zza;
        com.android.billingclient.api.zzce.zzaq(v2_1, com.google.android.gms.internal.play_billing.zzat.zzc(p3));
        com.android.billingclient.api.zzce.zzar(v2_1, 2);
        com.android.billingclient.api.zzce.zzax(v2_1, 26);
        return;
    }

    public final void onServiceDisconnected(android.content.ComponentName p2)
    {
        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClientTesting", "Billing Override Service disconnected.");
        com.android.billingclient.api.zzce v2_1 = this.zza;
        com.android.billingclient.api.zzce.zzaq(v2_1, 0);
        com.android.billingclient.api.zzce.zzar(v2_1, 0);
        return;
    }
}
