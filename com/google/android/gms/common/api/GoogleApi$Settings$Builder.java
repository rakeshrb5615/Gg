package com.google.android.gms.common.api;
public class GoogleApi$Settings$Builder {
    private com.google.android.gms.common.api.internal.StatusExceptionMapper zaa;
    private android.os.Looper zab;

    public GoogleApi$Settings$Builder()
    {
        return;
    }

    public com.google.android.gms.common.api.GoogleApi$Settings build()
    {
        if (this.zaa == null) {
            this.zaa = new com.google.android.gms.common.api.internal.ApiExceptionMapper();
        }
        if (this.zab == null) {
            this.zab = android.os.Looper.getMainLooper();
        }
        return new com.google.android.gms.common.api.GoogleApi$Settings(this.zaa, 0, this.zab, 0);
    }

    public com.google.android.gms.common.api.GoogleApi$Settings$Builder setLooper(android.os.Looper p2)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2, "Looper must not be null.");
        this.zab = p2;
        return this;
    }

    public com.google.android.gms.common.api.GoogleApi$Settings$Builder setMapper(com.google.android.gms.common.api.internal.StatusExceptionMapper p2)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2, "StatusExceptionMapper must not be null.");
        this.zaa = p2;
        return this;
    }
}
