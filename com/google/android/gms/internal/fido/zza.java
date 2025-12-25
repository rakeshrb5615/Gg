package com.google.android.gms.internal.fido;
public class zza implements android.os.IInterface {
    private final android.os.IBinder zza;
    private final String zzb;

    public zza(android.os.IBinder p1, String p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final android.os.IBinder asBinder()
    {
        return this.zza;
    }

    public final android.os.Parcel zza()
    {
        android.os.Parcel v0 = android.os.Parcel.obtain();
        v0.writeInterfaceToken(this.zzb);
        return v0;
    }

    public final void zzb(int p4, android.os.Parcel p5)
    {
        android.os.Parcel v0 = android.os.Parcel.obtain();
        try {
            this.zza.transact(p4, p5, v0, 0);
            v0.readException();
            p5.recycle();
            v0.recycle();
            return;
        } catch (Throwable v4_1) {
            p5.recycle();
            v0.recycle();
            throw v4_1;
        }
    }
}
