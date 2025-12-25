package com.google.android.gms.internal.measurement;
public class zzmw {
    protected volatile com.google.android.gms.internal.measurement.zznm zza;
    private volatile com.google.android.gms.internal.measurement.zzlh zzb;
    private volatile boolean zzc;

    public zzmw()
    {
        return;
    }

    public boolean equals(Object p3)
    {
        if (this != p3) {
            if ((p3 instanceof com.google.android.gms.internal.measurement.zzmw)) {
                com.google.android.gms.internal.measurement.zzlh v0_1 = this.zza;
                com.google.android.gms.internal.measurement.zznm v1_1 = ((com.google.android.gms.internal.measurement.zzmw) p3).zza;
                if ((v0_1 == null) && (v1_1 == null)) {
                    return this.zzc().equals(((com.google.android.gms.internal.measurement.zzmw) p3).zzc());
                } else {
                    if ((v0_1 != null) && (v1_1 != null)) {
                        return v0_1.equals(v1_1);
                    } else {
                        if (v0_1 == null) {
                            this.zzd(v1_1.zzcE());
                            return this.zza.equals(v1_1);
                        } else {
                            ((com.google.android.gms.internal.measurement.zzmw) p3).zzd(v0_1.zzcE());
                            return v0_1.equals(((com.google.android.gms.internal.measurement.zzmw) p3).zza);
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

    public final com.google.android.gms.internal.measurement.zznm zza(com.google.android.gms.internal.measurement.zznm p3)
    {
        com.google.android.gms.internal.measurement.zznm v0 = this.zza;
        this.zzb = 0;
        this.zza = p3;
        return v0;
    }

    public final int zzb()
    {
        if (this.zzb == null) {
            if (this.zza == null) {
                return 0;
            } else {
                return this.zza.zzcn();
            }
        } else {
            return ((com.google.android.gms.internal.measurement.zzlg) this.zzb).zza.length;
        }
    }

    public final com.google.android.gms.internal.measurement.zzlh zzc()
    {
        if (this.zzb == null) {
            if (this.zzb == null) {
                if (this.zza != null) {
                    this.zzb = this.zza.zzcb();
                } else {
                    this.zzb = com.google.android.gms.internal.measurement.zzlh.zzb;
                }
                return this.zzb;
            } else {
                return this.zzb;
            }
        } else {
            return this.zzb;
        }
    }

    public final void zzd(com.google.android.gms.internal.measurement.zznm p2)
    {
        try {
            if (this.zza == null) {
                if (this.zza == null) {
                    this.zza = p2;
                    this.zzb = com.google.android.gms.internal.measurement.zzlh.zzb;
                } else {
                    return;
                }
            }
        } catch (com.google.android.gms.internal.measurement.zzlh v2_2) {
            throw v2_2;
        }
        return;
    }
}
