package com.google.android.gms.auth.api.accounttransfer;
public class DeviceMetaData extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    final int zza;
    private boolean zzb;
    private long zzc;
    private final boolean zzd;

    static DeviceMetaData()
    {
        com.google.android.gms.auth.api.accounttransfer.DeviceMetaData.CREATOR = new com.google.android.gms.auth.api.accounttransfer.zzy();
        return;
    }

    public DeviceMetaData(int p1, boolean p2, long p3, boolean p5)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        this.zzd = p5;
        return;
    }

    public long getMinAgeOfLockScreen()
    {
        return this.zzc;
    }

    public boolean isChallengeAllowed()
    {
        return this.zzd;
    }

    public boolean isLockScreenSolved()
    {
        return this.zzb;
    }

    public final void writeToParcel(android.os.Parcel p4, int p5)
    {
        p5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p4, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p4, 2, this.isLockScreenSolved());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(p4, 3, this.getMinAgeOfLockScreen());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p4, 4, this.isChallengeAllowed());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, p5);
        return;
    }
}
