package com.google.android.gms.common.api;
public final class UnsupportedApiCallException extends java.lang.UnsupportedOperationException {
    private final com.google.android.gms.common.Feature zza;

    public UnsupportedApiCallException(com.google.android.gms.common.Feature p1)
    {
        this.zza = p1;
        return;
    }

    public String getMessage()
    {
        return "Missing ".concat(String.valueOf(this.zza));
    }
}
