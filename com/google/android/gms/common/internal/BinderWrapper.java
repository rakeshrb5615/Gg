package com.google.android.gms.common.internal;
public final class BinderWrapper implements android.os.Parcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final android.os.IBinder zza;

    static BinderWrapper()
    {
        com.google.android.gms.common.internal.BinderWrapper.CREATOR = new com.google.android.gms.common.internal.zzh();
        return;
    }

    public BinderWrapper(android.os.IBinder p1)
    {
        this.zza = p1;
        return;
    }

    public synthetic BinderWrapper(android.os.Parcel p1, byte[] p2)
    {
        this.zza = p1.readStrongBinder();
        return;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(android.os.Parcel p1, int p2)
    {
        p1.writeStrongBinder(this.zza);
        return;
    }
}
