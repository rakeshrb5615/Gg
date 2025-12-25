package com.google.android.gms.internal.measurement;
public abstract class zzcz extends com.google.android.gms.internal.measurement.zzbm implements com.google.android.gms.internal.measurement.zzda {

    public zzcz()
    {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
        return;
    }

    public final boolean zza(int p7, android.os.Parcel p8, android.os.Parcel p9, int p10)
    {
        if (p7 == 1) {
            String v1 = p8.readString();
            String v2 = p8.readString();
            android.os.Bundle v3_0 = ((android.os.Bundle) com.google.android.gms.internal.measurement.zzbn.zzb(p8, android.os.Bundle.CREATOR));
            long v4 = p8.readLong();
            com.google.android.gms.internal.measurement.zzbn.zzf(p8);
            this.zze(v1, v2, v3_0, v4);
            p9.writeNoException();
        } else {
            if (p7 == 2) {
                int v7_1 = this.zzf();
                p9.writeNoException();
                p9.writeInt(v7_1);
            } else {
                return 0;
            }
        }
        return 1;
    }
}
