package com.google.android.gms.auth.api.identity;
public class GetPhoneNumberHintIntentRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final int zba;

    static GetPhoneNumberHintIntentRequest()
    {
        com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest.CREATOR = new com.google.android.gms.auth.api.identity.zbj();
        return;
    }

    public GetPhoneNumberHintIntentRequest(int p1)
    {
        this.zba = p1;
        return;
    }

    public static com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest$Builder builder()
    {
        return new com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest$Builder(0);
    }

    public boolean equals(Object p2)
    {
        if ((p2 instanceof com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest)) {
            return com.google.android.gms.common.internal.Objects.equal(Integer.valueOf(this.zba), Integer.valueOf(((com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest) p2).zba));
        } else {
            return 0;
        }
    }

    public int hashCode()
    {
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {Integer.valueOf(this.zba)}));
    }

    public void writeToParcel(android.os.Parcel p3, int p4)
    {
        p4 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p3);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p3, 1, this.zba);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p3, p4);
        return;
    }
}
