package com.google.android.gms.internal.measurement;
public final class zzcy extends com.google.android.gms.internal.measurement.zzbl implements com.google.android.gms.internal.measurement.zzda {

    public zzcy(android.os.IBinder p2)
    {
        super(p2, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
        return;
    }

    public final void zze(String p2, String p3, android.os.Bundle p4, long p5)
    {
        android.os.Parcel v0 = this.zza();
        v0.writeString(p2);
        v0.writeString(p3);
        com.google.android.gms.internal.measurement.zzbn.zzc(v0, p4);
        v0.writeLong(p5);
        this.zzc(1, v0);
        return;
    }

    public final int zzf()
    {
        android.os.Parcel v0_1 = this.zzP(2, this.zza());
        int v1_1 = v0_1.readInt();
        v0_1.recycle();
        return v1_1;
    }
}
