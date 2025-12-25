package com.google.android.gms.common.api;
public final class zzb implements android.os.Parcelable$Creator {

    public zzb()
    {
        return;
    }

    public static final com.google.android.gms.common.api.ApiMetadata zza(android.os.Parcel p6)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p6);
        boolean v1 = 0;
        com.google.android.gms.common.api.ComplianceOptions v2_2 = 0;
        while (p6.dataPosition() < v0) {
            int v3_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p6);
            int v4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v3_0);
            if (v4 == 1) {
                v2_2 = ((com.google.android.gms.common.api.ComplianceOptions) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p6, v3_0, com.google.android.gms.common.api.ComplianceOptions.CREATOR));
            } else {
                if (v4 == 2) {
                    v1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p6, v3_0);
                } else {
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p6, v3_0);
                }
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p6, v0);
        return new com.google.android.gms.common.api.ApiMetadata(v2_2, v1);
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p1)
    {
        return com.google.android.gms.common.api.zzb.zza(p1);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.common.api.ApiMetadata[] v1_1 = new com.google.android.gms.common.api.ApiMetadata[p1];
        return v1_1;
    }
}
