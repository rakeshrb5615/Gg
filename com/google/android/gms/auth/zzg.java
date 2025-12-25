package com.google.android.gms.auth;
public final synthetic class zzg implements com.google.android.gms.auth.zzk {
    public final synthetic android.accounts.Account zza;

    public synthetic zzg(android.accounts.Account p1)
    {
        this.zza = p1;
        return;
    }

    public final Object zza(android.os.IBinder p2)
    {
        java.io.IOException v2_2 = com.google.android.gms.internal.auth.zze.zzb(p2).zzf(this.zza);
        if (v2_2 == null) {
            throw new java.io.IOException("Service call returned null.");
        } else {
            return v2_2;
        }
    }
}
