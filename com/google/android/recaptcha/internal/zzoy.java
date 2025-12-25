package com.google.android.recaptcha.internal;
final class zzoy {
    public static final synthetic int zza;
    private static final com.google.android.recaptcha.internal.zzpl zzb;

    static zzoy()
    {
        com.google.android.recaptcha.internal.zzoy.zzb = new com.google.android.recaptcha.internal.zzpn();
        return;
    }

    public static void zzA(int p1, java.util.List p2, com.google.android.recaptcha.internal.zzpy p3, boolean p4)
    {
        if ((p2 != null) && (!p2.isEmpty())) {
            p3.zzA(p1, p2, p4);
        }
        return;
    }

    public static void zzB(int p1, java.util.List p2, com.google.android.recaptcha.internal.zzpy p3, boolean p4)
    {
        if ((p2 != null) && (!p2.isEmpty())) {
            p3.zzC(p1, p2, p4);
        }
        return;
    }

    public static void zzC(int p1, java.util.List p2, com.google.android.recaptcha.internal.zzpy p3, boolean p4)
    {
        if ((p2 != null) && (!p2.isEmpty())) {
            p3.zzE(p1, p2, p4);
        }
        return;
    }

    public static void zzD(int p1, java.util.List p2, com.google.android.recaptcha.internal.zzpy p3, boolean p4)
    {
        if ((p2 != null) && (!p2.isEmpty())) {
            p3.zzJ(p1, p2, p4);
        }
        return;
    }

    public static void zzE(int p1, java.util.List p2, com.google.android.recaptcha.internal.zzpy p3, boolean p4)
    {
        if ((p2 != null) && (!p2.isEmpty())) {
            p3.zzL(p1, p2, p4);
        }
        return;
    }

    public static boolean zzF(Object p2, Object p3)
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
            if (!(p5 instanceof com.google.android.recaptcha.internal.zzne)) {
                int v2_0 = 0;
                while (v1 < v0) {
                    v2_0 += com.google.android.recaptcha.internal.zzln.zzB(((long) ((Integer) p5.get(v1)).intValue()));
                    v1++;
                }
                return v2_0;
            } else {
                int v2_1 = 0;
                while (v1 < v0) {
                    v2_1 += com.google.android.recaptcha.internal.zzln.zzB(((long) ((com.google.android.recaptcha.internal.zzne) p5).zze(v1)));
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
            return ((com.google.android.recaptcha.internal.zzln.zzA((p0 << 3)) + 4) * v1_1);
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
            return ((com.google.android.recaptcha.internal.zzln.zzA((p0 << 3)) + 8) * v1_1);
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
            if (!(p5 instanceof com.google.android.recaptcha.internal.zzne)) {
                int v2_0 = 0;
                while (v1 < v0) {
                    v2_0 += com.google.android.recaptcha.internal.zzln.zzB(((long) ((Integer) p5.get(v1)).intValue()));
                    v1++;
                }
                return v2_0;
            } else {
                int v2_1 = 0;
                while (v1 < v0) {
                    v2_1 += com.google.android.recaptcha.internal.zzln.zzB(((long) ((com.google.android.recaptcha.internal.zzne) p5).zze(v1)));
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
            if (!(p5 instanceof com.google.android.recaptcha.internal.zznx)) {
                int v2_0 = 0;
                while (v1 < v0) {
                    v2_0 += com.google.android.recaptcha.internal.zzln.zzB(((Long) p5.get(v1)).longValue());
                    v1++;
                }
                return v2_0;
            } else {
                int v2_1 = 0;
                while (v1 < v0) {
                    v2_1 += com.google.android.recaptcha.internal.zzln.zzB(((com.google.android.recaptcha.internal.zznx) p5).zze(v1));
                    v1++;
                }
                return v2_1;
            }
        } else {
            return 0;
        }
    }

    public static int zzh(int p1, Object p2, com.google.android.recaptcha.internal.zzow p3)
    {
        int v1_1 = (p1 << 3);
        if (!(p2 instanceof com.google.android.recaptcha.internal.zznt)) {
            return (com.google.android.recaptcha.internal.zzln.zzy(((com.google.android.recaptcha.internal.zzoi) p2), p3) + com.google.android.recaptcha.internal.zzln.zzA(v1_1));
        } else {
            return v1.a.w(((com.google.android.recaptcha.internal.zznt) p2).zza(), ((com.google.android.recaptcha.internal.zznt) p2).zza(), com.google.android.recaptcha.internal.zzln.zzA(v1_1));
        }
    }

    public static int zzi(java.util.List p5)
    {
        int v0 = p5.size();
        int v1 = 0;
        if (v0 != 0) {
            if (!(p5 instanceof com.google.android.recaptcha.internal.zzne)) {
                int v2_0 = 0;
                while (v1 < v0) {
                    int v3_2 = ((Integer) p5.get(v1)).intValue();
                    v2_0 += com.google.android.recaptcha.internal.zzln.zzA(((v3_2 >> 31) ^ (v3_2 + v3_2)));
                    v1++;
                }
                return v2_0;
            } else {
                int v2_1 = 0;
                while (v1 < v0) {
                    int v3_6 = ((com.google.android.recaptcha.internal.zzne) p5).zze(v1);
                    v2_1 += com.google.android.recaptcha.internal.zzln.zzA(((v3_6 >> 31) ^ (v3_6 + v3_6)));
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
            if (!(p8 instanceof com.google.android.recaptcha.internal.zznx)) {
                int v2_0 = 0;
                while (v1 < v0) {
                    int v4_2 = ((Long) p8.get(v1)).longValue();
                    v2_0 += com.google.android.recaptcha.internal.zzln.zzB(((v4_2 >> 63) ^ (v4_2 + v4_2)));
                    v1++;
                }
                return v2_0;
            } else {
                int v2_1 = 0;
                while (v1 < v0) {
                    int v4_6 = ((com.google.android.recaptcha.internal.zznx) p8).zze(v1);
                    v2_1 += com.google.android.recaptcha.internal.zzln.zzB(((v4_6 >> 63) ^ (v4_6 + v4_6)));
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
            if (!(p4 instanceof com.google.android.recaptcha.internal.zzne)) {
                int v2_0 = 0;
                while (v1 < v0) {
                    v2_0 += com.google.android.recaptcha.internal.zzln.zzA(((Integer) p4.get(v1)).intValue());
                    v1++;
                }
                return v2_0;
            } else {
                int v2_1 = 0;
                while (v1 < v0) {
                    v2_1 += com.google.android.recaptcha.internal.zzln.zzA(((com.google.android.recaptcha.internal.zzne) p4).zze(v1));
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
            if (!(p5 instanceof com.google.android.recaptcha.internal.zznx)) {
                int v2_0 = 0;
                while (v1 < v0) {
                    v2_0 += com.google.android.recaptcha.internal.zzln.zzB(((Long) p5.get(v1)).longValue());
                    v1++;
                }
                return v2_0;
            } else {
                int v2_1 = 0;
                while (v1 < v0) {
                    v2_1 += com.google.android.recaptcha.internal.zzln.zzB(((com.google.android.recaptcha.internal.zznx) p5).zze(v1));
                    v1++;
                }
                return v2_1;
            }
        } else {
            return 0;
        }
    }

    public static com.google.android.recaptcha.internal.zzpl zzm()
    {
        return com.google.android.recaptcha.internal.zzoy.zzb;
    }

    public static Object zzn(Object p6, int p7, java.util.List p8, com.google.android.recaptcha.internal.zznh p9, Object p10, com.google.android.recaptcha.internal.zzpl p11)
    {
        if (p9 != null) {
            if (!(p8 instanceof java.util.RandomAccess)) {
                java.util.Iterator v8_1 = p8.iterator();
                while (v8_1.hasNext()) {
                    int v0_3 = ((Integer) v8_1.next()).intValue();
                    if (!p9.zza(v0_3)) {
                        p10 = com.google.android.recaptcha.internal.zzoy.zzo(p6, p7, v0_3, p10, p11);
                        v8_1.remove();
                    }
                }
                return p10;
            } else {
                int v0_4 = p8.size();
                int v1_1 = 0;
                int v2 = 0;
                while (v1_1 < v0_4) {
                    Integer v3_1 = ((Integer) p8.get(v1_1));
                    int v4 = v3_1.intValue();
                    if (!p9.zza(v4)) {
                        p10 = com.google.android.recaptcha.internal.zzoy.zzo(p6, p7, v4, p10, p11);
                    } else {
                        if (v1_1 != v2) {
                            p8.set(v2, v3_1);
                        }
                        v2++;
                    }
                    v1_1++;
                }
                if (v2 != v0_4) {
                    p8.subList(v2, v0_4).clear();
                }
                return p10;
            }
        } else {
            return p10;
        }
    }

    public static Object zzo(Object p2, int p3, int p4, Object p5, com.google.android.recaptcha.internal.zzpl p6)
    {
        if (p5 == null) {
            p5 = p6.zza(p2);
        }
        p6.zzh(p5, p3, ((long) p4));
        return p5;
    }

    public static void zzp(com.google.android.recaptcha.internal.zzmp p0, Object p1, Object p2)
    {
        p0 = ((com.google.android.recaptcha.internal.zzna) p2).zzb;
        if (!p0.zza.isEmpty()) {
            ((com.google.android.recaptcha.internal.zzna) p1).zzi().zzh(p0);
        }
        return;
    }

    public static void zzq(com.google.android.recaptcha.internal.zzpl p1, Object p2, Object p3)
    {
        p1 = ((com.google.android.recaptcha.internal.zznd) p2).zzc;
        com.google.android.recaptcha.internal.zzpm v3_2 = ((com.google.android.recaptcha.internal.zznd) p3).zzc;
        if (!com.google.android.recaptcha.internal.zzpm.zzc().equals(v3_2)) {
            if (!com.google.android.recaptcha.internal.zzpm.zzc().equals(p1)) {
                p1.zzd(v3_2);
            } else {
                p1 = com.google.android.recaptcha.internal.zzpm.zze(p1, v3_2);
            }
        }
        ((com.google.android.recaptcha.internal.zznd) p2).zzc = p1;
        return;
    }

    public static void zzr(int p1, java.util.List p2, com.google.android.recaptcha.internal.zzpy p3, boolean p4)
    {
        if ((p2 != null) && (!p2.isEmpty())) {
            p3.zzc(p1, p2, p4);
        }
        return;
    }

    public static void zzs(int p1, java.util.List p2, com.google.android.recaptcha.internal.zzpy p3, boolean p4)
    {
        if ((p2 != null) && (!p2.isEmpty())) {
            p3.zzg(p1, p2, p4);
        }
        return;
    }

    public static void zzt(int p1, java.util.List p2, com.google.android.recaptcha.internal.zzpy p3, boolean p4)
    {
        if ((p2 != null) && (!p2.isEmpty())) {
            p3.zzj(p1, p2, p4);
        }
        return;
    }

    public static void zzu(int p1, java.util.List p2, com.google.android.recaptcha.internal.zzpy p3, boolean p4)
    {
        if ((p2 != null) && (!p2.isEmpty())) {
            p3.zzl(p1, p2, p4);
        }
        return;
    }

    public static void zzv(int p1, java.util.List p2, com.google.android.recaptcha.internal.zzpy p3, boolean p4)
    {
        if ((p2 != null) && (!p2.isEmpty())) {
            p3.zzn(p1, p2, p4);
        }
        return;
    }

    public static void zzw(int p1, java.util.List p2, com.google.android.recaptcha.internal.zzpy p3, boolean p4)
    {
        if ((p2 != null) && (!p2.isEmpty())) {
            p3.zzp(p1, p2, p4);
        }
        return;
    }

    public static void zzx(int p1, java.util.List p2, com.google.android.recaptcha.internal.zzpy p3, boolean p4)
    {
        if ((p2 != null) && (!p2.isEmpty())) {
            p3.zzs(p1, p2, p4);
        }
        return;
    }

    public static void zzy(int p1, java.util.List p2, com.google.android.recaptcha.internal.zzpy p3, boolean p4)
    {
        if ((p2 != null) && (!p2.isEmpty())) {
            p3.zzu(p1, p2, p4);
        }
        return;
    }

    public static void zzz(int p1, java.util.List p2, com.google.android.recaptcha.internal.zzpy p3, boolean p4)
    {
        if ((p2 != null) && (!p2.isEmpty())) {
            p3.zzy(p1, p2, p4);
        }
        return;
    }
}
