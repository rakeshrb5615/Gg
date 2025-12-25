package com.google.android.gms.internal.play_billing;
final class zzeq implements com.google.android.gms.internal.play_billing.zzhu {
    private final com.google.android.gms.internal.play_billing.zzep zza;

    private zzeq(com.google.android.gms.internal.play_billing.zzep p2)
    {
        this.zza = p2;
        p2.zza = this;
        return;
    }

    public static com.google.android.gms.internal.play_billing.zzeq zza(com.google.android.gms.internal.play_billing.zzep p1)
    {
        com.google.android.gms.internal.play_billing.zzeq v0_0 = p1.zza;
        if (v0_0 == null) {
            return new com.google.android.gms.internal.play_billing.zzeq(p1);
        } else {
            return v0_0;
        }
    }

    public final void zzA(int p4, java.util.List p5, boolean p6)
    {
        int v2 = 0;
        if (!(p5 instanceof com.google.android.gms.internal.play_billing.zzga)) {
            if (p6 != null) {
                com.google.android.gms.internal.play_billing.zzep v6_1 = this.zza;
                v6_1.zzt(p4, 2);
                Long v4_1 = 0;
                long v0_4 = 0;
                while (v4_1 < p5.size()) {
                    ((Long) p5.get(v4_1)).getClass();
                    v0_4 += 8;
                    v4_1++;
                }
                v6_1.zzv(v0_4);
                while (v2 < p5.size()) {
                    v6_1.zzj(((Long) p5.get(v2)).longValue());
                    v2++;
                }
                return;
            }
            while (v2 < p5.size()) {
                this.zza.zzi(p4, ((Long) p5.get(v2)).longValue());
                v2++;
            }
        } else {
            if (p6 != null) {
                com.google.android.gms.internal.play_billing.zzep v6_4 = this.zza;
                v6_4.zzt(p4, 2);
                Long v4_5 = 0;
                long v0_7 = 0;
                while (v4_5 < ((com.google.android.gms.internal.play_billing.zzga) p5).size()) {
                    ((com.google.android.gms.internal.play_billing.zzga) p5).zze(v4_5);
                    v0_7 += 8;
                    v4_5++;
                }
                v6_4.zzv(v0_7);
                while (v2 < ((com.google.android.gms.internal.play_billing.zzga) p5).size()) {
                    v6_4.zzj(((com.google.android.gms.internal.play_billing.zzga) p5).zze(v2));
                    v2++;
                }
                return;
            }
            while (v2 < ((com.google.android.gms.internal.play_billing.zzga) p5).size()) {
                this.zza.zzi(p4, ((com.google.android.gms.internal.play_billing.zzga) p5).zze(v2));
                v2++;
            }
        }
        return;
    }

    public final void zzB(int p2, int p3)
    {
        this.zza.zzu(p2, ((p3 >> 31) ^ (p3 + p3)));
        return;
    }

    public final void zzC(int p5, java.util.List p6, boolean p7)
    {
        int v2 = 0;
        if (!(p6 instanceof com.google.android.gms.internal.play_billing.zzfj)) {
            if (p7 != null) {
                com.google.android.gms.internal.play_billing.zzep v7_1 = this.zza;
                v7_1.zzt(p5, 2);
                int v5_1 = 0;
                int v0_6 = 0;
                while (v5_1 < p6.size()) {
                    int v1_5 = ((Integer) p6.get(v5_1)).intValue();
                    v0_6 += com.google.android.gms.internal.play_billing.zzep.zzC(((v1_5 >> 31) ^ (v1_5 + v1_5)));
                    v5_1++;
                }
                v7_1.zzv(v0_6);
                while (v2 < p6.size()) {
                    int v5_5 = ((Integer) p6.get(v2)).intValue();
                    v7_1.zzv(((v5_5 >> 31) ^ (v5_5 + v5_5)));
                    v2++;
                }
                return;
            }
            while (v2 < p6.size()) {
                com.google.android.gms.internal.play_billing.zzep v7_6 = this.zza;
                int v0_3 = ((Integer) p6.get(v2)).intValue();
                v7_6.zzu(p5, ((v0_3 >> 31) ^ (v0_3 + v0_3)));
                v2++;
            }
        } else {
            if (p7 != null) {
                com.google.android.gms.internal.play_billing.zzep v7_5 = this.zza;
                v7_5.zzt(p5, 2);
                int v5_8 = 0;
                int v0_11 = 0;
                while (v5_8 < ((com.google.android.gms.internal.play_billing.zzfj) p6).size()) {
                    int v1_11 = ((com.google.android.gms.internal.play_billing.zzfj) p6).zze(v5_8);
                    v0_11 += com.google.android.gms.internal.play_billing.zzep.zzC(((v1_11 >> 31) ^ (v1_11 + v1_11)));
                    v5_8++;
                }
                v7_5.zzv(v0_11);
                while (v2 < ((com.google.android.gms.internal.play_billing.zzfj) p6).size()) {
                    int v5_10 = ((com.google.android.gms.internal.play_billing.zzfj) p6).zze(v2);
                    v7_5.zzv(((v5_10 >> 31) ^ (v5_10 + v5_10)));
                    v2++;
                }
                return;
            }
            while (v2 < ((com.google.android.gms.internal.play_billing.zzfj) p6).size()) {
                com.google.android.gms.internal.play_billing.zzep v7_3 = this.zza;
                int v0_8 = ((com.google.android.gms.internal.play_billing.zzfj) p6).zze(v2);
                v7_3.zzu(p5, ((v0_8 >> 31) ^ (v0_8 + v0_8)));
                v2++;
            }
        }
        return;
    }

    public final void zzD(int p4, long p5)
    {
        this.zza.zzw(p4, ((p5 >> 63) ^ (p5 + p5)));
        return;
    }

    public final void zzE(int p9, java.util.List p10, boolean p11)
    {
        int v3 = 0;
        if (!(p10 instanceof com.google.android.gms.internal.play_billing.zzga)) {
            if (p11 != null) {
                com.google.android.gms.internal.play_billing.zzep v11_1 = this.zza;
                v11_1.zzt(p9, 2);
                Long v9_1 = 0;
                long v0_6 = 0;
                while (v9_1 < p10.size()) {
                    long v4_2 = ((Long) p10.get(v9_1)).longValue();
                    v0_6 += com.google.android.gms.internal.play_billing.zzep.zzD(((v4_2 >> 63) ^ (v4_2 + v4_2)));
                    v9_1++;
                }
                v11_1.zzv(v0_6);
                while (v3 < p10.size()) {
                    long v0_7 = ((Long) p10.get(v3)).longValue();
                    v11_1.zzx(((v0_7 >> 63) ^ (v0_7 + v0_7)));
                    v3++;
                }
                return;
            }
            while (v3 < p10.size()) {
                com.google.android.gms.internal.play_billing.zzep v11_6 = this.zza;
                long v0_3 = ((Long) p10.get(v3)).longValue();
                v11_6.zzw(p9, ((v0_3 >> 63) ^ (v0_3 + v0_3)));
                v3++;
            }
        } else {
            if (p11 != null) {
                com.google.android.gms.internal.play_billing.zzep v11_4 = this.zza;
                v11_4.zzt(p9, 2);
                Long v9_5 = 0;
                long v0_13 = 0;
                while (v9_5 < ((com.google.android.gms.internal.play_billing.zzga) p10).size()) {
                    long v4_7 = ((com.google.android.gms.internal.play_billing.zzga) p10).zze(v9_5);
                    v0_13 += com.google.android.gms.internal.play_billing.zzep.zzD(((v4_7 >> 63) ^ (v4_7 + v4_7)));
                    v9_5++;
                }
                v11_4.zzv(v0_13);
                while (v3 < ((com.google.android.gms.internal.play_billing.zzga) p10).size()) {
                    long v0_14 = ((com.google.android.gms.internal.play_billing.zzga) p10).zze(v3);
                    v11_4.zzx(((v0_14 >> 63) ^ (v0_14 + v0_14)));
                    v3++;
                }
                return;
            }
            while (v3 < ((com.google.android.gms.internal.play_billing.zzga) p10).size()) {
                com.google.android.gms.internal.play_billing.zzep v11_3 = this.zza;
                long v0_10 = ((com.google.android.gms.internal.play_billing.zzga) p10).zze(v3);
                v11_3.zzw(p9, ((v0_10 >> 63) ^ (v0_10 + v0_10)));
                v3++;
            }
        }
        return;
    }

    public final void zzF(int p3)
    {
        this.zza.zzt(p3, 3);
        return;
    }

    public final void zzG(int p2, String p3)
    {
        this.zza.zzr(p2, p3);
        return;
    }

    public final void zzH(int p5, java.util.List p6)
    {
        int v1 = 0;
        if (!(p6 instanceof com.google.android.gms.internal.play_billing.zzfx)) {
            while (v1 < p6.size()) {
                this.zza.zzr(p5, ((String) p6.get(v1)));
                v1++;
            }
        } else {
            while (v1 < p6.size()) {
                com.google.android.gms.internal.play_billing.zzei v2_1 = ((com.google.android.gms.internal.play_billing.zzfx) p6).zza();
                if (!(v2_1 instanceof String)) {
                    this.zza.zze(p5, ((com.google.android.gms.internal.play_billing.zzei) v2_1));
                } else {
                    this.zza.zzr(p5, ((String) v2_1));
                }
                v1++;
            }
        }
        return;
    }

    public final void zzI(int p2, int p3)
    {
        this.zza.zzu(p2, p3);
        return;
    }

    public final void zzJ(int p4, java.util.List p5, boolean p6)
    {
        int v2 = 0;
        if (!(p5 instanceof com.google.android.gms.internal.play_billing.zzfj)) {
            if (p6 != null) {
                com.google.android.gms.internal.play_billing.zzep v6_1 = this.zza;
                v6_1.zzt(p4, 2);
                int v4_1 = 0;
                int v0_4 = 0;
                while (v4_1 < p5.size()) {
                    v0_4 += com.google.android.gms.internal.play_billing.zzep.zzC(((Integer) p5.get(v4_1)).intValue());
                    v4_1++;
                }
                v6_1.zzv(v0_4);
                while (v2 < p5.size()) {
                    v6_1.zzv(((Integer) p5.get(v2)).intValue());
                    v2++;
                }
                return;
            }
            while (v2 < p5.size()) {
                this.zza.zzu(p4, ((Integer) p5.get(v2)).intValue());
                v2++;
            }
        } else {
            if (p6 != null) {
                com.google.android.gms.internal.play_billing.zzep v6_4 = this.zza;
                v6_4.zzt(p4, 2);
                int v4_6 = 0;
                int v0_6 = 0;
                while (v4_6 < ((com.google.android.gms.internal.play_billing.zzfj) p5).size()) {
                    v0_6 += com.google.android.gms.internal.play_billing.zzep.zzC(((com.google.android.gms.internal.play_billing.zzfj) p5).zze(v4_6));
                    v4_6++;
                }
                v6_4.zzv(v0_6);
                while (v2 < ((com.google.android.gms.internal.play_billing.zzfj) p5).size()) {
                    v6_4.zzv(((com.google.android.gms.internal.play_billing.zzfj) p5).zze(v2));
                    v2++;
                }
                return;
            }
            while (v2 < ((com.google.android.gms.internal.play_billing.zzfj) p5).size()) {
                this.zza.zzu(p4, ((com.google.android.gms.internal.play_billing.zzfj) p5).zze(v2));
                v2++;
            }
        }
        return;
    }

    public final void zzK(int p2, long p3)
    {
        this.zza.zzw(p2, p3);
        return;
    }

    public final void zzL(int p6, java.util.List p7, boolean p8)
    {
        int v2 = 0;
        if (!(p7 instanceof com.google.android.gms.internal.play_billing.zzga)) {
            if (p8 != null) {
                com.google.android.gms.internal.play_billing.zzep v8_1 = this.zza;
                v8_1.zzt(p6, 2);
                Long v6_1 = 0;
                long v0_4 = 0;
                while (v6_1 < p7.size()) {
                    v0_4 += com.google.android.gms.internal.play_billing.zzep.zzD(((Long) p7.get(v6_1)).longValue());
                    v6_1++;
                }
                v8_1.zzv(v0_4);
                while (v2 < p7.size()) {
                    v8_1.zzx(((Long) p7.get(v2)).longValue());
                    v2++;
                }
                return;
            }
            while (v2 < p7.size()) {
                this.zza.zzw(p6, ((Long) p7.get(v2)).longValue());
                v2++;
            }
        } else {
            if (p8 != null) {
                com.google.android.gms.internal.play_billing.zzep v8_4 = this.zza;
                v8_4.zzt(p6, 2);
                Long v6_5 = 0;
                long v0_7 = 0;
                while (v6_5 < ((com.google.android.gms.internal.play_billing.zzga) p7).size()) {
                    v0_7 += com.google.android.gms.internal.play_billing.zzep.zzD(((com.google.android.gms.internal.play_billing.zzga) p7).zze(v6_5));
                    v6_5++;
                }
                v8_4.zzv(v0_7);
                while (v2 < ((com.google.android.gms.internal.play_billing.zzga) p7).size()) {
                    v8_4.zzx(((com.google.android.gms.internal.play_billing.zzga) p7).zze(v2));
                    v2++;
                }
                return;
            }
            while (v2 < ((com.google.android.gms.internal.play_billing.zzga) p7).size()) {
                this.zza.zzw(p6, ((com.google.android.gms.internal.play_billing.zzga) p7).zze(v2));
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
        if (!(p5 instanceof com.google.android.gms.internal.play_billing.zzdy)) {
            if (p6 != null) {
                com.google.android.gms.internal.play_billing.zzep v6_1 = this.zza;
                v6_1.zzt(p4, 2);
                boolean v4_1 = 0;
                int v0_4 = 0;
                while (v4_1 < p5.size()) {
                    ((Boolean) p5.get(v4_1)).getClass();
                    v0_4++;
                    v4_1++;
                }
                v6_1.zzv(v0_4);
                while (v2 < p5.size()) {
                    v6_1.zzb(((Boolean) p5.get(v2)).booleanValue());
                    v2++;
                }
                return;
            }
            while (v2 < p5.size()) {
                this.zza.zzd(p4, ((Boolean) p5.get(v2)).booleanValue());
                v2++;
            }
        } else {
            if (p6 != null) {
                com.google.android.gms.internal.play_billing.zzep v6_4 = this.zza;
                v6_4.zzt(p4, 2);
                boolean v4_6 = 0;
                int v0_6 = 0;
                while (v4_6 < ((com.google.android.gms.internal.play_billing.zzdy) p5).size()) {
                    ((com.google.android.gms.internal.play_billing.zzdy) p5).zzf(v4_6);
                    v0_6++;
                    v4_6++;
                }
                v6_4.zzv(v0_6);
                while (v2 < ((com.google.android.gms.internal.play_billing.zzdy) p5).size()) {
                    v6_4.zzb(((com.google.android.gms.internal.play_billing.zzdy) p5).zzf(v2));
                    v2++;
                }
                return;
            }
            while (v2 < ((com.google.android.gms.internal.play_billing.zzdy) p5).size()) {
                this.zza.zzd(p4, ((com.google.android.gms.internal.play_billing.zzdy) p5).zzf(v2));
                v2++;
            }
        }
        return;
    }

    public final void zzd(int p2, com.google.android.gms.internal.play_billing.zzei p3)
    {
        this.zza.zze(p2, p3);
        return;
    }

    public final void zze(int p4, java.util.List p5)
    {
        int v0 = 0;
        while (v0 < p5.size()) {
            this.zza.zze(p4, ((com.google.android.gms.internal.play_billing.zzei) p5.get(v0)));
            v0++;
        }
        return;
    }

    public final void zzf(int p2, double p3)
    {
        this.zza.zzi(p2, Double.doubleToRawLongBits(p3));
        return;
    }

    public final void zzg(int p4, java.util.List p5, boolean p6)
    {
        int v2 = 0;
        if (!(p5 instanceof com.google.android.gms.internal.play_billing.zzer)) {
            if (p6 != null) {
                com.google.android.gms.internal.play_billing.zzep v6_1 = this.zza;
                v6_1.zzt(p4, 2);
                Double v4_1 = 0;
                long v0_5 = 0;
                while (v4_1 < p5.size()) {
                    ((Double) p5.get(v4_1)).getClass();
                    v0_5 += 8;
                    v4_1++;
                }
                v6_1.zzv(v0_5);
                while (v2 < p5.size()) {
                    v6_1.zzj(Double.doubleToRawLongBits(((Double) p5.get(v2)).doubleValue()));
                    v2++;
                }
                return;
            }
            while (v2 < p5.size()) {
                this.zza.zzi(p4, Double.doubleToRawLongBits(((Double) p5.get(v2)).doubleValue()));
                v2++;
            }
        } else {
            if (p6 != null) {
                com.google.android.gms.internal.play_billing.zzep v6_4 = this.zza;
                v6_4.zzt(p4, 2);
                Double v4_5 = 0;
                long v0_10 = 0;
                while (v4_5 < ((com.google.android.gms.internal.play_billing.zzer) p5).size()) {
                    ((com.google.android.gms.internal.play_billing.zzer) p5).zze(v4_5);
                    v0_10 += 8;
                    v4_5++;
                }
                v6_4.zzv(v0_10);
                while (v2 < ((com.google.android.gms.internal.play_billing.zzer) p5).size()) {
                    v6_4.zzj(Double.doubleToRawLongBits(((com.google.android.gms.internal.play_billing.zzer) p5).zze(v2)));
                    v2++;
                }
                return;
            }
            while (v2 < ((com.google.android.gms.internal.play_billing.zzer) p5).size()) {
                this.zza.zzi(p4, Double.doubleToRawLongBits(((com.google.android.gms.internal.play_billing.zzer) p5).zze(v2)));
                v2++;
            }
        }
        return;
    }

    public final void zzh(int p3)
    {
        this.zza.zzt(p3, 4);
        return;
    }

    public final void zzi(int p2, int p3)
    {
        this.zza.zzk(p2, p3);
        return;
    }

    public final void zzj(int p6, java.util.List p7, boolean p8)
    {
        int v2 = 0;
        if (!(p7 instanceof com.google.android.gms.internal.play_billing.zzfj)) {
            if (p8 != null) {
                com.google.android.gms.internal.play_billing.zzep v8_1 = this.zza;
                v8_1.zzt(p6, 2);
                int v6_1 = 0;
                int v0_4 = 0;
                while (v6_1 < p7.size()) {
                    v0_4 += com.google.android.gms.internal.play_billing.zzep.zzD(((long) ((Integer) p7.get(v6_1)).intValue()));
                    v6_1++;
                }
                v8_1.zzv(v0_4);
                while (v2 < p7.size()) {
                    v8_1.zzl(((Integer) p7.get(v2)).intValue());
                    v2++;
                }
                return;
            }
            while (v2 < p7.size()) {
                this.zza.zzk(p6, ((Integer) p7.get(v2)).intValue());
                v2++;
            }
        } else {
            if (p8 != null) {
                com.google.android.gms.internal.play_billing.zzep v8_4 = this.zza;
                v8_4.zzt(p6, 2);
                int v6_6 = 0;
                int v0_6 = 0;
                while (v6_6 < ((com.google.android.gms.internal.play_billing.zzfj) p7).size()) {
                    v0_6 += com.google.android.gms.internal.play_billing.zzep.zzD(((long) ((com.google.android.gms.internal.play_billing.zzfj) p7).zze(v6_6)));
                    v6_6++;
                }
                v8_4.zzv(v0_6);
                while (v2 < ((com.google.android.gms.internal.play_billing.zzfj) p7).size()) {
                    v8_4.zzl(((com.google.android.gms.internal.play_billing.zzfj) p7).zze(v2));
                    v2++;
                }
                return;
            }
            while (v2 < ((com.google.android.gms.internal.play_billing.zzfj) p7).size()) {
                this.zza.zzk(p6, ((com.google.android.gms.internal.play_billing.zzfj) p7).zze(v2));
                v2++;
            }
        }
        return;
    }

    public final void zzk(int p2, int p3)
    {
        this.zza.zzg(p2, p3);
        return;
    }

    public final void zzl(int p4, java.util.List p5, boolean p6)
    {
        int v2 = 0;
        if (!(p5 instanceof com.google.android.gms.internal.play_billing.zzfj)) {
            if (p6 != null) {
                com.google.android.gms.internal.play_billing.zzep v6_1 = this.zza;
                v6_1.zzt(p4, 2);
                int v4_1 = 0;
                int v0_4 = 0;
                while (v4_1 < p5.size()) {
                    ((Integer) p5.get(v4_1)).getClass();
                    v0_4 += 4;
                    v4_1++;
                }
                v6_1.zzv(v0_4);
                while (v2 < p5.size()) {
                    v6_1.zzh(((Integer) p5.get(v2)).intValue());
                    v2++;
                }
                return;
            }
            while (v2 < p5.size()) {
                this.zza.zzg(p4, ((Integer) p5.get(v2)).intValue());
                v2++;
            }
        } else {
            if (p6 != null) {
                com.google.android.gms.internal.play_billing.zzep v6_4 = this.zza;
                v6_4.zzt(p4, 2);
                int v4_6 = 0;
                int v0_6 = 0;
                while (v4_6 < ((com.google.android.gms.internal.play_billing.zzfj) p5).size()) {
                    ((com.google.android.gms.internal.play_billing.zzfj) p5).zze(v4_6);
                    v0_6 += 4;
                    v4_6++;
                }
                v6_4.zzv(v0_6);
                while (v2 < ((com.google.android.gms.internal.play_billing.zzfj) p5).size()) {
                    v6_4.zzh(((com.google.android.gms.internal.play_billing.zzfj) p5).zze(v2));
                    v2++;
                }
                return;
            }
            while (v2 < ((com.google.android.gms.internal.play_billing.zzfj) p5).size()) {
                this.zza.zzg(p4, ((com.google.android.gms.internal.play_billing.zzfj) p5).zze(v2));
                v2++;
            }
        }
        return;
    }

    public final void zzm(int p2, long p3)
    {
        this.zza.zzi(p2, p3);
        return;
    }

    public final void zzn(int p4, java.util.List p5, boolean p6)
    {
        int v2 = 0;
        if (!(p5 instanceof com.google.android.gms.internal.play_billing.zzga)) {
            if (p6 != null) {
                com.google.android.gms.internal.play_billing.zzep v6_1 = this.zza;
                v6_1.zzt(p4, 2);
                Long v4_1 = 0;
                long v0_4 = 0;
                while (v4_1 < p5.size()) {
                    ((Long) p5.get(v4_1)).getClass();
                    v0_4 += 8;
                    v4_1++;
                }
                v6_1.zzv(v0_4);
                while (v2 < p5.size()) {
                    v6_1.zzj(((Long) p5.get(v2)).longValue());
                    v2++;
                }
                return;
            }
            while (v2 < p5.size()) {
                this.zza.zzi(p4, ((Long) p5.get(v2)).longValue());
                v2++;
            }
        } else {
            if (p6 != null) {
                com.google.android.gms.internal.play_billing.zzep v6_4 = this.zza;
                v6_4.zzt(p4, 2);
                Long v4_5 = 0;
                long v0_7 = 0;
                while (v4_5 < ((com.google.android.gms.internal.play_billing.zzga) p5).size()) {
                    ((com.google.android.gms.internal.play_billing.zzga) p5).zze(v4_5);
                    v0_7 += 8;
                    v4_5++;
                }
                v6_4.zzv(v0_7);
                while (v2 < ((com.google.android.gms.internal.play_billing.zzga) p5).size()) {
                    v6_4.zzj(((com.google.android.gms.internal.play_billing.zzga) p5).zze(v2));
                    v2++;
                }
                return;
            }
            while (v2 < ((com.google.android.gms.internal.play_billing.zzga) p5).size()) {
                this.zza.zzi(p4, ((com.google.android.gms.internal.play_billing.zzga) p5).zze(v2));
                v2++;
            }
        }
        return;
    }

    public final void zzo(int p2, float p3)
    {
        this.zza.zzg(p2, Float.floatToRawIntBits(p3));
        return;
    }

    public final void zzp(int p4, java.util.List p5, boolean p6)
    {
        int v2 = 0;
        if (!(p5 instanceof com.google.android.gms.internal.play_billing.zzfb)) {
            if (p6 != null) {
                com.google.android.gms.internal.play_billing.zzep v6_1 = this.zza;
                v6_1.zzt(p4, 2);
                int v4_1 = 0;
                int v0_5 = 0;
                while (v4_1 < p5.size()) {
                    ((Float) p5.get(v4_1)).getClass();
                    v0_5 += 4;
                    v4_1++;
                }
                v6_1.zzv(v0_5);
                while (v2 < p5.size()) {
                    v6_1.zzh(Float.floatToRawIntBits(((Float) p5.get(v2)).floatValue()));
                    v2++;
                }
                return;
            }
            while (v2 < p5.size()) {
                this.zza.zzg(p4, Float.floatToRawIntBits(((Float) p5.get(v2)).floatValue()));
                v2++;
            }
        } else {
            if (p6 != null) {
                com.google.android.gms.internal.play_billing.zzep v6_4 = this.zza;
                v6_4.zzt(p4, 2);
                int v4_7 = 0;
                int v0_8 = 0;
                while (v4_7 < ((com.google.android.gms.internal.play_billing.zzfb) p5).size()) {
                    ((com.google.android.gms.internal.play_billing.zzfb) p5).zze(v4_7);
                    v0_8 += 4;
                    v4_7++;
                }
                v6_4.zzv(v0_8);
                while (v2 < ((com.google.android.gms.internal.play_billing.zzfb) p5).size()) {
                    v6_4.zzh(Float.floatToRawIntBits(((com.google.android.gms.internal.play_billing.zzfb) p5).zze(v2)));
                    v2++;
                }
                return;
            }
            while (v2 < ((com.google.android.gms.internal.play_billing.zzfb) p5).size()) {
                this.zza.zzg(p4, Float.floatToRawIntBits(((com.google.android.gms.internal.play_billing.zzfb) p5).zze(v2)));
                v2++;
            }
        }
        return;
    }

    public final void zzq(int p3, Object p4, com.google.android.gms.internal.play_billing.zzgv p5)
    {
        com.google.android.gms.internal.play_billing.zzep v0 = this.zza;
        v0.zzt(p3, 3);
        p5.zzi(((com.google.android.gms.internal.play_billing.zzgl) p4), v0.zza);
        v0.zzt(p3, 4);
        return;
    }

    public final void zzr(int p2, int p3)
    {
        this.zza.zzk(p2, p3);
        return;
    }

    public final void zzs(int p6, java.util.List p7, boolean p8)
    {
        int v2 = 0;
        if (!(p7 instanceof com.google.android.gms.internal.play_billing.zzfj)) {
            if (p8 != null) {
                com.google.android.gms.internal.play_billing.zzep v8_1 = this.zza;
                v8_1.zzt(p6, 2);
                int v6_1 = 0;
                int v0_4 = 0;
                while (v6_1 < p7.size()) {
                    v0_4 += com.google.android.gms.internal.play_billing.zzep.zzD(((long) ((Integer) p7.get(v6_1)).intValue()));
                    v6_1++;
                }
                v8_1.zzv(v0_4);
                while (v2 < p7.size()) {
                    v8_1.zzl(((Integer) p7.get(v2)).intValue());
                    v2++;
                }
                return;
            }
            while (v2 < p7.size()) {
                this.zza.zzk(p6, ((Integer) p7.get(v2)).intValue());
                v2++;
            }
        } else {
            if (p8 != null) {
                com.google.android.gms.internal.play_billing.zzep v8_4 = this.zza;
                v8_4.zzt(p6, 2);
                int v6_6 = 0;
                int v0_6 = 0;
                while (v6_6 < ((com.google.android.gms.internal.play_billing.zzfj) p7).size()) {
                    v0_6 += com.google.android.gms.internal.play_billing.zzep.zzD(((long) ((com.google.android.gms.internal.play_billing.zzfj) p7).zze(v6_6)));
                    v6_6++;
                }
                v8_4.zzv(v0_6);
                while (v2 < ((com.google.android.gms.internal.play_billing.zzfj) p7).size()) {
                    v8_4.zzl(((com.google.android.gms.internal.play_billing.zzfj) p7).zze(v2));
                    v2++;
                }
                return;
            }
            while (v2 < ((com.google.android.gms.internal.play_billing.zzfj) p7).size()) {
                this.zza.zzk(p6, ((com.google.android.gms.internal.play_billing.zzfj) p7).zze(v2));
                v2++;
            }
        }
        return;
    }

    public final void zzt(int p2, long p3)
    {
        this.zza.zzw(p2, p3);
        return;
    }

    public final void zzu(int p6, java.util.List p7, boolean p8)
    {
        int v2 = 0;
        if (!(p7 instanceof com.google.android.gms.internal.play_billing.zzga)) {
            if (p8 != null) {
                com.google.android.gms.internal.play_billing.zzep v8_1 = this.zza;
                v8_1.zzt(p6, 2);
                Long v6_1 = 0;
                long v0_4 = 0;
                while (v6_1 < p7.size()) {
                    v0_4 += com.google.android.gms.internal.play_billing.zzep.zzD(((Long) p7.get(v6_1)).longValue());
                    v6_1++;
                }
                v8_1.zzv(v0_4);
                while (v2 < p7.size()) {
                    v8_1.zzx(((Long) p7.get(v2)).longValue());
                    v2++;
                }
                return;
            }
            while (v2 < p7.size()) {
                this.zza.zzw(p6, ((Long) p7.get(v2)).longValue());
                v2++;
            }
        } else {
            if (p8 != null) {
                com.google.android.gms.internal.play_billing.zzep v8_4 = this.zza;
                v8_4.zzt(p6, 2);
                Long v6_5 = 0;
                long v0_7 = 0;
                while (v6_5 < ((com.google.android.gms.internal.play_billing.zzga) p7).size()) {
                    v0_7 += com.google.android.gms.internal.play_billing.zzep.zzD(((com.google.android.gms.internal.play_billing.zzga) p7).zze(v6_5));
                    v6_5++;
                }
                v8_4.zzv(v0_7);
                while (v2 < ((com.google.android.gms.internal.play_billing.zzga) p7).size()) {
                    v8_4.zzx(((com.google.android.gms.internal.play_billing.zzga) p7).zze(v2));
                    v2++;
                }
                return;
            }
            while (v2 < ((com.google.android.gms.internal.play_billing.zzga) p7).size()) {
                this.zza.zzw(p6, ((com.google.android.gms.internal.play_billing.zzga) p7).zze(v2));
                v2++;
            }
        }
        return;
    }

    public final void zzv(int p2, Object p3, com.google.android.gms.internal.play_billing.zzgv p4)
    {
        this.zza.zzn(p2, ((com.google.android.gms.internal.play_billing.zzgl) p3), p4);
        return;
    }

    public final void zzw(int p2, Object p3)
    {
        if (!(p3 instanceof com.google.android.gms.internal.play_billing.zzei)) {
            this.zza.zzp(p2, ((com.google.android.gms.internal.play_billing.zzgl) p3));
            return;
        } else {
            this.zza.zzq(p2, ((com.google.android.gms.internal.play_billing.zzei) p3));
            return;
        }
    }

    public final void zzx(int p2, int p3)
    {
        this.zza.zzg(p2, p3);
        return;
    }

    public final void zzy(int p4, java.util.List p5, boolean p6)
    {
        int v2 = 0;
        if (!(p5 instanceof com.google.android.gms.internal.play_billing.zzfj)) {
            if (p6 != null) {
                com.google.android.gms.internal.play_billing.zzep v6_1 = this.zza;
                v6_1.zzt(p4, 2);
                int v4_1 = 0;
                int v0_4 = 0;
                while (v4_1 < p5.size()) {
                    ((Integer) p5.get(v4_1)).getClass();
                    v0_4 += 4;
                    v4_1++;
                }
                v6_1.zzv(v0_4);
                while (v2 < p5.size()) {
                    v6_1.zzh(((Integer) p5.get(v2)).intValue());
                    v2++;
                }
                return;
            }
            while (v2 < p5.size()) {
                this.zza.zzg(p4, ((Integer) p5.get(v2)).intValue());
                v2++;
            }
        } else {
            if (p6 != null) {
                com.google.android.gms.internal.play_billing.zzep v6_4 = this.zza;
                v6_4.zzt(p4, 2);
                int v4_6 = 0;
                int v0_6 = 0;
                while (v4_6 < ((com.google.android.gms.internal.play_billing.zzfj) p5).size()) {
                    ((com.google.android.gms.internal.play_billing.zzfj) p5).zze(v4_6);
                    v0_6 += 4;
                    v4_6++;
                }
                v6_4.zzv(v0_6);
                while (v2 < ((com.google.android.gms.internal.play_billing.zzfj) p5).size()) {
                    v6_4.zzh(((com.google.android.gms.internal.play_billing.zzfj) p5).zze(v2));
                    v2++;
                }
                return;
            }
            while (v2 < ((com.google.android.gms.internal.play_billing.zzfj) p5).size()) {
                this.zza.zzg(p4, ((com.google.android.gms.internal.play_billing.zzfj) p5).zze(v2));
                v2++;
            }
        }
        return;
    }

    public final void zzz(int p2, long p3)
    {
        this.zza.zzi(p2, p3);
        return;
    }
}
