package com.google.android.gms.tasks;
final class zzn implements com.google.android.gms.tasks.zzq {
    private final java.util.concurrent.Executor zza;
    private final Object zzb;
    private com.google.android.gms.tasks.OnSuccessListener zzc;

    public zzn(java.util.concurrent.Executor p2, com.google.android.gms.tasks.OnSuccessListener p3)
    {
        this.zzb = new Object();
        this.zza = p2;
        this.zzc = p3;
        return;
    }

    public static bridge synthetic com.google.android.gms.tasks.OnSuccessListener zza(com.google.android.gms.tasks.zzn p0)
    {
        return p0.zzc;
    }

    public static bridge synthetic Object zzb(com.google.android.gms.tasks.zzn p0)
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
        if (!p3.isSuccessful()) {
            return;
        } else {
            if (this.zzc != null) {
                this.zza.execute(new com.google.android.gms.tasks.zzm(this, p3));
                return;
            } else {
                return;
            }
        }
    }
}
