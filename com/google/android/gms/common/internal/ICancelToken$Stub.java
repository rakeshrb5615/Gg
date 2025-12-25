package com.google.android.gms.common.internal;
public abstract class ICancelToken$Stub extends com.google.android.gms.internal.common.zzb implements com.google.android.gms.common.internal.ICancelToken {

    public ICancelToken$Stub()
    {
        super("com.google.android.gms.common.internal.ICancelToken");
        return;
    }

    public static com.google.android.gms.common.internal.ICancelToken asInterface(android.os.IBinder p2)
    {
        if (p2 != 0) {
            com.google.android.gms.common.internal.zzu v0_1 = p2.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
            if (!(v0_1 instanceof com.google.android.gms.common.internal.ICancelToken)) {
                return new com.google.android.gms.common.internal.zzu(p2);
            } else {
                return ((com.google.android.gms.common.internal.ICancelToken) v0_1);
            }
        } else {
            return 0;
        }
    }

    public final boolean zza(int p1, android.os.Parcel p2, android.os.Parcel p3, int p4)
    {
        if (p1 != 2) {
            return 0;
        } else {
            this.cancel();
            return 1;
        }
    }
}
