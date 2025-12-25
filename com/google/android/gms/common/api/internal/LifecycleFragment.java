package com.google.android.gms.common.api.internal;
public interface LifecycleFragment {

    public abstract void addCallback();

    public abstract com.google.android.gms.common.api.internal.LifecycleCallback getCallbackOrNull();

    public abstract android.app.Activity getLifecycleActivity();

    public abstract boolean isCreated();

    public abstract boolean isStarted();

    public abstract void startActivityForResult();
}
