package com.google.android.gms.internal.auth;
public final synthetic class zzs implements com.google.android.gms.common.api.internal.RemoteCall {
    public final synthetic com.google.android.gms.internal.auth.zzab zza;
    public final synthetic android.accounts.Account zzb;
    public final synthetic String zzc;
    public final synthetic android.os.Bundle zzd;

    public synthetic zzs(com.google.android.gms.internal.auth.zzab p1, android.accounts.Account p2, String p3, android.os.Bundle p4)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        this.zzd = p4;
        return;
    }

    public final void accept(Object p6, Object p7)
    {
        ((com.google.android.gms.internal.auth.zzp) ((com.google.android.gms.internal.auth.zzi) p6).getService()).zzf(new com.google.android.gms.internal.auth.zzw(this.zza, ((com.google.android.gms.tasks.TaskCompletionSource) p7)), this.zzb, this.zzc, this.zzd);
        return;
    }
}
