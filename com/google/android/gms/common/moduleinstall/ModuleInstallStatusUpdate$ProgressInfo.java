package com.google.android.gms.common.moduleinstall;
public class ModuleInstallStatusUpdate$ProgressInfo {
    private final long zaa;
    private final long zab;

    public ModuleInstallStatusUpdate$ProgressInfo(long p1, long p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotZero(p3);
        this.zaa = p1;
        this.zab = p3;
        return;
    }

    public long getBytesDownloaded()
    {
        return this.zaa;
    }

    public long getTotalBytesToDownload()
    {
        return this.zab;
    }
}
