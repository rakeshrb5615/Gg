package com.google.android.gms.fido.u2f;
public final synthetic class zzb implements com.google.android.gms.common.api.internal.RemoteCall {
    public final synthetic com.google.android.gms.fido.u2f.U2fApiClient zza;
    public final synthetic com.google.android.gms.fido.u2f.api.common.RegisterRequestParams zzb;

    public synthetic zzb(com.google.android.gms.fido.u2f.U2fApiClient p1, com.google.android.gms.fido.u2f.api.common.RegisterRequestParams p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final void accept(Object p4, Object p5)
    {
        ((com.google.android.gms.internal.fido.zzw) ((com.google.android.gms.internal.fido.zzy) p4).getService()).zzc(new com.google.android.gms.fido.u2f.zzc(this.zza, ((com.google.android.gms.tasks.TaskCompletionSource) p5)), this.zzb);
        return;
    }
}
