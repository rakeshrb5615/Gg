package com.google.android.gms.internal.firebase-auth-api;
abstract class zzanu {
    private static volatile int zza = 100;

    public zzanu()
    {
        return;
    }

    public abstract int zza();

    public abstract Object zza();

    public abstract Object zza();

    public abstract void zza();

    public abstract void zza();

    public abstract void zza();

    public abstract void zza();

    public abstract void zza();

    public abstract boolean zza();

    public final boolean zza(Object p7, com.google.android.gms.internal.firebase-auth-api.zzanc p8, int p9)
    {
        Object v0_0 = p8.zzd();
        int v1 = (v0_0 >> 3);
        Object v0_2 = (v0_0 & 7);
        if (v0_2 == null) {
            this.zzb(p7, v1, p8.zzl());
            return 1;
        } else {
            if (v0_2 == 1) {
                this.zza(p7, v1, p8.zzk());
                return 1;
            } else {
                if (v0_2 == 2) {
                    this.zza(p7, v1, p8.zzp());
                    return 1;
                } else {
                    if (v0_2 == 3) {
                        Object v0_1 = this.zza();
                        int v9_1 = (p9 + 1);
                        if (v9_1 >= com.google.android.gms.internal.firebase-auth-api.zzanu.zza) {
                            throw com.google.android.gms.internal.firebase-auth-api.zzall.zzh();
                        }
                        while (p8.zzc() != 2147483647) {
                            if (!this.zza(v0_1, p8, v9_1)) {
                                break;
                            }
                        }
                        if ((4 | (v1 << 3)) != p8.zzd()) {
                            throw com.google.android.gms.internal.firebase-auth-api.zzall.zzb();
                        } else {
                            this.zza(p7, v1, this.zze(v0_1));
                            return 1;
                        }
                    } else {
                        if (v0_2 == 4) {
                            if (p9 == 0) {
                                throw com.google.android.gms.internal.firebase-auth-api.zzall.zzb();
                            } else {
                                return 0;
                            }
                        } else {
                            if (v0_2 != 5) {
                                throw com.google.android.gms.internal.firebase-auth-api.zzall.zza();
                            } else {
                                this.zza(p7, v1, p8.zzf());
                                return 1;
                            }
                        }
                    }
                }
            }
        }
    }

    public abstract int zzb();

    public abstract void zzb();

    public abstract void zzb();

    public abstract void zzb();

    public abstract Object zzc();

    public abstract void zzc();

    public abstract Object zzd();

    public abstract Object zze();

    public abstract void zzf();
}
