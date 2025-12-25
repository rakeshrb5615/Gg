package com.google.android.recaptcha.internal;
public final class zzij {
    final synthetic com.google.android.recaptcha.internal.zzja zza;
    private Long zzb;
    private final com.google.android.recaptcha.internal.zzjh zzc;

    public zzij(com.google.android.recaptcha.internal.zzja p1)
    {
        this.zza = p1;
        this.zzc = com.google.android.recaptcha.internal.zzjh.zzb();
        return;
    }

    private final void zzb()
    {
        if (this.zzb == null) {
            this.zzc.zzf();
            this.zzb = Long.valueOf(this.zzc.zza(java.util.concurrent.TimeUnit.MILLISECONDS));
        }
        return;
    }

    public final Long zza()
    {
        return this.zzb;
    }

    public final void zzlce(String p3)
    {
        com.google.android.recaptcha.internal.zzja v0_0 = this.zza;
        if (v0_0.zzq().zzb == null) {
            com.google.android.recaptcha.internal.zzja v0_4 = com.google.android.recaptcha.internal.zzja.zzo(v0_0);
            if (v0_4 != null) {
                v0_4.zza();
            }
            com.google.android.recaptcha.internal.zzja.zzB(this.zza, 0);
        }
        this.zzb();
        com.google.android.recaptcha.internal.zztx v3_2 = com.google.android.recaptcha.internal.zzrc.zzl(com.google.android.recaptcha.internal.zzbt.zza(p3));
        com.google.android.recaptcha.internal.zzja v0_1 = com.google.android.recaptcha.internal.zztx.zzi();
        v0_1.zzf(v3_2);
        com.google.android.recaptcha.internal.zzja.zzn(this.zza).zze(((com.google.android.recaptcha.internal.zztx) v0_1.zzi()));
        return;
    }

    public final void zzlsm(String p2)
    {
        this.zzb();
        com.google.android.recaptcha.internal.zzek v0_2 = com.google.android.recaptcha.internal.zztx.zzi();
        v0_2.zzq(com.google.android.recaptcha.internal.zzrr.zzi(com.google.android.recaptcha.internal.zzbt.zza(p2)));
        com.google.android.recaptcha.internal.zzja.zzn(this.zza).zze(((com.google.android.recaptcha.internal.zztx) v0_2.zzi()));
        return;
    }

    public final void zzoid(String p3)
    {
        this.zzb();
        d8.t v3_9 = com.google.android.recaptcha.internal.zzts.zzg(com.google.android.recaptcha.internal.zzbt.zza(p3));
        v3_9.zzi().name();
        if (v3_9.zzi() != com.google.android.recaptcha.internal.zztv.zzb) {
            v3_9.zzi().name();
            d8.t v3_2 = com.google.android.recaptcha.internal.zzbc.zza(v3_9.zzi());
            this.zza.zzA().hashCode();
            ((d8.u) this.zza.zzA()).O(v3_2);
            return;
        } else {
            this.zza.zzA().hashCode();
            if (!((d8.u) this.zza.zzA()).A(h7.l.a)) {
                this.zza.zzA().hashCode();
            }
            return;
        }
    }

    public final void zzrp(String p2)
    {
        this.zzb();
        int v0_1 = this.zza.zzb;
        if (v0_1 == 0) {
            v0_1 = 0;
        }
        v0_1.zza(p2);
        return;
    }

    public final void zzscd(String p3)
    {
        this.zzb();
        com.google.android.recaptcha.internal.zzsi v3_2 = com.google.android.recaptcha.internal.zzsi.zzi(com.google.android.recaptcha.internal.zzbt.zza(p3));
        v3_2.toString();
        d8.u v0_1 = ((d8.t) com.google.android.recaptcha.internal.zzja.zzz(this.zza).remove(v3_2.zzk()));
        if (v0_1 != null) {
            ((d8.u) v0_1).A(v3_2);
        }
        return;
    }
}
