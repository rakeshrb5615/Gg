package com.google.android.gms.fido.fido2.api.common;
public abstract class RequestOptions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {

    public RequestOptions()
    {
        return;
    }

    public abstract com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions getAuthenticationExtensions();

    public abstract byte[] getChallenge();

    public abstract Integer getRequestId();

    public abstract Double getTimeoutSeconds();

    public abstract com.google.android.gms.fido.fido2.api.common.TokenBinding getTokenBinding();

    public byte[] serializeToBytes()
    {
        return com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.serializeToBytes(this);
    }
}
