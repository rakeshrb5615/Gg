package com.google.android.gms.common.internal;
public final class zzab extends com.google.android.gms.internal.common.zza implements com.google.android.gms.common.internal.zzad {

    public zzab(android.os.IBinder p2)
    {
        super(p2, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return;
    }

    public final boolean zze(com.google.android.gms.common.zzt p2, com.google.android.gms.dynamic.IObjectWrapper p3)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.common.zzc.zzc(v0, p2);
        com.google.android.gms.internal.common.zzc.zze(v0, p3);
        android.os.Parcel v2_2 = this.zzB(5, v0);
        boolean v3_1 = com.google.android.gms.internal.common.zzc.zza(v2_2);
        v2_2.recycle();
        return v3_1;
    }

    public final com.google.android.gms.common.zzr zzf(com.google.android.gms.common.zzp p2)
    {
        com.google.android.gms.common.zzr v0_0 = this.zza();
        com.google.android.gms.internal.common.zzc.zzc(v0_0, p2);
        android.os.Parcel v2_2 = this.zzB(6, v0_0);
        com.google.android.gms.common.zzr v0_3 = ((com.google.android.gms.common.zzr) com.google.android.gms.internal.common.zzc.zzb(v2_2, com.google.android.gms.common.zzr.CREATOR));
        v2_2.recycle();
        return v0_3;
    }

    public final boolean zzg()
    {
        android.os.Parcel v0_1 = this.zzB(7, this.zza());
        boolean v1_1 = com.google.android.gms.internal.common.zzc.zza(v0_1);
        v0_1.recycle();
        return v1_1;
    }

    public final com.google.android.gms.common.zzr zzh(com.google.android.gms.common.zzp p2)
    {
        com.google.android.gms.common.zzr v0_0 = this.zza();
        com.google.android.gms.internal.common.zzc.zzc(v0_0, p2);
        android.os.Parcel v2_2 = this.zzB(8, v0_0);
        com.google.android.gms.common.zzr v0_3 = ((com.google.android.gms.common.zzr) com.google.android.gms.internal.common.zzc.zzb(v2_2, com.google.android.gms.common.zzr.CREATOR));
        v2_2.recycle();
        return v0_3;
    }

    public final boolean zzi()
    {
        android.os.Parcel v0_1 = this.zzB(9, this.zza());
        boolean v1_1 = com.google.android.gms.internal.common.zzc.zza(v0_1);
        v0_1.recycle();
        return v1_1;
    }
}
