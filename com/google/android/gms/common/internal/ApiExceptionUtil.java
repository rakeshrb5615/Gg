package com.google.android.gms.common.internal;
public class ApiExceptionUtil {

    public ApiExceptionUtil()
    {
        return;
    }

    public static com.google.android.gms.common.api.ApiException fromStatus(com.google.android.gms.common.api.Status p1)
    {
        if (!p1.hasResolution()) {
            return new com.google.android.gms.common.api.ApiException(p1);
        } else {
            return new com.google.android.gms.common.api.ResolvableApiException(p1);
        }
    }
}
