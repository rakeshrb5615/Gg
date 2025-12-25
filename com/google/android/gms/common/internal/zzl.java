package com.google.android.gms.common.internal;
public final class zzl implements android.os.Parcelable$Creator {

    public zzl()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p11)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p11);
        com.google.android.gms.common.internal.RootTelemetryConfiguration v4_1 = 0;
        int[] v7 = 0;
        int[] v9 = 0;
        boolean v5 = 0;
        boolean v6 = 0;
        int v8 = 0;
        while (p11.dataPosition() < v0) {
            android.os.Parcelable v1_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p11);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v1_1)) {
                case 1:
                    v4_1 = ((com.google.android.gms.common.internal.RootTelemetryConfiguration) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p11, v1_1, com.google.android.gms.common.internal.RootTelemetryConfiguration.CREATOR));
                    break;
                case 2:
                    v5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p11, v1_1);
                    break;
                case 3:
                    v6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p11, v1_1);
                    break;
                case 4:
                    v7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createIntArray(p11, v1_1);
                    break;
                case 5:
                    v8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p11, v1_1);
                    break;
                case 6:
                    v9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createIntArray(p11, v1_1);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p11, v1_1);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p11, v0);
        return new com.google.android.gms.common.internal.ConnectionTelemetryConfiguration(v4_1, v5, v6, v7, v8, v9);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.common.internal.ConnectionTelemetryConfiguration[] v1_1 = new com.google.android.gms.common.internal.ConnectionTelemetryConfiguration[p1];
        return v1_1;
    }
}
