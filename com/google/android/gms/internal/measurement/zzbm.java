package com.google.android.gms.internal.measurement;
public class zzbm extends android.os.Binder implements android.os.IInterface {

    public zzbm(String p1)
    {
        this.attachInterface(this, p1);
        return;
    }

    public android.os.IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int p2, android.os.Parcel p3, android.os.Parcel p4, int p5)
    {
        if (p2 <= 16777215) {
            p3.enforceInterface(this.getInterfaceDescriptor());
        } else {
            if (super.onTransact(p2, p3, p4, p5)) {
                return 1;
            }
        }
        return this.zza(p2, p3, p4, p5);
    }

    public boolean zza(int p1, android.os.Parcel p2, android.os.Parcel p3, int p4)
    {
        throw 0;
    }
}
