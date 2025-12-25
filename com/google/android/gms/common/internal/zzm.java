package com.google.android.gms.common.internal;
public final class zzm implements android.os.Parcelable$Creator {

    public zzm()
    {
        return;
    }

    public static void zza(com.google.android.gms.common.internal.GetServiceRequest p4, android.os.Parcel p5, int p6)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p5);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p5, 1, p4.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p5, 2, p4.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p5, 3, p4.zze);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 4, p4.zzf, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(p5, 5, p4.zzg, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(p5, 6, p4.zzh, p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(p5, 7, p4.zzi, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 8, p4.zzj, p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(p5, 10, p4.zzk, p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(p5, 11, p4.zzl, p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p5, 12, p4.zzm);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p5, 13, p4.zzn);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p5, 14, p4.zzo);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 15, p4.getAttributionTag(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p5, v0);
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p23)
    {
        int v1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p23);
        com.google.android.gms.common.api.Scope[] v13_1 = com.google.android.gms.common.internal.GetServiceRequest.zza;
        android.os.Bundle v14 = new android.os.Bundle();
        com.google.android.gms.common.Feature[] v16_0 = com.google.android.gms.common.internal.GetServiceRequest.zzb;
        com.google.android.gms.common.Feature[] v17_0 = v16_0;
        String v11 = 0;
        android.os.IBinder v12 = 0;
        android.accounts.Account v15_0 = 0;
        String v21 = 0;
        int v8 = 0;
        int v9 = 0;
        int v10 = 0;
        boolean v18 = 0;
        int v19 = 0;
        boolean v20 = 0;
        while (p23.dataPosition() < v1) {
            Object[] v2_2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p23);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v2_2)) {
                case 1:
                    v8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p23, v2_2);
                    break;
                case 2:
                    v9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p23, v2_2);
                    break;
                case 3:
                    v10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p23, v2_2);
                    break;
                case 4:
                    v11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p23, v2_2);
                    break;
                case 5:
                    v12 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIBinder(p23, v2_2);
                    break;
                case 6:
                    v13_1 = ((com.google.android.gms.common.api.Scope[]) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedArray(p23, v2_2, com.google.android.gms.common.api.Scope.CREATOR));
                    break;
                case 7:
                    v14 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(p23, v2_2);
                    break;
                case 8:
                    v15_0 = ((android.accounts.Account) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p23, v2_2, android.accounts.Account.CREATOR));
                    break;
                case 9:
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p23, v2_2);
                    break;
                case 10:
                    v16_0 = ((com.google.android.gms.common.Feature[]) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedArray(p23, v2_2, com.google.android.gms.common.Feature.CREATOR));
                    break;
                case 11:
                    v17_0 = ((com.google.android.gms.common.Feature[]) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedArray(p23, v2_2, com.google.android.gms.common.Feature.CREATOR));
                    break;
                case 12:
                    v18 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p23, v2_2);
                    break;
                case 13:
                    v19 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p23, v2_2);
                    break;
                case 14:
                    v20 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p23, v2_2);
                    break;
                case 15:
                    v21 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p23, v2_2);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p23, v1);
        return new com.google.android.gms.common.internal.GetServiceRequest(v8, v9, v10, v11, v12, v13_1, v14, v15_0, v16_0, v17_0, v18, v19, v20, v21);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.common.internal.GetServiceRequest[] v1_1 = new com.google.android.gms.common.internal.GetServiceRequest[p1];
        return v1_1;
    }
}
