package com.google.android.gms.common.internal.service;
public abstract class zaj extends com.google.android.gms.internal.base.zab implements com.google.android.gms.common.internal.service.zak {

    public zaj()
    {
        super("com.google.android.gms.common.internal.service.ICommonCallbacks");
        return;
    }

    public final boolean zaa(int p1, android.os.Parcel p2, android.os.Parcel p3, int p4)
    {
        if (p1 != 1) {
            return 0;
        } else {
            int v1_2 = p2.readInt();
            com.google.android.gms.internal.base.zac.zab(p2);
            this.zab(v1_2);
            return 1;
        }
    }
}
