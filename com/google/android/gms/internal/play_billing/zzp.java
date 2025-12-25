package com.google.android.gms.internal.play_billing;
public final class zzp {
    Object zza;
    com.google.android.gms.internal.play_billing.zzt zzb;
    private com.google.android.gms.internal.play_billing.zzv zzc;
    private boolean zzd;

    public zzp()
    {
        this.zzc = com.google.android.gms.internal.play_billing.zzv.zze();
        return;
    }

    public final void finalize()
    {
        com.google.android.gms.internal.play_billing.zzv v0_0 = this.zzb;
        if ((v0_0 != null) && (!v0_0.isDone())) {
            v0_0.zzc(new com.google.android.gms.internal.play_billing.zzq("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(this.zza))));
        }
        if (!this.zzd) {
            com.google.android.gms.internal.play_billing.zzv v0_2 = this.zzc;
            if (v0_2 != null) {
                v0_2.zzd(0);
            }
        }
        return;
    }

    public final void zza()
    {
        this.zza = 0;
        this.zzb = 0;
        this.zzc.zzd(0);
        return;
    }

    public final boolean zzb(Object p4)
    {
        int v0 = 1;
        this.zzd = 1;
        com.google.android.gms.internal.play_billing.zzt v1 = this.zzb;
        if ((v1 == null) || (!v1.zza(p4))) {
            v0 = 0;
        }
        if (v0 != 0) {
            this.zza = 0;
            this.zzb = 0;
            this.zzc = 0;
        }
        return v0;
    }
}
