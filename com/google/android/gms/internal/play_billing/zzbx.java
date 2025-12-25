package com.google.android.gms.internal.play_billing;
public abstract class zzbx extends com.google.android.gms.internal.play_billing.zzbq implements java.util.Set {
    private transient com.google.android.gms.internal.play_billing.zzbt zza;

    public zzbx()
    {
        return;
    }

    public final boolean equals(Object p5)
    {
        if (p5 == this) {
            return 1;
        } else {
            if (p5 != this) {
                try {
                    if ((!(p5 instanceof java.util.Set)) || (this.size() != ((java.util.Set) p5).size())) {
                        return 0;
                    } else {
                        if (this.containsAll(((java.util.Set) p5))) {
                            return 1;
                        } else {
                            return 0;
                        }
                    }
                } catch (ClassCastException) {
                    return 0;
                }
            } else {
                return 1;
            }
        }
    }

    public final int hashCode()
    {
        return com.google.android.gms.internal.play_billing.zzcg.zza(this);
    }

    public bridge synthetic java.util.Iterator iterator()
    {
        return this.zze();
    }

    public com.google.android.gms.internal.play_billing.zzbt zzd()
    {
        com.google.android.gms.internal.play_billing.zzbt v0 = this.zza;
        if (v0 == null) {
            v0 = this.zzh();
            this.zza = v0;
        }
        return v0;
    }

    public abstract com.google.android.gms.internal.play_billing.zzch zze();

    public com.google.android.gms.internal.play_billing.zzbt zzh()
    {
        com.google.android.gms.internal.play_billing.zzbt v0_0 = this.toArray();
        return com.google.android.gms.internal.play_billing.zzbt.zzi(v0_0, v0_0.length);
    }
}
