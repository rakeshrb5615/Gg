package com.google.android.gms.common.moduleinstall;
public class ModuleInstallIntentResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final android.app.PendingIntent zaa;

    static ModuleInstallIntentResponse()
    {
        com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse.CREATOR = new com.google.android.gms.common.moduleinstall.zab();
        return;
    }

    public ModuleInstallIntentResponse(android.app.PendingIntent p1)
    {
        this.zaa = p1;
        return;
    }

    public android.app.PendingIntent getPendingIntent()
    {
        return this.zaa;
    }

    public void writeToParcel(android.os.Parcel p5, int p6)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p5);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 1, this.getPendingIntent(), p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p5, v0);
        return;
    }
}
