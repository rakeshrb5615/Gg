package com.google.android.gms.measurement.internal;
final synthetic class zzgp implements com.google.android.gms.tasks.OnFailureListener {
    private final synthetic com.google.android.gms.measurement.internal.zzgq zza;
    private final synthetic long zzb;

    public synthetic zzgp(com.google.android.gms.measurement.internal.zzgq p1, long p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final synthetic void onFailure(Exception p4)
    {
        this.zza.zzc(this.zzb, p4);
        return;
    }
}
