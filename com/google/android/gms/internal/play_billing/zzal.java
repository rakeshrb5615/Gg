package com.google.android.gms.internal.play_billing;
public abstract class zzal extends com.google.android.gms.internal.play_billing.zzaq implements com.google.android.gms.internal.play_billing.zzam {

    public static com.google.android.gms.internal.play_billing.zzam zzs(android.os.IBinder p2)
    {
        if (p2 != 0) {
            com.google.android.gms.internal.play_billing.zzak v0_1 = p2.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
            if (!(v0_1 instanceof com.google.android.gms.internal.play_billing.zzam)) {
                return new com.google.android.gms.internal.play_billing.zzak(p2);
            } else {
                return ((com.google.android.gms.internal.play_billing.zzam) v0_1);
            }
        } else {
            return 0;
        }
    }
}
