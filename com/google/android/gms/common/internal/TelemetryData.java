package com.google.android.gms.common.internal;
public class TelemetryData extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final int zaa;
    private java.util.List zab;

    static TelemetryData()
    {
        com.google.android.gms.common.internal.TelemetryData.CREATOR = new com.google.android.gms.common.internal.zaab();
        return;
    }

    public TelemetryData(int p1, java.util.List p2)
    {
        this.zaa = p1;
        this.zab = p2;
        return;
    }

    public final void writeToParcel(android.os.Parcel p4, int p5)
    {
        p5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p4, 1, this.zaa);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(p4, 2, this.zab, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, p5);
        return;
    }

    public final int zaa()
    {
        return this.zaa;
    }

    public final java.util.List zab()
    {
        return this.zab;
    }

    public final void zac(com.google.android.gms.common.internal.MethodInvocation p2)
    {
        if (this.zab == null) {
            this.zab = new java.util.ArrayList();
        }
        this.zab.add(p2);
        return;
    }
}
