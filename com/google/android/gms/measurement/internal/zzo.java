package com.google.android.gms.measurement.internal;
final synthetic class zzo implements java.lang.Runnable {
    private final synthetic com.google.android.gms.measurement.internal.AppMeasurementDynamiteService zza;
    private final synthetic com.google.android.gms.internal.measurement.zzcx zzb;

    public synthetic zzo(com.google.android.gms.measurement.internal.AppMeasurementDynamiteService p1, com.google.android.gms.internal.measurement.zzcx p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final synthetic void run()
    {
        try {
            this.zzb.zze();
            return;
        } catch (android.os.RemoteException v0_1) {
            ((com.google.android.gms.measurement.internal.zzic) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zza.zza)).zzaV().zze().zzb("Failed to call IDynamiteUploadBatchesCallback", v0_1);
            return;
        }
    }
}
