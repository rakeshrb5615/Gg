package com.google.android.gms.common.server.converter;
public final class zaa extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    final int zaa;
    private final com.google.android.gms.common.server.converter.StringToIntConverter zab;

    static zaa()
    {
        com.google.android.gms.common.server.converter.zaa.CREATOR = new com.google.android.gms.common.server.converter.zab();
        return;
    }

    public zaa(int p1, com.google.android.gms.common.server.converter.StringToIntConverter p2)
    {
        this.zaa = p1;
        this.zab = p2;
        return;
    }

    private zaa(com.google.android.gms.common.server.converter.StringToIntConverter p2)
    {
        this.zaa = 1;
        this.zab = p2;
        return;
    }

    public static com.google.android.gms.common.server.converter.zaa zaa(com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter p1)
    {
        if (!(p1 instanceof com.google.android.gms.common.server.converter.StringToIntConverter)) {
            throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
        } else {
            return new com.google.android.gms.common.server.converter.zaa(((com.google.android.gms.common.server.converter.StringToIntConverter) p1));
        }
    }

    public final void writeToParcel(android.os.Parcel p5, int p6)
    {
        com.google.android.gms.common.server.converter.StringToIntConverter v0_0 = this.zaa;
        int v1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p5);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p5, 1, v0_0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 2, this.zab, p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p5, v1);
        return;
    }

    public final com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter zab()
    {
        IllegalStateException v0_0 = this.zab;
        if (v0_0 == null) {
            throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
        } else {
            return v0_0;
        }
    }
}
