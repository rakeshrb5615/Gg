package com.google.android.gms.tasks;
final class zzj implements com.google.android.gms.tasks.zzq {
    private final java.util.concurrent.Executor zza;
    private final Object zzb;
    private com.google.android.gms.tasks.OnCompleteListener zzc;

    public zzj(java.util.concurrent.Executor p2, com.google.android.gms.tasks.OnCompleteListener p3)
    {
        this.zzb = new Object();
        this.zza = p2;
        this.zzc = p3;
        return;
    }

    public static bridge synthetic com.google.android.gms.tasks.OnCompleteListener zza(com.google.android.gms.tasks.zzj p0)
    {
        return p0.zzc;
    }

    public static bridge synthetic Object zzb(com.google.android.gms.tasks.zzj p0)
    {
        return p0.zzb;
    }

    public final void zzc()
    {
        try {
            this.zzc = 0;
            return;
        } catch (Throwable v1_1) {
            throw v1_1;
        }
    }

    public final void zzd(com.google.android.gms.tasks.Task p3)
    {
        if (this.zzc != null) {
            this.zza.execute(new com.google.android.gms.tasks.zzi(this, p3));
            return;
        } else {
            return;
        }
    }
}
