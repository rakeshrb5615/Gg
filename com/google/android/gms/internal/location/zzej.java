package com.google.android.gms.internal.location;
public final class zzej implements android.os.Parcelable$Creator {

    public zzej()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p12)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p12);
        com.google.android.gms.internal.location.zzeg v5_1 = 0;
        android.os.IBinder v6 = 0;
        android.os.IBinder v7 = 0;
        android.app.PendingIntent v8_1 = 0;
        android.os.IBinder v9 = 0;
        String v10 = 0;
        int v4 = 1;
        while (p12.dataPosition() < v0) {
            android.os.Parcelable v1_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p12);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v1_1)) {
                case 1:
                    v4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p12, v1_1);
                    break;
                case 2:
                    v5_1 = ((com.google.android.gms.internal.location.zzeg) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p12, v1_1, com.google.android.gms.internal.location.zzeg.CREATOR));
                    break;
                case 3:
                    v6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIBinder(p12, v1_1);
                    break;
                case 4:
                    v8_1 = ((android.app.PendingIntent) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p12, v1_1, android.app.PendingIntent.CREATOR));
                    break;
                case 5:
                    v7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIBinder(p12, v1_1);
                    break;
                case 6:
                    v9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIBinder(p12, v1_1);
                    break;
                case 7:
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p12, v1_1);
                    break;
                case 8:
                    v10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p12, v1_1);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p12, v0);
        return new com.google.android.gms.internal.location.zzei(v4, v5_1, v6, v7, v8_1, v9, v10);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.internal.location.zzei[] v1_1 = new com.google.android.gms.internal.location.zzei[p1];
        return v1_1;
    }
}
