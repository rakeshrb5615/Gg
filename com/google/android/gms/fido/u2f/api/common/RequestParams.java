package com.google.android.gms.fido.u2f.api.common;
public abstract class RequestParams extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {

    public RequestParams()
    {
        return;
    }

    public abstract java.util.Set getAllAppIds();

    public abstract android.net.Uri getAppId();

    public abstract com.google.android.gms.fido.u2f.api.common.ChannelIdValue getChannelIdValue();

    public abstract String getDisplayHint();

    public abstract java.util.List getRegisteredKeys();

    public abstract Integer getRequestId();

    public abstract Double getTimeoutSeconds();
}
