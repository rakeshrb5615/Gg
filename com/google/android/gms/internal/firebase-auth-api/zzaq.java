package com.google.android.gms.internal.firebase-auth-api;
public abstract class zzaq extends com.google.android.gms.internal.firebase-auth-api.zzag implements java.util.Set {
    private transient com.google.android.gms.internal.firebase-auth-api.zzah zza;

    public zzaq()
    {
        return;
    }

    public boolean equals(Object p1)
    {
        if (p1 != this) {
            return com.google.android.gms.internal.firebase-auth-api.zzav.zza(this, p1);
        } else {
            return 1;
        }
    }

    public int hashCode()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzav.zza(this);
    }

    public synthetic java.util.Iterator iterator()
    {
        return this.zzd();
    }

    public com.google.android.gms.internal.firebase-auth-api.zzah zzc()
    {
        com.google.android.gms.internal.firebase-auth-api.zzah v0 = this.zza;
        if (v0 == null) {
            v0 = this.zzf();
            this.zza = v0;
        }
        return v0;
    }

    public com.google.android.gms.internal.firebase-auth-api.zzah zzf()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzah.zza(this.toArray());
    }
}
