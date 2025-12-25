package com.google.android.gms.internal.location;
public final class zzl extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.api.Result {
    public static final android.os.Parcelable$Creator CREATOR;
    public static final com.google.android.gms.internal.location.zzl zza;
    private final com.google.android.gms.common.api.Status zzb;

    static zzl()
    {
        com.google.android.gms.internal.location.zzl.zza = new com.google.android.gms.internal.location.zzl(com.google.android.gms.common.api.Status.RESULT_SUCCESS);
        com.google.android.gms.internal.location.zzl.CREATOR = new com.google.android.gms.internal.location.zzm();
        return;
    }

    public zzl(com.google.android.gms.common.api.Status p1)
    {
        this.zzb = p1;
        return;
    }

    public final com.google.android.gms.common.api.Status getStatus()
    {
        return this.zzb;
    }

    public final void writeToParcel(android.os.Parcel p5, int p6)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p5);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 1, this.zzb, p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p5, v0);
        return;
    }
}
