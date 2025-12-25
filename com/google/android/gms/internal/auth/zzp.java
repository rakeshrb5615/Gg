package com.google.android.gms.internal.auth;
public final class zzp extends com.google.android.gms.internal.auth.zza implements android.os.IInterface {

    public zzp(android.os.IBinder p2)
    {
        super(p2, "com.google.android.gms.auth.account.data.IGoogleAuthService");
        return;
    }

    public final void zzd(com.google.android.gms.common.api.internal.IStatusCallback p2, com.google.android.gms.internal.auth.zzbw p3)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.auth.zzc.zze(v0, p2);
        com.google.android.gms.internal.auth.zzc.zzd(v0, p3);
        this.zzc(2, v0);
        return;
    }

    public final void zze(com.google.android.gms.internal.auth.zzm p2, com.google.android.gms.auth.AccountChangeEventsRequest p3)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.auth.zzc.zze(v0, p2);
        com.google.android.gms.internal.auth.zzc.zzd(v0, p3);
        this.zzc(4, v0);
        return;
    }

    public final void zzf(com.google.android.gms.internal.auth.zzo p2, android.accounts.Account p3, String p4, android.os.Bundle p5)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.auth.zzc.zze(v0, p2);
        com.google.android.gms.internal.auth.zzc.zzd(v0, p3);
        v0.writeString(p4);
        com.google.android.gms.internal.auth.zzc.zzd(v0, p5);
        this.zzc(1, v0);
        return;
    }

    public final void zzg(com.google.android.gms.internal.auth.zzk p2, android.accounts.Account p3)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.auth.zzc.zze(v0, p2);
        com.google.android.gms.internal.auth.zzc.zzd(v0, p3);
        this.zzc(6, v0);
        return;
    }

    public final void zzh(com.google.android.gms.internal.auth.zzk p2, String p3)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.auth.zzc.zze(v0, p2);
        v0.writeString(p3);
        this.zzc(3, v0);
        return;
    }
}
