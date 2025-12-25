package com.google.android.gms.tasks;
final class zzd implements com.google.android.gms.tasks.zzq {
    private final java.util.concurrent.Executor zza;
    private final com.google.android.gms.tasks.Continuation zzb;
    private final com.google.android.gms.tasks.zzw zzc;

    public zzd(java.util.concurrent.Executor p1, com.google.android.gms.tasks.Continuation p2, com.google.android.gms.tasks.zzw p3)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        return;
    }

    public static bridge synthetic com.google.android.gms.tasks.Continuation zza(com.google.android.gms.tasks.zzd p0)
    {
        return p0.zzb;
    }

    public static bridge synthetic com.google.android.gms.tasks.zzw zzb(com.google.android.gms.tasks.zzd p0)
    {
        return p0.zzc;
    }

    public final void zzc()
    {
        throw new UnsupportedOperationException();
    }

    public final void zzd(com.google.android.gms.tasks.Task p2)
    {
        this.zza.execute(new com.google.android.gms.tasks.zzc(this, p2));
        return;
    }
}
