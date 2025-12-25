package com.google.android.gms.internal.auth;
public class zzes extends com.google.android.gms.internal.auth.zzdo {
    protected com.google.android.gms.internal.auth.zzeu zza;
    protected boolean zzb;
    private final com.google.android.gms.internal.auth.zzeu zzc;

    public zzes(com.google.android.gms.internal.auth.zzeu p3)
    {
        this.zzc = p3;
        this.zza = ((com.google.android.gms.internal.auth.zzeu) p3.zzi(4, 0, 0));
        this.zzb = 0;
        return;
    }

    private static final void zzj(com.google.android.gms.internal.auth.zzeu p2, com.google.android.gms.internal.auth.zzeu p3)
    {
        com.google.android.gms.internal.auth.zzge.zza().zzb(p2.getClass()).zzf(p2, p3);
        return;
    }

    public final bridge synthetic Object clone()
    {
        return this.zzd();
    }

    public final bridge synthetic com.google.android.gms.internal.auth.zzdo zza()
    {
        return this.zzd();
    }

    public final synthetic com.google.android.gms.internal.auth.zzdo zzb(com.google.android.gms.internal.auth.zzdp p1)
    {
        this.zze(((com.google.android.gms.internal.auth.zzeu) p1));
        return this;
    }

    public final com.google.android.gms.internal.auth.zzes zzd()
    {
        com.google.android.gms.internal.auth.zzes v0_2 = ((com.google.android.gms.internal.auth.zzes) this.zzc.zzi(5, 0, 0));
        v0_2.zze(this.zzf());
        return v0_2;
    }

    public final com.google.android.gms.internal.auth.zzes zze(com.google.android.gms.internal.auth.zzeu p2)
    {
        if (this.zzb) {
            this.zzi();
            this.zzb = 0;
        }
        com.google.android.gms.internal.auth.zzes.zzj(this.zza, p2);
        return this;
    }

    public com.google.android.gms.internal.auth.zzeu zzf()
    {
        if (!this.zzb) {
            com.google.android.gms.internal.auth.zzeu v0_4 = this.zza;
            com.google.android.gms.internal.auth.zzge.zza().zzb(v0_4.getClass()).zze(v0_4);
            this.zzb = 1;
            return this.zza;
        } else {
            return this.zza;
        }
    }

    public bridge synthetic com.google.android.gms.internal.auth.zzfw zzg()
    {
        return this.zzf();
    }

    public final synthetic com.google.android.gms.internal.auth.zzfw zzh()
    {
        return this.zzc;
    }

    public void zzi()
    {
        com.google.android.gms.internal.auth.zzeu v0_2 = ((com.google.android.gms.internal.auth.zzeu) this.zza.zzi(4, 0, 0));
        com.google.android.gms.internal.auth.zzes.zzj(v0_2, this.zza);
        this.zza = v0_2;
        return;
    }
}
