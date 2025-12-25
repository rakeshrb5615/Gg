package com.google.android.gms.tasks;
public class TaskCompletionSource {
    private final com.google.android.gms.tasks.zzw zza;

    public TaskCompletionSource()
    {
        this.zza = new com.google.android.gms.tasks.zzw();
        return;
    }

    public TaskCompletionSource(com.google.android.gms.tasks.CancellationToken p2)
    {
        this.zza = new com.google.android.gms.tasks.zzw();
        p2.onCanceledRequested(new com.google.android.gms.tasks.zzs(this));
        return;
    }

    public static bridge synthetic com.google.android.gms.tasks.zzw zza(com.google.android.gms.tasks.TaskCompletionSource p0)
    {
        return p0.zza;
    }

    public com.google.android.gms.tasks.Task getTask()
    {
        return this.zza;
    }

    public void setException(Exception p2)
    {
        this.zza.zza(p2);
        return;
    }

    public void setResult(Object p2)
    {
        this.zza.zzb(p2);
        return;
    }

    public boolean trySetException(Exception p2)
    {
        return this.zza.zzd(p2);
    }

    public boolean trySetResult(Object p2)
    {
        return this.zza.zze(p2);
    }
}
