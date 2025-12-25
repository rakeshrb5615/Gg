package com.google.android.gms.internal.play_billing;
public abstract class zzat extends com.google.android.gms.internal.play_billing.zzaq implements com.google.android.gms.internal.play_billing.zzau {

    public static com.google.android.gms.internal.play_billing.zzau zzc(android.os.IBinder p2)
    {
        if (p2 != 0) {
            com.google.android.gms.internal.play_billing.zzas v0_1 = p2.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
            if (!(v0_1 instanceof com.google.android.gms.internal.play_billing.zzau)) {
                return new com.google.android.gms.internal.play_billing.zzas(p2);
            } else {
                return ((com.google.android.gms.internal.play_billing.zzau) v0_1);
            }
        } else {
            return 0;
        }
    }
}
