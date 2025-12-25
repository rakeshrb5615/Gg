package com.google.android.gms.fido.u2f.api.common;
public abstract class ResponseData extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {

    public ResponseData()
    {
        return;
    }

    public abstract org.json.JSONObject toJsonObject();
}
