package com.google.android.gms.internal.auth;
public final class zzaz extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    final int zza;
    public final String zzb;
    public final byte[] zzc;

    static zzaz()
    {
        com.google.android.gms.internal.auth.zzaz.CREATOR = new com.google.android.gms.internal.auth.zzba();
        return;
    }

    public zzaz(int p1, String p2, byte[] p3)
    {
        this.zza = 1;
        this.zzb = ((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(p2));
        this.zzc = ((byte[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(p3));
        return;
    }

    public zzaz(String p2, byte[] p3)
    {
        this(1, p2, p3);
        return;
    }

    public final void writeToParcel(android.os.Parcel p4, int p5)
    {
        p5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p4, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 2, this.zzb, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(p4, 3, this.zzc, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, p5);
        return;
    }
}
