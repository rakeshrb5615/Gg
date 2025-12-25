package com.google.android.gms.internal.firebase-auth-api;
public abstract class zzalf$zzd extends com.google.android.gms.internal.firebase-auth-api.zzalf implements com.google.android.gms.internal.firebase-auth-api.zzamo {
    protected com.google.android.gms.internal.firebase-auth-api.zzakx zzc;

    public zzalf$zzd()
    {
        this.zzc = com.google.android.gms.internal.firebase-auth-api.zzakx.zzb();
        return;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzakx zza()
    {
        if (this.zzc.zzf()) {
            this.zzc = ((com.google.android.gms.internal.firebase-auth-api.zzakx) this.zzc.clone());
        }
        return this.zzc;
    }
}
