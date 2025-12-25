package com.google.android.gms.common.api.internal;
public abstract class IStatusCallback$Stub extends com.google.android.gms.internal.base.zab implements com.google.android.gms.common.api.internal.IStatusCallback {

    public IStatusCallback$Stub()
    {
        super("com.google.android.gms.common.api.internal.IStatusCallback");
        return;
    }

    public static com.google.android.gms.common.api.internal.IStatusCallback asInterface(android.os.IBinder p2)
    {
        if (p2 != 0) {
            com.google.android.gms.common.api.internal.zaby v0_1 = p2.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            if (!(v0_1 instanceof com.google.android.gms.common.api.internal.IStatusCallback)) {
                return new com.google.android.gms.common.api.internal.zaby(p2);
            } else {
                return ((com.google.android.gms.common.api.internal.IStatusCallback) v0_1);
            }
        } else {
            return 0;
        }
    }

    public final boolean zaa(int p1, android.os.Parcel p2, android.os.Parcel p3, int p4)
    {
        if (p1 != 1) {
            return 0;
        } else {
            int v1_4 = ((com.google.android.gms.common.api.Status) com.google.android.gms.internal.base.zac.zaa(p2, com.google.android.gms.common.api.Status.CREATOR));
            com.google.android.gms.internal.base.zac.zab(p2);
            this.onResult(v1_4);
            return 1;
        }
    }
}
