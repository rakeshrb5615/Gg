package com.google.android.gms.internal.play_billing;
public final class zzas extends com.google.android.gms.internal.play_billing.zzap implements com.google.android.gms.internal.play_billing.zzau {

    public zzas(android.os.IBinder p2)
    {
        super(p2, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
        return;
    }

    public final void zza(String p2, String p3, com.google.android.gms.internal.play_billing.zzaw p4)
    {
        android.os.Parcel v0 = this.zzs();
        v0.writeString(p2);
        v0.writeString(p3);
        v0.writeStrongBinder(p4);
        this.zzv(1, v0);
        return;
    }
}
