package com.google.android.gms.internal.auth;
final class zzgq implements java.util.Iterator {
    final synthetic com.google.android.gms.internal.auth.zzgu zza;
    private int zzb;
    private boolean zzc;
    private java.util.Iterator zzd;

    public synthetic zzgq(com.google.android.gms.internal.auth.zzgu p1, com.google.android.gms.internal.auth.zzgp p2)
    {
        this.zza = p1;
        this.zzb = -1;
        return;
    }

    private final java.util.Iterator zza()
    {
        if (this.zzd == null) {
            this.zzd = com.google.android.gms.internal.auth.zzgu.zzh(this.zza).entrySet().iterator();
        }
        return this.zzd;
    }

    public final boolean hasNext()
    {
        if ((this.zzb + 1) < com.google.android.gms.internal.auth.zzgu.zzf(this.zza).size()) {
            return 1;
        } else {
            if ((com.google.android.gms.internal.auth.zzgu.zzh(this.zza).isEmpty()) || (!this.zza().hasNext())) {
                return 0;
            } else {
                return 1;
            }
        }
    }

    public final bridge synthetic Object next()
    {
        this.zzc = 1;
        int v1_2 = (this.zzb + 1);
        this.zzb = v1_2;
        if (v1_2 >= com.google.android.gms.internal.auth.zzgu.zzf(this.zza).size()) {
            return ((java.util.Map$Entry) this.zza().next());
        } else {
            return ((java.util.Map$Entry) com.google.android.gms.internal.auth.zzgu.zzf(this.zza).get(this.zzb));
        }
    }

    public final void remove()
    {
        if (!this.zzc) {
            throw new IllegalStateException("remove() was called before next()");
        } else {
            this.zzc = 0;
            com.google.android.gms.internal.auth.zzgu.zzi(this.zza);
            if (this.zzb >= com.google.android.gms.internal.auth.zzgu.zzf(this.zza).size()) {
                this.zza().remove();
                return;
            } else {
                java.util.Iterator v0_4 = this.zza;
                int v1_3 = this.zzb;
                this.zzb = (v1_3 - 1);
                com.google.android.gms.internal.auth.zzgu.zzd(v0_4, v1_3);
                return;
            }
        }
    }
}
