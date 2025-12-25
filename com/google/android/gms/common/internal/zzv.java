package com.google.android.gms.common.internal;
public final class zzv extends com.google.android.gms.internal.common.zza implements com.google.android.gms.common.internal.zzx {

    public zzv(android.os.IBinder p2)
    {
        super(p2, "com.google.android.gms.common.internal.ICertData");
        return;
    }

    public final com.google.android.gms.dynamic.IObjectWrapper zzd()
    {
        android.os.Parcel v0_1 = this.zzB(1, this.zza());
        com.google.android.gms.dynamic.IObjectWrapper v1_2 = com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(v0_1.readStrongBinder());
        v0_1.recycle();
        return v1_2;
    }

    public final int zze()
    {
        android.os.Parcel v0_1 = this.zzB(2, this.zza());
        int v1_1 = v0_1.readInt();
        v0_1.recycle();
        return v1_1;
    }
}
