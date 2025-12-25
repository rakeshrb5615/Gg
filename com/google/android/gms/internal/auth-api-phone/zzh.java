package com.google.android.gms.internal.auth-api-phone;
public final class zzh extends com.google.android.gms.internal.auth-api-phone.zza implements android.os.IInterface {

    public zzh(android.os.IBinder p2)
    {
        super(p2, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        return;
    }

    public final void zzc(com.google.android.gms.internal.auth-api-phone.zze p2)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.auth-api-phone.zzc.zzc(v0, p2);
        this.zzb(4, v0);
        return;
    }

    public final void zzd(String p2, com.google.android.gms.internal.auth-api-phone.zzg p3)
    {
        android.os.Parcel v0 = this.zza();
        v0.writeString(p2);
        com.google.android.gms.internal.auth-api-phone.zzc.zzc(v0, p3);
        this.zzb(5, v0);
        return;
    }

    public final void zze(com.google.android.gms.common.api.internal.IStatusCallback p2)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.auth-api-phone.zzc.zzc(v0, p2);
        this.zzb(3, v0);
        return;
    }

    public final void zzf(com.google.android.gms.common.api.internal.IStatusCallback p2)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.auth-api-phone.zzc.zzc(v0, p2);
        this.zzb(6, v0);
        return;
    }

    public final void zzg(com.google.android.gms.internal.auth-api-phone.zzj p2)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.auth-api-phone.zzc.zzc(v0, p2);
        this.zzb(1, v0);
        return;
    }

    public final void zzh(String p2, com.google.android.gms.internal.auth-api-phone.zzj p3)
    {
        android.os.Parcel v0 = this.zza();
        v0.writeString(p2);
        com.google.android.gms.internal.auth-api-phone.zzc.zzc(v0, p3);
        this.zzb(2, v0);
        return;
    }
}
