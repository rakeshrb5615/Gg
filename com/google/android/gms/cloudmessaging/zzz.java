package com.google.android.gms.cloudmessaging;
public final synthetic class zzz implements com.google.android.gms.tasks.Continuation {
    public final synthetic com.google.android.gms.cloudmessaging.Rpc zza;
    public final synthetic android.os.Bundle zzb;

    public synthetic zzz(com.google.android.gms.cloudmessaging.Rpc p1, android.os.Bundle p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final Object then(com.google.android.gms.tasks.Task p3)
    {
        return this.zza.zzb(this.zzb, p3);
    }
}
