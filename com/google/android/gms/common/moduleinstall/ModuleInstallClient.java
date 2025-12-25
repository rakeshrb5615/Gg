package com.google.android.gms.common.moduleinstall;
public interface ModuleInstallClient implements com.google.android.gms.common.api.HasApiKey {

    public abstract varargs com.google.android.gms.tasks.Task areModulesAvailable();

    public abstract varargs com.google.android.gms.tasks.Task deferredInstall();

    public abstract varargs com.google.android.gms.tasks.Task getInstallModulesIntent();

    public abstract com.google.android.gms.tasks.Task installModules();

    public abstract varargs com.google.android.gms.tasks.Task releaseModules();

    public abstract com.google.android.gms.tasks.Task unregisterListener();
}
