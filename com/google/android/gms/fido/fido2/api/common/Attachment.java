package com.google.android.gms.fido.fido2.api.common;
public final enum class Attachment extends java.lang.Enum implements android.os.Parcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    public static final enum com.google.android.gms.fido.fido2.api.common.Attachment CROSS_PLATFORM;
    public static final enum com.google.android.gms.fido.fido2.api.common.Attachment PLATFORM;
    private static final synthetic com.google.android.gms.fido.fido2.api.common.Attachment[] zza;
    private final String zzb;

    static Attachment()
    {
        com.google.android.gms.fido.fido2.api.common.zza v0_4 = new com.google.android.gms.fido.fido2.api.common.Attachment("PLATFORM", 0, "platform");
        com.google.android.gms.fido.fido2.api.common.Attachment.PLATFORM = v0_4;
        com.google.android.gms.fido.fido2.api.common.Attachment v1_1 = new com.google.android.gms.fido.fido2.api.common.Attachment("CROSS_PLATFORM", 1, "cross-platform");
        com.google.android.gms.fido.fido2.api.common.Attachment.CROSS_PLATFORM = v1_1;
        com.google.android.gms.fido.fido2.api.common.Attachment.zza = new com.google.android.gms.fido.fido2.api.common.Attachment[] {v0_4, v1_1});
        com.google.android.gms.fido.fido2.api.common.Attachment.CREATOR = new com.google.android.gms.fido.fido2.api.common.zza();
        return;
    }

    private Attachment(String p1, int p2, String p3)
    {
        super(p1, p2);
        super.zzb = p3;
        return;
    }

    public static com.google.android.gms.fido.fido2.api.common.Attachment fromString(String p5)
    {
        com.google.android.gms.fido.fido2.api.common.Attachment$UnsupportedAttachmentException v0_0 = com.google.android.gms.fido.fido2.api.common.Attachment.values();
        int v2 = 0;
        while (v2 < v0_0.length) {
            com.google.android.gms.fido.fido2.api.common.Attachment v3 = v0_0[v2];
            if (!p5.equals(v3.zzb)) {
                v2++;
            } else {
                return v3;
            }
        }
        throw new com.google.android.gms.fido.fido2.api.common.Attachment$UnsupportedAttachmentException(p5);
    }

    public static com.google.android.gms.fido.fido2.api.common.Attachment valueOf(String p1)
    {
        return ((com.google.android.gms.fido.fido2.api.common.Attachment) Enum.valueOf(com.google.android.gms.fido.fido2.api.common.Attachment, p1));
    }

    public static com.google.android.gms.fido.fido2.api.common.Attachment[] values()
    {
        return ((com.google.android.gms.fido.fido2.api.common.Attachment[]) com.google.android.gms.fido.fido2.api.common.Attachment.zza.clone());
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return this.zzb;
    }

    public void writeToParcel(android.os.Parcel p1, int p2)
    {
        p1.writeString(this.zzb);
        return;
    }
}
