package com.google.android.gms.internal.base;
public class zab extends android.os.Binder implements android.os.IInterface {

    public zab(String p1)
    {
        this.attachInterface(this, p1);
        return;
    }

    public final android.os.IBinder asBinder()
    {
        return this;
    }

    public final boolean onTransact(int p2, android.os.Parcel p3, android.os.Parcel p4, int p5)
    {
        if (p2 <= 16777215) {
            p3.enforceInterface(this.getInterfaceDescriptor());
        } else {
            if (super.onTransact(p2, p3, p4, p5)) {
                return 1;
            }
        }
        return this.zaa(p2, p3, p4, p5);
    }

    public boolean zaa(int p1, android.os.Parcel p2, android.os.Parcel p3, int p4)
    {
        throw 0;
    }
}
