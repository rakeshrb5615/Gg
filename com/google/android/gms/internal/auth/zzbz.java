package com.google.android.gms.internal.auth;
public abstract class zzbz extends com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse {

    public zzbz()
    {
        return;
    }

    public final byte[] toByteArray()
    {
        try {
            return this.toString().getBytes("UTF-8");
        } catch (int v0_3) {
            android.util.Log.e("AUTH", "Error serializing object.", v0_3);
            return 0;
        }
    }
}
