package com.google.android.gms.internal.measurement;
final class zzoc implements java.util.Iterator {
    final synthetic com.google.android.gms.internal.measurement.zzoe zza;
    private int zzb;
    private boolean zzc;
    private java.util.Iterator zzd;

    public synthetic zzoc(com.google.android.gms.internal.measurement.zzoe p1, byte[] p2)
    {
        java.util.Objects.requireNonNull(p1);
        this.zza = p1;
        this.zzb = -1;
        return;
    }

    private final java.util.Iterator zza()
    {
        if (this.zzd == null) {
            this.zzd = this.zza.zzk().entrySet().iterator();
        }
        return this.zzd;
    }

    public final boolean hasNext()
    {
        int v2_1 = this.zza;
        if ((this.zzb + 1) < v2_1.zzj()) {
            return 1;
        } else {
            if ((v2_1.zzk().isEmpty()) || (!this.zza().hasNext())) {
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
        if (v1_1 >= v0_7.zzj()) {
            return ((java.util.Map$Entry) this.zza().next());
        } else {
            return ((com.google.android.gms.internal.measurement.zzob) v0_7.zzi()[v1_1]);
        }
    }

    public final void remove()
    {
        if (!this.zzc) {
            throw new IllegalStateException("remove() was called before next()");
        } else {
            this.zzc = 0;
            java.util.Iterator v0_5 = this.zza;
            v0_5.zzh();
            String v1_0 = this.zzb;
            if (v1_0 >= v0_5.zzj()) {
                this.zza().remove();
                return;
            } else {
                this.zzb = (v1_0 - 1);
                v0_5.zzg(v1_0);
                return;
            }
        }
    }
}
