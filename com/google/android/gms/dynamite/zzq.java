package com.google.android.gms.dynamite;
public final class zzq extends com.google.android.gms.internal.common.zza implements android.os.IInterface {

    public zzq(android.os.IBinder p2)
    {
        super(p2, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
        return;
    }

    public final com.google.android.gms.dynamic.IObjectWrapper zze(com.google.android.gms.dynamic.IObjectWrapper p2, String p3, int p4, com.google.android.gms.dynamic.IObjectWrapper p5)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.common.zzc.zze(v0, p2);
        v0.writeString(p3);
        v0.writeInt(p4);
        com.google.android.gms.internal.common.zzc.zze(v0, p5);
        android.os.Parcel v2_2 = this.zzB(2, v0);
        com.google.android.gms.dynamic.IObjectWrapper v3_2 = com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(v2_2.readStrongBinder());
        v2_2.recycle();
        return v3_2;
    }

    public final com.google.android.gms.dynamic.IObjectWrapper zzf(com.google.android.gms.dynamic.IObjectWrapper p2, String p3, int p4, com.google.android.gms.dynamic.IObjectWrapper p5)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.common.zzc.zze(v0, p2);
        v0.writeString(p3);
        v0.writeInt(p4);
        com.google.android.gms.internal.common.zzc.zze(v0, p5);
        android.os.Parcel v2_2 = this.zzB(3, v0);
        com.google.android.gms.dynamic.IObjectWrapper v3_2 = com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(v2_2.readStrongBinder());
        v2_2.recycle();
        return v3_2;
    }
}
