package com.google.android.gms.internal.ads_identifier;
public final class zzd extends com.google.android.gms.internal.ads_identifier.zza implements com.google.android.gms.internal.ads_identifier.zzf {

    public zzd(android.os.IBinder p2)
    {
        super(p2, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        return;
    }

    public final String zzc()
    {
        android.os.Parcel v0_1 = this.zzb(1, this.zza());
        String v1_1 = v0_1.readString();
        v0_1.recycle();
        return v1_1;
    }

    public final boolean zzd()
    {
        android.os.Parcel v0_1 = this.zzb(6, this.zza());
        boolean v1_1 = com.google.android.gms.internal.ads_identifier.zzc.zzb(v0_1);
        v0_1.recycle();
        return v1_1;
    }

    public final boolean zze(boolean p2)
    {
        android.os.Parcel v2_0 = this.zza();
        com.google.android.gms.internal.ads_identifier.zzc.zza(v2_0, 1);
        android.os.Parcel v2_1 = this.zzb(2, v2_0);
        boolean v0_2 = com.google.android.gms.internal.ads_identifier.zzc.zzb(v2_1);
        v2_1.recycle();
        return v0_2;
    }
}
