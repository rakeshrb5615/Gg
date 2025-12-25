package com.google.android.recaptcha.internal;
public class zzmx extends com.google.android.recaptcha.internal.zzkn {
    protected com.google.android.recaptcha.internal.zznd zza;
    private final com.google.android.recaptcha.internal.zznd zzb;

    public zzmx(com.google.android.recaptcha.internal.zznd p2)
    {
        this.zzb = p2;
        if (p2.zzL()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        } else {
            this.zza = p2.zzv();
            return;
        }
    }

    private static void zze(Object p2, Object p3)
    {
        com.google.android.recaptcha.internal.zzos.zza().zzb(p2.getClass()).zzg(p2, p3);
        return;
    }

    public final bridge synthetic Object clone()
    {
        return this.zzg();
    }

    public final bridge synthetic com.google.android.recaptcha.internal.zzkn zza()
    {
        return this.zzg();
    }

    public final synthetic com.google.android.recaptcha.internal.zzkn zzb(com.google.android.recaptcha.internal.zzko p1)
    {
        this.zzh(((com.google.android.recaptcha.internal.zznd) p1));
        return this;
    }

    public final com.google.android.recaptcha.internal.zzmx zzg()
    {
        com.google.android.recaptcha.internal.zzmx v0_2 = ((com.google.android.recaptcha.internal.zzmx) this.zzb.zzh(5, 0, 0));
        v0_2.zza = this.zzj();
        return v0_2;
    }

    public final com.google.android.recaptcha.internal.zzmx zzh(com.google.android.recaptcha.internal.zznd p2)
    {
        if (!this.zzb.equals(p2)) {
            if (!this.zza.zzL()) {
                this.zzo();
            }
            com.google.android.recaptcha.internal.zzmx.zze(this.zza, p2);
        }
        return this;
    }

    public final com.google.android.recaptcha.internal.zznd zzi()
    {
        com.google.android.recaptcha.internal.zznd v0 = this.zzj();
        if (!com.google.android.recaptcha.internal.zznd.zzK(v0, 1)) {
            throw new com.google.android.recaptcha.internal.zzpk(v0);
        } else {
            return v0;
        }
    }

    public com.google.android.recaptcha.internal.zznd zzj()
    {
        if (this.zza.zzL()) {
            this.zza.zzG();
            return this.zza;
        } else {
            return this.zza;
        }
    }

    public bridge synthetic com.google.android.recaptcha.internal.zzoi zzk()
    {
        return this.zzi();
    }

    public bridge synthetic com.google.android.recaptcha.internal.zzoi zzl()
    {
        return this.zzj();
    }

    public final synthetic com.google.android.recaptcha.internal.zzoi zzm()
    {
        return this.zzb;
    }

    public final void zzn()
    {
        if (!this.zza.zzL()) {
            this.zzo();
        }
        return;
    }

    public void zzo()
    {
        com.google.android.recaptcha.internal.zznd v0_1 = this.zzb.zzv();
        com.google.android.recaptcha.internal.zzmx.zze(v0_1, this.zza);
        this.zza = v0_1;
        return;
    }

    public final boolean zzp()
    {
        return com.google.android.recaptcha.internal.zznd.zzK(this.zza, 0);
    }
}
