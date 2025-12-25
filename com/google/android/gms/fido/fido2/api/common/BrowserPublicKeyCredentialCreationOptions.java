package com.google.android.gms.fido.fido2.api.common;
public class BrowserPublicKeyCredentialCreationOptions extends com.google.android.gms.fido.fido2.api.common.BrowserRequestOptions {
    public static final android.os.Parcelable$Creator CREATOR;
    private final com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions zza;
    private final android.net.Uri zzb;
    private final byte[] zzc;

    static BrowserPublicKeyCredentialCreationOptions()
    {
        com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions.CREATOR = new com.google.android.gms.fido.fido2.api.common.zzn();
        return;
    }

    public BrowserPublicKeyCredentialCreationOptions(com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions p1, android.net.Uri p2, byte[] p3)
    {
        this.zza = ((com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions) com.google.android.gms.common.internal.Preconditions.checkNotNull(p1));
        com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions.zzc(p2);
        this.zzb = p2;
        com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions.zzd(p3);
        this.zzc = p3;
        return;
    }

    public static com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions deserializeFromBytes(byte[] p1)
    {
        return ((com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions) com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromBytes(p1, com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions.CREATOR));
    }

    public static bridge synthetic android.net.Uri zza(android.net.Uri p0)
    {
        com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions.zzc(p0);
        return p0;
    }

    public static bridge synthetic byte[] zzb(byte[] p0)
    {
        com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions.zzd(p0);
        return p0;
    }

    private static android.net.Uri zzc(android.net.Uri p4)
    {
        String v0_3;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
        int v1 = 0;
        if (p4.getScheme() == null) {
            v0_3 = 0;
        } else {
            v0_3 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(v0_3, "origin scheme must be non-empty");
        if (p4.getAuthority() != null) {
            v1 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(v1, "origin authority must be non-empty");
        return p4;
    }

    private static byte[] zzd(byte[] p3)
    {
        int v0 = 1;
        if ((p3 != null) && (p3.length != 32)) {
            v0 = 0;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(v0, "clientDataHash must be 32 bytes long");
        return p3;
    }

    public boolean equals(Object p4)
    {
        if ((p4 instanceof com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions)) {
            if ((!com.google.android.gms.common.internal.Objects.equal(this.zza, ((com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions) p4).zza)) || (!com.google.android.gms.common.internal.Objects.equal(this.zzb, ((com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions) p4).zzb))) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions getAuthenticationExtensions()
    {
        return this.zza.getAuthenticationExtensions();
    }

    public byte[] getChallenge()
    {
        return this.zza.getChallenge();
    }

    public byte[] getClientDataHash()
    {
        return this.zzc;
    }

    public android.net.Uri getOrigin()
    {
        return this.zzb;
    }

    public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions getPublicKeyCredentialCreationOptions()
    {
        return this.zza;
    }

    public Integer getRequestId()
    {
        return this.zza.getRequestId();
    }

    public Double getTimeoutSeconds()
    {
        return this.zza.getTimeoutSeconds();
    }

    public com.google.android.gms.fido.fido2.api.common.TokenBinding getTokenBinding()
    {
        return this.zza.getTokenBinding();
    }

    public int hashCode()
    {
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {this.zza, this.zzb}));
    }

    public byte[] serializeToBytes()
    {
        return com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.serializeToBytes(this);
    }

    public void writeToParcel(android.os.Parcel p5, int p6)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p5);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 2, this.getPublicKeyCredentialCreationOptions(), p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 3, this.getOrigin(), p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(p5, 4, this.getClientDataHash(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p5, v0);
        return;
    }
}
