package com.google.android.gms.fido.fido2.api.common;
final class zzaw implements android.os.Parcelable$Creator {

    public zzaw()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p2)
    {
        try {
            return com.google.android.gms.fido.fido2.api.common.zzay.zza(p2.readString());
        } catch (com.google.android.gms.fido.fido2.api.common.zzax v2_3) {
            throw new RuntimeException(v2_3);
        }
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.fido.fido2.api.common.zzay[] v1_1 = new com.google.android.gms.fido.fido2.api.common.zzay[p1];
        return v1_1;
    }
}
