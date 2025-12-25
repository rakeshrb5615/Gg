package com.google.android.gms.internal.auth;
final class zzgj {
    private static final Class zza;
    private static final com.google.android.gms.internal.auth.zzgy zzb;
    private static final com.google.android.gms.internal.auth.zzgy zzc;
    private static final com.google.android.gms.internal.auth.zzgy zzd;

    static zzgj()
    {
        try {
            com.google.android.gms.internal.auth.zzha v0_4 = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable) {
            v0_4 = 0;
        }
        com.google.android.gms.internal.auth.zzgj.zza = v0_4;
        com.google.android.gms.internal.auth.zzgj.zzb = com.google.android.gms.internal.auth.zzgj.zzj(0);
        com.google.android.gms.internal.auth.zzgj.zzc = com.google.android.gms.internal.auth.zzgj.zzj(1);
        com.google.android.gms.internal.auth.zzgj.zzd = new com.google.android.gms.internal.auth.zzha();
        return;
    }

    public static com.google.android.gms.internal.auth.zzgy zza()
    {
        return com.google.android.gms.internal.auth.zzgj.zzb;
    }

    public static com.google.android.gms.internal.auth.zzgy zzb()
    {
        return com.google.android.gms.internal.auth.zzgj.zzc;
    }

    public static com.google.android.gms.internal.auth.zzgy zzc()
    {
        return com.google.android.gms.internal.auth.zzgj.zzd;
    }

    public static Object zzd(int p6, java.util.List p7, com.google.android.gms.internal.auth.zzex p8, Object p9, com.google.android.gms.internal.auth.zzgy p10)
    {
        if (p8 != null) {
            if (!(p7 instanceof java.util.RandomAccess)) {
                java.util.Iterator v7_1 = p7.iterator();
                while (v7_1.hasNext()) {
                    int vtmp8 = ((Integer) v7_1.next()).intValue();
                    if (!p8.zza()) {
                        p9 = com.google.android.gms.internal.auth.zzgj.zze(p6, vtmp8, p9, p10);
                        v7_1.remove();
                    }
                }
                return p9;
            } else {
                int v0_4 = p7.size();
                int v1_1 = 0;
                int v2 = 0;
                while (v1_1 < v0_4) {
                    Integer v3_1 = ((Integer) p7.get(v1_1));
                    int v4 = v3_1.intValue();
                    if (!p8.zza()) {
                        p9 = com.google.android.gms.internal.auth.zzgj.zze(p6, v4, p9, p10);
                    } else {
                        if (v1_1 != v2) {
                            p7.set(v2, v3_1);
                        }
                        v2++;
                    }
                    v1_1++;
                }
                if (v2 != v0_4) {
                    p7.subList(v2, v0_4).clear();
                    return p9;
                } else {
                    return p9;
                }
            }
        } else {
            return p9;
        }
    }

    public static Object zze(int p2, int p3, Object p4, com.google.android.gms.internal.auth.zzgy p5)
    {
        if (p4 == null) {
            p4 = p5.zzc();
        }
        p5.zzd(p4, p2, ((long) p3));
        return p4;
    }

    public static void zzf(com.google.android.gms.internal.auth.zzgy p1, Object p2, Object p3)
    {
        p1.zzf(p2, p1.zzb(p1.zza(p2), p1.zza(p3)));
        return;
    }

    public static void zzg(Class p1)
    {
        if (!com.google.android.gms.internal.auth.zzeu.isAssignableFrom(p1)) {
            String v0_3 = com.google.android.gms.internal.auth.zzgj.zza;
            if ((v0_3 != null) && (!v0_3.isAssignableFrom(p1))) {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
        }
        return;
    }

    public static boolean zzh(Object p2, Object p3)
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

    public static void zzi(com.google.android.gms.internal.auth.zzfr p0, Object p1, Object p2, long p3)
    {
        com.google.android.gms.internal.auth.zzhi.zzp(p1, p3, com.google.android.gms.internal.auth.zzfr.zza(com.google.android.gms.internal.auth.zzhi.zzf(p1, p3), com.google.android.gms.internal.auth.zzhi.zzf(p2, p3)));
        return;
    }

    private static com.google.android.gms.internal.auth.zzgy zzj(boolean p3)
    {
        try {
            reflect.Constructor v1_2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable) {
            v1_2 = 0;
        }
        if (v1_2 != null) {
            try {
                return ((com.google.android.gms.internal.auth.zzgy) v1_2.getConstructor(new Class[] {Boolean.TYPE})).newInstance(new Object[] {Boolean.valueOf(p3)})));
            } catch (Throwable) {
                return 0;
            }
        } else {
            return 0;
        }
    }
}
