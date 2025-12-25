package com.google.android.gms.internal.play_billing;
public abstract class zzav extends com.google.android.gms.internal.play_billing.zzaq implements com.google.android.gms.internal.play_billing.zzaw {

    public zzav()
    {
        super("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideServiceCallback");
        return;
    }

    public final boolean zzb(int p1, android.os.Parcel p2, android.os.Parcel p3, int p4)
    {
        if (p1 != 1) {
            return 0;
        } else {
            int v1_2 = p2.readInt();
            com.google.android.gms.internal.play_billing.zzar.zzb(p2);
            this.zza(v1_2);
            return 1;
        }
    }
}
