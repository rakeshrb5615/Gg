package com.google.android.gms.internal.play_billing;
final class zzha implements java.util.Iterator {
    final synthetic com.google.android.gms.internal.play_billing.zzhd zza;
    private int zzb;
    private boolean zzc;
    private java.util.Iterator zzd;

    public synthetic zzha(com.google.android.gms.internal.play_billing.zzhd p1, com.google.android.gms.internal.play_billing.zzhc p2)
    {
        java.util.Objects.requireNonNull(p1);
        this.zza = p1;
        this.zzb = -1;
        return;
    }

    private final java.util.Iterator zza()
    {
        if (this.zzd == null) {
            this.zzd = com.google.android.gms.internal.play_billing.zzhd.zzh(this.zza).entrySet().iterator();
        }
        return this.zzd;
    }

    public final boolean hasNext()
    {
        int v2_1 = this.zza;
        if ((this.zzb + 1) < com.google.android.gms.internal.play_billing.zzhd.zzb(v2_1)) {
            return 1;
        } else {
            if ((com.google.android.gms.internal.play_billing.zzhd.zzh(v2_1).isEmpty()) || (!this.zza().hasNext())) {
                return 0;
            } else {
                return 1;
            }
        }
    }

    public final bridge synthetic Object next()
    {
        this.zzc = 1;
        int v1_1 = (this.zzb + 1);
        this.zzb = v1_1;
        java.util.Map$Entry v0_7 = this.zza;
        if (v1_1 >= com.google.android.gms.internal.play_billing.zzhd.zzb(v0_7)) {
            return ((java.util.Map$Entry) this.zza().next());
        } else {
            return ((com.google.android.gms.internal.play_billing.zzgz) com.google.android.gms.internal.play_billing.zzhd.zzk(v0_7)[v1_1]);
        }
    }

    public final void remove()
    {
        if (!this.zzc) {
            throw new IllegalStateException("remove() was called before next()");
        } else {
            this.zzc = 0;
            java.util.Iterator v0_5 = this.zza;
            com.google.android.gms.internal.play_billing.zzhd.zzi(v0_5);
            String v1_0 = this.zzb;
            if (v1_0 >= com.google.android.gms.internal.play_billing.zzhd.zzb(v0_5)) {
                this.zza().remove();
                return;
            } else {
                this.zzb = (v1_0 - 1);
                com.google.android.gms.internal.play_billing.zzhd.zze(v0_5, v1_0);
                return;
            }
        }
    }
}
