package com.google.android.gms.fido.fido2.api.common;
public abstract class BrowserRequestOptions extends com.google.android.gms.fido.fido2.api.common.RequestOptions {

    public BrowserRequestOptions()
    {
        return;
    }

    public abstract byte[] getClientDataHash();

    public abstract android.net.Uri getOrigin();
}
