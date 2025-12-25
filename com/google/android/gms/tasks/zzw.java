package com.google.android.gms.tasks;
final class zzw extends com.google.android.gms.tasks.Task {
    private final Object zza;
    private final com.google.android.gms.tasks.zzr zzb;
    private boolean zzc;
    private volatile boolean zzd;
    private Object zze;
    private Exception zzf;

    public zzw()
    {
        this.zza = new Object();
        this.zzb = new com.google.android.gms.tasks.zzr();
        return;
    }

    private final void zzf()
    {
        com.google.android.gms.common.internal.Preconditions.checkState(this.zzc, "Task is not yet complete");
        return;
    }

    private final void zzg()
    {
        if (this.zzd) {
            throw new java.util.concurrent.CancellationException("Task is already canceled.");
        } else {
            return;
        }
    }

    private final void zzh()
    {
        if (this.zzc) {
            throw com.google.android.gms.tasks.DuplicateTaskCompletionException.of(this);
        } else {
            return;
        }
    }

    private final void zzi()
    {
        if (this.zzc) {
            this.zzb.zzb(this);
            return;
        } else {
            return;
        }
    }

    public final com.google.android.gms.tasks.Task addOnCanceledListener(android.app.Activity p3, com.google.android.gms.tasks.OnCanceledListener p4)
    {
        com.google.android.gms.tasks.zzh v0_1 = new com.google.android.gms.tasks.zzh(com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD, p4);
        this.zzb.zza(v0_1);
        com.google.android.gms.tasks.zzv.zza(p3).zzb(v0_1);
        this.zzi();
        return this;
    }

    public final com.google.android.gms.tasks.Task addOnCanceledListener(com.google.android.gms.tasks.OnCanceledListener p2)
    {
        this.addOnCanceledListener(com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD, p2);
        return this;
    }

    public final com.google.android.gms.tasks.Task addOnCanceledListener(java.util.concurrent.Executor p2, com.google.android.gms.tasks.OnCanceledListener p3)
    {
        this.zzb.zza(new com.google.android.gms.tasks.zzh(p2, p3));
        this.zzi();
        return this;
    }

    public final com.google.android.gms.tasks.Task addOnCompleteListener(android.app.Activity p3, com.google.android.gms.tasks.OnCompleteListener p4)
    {
        com.google.android.gms.tasks.zzj v0_1 = new com.google.android.gms.tasks.zzj(com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD, p4);
        this.zzb.zza(v0_1);
        com.google.android.gms.tasks.zzv.zza(p3).zzb(v0_1);
        this.zzi();
        return this;
    }

    public final com.google.android.gms.tasks.Task addOnCompleteListener(com.google.android.gms.tasks.OnCompleteListener p3)
    {
        this.zzb.zza(new com.google.android.gms.tasks.zzj(com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD, p3));
        this.zzi();
        return this;
    }

    public final com.google.android.gms.tasks.Task addOnCompleteListener(java.util.concurrent.Executor p2, com.google.android.gms.tasks.OnCompleteListener p3)
    {
        this.zzb.zza(new com.google.android.gms.tasks.zzj(p2, p3));
        this.zzi();
        return this;
    }

    public final com.google.android.gms.tasks.Task addOnFailureListener(android.app.Activity p3, com.google.android.gms.tasks.OnFailureListener p4)
    {
        com.google.android.gms.tasks.zzl v0_1 = new com.google.android.gms.tasks.zzl(com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD, p4);
        this.zzb.zza(v0_1);
        com.google.android.gms.tasks.zzv.zza(p3).zzb(v0_1);
        this.zzi();
        return this;
    }

    public final com.google.android.gms.tasks.Task addOnFailureListener(com.google.android.gms.tasks.OnFailureListener p2)
    {
        this.addOnFailureListener(com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD, p2);
        return this;
    }

    public final com.google.android.gms.tasks.Task addOnFailureListener(java.util.concurrent.Executor p2, com.google.android.gms.tasks.OnFailureListener p3)
    {
        this.zzb.zza(new com.google.android.gms.tasks.zzl(p2, p3));
        this.zzi();
        return this;
    }

    public final com.google.android.gms.tasks.Task addOnSuccessListener(android.app.Activity p3, com.google.android.gms.tasks.OnSuccessListener p4)
    {
        com.google.android.gms.tasks.zzn v0_1 = new com.google.android.gms.tasks.zzn(com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD, p4);
        this.zzb.zza(v0_1);
        com.google.android.gms.tasks.zzv.zza(p3).zzb(v0_1);
        this.zzi();
        return this;
    }

    public final com.google.android.gms.tasks.Task addOnSuccessListener(com.google.android.gms.tasks.OnSuccessListener p2)
    {
        this.addOnSuccessListener(com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD, p2);
        return this;
    }

    public final com.google.android.gms.tasks.Task addOnSuccessListener(java.util.concurrent.Executor p2, com.google.android.gms.tasks.OnSuccessListener p3)
    {
        this.zzb.zza(new com.google.android.gms.tasks.zzn(p2, p3));
        this.zzi();
        return this;
    }

    public final com.google.android.gms.tasks.Task continueWith(com.google.android.gms.tasks.Continuation p2)
    {
        return this.continueWith(com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD, p2);
    }

    public final com.google.android.gms.tasks.Task continueWith(java.util.concurrent.Executor p3, com.google.android.gms.tasks.Continuation p4)
    {
        com.google.android.gms.tasks.zzw v0_1 = new com.google.android.gms.tasks.zzw();
        this.zzb.zza(new com.google.android.gms.tasks.zzd(p3, p4, v0_1));
        this.zzi();
        return v0_1;
    }

    public final com.google.android.gms.tasks.Task continueWithTask(com.google.android.gms.tasks.Continuation p2)
    {
        return this.continueWithTask(com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD, p2);
    }

    public final com.google.android.gms.tasks.Task continueWithTask(java.util.concurrent.Executor p3, com.google.android.gms.tasks.Continuation p4)
    {
        com.google.android.gms.tasks.zzw v0_1 = new com.google.android.gms.tasks.zzw();
        this.zzb.zza(new com.google.android.gms.tasks.zzf(p3, p4, v0_1));
        this.zzi();
        return v0_1;
    }

    public final Exception getException()
    {
        try {
            return this.zzf;
        } catch (Throwable v1_1) {
            throw v1_1;
        }
    }

    public final Object getResult()
    {
        this.zzf();
        this.zzg();
        Object v1_1 = this.zzf;
        if (v1_1 != null) {
            throw new com.google.android.gms.tasks.RuntimeExecutionException(v1_1);
        } else {
            return this.zze;
        }
    }

    public final Object getResult(Class p3)
    {
        this.zzf();
        this.zzg();
        if (p3.isInstance(this.zzf)) {
            throw ((Throwable) p3.cast(this.zzf));
        } else {
            Object v3_2 = this.zzf;
            if (v3_2 != null) {
                throw new com.google.android.gms.tasks.RuntimeExecutionException(v3_2);
            } else {
                return this.zze;
            }
        }
    }

    public final boolean isCanceled()
    {
        return this.zzd;
    }

    public final boolean isComplete()
    {
        try {
            return this.zzc;
        } catch (Throwable v1_1) {
            throw v1_1;
        }
    }

    public final boolean isSuccessful()
    {
        int v2 = 0;
        if ((this.zzc) && ((!this.zzd) && (this.zzf == null))) {
            v2 = 1;
        }
        return v2;
    }

    public final com.google.android.gms.tasks.Task onSuccessTask(com.google.android.gms.tasks.SuccessContinuation p4)
    {
        com.google.android.gms.tasks.zzw v1_1 = new com.google.android.gms.tasks.zzw();
        this.zzb.zza(new com.google.android.gms.tasks.zzp(com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD, p4, v1_1));
        this.zzi();
        return v1_1;
    }

    public final com.google.android.gms.tasks.Task onSuccessTask(java.util.concurrent.Executor p3, com.google.android.gms.tasks.SuccessContinuation p4)
    {
        com.google.android.gms.tasks.zzw v0_1 = new com.google.android.gms.tasks.zzw();
        this.zzb.zza(new com.google.android.gms.tasks.zzp(p3, p4, v0_1));
        this.zzi();
        return v0_1;
    }

    public final void zza(Exception p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3, "Exception must not be null");
        this.zzh();
        this.zzc = 1;
        this.zzf = p3;
        this.zzb.zzb(this);
        return;
    }

    public final void zzb(Object p3)
    {
        this.zzh();
        this.zzc = 1;
        this.zze = p3;
        this.zzb.zzb(this);
        return;
    }

    public final boolean zzc()
    {
        if (!this.zzc) {
            this.zzc = 1;
            this.zzd = 1;
            this.zzb.zzb(this);
            return 1;
        } else {
            return 0;
        }
    }

    public final boolean zzd(Exception p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3, "Exception must not be null");
        if (!this.zzc) {
            this.zzc = 1;
            this.zzf = p3;
            this.zzb.zzb(this);
            return 1;
        } else {
            return 0;
        }
    }

    public final boolean zze(Object p3)
    {
        if (!this.zzc) {
            this.zzc = 1;
            this.zze = p3;
            this.zzb.zzb(this);
            return 1;
        } else {
            return 0;
        }
    }
}
