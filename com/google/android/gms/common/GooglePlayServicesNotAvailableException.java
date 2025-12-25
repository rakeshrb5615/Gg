package com.google.android.gms.common;
public final class GooglePlayServicesNotAvailableException extends java.lang.Exception {
    public final int errorCode;

    public GooglePlayServicesNotAvailableException(int p1)
    {
        this.errorCode = p1;
        return;
    }
}
