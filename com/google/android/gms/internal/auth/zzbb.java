package com.google.android.gms.internal.auth;
public final class zzbb extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    final int zza;
    public final String zzb;
    public final android.app.PendingIntent zzc;

    static zzbb()
    {
        com.google.android.gms.internal.auth.zzbb.CREATOR = new com.google.android.gms.internal.auth.zzbc();
        return;
    }

    public zzbb(int p1, String p2, android.app.PendingIntent p3)
    {
        this.zza = 1;
        this.zzb = ((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(p2));
        this.zzc = ((android.app.PendingIntent) com.google.android.gms.common.internal.Preconditions.checkNotNull(p3));
        return;
    }

    public zzbb(String p2, android.app.PendingIntent p3)
    {
        this(1, p2, p3);
        return;
    }

    public final void writeToParcel(android.os.Parcel p5, int p6)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p5);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p5, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 2, this.zzb, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 3, this.zzc, p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p5, v0);
        return;
    }
}
