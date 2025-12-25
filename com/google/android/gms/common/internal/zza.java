package com.google.android.gms.common.internal;
abstract class zza extends com.google.android.gms.common.internal.zzc {
    public final int zza;
    public final android.os.Bundle zzb;
    final synthetic com.google.android.gms.common.internal.BaseGmsClient zzc;

    public zza(com.google.android.gms.common.internal.BaseGmsClient p2, int p3, android.os.Bundle p4)
    {
        java.util.Objects.requireNonNull(p2);
        this.zzc = p2;
        super(p2, Boolean.TRUE);
        super.zza = p3;
        super.zzb = p4;
        return;
    }

    public abstract boolean zza();

    public abstract void zzb();

    public final bridge synthetic void zzc(Object p4)
    {
        com.google.android.gms.common.ConnectionResult v4_1 = this.zza;
        android.app.PendingIntent v1_1 = 0;
        if (v4_1 != null) {
            this.zzc.zzd(1, 0);
            com.google.android.gms.common.ConnectionResult v0_5 = this.zzb;
            if (v0_5 != null) {
                v1_1 = ((android.app.PendingIntent) v0_5.getParcelable("pendingIntent"));
            }
            this.zzb(new com.google.android.gms.common.ConnectionResult(v4_1, v1_1));
            return;
        } else {
            if (!this.zza()) {
                this.zzc.zzd(1, 0);
                this.zzb(new com.google.android.gms.common.ConnectionResult(8, 0));
            }
            return;
        }
    }
}
