package com.google.android.gms.measurement.internal;
public final class zzgc extends com.google.android.gms.internal.measurement.zzbl implements com.google.android.gms.measurement.internal.zzge {

    public zzgc(android.os.IBinder p2)
    {
        super(p2, "com.google.android.gms.measurement.internal.ITriggerUrisCallback");
        return;
    }

    public final void zze(java.util.List p2)
    {
        android.os.Parcel v0 = this.zza();
        v0.writeTypedList(p2);
        this.zzd(2, v0);
        return;
    }
}
