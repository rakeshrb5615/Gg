package com.google.android.gms.internal.play_billing;
public class zzfe extends com.google.android.gms.internal.play_billing.zzdr {
    protected com.google.android.gms.internal.play_billing.zzfi zza;
    private final com.google.android.gms.internal.play_billing.zzfi zzb;

    public zzfe(com.google.android.gms.internal.play_billing.zzfi p2)
    {
        this.zzb = p2;
        if (p2.zzz()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        } else {
            this.zza = p2.zzo();
            return;
        }
    }

    private static void zza(Object p2, Object p3)
    {
        com.google.android.gms.internal.play_billing.zzgs.zza().zzb(p2.getClass()).zzg(p2, p3);
        return;
    }

    public final bridge synthetic Object clone()
    {
        return this.zzc();
    }

    public final bridge synthetic com.google.android.gms.internal.play_billing.zzdr zzb()
    {
        return this.zzc();
    }

    public final com.google.android.gms.internal.play_billing.zzfe zzc()
    {
        com.google.android.gms.internal.play_billing.zzfe v0_2 = ((com.google.android.gms.internal.play_billing.zzfe) this.zzb.zzb(5, 0, 0));
        v0_2.zza = this.zzf();
        return v0_2;
    }

    public final com.google.android.gms.internal.play_billing.zzfe zzd(com.google.android.gms.internal.play_billing.zzfi p2)
    {
        if (!this.zzb.equals(p2)) {
            if (!this.zza.zzz()) {
                this.zzj();
            }
            com.google.android.gms.internal.play_billing.zzfe.zza(this.zza, p2);
        }
        return this;
    }

    public final com.google.android.gms.internal.play_billing.zzfi zze()
    {
        com.google.android.gms.internal.play_billing.zzfi v0 = this.zzf();
        if (!v0.zzk()) {
            throw new com.google.android.gms.internal.play_billing.zzhg(v0);
        } else {
            return v0;
        }
    }

    public com.google.android.gms.internal.play_billing.zzfi zzf()
    {
        if (this.zza.zzz()) {
            this.zza.zzu();
            return this.zza;
        } else {
            return this.zza;
        }
    }

    public bridge synthetic com.google.android.gms.internal.play_billing.zzgl zzg()
    {
        return this.zzf();
    }

    public final bridge synthetic com.google.android.gms.internal.play_billing.zzgl zzh()
    {
        throw 0;
    }

    public final void zzi()
    {
        if (!this.zza.zzz()) {
            this.zzj();
        }
        return;
    }

    public void zzj()
    {
        com.google.android.gms.internal.play_billing.zzfi v0_1 = this.zzb.zzo();
        com.google.android.gms.internal.play_billing.zzfe.zza(v0_1, this.zza);
        this.zza = v0_1;
        return;
    }

    public final boolean zzk()
    {
        return com.google.android.gms.internal.play_billing.zzfi.zzy(this.zza, 0);
    }
}
