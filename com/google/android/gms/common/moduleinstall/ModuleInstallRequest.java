package com.google.android.gms.common.moduleinstall;
public final class ModuleInstallRequest {
    private final java.util.List zaa;
    private final com.google.android.gms.common.moduleinstall.InstallStatusListener zab;
    private final java.util.concurrent.Executor zac;

    public synthetic ModuleInstallRequest(java.util.List p1, com.google.android.gms.common.moduleinstall.InstallStatusListener p2, java.util.concurrent.Executor p3, boolean p4, com.google.android.gms.common.moduleinstall.zac p5)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p1, "APIs must not be null.");
        com.google.android.gms.common.internal.Preconditions.checkArgument((p1.isEmpty() ^ 1), "APIs must not be empty.");
        if (p3 != null) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(p2, "Listener must not be null when listener executor is set.");
        }
        this.zaa = p1;
        this.zab = p2;
        this.zac = p3;
        return;
    }

    public static com.google.android.gms.common.moduleinstall.ModuleInstallRequest$Builder newBuilder()
    {
        return new com.google.android.gms.common.moduleinstall.ModuleInstallRequest$Builder();
    }

    public java.util.List getApis()
    {
        return this.zaa;
    }

    public com.google.android.gms.common.moduleinstall.InstallStatusListener getListener()
    {
        return this.zab;
    }

    public java.util.concurrent.Executor getListenerExecutor()
    {
        return this.zac;
    }
}
