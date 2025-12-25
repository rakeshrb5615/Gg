package com.google.android.gms.measurement.internal;
public abstract class zzgg extends com.google.android.gms.internal.measurement.zzbm implements com.google.android.gms.measurement.internal.zzgh {

    public zzgg()
    {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
        return;
    }

    public final boolean zza(int p1, android.os.Parcel p2, android.os.Parcel p3, int p4)
    {
        if (p1 != 2) {
            return 0;
        } else {
            int v1_5 = ((com.google.android.gms.measurement.internal.zzoq) com.google.android.gms.internal.measurement.zzbn.zzb(p2, com.google.android.gms.measurement.internal.zzoq.CREATOR));
            com.google.android.gms.internal.measurement.zzbn.zzf(p2);
            this.zze(v1_5);
            return 1;
        }
    }
}
