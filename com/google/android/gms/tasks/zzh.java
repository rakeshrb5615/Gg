package com.google.android.gms.tasks;
final class zzh implements com.google.android.gms.tasks.zzq {
    private final java.util.concurrent.Executor zza;
    private final Object zzb;
    private com.google.android.gms.tasks.OnCanceledListener zzc;

    public zzh(java.util.concurrent.Executor p2, com.google.android.gms.tasks.OnCanceledListener p3)
    {
        this.zzb = new Object();
        this.zza = p2;
        this.zzc = p3;
        return;
    }

    public static bridge synthetic com.google.android.gms.tasks.OnCanceledListener zza(com.google.android.gms.tasks.zzh p0)
    {
        return p0.zzc;
    }

    public static bridge synthetic Object zzb(com.google.android.gms.tasks.zzh p0)
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

    public final void zzd(com.google.android.gms.tasks.Task p2)
    {
        if (!p2.isCanceled()) {
            return;
        } else {
            if (this.zzc != null) {
                this.zza.execute(new com.google.android.gms.tasks.zzg(this));
                return;
            } else {
                return;
            }
        }
    }
}
