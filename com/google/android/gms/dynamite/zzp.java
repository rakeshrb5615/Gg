package com.google.android.gms.dynamite;
public final class zzp extends com.google.android.gms.internal.common.zza implements android.os.IInterface {

    public zzp(android.os.IBinder p2)
    {
        super(p2, "com.google.android.gms.dynamite.IDynamiteLoader");
        return;
    }

    public final com.google.android.gms.dynamic.IObjectWrapper zze(com.google.android.gms.dynamic.IObjectWrapper p2, String p3, int p4)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.common.zzc.zze(v0, p2);
        v0.writeString(p3);
        v0.writeInt(p4);
        android.os.Parcel v2_2 = this.zzB(2, v0);
        com.google.android.gms.dynamic.IObjectWrapper v3_1 = com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(v2_2.readStrongBinder());
        v2_2.recycle();
        return v3_1;
    }

    public final int zzf(com.google.android.gms.dynamic.IObjectWrapper p2, String p3, boolean p4)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.common.zzc.zze(v0, p2);
        v0.writeString(p3);
        v0.writeInt(p4);
        android.os.Parcel v2_2 = this.zzB(3, v0);
        int v3_1 = v2_2.readInt();
        v2_2.recycle();
        return v3_1;
    }

    public final com.google.android.gms.dynamic.IObjectWrapper zzg(com.google.android.gms.dynamic.IObjectWrapper p2, String p3, int p4)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.common.zzc.zze(v0, p2);
        v0.writeString(p3);
        v0.writeInt(p4);
        android.os.Parcel v2_2 = this.zzB(4, v0);
        com.google.android.gms.dynamic.IObjectWrapper v3_1 = com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(v2_2.readStrongBinder());
        v2_2.recycle();
        return v3_1;
    }

    public final int zzh(com.google.android.gms.dynamic.IObjectWrapper p2, String p3, boolean p4)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.common.zzc.zze(v0, p2);
        v0.writeString(p3);
        v0.writeInt(p4);
        android.os.Parcel v2_2 = this.zzB(5, v0);
        int v3_1 = v2_2.readInt();
        v2_2.recycle();
        return v3_1;
    }

    public final int zzi()
    {
        android.os.Parcel v0_1 = this.zzB(6, this.zza());
        int v1_1 = v0_1.readInt();
        v0_1.recycle();
        return v1_1;
    }

    public final com.google.android.gms.dynamic.IObjectWrapper zzj(com.google.android.gms.dynamic.IObjectWrapper p2, String p3, boolean p4, long p5)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.common.zzc.zze(v0, p2);
        v0.writeString(p3);
        v0.writeInt(p4);
        v0.writeLong(p5);
        android.os.Parcel v2_2 = this.zzB(7, v0);
        com.google.android.gms.dynamic.IObjectWrapper v3_2 = com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(v2_2.readStrongBinder());
        v2_2.recycle();
        return v3_2;
    }

    public final com.google.android.gms.dynamic.IObjectWrapper zzk(com.google.android.gms.dynamic.IObjectWrapper p2, String p3, int p4, com.google.android.gms.dynamic.IObjectWrapper p5)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.common.zzc.zze(v0, p2);
        v0.writeString(p3);
        v0.writeInt(p4);
        com.google.android.gms.internal.common.zzc.zze(v0, p5);
        android.os.Parcel v2_2 = this.zzB(8, v0);
        com.google.android.gms.dynamic.IObjectWrapper v3_2 = com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(v2_2.readStrongBinder());
        v2_2.recycle();
        return v3_2;
    }
}
