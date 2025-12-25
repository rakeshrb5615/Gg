package com.google.android.gms.fido.u2f.api.common;
public class ClientData$Builder implements java.lang.Cloneable {
    private String zza;
    private String zzb;
    private String zzc;
    private com.google.android.gms.fido.u2f.api.common.ChannelIdValue zzd;

    public ClientData$Builder()
    {
        this.zzd = com.google.android.gms.fido.u2f.api.common.ChannelIdValue.ABSENT;
        return;
    }

    public ClientData$Builder(String p1, String p2, String p3, com.google.android.gms.fido.u2f.api.common.ChannelIdValue p4)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        this.zzd = p4;
        return;
    }

    public static com.google.android.gms.fido.u2f.api.common.ClientData$Builder newInstance()
    {
        return new com.google.android.gms.fido.u2f.api.common.ClientData$Builder();
    }

    public com.google.android.gms.fido.u2f.api.common.ClientData build()
    {
        return new com.google.android.gms.fido.u2f.api.common.ClientData(this.zza, this.zzb, this.zzc, this.zzd);
    }

    public com.google.android.gms.fido.u2f.api.common.ClientData$Builder clone()
    {
        return new com.google.android.gms.fido.u2f.api.common.ClientData$Builder(this.zza, this.zzb, this.zzc, this.zzd);
    }

    public final bridge synthetic Object clone()
    {
        return this.clone();
    }

    public com.google.android.gms.fido.u2f.api.common.ClientData$Builder setChallenge(String p1)
    {
        this.zzb = p1;
        return this;
    }

    public com.google.android.gms.fido.u2f.api.common.ClientData$Builder setChannelId(com.google.android.gms.fido.u2f.api.common.ChannelIdValue p1)
    {
        this.zzd = p1;
        return this;
    }

    public com.google.android.gms.fido.u2f.api.common.ClientData$Builder setOrigin(String p1)
    {
        this.zzc = p1;
        return this;
    }

    public com.google.android.gms.fido.u2f.api.common.ClientData$Builder setType(String p1)
    {
        this.zza = p1;
        return this;
    }
}
