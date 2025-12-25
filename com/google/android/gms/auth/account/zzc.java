package com.google.android.gms.auth.account;
public final class zzc extends com.google.android.gms.internal.auth.zza implements com.google.android.gms.auth.account.zze {

    public zzc(android.os.IBinder p2)
    {
        super(p2, "com.google.android.gms.auth.account.IWorkAccountService");
        return;
    }

    public final void zzd(com.google.android.gms.auth.account.zzb p2, String p3)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.auth.zzc.zze(v0, p2);
        v0.writeString(p3);
        this.zzc(2, v0);
        return;
    }

    public final void zze(com.google.android.gms.auth.account.zzb p2, android.accounts.Account p3)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.auth.zzc.zze(v0, p2);
        com.google.android.gms.internal.auth.zzc.zzd(v0, p3);
        this.zzc(3, v0);
        return;
    }

    public final void zzf(boolean p2)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.auth.zzc.zzc(v0, p2);
        this.zzc(1, v0);
        return;
    }
}
