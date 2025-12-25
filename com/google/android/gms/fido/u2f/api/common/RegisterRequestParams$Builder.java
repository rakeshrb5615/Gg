package com.google.android.gms.fido.u2f.api.common;
public final class RegisterRequestParams$Builder {
    Integer zza;
    Double zzb;
    android.net.Uri zzc;
    java.util.List zzd;
    java.util.List zze;
    com.google.android.gms.fido.u2f.api.common.ChannelIdValue zzf;
    String zzg;

    public RegisterRequestParams$Builder()
    {
        return;
    }

    public com.google.android.gms.fido.u2f.api.common.RegisterRequestParams build()
    {
        return new com.google.android.gms.fido.u2f.api.common.RegisterRequestParams(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg);
    }

    public com.google.android.gms.fido.u2f.api.common.RegisterRequestParams$Builder setAppId(android.net.Uri p1)
    {
        this.zzc = p1;
        return this;
    }

    public com.google.android.gms.fido.u2f.api.common.RegisterRequestParams$Builder setChannelIdValue(com.google.android.gms.fido.u2f.api.common.ChannelIdValue p1)
    {
        this.zzf = p1;
        return this;
    }

    public com.google.android.gms.fido.u2f.api.common.RegisterRequestParams$Builder setDisplayHint(String p1)
    {
        this.zzg = p1;
        return this;
    }

    public com.google.android.gms.fido.u2f.api.common.RegisterRequestParams$Builder setRegisterRequests(java.util.List p1)
    {
        this.zzd = p1;
        return this;
    }

    public com.google.android.gms.fido.u2f.api.common.RegisterRequestParams$Builder setRegisteredKeys(java.util.List p1)
    {
        this.zze = p1;
        return this;
    }

    public com.google.android.gms.fido.u2f.api.common.RegisterRequestParams$Builder setRequestId(Integer p1)
    {
        this.zza = p1;
        return this;
    }

    public com.google.android.gms.fido.u2f.api.common.RegisterRequestParams$Builder setTimeoutSeconds(Double p1)
    {
        this.zzb = p1;
        return this;
    }
}
