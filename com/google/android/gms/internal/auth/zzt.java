package com.google.android.gms.internal.auth;
public final synthetic class zzt implements com.google.android.gms.common.api.internal.RemoteCall {
    public final synthetic com.google.android.gms.internal.auth.zzab zza;
    public final synthetic com.google.android.gms.internal.auth.zzbw zzb;

    public synthetic zzt(com.google.android.gms.internal.auth.zzab p1, com.google.android.gms.internal.auth.zzbw p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final void accept(Object p4, Object p5)
    {
        ((com.google.android.gms.internal.auth.zzp) ((com.google.android.gms.internal.auth.zzi) p4).getService()).zzd(new com.google.android.gms.internal.auth.zzx(this.zza, ((com.google.android.gms.tasks.TaskCompletionSource) p5)), this.zzb);
        return;
    }
}
