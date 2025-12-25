package com.google.android.gms.common.api.internal;
public class ApiExceptionMapper implements com.google.android.gms.common.api.internal.StatusExceptionMapper {

    public ApiExceptionMapper()
    {
        return;
    }

    public final Exception getException(com.google.android.gms.common.api.Status p1)
    {
        return com.google.android.gms.common.internal.ApiExceptionUtil.fromStatus(p1);
    }
}
