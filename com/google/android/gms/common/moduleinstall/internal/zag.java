package com.google.android.gms.common.moduleinstall.internal;
public abstract class zag extends com.google.android.gms.internal.base.zab implements com.google.android.gms.common.moduleinstall.internal.zah {

    public zag()
    {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallStatusListener");
        return;
    }

    public final boolean zaa(int p1, android.os.Parcel p2, android.os.Parcel p3, int p4)
    {
        if (p1 != 1) {
            return 0;
        } else {
            int v1_4 = ((com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate) com.google.android.gms.internal.base.zac.zaa(p2, com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate.CREATOR));
            com.google.android.gms.internal.base.zac.zab(p2);
            this.zab(v1_4);
            return 1;
        }
    }
}
