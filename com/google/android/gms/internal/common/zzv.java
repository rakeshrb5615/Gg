package com.google.android.gms.internal.common;
abstract class zzv extends com.google.android.gms.internal.common.zzk {
    final CharSequence zzb;
    final com.google.android.gms.internal.common.zzp zzc;
    final boolean zzd;
    int zze;
    int zzf;

    public zzv(com.google.android.gms.internal.common.zzw p2, CharSequence p3)
    {
        this.zze = 0;
        this.zzc = p2.zzf();
        this.zzd = p2.zzg();
        this.zzf = 2147483647;
        this.zzb = p3;
        return;
    }

    public final bridge synthetic Object zza()
    {
        String v0_0 = this.zze;
        do {
            int v1_0 = this.zze;
            if (v1_0 == -1) {
                this.zzb();
                return 0;
            } else {
                int v3_0;
                int v1_2 = this.zzc(v1_0);
                if (v1_2 != -1) {
                    v3_0 = this.zzd(v1_2);
                    this.zze = v3_0;
                } else {
                    v1_2 = this.zzb.length();
                    this.zze = -1;
                    v3_0 = -1;
                }
                if (v3_0 != v0_0) {
                    if (v0_0 < v1_2) {
                        this.zzb.charAt(v0_0);
                    }
                    if (v0_0 < v1_2) {
                        this.zzb.charAt((v1_2 - 1));
                    }
                    if ((!this.zzd) || (v0_0 != v1_2)) {
                        int v3_4 = this.zzf;
                        if (v3_4 != 1) {
                            this.zzf = (v3_4 + -1);
                        } else {
                            int v1_3 = this.zzb;
                            int v3_6 = v1_3.length();
                            this.zze = -1;
                            if (v3_6 > v0_0) {
                                v1_3.charAt((v3_6 - 1));
                            }
                            v1_2 = v3_6;
                        }
                        return this.zzb.subSequence(v0_0, v1_2).toString();
                    } else {
                        v0_0 = this.zze;
                    }
                } else {
                    int v3_7 = (v3_0 + 1);
                    this.zze = v3_7;
                }
            }
        } while(v3_7 <= this.zzb.length());
        this.zze = -1;
    }

    public abstract int zzc();

    public abstract int zzd();
}
