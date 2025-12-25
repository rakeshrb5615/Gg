package com.google.android.gms.common.internal;
public final class zzt extends com.google.android.gms.internal.common.zza implements com.google.android.gms.common.internal.IAccountAccessor {

    public zzt(android.os.IBinder p2)
    {
        super(p2, "com.google.android.gms.common.internal.IAccountAccessor");
        return;
    }

    public final android.accounts.Account zzb()
    {
        android.os.Parcel v0_1 = this.zzB(2, this.zza());
        android.accounts.Account v1_3 = ((android.accounts.Account) com.google.android.gms.internal.common.zzc.zzb(v0_1, android.accounts.Account.CREATOR));
        v0_1.recycle();
        return v1_3;
    }
}
