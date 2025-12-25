package com.google.android.gms.internal.measurement;
public abstract class zzct extends com.google.android.gms.internal.measurement.zzbm implements com.google.android.gms.internal.measurement.zzcu {

    public zzct()
    {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        return;
    }

    public final boolean zza(int p1, android.os.Parcel p2, android.os.Parcel p3, int p4)
    {
        if (p1 != 1) {
            return 0;
        } else {
            int v1_4 = ((android.os.Bundle) com.google.android.gms.internal.measurement.zzbn.zzb(p2, android.os.Bundle.CREATOR));
            com.google.android.gms.internal.measurement.zzbn.zzf(p2);
            this.zzb(v1_4);
            p3.writeNoException();
            return 1;
        }
    }
}
