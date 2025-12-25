package com.google.android.gms.auth.api.proxy;
public interface ProxyClient implements com.google.android.gms.common.api.HasApiKey {

    public abstract com.google.android.gms.tasks.Task getSpatulaHeader();

    public abstract com.google.android.gms.tasks.Task performProxyRequest();
}
