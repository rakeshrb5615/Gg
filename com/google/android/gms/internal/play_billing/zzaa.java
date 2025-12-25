package com.google.android.gms.internal.play_billing;
public abstract class zzaa extends com.google.android.gms.internal.play_billing.zzaq implements com.google.android.gms.internal.play_billing.zzab {

    public zzaa()
    {
        super("com.android.vending.billing.IInAppBillingGetAlternativeBillingOnlyDialogIntentCallback");
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
