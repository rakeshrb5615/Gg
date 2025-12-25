package com.google.android.gms.auth;
public class AccountChangeEventsResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    final int zza;
    final java.util.List zzb;

    static AccountChangeEventsResponse()
    {
        com.google.android.gms.auth.AccountChangeEventsResponse.CREATOR = new com.google.android.gms.auth.zzc();
        return;
    }

    public AccountChangeEventsResponse(int p1, java.util.List p2)
    {
        this.zza = p1;
        this.zzb = ((java.util.List) com.google.android.gms.common.internal.Preconditions.checkNotNull(p2));
        return;
    }

    public AccountChangeEventsResponse(java.util.List p2)
    {
        this.zza = 1;
        this.zzb = ((java.util.List) com.google.android.gms.common.internal.Preconditions.checkNotNull(p2));
        return;
    }

    public java.util.List getEvents()
    {
        return this.zzb;
    }

    public void writeToParcel(android.os.Parcel p4, int p5)
    {
        p5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p4, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(p4, 2, this.zzb, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, p5);
        return;
    }
}
