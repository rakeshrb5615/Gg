package com.google.android.gms.internal.auth;
public abstract class zzdo implements com.google.android.gms.internal.auth.zzfv {

    public zzdo()
    {
        return;
    }

    public bridge synthetic Object clone()
    {
        return this.zza();
    }

    public abstract com.google.android.gms.internal.auth.zzdo zza();

    public abstract com.google.android.gms.internal.auth.zzdo zzb();

    public final bridge synthetic com.google.android.gms.internal.auth.zzfv zzc(com.google.android.gms.internal.auth.zzfw p2)
    {
        if (!this.zzh().getClass().isInstance(p2)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        } else {
            return this.zzb(((com.google.android.gms.internal.auth.zzdp) p2));
        }
    }
}
