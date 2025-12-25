package com.google.android.gms.internal.measurement;
public final class zzbo extends com.google.android.gms.internal.measurement.zzbl implements com.google.android.gms.internal.measurement.zzbq {

    public zzbo(android.os.IBinder p2)
    {
        super(p2, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        return;
    }

    public final android.os.Bundle zze(android.os.Bundle p2)
    {
        android.os.Bundle v0_0 = this.zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(v0_0, p2);
        android.os.Parcel v2_2 = this.zzP(1, v0_0);
        android.os.Bundle v0_3 = ((android.os.Bundle) com.google.android.gms.internal.measurement.zzbn.zzb(v2_2, android.os.Bundle.CREATOR));
        v2_2.recycle();
        return v0_3;
    }
}
