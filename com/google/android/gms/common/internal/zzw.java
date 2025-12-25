package com.google.android.gms.common.internal;
public abstract class zzw extends com.google.android.gms.internal.common.zzb implements com.google.android.gms.common.internal.zzx {

    public zzw()
    {
        super("com.google.android.gms.common.internal.ICertData");
        return;
    }

    public static com.google.android.gms.common.internal.zzx zzg(android.os.IBinder p2)
    {
        com.google.android.gms.common.internal.zzv v0_1 = p2.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        if (!(v0_1 instanceof com.google.android.gms.common.internal.zzx)) {
            return new com.google.android.gms.common.internal.zzv(p2);
        } else {
            return ((com.google.android.gms.common.internal.zzx) v0_1);
        }
    }

    public final boolean zza(int p1, android.os.Parcel p2, android.os.Parcel p3, int p4)
    {
        if (p1 == 1) {
            int v1_2 = this.zzd();
            p3.writeNoException();
            com.google.android.gms.internal.common.zzc.zze(p3, v1_2);
        } else {
            if (p1 == 2) {
                int v1_3 = this.zze();
                p3.writeNoException();
                p3.writeInt(v1_3);
            } else {
                return 0;
            }
        }
        return 1;
    }
}
