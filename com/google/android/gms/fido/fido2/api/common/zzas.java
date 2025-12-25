package com.google.android.gms.fido.fido2.api.common;
final class zzas implements android.os.Parcelable$Creator {

    public zzas()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p2)
    {
        com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement$UnsupportedResidentKeyRequirementException v2_1 = p2.readString();
        if (v2_1 == null) {
            v2_1 = "";
        }
        return com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement.fromString(v2_1);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement[] v1_1 = new com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement[p1];
        return v1_1;
    }
}
