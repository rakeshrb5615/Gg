package com.google.android.gms.tasks;
final class zzb extends com.google.android.gms.tasks.CancellationToken {
    private final com.google.android.gms.tasks.zzw zza;

    public zzb()
    {
        this.zza = new com.google.android.gms.tasks.zzw();
        return;
    }

    public final boolean isCancellationRequested()
    {
        return this.zza.isComplete();
    }

    public final com.google.android.gms.tasks.CancellationToken onCanceledRequested(com.google.android.gms.tasks.OnTokenCanceledListener p3)
    {
        this.zza.addOnSuccessListener(com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD, new com.google.android.gms.tasks.zza(this, p3));
        return this;
    }

    public final void zza()
    {
        this.zza.zze(0);
        return;
    }
}
