package com.google.android.gms.dynamic;
public abstract class IObjectWrapper$Stub extends com.google.android.gms.internal.common.zzb implements com.google.android.gms.dynamic.IObjectWrapper {

    public IObjectWrapper$Stub()
    {
        super("com.google.android.gms.dynamic.IObjectWrapper");
        return;
    }

    public static com.google.android.gms.dynamic.IObjectWrapper asInterface(android.os.IBinder p2)
    {
        if (p2 != 0) {
            com.google.android.gms.dynamic.zzb v0_1 = p2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (!(v0_1 instanceof com.google.android.gms.dynamic.IObjectWrapper)) {
                return new com.google.android.gms.dynamic.zzb(p2);
            } else {
                return ((com.google.android.gms.dynamic.IObjectWrapper) v0_1);
            }
        } else {
            return 0;
        }
    }
}
