package com.google.android.gms.common.api;
final class zza implements android.os.Parcelable$Creator {
    private static final com.google.android.gms.common.api.zza zzb;
    private final android.os.Parcelable$Creator zza;

    static zza()
    {
        com.google.android.gms.common.api.zza.zzb = new com.google.android.gms.common.api.zza(new com.google.android.gms.common.api.zzb());
        return;
    }

    private zza(android.os.Parcelable$Creator p1)
    {
        this.zza = p1;
        return;
    }

    public static com.google.android.gms.common.api.zza zza()
    {
        return com.google.android.gms.common.api.zza.zzb;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p4)
    {
        int v0_0 = p4.dataPosition();
        if (p4.readInt() != -204102970) {
            p4.setDataPosition((v0_0 - 4));
            return com.google.android.gms.common.api.ApiMetadata.getEmptyInstance();
        } else {
            return com.google.android.gms.common.api.zzb.zza(p4);
        }
    }

    public final bridge synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.common.api.ApiMetadata[] v1_1 = new com.google.android.gms.common.api.ApiMetadata[p1];
        return v1_1;
    }
}
