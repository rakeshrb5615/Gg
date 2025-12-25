package com.google.android.gms.internal.firebase-auth-api;
final class zzand {
    private static final com.google.android.gms.internal.firebase-auth-api.zzanu zza;

    static zzand()
    {
        com.google.android.gms.internal.firebase-auth-api.zzand.zza = new com.google.android.gms.internal.firebase-auth-api.zzanw();
        return;
    }

    public static int zza(int p0, com.google.android.gms.internal.firebase-auth-api.zzamm p1, com.google.android.gms.internal.firebase-auth-api.zzanb p2)
    {
        return (((com.google.android.gms.internal.firebase-auth-api.zzajm) p1).zza(p2) + (com.google.android.gms.internal.firebase-auth-api.zzakn.zzh(p0) << 1));
    }

    public static int zza(int p1, Object p2, com.google.android.gms.internal.firebase-auth-api.zzanb p3)
    {
        if (!(p2 instanceof com.google.android.gms.internal.firebase-auth-api.zzalu)) {
            return (com.google.android.gms.internal.firebase-auth-api.zzakn.zzh(p1) + com.google.android.gms.internal.firebase-auth-api.zzand.zza(((com.google.android.gms.internal.firebase-auth-api.zzajm) p2), p3));
        } else {
            return com.google.android.gms.internal.firebase-auth-api.zzakn.zzb(p1, ((com.google.android.gms.internal.firebase-auth-api.zzalu) p2));
        }
    }

    public static int zza(int p2, java.util.List p3)
    {
        int v0_0 = p3.size();
        int v1 = 0;
        if (v0_0 != 0) {
            int v2_1 = (com.google.android.gms.internal.firebase-auth-api.zzakn.zzh(p2) * v0_0);
            while (v1 < p3.size()) {
                v2_1 += com.google.android.gms.internal.firebase-auth-api.zzakn.zza(((com.google.android.gms.internal.firebase-auth-api.zzajv) p3.get(v1)));
                v1++;
            }
            return v2_1;
        } else {
            return 0;
        }
    }

    public static int zza(int p4, java.util.List p5, com.google.android.gms.internal.firebase-auth-api.zzanb p6)
    {
        int v0 = p5.size();
        int v1 = 0;
        if (v0 != 0) {
            int v2 = 0;
            while (v1 < v0) {
                v2 += com.google.android.gms.internal.firebase-auth-api.zzand.zza(p4, ((com.google.android.gms.internal.firebase-auth-api.zzamm) p5.get(v1)), p6);
                v1++;
            }
            return v2;
        } else {
            return 0;
        }
    }

    public static int zza(int p0, java.util.List p1, boolean p2)
    {
        int v1_1 = p1.size();
        if (v1_1 != 0) {
            return (com.google.android.gms.internal.firebase-auth-api.zzakn.zza(p0, 1) * v1_1);
        } else {
            return 0;
        }
    }

    private static int zza(com.google.android.gms.internal.firebase-auth-api.zzajm p0, com.google.android.gms.internal.firebase-auth-api.zzanb p1)
    {
        return com.google.android.gms.internal.firebase-auth-api.zzakn.zzd(p0.zza(p1));
    }

    public static int zza(java.util.List p0)
    {
        return p0.size();
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzanu zza()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzand.zza;
    }

    public static Object zza(Object p2, int p3, int p4, Object p5, com.google.android.gms.internal.firebase-auth-api.zzanu p6)
    {
        if (p5 == null) {
            p5 = p6.zzc(p2);
        }
        p6.zzb(p5, p3, ((long) p4));
        return p5;
    }

    public static Object zza(Object p6, int p7, java.util.List p8, com.google.android.gms.internal.firebase-auth-api.zzalj p9, Object p10, com.google.android.gms.internal.firebase-auth-api.zzanu p11)
    {
        if (p9 != null) {
            if (!(p8 instanceof java.util.RandomAccess)) {
                java.util.Iterator v8_1 = p8.iterator();
                while (v8_1.hasNext()) {
                    int v0_3 = ((Integer) v8_1.next()).intValue();
                    if (!p9.zza(v0_3)) {
                        p10 = com.google.android.gms.internal.firebase-auth-api.zzand.zza(p6, p7, v0_3, p10, p11);
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
                        p10 = com.google.android.gms.internal.firebase-auth-api.zzand.zza(p6, p7, v4, p10, p11);
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

    public static void zza(int p1, java.util.List p2, com.google.android.gms.internal.firebase-auth-api.zzaol p3)
    {
        if ((p2 != null) && (!p2.isEmpty())) {
            p3.zza(p1, p2);
        }
        return;
    }

    public static void zza(int p1, java.util.List p2, com.google.android.gms.internal.firebase-auth-api.zzaol p3, com.google.android.gms.internal.firebase-auth-api.zzanb p4)
    {
        if ((p2 != null) && (!p2.isEmpty())) {
            p3.zza(p1, p2, p4);
        }
        return;
    }

    public static void zza(int p1, java.util.List p2, com.google.android.gms.internal.firebase-auth-api.zzaol p3, boolean p4)
    {
        if ((p2 != null) && (!p2.isEmpty())) {
            p3.zza(p1, p2, p4);
        }
        return;
    }

    public static void zza(com.google.android.gms.internal.firebase-auth-api.zzakw p1, Object p2, Object p3)
    {
        com.google.android.gms.internal.firebase-auth-api.zzakx v3_1 = p1.zza(p3);
        if (!v3_1.zza.isEmpty()) {
            p1.zzb(p2).zza(v3_1);
        }
        return;
    }

    public static void zza(com.google.android.gms.internal.firebase-auth-api.zzamf p1, Object p2, Object p3, long p4)
    {
        com.google.android.gms.internal.firebase-auth-api.zzanz.zza(p2, p4, p1.zza(com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p2, p4), com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p3, p4)));
        return;
    }

    public static void zza(com.google.android.gms.internal.firebase-auth-api.zzanu p1, Object p2, Object p3)
    {
        p1.zzc(p2, p1.zza(p1.zzd(p2), p1.zzd(p3)));
        return;
    }

    public static void zza(Class p1)
    {
        com.google.android.gms.internal.firebase-auth-api.zzalf.isAssignableFrom(p1);
        return;
    }

    public static boolean zza(Object p0, Object p1)
    {
        if ((p0 != p1) && ((p0 == 0) || (!p0.equals(p1)))) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int zzb(int p4, java.util.List p5)
    {
        int v0 = p5.size();
        int v1 = 0;
        if (v0 != 0) {
            int v4_1 = (com.google.android.gms.internal.firebase-auth-api.zzakn.zzh(p4) * v0);
            if ((p5 instanceof com.google.android.gms.internal.firebase-auth-api.zzalt)) {
                while (v1 < v0) {
                    int v2_7;
                    int v2_5 = ((com.google.android.gms.internal.firebase-auth-api.zzalt) p5).zza(v1);
                    if (!(v2_5 instanceof com.google.android.gms.internal.firebase-auth-api.zzajv)) {
                        v2_7 = com.google.android.gms.internal.firebase-auth-api.zzakn.zza(((String) v2_5));
                    } else {
                        v2_7 = com.google.android.gms.internal.firebase-auth-api.zzakn.zza(((com.google.android.gms.internal.firebase-auth-api.zzajv) v2_5));
                    }
                    v4_1 = (v2_7 + v4_1);
                    v1++;
                }
                return v4_1;
            }
            while (v1 < v0) {
                int v2_2;
                int v2_0 = p5.get(v1);
                if (!(v2_0 instanceof com.google.android.gms.internal.firebase-auth-api.zzajv)) {
                    v2_2 = com.google.android.gms.internal.firebase-auth-api.zzakn.zza(((String) v2_0));
                } else {
                    v2_2 = com.google.android.gms.internal.firebase-auth-api.zzakn.zza(((com.google.android.gms.internal.firebase-auth-api.zzajv) v2_0));
                }
                v4_1 = (v2_2 + v4_1);
                v1++;
            }
            return v4_1;
        } else {
            return 0;
        }
    }

    public static int zzb(int p4, java.util.List p5, com.google.android.gms.internal.firebase-auth-api.zzanb p6)
    {
        int v0 = p5.size();
        int v1 = 0;
        if (v0 != 0) {
            int v4_1 = (com.google.android.gms.internal.firebase-auth-api.zzakn.zzh(p4) * v0);
            while (v1 < v0) {
                int v2_0 = p5.get(v1);
                if (!(v2_0 instanceof com.google.android.gms.internal.firebase-auth-api.zzalu)) {
                    v4_1 += com.google.android.gms.internal.firebase-auth-api.zzand.zza(((com.google.android.gms.internal.firebase-auth-api.zzajm) v2_0), p6);
                } else {
                    v4_1 = (com.google.android.gms.internal.firebase-auth-api.zzakn.zza(((com.google.android.gms.internal.firebase-auth-api.zzalu) v2_0)) + v4_1);
                }
                v1++;
            }
            return v4_1;
        } else {
            return 0;
        }
    }

    public static int zzb(int p0, java.util.List p1, boolean p2)
    {
        p2 = p1.size();
        if (p2 != 0) {
            return ((com.google.android.gms.internal.firebase-auth-api.zzakn.zzh(p0) * p2) + com.google.android.gms.internal.firebase-auth-api.zzand.zzb(p1));
        } else {
            return 0;
        }
    }

    public static int zzb(java.util.List p4)
    {
        int v0 = p4.size();
        int v1 = 0;
        if (v0 != 0) {
            if (!(p4 instanceof com.google.android.gms.internal.firebase-auth-api.zzali)) {
                int v2_0 = 0;
                while (v1 < v0) {
                    v2_0 += com.google.android.gms.internal.firebase-auth-api.zzakn.zza(((Integer) p4.get(v1)).intValue());
                    v1++;
                }
                return v2_0;
            } else {
                int v2_1 = 0;
                while (v1 < v0) {
                    v2_1 += com.google.android.gms.internal.firebase-auth-api.zzakn.zza(((com.google.android.gms.internal.firebase-auth-api.zzali) p4).zzb(v1));
                    v1++;
                }
                return v2_1;
            }
        } else {
            return 0;
        }
    }

    public static void zzb(int p1, java.util.List p2, com.google.android.gms.internal.firebase-auth-api.zzaol p3)
    {
        if ((p2 != null) && (!p2.isEmpty())) {
            p3.zzb(p1, p2);
        }
        return;
    }

    public static void zzb(int p1, java.util.List p2, com.google.android.gms.internal.firebase-auth-api.zzaol p3, com.google.android.gms.internal.firebase-auth-api.zzanb p4)
    {
        if ((p2 != null) && (!p2.isEmpty())) {
            p3.zzb(p1, p2, p4);
        }
        return;
    }

    public static void zzb(int p1, java.util.List p2, com.google.android.gms.internal.firebase-auth-api.zzaol p3, boolean p4)
    {
        if ((p2 != null) && (!p2.isEmpty())) {
            p3.zzb(p1, p2, p4);
        }
        return;
    }

    public static int zzc(int p0, java.util.List p1, boolean p2)
    {
        int v1_1 = p1.size();
        if (v1_1 != 0) {
            return (com.google.android.gms.internal.firebase-auth-api.zzakn.zzb(p0, 0) * v1_1);
        } else {
            return 0;
        }
    }

    public static int zzc(java.util.List p0)
    {
        return (p0.size() << 2);
    }

    public static void zzc(int p1, java.util.List p2, com.google.android.gms.internal.firebase-auth-api.zzaol p3, boolean p4)
    {
        if ((p2 != null) && (!p2.isEmpty())) {
            p3.zzc(p1, p2, p4);
        }
        return;
    }

    public static int zzd(int p2, java.util.List p3, boolean p4)
    {
        int v3_1 = p3.size();
        if (v3_1 != 0) {
            return (com.google.android.gms.internal.firebase-auth-api.zzakn.zza(p2, 0) * v3_1);
        } else {
            return 0;
        }
    }

    public static int zzd(java.util.List p0)
    {
        return (p0.size() << 3);
    }

    public static void zzd(int p1, java.util.List p2, com.google.android.gms.internal.firebase-auth-api.zzaol p3, boolean p4)
    {
        if ((p2 != null) && (!p2.isEmpty())) {
            p3.zzd(p1, p2, p4);
        }
        return;
    }

    public static int zze(int p0, java.util.List p1, boolean p2)
    {
        p2 = p1.size();
        if (p2 != 0) {
            return ((com.google.android.gms.internal.firebase-auth-api.zzakn.zzh(p0) * p2) + com.google.android.gms.internal.firebase-auth-api.zzand.zze(p1));
        } else {
            return 0;
        }
    }

    public static int zze(java.util.List p4)
    {
        int v0 = p4.size();
        int v1 = 0;
        if (v0 != 0) {
            if (!(p4 instanceof com.google.android.gms.internal.firebase-auth-api.zzali)) {
                int v2_0 = 0;
                while (v1 < v0) {
                    v2_0 += com.google.android.gms.internal.firebase-auth-api.zzakn.zzc(((Integer) p4.get(v1)).intValue());
                    v1++;
                }
                return v2_0;
            } else {
                int v2_1 = 0;
                while (v1 < v0) {
                    v2_1 += com.google.android.gms.internal.firebase-auth-api.zzakn.zzc(((com.google.android.gms.internal.firebase-auth-api.zzali) p4).zzb(v1));
                    v1++;
                }
                return v2_1;
            }
        } else {
            return 0;
        }
    }

    public static void zze(int p1, java.util.List p2, com.google.android.gms.internal.firebase-auth-api.zzaol p3, boolean p4)
    {
        if ((p2 != null) && (!p2.isEmpty())) {
            p3.zze(p1, p2, p4);
        }
        return;
    }

    public static int zzf(int p0, java.util.List p1, boolean p2)
    {
        if (p1.size() != 0) {
            return ((com.google.android.gms.internal.firebase-auth-api.zzakn.zzh(p0) * p1.size()) + com.google.android.gms.internal.firebase-auth-api.zzand.zzf(p1));
        } else {
            return 0;
        }
    }

    public static int zzf(java.util.List p5)
    {
        int v0 = p5.size();
        int v1 = 0;
        if (v0 != 0) {
            if (!(p5 instanceof com.google.android.gms.internal.firebase-auth-api.zzalx)) {
                int v2_0 = 0;
                while (v1 < v0) {
                    v2_0 += com.google.android.gms.internal.firebase-auth-api.zzakn.zzb(((Long) p5.get(v1)).longValue());
                    v1++;
                }
                return v2_0;
            } else {
                int v2_1 = 0;
                while (v1 < v0) {
                    v2_1 += com.google.android.gms.internal.firebase-auth-api.zzakn.zzb(((com.google.android.gms.internal.firebase-auth-api.zzalx) p5).zzb(v1));
                    v1++;
                }
                return v2_1;
            }
        } else {
            return 0;
        }
    }

    public static void zzf(int p1, java.util.List p2, com.google.android.gms.internal.firebase-auth-api.zzaol p3, boolean p4)
    {
        if ((p2 != null) && (!p2.isEmpty())) {
            p3.zzf(p1, p2, p4);
        }
        return;
    }

    public static int zzg(int p0, java.util.List p1, boolean p2)
    {
        p2 = p1.size();
        if (p2 != 0) {
            return ((com.google.android.gms.internal.firebase-auth-api.zzakn.zzh(p0) * p2) + com.google.android.gms.internal.firebase-auth-api.zzand.zzg(p1));
        } else {
            return 0;
        }
    }

    public static int zzg(java.util.List p4)
    {
        int v0 = p4.size();
        int v1 = 0;
        if (v0 != 0) {
            if (!(p4 instanceof com.google.android.gms.internal.firebase-auth-api.zzali)) {
                int v2_0 = 0;
                while (v1 < v0) {
                    v2_0 += com.google.android.gms.internal.firebase-auth-api.zzakn.zzg(((Integer) p4.get(v1)).intValue());
                    v1++;
                }
                return v2_0;
            } else {
                int v2_1 = 0;
                while (v1 < v0) {
                    v2_1 += com.google.android.gms.internal.firebase-auth-api.zzakn.zzg(((com.google.android.gms.internal.firebase-auth-api.zzali) p4).zzb(v1));
                    v1++;
                }
                return v2_1;
            }
        } else {
            return 0;
        }
    }

    public static void zzg(int p1, java.util.List p2, com.google.android.gms.internal.firebase-auth-api.zzaol p3, boolean p4)
    {
        if ((p2 != null) && (!p2.isEmpty())) {
            p3.zzg(p1, p2, p4);
        }
        return;
    }

    public static int zzh(int p0, java.util.List p1, boolean p2)
    {
        p2 = p1.size();
        if (p2 != 0) {
            return ((com.google.android.gms.internal.firebase-auth-api.zzakn.zzh(p0) * p2) + com.google.android.gms.internal.firebase-auth-api.zzand.zzh(p1));
        } else {
            return 0;
        }
    }

    public static int zzh(java.util.List p5)
    {
        int v0 = p5.size();
        int v1 = 0;
        if (v0 != 0) {
            if (!(p5 instanceof com.google.android.gms.internal.firebase-auth-api.zzalx)) {
                int v2_0 = 0;
                while (v1 < v0) {
                    v2_0 += com.google.android.gms.internal.firebase-auth-api.zzakn.zzd(((Long) p5.get(v1)).longValue());
                    v1++;
                }
                return v2_0;
            } else {
                int v2_1 = 0;
                while (v1 < v0) {
                    v2_1 += com.google.android.gms.internal.firebase-auth-api.zzakn.zzd(((com.google.android.gms.internal.firebase-auth-api.zzalx) p5).zzb(v1));
                    v1++;
                }
                return v2_1;
            }
        } else {
            return 0;
        }
    }

    public static void zzh(int p1, java.util.List p2, com.google.android.gms.internal.firebase-auth-api.zzaol p3, boolean p4)
    {
        if ((p2 != null) && (!p2.isEmpty())) {
            p3.zzh(p1, p2, p4);
        }
        return;
    }

    public static int zzi(int p0, java.util.List p1, boolean p2)
    {
        p2 = p1.size();
        if (p2 != 0) {
            return ((com.google.android.gms.internal.firebase-auth-api.zzakn.zzh(p0) * p2) + com.google.android.gms.internal.firebase-auth-api.zzand.zzi(p1));
        } else {
            return 0;
        }
    }

    public static int zzi(java.util.List p4)
    {
        int v0 = p4.size();
        int v1 = 0;
        if (v0 != 0) {
            if (!(p4 instanceof com.google.android.gms.internal.firebase-auth-api.zzali)) {
                int v2_0 = 0;
                while (v1 < v0) {
                    v2_0 += com.google.android.gms.internal.firebase-auth-api.zzakn.zzi(((Integer) p4.get(v1)).intValue());
                    v1++;
                }
                return v2_0;
            } else {
                int v2_1 = 0;
                while (v1 < v0) {
                    v2_1 += com.google.android.gms.internal.firebase-auth-api.zzakn.zzi(((com.google.android.gms.internal.firebase-auth-api.zzali) p4).zzb(v1));
                    v1++;
                }
                return v2_1;
            }
        } else {
            return 0;
        }
    }

    public static void zzi(int p1, java.util.List p2, com.google.android.gms.internal.firebase-auth-api.zzaol p3, boolean p4)
    {
        if ((p2 != null) && (!p2.isEmpty())) {
            p3.zzi(p1, p2, p4);
        }
        return;
    }

    public static int zzj(int p0, java.util.List p1, boolean p2)
    {
        p2 = p1.size();
        if (p2 != 0) {
            return ((com.google.android.gms.internal.firebase-auth-api.zzakn.zzh(p0) * p2) + com.google.android.gms.internal.firebase-auth-api.zzand.zzj(p1));
        } else {
            return 0;
        }
    }

    public static int zzj(java.util.List p5)
    {
        int v0 = p5.size();
        int v1 = 0;
        if (v0 != 0) {
            if (!(p5 instanceof com.google.android.gms.internal.firebase-auth-api.zzalx)) {
                int v2_0 = 0;
                while (v1 < v0) {
                    v2_0 += com.google.android.gms.internal.firebase-auth-api.zzakn.zze(((Long) p5.get(v1)).longValue());
                    v1++;
                }
                return v2_0;
            } else {
                int v2_1 = 0;
                while (v1 < v0) {
                    v2_1 += com.google.android.gms.internal.firebase-auth-api.zzakn.zze(((com.google.android.gms.internal.firebase-auth-api.zzalx) p5).zzb(v1));
                    v1++;
                }
                return v2_1;
            }
        } else {
            return 0;
        }
    }

    public static void zzj(int p1, java.util.List p2, com.google.android.gms.internal.firebase-auth-api.zzaol p3, boolean p4)
    {
        if ((p2 != null) && (!p2.isEmpty())) {
            p3.zzj(p1, p2, p4);
        }
        return;
    }

    public static void zzk(int p1, java.util.List p2, com.google.android.gms.internal.firebase-auth-api.zzaol p3, boolean p4)
    {
        if ((p2 != null) && (!p2.isEmpty())) {
            p3.zzk(p1, p2, p4);
        }
        return;
    }

    public static void zzl(int p1, java.util.List p2, com.google.android.gms.internal.firebase-auth-api.zzaol p3, boolean p4)
    {
        if ((p2 != null) && (!p2.isEmpty())) {
            p3.zzl(p1, p2, p4);
        }
        return;
    }

    public static void zzm(int p1, java.util.List p2, com.google.android.gms.internal.firebase-auth-api.zzaol p3, boolean p4)
    {
        if ((p2 != null) && (!p2.isEmpty())) {
            p3.zzm(p1, p2, p4);
        }
        return;
    }

    public static void zzn(int p1, java.util.List p2, com.google.android.gms.internal.firebase-auth-api.zzaol p3, boolean p4)
    {
        if ((p2 != null) && (!p2.isEmpty())) {
            p3.zzn(p1, p2, p4);
        }
        return;
    }
}
