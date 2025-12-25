package com.google.android.gms.common.api.internal;
public abstract class ActivityLifecycleObserver {

    public ActivityLifecycleObserver()
    {
        return;
    }

    public static final com.google.android.gms.common.api.internal.ActivityLifecycleObserver of(android.app.Activity p1)
    {
        return new com.google.android.gms.common.api.internal.zab(com.google.android.gms.common.api.internal.zaa.zaa(p1));
    }

    public abstract com.google.android.gms.common.api.internal.ActivityLifecycleObserver onStopCallOnce();
}
