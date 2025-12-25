package com.google.android.recaptcha.internal;
public class zznt {
    protected volatile com.google.android.recaptcha.internal.zzoi zza;
    private volatile com.google.android.recaptcha.internal.zzle zzb;

    public zznt()
    {
        return;
    }

    public boolean equals(Object p3)
    {
        if (this != p3) {
            if ((p3 instanceof com.google.android.recaptcha.internal.zznt)) {
                com.google.android.recaptcha.internal.zzle v0_1 = this.zza;
                com.google.android.recaptcha.internal.zzoi v1_1 = ((com.google.android.recaptcha.internal.zznt) p3).zza;
                if ((v0_1 == null) && (v1_1 == null)) {
                    return this.zzb().equals(((com.google.android.recaptcha.internal.zznt) p3).zzb());
                } else {
                    if ((v0_1 != null) && (v1_1 != null)) {
                        return v0_1.equals(v1_1);
                    } else {
                        if (v0_1 == null) {
                            this.zzd(v1_1.zzm());
                            return this.zza.equals(v1_1);
                        } else {
                            ((com.google.android.recaptcha.internal.zznt) p3).zzd(v0_1.zzm());
                            return v0_1.equals(((com.google.android.recaptcha.internal.zznt) p3).zza);
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
                return this.zza.zzo();
            }
        } else {
            return ((com.google.android.recaptcha.internal.zzlc) this.zzb).zza.length;
        }
    }

    public final com.google.android.recaptcha.internal.zzle zzb()
    {
        if (this.zzb == null) {
            if (this.zzb == null) {
                if (this.zza != null) {
                    this.zzb = this.zza.zzb();
                } else {
                    this.zzb = com.google.android.recaptcha.internal.zzle.zzb;
                }
                return this.zzb;
            } else {
                return this.zzb;
            }
        } else {
            return this.zzb;
        }
    }

    public final com.google.android.recaptcha.internal.zzoi zzc(com.google.android.recaptcha.internal.zzoi p3)
    {
        com.google.android.recaptcha.internal.zzoi v0 = this.zza;
        this.zzb = 0;
        this.zza = p3;
        return v0;
    }

    public final void zzd(com.google.android.recaptcha.internal.zzoi p2)
    {
        try {
            if (this.zza == null) {
                if (this.zza == null) {
                    this.zza = p2;
                    this.zzb = com.google.android.recaptcha.internal.zzle.zzb;
                } else {
                    return;
                }
            }
        } catch (com.google.android.recaptcha.internal.zzle v2_1) {
            throw v2_1;
        }
        return;
    }
}
