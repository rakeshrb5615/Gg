package com.google.android.gms.measurement.internal;
public abstract class zzgd extends com.google.android.gms.internal.measurement.zzbm implements com.google.android.gms.measurement.internal.zzge {

    public zzgd()
    {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
        return;
    }

    public final boolean zza(int p1, android.os.Parcel p2, android.os.Parcel p3, int p4)
    {
        if (p1 != 2) {
            return 0;
        } else {
            int v1_3 = p2.createTypedArrayList(com.google.android.gms.measurement.internal.zzoh.CREATOR);
            com.google.android.gms.internal.measurement.zzbn.zzf(p2);
            this.zze(v1_3);
            return 1;
        }
    }
}
