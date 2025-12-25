package com.google.android.gms.internal.auth;
public final class zzav extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    final int zza;
    public final String zzb;
    public final int zzc;

    static zzav()
    {
        com.google.android.gms.internal.auth.zzav.CREATOR = new com.google.android.gms.internal.auth.zzaw();
        return;
    }

    public zzav(int p1, String p2, int p3)
    {
        this.zza = 1;
        this.zzb = ((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(p2));
        this.zzc = p3;
        return;
    }

    public zzav(String p2, int p3)
    {
        this(1, p2, p3);
        return;
    }

    public final void writeToParcel(android.os.Parcel p4, int p5)
    {
        p5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p4, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 2, this.zzb, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p4, 3, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, p5);
        return;
    }
}
