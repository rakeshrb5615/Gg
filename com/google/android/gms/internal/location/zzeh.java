package com.google.android.gms.internal.location;
public final class zzeh implements android.os.Parcelable$Creator {

    public zzeh()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p17)
    {
        int v1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p17);
        long v14 = 9223372036854775807;
        com.google.android.gms.location.LocationRequest v7 = 0;
        java.util.ArrayList v8 = 0;
        String v13 = 0;
        boolean v9 = 0;
        boolean v10 = 0;
        boolean v11 = 0;
        boolean v12 = 0;
        while (p17.dataPosition() < v1) {
            long v2_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p17);
            android.os.Parcelable$Creator v3_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v2_1);
            if (v3_0 == 1) {
                v7 = ((com.google.android.gms.location.LocationRequest) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p17, v2_1, com.google.android.gms.location.LocationRequest.CREATOR));
            } else {
                if (v3_0 == 5) {
                    v8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(p17, v2_1, com.google.android.gms.common.internal.ClientIdentity.CREATOR);
                } else {
                    if (v3_0 == 8) {
                        v9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p17, v2_1);
                    } else {
                        if (v3_0 == 9) {
                            v10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p17, v2_1);
                        } else {
                            switch (v3_0) {
                                case 11:
                                    v11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p17, v2_1);
                                    break;
                                case 12:
                                    v12 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p17, v2_1);
                                    break;
                                case 13:
                                    v13 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p17, v2_1);
                                    break;
                                case 14:
                                    v14 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(p17, v2_1);
                                    break;
                                default:
                                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p17, v2_1);
                            }
                        }
                    }
                }
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p17, v1);
        return new com.google.android.gms.internal.location.zzeg(v7, v8, v9, v10, v11, v12, v13, v14);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.internal.location.zzeg[] v1_1 = new com.google.android.gms.internal.location.zzeg[p1];
        return v1_1;
    }
}
