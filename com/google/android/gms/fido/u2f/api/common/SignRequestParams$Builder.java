package com.google.android.gms.fido.u2f.api.common;
public final class SignRequestParams$Builder {
    Integer zza;
    Double zzb;
    android.net.Uri zzc;
    byte[] zzd;
    java.util.List zze;
    com.google.android.gms.fido.u2f.api.common.ChannelIdValue zzf;
    String zzg;

    public SignRequestParams$Builder()
    {
        return;
    }

    public com.google.android.gms.fido.u2f.api.common.SignRequestParams build()
    {
        return new com.google.android.gms.fido.u2f.api.common.SignRequestParams(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg);
    }

    public com.google.android.gms.fido.u2f.api.common.SignRequestParams$Builder setAppId(android.net.Uri p1)
    {
        this.zzc = p1;
        return this;
    }

    public com.google.android.gms.fido.u2f.api.common.SignRequestParams$Builder setChannelIdValue(com.google.android.gms.fido.u2f.api.common.ChannelIdValue p1)
    {
        this.zzf = p1;
        return this;
    }

    public com.google.android.gms.fido.u2f.api.common.SignRequestParams$Builder setDefaultSignChallenge(byte[] p1)
    {
        this.zzd = p1;
        return this;
    }

    public com.google.android.gms.fido.u2f.api.common.SignRequestParams$Builder setDisplayHint(String p1)
    {
        this.zzg = p1;
        return this;
    }

    public com.google.android.gms.fido.u2f.api.common.SignRequestParams$Builder setRegisteredKeys(java.util.List p1)
    {
        this.zze = p1;
        return this;
    }

    public com.google.android.gms.fido.u2f.api.common.SignRequestParams$Builder setRequestId(Integer p1)
    {
        this.zza = p1;
        return this;
    }

    public com.google.android.gms.fido.u2f.api.common.SignRequestParams$Builder setTimeoutSeconds(Double p1)
    {
        this.zzb = p1;
        return this;
    }
}
