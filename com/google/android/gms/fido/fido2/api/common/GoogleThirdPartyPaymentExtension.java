package com.google.android.gms.fido.fido2.api.common;
public class GoogleThirdPartyPaymentExtension extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final boolean zza;

    static GoogleThirdPartyPaymentExtension()
    {
        com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension.CREATOR = new com.google.android.gms.fido.fido2.api.common.zzaf();
        return;
    }

    public GoogleThirdPartyPaymentExtension(boolean p1)
    {
        this.zza = p1;
        return;
    }

    public boolean equals(Object p3)
    {
        if ((p3 instanceof com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension)) {
            if (this.zza != ((com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension) p3).getThirdPartyPayment()) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public boolean getThirdPartyPayment()
    {
        return this.zza;
    }

    public int hashCode()
    {
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {Boolean.valueOf(this.zza)}));
    }

    public void writeToParcel(android.os.Parcel p3, int p4)
    {
        p4 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p3);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p3, 1, this.getThirdPartyPayment());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p3, p4);
        return;
    }
}
