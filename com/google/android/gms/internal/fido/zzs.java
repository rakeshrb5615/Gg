package com.google.android.gms.internal.fido;
public final class zzs extends com.google.android.gms.internal.fido.zza implements android.os.IInterface {

    public zzs(android.os.IBinder p2)
    {
        super(p2, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
        return;
    }

    public final void zzc(com.google.android.gms.internal.fido.zzr p3, com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions p4)
    {
        android.os.Parcel v0 = this.zza();
        v0.writeStrongBinder(p3);
        com.google.android.gms.internal.fido.zzc.zzd(v0, p4);
        this.zzb(1, v0);
        return;
    }

    public final void zzd(com.google.android.gms.internal.fido.zzr p3, com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions p4)
    {
        android.os.Parcel v0 = this.zza();
        v0.writeStrongBinder(p3);
        com.google.android.gms.internal.fido.zzc.zzd(v0, p4);
        this.zzb(2, v0);
        return;
    }

    public final void zze(com.google.android.gms.internal.fido.zze p3)
    {
        android.os.Parcel v0 = this.zza();
        v0.writeStrongBinder(p3);
        this.zzb(3, v0);
        return;
    }
}
