package com.google.android.gms.internal.auth;
public final synthetic class zzr implements com.google.android.gms.common.api.internal.RemoteCall {
    public final synthetic com.google.android.gms.internal.auth.zzab zza;
    public final synthetic android.accounts.Account zzb;

    public synthetic zzr(com.google.android.gms.internal.auth.zzab p1, android.accounts.Account p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final void accept(Object p4, Object p5)
    {
        ((com.google.android.gms.internal.auth.zzp) ((com.google.android.gms.internal.auth.zzi) p4).getService()).zzg(new com.google.android.gms.internal.auth.zzaa(this.zza, ((com.google.android.gms.tasks.TaskCompletionSource) p5)), this.zzb);
        return;
    }
}
