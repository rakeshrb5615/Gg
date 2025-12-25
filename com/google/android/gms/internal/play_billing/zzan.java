package com.google.android.gms.internal.play_billing;
public abstract class zzan extends com.google.android.gms.internal.play_billing.zzaq implements com.google.android.gms.internal.play_billing.zzao {

    public zzan()
    {
        super("com.android.vending.billing.IInAppBillingServiceCallback");
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
            p3.writeNoException();
            return 1;
        }
    }
}
