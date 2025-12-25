package com.google.android.recaptcha.internal;
final class zzoz extends com.google.android.recaptcha.internal.zzpe {

    public zzoz()
    {
        super(0);
        return;
    }

    public final void zza()
    {
        if (!this.zzj()) {
            java.util.Iterator v0_2 = 0;
            while (v0_2 < this.zzc()) {
                ((com.google.android.recaptcha.internal.zzms) ((com.google.android.recaptcha.internal.zzpa) this.zzg(v0_2)).zza()).zzg();
                v0_2++;
            }
            java.util.Iterator v0_1 = this.zzd().iterator();
            while (v0_1.hasNext()) {
                ((com.google.android.recaptcha.internal.zzms) ((java.util.Map$Entry) v0_1.next()).getKey()).zzg();
            }
        }
        super.zza();
        return;
    }
}
