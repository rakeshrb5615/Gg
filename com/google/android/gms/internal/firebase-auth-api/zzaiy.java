package com.google.android.gms.internal.firebase-auth-api;
public final class zzaiy implements android.os.Parcelable$Creator {

    public zzaiy()
    {
        return;
    }

    public final synthetic Object createFromParcel(android.os.Parcel p3)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p3);
        while (p3.dataPosition() < v0) {
            int v1_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p3);
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v1_0);
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p3, v1_0);
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p3, v0);
        return new com.google.android.gms.internal.firebase-auth-api.zzaiz();
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.internal.firebase-auth-api.zzaiz[] v1_1 = new com.google.android.gms.internal.firebase-auth-api.zzaiz[p1];
        return v1_1;
    }
}
