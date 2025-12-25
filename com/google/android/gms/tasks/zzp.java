package com.google.android.gms.tasks;
final class zzp implements com.google.android.gms.tasks.OnSuccessListener, com.google.android.gms.tasks.OnFailureListener, com.google.android.gms.tasks.OnCanceledListener, com.google.android.gms.tasks.zzq {
    private final java.util.concurrent.Executor zza;
    private final com.google.android.gms.tasks.SuccessContinuation zzb;
    private final com.google.android.gms.tasks.zzw zzc;

    public zzp(java.util.concurrent.Executor p1, com.google.android.gms.tasks.SuccessContinuation p2, com.google.android.gms.tasks.zzw p3)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        return;
    }

    public static bridge synthetic com.google.android.gms.tasks.SuccessContinuation zza(com.google.android.gms.tasks.zzp p0)
    {
        return p0.zzb;
    }

    public final void onCanceled()
    {
        this.zzc.zzc();
        return;
    }

    public final void onFailure(Exception p2)
    {
        this.zzc.zza(p2);
        return;
    }

    public final void onSuccess(Object p2)
    {
        this.zzc.zzb(p2);
        return;
    }

    public final void zzc()
    {
        throw new UnsupportedOperationException();
    }

    public final void zzd(com.google.android.gms.tasks.Task p2)
    {
        this.zza.execute(new com.google.android.gms.tasks.zzo(this, p2));
        return;
    }
}
