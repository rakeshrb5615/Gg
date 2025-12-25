package com.google.android.gms.common.moduleinstall;
public class ModuleInstallResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final int zaa;
    private final boolean zab;

    static ModuleInstallResponse()
    {
        com.google.android.gms.common.moduleinstall.ModuleInstallResponse.CREATOR = new com.google.android.gms.common.moduleinstall.zad();
        return;
    }

    public ModuleInstallResponse(int p2)
    {
        this(p2, 0);
        return;
    }

    public ModuleInstallResponse(int p1, boolean p2)
    {
        this.zaa = p1;
        this.zab = p2;
        return;
    }

    public boolean areModulesAlreadyInstalled()
    {
        if (this.zaa != 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public int getSessionId()
    {
        return this.zaa;
    }

    public void writeToParcel(android.os.Parcel p3, int p4)
    {
        p4 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p3);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p3, 1, this.getSessionId());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p3, 2, this.zab);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p3, p4);
        return;
    }

    public final boolean zaa()
    {
        return this.zab;
    }
}
