package com.google.android.gms.common.moduleinstall;
public class ModuleInstallRequest$Builder {
    private final java.util.List zaa;
    private com.google.android.gms.common.moduleinstall.InstallStatusListener zab;
    private java.util.concurrent.Executor zac;

    public ModuleInstallRequest$Builder()
    {
        this.zaa = new java.util.ArrayList();
        return;
    }

    public com.google.android.gms.common.moduleinstall.ModuleInstallRequest$Builder addApi(com.google.android.gms.common.api.OptionalModuleApi p2)
    {
        this.zaa.add(p2);
        return this;
    }

    public com.google.android.gms.common.moduleinstall.ModuleInstallRequest build()
    {
        return new com.google.android.gms.common.moduleinstall.ModuleInstallRequest(this.zaa, this.zab, this.zac, 1, 0);
    }

    public com.google.android.gms.common.moduleinstall.ModuleInstallRequest$Builder setListener(com.google.android.gms.common.moduleinstall.InstallStatusListener p2)
    {
        return this.setListener(p2, 0);
    }

    public com.google.android.gms.common.moduleinstall.ModuleInstallRequest$Builder setListener(com.google.android.gms.common.moduleinstall.InstallStatusListener p1, java.util.concurrent.Executor p2)
    {
        this.zab = p1;
        this.zac = p2;
        return this;
    }
}
