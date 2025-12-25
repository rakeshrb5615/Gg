package com.google.android.gms.common.internal;
public abstract class IAccountAccessor$Stub extends com.google.android.gms.internal.common.zzb implements com.google.android.gms.common.internal.IAccountAccessor {

    public IAccountAccessor$Stub()
    {
        super("com.google.android.gms.common.internal.IAccountAccessor");
        return;
    }

    public static com.google.android.gms.common.internal.IAccountAccessor asInterface(android.os.IBinder p2)
    {
        if (p2 != 0) {
            com.google.android.gms.common.internal.zzt v0_1 = p2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            if (!(v0_1 instanceof com.google.android.gms.common.internal.IAccountAccessor)) {
                return new com.google.android.gms.common.internal.zzt(p2);
            } else {
                return ((com.google.android.gms.common.internal.IAccountAccessor) v0_1);
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
            int v1_2 = this.zzb();
            p3.writeNoException();
            com.google.android.gms.internal.common.zzc.zzd(p3, v1_2);
            return 1;
        }
    }
}
