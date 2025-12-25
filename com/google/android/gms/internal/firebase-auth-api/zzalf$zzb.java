package com.google.android.gms.internal.firebase-auth-api;
public class zzalf$zzb extends com.google.android.gms.internal.firebase-auth-api.zzajo {
    protected com.google.android.gms.internal.firebase-auth-api.zzalf zza;
    private final com.google.android.gms.internal.firebase-auth-api.zzalf zzb;

    public zzalf$zzb(com.google.android.gms.internal.firebase-auth-api.zzalf p2)
    {
        this.zzb = p2;
        if (p2.zzw()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        } else {
            this.zza = p2.zzo();
            return;
        }
    }

    private static void zza(Object p1, Object p2)
    {
        com.google.android.gms.internal.firebase-auth-api.zzamx.zza().zza(p1).zza(p1, p2);
        return;
    }

    public synthetic Object clone()
    {
        com.google.android.gms.internal.firebase-auth-api.zzalf$zzb v0_2 = ((com.google.android.gms.internal.firebase-auth-api.zzalf$zzb) this.zzb.zza(com.google.android.gms.internal.firebase-auth-api.zzalf$zze.zze, 0, 0));
        v0_2.zza = ((com.google.android.gms.internal.firebase-auth-api.zzalf) this.zzf());
        return v0_2;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzalf$zzb zza(com.google.android.gms.internal.firebase-auth-api.zzalf p2)
    {
        if (!this.zzb.equals(p2)) {
            if (!this.zza.zzw()) {
                this.zzh();
            }
            com.google.android.gms.internal.firebase-auth-api.zzalf$zzb.zza(this.zza, p2);
            return this;
        } else {
            return this;
        }
    }

    public final synthetic com.google.android.gms.internal.firebase-auth-api.zzajo zzb()
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzalf$zzb) this.clone());
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzalf zzc()
    {
        com.google.android.gms.internal.firebase-auth-api.zzalf v0_1 = ((com.google.android.gms.internal.firebase-auth-api.zzalf) this.zzf());
        if (!v0_1.zzv()) {
            throw new com.google.android.gms.internal.firebase-auth-api.zzanv(v0_1);
        } else {
            return v0_1;
        }
    }

    public com.google.android.gms.internal.firebase-auth-api.zzalf zzd()
    {
        if (this.zza.zzw()) {
            this.zza.zzt();
            return this.zza;
        } else {
            return this.zza;
        }
    }

    public synthetic com.google.android.gms.internal.firebase-auth-api.zzamm zze()
    {
        return this.zzc();
    }

    public synthetic com.google.android.gms.internal.firebase-auth-api.zzamm zzf()
    {
        return this.zzd();
    }

    public final void zzg()
    {
        if (!this.zza.zzw()) {
            this.zzh();
        }
        return;
    }

    public void zzh()
    {
        com.google.android.gms.internal.firebase-auth-api.zzalf v0_1 = this.zzb.zzo();
        com.google.android.gms.internal.firebase-auth-api.zzalf$zzb.zza(v0_1, this.zza);
        this.zza = v0_1;
        return;
    }

    public final synthetic com.google.android.gms.internal.firebase-auth-api.zzamm zzs()
    {
        return this.zzb;
    }

    public final boolean zzv()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzalf.zza(this.zza, 0);
    }
}
