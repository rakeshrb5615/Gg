package com.google.android.gms.measurement.internal;
public final class zzbh implements android.os.Parcelable$Creator {

    public zzbh()
    {
        return;
    }

    public static void zza(com.google.android.gms.measurement.internal.zzbg p4, android.os.Parcel p5, int p6)
    {
        String v0_0 = p4.zza;
        int v1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p5);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 2, v0_0, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 3, p4.zzb, p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 4, p4.zzc, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(p5, 5, p4.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p5, v1);
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p11)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p11);
        long v8 = 0;
        String v5 = 0;
        com.google.android.gms.measurement.internal.zzbe v6 = 0;
        String v7 = 0;
        while (p11.dataPosition() < v0) {
            long v1_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p11);
            android.os.Parcelable$Creator v2_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v1_0);
            if (v2_0 == 2) {
                v5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p11, v1_0);
            } else {
                if (v2_0 == 3) {
                    v6 = ((com.google.android.gms.measurement.internal.zzbe) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p11, v1_0, com.google.android.gms.measurement.internal.zzbe.CREATOR));
                } else {
                    if (v2_0 == 4) {
                        v7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p11, v1_0);
                    } else {
                        if (v2_0 == 5) {
                            v8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(p11, v1_0);
                        } else {
                            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p11, v1_0);
                        }
                    }
                }
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p11, v0);
        return new com.google.android.gms.measurement.internal.zzbg(v5, v6, v7, v8);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.measurement.internal.zzbg[] v1_1 = new com.google.android.gms.measurement.internal.zzbg[p1];
        return v1_1;
    }
}
