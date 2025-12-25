package com.google.android.gms.fido.fido2.api.common;
final class zza implements android.os.Parcelable$Creator {

    public zza()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p2)
    {
        try {
            return com.google.android.gms.fido.fido2.api.common.Attachment.fromString(p2.readString());
        } catch (com.google.android.gms.fido.fido2.api.common.Attachment$UnsupportedAttachmentException v2_3) {
            throw new RuntimeException(v2_3);
        }
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.fido.fido2.api.common.Attachment[] v1_1 = new com.google.android.gms.fido.fido2.api.common.Attachment[p1];
        return v1_1;
    }
}
