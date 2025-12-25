package com.google.android.gms.internal.location;
public final class zzee extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final int zza;
    private final android.os.IBinder zzb;
    private final android.os.IBinder zzc;
    private final android.app.PendingIntent zzd;
    private final String zze;

    static zzee()
    {
        com.google.android.gms.internal.location.zzee.CREATOR = new com.google.android.gms.internal.location.zzef();
        return;
    }

    public zzee(int p1, android.os.IBinder p2, android.os.IBinder p3, android.app.PendingIntent p4, String p5)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        this.zzd = p4;
        this.zze = p5;
        return;
    }

    public static com.google.android.gms.internal.location.zzee zza(android.os.IInterface p6, com.google.android.gms.location.zzz p7, String p8)
    {
        if (p6 == 0) {
            p6 = 0;
        }
        return new com.google.android.gms.internal.location.zzee(1, p6, p7, 0, p8);
    }

    public static com.google.android.gms.internal.location.zzee zzb(android.os.IInterface p6, com.google.android.gms.location.zzw p7, String p8)
    {
        if (p6 == 0) {
            p6 = 0;
        }
        return new com.google.android.gms.internal.location.zzee(2, p6, p7, 0, p8);
    }

    public static com.google.android.gms.internal.location.zzee zzc(android.app.PendingIntent p6)
    {
        return new com.google.android.gms.internal.location.zzee(3, 0, 0, p6, 0);
    }

    public static com.google.android.gms.internal.location.zzee zzd(com.google.android.gms.internal.location.zzz p6)
    {
        return new com.google.android.gms.internal.location.zzee(4, 0, p6, 0, 0);
    }

    public final void writeToParcel(android.os.Parcel p5, int p6)
    {
        String v0_0 = this.zza;
        int v1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p5);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p5, 1, v0_0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(p5, 2, this.zzb, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(p5, 3, this.zzc, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 4, this.zzd, p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 6, this.zze, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p5, v1);
        return;
    }
}
