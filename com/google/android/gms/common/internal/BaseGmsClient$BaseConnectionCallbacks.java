package com.google.android.gms.common.internal;
public interface BaseGmsClient$BaseConnectionCallbacks {
    public static final int CAUSE_DEAD_OBJECT_EXCEPTION = 3;
    public static final int CAUSE_SERVICE_DISCONNECTED = 1;

    public abstract void onConnected();

    public abstract void onConnectionSuspended();
}
