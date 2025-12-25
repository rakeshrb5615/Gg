package com.google.android.recaptcha.internal;
abstract class zzpl {
    private static volatile int zza = 100;

    public zzpl()
    {
        return;
    }

    public abstract Object zza();

    public abstract Object zzb();

    public abstract Object zzc();

    public abstract void zzd();

    public abstract void zze();

    public abstract void zzf();

    public abstract void zzg();

    public abstract void zzh();

    public abstract void zzi();

    public abstract void zzj();

    public final boolean zzk(Object p8, com.google.android.recaptcha.internal.zzov p9, int p10)
    {
        Object v0_0 = p9.zzd();
        int v1 = (v0_0 >> 3);
        Object v0_2 = (v0_0 & 7);
        if (v0_2 == null) {
            this.zzh(p8, v1, p9.zzl());
            return 1;
        } else {
            if (v0_2 == 1) {
                this.zze(p8, v1, p9.zzk());
                return 1;
            } else {
                if (v0_2 == 2) {
                    this.zzg(p8, v1, p9.zzp());
                    return 1;
                } else {
                    if (v0_2 == 3) {
                        Object v0_1 = this.zzb();
                        int v10_1 = (p10 + 1);
                        if (v10_1 >= com.google.android.recaptcha.internal.zzpl.zza) {
                            throw new com.google.android.recaptcha.internal.zznn("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                        }
                        while (p9.zzc() != 2147483647) {
                            if (!this.zzk(v0_1, p9, v10_1)) {
                                break;
                            }
                        }
                        if (((v1 << 3) | 4) != p9.zzd()) {
                            throw new com.google.android.recaptcha.internal.zznn("Protocol message end-group tag did not match expected tag.");
                        } else {
                            this.zzf(p8, v1, this.zzc(v0_1));
                            return 1;
                        }
                    } else {
                        if (v0_2 == 4) {
                            return 0;
                        } else {
                            if (v0_2 != 5) {
                                throw new com.google.android.recaptcha.internal.zznm("Protocol message tag had invalid wire type.");
                            } else {
                                this.zzd(p8, v1, p9.zzf());
                                return 1;
                            }
                        }
                    }
                }
            }
        }
    }
}
