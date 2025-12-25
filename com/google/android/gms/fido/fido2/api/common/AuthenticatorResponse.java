package com.google.android.gms.fido.fido2.api.common;
public abstract class AuthenticatorResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {

    public AuthenticatorResponse()
    {
        return;
    }

    public abstract byte[] getClientDataJSON();

    public abstract byte[] serializeToBytes();
}
