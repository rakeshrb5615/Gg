package com.google.android.gms.common.moduleinstall;
public class ModuleAvailabilityResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final boolean zaa;
    private final int zab;

    static ModuleAvailabilityResponse()
    {
        com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse.CREATOR = new com.google.android.gms.common.moduleinstall.zaa();
        return;
    }

    public ModuleAvailabilityResponse(boolean p1, int p2)
    {
        this.zaa = p1;
        this.zab = p2;
        return;
    }

    public boolean areModulesAvailable()
    {
        return this.zaa;
    }

    public int getAvailabilityStatus()
    {
        return this.zab;
    }

    public void writeToParcel(android.os.Parcel p3, int p4)
    {
        p4 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p3);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p3, 1, this.areModulesAvailable());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p3, 2, this.getAvailabilityStatus());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p3, p4);
        return;
    }
}
