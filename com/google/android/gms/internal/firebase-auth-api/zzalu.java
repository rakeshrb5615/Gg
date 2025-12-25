package com.google.android.gms.internal.firebase-auth-api;
public class zzalu {
    private volatile com.google.android.gms.internal.firebase-auth-api.zzamm zza;
    private volatile com.google.android.gms.internal.firebase-auth-api.zzajv zzb;
    private volatile boolean zzc;

    public zzalu()
    {
        return;
    }

    private final com.google.android.gms.internal.firebase-auth-api.zzamm zzb(com.google.android.gms.internal.firebase-auth-api.zzamm p2)
    {
        try {
            if ((this.zza == null) && (this.zza == null)) {
                this.zza = p2;
                this.zzb = com.google.android.gms.internal.firebase-auth-api.zzajv.zza;
            }
        } catch (com.google.android.gms.internal.firebase-auth-api.zzajv v2_2) {
            throw v2_2;
        }
        return this.zza;
    }

    public boolean equals(Object p3)
    {
        if (this != p3) {
            if ((p3 instanceof com.google.android.gms.internal.firebase-auth-api.zzalu)) {
                com.google.android.gms.internal.firebase-auth-api.zzajv v0_2 = this.zza;
                com.google.android.gms.internal.firebase-auth-api.zzamm v1_1 = ((com.google.android.gms.internal.firebase-auth-api.zzalu) p3).zza;
                if ((v0_2 != null) || (v1_1 != null)) {
                    if ((v0_2 == null) || (v1_1 == null)) {
                        if (v0_2 == null) {
                            return this.zzb(v1_1.zzs()).equals(v1_1);
                        } else {
                            return v0_2.equals(((com.google.android.gms.internal.firebase-auth-api.zzalu) p3).zzb(v0_2.zzs()));
                        }
                    } else {
                        return v0_2.equals(v1_1);
                    }
                } else {
                    return this.zzb().equals(((com.google.android.gms.internal.firebase-auth-api.zzalu) p3).zzb());
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
                return this.zza.zzl();
            }
        } else {
            return this.zzb.zzb();
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzamm zza(com.google.android.gms.internal.firebase-auth-api.zzamm p3)
    {
        com.google.android.gms.internal.firebase-auth-api.zzamm v0 = this.zza;
        this.zzb = 0;
        this.zza = p3;
        return v0;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzajv zzb()
    {
        if (this.zzb == null) {
            if (this.zzb == null) {
                if (this.zza != null) {
                    this.zzb = this.zza.zzj();
                } else {
                    this.zzb = com.google.android.gms.internal.firebase-auth-api.zzajv.zza;
                }
                return this.zzb;
            } else {
                return this.zzb;
            }
        } else {
            return this.zzb;
        }
    }
}
