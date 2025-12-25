package com.google.android.gms.internal.auth;
public final class zzbh extends com.google.android.gms.internal.auth.zza implements android.os.IInterface {

    public zzbh(android.os.IBinder p2)
    {
        super(p2, "com.google.android.gms.auth.api.internal.IAuthService");
        return;
    }

    public final void zzd(com.google.android.gms.internal.auth.zzbg p2)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.auth.zzc.zze(v0, p2);
        this.zzc(3, v0);
        return;
    }

    public final void zze(com.google.android.gms.internal.auth.zzbg p2, com.google.android.gms.auth.api.proxy.ProxyRequest p3)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.auth.zzc.zze(v0, p2);
        com.google.android.gms.internal.auth.zzc.zzd(v0, p3);
        this.zzc(1, v0);
        return;
    }
}
