package com.google.android.gms.common.api;
public class ResolvableApiException extends com.google.android.gms.common.api.ApiException {

    public ResolvableApiException(com.google.android.gms.common.api.Status p1)
    {
        super(p1);
        return;
    }

    public android.app.PendingIntent getResolution()
    {
        return this.getStatus().getResolution();
    }

    public void startResolutionForResult(android.app.Activity p2, int p3)
    {
        this.getStatus().startResolutionForResult(p2, p3);
        return;
    }
}
