package com.google.android.gms.tasks;
final class zzaf implements com.google.android.gms.tasks.zzae {
    private final Object zza;
    private final int zzb;
    private final com.google.android.gms.tasks.zzw zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private Exception zzg;
    private boolean zzh;

    public zzaf(int p2, com.google.android.gms.tasks.zzw p3)
    {
        this.zza = new Object();
        this.zzb = p2;
        this.zzc = p3;
        return;
    }

    private final void zza()
    {
        if (((this.zzd + this.zze) + this.zzf) == this.zzb) {
            if (this.zzg == null) {
                if (!this.zzh) {
                    this.zzc.zzb(0);
                } else {
                    this.zzc.zzc();
                    return;
                }
            } else {
                com.google.android.gms.tasks.zzw v0_3 = this.zzc;
                String v2_0 = this.zze;
                Exception v3_0 = this.zzb;
                StringBuilder v4_1 = new StringBuilder();
                v4_1.append(v2_0);
                v4_1.append(" out of ");
                v4_1.append(v3_0);
                v4_1.append(" underlying tasks failed");
                v0_3.zza(new java.util.concurrent.ExecutionException(v4_1.toString(), this.zzg));
                return;
            }
        }
        return;
    }

    public final void onCanceled()
    {
        try {
            this.zzf = (this.zzf + 1);
            this.zzh = 1;
            this.zza();
            return;
        } catch (Throwable v1_2) {
            throw v1_2;
        }
    }

    public final void onFailure(Exception p3)
    {
        try {
            this.zze = (this.zze + 1);
            this.zzg = p3;
            this.zza();
            return;
        } catch (Throwable v3_1) {
            throw v3_1;
        }
    }

    public final void onSuccess(Object p2)
    {
        try {
            this.zzd = (this.zzd + 1);
            this.zza();
            return;
        } catch (Throwable v0_2) {
            throw v0_2;
        }
    }
}
