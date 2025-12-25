package com.google.android.recaptcha.internal;
final class zzlo implements com.google.android.recaptcha.internal.zzpy {
    private final com.google.android.recaptcha.internal.zzln zza;

    private zzlo(com.google.android.recaptcha.internal.zzln p2)
    {
        this.zza = p2;
        p2.zza = this;
        return;
    }

    public static com.google.android.recaptcha.internal.zzlo zza(com.google.android.recaptcha.internal.zzln p1)
    {
        com.google.android.recaptcha.internal.zzlo v0_0 = p1.zza;
        if (v0_0 == null) {
            return new com.google.android.recaptcha.internal.zzlo(p1);
        } else {
            return v0_0;
        }
    }

    public final void zzA(int p4, java.util.List p5, boolean p6)
    {
        int v2 = 0;
        if (!(p5 instanceof com.google.android.recaptcha.internal.zznx)) {
            if (p6 != null) {
                this.zza.zzr(p4, 2);
                com.google.android.recaptcha.internal.zzln v4_1 = 0;
                Long v6_2 = 0;
                while (v4_1 < p5.size()) {
                    ((Long) p5.get(v4_1)).getClass();
                    v6_2 += 8;
                    v4_1++;
                }
                this.zza.zzt(v6_2);
                while (v2 < p5.size()) {
                    this.zza.zzi(((Long) p5.get(v2)).longValue());
                    v2++;
                }
                return;
            }
            while (v2 < p5.size()) {
                this.zza.zzh(p4, ((Long) p5.get(v2)).longValue());
                v2++;
            }
        } else {
            if (p6 != null) {
                this.zza.zzr(p4, 2);
                com.google.android.recaptcha.internal.zzln v4_5 = 0;
                Long v6_8 = 0;
                while (v4_5 < ((com.google.android.recaptcha.internal.zznx) p5).size()) {
                    ((com.google.android.recaptcha.internal.zznx) p5).zze(v4_5);
                    v6_8 += 8;
                    v4_5++;
                }
                this.zza.zzt(v6_8);
                while (v2 < ((com.google.android.recaptcha.internal.zznx) p5).size()) {
                    this.zza.zzi(((com.google.android.recaptcha.internal.zznx) p5).zze(v2));
                    v2++;
                }
                return;
            }
            while (v2 < ((com.google.android.recaptcha.internal.zznx) p5).size()) {
                this.zza.zzh(p4, ((com.google.android.recaptcha.internal.zznx) p5).zze(v2));
                v2++;
            }
        }
        return;
    }

    public final void zzB(int p2, int p3)
    {
        this.zza.zzs(p2, ((p3 >> 31) ^ (p3 + p3)));
        return;
    }

    public final void zzC(int p4, java.util.List p5, boolean p6)
    {
        int v2 = 0;
        if (!(p5 instanceof com.google.android.recaptcha.internal.zzne)) {
            if (p6 != 0) {
                this.zza.zzr(p4, 2);
                com.google.android.recaptcha.internal.zzln v4_1 = 0;
                int v6_2 = 0;
                while (v4_1 < p5.size()) {
                    int v0_10 = ((Integer) p5.get(v4_1)).intValue();
                    v6_2 += com.google.android.recaptcha.internal.zzln.zzA(((v0_10 >> 31) ^ (v0_10 + v0_10)));
                    v4_1++;
                }
                this.zza.zzt(v6_2);
                while (v2 < p5.size()) {
                    com.google.android.recaptcha.internal.zzln v4_4 = this.zza;
                    int v6_5 = ((Integer) p5.get(v2)).intValue();
                    v4_4.zzt(((v6_5 >> 31) ^ (v6_5 + v6_5)));
                    v2++;
                }
                return;
            }
            while (v2 < p5.size()) {
                int v6_13 = this.zza;
                int v0_3 = ((Integer) p5.get(v2)).intValue();
                v6_13.zzs(p4, ((v0_3 >> 31) ^ (v0_3 + v0_3)));
                v2++;
            }
        } else {
            if (p6 != 0) {
                this.zza.zzr(p4, 2);
                com.google.android.recaptcha.internal.zzln v4_5 = 0;
                int v6_12 = 0;
                while (v4_5 < ((com.google.android.recaptcha.internal.zzne) p5).size()) {
                    int v0_19 = ((com.google.android.recaptcha.internal.zzne) p5).zze(v4_5);
                    v6_12 += com.google.android.recaptcha.internal.zzln.zzA(((v0_19 >> 31) ^ (v0_19 + v0_19)));
                    v4_5++;
                }
                this.zza.zzt(v6_12);
                while (v2 < ((com.google.android.recaptcha.internal.zzne) p5).size()) {
                    com.google.android.recaptcha.internal.zzln v4_8 = this.zza;
                    int v6_14 = ((com.google.android.recaptcha.internal.zzne) p5).zze(v2);
                    v4_8.zzt(((v6_14 >> 31) ^ (v6_14 + v6_14)));
                    v2++;
                }
                return;
            }
            while (v2 < ((com.google.android.recaptcha.internal.zzne) p5).size()) {
                int v6_9 = this.zza;
                int v0_14 = ((com.google.android.recaptcha.internal.zzne) p5).zze(v2);
                v6_9.zzs(p4, ((v0_14 >> 31) ^ (v0_14 + v0_14)));
                v2++;
            }
        }
        return;
    }

    public final void zzD(int p4, long p5)
    {
        this.zza.zzu(p4, ((p5 >> 63) ^ (p5 + p5)));
        return;
    }

    public final void zzE(int p7, java.util.List p8, boolean p9)
    {
        int v3 = 0;
        if (!(p8 instanceof com.google.android.recaptcha.internal.zznx)) {
            if (p9 != null) {
                this.zza.zzr(p7, 2);
                com.google.android.recaptcha.internal.zzln v7_1 = 0;
                Long v9_2 = 0;
                while (v7_1 < p8.size()) {
                    long v0_12 = ((Long) p8.get(v7_1)).longValue();
                    v9_2 += com.google.android.recaptcha.internal.zzln.zzB(((v0_12 >> 63) ^ (v0_12 + v0_12)));
                    v7_1++;
                }
                this.zza.zzt(v9_2);
                while (v3 < p8.size()) {
                    com.google.android.recaptcha.internal.zzln v7_4 = this.zza;
                    long v0_7 = ((Long) p8.get(v3)).longValue();
                    v7_4.zzv(((v0_7 >> 63) ^ (v0_7 + v0_7)));
                    v3++;
                }
                return;
            }
            while (v3 < p8.size()) {
                Long v9_10 = this.zza;
                long v0_3 = ((Long) p8.get(v3)).longValue();
                v9_10.zzu(p7, ((v0_3 >> 63) ^ (v0_3 + v0_3)));
                v3++;
            }
        } else {
            if (p9 != null) {
                this.zza.zzr(p7, 2);
                com.google.android.recaptcha.internal.zzln v7_5 = 0;
                Long v9_9 = 0;
                while (v7_5 < ((com.google.android.recaptcha.internal.zznx) p8).size()) {
                    long v0_23 = ((com.google.android.recaptcha.internal.zznx) p8).zze(v7_5);
                    v9_9 += com.google.android.recaptcha.internal.zzln.zzB(((v0_23 >> 63) ^ (v0_23 + v0_23)));
                    v7_5++;
                }
                this.zza.zzt(v9_9);
                while (v3 < ((com.google.android.recaptcha.internal.zznx) p8).size()) {
                    com.google.android.recaptcha.internal.zzln v7_8 = this.zza;
                    long v0_20 = ((com.google.android.recaptcha.internal.zznx) p8).zze(v3);
                    v7_8.zzv(((v0_20 >> 63) ^ (v0_20 + v0_20)));
                    v3++;
                }
                return;
            }
            while (v3 < ((com.google.android.recaptcha.internal.zznx) p8).size()) {
                Long v9_6 = this.zza;
                long v0_16 = ((com.google.android.recaptcha.internal.zznx) p8).zze(v3);
                v9_6.zzu(p7, ((v0_16 >> 63) ^ (v0_16 + v0_16)));
                v3++;
            }
        }
        return;
    }

    public final void zzF(int p3)
    {
        this.zza.zzr(p3, 3);
        return;
    }

    public final void zzG(int p2, String p3)
    {
        this.zza.zzp(p2, p3);
        return;
    }

    public final void zzH(int p5, java.util.List p6)
    {
        int v1 = 0;
        if (!(p6 instanceof com.google.android.recaptcha.internal.zznu)) {
            while (v1 < p6.size()) {
                this.zza.zzp(p5, ((String) p6.get(v1)));
                v1++;
            }
        } else {
            while (v1 < p6.size()) {
                com.google.android.recaptcha.internal.zzle v2_1 = ((com.google.android.recaptcha.internal.zznu) p6).zzc();
                if (!(v2_1 instanceof String)) {
                    this.zza.zze(p5, ((com.google.android.recaptcha.internal.zzle) v2_1));
                } else {
                    this.zza.zzp(p5, ((String) v2_1));
                }
                v1++;
            }
        }
        return;
    }

    public final void zzI(int p2, int p3)
    {
        this.zza.zzs(p2, p3);
        return;
    }

    public final void zzJ(int p4, java.util.List p5, boolean p6)
    {
        int v2 = 0;
        if (!(p5 instanceof com.google.android.recaptcha.internal.zzne)) {
            if (p6 != 0) {
                this.zza.zzr(p4, 2);
                com.google.android.recaptcha.internal.zzln v4_1 = 0;
                int v6_2 = 0;
                while (v4_1 < p5.size()) {
                    v6_2 += com.google.android.recaptcha.internal.zzln.zzA(((Integer) p5.get(v4_1)).intValue());
                    v4_1++;
                }
                this.zza.zzt(v6_2);
                while (v2 < p5.size()) {
                    this.zza.zzt(((Integer) p5.get(v2)).intValue());
                    v2++;
                }
                return;
            }
            while (v2 < p5.size()) {
                this.zza.zzs(p4, ((Integer) p5.get(v2)).intValue());
                v2++;
            }
        } else {
            if (p6 != 0) {
                this.zza.zzr(p4, 2);
                com.google.android.recaptcha.internal.zzln v4_5 = 0;
                int v6_9 = 0;
                while (v4_5 < ((com.google.android.recaptcha.internal.zzne) p5).size()) {
                    v6_9 += com.google.android.recaptcha.internal.zzln.zzA(((com.google.android.recaptcha.internal.zzne) p5).zze(v4_5));
                    v4_5++;
                }
                this.zza.zzt(v6_9);
                while (v2 < ((com.google.android.recaptcha.internal.zzne) p5).size()) {
                    this.zza.zzt(((com.google.android.recaptcha.internal.zzne) p5).zze(v2));
                    v2++;
                }
                return;
            }
            while (v2 < ((com.google.android.recaptcha.internal.zzne) p5).size()) {
                this.zza.zzs(p4, ((com.google.android.recaptcha.internal.zzne) p5).zze(v2));
                v2++;
            }
        }
        return;
    }

    public final void zzK(int p2, long p3)
    {
        this.zza.zzu(p2, p3);
        return;
    }

    public final void zzL(int p4, java.util.List p5, boolean p6)
    {
        int v2 = 0;
        if (!(p5 instanceof com.google.android.recaptcha.internal.zznx)) {
            if (p6 != null) {
                this.zza.zzr(p4, 2);
                com.google.android.recaptcha.internal.zzln v4_1 = 0;
                Long v6_2 = 0;
                while (v4_1 < p5.size()) {
                    v6_2 += com.google.android.recaptcha.internal.zzln.zzB(((Long) p5.get(v4_1)).longValue());
                    v4_1++;
                }
                this.zza.zzt(v6_2);
                while (v2 < p5.size()) {
                    this.zza.zzv(((Long) p5.get(v2)).longValue());
                    v2++;
                }
                return;
            }
            while (v2 < p5.size()) {
                this.zza.zzu(p4, ((Long) p5.get(v2)).longValue());
                v2++;
            }
        } else {
            if (p6 != null) {
                this.zza.zzr(p4, 2);
                com.google.android.recaptcha.internal.zzln v4_5 = 0;
                Long v6_8 = 0;
                while (v4_5 < ((com.google.android.recaptcha.internal.zznx) p5).size()) {
                    v6_8 += com.google.android.recaptcha.internal.zzln.zzB(((com.google.android.recaptcha.internal.zznx) p5).zze(v4_5));
                    v4_5++;
                }
                this.zza.zzt(v6_8);
                while (v2 < ((com.google.android.recaptcha.internal.zznx) p5).size()) {
                    this.zza.zzv(((com.google.android.recaptcha.internal.zznx) p5).zze(v2));
                    v2++;
                }
                return;
            }
            while (v2 < ((com.google.android.recaptcha.internal.zznx) p5).size()) {
                this.zza.zzu(p4, ((com.google.android.recaptcha.internal.zznx) p5).zze(v2));
                v2++;
            }
        }
        return;
    }

    public final void zzb(int p2, boolean p3)
    {
        this.zza.zzd(p2, p3);
        return;
    }

    public final void zzc(int p4, java.util.List p5, boolean p6)
    {
        int v2 = 0;
        if (!(p5 instanceof com.google.android.recaptcha.internal.zzkv)) {
            if (p6) {
                this.zza.zzr(p4, 2);
                com.google.android.recaptcha.internal.zzln v4_1 = 0;
                boolean v6_2 = 0;
                while (v4_1 < p5.size()) {
                    ((Boolean) p5.get(v4_1)).getClass();
                    v6_2++;
                    v4_1++;
                }
                this.zza.zzt(v6_2);
                while (v2 < p5.size()) {
                    this.zza.zzb(((Boolean) p5.get(v2)).booleanValue());
                    v2++;
                }
                return;
            }
            while (v2 < p5.size()) {
                this.zza.zzd(p4, ((Boolean) p5.get(v2)).booleanValue());
                v2++;
            }
        } else {
            if (p6) {
                this.zza.zzr(p4, 2);
                com.google.android.recaptcha.internal.zzln v4_5 = 0;
                boolean v6_9 = 0;
                while (v4_5 < ((com.google.android.recaptcha.internal.zzkv) p5).size()) {
                    ((com.google.android.recaptcha.internal.zzkv) p5).zzf(v4_5);
                    v6_9++;
                    v4_5++;
                }
                this.zza.zzt(v6_9);
                while (v2 < ((com.google.android.recaptcha.internal.zzkv) p5).size()) {
                    this.zza.zzb(((com.google.android.recaptcha.internal.zzkv) p5).zzf(v2));
                    v2++;
                }
                return;
            }
            while (v2 < ((com.google.android.recaptcha.internal.zzkv) p5).size()) {
                this.zza.zzd(p4, ((com.google.android.recaptcha.internal.zzkv) p5).zzf(v2));
                v2++;
            }
        }
        return;
    }

    public final void zzd(int p2, com.google.android.recaptcha.internal.zzle p3)
    {
        this.zza.zze(p2, p3);
        return;
    }

    public final void zze(int p4, java.util.List p5)
    {
        int v0 = 0;
        while (v0 < p5.size()) {
            this.zza.zze(p4, ((com.google.android.recaptcha.internal.zzle) p5.get(v0)));
            v0++;
        }
        return;
    }

    public final void zzf(int p2, double p3)
    {
        this.zza.zzh(p2, Double.doubleToRawLongBits(p3));
        return;
    }

    public final void zzg(int p4, java.util.List p5, boolean p6)
    {
        int v2 = 0;
        if (!(p5 instanceof com.google.android.recaptcha.internal.zzmi)) {
            if (p6 != null) {
                this.zza.zzr(p4, 2);
                com.google.android.recaptcha.internal.zzln v4_1 = 0;
                Double v6_2 = 0;
                while (v4_1 < p5.size()) {
                    ((Double) p5.get(v4_1)).getClass();
                    v6_2 += 8;
                    v4_1++;
                }
                this.zza.zzt(v6_2);
                while (v2 < p5.size()) {
                    this.zza.zzi(Double.doubleToRawLongBits(((Double) p5.get(v2)).doubleValue()));
                    v2++;
                }
                return;
            }
            while (v2 < p5.size()) {
                this.zza.zzh(p4, Double.doubleToRawLongBits(((Double) p5.get(v2)).doubleValue()));
                v2++;
            }
        } else {
            if (p6 != null) {
                this.zza.zzr(p4, 2);
                com.google.android.recaptcha.internal.zzln v4_5 = 0;
                Double v6_9 = 0;
                while (v4_5 < ((com.google.android.recaptcha.internal.zzmi) p5).size()) {
                    ((com.google.android.recaptcha.internal.zzmi) p5).zze(v4_5);
                    v6_9 += 8;
                    v4_5++;
                }
                this.zza.zzt(v6_9);
                while (v2 < ((com.google.android.recaptcha.internal.zzmi) p5).size()) {
                    this.zza.zzi(Double.doubleToRawLongBits(((com.google.android.recaptcha.internal.zzmi) p5).zze(v2)));
                    v2++;
                }
                return;
            }
            while (v2 < ((com.google.android.recaptcha.internal.zzmi) p5).size()) {
                this.zza.zzh(p4, Double.doubleToRawLongBits(((com.google.android.recaptcha.internal.zzmi) p5).zze(v2)));
                v2++;
            }
        }
        return;
    }

    public final void zzh(int p3)
    {
        this.zza.zzr(p3, 4);
        return;
    }

    public final void zzi(int p2, int p3)
    {
        this.zza.zzj(p2, p3);
        return;
    }

    public final void zzj(int p4, java.util.List p5, boolean p6)
    {
        int v2 = 0;
        if (!(p5 instanceof com.google.android.recaptcha.internal.zzne)) {
            if (p6 != 0) {
                this.zza.zzr(p4, 2);
                com.google.android.recaptcha.internal.zzln v4_1 = 0;
                int v6_2 = 0;
                while (v4_1 < p5.size()) {
                    v6_2 += com.google.android.recaptcha.internal.zzln.zzB(((long) ((Integer) p5.get(v4_1)).intValue()));
                    v4_1++;
                }
                this.zza.zzt(v6_2);
                while (v2 < p5.size()) {
                    this.zza.zzk(((Integer) p5.get(v2)).intValue());
                    v2++;
                }
                return;
            }
            while (v2 < p5.size()) {
                this.zza.zzj(p4, ((Integer) p5.get(v2)).intValue());
                v2++;
            }
        } else {
            if (p6 != 0) {
                this.zza.zzr(p4, 2);
                com.google.android.recaptcha.internal.zzln v4_5 = 0;
                int v6_9 = 0;
                while (v4_5 < ((com.google.android.recaptcha.internal.zzne) p5).size()) {
                    v6_9 += com.google.android.recaptcha.internal.zzln.zzB(((long) ((com.google.android.recaptcha.internal.zzne) p5).zze(v4_5)));
                    v4_5++;
                }
                this.zza.zzt(v6_9);
                while (v2 < ((com.google.android.recaptcha.internal.zzne) p5).size()) {
                    this.zza.zzk(((com.google.android.recaptcha.internal.zzne) p5).zze(v2));
                    v2++;
                }
                return;
            }
            while (v2 < ((com.google.android.recaptcha.internal.zzne) p5).size()) {
                this.zza.zzj(p4, ((com.google.android.recaptcha.internal.zzne) p5).zze(v2));
                v2++;
            }
        }
        return;
    }

    public final void zzk(int p2, int p3)
    {
        this.zza.zzf(p2, p3);
        return;
    }

    public final void zzl(int p4, java.util.List p5, boolean p6)
    {
        int v2 = 0;
        if (!(p5 instanceof com.google.android.recaptcha.internal.zzne)) {
            if (p6 != 0) {
                this.zza.zzr(p4, 2);
                com.google.android.recaptcha.internal.zzln v4_1 = 0;
                int v6_2 = 0;
                while (v4_1 < p5.size()) {
                    ((Integer) p5.get(v4_1)).getClass();
                    v6_2 += 4;
                    v4_1++;
                }
                this.zza.zzt(v6_2);
                while (v2 < p5.size()) {
                    this.zza.zzg(((Integer) p5.get(v2)).intValue());
                    v2++;
                }
                return;
            }
            while (v2 < p5.size()) {
                this.zza.zzf(p4, ((Integer) p5.get(v2)).intValue());
                v2++;
            }
        } else {
            if (p6 != 0) {
                this.zza.zzr(p4, 2);
                com.google.android.recaptcha.internal.zzln v4_5 = 0;
                int v6_9 = 0;
                while (v4_5 < ((com.google.android.recaptcha.internal.zzne) p5).size()) {
                    ((com.google.android.recaptcha.internal.zzne) p5).zze(v4_5);
                    v6_9 += 4;
                    v4_5++;
                }
                this.zza.zzt(v6_9);
                while (v2 < ((com.google.android.recaptcha.internal.zzne) p5).size()) {
                    this.zza.zzg(((com.google.android.recaptcha.internal.zzne) p5).zze(v2));
                    v2++;
                }
                return;
            }
            while (v2 < ((com.google.android.recaptcha.internal.zzne) p5).size()) {
                this.zza.zzf(p4, ((com.google.android.recaptcha.internal.zzne) p5).zze(v2));
                v2++;
            }
        }
        return;
    }

    public final void zzm(int p2, long p3)
    {
        this.zza.zzh(p2, p3);
        return;
    }

    public final void zzn(int p4, java.util.List p5, boolean p6)
    {
        int v2 = 0;
        if (!(p5 instanceof com.google.android.recaptcha.internal.zznx)) {
            if (p6 != null) {
                this.zza.zzr(p4, 2);
                com.google.android.recaptcha.internal.zzln v4_1 = 0;
                Long v6_2 = 0;
                while (v4_1 < p5.size()) {
                    ((Long) p5.get(v4_1)).getClass();
                    v6_2 += 8;
                    v4_1++;
                }
                this.zza.zzt(v6_2);
                while (v2 < p5.size()) {
                    this.zza.zzi(((Long) p5.get(v2)).longValue());
                    v2++;
                }
                return;
            }
            while (v2 < p5.size()) {
                this.zza.zzh(p4, ((Long) p5.get(v2)).longValue());
                v2++;
            }
        } else {
            if (p6 != null) {
                this.zza.zzr(p4, 2);
                com.google.android.recaptcha.internal.zzln v4_5 = 0;
                Long v6_8 = 0;
                while (v4_5 < ((com.google.android.recaptcha.internal.zznx) p5).size()) {
                    ((com.google.android.recaptcha.internal.zznx) p5).zze(v4_5);
                    v6_8 += 8;
                    v4_5++;
                }
                this.zza.zzt(v6_8);
                while (v2 < ((com.google.android.recaptcha.internal.zznx) p5).size()) {
                    this.zza.zzi(((com.google.android.recaptcha.internal.zznx) p5).zze(v2));
                    v2++;
                }
                return;
            }
            while (v2 < ((com.google.android.recaptcha.internal.zznx) p5).size()) {
                this.zza.zzh(p4, ((com.google.android.recaptcha.internal.zznx) p5).zze(v2));
                v2++;
            }
        }
        return;
    }

    public final void zzo(int p2, float p3)
    {
        this.zza.zzf(p2, Float.floatToRawIntBits(p3));
        return;
    }

    public final void zzp(int p4, java.util.List p5, boolean p6)
    {
        int v2 = 0;
        if (!(p5 instanceof com.google.android.recaptcha.internal.zzmv)) {
            if (p6 != 0) {
                this.zza.zzr(p4, 2);
                com.google.android.recaptcha.internal.zzln v4_1 = 0;
                int v6_2 = 0;
                while (v4_1 < p5.size()) {
                    ((Float) p5.get(v4_1)).getClass();
                    v6_2 += 4;
                    v4_1++;
                }
                this.zza.zzt(v6_2);
                while (v2 < p5.size()) {
                    this.zza.zzg(Float.floatToRawIntBits(((Float) p5.get(v2)).floatValue()));
                    v2++;
                }
                return;
            }
            while (v2 < p5.size()) {
                this.zza.zzf(p4, Float.floatToRawIntBits(((Float) p5.get(v2)).floatValue()));
                v2++;
            }
        } else {
            if (p6 != 0) {
                this.zza.zzr(p4, 2);
                com.google.android.recaptcha.internal.zzln v4_5 = 0;
                int v6_11 = 0;
                while (v4_5 < ((com.google.android.recaptcha.internal.zzmv) p5).size()) {
                    ((com.google.android.recaptcha.internal.zzmv) p5).zze(v4_5);
                    v6_11 += 4;
                    v4_5++;
                }
                this.zza.zzt(v6_11);
                while (v2 < ((com.google.android.recaptcha.internal.zzmv) p5).size()) {
                    this.zza.zzg(Float.floatToRawIntBits(((com.google.android.recaptcha.internal.zzmv) p5).zze(v2)));
                    v2++;
                }
                return;
            }
            while (v2 < ((com.google.android.recaptcha.internal.zzmv) p5).size()) {
                this.zza.zzf(p4, Float.floatToRawIntBits(((com.google.android.recaptcha.internal.zzmv) p5).zze(v2)));
                v2++;
            }
        }
        return;
    }

    public final void zzq(int p3, Object p4, com.google.android.recaptcha.internal.zzow p5)
    {
        com.google.android.recaptcha.internal.zzln v0 = this.zza;
        v0.zzr(p3, 3);
        p5.zzj(((com.google.android.recaptcha.internal.zzoi) p4), v0.zza);
        v0.zzr(p3, 4);
        return;
    }

    public final void zzr(int p2, int p3)
    {
        this.zza.zzj(p2, p3);
        return;
    }

    public final void zzs(int p4, java.util.List p5, boolean p6)
    {
        int v2 = 0;
        if (!(p5 instanceof com.google.android.recaptcha.internal.zzne)) {
            if (p6 != 0) {
                this.zza.zzr(p4, 2);
                com.google.android.recaptcha.internal.zzln v4_1 = 0;
                int v6_2 = 0;
                while (v4_1 < p5.size()) {
                    v6_2 += com.google.android.recaptcha.internal.zzln.zzB(((long) ((Integer) p5.get(v4_1)).intValue()));
                    v4_1++;
                }
                this.zza.zzt(v6_2);
                while (v2 < p5.size()) {
                    this.zza.zzk(((Integer) p5.get(v2)).intValue());
                    v2++;
                }
                return;
            }
            while (v2 < p5.size()) {
                this.zza.zzj(p4, ((Integer) p5.get(v2)).intValue());
                v2++;
            }
        } else {
            if (p6 != 0) {
                this.zza.zzr(p4, 2);
                com.google.android.recaptcha.internal.zzln v4_5 = 0;
                int v6_9 = 0;
                while (v4_5 < ((com.google.android.recaptcha.internal.zzne) p5).size()) {
                    v6_9 += com.google.android.recaptcha.internal.zzln.zzB(((long) ((com.google.android.recaptcha.internal.zzne) p5).zze(v4_5)));
                    v4_5++;
                }
                this.zza.zzt(v6_9);
                while (v2 < ((com.google.android.recaptcha.internal.zzne) p5).size()) {
                    this.zza.zzk(((com.google.android.recaptcha.internal.zzne) p5).zze(v2));
                    v2++;
                }
                return;
            }
            while (v2 < ((com.google.android.recaptcha.internal.zzne) p5).size()) {
                this.zza.zzj(p4, ((com.google.android.recaptcha.internal.zzne) p5).zze(v2));
                v2++;
            }
        }
        return;
    }

    public final void zzt(int p2, long p3)
    {
        this.zza.zzu(p2, p3);
        return;
    }

    public final void zzu(int p4, java.util.List p5, boolean p6)
    {
        int v2 = 0;
        if (!(p5 instanceof com.google.android.recaptcha.internal.zznx)) {
            if (p6 != null) {
                this.zza.zzr(p4, 2);
                com.google.android.recaptcha.internal.zzln v4_1 = 0;
                Long v6_2 = 0;
                while (v4_1 < p5.size()) {
                    v6_2 += com.google.android.recaptcha.internal.zzln.zzB(((Long) p5.get(v4_1)).longValue());
                    v4_1++;
                }
                this.zza.zzt(v6_2);
                while (v2 < p5.size()) {
                    this.zza.zzv(((Long) p5.get(v2)).longValue());
                    v2++;
                }
                return;
            }
            while (v2 < p5.size()) {
                this.zza.zzu(p4, ((Long) p5.get(v2)).longValue());
                v2++;
            }
        } else {
            if (p6 != null) {
                this.zza.zzr(p4, 2);
                com.google.android.recaptcha.internal.zzln v4_5 = 0;
                Long v6_8 = 0;
                while (v4_5 < ((com.google.android.recaptcha.internal.zznx) p5).size()) {
                    v6_8 += com.google.android.recaptcha.internal.zzln.zzB(((com.google.android.recaptcha.internal.zznx) p5).zze(v4_5));
                    v4_5++;
                }
                this.zza.zzt(v6_8);
                while (v2 < ((com.google.android.recaptcha.internal.zznx) p5).size()) {
                    this.zza.zzv(((com.google.android.recaptcha.internal.zznx) p5).zze(v2));
                    v2++;
                }
                return;
            }
            while (v2 < ((com.google.android.recaptcha.internal.zznx) p5).size()) {
                this.zza.zzu(p4, ((com.google.android.recaptcha.internal.zznx) p5).zze(v2));
                v2++;
            }
        }
        return;
    }

    public final void zzv(int p2, Object p3, com.google.android.recaptcha.internal.zzow p4)
    {
        this.zza.zzm(p2, ((com.google.android.recaptcha.internal.zzoi) p3), p4);
        return;
    }

    public final void zzw(int p2, Object p3)
    {
        if (!(p3 instanceof com.google.android.recaptcha.internal.zzle)) {
            this.zza.zzn(p2, ((com.google.android.recaptcha.internal.zzoi) p3));
            return;
        } else {
            this.zza.zzo(p2, ((com.google.android.recaptcha.internal.zzle) p3));
            return;
        }
    }

    public final void zzx(int p2, int p3)
    {
        this.zza.zzf(p2, p3);
        return;
    }

    public final void zzy(int p4, java.util.List p5, boolean p6)
    {
        int v2 = 0;
        if (!(p5 instanceof com.google.android.recaptcha.internal.zzne)) {
            if (p6 != 0) {
                this.zza.zzr(p4, 2);
                com.google.android.recaptcha.internal.zzln v4_1 = 0;
                int v6_2 = 0;
                while (v4_1 < p5.size()) {
                    ((Integer) p5.get(v4_1)).getClass();
                    v6_2 += 4;
                    v4_1++;
                }
                this.zza.zzt(v6_2);
                while (v2 < p5.size()) {
                    this.zza.zzg(((Integer) p5.get(v2)).intValue());
                    v2++;
                }
                return;
            }
            while (v2 < p5.size()) {
                this.zza.zzf(p4, ((Integer) p5.get(v2)).intValue());
                v2++;
            }
        } else {
            if (p6 != 0) {
                this.zza.zzr(p4, 2);
                com.google.android.recaptcha.internal.zzln v4_5 = 0;
                int v6_9 = 0;
                while (v4_5 < ((com.google.android.recaptcha.internal.zzne) p5).size()) {
                    ((com.google.android.recaptcha.internal.zzne) p5).zze(v4_5);
                    v6_9 += 4;
                    v4_5++;
                }
                this.zza.zzt(v6_9);
                while (v2 < ((com.google.android.recaptcha.internal.zzne) p5).size()) {
                    this.zza.zzg(((com.google.android.recaptcha.internal.zzne) p5).zze(v2));
                    v2++;
                }
                return;
            }
            while (v2 < ((com.google.android.recaptcha.internal.zzne) p5).size()) {
                this.zza.zzf(p4, ((com.google.android.recaptcha.internal.zzne) p5).zze(v2));
                v2++;
            }
        }
        return;
    }

    public final void zzz(int p2, long p3)
    {
        this.zza.zzh(p2, p3);
        return;
    }
}
