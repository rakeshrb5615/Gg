package com.google.android.gms.internal.play_billing;
public abstract class zzy extends com.google.android.gms.internal.play_billing.zzaq implements com.google.android.gms.internal.play_billing.zzz {

    public zzy()
    {
        super("com.android.vending.billing.IInAppBillingCreateExternalPaymentReportingDetailsCallback");
        return;
    }

    public final boolean zzb(int p1, android.os.Parcel p2, android.os.Parcel p3, int p4)
    {
        if (p1 != 1) {
            return 0;
        } else {
            int v1_4 = ((android.os.Bundle) com.google.android.gms.internal.play_billing.zzar.zza(p2, android.os.Bundle.CREATOR));
            com.google.android.gms.internal.play_billing.zzar.zzb(p2);
            this.zza(v1_4);
            return 1;
        }
    }
}
