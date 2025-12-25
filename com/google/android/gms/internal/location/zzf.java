package com.google.android.gms.internal.location;
public final class zzf implements android.os.Parcelable$Creator {

    public zzf()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p11)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p11);
        String v5 = 0;
        String v6 = 0;
        String v7 = 0;
        java.util.ArrayList v8 = 0;
        com.google.android.gms.internal.location.zze v9_1 = 0;
        int v4 = 0;
        while (p11.dataPosition() < v0) {
            android.os.Parcelable v1_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p11);
            android.os.Parcelable$Creator v2_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v1_1);
            if (v2_0 == 1) {
                v4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p11, v1_1);
            } else {
                if (v2_0 == 3) {
                    v5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p11, v1_1);
                } else {
                    if (v2_0 == 4) {
                        v6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p11, v1_1);
                    } else {
                        if (v2_0 == 6) {
                            v7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p11, v1_1);
                        } else {
                            if (v2_0 == 7) {
                                v9_1 = ((com.google.android.gms.internal.location.zze) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p11, v1_1, com.google.android.gms.internal.location.zze.CREATOR));
                            } else {
                                if (v2_0 == 8) {
                                    v8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(p11, v1_1, com.google.android.gms.common.Feature.CREATOR);
                                } else {
                                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p11, v1_1);
                                }
                            }
                        }
                    }
                }
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p11, v0);
        return new com.google.android.gms.internal.location.zze(v4, v5, v6, v7, v8, v9_1);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.internal.location.zze[] v1_1 = new com.google.android.gms.internal.location.zze[p1];
        return v1_1;
    }
}
