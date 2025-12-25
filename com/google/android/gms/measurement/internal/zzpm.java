package com.google.android.gms.measurement.internal;
public final class zzpm implements android.os.Parcelable$Creator {

    public zzpm()
    {
        return;
    }

    public static void zza(com.google.android.gms.measurement.internal.zzpl p5, android.os.Parcel p6, int p7)
    {
        int v7_0 = p5.zza;
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p6);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p6, 1, v7_0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p6, 2, p5.zzb, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(p6, 3, p5.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLongObject(p6, 4, p5.zzd, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloatObject(p6, 5, 0, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p6, 6, p5.zze, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p6, 7, p5.zzf, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeDoubleObject(p6, 8, p5.zzg, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p6, v0);
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p17)
    {
        int v1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p17);
        String v8 = 0;
        Long v11 = 0;
        Float v12 = 0;
        String v13 = 0;
        String v14 = 0;
        Double v15 = 0;
        long v9 = 0;
        int v7 = 0;
        while (p17.dataPosition() < v1) {
            Double v2_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p17);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v2_1)) {
                case 1:
                    v7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p17, v2_1);
                    break;
                case 2:
                    v8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p17, v2_1);
                    break;
                case 3:
                    v9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(p17, v2_1);
                    break;
                case 4:
                    v11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLongObject(p17, v2_1);
                    break;
                case 5:
                    v12 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloatObject(p17, v2_1);
                    break;
                case 6:
                    v13 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p17, v2_1);
                    break;
                case 7:
                    v14 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p17, v2_1);
                    break;
                case 8:
                    v15 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readDoubleObject(p17, v2_1);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p17, v2_1);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p17, v1);
        return new com.google.android.gms.measurement.internal.zzpl(v7, v8, v9, v11, v12, v13, v14, v15);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.measurement.internal.zzpl[] v1_1 = new com.google.android.gms.measurement.internal.zzpl[p1];
        return v1_1;
    }
}
