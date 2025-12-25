package com.google.android.gms.common.moduleinstall;
public class ModuleInstallStatusUpdate extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final int zaa;
    private final int zab;
    private final Long zac;
    private final Long zad;
    private final int zae;
    private final com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate$ProgressInfo zaf;

    static ModuleInstallStatusUpdate()
    {
        com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate.CREATOR = new com.google.android.gms.common.moduleinstall.zae();
        return;
    }

    public ModuleInstallStatusUpdate(int p3, int p4, Long p5, Long p6, int p7)
    {
        com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate$ProgressInfo v3_2;
        this.zaa = p3;
        this.zab = p4;
        this.zac = p5;
        this.zad = p6;
        this.zae = p7;
        if ((p5 == null) || ((p6 == 0) || (p6.longValue() == 0))) {
            v3_2 = 0;
        } else {
            v3_2 = new com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate$ProgressInfo(p5.longValue(), p6.longValue());
        }
        this.zaf = v3_2;
        return;
    }

    public int getErrorCode()
    {
        return this.zae;
    }

    public int getInstallState()
    {
        return this.zab;
    }

    public com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate$ProgressInfo getProgressInfo()
    {
        return this.zaf;
    }

    public int getSessionId()
    {
        return this.zaa;
    }

    public void writeToParcel(android.os.Parcel p4, int p5)
    {
        p5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p4, 1, this.getSessionId());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p4, 2, this.getInstallState());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLongObject(p4, 3, this.zac, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLongObject(p4, 4, this.zad, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p4, 5, this.getErrorCode());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, p5);
        return;
    }
}
