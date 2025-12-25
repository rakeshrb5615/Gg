package com.google.android.gms.fido.u2f.api.common;
public final enum class ChannelIdValue$ChannelIdValueType extends java.lang.Enum implements android.os.Parcelable {
    public static final enum com.google.android.gms.fido.u2f.api.common.ChannelIdValue$ChannelIdValueType ABSENT;
    public static final android.os.Parcelable$Creator CREATOR;
    public static final enum com.google.android.gms.fido.u2f.api.common.ChannelIdValue$ChannelIdValueType OBJECT;
    public static final enum com.google.android.gms.fido.u2f.api.common.ChannelIdValue$ChannelIdValueType STRING;
    private static final synthetic com.google.android.gms.fido.u2f.api.common.ChannelIdValue$ChannelIdValueType[] zza;
    private final int zzb;

    static ChannelIdValue$ChannelIdValueType()
    {
        com.google.android.gms.fido.u2f.api.common.zza v0_4 = new com.google.android.gms.fido.u2f.api.common.ChannelIdValue$ChannelIdValueType("ABSENT", 0, 0);
        com.google.android.gms.fido.u2f.api.common.ChannelIdValue$ChannelIdValueType.ABSENT = v0_4;
        com.google.android.gms.fido.u2f.api.common.ChannelIdValue$ChannelIdValueType v1_2 = new com.google.android.gms.fido.u2f.api.common.ChannelIdValue$ChannelIdValueType("STRING", 1, 1);
        com.google.android.gms.fido.u2f.api.common.ChannelIdValue$ChannelIdValueType.STRING = v1_2;
        com.google.android.gms.fido.u2f.api.common.ChannelIdValue$ChannelIdValueType v2_1 = new com.google.android.gms.fido.u2f.api.common.ChannelIdValue$ChannelIdValueType("OBJECT", 2, 2);
        com.google.android.gms.fido.u2f.api.common.ChannelIdValue$ChannelIdValueType.OBJECT = v2_1;
        com.google.android.gms.fido.u2f.api.common.ChannelIdValue$ChannelIdValueType.zza = new com.google.android.gms.fido.u2f.api.common.ChannelIdValue$ChannelIdValueType[] {v0_4, v1_2, v2_1});
        com.google.android.gms.fido.u2f.api.common.ChannelIdValue$ChannelIdValueType.CREATOR = new com.google.android.gms.fido.u2f.api.common.zza();
        return;
    }

    private ChannelIdValue$ChannelIdValueType(String p1, int p2, int p3)
    {
        super(p1, p2);
        super.zzb = p3;
        return;
    }

    public static com.google.android.gms.fido.u2f.api.common.ChannelIdValue$ChannelIdValueType valueOf(String p1)
    {
        return ((com.google.android.gms.fido.u2f.api.common.ChannelIdValue$ChannelIdValueType) Enum.valueOf(com.google.android.gms.fido.u2f.api.common.ChannelIdValue$ChannelIdValueType, p1));
    }

    public static com.google.android.gms.fido.u2f.api.common.ChannelIdValue$ChannelIdValueType[] values()
    {
        return ((com.google.android.gms.fido.u2f.api.common.ChannelIdValue$ChannelIdValueType[]) com.google.android.gms.fido.u2f.api.common.ChannelIdValue$ChannelIdValueType.zza.clone());
    }

    public static bridge synthetic int zza(com.google.android.gms.fido.u2f.api.common.ChannelIdValue$ChannelIdValueType p0)
    {
        return p0.zzb;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(android.os.Parcel p1, int p2)
    {
        p1.writeInt(this.zzb);
        return;
    }
}
