package com.google.android.gms.common.internal;
public final class zzk implements android.os.Parcelable$Creator {

    public zzk()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p9)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p9);
        android.os.Bundle v1 = 0;
        com.google.android.gms.common.internal.ConnectionTelemetryConfiguration v3_2 = 0;
        int v4 = 0;
        com.google.android.gms.common.Feature[] v2_2 = 0;
        while (p9.dataPosition() < v0) {
            int v5_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p9);
            int v6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v5_0);
            if (v6 == 1) {
                v1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(p9, v5_0);
            } else {
                if (v6 == 2) {
                    v2_2 = ((com.google.android.gms.common.Feature[]) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedArray(p9, v5_0, com.google.android.gms.common.Feature.CREATOR));
                } else {
                    if (v6 == 3) {
                        v4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p9, v5_0);
                    } else {
                        if (v6 == 4) {
                            v3_2 = ((com.google.android.gms.common.internal.ConnectionTelemetryConfiguration) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p9, v5_0, com.google.android.gms.common.internal.ConnectionTelemetryConfiguration.CREATOR));
                        } else {
                            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p9, v5_0);
                        }
                    }
                }
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p9, v0);
        return new com.google.android.gms.common.internal.zzj(v1, v2_2, v4, v3_2);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.common.internal.zzj[] v1_1 = new com.google.android.gms.common.internal.zzj[p1];
        return v1_1;
    }
}
