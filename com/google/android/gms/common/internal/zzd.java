package com.google.android.gms.common.internal;
public final class zzd extends com.google.android.gms.common.internal.zzz {
    private com.google.android.gms.common.internal.BaseGmsClient zza;
    private final int zzb;

    public zzd(com.google.android.gms.common.internal.BaseGmsClient p1, int p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final void onPostInitComplete(int p3, android.os.IBinder p4, android.os.Bundle p5)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zza, "onPostInitComplete can be called only once per call to getRemoteService");
        this.zza.onPostInitHandler(p3, p4, p5, this.zzb);
        this.zza = 0;
        return;
    }

    public final void zzb(int p2, android.os.Bundle p3)
    {
        android.util.Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        return;
    }

    public final void zzc(int p3, android.os.IBinder p4, com.google.android.gms.common.internal.zzj p5)
    {
        com.google.android.gms.common.internal.BaseGmsClient v0 = this.zza;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(v0, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p5);
        v0.zzc(p5);
        this.onPostInitComplete(p3, p4, p5.zza);
        return;
    }
}
