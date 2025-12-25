package com.google.android.gms.internal.auth;
public final class zzbw extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    final int zza;
    String zzb;

    static zzbw()
    {
        com.google.android.gms.internal.auth.zzbw.CREATOR = new com.google.android.gms.internal.auth.zzbx();
        return;
    }

    public zzbw()
    {
        this.zza = 1;
        return;
    }

    public zzbw(int p1, String p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final void writeToParcel(android.os.Parcel p4, int p5)
    {
        p5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p4, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 2, this.zzb, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, p5);
        return;
    }

    public final com.google.android.gms.internal.auth.zzbw zza(String p1)
    {
        this.zzb = p1;
        return this;
    }
}
