package com.google.android.gms.internal.play_billing;
public class zzfw {
    protected volatile com.google.android.gms.internal.play_billing.zzgl zza;
    private volatile com.google.android.gms.internal.play_billing.zzei zzb;
    private volatile boolean zzc;

    public zzfw()
    {
        return;
    }

    public boolean equals(Object p3)
    {
        if (this != p3) {
            if ((p3 instanceof com.google.android.gms.internal.play_billing.zzfw)) {
                com.google.android.gms.internal.play_billing.zzei v0_1 = this.zza;
                com.google.android.gms.internal.play_billing.zzgl v1_1 = ((com.google.android.gms.internal.play_billing.zzfw) p3).zza;
                if ((v0_1 == null) && (v1_1 == null)) {
                    return this.zzb().equals(((com.google.android.gms.internal.play_billing.zzfw) p3).zzb());
                } else {
                    if ((v0_1 != null) && (v1_1 != null)) {
                        return v0_1.equals(v1_1);
                    } else {
                        if (v0_1 == null) {
                            this.zzd(v1_1.zzh());
                            return this.zza.equals(v1_1);
                        } else {
                            ((com.google.android.gms.internal.play_billing.zzfw) p3).zzd(v0_1.zzh());
                            return v0_1.equals(((com.google.android.gms.internal.play_billing.zzfw) p3).zza);
                        }
                    }
                }
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public int hashCode()
    {
        return 1;
    }

    public final int zza()
    {
        if (this.zzb == null) {
            if (this.zza == null) {
                return 0;
            } else {
                return this.zza.zzj();
            }
        } else {
            return ((com.google.android.gms.internal.play_billing.zzeg) this.zzb).zza.length;
        }
    }

    public final com.google.android.gms.internal.play_billing.zzei zzb()
    {
        if (this.zzb == null) {
            if (this.zzb == null) {
                if (this.zza != null) {
                    this.zzb = this.zza.zzf();
                } else {
                    this.zzb = com.google.android.gms.internal.play_billing.zzei.zzb;
                }
                return this.zzb;
            } else {
                return this.zzb;
            }
        } else {
            return this.zzb;
        }
    }

    public final com.google.android.gms.internal.play_billing.zzgl zzc(com.google.android.gms.internal.play_billing.zzgl p3)
    {
        com.google.android.gms.internal.play_billing.zzgl v0 = this.zza;
        this.zzb = 0;
        this.zza = p3;
        return v0;
    }

    public final void zzd(com.google.android.gms.internal.play_billing.zzgl p2)
    {
        try {
            if (this.zza == null) {
                if (this.zza == null) {
                    this.zza = p2;
                    this.zzb = com.google.android.gms.internal.play_billing.zzei.zzb;
                } else {
                    return;
                }
            }
        } catch (com.google.android.gms.internal.play_billing.zzei v2_2) {
            throw v2_2;
        }
        return;
    }
}
