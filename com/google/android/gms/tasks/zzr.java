package com.google.android.gms.tasks;
final class zzr {
    private final Object zza;
    private java.util.Queue zzb;
    private boolean zzc;

    public zzr()
    {
        this.zza = new Object();
        return;
    }

    public final void zza(com.google.android.gms.tasks.zzq p3)
    {
        if (this.zzb == null) {
            this.zzb = new java.util.ArrayDeque();
        }
        this.zzb.add(p3);
        return;
    }

    public final void zzb(com.google.android.gms.tasks.Task p3)
    {
        try {
            if (this.zzb != null) {
                if (!this.zzc) {
                    this.zzc = 1;
                    while(true) {
                        com.google.android.gms.tasks.zzq v0_1 = ((com.google.android.gms.tasks.zzq) this.zzb.poll());
                        if (v0_1 == null) {
                            break;
                        }
                        v0_1.zzd(p3);
                    }
                    this.zzc = 0;
                    return;
                } else {
                }
            }
        } catch (int v3_3) {
            throw v3_3;
        }
        return;
    }
}
