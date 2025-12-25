package com.google.android.gms.common.api;
final class zaf extends com.google.android.gms.common.api.internal.BasePendingResult {
    private final com.google.android.gms.common.api.Result zae;

    public zaf(com.google.android.gms.common.api.Result p2)
    {
        super(android.os.Looper.getMainLooper());
        super.zae = p2;
        return;
    }

    public final com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status p2)
    {
        if (p2.getStatusCode() != this.zae.getStatus().getStatusCode()) {
            throw new UnsupportedOperationException("Creating failed results is not supported");
        } else {
            return this.zae;
        }
    }
}
