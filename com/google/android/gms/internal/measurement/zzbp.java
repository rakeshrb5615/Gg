package com.google.android.gms.internal.measurement;
public abstract class zzbp extends com.google.android.gms.internal.measurement.zzbm implements com.google.android.gms.internal.measurement.zzbq {

    public static com.google.android.gms.internal.measurement.zzbq zzb(android.os.IBinder p2)
    {
        com.google.android.gms.internal.measurement.zzbo v0_1 = p2.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        if (!(v0_1 instanceof com.google.android.gms.internal.measurement.zzbq)) {
            return new com.google.android.gms.internal.measurement.zzbo(p2);
        } else {
            return ((com.google.android.gms.internal.measurement.zzbq) v0_1);
        }
    }
}
