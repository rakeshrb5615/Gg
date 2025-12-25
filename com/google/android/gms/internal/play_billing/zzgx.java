package com.google.android.gms.internal.play_billing;
final class zzgx {
    public static final synthetic int zza;
    private static final com.google.android.gms.internal.play_billing.zzhh zzb;

    static zzgx()
    {
        com.google.android.gms.internal.play_billing.zzgx.zzb = new com.google.android.gms.internal.play_billing.zzhj();
        return;
    }

    public static void zzA(int p1, java.util.List p2, com.google.android.gms.internal.play_billing.zzhu p3, boolean p4)
    {
        if ((p2 != null) && (!p2.isEmpty())) {
            p3.zzC(p1, p2, p4);
        }
        return;
    }

    public static void zzB(int p1, java.util.List p2, com.google.android.gms.internal.play_billing.zzhu p3, boolean p4)
    {
        if ((p2 != null) && (!p2.isEmpty())) {
            p3.zzE(p1, p2, p4);
        }
        return;
    }

    public static void zzC(int p1, java.util.List p2, com.google.android.gms.internal.play_billing.zzhu p3, boolean p4)
    {
        if ((p2 != null) && (!p2.isEmpty())) {
            p3.zzJ(p1, p2, p4);
        }
        return;
    }

    public static void zzD(int p1, java.util.List p2, com.google.android.gms.internal.play_billing.zzhu p3, boolean p4)
    {
        if ((p2 != null) && (!p2.isEmpty())) {
            p3.zzL(p1, p2, p4);
        }
        return;
    }

    public static boolean zzE(Object p2, Object p3)
    {
        if (p2 == p3) {
            return 1;
        } else {
            if ((!p2) || (!p2.equals(p3))) {
                return 0;
            } else {
                return 1;
            }
        }
    }

    public static int zza(java.util.List p5)
    {
        int v0 = p5.size();
        int v1 = 0;
        if (v0 != 0) {
            if (!(p5 instanceof com.google.android.gms.internal.play_billing.zzfj)) {
                int v2_0 = 0;
                while (v1 < v0) {
                    v2_0 += com.google.android.gms.internal.play_billing.zzep.zzD(((long) ((Integer) p5.get(v1)).intValue()));
                    v1++;
                }
                return v2_0;
            } else {
                int v2_1 = 0;
                while (v1 < v0) {
                    v2_1 += com.google.android.gms.internal.play_billing.zzep.zzD(((long) ((com.google.android.gms.internal.play_billing.zzfj) p5).zze(v1)));
                    v1++;
                }
                return v2_1;
            }
        } else {
            return 0;
        }
    }

    public static int zzb(int p0, java.util.List p1, boolean p2)
    {
        int v1_1 = p1.size();
        if (v1_1 != 0) {
            return ((com.google.android.gms.internal.play_billing.zzep.zzC((p0 << 3)) + 4) * v1_1);
        } else {
            return 0;
        }
    }

    public static int zzc(java.util.List p0)
    {
        return (p0.size() * 4);
    }

    public static int zzd(int p0, java.util.List p1, boolean p2)
    {
        int v1_1 = p1.size();
        if (v1_1 != 0) {
            return ((com.google.android.gms.internal.play_billing.zzep.zzC((p0 << 3)) + 8) * v1_1);
        } else {
            return 0;
        }
    }

    public static int zze(java.util.List p0)
    {
        return (p0.size() * 8);
    }

    public static int zzf(java.util.List p5)
    {
        int v0 = p5.size();
        int v1 = 0;
        if (v0 != 0) {
            if (!(p5 instanceof com.google.android.gms.internal.play_billing.zzfj)) {
                int v2_0 = 0;
                while (v1 < v0) {
                    v2_0 += com.google.android.gms.internal.play_billing.zzep.zzD(((long) ((Integer) p5.get(v1)).intValue()));
                    v1++;
                }
                return v2_0;
            } else {
                int v2_1 = 0;
                while (v1 < v0) {
                    v2_1 += com.google.android.gms.internal.play_billing.zzep.zzD(((long) ((com.google.android.gms.internal.play_billing.zzfj) p5).zze(v1)));
                    v1++;
                }
                return v2_1;
            }
        } else {
            return 0;
        }
    }

    public static int zzg(java.util.List p5)
    {
        int v0 = p5.size();
        int v1 = 0;
        if (v0 != 0) {
            if (!(p5 instanceof com.google.android.gms.internal.play_billing.zzga)) {
                int v2_0 = 0;
                while (v1 < v0) {
                    v2_0 += com.google.android.gms.internal.play_billing.zzep.zzD(((Long) p5.get(v1)).longValue());
                    v1++;
                }
                return v2_0;
            } else {
                int v2_1 = 0;
                while (v1 < v0) {
                    v2_1 += com.google.android.gms.internal.play_billing.zzep.zzD(((com.google.android.gms.internal.play_billing.zzga) p5).zze(v1));
                    v1++;
                }
                return v2_1;
            }
        } else {
            return 0;
        }
    }

    public static int zzh(int p1, Object p2, com.google.android.gms.internal.play_billing.zzgv p3)
    {
        int v1_1 = (p1 << 3);
        if (!(p2 instanceof com.google.android.gms.internal.play_billing.zzfw)) {
            return (com.google.android.gms.internal.play_billing.zzep.zzA(((com.google.android.gms.internal.play_billing.zzgl) p2), p3) + com.google.android.gms.internal.play_billing.zzep.zzC(v1_1));
        } else {
            return v1.a.u(((com.google.android.gms.internal.play_billing.zzfw) p2).zza(), ((com.google.android.gms.internal.play_billing.zzfw) p2).zza(), com.google.android.gms.internal.play_billing.zzep.zzC(v1_1));
        }
    }

    public static int zzi(java.util.List p5)
    {
        int v0 = p5.size();
        int v1 = 0;
        if (v0 != 0) {
            if (!(p5 instanceof com.google.android.gms.internal.play_billing.zzfj)) {
                int v2_0 = 0;
                while (v1 < v0) {
                    int v3_2 = ((Integer) p5.get(v1)).intValue();
                    v2_0 += com.google.android.gms.internal.play_billing.zzep.zzC(((v3_2 >> 31) ^ (v3_2 + v3_2)));
                    v1++;
                }
                return v2_0;
            } else {
                int v2_1 = 0;
                while (v1 < v0) {
                    int v3_6 = ((com.google.android.gms.internal.play_billing.zzfj) p5).zze(v1);
                    v2_1 += com.google.android.gms.internal.play_billing.zzep.zzC(((v3_6 >> 31) ^ (v3_6 + v3_6)));
                    v1++;
                }
                return v2_1;
            }
        } else {
            return 0;
        }
    }

    public static int zzj(java.util.List p8)
    {
        int v0 = p8.size();
        int v1 = 0;
        if (v0 != 0) {
            if (!(p8 instanceof com.google.android.gms.internal.play_billing.zzga)) {
                int v2_0 = 0;
                while (v1 < v0) {
                    int v4_2 = ((Long) p8.get(v1)).longValue();
                    v2_0 += com.google.android.gms.internal.play_billing.zzep.zzD(((v4_2 >> 63) ^ (v4_2 + v4_2)));
                    v1++;
                }
                return v2_0;
            } else {
                int v2_1 = 0;
                while (v1 < v0) {
                    int v4_6 = ((com.google.android.gms.internal.play_billing.zzga) p8).zze(v1);
                    v2_1 += com.google.android.gms.internal.play_billing.zzep.zzD(((v4_6 >> 63) ^ (v4_6 + v4_6)));
                    v1++;
                }
                return v2_1;
            }
        } else {
            return 0;
        }
    }

    public static int zzk(java.util.List p4)
    {
        int v0 = p4.size();
        int v1 = 0;
        if (v0 != 0) {
            if (!(p4 instanceof com.google.android.gms.internal.play_billing.zzfj)) {
                int v2_0 = 0;
                while (v1 < v0) {
                    v2_0 += com.google.android.gms.internal.play_billing.zzep.zzC(((Integer) p4.get(v1)).intValue());
                    v1++;
                }
                return v2_0;
            } else {
                int v2_1 = 0;
                while (v1 < v0) {
                    v2_1 += com.google.android.gms.internal.play_billing.zzep.zzC(((com.google.android.gms.internal.play_billing.zzfj) p4).zze(v1));
                    v1++;
                }
                return v2_1;
            }
        } else {
            return 0;
        }
    }

    public static int zzl(java.util.List p5)
    {
        int v0 = p5.size();
        int v1 = 0;
        if (v0 != 0) {
            if (!(p5 instanceof com.google.android.gms.internal.play_billing.zzga)) {
                int v2_0 = 0;
                while (v1 < v0) {
                    v2_0 += com.google.android.gms.internal.play_billing.zzep.zzD(((Long) p5.get(v1)).longValue());
                    v1++;
                }
                return v2_0;
            } else {
                int v2_1 = 0;
                while (v1 < v0) {
                    v2_1 += com.google.android.gms.internal.play_billing.zzep.zzD(((com.google.android.gms.internal.play_billing.zzga) p5).zze(v1));
                    v1++;
                }
                return v2_1;
            }
        } else {
            return 0;
        }
    }

    public static com.google.android.gms.internal.play_billing.zzhh zzm()
    {
        return com.google.android.gms.internal.play_billing.zzgx.zzb;
    }

    public static Object zzn(Object p2, int p3, int p4, Object p5, com.google.android.gms.internal.play_billing.zzhh p6)
    {
        if (p5 == null) {
            p5 = p6.zza(p2);
        }
        ((com.google.android.gms.internal.play_billing.zzhi) p5).zzj((p3 << 3), Long.valueOf(((long) p4)));
        return p5;
    }

    public static void zzo(com.google.android.gms.internal.play_billing.zzev p0, Object p1, Object p2)
    {
        if (!((com.google.android.gms.internal.play_billing.zzff) p2).zzb.zza.isEmpty()) {
            throw 0;
        } else {
            return;
        }
    }

    public static void zzp(com.google.android.gms.internal.play_billing.zzhh p1, Object p2, Object p3)
    {
        p1 = ((com.google.android.gms.internal.play_billing.zzfi) p2).zzc;
        com.google.android.gms.internal.play_billing.zzhi v3_2 = ((com.google.android.gms.internal.play_billing.zzfi) p3).zzc;
        if (!com.google.android.gms.internal.play_billing.zzhi.zzc().equals(v3_2)) {
            if (!com.google.android.gms.internal.play_billing.zzhi.zzc().equals(p1)) {
                p1.zzd(v3_2);
            } else {
                p1 = com.google.android.gms.internal.play_billing.zzhi.zze(p1, v3_2);
            }
        }
        ((com.google.android.gms.internal.play_billing.zzfi) p2).zzc = p1;
        return;
    }

    public static void zzq(int p1, java.util.List p2, com.google.android.gms.internal.play_billing.zzhu p3, boolean p4)
    {
        if ((p2 != null) && (!p2.isEmpty())) {
            p3.zzc(p1, p2, p4);
        }
        return;
    }

    public static void zzr(int p1, java.util.List p2, com.google.android.gms.internal.play_billing.zzhu p3, boolean p4)
    {
        if ((p2 != null) && (!p2.isEmpty())) {
            p3.zzg(p1, p2, p4);
        }
        return;
    }

    public static void zzs(int p1, java.util.List p2, com.google.android.gms.internal.play_billing.zzhu p3, boolean p4)
    {
        if ((p2 != null) && (!p2.isEmpty())) {
            p3.zzj(p1, p2, p4);
        }
        return;
    }

    public static void zzt(int p1, java.util.List p2, com.google.android.gms.internal.play_billing.zzhu p3, boolean p4)
    {
        if ((p2 != null) && (!p2.isEmpty())) {
            p3.zzl(p1, p2, p4);
        }
        return;
    }

    public static void zzu(int p1, java.util.List p2, com.google.android.gms.internal.play_billing.zzhu p3, boolean p4)
    {
        if ((p2 != null) && (!p2.isEmpty())) {
            p3.zzn(p1, p2, p4);
        }
        return;
    }

    public static void zzv(int p1, java.util.List p2, com.google.android.gms.internal.play_billing.zzhu p3, boolean p4)
    {
        if ((p2 != null) && (!p2.isEmpty())) {
            p3.zzp(p1, p2, p4);
        }
        return;
    }

    public static void zzw(int p1, java.util.List p2, com.google.android.gms.internal.play_billing.zzhu p3, boolean p4)
    {
        if ((p2 != null) && (!p2.isEmpty())) {
            p3.zzs(p1, p2, p4);
        }
        return;
    }

    public static void zzx(int p1, java.util.List p2, com.google.android.gms.internal.play_billing.zzhu p3, boolean p4)
    {
        if ((p2 != null) && (!p2.isEmpty())) {
            p3.zzu(p1, p2, p4);
        }
        return;
    }

    public static void zzy(int p1, java.util.List p2, com.google.android.gms.internal.play_billing.zzhu p3, boolean p4)
    {
        if ((p2 != null) && (!p2.isEmpty())) {
            p3.zzy(p1, p2, p4);
        }
        return;
    }

    public static void zzz(int p1, java.util.List p2, com.google.android.gms.internal.play_billing.zzhu p3, boolean p4)
    {
        if ((p2 != null) && (!p2.isEmpty())) {
            p3.zzA(p1, p2, p4);
        }
        return;
    }
}
