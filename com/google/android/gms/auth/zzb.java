package com.google.android.gms.auth;
public final class zzb implements android.os.Parcelable$Creator {

    public zzb()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p9)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p9);
        int v1 = 0;
        String v3 = 0;
        android.accounts.Account v4_2 = 0;
        int v2_0 = 0;
        while (p9.dataPosition() < v0) {
            int v5_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p9);
            int v6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v5_0);
            if (v6 == 1) {
                v1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p9, v5_0);
            } else {
                if (v6 == 2) {
                    v2_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p9, v5_0);
                } else {
                    if (v6 == 3) {
                        v3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p9, v5_0);
                    } else {
                        if (v6 == 4) {
                            v4_2 = ((android.accounts.Account) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p9, v5_0, android.accounts.Account.CREATOR));
                        } else {
                            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p9, v5_0);
                        }
                    }
                }
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p9, v0);
        return new com.google.android.gms.auth.AccountChangeEventsRequest(v1, v2_0, v3, v4_2);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.auth.AccountChangeEventsRequest[] v1_1 = new com.google.android.gms.auth.AccountChangeEventsRequest[p1];
        return v1_1;
    }
}
