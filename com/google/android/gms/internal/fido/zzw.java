package com.google.android.gms.internal.fido;
public final class zzw extends com.google.android.gms.internal.fido.zza implements android.os.IInterface {

    public zzw(android.os.IBinder p2)
    {
        super(p2, "com.google.android.gms.fido.u2f.internal.regular.IU2fAppService");
        return;
    }

    public final void zzc(com.google.android.gms.internal.fido.zzv p3, com.google.android.gms.fido.u2f.api.common.RegisterRequestParams p4)
    {
        android.os.Parcel v0 = this.zza();
        v0.writeStrongBinder(p3);
        com.google.android.gms.internal.fido.zzc.zzd(v0, p4);
        this.zzb(1, v0);
        return;
    }

    public final void zzd(com.google.android.gms.internal.fido.zzv p3, com.google.android.gms.fido.u2f.api.common.SignRequestParams p4)
    {
        android.os.Parcel v0 = this.zza();
        v0.writeStrongBinder(p3);
        com.google.android.gms.internal.fido.zzc.zzd(v0, p4);
        this.zzb(2, v0);
        return;
    }
}
