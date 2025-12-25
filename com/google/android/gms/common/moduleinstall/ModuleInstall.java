package com.google.android.gms.common.moduleinstall;
public final class ModuleInstall {

    private ModuleInstall()
    {
        return;
    }

    public static com.google.android.gms.common.moduleinstall.ModuleInstallClient getClient(android.app.Activity p1)
    {
        return new com.google.android.gms.common.moduleinstall.internal.zay(p1);
    }

    public static com.google.android.gms.common.moduleinstall.ModuleInstallClient getClient(android.content.Context p1)
    {
        return new com.google.android.gms.common.moduleinstall.internal.zay(p1);
    }
}
