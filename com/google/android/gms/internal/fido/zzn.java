package com.google.android.gms.internal.fido;
public final class zzn extends com.google.android.gms.internal.fido.zza implements android.os.IInterface {

    public zzn(android.os.IBinder p2)
    {
        super(p2, "com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedService");
        return;
    }

    public final void zzc(com.google.android.gms.internal.fido.zzg p3, String p4)
    {
        android.os.Parcel v0 = this.zza();
        v0.writeStrongBinder(p3);
        v0.writeString(p4);
        this.zzb(4, v0);
        return;
    }

    public final void zzd(com.google.android.gms.internal.fido.zzm p3, com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions p4)
    {
        android.os.Parcel v0 = this.zza();
        v0.writeStrongBinder(p3);
        com.google.android.gms.internal.fido.zzc.zzd(v0, p4);
        this.zzb(1, v0);
        return;
    }

    public final void zze(com.google.android.gms.internal.fido.zzm p3, com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions p4)
    {
        android.os.Parcel v0 = this.zza();
        v0.writeStrongBinder(p3);
        com.google.android.gms.internal.fido.zzc.zzd(v0, p4);
        this.zzb(2, v0);
        return;
    }

    public final void zzf(com.google.android.gms.internal.fido.zze p3)
    {
        android.os.Parcel v0 = this.zza();
        v0.writeStrongBinder(p3);
        this.zzb(3, v0);
        return;
    }
}
