package com.google.android.gms.common.internal;
public final class zzy extends com.google.android.gms.internal.common.zza implements com.google.android.gms.common.internal.IGmsCallbacks {

    public zzy(android.os.IBinder p2)
    {
        super(p2, "com.google.android.gms.common.internal.IGmsCallbacks");
        return;
    }

    public final void onPostInitComplete(int p2, android.os.IBinder p3, android.os.Bundle p4)
    {
        android.os.Parcel v0 = this.zza();
        v0.writeInt(p2);
        v0.writeStrongBinder(p3);
        com.google.android.gms.internal.common.zzc.zzc(v0, p4);
        this.zzD(1, v0);
        return;
    }

    public final void zzb(int p1, android.os.Bundle p2)
    {
        throw 0;
    }

    public final void zzc(int p1, android.os.IBinder p2, com.google.android.gms.common.internal.zzj p3)
    {
        throw 0;
    }
}
