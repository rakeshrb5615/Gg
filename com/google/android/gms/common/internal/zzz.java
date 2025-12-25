package com.google.android.gms.common.internal;
public abstract class zzz extends com.google.android.gms.internal.common.zzb implements com.google.android.gms.common.internal.IGmsCallbacks {

    public zzz()
    {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        return;
    }

    public final boolean zza(int p3, android.os.Parcel p4, android.os.Parcel p5, int p6)
    {
        if (p3 == 1) {
            int v3_3 = p4.readInt();
            android.os.IBinder v0_6 = p4.readStrongBinder();
            com.google.android.gms.common.internal.zzj v1_5 = ((android.os.Bundle) com.google.android.gms.internal.common.zzc.zzb(p4, android.os.Bundle.CREATOR));
            com.google.android.gms.internal.common.zzc.zzf(p4);
            this.onPostInitComplete(v3_3, v0_6, v1_5);
        } else {
            if (p3 == 2) {
                int v3_1 = p4.readInt();
                android.os.IBinder v0_3 = ((android.os.Bundle) com.google.android.gms.internal.common.zzc.zzb(p4, android.os.Bundle.CREATOR));
                com.google.android.gms.internal.common.zzc.zzf(p4);
                this.zzb(v3_1, v0_3);
            } else {
                if (p3 == 3) {
                    int v3_2 = p4.readInt();
                    android.os.IBinder v0_5 = p4.readStrongBinder();
                    com.google.android.gms.common.internal.zzj v1_2 = ((com.google.android.gms.common.internal.zzj) com.google.android.gms.internal.common.zzc.zzb(p4, com.google.android.gms.common.internal.zzj.CREATOR));
                    com.google.android.gms.internal.common.zzc.zzf(p4);
                    this.zzc(v3_2, v0_5, v1_2);
                } else {
                    return 0;
                }
            }
        }
        p5.writeNoException();
        return 1;
    }
}
