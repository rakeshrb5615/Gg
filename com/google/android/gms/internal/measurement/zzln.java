package com.google.android.gms.internal.measurement;
final class zzln implements com.google.android.gms.internal.measurement.zzov {
    private final com.google.android.gms.internal.measurement.zzlm zza;

    private zzln(com.google.android.gms.internal.measurement.zzlm p2)
    {
        this.zza = p2;
        p2.zza = this;
        return;
    }

    public static com.google.android.gms.internal.measurement.zzln zza(com.google.android.gms.internal.measurement.zzlm p1)
    {
        com.google.android.gms.internal.measurement.zzln v0_0 = p1.zza;
        if (v0_0 == null) {
            return new com.google.android.gms.internal.measurement.zzln(p1);
        } else {
            return v0_0;
        }
    }

    public final void zzA(int p4, java.util.List p5, boolean p6)
    {
        int v2 = 0;
        if (!(p5 instanceof com.google.android.gms.internal.measurement.zzna)) {
            if (p6 != null) {
                com.google.android.gms.internal.measurement.zzlm v6_1 = this.zza;
                v6_1.zza(p4, 2);
                Long v4_1 = 0;
                long v0_4 = 0;
                while (v4_1 < p5.size()) {
                    ((Long) p5.get(v4_1)).getClass();
                    v0_4 += 8;
                    v4_1++;
                }
                v6_1.zzr(v0_4);
                while (v2 < p5.size()) {
                    v6_1.zzu(((Long) p5.get(v2)).longValue());
                    v2++;
                }
                return;
            }
            while (v2 < p5.size()) {
                this.zza.zzf(p4, ((Long) p5.get(v2)).longValue());
                v2++;
            }
        } else {
            if (p6 != null) {
                com.google.android.gms.internal.measurement.zzlm v6_4 = this.zza;
                v6_4.zza(p4, 2);
                Long v4_5 = 0;
                long v0_7 = 0;
                while (v4_5 < ((com.google.android.gms.internal.measurement.zzna) p5).size()) {
                    ((com.google.android.gms.internal.measurement.zzna) p5).zzc(v4_5);
                    v0_7 += 8;
                    v4_5++;
                }
                v6_4.zzr(v0_7);
                while (v2 < ((com.google.android.gms.internal.measurement.zzna) p5).size()) {
                    v6_4.zzu(((com.google.android.gms.internal.measurement.zzna) p5).zzc(v2));
                    v2++;
                }
                return;
            }
            while (v2 < ((com.google.android.gms.internal.measurement.zzna) p5).size()) {
                this.zza.zzf(p4, ((com.google.android.gms.internal.measurement.zzna) p5).zzc(v2));
                v2++;
            }
        }
        return;
    }

    public final void zzB(int p4, java.util.List p5, boolean p6)
    {
        int v2 = 0;
        if (!(p5 instanceof com.google.android.gms.internal.measurement.zzly)) {
            if (p6 != null) {
                com.google.android.gms.internal.measurement.zzlm v6_1 = this.zza;
                v6_1.zza(p4, 2);
                int v4_1 = 0;
                int v0_5 = 0;
                while (v4_1 < p5.size()) {
                    ((Float) p5.get(v4_1)).getClass();
                    v0_5 += 4;
                    v4_1++;
                }
                v6_1.zzr(v0_5);
                while (v2 < p5.size()) {
                    v6_1.zzs(Float.floatToRawIntBits(((Float) p5.get(v2)).floatValue()));
                    v2++;
                }
                return;
            }
            while (v2 < p5.size()) {
                this.zza.zzd(p4, Float.floatToRawIntBits(((Float) p5.get(v2)).floatValue()));
                v2++;
            }
        } else {
            if (p6 != null) {
                com.google.android.gms.internal.measurement.zzlm v6_4 = this.zza;
                v6_4.zza(p4, 2);
                int v4_7 = 0;
                int v0_8 = 0;
                while (v4_7 < ((com.google.android.gms.internal.measurement.zzly) p5).size()) {
                    ((com.google.android.gms.internal.measurement.zzly) p5).zze(v4_7);
                    v0_8 += 4;
                    v4_7++;
                }
                v6_4.zzr(v0_8);
                while (v2 < ((com.google.android.gms.internal.measurement.zzly) p5).size()) {
                    v6_4.zzs(Float.floatToRawIntBits(((com.google.android.gms.internal.measurement.zzly) p5).zze(v2)));
                    v2++;
                }
                return;
            }
            while (v2 < ((com.google.android.gms.internal.measurement.zzly) p5).size()) {
                this.zza.zzd(p4, Float.floatToRawIntBits(((com.google.android.gms.internal.measurement.zzly) p5).zze(v2)));
                v2++;
            }
        }
        return;
    }

    public final void zzC(int p4, java.util.List p5, boolean p6)
    {
        int v2 = 0;
        if (!(p5 instanceof com.google.android.gms.internal.measurement.zzlo)) {
            if (p6 != null) {
                com.google.android.gms.internal.measurement.zzlm v6_1 = this.zza;
                v6_1.zza(p4, 2);
                Double v4_1 = 0;
                long v0_5 = 0;
                while (v4_1 < p5.size()) {
                    ((Double) p5.get(v4_1)).getClass();
                    v0_5 += 8;
                    v4_1++;
                }
                v6_1.zzr(v0_5);
                while (v2 < p5.size()) {
                    v6_1.zzu(Double.doubleToRawLongBits(((Double) p5.get(v2)).doubleValue()));
                    v2++;
                }
                return;
            }
            while (v2 < p5.size()) {
                this.zza.zzf(p4, Double.doubleToRawLongBits(((Double) p5.get(v2)).doubleValue()));
                v2++;
            }
        } else {
            if (p6 != null) {
                com.google.android.gms.internal.measurement.zzlm v6_4 = this.zza;
                v6_4.zza(p4, 2);
                Double v4_5 = 0;
                long v0_10 = 0;
                while (v4_5 < ((com.google.android.gms.internal.measurement.zzlo) p5).size()) {
                    ((com.google.android.gms.internal.measurement.zzlo) p5).zze(v4_5);
                    v0_10 += 8;
                    v4_5++;
                }
                v6_4.zzr(v0_10);
                while (v2 < ((com.google.android.gms.internal.measurement.zzlo) p5).size()) {
                    v6_4.zzu(Double.doubleToRawLongBits(((com.google.android.gms.internal.measurement.zzlo) p5).zze(v2)));
                    v2++;
                }
                return;
            }
            while (v2 < ((com.google.android.gms.internal.measurement.zzlo) p5).size()) {
                this.zza.zzf(p4, Double.doubleToRawLongBits(((com.google.android.gms.internal.measurement.zzlo) p5).zze(v2)));
                v2++;
            }
        }
        return;
    }

    public final void zzD(int p6, java.util.List p7, boolean p8)
    {
        int v2 = 0;
        if (!(p7 instanceof com.google.android.gms.internal.measurement.zzmg)) {
            if (p8 != null) {
                com.google.android.gms.internal.measurement.zzlm v8_1 = this.zza;
                v8_1.zza(p6, 2);
                int v6_1 = 0;
                int v0_4 = 0;
                while (v6_1 < p7.size()) {
                    v0_4 += com.google.android.gms.internal.measurement.zzlm.zzA(((long) ((Integer) p7.get(v6_1)).intValue()));
                    v6_1++;
                }
                v8_1.zzr(v0_4);
                while (v2 < p7.size()) {
                    v8_1.zzq(((Integer) p7.get(v2)).intValue());
                    v2++;
                }
                return;
            }
            while (v2 < p7.size()) {
                this.zza.zzb(p6, ((Integer) p7.get(v2)).intValue());
                v2++;
            }
        } else {
            if (p8 != null) {
                com.google.android.gms.internal.measurement.zzlm v8_4 = this.zza;
                v8_4.zza(p6, 2);
                int v6_6 = 0;
                int v0_6 = 0;
                while (v6_6 < ((com.google.android.gms.internal.measurement.zzmg) p7).size()) {
                    v0_6 += com.google.android.gms.internal.measurement.zzlm.zzA(((long) ((com.google.android.gms.internal.measurement.zzmg) p7).zzf(v6_6)));
                    v6_6++;
                }
                v8_4.zzr(v0_6);
                while (v2 < ((com.google.android.gms.internal.measurement.zzmg) p7).size()) {
                    v8_4.zzq(((com.google.android.gms.internal.measurement.zzmg) p7).zzf(v2));
                    v2++;
                }
                return;
            }
            while (v2 < ((com.google.android.gms.internal.measurement.zzmg) p7).size()) {
                this.zza.zzb(p6, ((com.google.android.gms.internal.measurement.zzmg) p7).zzf(v2));
                v2++;
            }
        }
        return;
    }

    public final void zzE(int p4, java.util.List p5, boolean p6)
    {
        int v2 = 0;
        if (!(p5 instanceof com.google.android.gms.internal.measurement.zzky)) {
            if (p6 != null) {
                com.google.android.gms.internal.measurement.zzlm v6_1 = this.zza;
                v6_1.zza(p4, 2);
                boolean v4_1 = 0;
                int v0_4 = 0;
                while (v4_1 < p5.size()) {
                    ((Boolean) p5.get(v4_1)).getClass();
                    v0_4++;
                    v4_1++;
                }
                v6_1.zzr(v0_4);
                while (v2 < p5.size()) {
                    v6_1.zzp(((Boolean) p5.get(v2)).booleanValue());
                    v2++;
                }
                return;
            }
            while (v2 < p5.size()) {
                this.zza.zzg(p4, ((Boolean) p5.get(v2)).booleanValue());
                v2++;
            }
        } else {
            if (p6 != null) {
                com.google.android.gms.internal.measurement.zzlm v6_4 = this.zza;
                v6_4.zza(p4, 2);
                boolean v4_6 = 0;
                int v0_6 = 0;
                while (v4_6 < ((com.google.android.gms.internal.measurement.zzky) p5).size()) {
                    ((com.google.android.gms.internal.measurement.zzky) p5).zze(v4_6);
                    v0_6++;
                    v4_6++;
                }
                v6_4.zzr(v0_6);
                while (v2 < ((com.google.android.gms.internal.measurement.zzky) p5).size()) {
                    v6_4.zzp(((com.google.android.gms.internal.measurement.zzky) p5).zze(v2));
                    v2++;
                }
                return;
            }
            while (v2 < ((com.google.android.gms.internal.measurement.zzky) p5).size()) {
                this.zza.zzg(p4, ((com.google.android.gms.internal.measurement.zzky) p5).zze(v2));
                v2++;
            }
        }
        return;
    }

    public final void zzF(int p5, java.util.List p6)
    {
        int v1 = 0;
        if (!(p6 instanceof com.google.android.gms.internal.measurement.zzmx)) {
            while (v1 < p6.size()) {
                this.zza.zzh(p5, ((String) p6.get(v1)));
                v1++;
            }
        } else {
            while (v1 < p6.size()) {
                com.google.android.gms.internal.measurement.zzlh v2_1 = ((com.google.android.gms.internal.measurement.zzmx) p6).zzc();
                if (!(v2_1 instanceof String)) {
                    this.zza.zzi(p5, ((com.google.android.gms.internal.measurement.zzlh) v2_1));
                } else {
                    this.zza.zzh(p5, ((String) v2_1));
                }
                v1++;
            }
        }
        return;
    }

    public final void zzG(int p4, java.util.List p5)
    {
        int v0 = 0;
        while (v0 < p5.size()) {
            this.zza.zzi(p4, ((com.google.android.gms.internal.measurement.zzlh) p5.get(v0)));
            v0++;
        }
        return;
    }

    public final void zzH(int p4, java.util.List p5, boolean p6)
    {
        int v2 = 0;
        if (!(p5 instanceof com.google.android.gms.internal.measurement.zzmg)) {
            if (p6 != null) {
                com.google.android.gms.internal.measurement.zzlm v6_1 = this.zza;
                v6_1.zza(p4, 2);
                int v4_1 = 0;
                int v0_4 = 0;
                while (v4_1 < p5.size()) {
                    v0_4 += com.google.android.gms.internal.measurement.zzlm.zzz(((Integer) p5.get(v4_1)).intValue());
                    v4_1++;
                }
                v6_1.zzr(v0_4);
                while (v2 < p5.size()) {
                    v6_1.zzr(((Integer) p5.get(v2)).intValue());
                    v2++;
                }
                return;
            }
            while (v2 < p5.size()) {
                this.zza.zzc(p4, ((Integer) p5.get(v2)).intValue());
                v2++;
            }
        } else {
            if (p6 != null) {
                com.google.android.gms.internal.measurement.zzlm v6_4 = this.zza;
                v6_4.zza(p4, 2);
                int v4_6 = 0;
                int v0_6 = 0;
                while (v4_6 < ((com.google.android.gms.internal.measurement.zzmg) p5).size()) {
                    v0_6 += com.google.android.gms.internal.measurement.zzlm.zzz(((com.google.android.gms.internal.measurement.zzmg) p5).zzf(v4_6));
                    v4_6++;
                }
                v6_4.zzr(v0_6);
                while (v2 < ((com.google.android.gms.internal.measurement.zzmg) p5).size()) {
                    v6_4.zzr(((com.google.android.gms.internal.measurement.zzmg) p5).zzf(v2));
                    v2++;
                }
                return;
            }
            while (v2 < ((com.google.android.gms.internal.measurement.zzmg) p5).size()) {
                this.zza.zzc(p4, ((com.google.android.gms.internal.measurement.zzmg) p5).zzf(v2));
                v2++;
            }
        }
        return;
    }

    public final void zzI(int p4, java.util.List p5, boolean p6)
    {
        int v2 = 0;
        if (!(p5 instanceof com.google.android.gms.internal.measurement.zzmg)) {
            if (p6 != null) {
                com.google.android.gms.internal.measurement.zzlm v6_1 = this.zza;
                v6_1.zza(p4, 2);
                int v4_1 = 0;
                int v0_4 = 0;
                while (v4_1 < p5.size()) {
                    ((Integer) p5.get(v4_1)).getClass();
                    v0_4 += 4;
                    v4_1++;
                }
                v6_1.zzr(v0_4);
                while (v2 < p5.size()) {
                    v6_1.zzs(((Integer) p5.get(v2)).intValue());
                    v2++;
                }
                return;
            }
            while (v2 < p5.size()) {
                this.zza.zzd(p4, ((Integer) p5.get(v2)).intValue());
                v2++;
            }
        } else {
            if (p6 != null) {
                com.google.android.gms.internal.measurement.zzlm v6_4 = this.zza;
                v6_4.zza(p4, 2);
                int v4_6 = 0;
                int v0_6 = 0;
                while (v4_6 < ((com.google.android.gms.internal.measurement.zzmg) p5).size()) {
                    ((com.google.android.gms.internal.measurement.zzmg) p5).zzf(v4_6);
                    v0_6 += 4;
                    v4_6++;
                }
                v6_4.zzr(v0_6);
                while (v2 < ((com.google.android.gms.internal.measurement.zzmg) p5).size()) {
                    v6_4.zzs(((com.google.android.gms.internal.measurement.zzmg) p5).zzf(v2));
                    v2++;
                }
                return;
            }
            while (v2 < ((com.google.android.gms.internal.measurement.zzmg) p5).size()) {
                this.zza.zzd(p4, ((com.google.android.gms.internal.measurement.zzmg) p5).zzf(v2));
                v2++;
            }
        }
        return;
    }

    public final void zzJ(int p4, java.util.List p5, boolean p6)
    {
        int v2 = 0;
        if (!(p5 instanceof com.google.android.gms.internal.measurement.zzna)) {
            if (p6 != null) {
                com.google.android.gms.internal.measurement.zzlm v6_1 = this.zza;
                v6_1.zza(p4, 2);
                Long v4_1 = 0;
                long v0_4 = 0;
                while (v4_1 < p5.size()) {
                    ((Long) p5.get(v4_1)).getClass();
                    v0_4 += 8;
                    v4_1++;
                }
                v6_1.zzr(v0_4);
                while (v2 < p5.size()) {
                    v6_1.zzu(((Long) p5.get(v2)).longValue());
                    v2++;
                }
                return;
            }
            while (v2 < p5.size()) {
                this.zza.zzf(p4, ((Long) p5.get(v2)).longValue());
                v2++;
            }
        } else {
            if (p6 != null) {
                com.google.android.gms.internal.measurement.zzlm v6_4 = this.zza;
                v6_4.zza(p4, 2);
                Long v4_5 = 0;
                long v0_7 = 0;
                while (v4_5 < ((com.google.android.gms.internal.measurement.zzna) p5).size()) {
                    ((com.google.android.gms.internal.measurement.zzna) p5).zzc(v4_5);
                    v0_7 += 8;
                    v4_5++;
                }
                v6_4.zzr(v0_7);
                while (v2 < ((com.google.android.gms.internal.measurement.zzna) p5).size()) {
                    v6_4.zzu(((com.google.android.gms.internal.measurement.zzna) p5).zzc(v2));
                    v2++;
                }
                return;
            }
            while (v2 < ((com.google.android.gms.internal.measurement.zzna) p5).size()) {
                this.zza.zzf(p4, ((com.google.android.gms.internal.measurement.zzna) p5).zzc(v2));
                v2++;
            }
        }
        return;
    }

    public final void zzK(int p5, java.util.List p6, boolean p7)
    {
        int v2 = 0;
        if (!(p6 instanceof com.google.android.gms.internal.measurement.zzmg)) {
            if (p7 != null) {
                com.google.android.gms.internal.measurement.zzlm v7_1 = this.zza;
                v7_1.zza(p5, 2);
                int v5_1 = 0;
                int v0_6 = 0;
                while (v5_1 < p6.size()) {
                    int v1_5 = ((Integer) p6.get(v5_1)).intValue();
                    v0_6 += com.google.android.gms.internal.measurement.zzlm.zzz(((v1_5 >> 31) ^ (v1_5 + v1_5)));
                    v5_1++;
                }
                v7_1.zzr(v0_6);
                while (v2 < p6.size()) {
                    int v5_5 = ((Integer) p6.get(v2)).intValue();
                    v7_1.zzr(((v5_5 >> 31) ^ (v5_5 + v5_5)));
                    v2++;
                }
                return;
            }
            while (v2 < p6.size()) {
                com.google.android.gms.internal.measurement.zzlm v7_6 = this.zza;
                int v0_3 = ((Integer) p6.get(v2)).intValue();
                v7_6.zzc(p5, ((v0_3 >> 31) ^ (v0_3 + v0_3)));
                v2++;
            }
        } else {
            if (p7 != null) {
                com.google.android.gms.internal.measurement.zzlm v7_5 = this.zza;
                v7_5.zza(p5, 2);
                int v5_8 = 0;
                int v0_11 = 0;
                while (v5_8 < ((com.google.android.gms.internal.measurement.zzmg) p6).size()) {
                    int v1_11 = ((com.google.android.gms.internal.measurement.zzmg) p6).zzf(v5_8);
                    v0_11 += com.google.android.gms.internal.measurement.zzlm.zzz(((v1_11 >> 31) ^ (v1_11 + v1_11)));
                    v5_8++;
                }
                v7_5.zzr(v0_11);
                while (v2 < ((com.google.android.gms.internal.measurement.zzmg) p6).size()) {
                    int v5_10 = ((com.google.android.gms.internal.measurement.zzmg) p6).zzf(v2);
                    v7_5.zzr(((v5_10 >> 31) ^ (v5_10 + v5_10)));
                    v2++;
                }
                return;
            }
            while (v2 < ((com.google.android.gms.internal.measurement.zzmg) p6).size()) {
                com.google.android.gms.internal.measurement.zzlm v7_3 = this.zza;
                int v0_8 = ((com.google.android.gms.internal.measurement.zzmg) p6).zzf(v2);
                v7_3.zzc(p5, ((v0_8 >> 31) ^ (v0_8 + v0_8)));
                v2++;
            }
        }
        return;
    }

    public final void zzL(int p9, java.util.List p10, boolean p11)
    {
        int v3 = 0;
        if (!(p10 instanceof com.google.android.gms.internal.measurement.zzna)) {
            if (p11 != null) {
                com.google.android.gms.internal.measurement.zzlm v11_1 = this.zza;
                v11_1.zza(p9, 2);
                Long v9_1 = 0;
                long v0_6 = 0;
                while (v9_1 < p10.size()) {
                    long v4_2 = ((Long) p10.get(v9_1)).longValue();
                    v0_6 += com.google.android.gms.internal.measurement.zzlm.zzA(((v4_2 >> 63) ^ (v4_2 + v4_2)));
                    v9_1++;
                }
                v11_1.zzr(v0_6);
                while (v3 < p10.size()) {
                    long v0_7 = ((Long) p10.get(v3)).longValue();
                    v11_1.zzt(((v0_7 >> 63) ^ (v0_7 + v0_7)));
                    v3++;
                }
                return;
            }
            while (v3 < p10.size()) {
                com.google.android.gms.internal.measurement.zzlm v11_6 = this.zza;
                long v0_3 = ((Long) p10.get(v3)).longValue();
                v11_6.zze(p9, ((v0_3 >> 63) ^ (v0_3 + v0_3)));
                v3++;
            }
        } else {
            if (p11 != null) {
                com.google.android.gms.internal.measurement.zzlm v11_4 = this.zza;
                v11_4.zza(p9, 2);
                Long v9_5 = 0;
                long v0_13 = 0;
                while (v9_5 < ((com.google.android.gms.internal.measurement.zzna) p10).size()) {
                    long v4_7 = ((com.google.android.gms.internal.measurement.zzna) p10).zzc(v9_5);
                    v0_13 += com.google.android.gms.internal.measurement.zzlm.zzA(((v4_7 >> 63) ^ (v4_7 + v4_7)));
                    v9_5++;
                }
                v11_4.zzr(v0_13);
                while (v3 < ((com.google.android.gms.internal.measurement.zzna) p10).size()) {
                    long v0_14 = ((com.google.android.gms.internal.measurement.zzna) p10).zzc(v3);
                    v11_4.zzt(((v0_14 >> 63) ^ (v0_14 + v0_14)));
                    v3++;
                }
                return;
            }
            while (v3 < ((com.google.android.gms.internal.measurement.zzna) p10).size()) {
                com.google.android.gms.internal.measurement.zzlm v11_3 = this.zza;
                long v0_10 = ((com.google.android.gms.internal.measurement.zzna) p10).zzc(v3);
                v11_3.zze(p9, ((v0_10 >> 63) ^ (v0_10 + v0_10)));
                v3++;
            }
        }
        return;
    }

    public final void zzM(int p5, com.google.android.gms.internal.measurement.zzne p6, java.util.Map p7)
    {
        java.util.Iterator v7_2 = p7.entrySet().iterator();
        while (v7_2.hasNext()) {
            Object v0_0 = ((java.util.Map$Entry) v7_2.next());
            com.google.android.gms.internal.measurement.zzlm v1 = this.zza;
            v1.zza(p5, 2);
            v1.zzr(com.google.android.gms.internal.measurement.zznf.zzc(p6, v0_0.getKey(), v0_0.getValue()));
            com.google.android.gms.internal.measurement.zznf.zzb(v1, p6, v0_0.getKey(), v0_0.getValue());
        }
        return;
    }

    public final void zzb(int p2, int p3)
    {
        this.zza.zzd(p2, p3);
        return;
    }

    public final void zzc(int p2, long p3)
    {
        this.zza.zze(p2, p3);
        return;
    }

    public final void zzd(int p2, long p3)
    {
        this.zza.zzf(p2, p3);
        return;
    }

    public final void zze(int p2, float p3)
    {
        this.zza.zzd(p2, Float.floatToRawIntBits(p3));
        return;
    }

    public final void zzf(int p2, double p3)
    {
        this.zza.zzf(p2, Double.doubleToRawLongBits(p3));
        return;
    }

    public final void zzg(int p2, int p3)
    {
        this.zza.zzb(p2, p3);
        return;
    }

    public final void zzh(int p2, long p3)
    {
        this.zza.zze(p2, p3);
        return;
    }

    public final void zzi(int p2, int p3)
    {
        this.zza.zzb(p2, p3);
        return;
    }

    public final void zzj(int p2, long p3)
    {
        this.zza.zzf(p2, p3);
        return;
    }

    public final void zzk(int p2, int p3)
    {
        this.zza.zzd(p2, p3);
        return;
    }

    public final void zzl(int p2, boolean p3)
    {
        this.zza.zzg(p2, p3);
        return;
    }

    public final void zzm(int p2, String p3)
    {
        this.zza.zzh(p2, p3);
        return;
    }

    public final void zzn(int p2, com.google.android.gms.internal.measurement.zzlh p3)
    {
        this.zza.zzi(p2, p3);
        return;
    }

    public final void zzo(int p2, int p3)
    {
        this.zza.zzc(p2, p3);
        return;
    }

    public final void zzp(int p2, int p3)
    {
        this.zza.zzc(p2, ((p3 >> 31) ^ (p3 + p3)));
        return;
    }

    public final void zzq(int p4, long p5)
    {
        this.zza.zze(p4, ((p5 >> 63) ^ (p5 + p5)));
        return;
    }

    public final void zzr(int p2, Object p3, com.google.android.gms.internal.measurement.zznx p4)
    {
        this.zza.zzl(p2, ((com.google.android.gms.internal.measurement.zznm) p3), p4);
        return;
    }

    public final void zzs(int p3, Object p4, com.google.android.gms.internal.measurement.zznx p5)
    {
        com.google.android.gms.internal.measurement.zzlm v0 = this.zza;
        v0.zza(p3, 3);
        p5.zzf(((com.google.android.gms.internal.measurement.zznm) p4), v0.zza);
        v0.zza(p3, 4);
        return;
    }

    public final void zzt(int p3)
    {
        this.zza.zza(p3, 3);
        return;
    }

    public final void zzu(int p3)
    {
        this.zza.zza(p3, 4);
        return;
    }

    public final void zzv(int p2, Object p3)
    {
        if (!(p3 instanceof com.google.android.gms.internal.measurement.zzlh)) {
            this.zza.zzm(p2, ((com.google.android.gms.internal.measurement.zznm) p3));
            return;
        } else {
            this.zza.zzn(p2, ((com.google.android.gms.internal.measurement.zzlh) p3));
            return;
        }
    }

    public final void zzw(int p6, java.util.List p7, boolean p8)
    {
        int v2 = 0;
        if (!(p7 instanceof com.google.android.gms.internal.measurement.zzmg)) {
            if (p8 != null) {
                com.google.android.gms.internal.measurement.zzlm v8_1 = this.zza;
                v8_1.zza(p6, 2);
                int v6_1 = 0;
                int v0_4 = 0;
                while (v6_1 < p7.size()) {
                    v0_4 += com.google.android.gms.internal.measurement.zzlm.zzA(((long) ((Integer) p7.get(v6_1)).intValue()));
                    v6_1++;
                }
                v8_1.zzr(v0_4);
                while (v2 < p7.size()) {
                    v8_1.zzq(((Integer) p7.get(v2)).intValue());
                    v2++;
                }
                return;
            }
            while (v2 < p7.size()) {
                this.zza.zzb(p6, ((Integer) p7.get(v2)).intValue());
                v2++;
            }
        } else {
            if (p8 != null) {
                com.google.android.gms.internal.measurement.zzlm v8_4 = this.zza;
                v8_4.zza(p6, 2);
                int v6_6 = 0;
                int v0_6 = 0;
                while (v6_6 < ((com.google.android.gms.internal.measurement.zzmg) p7).size()) {
                    v0_6 += com.google.android.gms.internal.measurement.zzlm.zzA(((long) ((com.google.android.gms.internal.measurement.zzmg) p7).zzf(v6_6)));
                    v6_6++;
                }
                v8_4.zzr(v0_6);
                while (v2 < ((com.google.android.gms.internal.measurement.zzmg) p7).size()) {
                    v8_4.zzq(((com.google.android.gms.internal.measurement.zzmg) p7).zzf(v2));
                    v2++;
                }
                return;
            }
            while (v2 < ((com.google.android.gms.internal.measurement.zzmg) p7).size()) {
                this.zza.zzb(p6, ((com.google.android.gms.internal.measurement.zzmg) p7).zzf(v2));
                v2++;
            }
        }
        return;
    }

    public final void zzx(int p4, java.util.List p5, boolean p6)
    {
        int v2 = 0;
        if (!(p5 instanceof com.google.android.gms.internal.measurement.zzmg)) {
            if (p6 != null) {
                com.google.android.gms.internal.measurement.zzlm v6_1 = this.zza;
                v6_1.zza(p4, 2);
                int v4_1 = 0;
                int v0_4 = 0;
                while (v4_1 < p5.size()) {
                    ((Integer) p5.get(v4_1)).getClass();
                    v0_4 += 4;
                    v4_1++;
                }
                v6_1.zzr(v0_4);
                while (v2 < p5.size()) {
                    v6_1.zzs(((Integer) p5.get(v2)).intValue());
                    v2++;
                }
                return;
            }
            while (v2 < p5.size()) {
                this.zza.zzd(p4, ((Integer) p5.get(v2)).intValue());
                v2++;
            }
        } else {
            if (p6 != null) {
                com.google.android.gms.internal.measurement.zzlm v6_4 = this.zza;
                v6_4.zza(p4, 2);
                int v4_6 = 0;
                int v0_6 = 0;
                while (v4_6 < ((com.google.android.gms.internal.measurement.zzmg) p5).size()) {
                    ((com.google.android.gms.internal.measurement.zzmg) p5).zzf(v4_6);
                    v0_6 += 4;
                    v4_6++;
                }
                v6_4.zzr(v0_6);
                while (v2 < ((com.google.android.gms.internal.measurement.zzmg) p5).size()) {
                    v6_4.zzs(((com.google.android.gms.internal.measurement.zzmg) p5).zzf(v2));
                    v2++;
                }
                return;
            }
            while (v2 < ((com.google.android.gms.internal.measurement.zzmg) p5).size()) {
                this.zza.zzd(p4, ((com.google.android.gms.internal.measurement.zzmg) p5).zzf(v2));
                v2++;
            }
        }
        return;
    }

    public final void zzy(int p6, java.util.List p7, boolean p8)
    {
        int v2 = 0;
        if (!(p7 instanceof com.google.android.gms.internal.measurement.zzna)) {
            if (p8 != null) {
                com.google.android.gms.internal.measurement.zzlm v8_1 = this.zza;
                v8_1.zza(p6, 2);
                Long v6_1 = 0;
                long v0_4 = 0;
                while (v6_1 < p7.size()) {
                    v0_4 += com.google.android.gms.internal.measurement.zzlm.zzA(((Long) p7.get(v6_1)).longValue());
                    v6_1++;
                }
                v8_1.zzr(v0_4);
                while (v2 < p7.size()) {
                    v8_1.zzt(((Long) p7.get(v2)).longValue());
                    v2++;
                }
                return;
            }
            while (v2 < p7.size()) {
                this.zza.zze(p6, ((Long) p7.get(v2)).longValue());
                v2++;
            }
        } else {
            if (p8 != null) {
                com.google.android.gms.internal.measurement.zzlm v8_4 = this.zza;
                v8_4.zza(p6, 2);
                Long v6_5 = 0;
                long v0_7 = 0;
                while (v6_5 < ((com.google.android.gms.internal.measurement.zzna) p7).size()) {
                    v0_7 += com.google.android.gms.internal.measurement.zzlm.zzA(((com.google.android.gms.internal.measurement.zzna) p7).zzc(v6_5));
                    v6_5++;
                }
                v8_4.zzr(v0_7);
                while (v2 < ((com.google.android.gms.internal.measurement.zzna) p7).size()) {
                    v8_4.zzt(((com.google.android.gms.internal.measurement.zzna) p7).zzc(v2));
                    v2++;
                }
                return;
            }
            while (v2 < ((com.google.android.gms.internal.measurement.zzna) p7).size()) {
                this.zza.zze(p6, ((com.google.android.gms.internal.measurement.zzna) p7).zzc(v2));
                v2++;
            }
        }
        return;
    }

    public final void zzz(int p6, java.util.List p7, boolean p8)
    {
        int v2 = 0;
        if (!(p7 instanceof com.google.android.gms.internal.measurement.zzna)) {
            if (p8 != null) {
                com.google.android.gms.internal.measurement.zzlm v8_1 = this.zza;
                v8_1.zza(p6, 2);
                Long v6_1 = 0;
                long v0_4 = 0;
                while (v6_1 < p7.size()) {
                    v0_4 += com.google.android.gms.internal.measurement.zzlm.zzA(((Long) p7.get(v6_1)).longValue());
                    v6_1++;
                }
                v8_1.zzr(v0_4);
                while (v2 < p7.size()) {
                    v8_1.zzt(((Long) p7.get(v2)).longValue());
                    v2++;
                }
                return;
            }
            while (v2 < p7.size()) {
                this.zza.zze(p6, ((Long) p7.get(v2)).longValue());
                v2++;
            }
        } else {
            if (p8 != null) {
                com.google.android.gms.internal.measurement.zzlm v8_4 = this.zza;
                v8_4.zza(p6, 2);
                Long v6_5 = 0;
                long v0_7 = 0;
                while (v6_5 < ((com.google.android.gms.internal.measurement.zzna) p7).size()) {
                    v0_7 += com.google.android.gms.internal.measurement.zzlm.zzA(((com.google.android.gms.internal.measurement.zzna) p7).zzc(v6_5));
                    v6_5++;
                }
                v8_4.zzr(v0_7);
                while (v2 < ((com.google.android.gms.internal.measurement.zzna) p7).size()) {
                    v8_4.zzt(((com.google.android.gms.internal.measurement.zzna) p7).zzc(v2));
                    v2++;
                }
                return;
            }
            while (v2 < ((com.google.android.gms.internal.measurement.zzna) p7).size()) {
                this.zza.zze(p6, ((com.google.android.gms.internal.measurement.zzna) p7).zzc(v2));
                v2++;
            }
        }
        return;
    }
}
