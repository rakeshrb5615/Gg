package com.google.android.gms.internal.measurement;
final class zzlw {
    private static final com.google.android.gms.internal.measurement.zzlw zzd;
    final com.google.android.gms.internal.measurement.zzoe zza;
    private boolean zzb;
    private boolean zzc;

    static zzlw()
    {
        com.google.android.gms.internal.measurement.zzlw.zzd = new com.google.android.gms.internal.measurement.zzlw(1);
        return;
    }

    private zzlw()
    {
        this.zza = new com.google.android.gms.internal.measurement.zzoa();
        return;
    }

    private zzlw(boolean p1)
    {
        com.google.android.gms.internal.measurement.zzoa v1_1 = new com.google.android.gms.internal.measurement.zzoa();
        this.zza = v1_1;
        this.zzb();
        this.zzb();
        return;
    }

    public static com.google.android.gms.internal.measurement.zzlw zza()
    {
        return com.google.android.gms.internal.measurement.zzlw.zzd;
    }

    public static void zzf(com.google.android.gms.internal.measurement.zzlm p2, com.google.android.gms.internal.measurement.zzot p3, int p4, Object p5)
    {
        if (p3 == com.google.android.gms.internal.measurement.zzot.zzj) {
            com.google.android.gms.internal.measurement.zzmp.zzd(((com.google.android.gms.internal.measurement.zznm) p5));
            p2.zza(p4, 3);
            ((com.google.android.gms.internal.measurement.zznm) p5).zzcB(p2);
            p2.zza(p4, 4);
            return;
        } else {
            p2.zza(p4, p3.zzb());
            switch (p3.ordinal()) {
                case 0:
                    p2.zzu(Double.doubleToRawLongBits(((Double) p5).doubleValue()));
                    return;
                case 1:
                    p2.zzs(Float.floatToRawIntBits(((Float) p5).floatValue()));
                    return;
                case 2:
                    p2.zzt(((Long) p5).longValue());
                    return;
                case 3:
                    p2.zzt(((Long) p5).longValue());
                    return;
                case 4:
                    p2.zzq(((Integer) p5).intValue());
                    return;
                case 5:
                    p2.zzu(((Long) p5).longValue());
                    return;
                case 6:
                    p2.zzs(((Integer) p5).intValue());
                    return;
                case 7:
                    p2.zzp(((Boolean) p5).booleanValue());
                    return;
                case 8:
                    if (!(p5 instanceof com.google.android.gms.internal.measurement.zzlh)) {
                        p2.zzx(((String) p5));
                        return;
                    } else {
                        p2.zzj(((com.google.android.gms.internal.measurement.zzlh) p5));
                        return;
                    }
                case 9:
                    ((com.google.android.gms.internal.measurement.zznm) p5).zzcB(p2);
                    return;
                case 10:
                    p2.zzo(((com.google.android.gms.internal.measurement.zznm) p5));
                    return;
                case 11:
                    if (!(p5 instanceof com.google.android.gms.internal.measurement.zzlh)) {
                        p2.zzk(((byte[]) p5), 0, ((byte[]) p5).length);
                        return;
                    } else {
                        p2.zzj(((com.google.android.gms.internal.measurement.zzlh) p5));
                        return;
                    }
                case 12:
                    p2.zzr(((Integer) p5).intValue());
                    return;
                case 13:
                    if (!(p5 instanceof com.google.android.gms.internal.measurement.zzmj)) {
                        p2.zzq(((Integer) p5).intValue());
                        return;
                    } else {
                        p2.zzq(((com.google.android.gms.internal.measurement.zzmj) p5).zza());
                        return;
                    }
                case 14:
                    p2.zzs(((Integer) p5).intValue());
                    return;
                case 15:
                    p2.zzu(((Long) p5).longValue());
                    return;
                case 16:
                    int v3_12 = ((Integer) p5).intValue();
                    p2.zzr(((v3_12 >> 31) ^ (v3_12 + v3_12)));
                    return;
                case 17:
                    int v3_9 = ((Long) p5).longValue();
                    p2.zzt(((v3_9 >> 63) ^ (v3_9 + v3_9)));
                    return;
                default:
                    return;
            }
        }
    }

    public static int zzh(com.google.android.gms.internal.measurement.zzot p1, int p2, Object p3)
    {
        int v2_3 = com.google.android.gms.internal.measurement.zzlm.zzz((p2 << 3));
        if (p1 == com.google.android.gms.internal.measurement.zzot.zzj) {
            com.google.android.gms.internal.measurement.zzmp.zzd(((com.google.android.gms.internal.measurement.zznm) p3));
            v2_3 += v2_3;
        }
        return (v2_3 + com.google.android.gms.internal.measurement.zzlw.zzi(p1, p3));
    }

    public static int zzi(com.google.android.gms.internal.measurement.zzot p3, Object p4)
    {
        int v4_17;
        int v3_29;
        long v0 = com.google.android.gms.internal.measurement.zzou.zza;
        switch (p3.ordinal()) {
            case 0:
                ((Double) p4).getClass();
                return 8;
            case 1:
                ((Float) p4).getClass();
                return 4;
            case 2:
                return com.google.android.gms.internal.measurement.zzlm.zzA(((Long) p4).longValue());
            case 3:
                return com.google.android.gms.internal.measurement.zzlm.zzA(((Long) p4).longValue());
            case 4:
                return com.google.android.gms.internal.measurement.zzlm.zzA(((long) ((Integer) p4).intValue()));
            case 5:
                ((Long) p4).getClass();
                return 8;
            case 6:
                ((Integer) p4).getClass();
                return 4;
            case 7:
                ((Boolean) p4).getClass();
                return 1;
            case 8:
                if (!(p4 instanceof com.google.android.gms.internal.measurement.zzlh)) {
                    return com.google.android.gms.internal.measurement.zzlm.zzB(((String) p4));
                } else {
                    v3_29 = ((com.google.android.gms.internal.measurement.zzlh) p4).zzc();
                    v4_17 = com.google.android.gms.internal.measurement.zzlm.zzz(v3_29);
                }
            case 9:
                return ((com.google.android.gms.internal.measurement.zznm) p4).zzcn();
            case 10:
                if (!(p4 instanceof com.google.android.gms.internal.measurement.zzmv)) {
                    return com.google.android.gms.internal.measurement.zzlm.zzC(((com.google.android.gms.internal.measurement.zznm) p4));
                } else {
                    v3_29 = ((com.google.android.gms.internal.measurement.zzmv) p4).zzb();
                    v4_17 = com.google.android.gms.internal.measurement.zzlm.zzz(v3_29);
                }
            case 11:
                if (!(p4 instanceof com.google.android.gms.internal.measurement.zzlh)) {
                    v3_29 = ((byte[]) p4).length;
                    v4_17 = com.google.android.gms.internal.measurement.zzlm.zzz(v3_29);
                } else {
                    v3_29 = ((com.google.android.gms.internal.measurement.zzlh) p4).zzc();
                    v4_17 = com.google.android.gms.internal.measurement.zzlm.zzz(v3_29);
                }
                break;
            case 12:
                return com.google.android.gms.internal.measurement.zzlm.zzz(((Integer) p4).intValue());
            case 13:
                if (!(p4 instanceof com.google.android.gms.internal.measurement.zzmj)) {
                    return com.google.android.gms.internal.measurement.zzlm.zzA(((long) ((Integer) p4).intValue()));
                } else {
                    return com.google.android.gms.internal.measurement.zzlm.zzA(((long) ((com.google.android.gms.internal.measurement.zzmj) p4).zza()));
                }
            case 14:
                ((Integer) p4).getClass();
                return 4;
            case 15:
                ((Long) p4).getClass();
                return 8;
            case 16:
                int v3_14 = ((Integer) p4).intValue();
                return com.google.android.gms.internal.measurement.zzlm.zzz(((v3_14 >> 31) ^ (v3_14 + v3_14)));
            case 17:
                int v3_35 = ((Long) p4).longValue();
                return com.google.android.gms.internal.measurement.zzlm.zzA(((v3_35 >> 63) ^ (v3_35 + v3_35)));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return (v4_17 + v3_29);
    }

    public static int zzj(com.google.android.gms.internal.measurement.zzlv p5, Object p6)
    {
        com.google.android.gms.internal.measurement.zzot v0 = p5.zzb();
        int v1 = p5.zza();
        if (!p5.zzd()) {
            return com.google.android.gms.internal.measurement.zzlw.zzh(v0, v1, p6);
        } else {
            int v2_0 = ((java.util.List) p6).size();
            int v3 = 0;
            if (!p5.zze()) {
                int v5_2 = 0;
                while (v3 < v2_0) {
                    v5_2 += com.google.android.gms.internal.measurement.zzlw.zzh(v0, v1, ((java.util.List) p6).get(v3));
                    v3++;
                }
                return v5_2;
            } else {
                if (((java.util.List) p6).isEmpty()) {
                    return 0;
                } else {
                    int v5_4 = 0;
                    while (v3 < v2_0) {
                        v5_4 += com.google.android.gms.internal.measurement.zzlw.zzi(v0, ((java.util.List) p6).get(v3));
                        v3++;
                    }
                    return (com.google.android.gms.internal.measurement.zzlm.zzz(v5_4) + (com.google.android.gms.internal.measurement.zzlm.zzz((v1 << 3)) + v5_4));
                }
            }
        }
    }

    private static boolean zzk(java.util.Map$Entry p4)
    {
        int v0_2 = ((com.google.android.gms.internal.measurement.zzlv) p4.getKey());
        if (v0_2.zzc() == com.google.android.gms.internal.measurement.zzou.zzi) {
            if (!v0_2.zzd()) {
                return com.google.android.gms.internal.measurement.zzlw.zzl(p4.getValue());
            } else {
                boolean v4_4 = ((java.util.List) p4.getValue());
                int v0_1 = v4_4.size();
                int v2_0 = 0;
                while (v2_0 < v0_1) {
                    if (com.google.android.gms.internal.measurement.zzlw.zzl(v4_4.get(v2_0))) {
                        v2_0++;
                    } else {
                        return 0;
                    }
                }
            }
        }
        return 1;
    }

    private static boolean zzl(Object p1)
    {
        if (!(p1 instanceof com.google.android.gms.internal.measurement.zznn)) {
            if (!(p1 instanceof com.google.android.gms.internal.measurement.zzmv)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            } else {
                return 1;
            }
        } else {
            return ((com.google.android.gms.internal.measurement.zznn) p1).zzcD();
        }
    }

    private static final int zzm(java.util.Map$Entry p5)
    {
        int v0_2 = ((com.google.android.gms.internal.measurement.zzlv) p5.getKey());
        int v1_1 = p5.getValue();
        if ((v0_2.zzc() != com.google.android.gms.internal.measurement.zzou.zzi) || ((v0_2.zzd()) || (v0_2.zze()))) {
            return com.google.android.gms.internal.measurement.zzlw.zzj(v0_2, v1_1);
        } else {
            int v0_4;
            int v1_3;
            int v5_6;
            if (!(v1_1 instanceof com.google.android.gms.internal.measurement.zzmv)) {
                int v5_4 = ((com.google.android.gms.internal.measurement.zzlv) p5.getKey()).zza();
                int v1_0 = ((com.google.android.gms.internal.measurement.zznm) v1_1);
                v0_4 = (com.google.android.gms.internal.measurement.zzlm.zzz(8) + com.google.android.gms.internal.measurement.zzlm.zzz(8));
                v5_6 = (com.google.android.gms.internal.measurement.zzlm.zzz(v5_4) + com.google.android.gms.internal.measurement.zzlm.zzz(16));
                v1_3 = (com.google.android.gms.internal.measurement.zzlm.zzC(v1_0) + com.google.android.gms.internal.measurement.zzlm.zzz(24));
            } else {
                int v5_9 = ((com.google.android.gms.internal.measurement.zzlv) p5.getKey()).zza();
                int v1_4 = ((com.google.android.gms.internal.measurement.zzmv) v1_1);
                v0_4 = (com.google.android.gms.internal.measurement.zzlm.zzz(8) + com.google.android.gms.internal.measurement.zzlm.zzz(8));
                v5_6 = (com.google.android.gms.internal.measurement.zzlm.zzz(v5_9) + com.google.android.gms.internal.measurement.zzlm.zzz(16));
                v1_3 = v1.a.b(v1_4.zzb(), v1_4.zzb(), com.google.android.gms.internal.measurement.zzlm.zzz(24));
            }
            return ((v0_4 + v5_6) + v1_3);
        }
    }

    private static final void zzn(com.google.android.gms.internal.measurement.zzlv p2, Object p3)
    {
        boolean v0_7;
        boolean v0_0 = p2.zzb();
        Class vtmp2 = p3.getClass();
        Integer v1 = com.google.android.gms.internal.measurement.zzou.zza;
        switch (v0_0.zza().ordinal()) {
            case 0:
                v0_7 = (p3 instanceof Integer);
                if (!v0_7) {
                } else {
                    return;
                }
            case 1:
                v0_7 = (p3 instanceof Long);
                break;
            case 2:
                v0_7 = (p3 instanceof Float);
                break;
            case 3:
                v0_7 = (p3 instanceof Double);
                break;
            case 4:
                v0_7 = (p3 instanceof Boolean);
                break;
            case 5:
                v0_7 = (p3 instanceof String);
                break;
            case 6:
                if ((!(p3 instanceof com.google.android.gms.internal.measurement.zzlh)) && (!(p3 instanceof byte[]))) {
                } else {
                    return;
                }
            case 7:
                if ((!(p3 instanceof Integer)) && (!(p3 instanceof com.google.android.gms.internal.measurement.zzmj))) {
                } else {
                    return;
                }
            case 8:
                if ((!(p3 instanceof com.google.android.gms.internal.measurement.zznm)) && (!(p3 instanceof com.google.android.gms.internal.measurement.zzmv))) {
                } else {
                    return;
                }
            default:
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[] {Integer.valueOf(p2.zza()), p2.zzb().zza(), p3.getClass().getName()})));
    }

    public final bridge synthetic Object clone()
    {
        com.google.android.gms.internal.measurement.zzlw v0_1 = new com.google.android.gms.internal.measurement.zzlw();
        boolean v1_2 = this.zza;
        Object v2_4 = v1_2.zzc();
        com.google.android.gms.internal.measurement.zzlv v3_2 = 0;
        while (v3_2 < v2_4) {
            Object v4_0 = v1_2.zzd(v3_2);
            v0_1.zzd(((com.google.android.gms.internal.measurement.zzlv) ((com.google.android.gms.internal.measurement.zzob) v4_0).zza()), v4_0.getValue());
            v3_2++;
        }
        boolean v1_0 = v1_2.zze().iterator();
        while (v1_0.hasNext()) {
            Object v2_2 = ((java.util.Map$Entry) v1_0.next());
            v0_1.zzd(((com.google.android.gms.internal.measurement.zzlv) v2_2.getKey()), v2_2.getValue());
        }
        v0_1.zzc = this.zzc;
        return v0_1;
    }

    public final boolean equals(Object p2)
    {
        if (this != p2) {
            if ((p2 instanceof com.google.android.gms.internal.measurement.zzlw)) {
                return this.zza.equals(((com.google.android.gms.internal.measurement.zzlw) p2).zza);
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        return this.zza.hashCode();
    }

    public final void zzb()
    {
        if (!this.zzb) {
            int v0_2 = this.zza;
            java.util.Iterator v1_1 = v0_2.zzc();
            com.google.android.gms.internal.measurement.zzmf v2_5 = 0;
            while (v2_5 < v1_1) {
                boolean v3_2 = v0_2.zzd(v2_5).getValue();
                if ((v3_2 instanceof com.google.android.gms.internal.measurement.zzmf)) {
                    ((com.google.android.gms.internal.measurement.zzmf) v3_2).zzcj();
                }
                v2_5++;
            }
            java.util.Iterator v1_0 = v0_2.zze().iterator();
            while (v1_0.hasNext()) {
                com.google.android.gms.internal.measurement.zzmf v2_3 = ((java.util.Map$Entry) v1_0.next()).getValue();
                if ((v2_3 instanceof com.google.android.gms.internal.measurement.zzmf)) {
                    ((com.google.android.gms.internal.measurement.zzmf) v2_3).zzcj();
                }
            }
            v0_2.zza();
            this.zzb = 1;
            return;
        } else {
            return;
        }
    }

    public final java.util.Iterator zzc()
    {
        java.util.Iterator v0_0 = this.zza;
        if (!v0_0.isEmpty()) {
            if (!this.zzc) {
                return v0_0.entrySet().iterator();
            } else {
                return new com.google.android.gms.internal.measurement.zzmu(v0_0.entrySet().iterator());
            }
        } else {
            return java.util.Collections.emptyIterator();
        }
    }

    public final void zzd(com.google.android.gms.internal.measurement.zzlv p5, Object p6)
    {
        if (!p5.zzd()) {
            com.google.android.gms.internal.measurement.zzlw.zzn(p5, p6);
        } else {
            if (!(p6 instanceof java.util.List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            } else {
                com.google.android.gms.internal.measurement.zzoe v0_1 = ((java.util.List) p6).size();
                java.util.ArrayList v1_1 = new java.util.ArrayList(v0_1);
                int v2 = 0;
                while (v2 < v0_1) {
                    Object v3 = ((java.util.List) p6).get(v2);
                    com.google.android.gms.internal.measurement.zzlw.zzn(p5, v3);
                    v1_1.add(v3);
                    v2++;
                }
                p6 = v1_1;
            }
        }
        if ((p6 instanceof com.google.android.gms.internal.measurement.zzmv)) {
            this.zzc = 1;
        }
        this.zza.zzf(p5, p6);
        return;
    }

    public final boolean zze()
    {
        int v0_0 = this.zza;
        boolean v1_4 = v0_0.zzc();
        int v3 = 0;
        while (v3 < v1_4) {
            if (com.google.android.gms.internal.measurement.zzlw.zzk(v0_0.zzd(v3))) {
                v3++;
            } else {
                return 0;
            }
        }
        int v0_3 = v0_0.zze().iterator();
        while (v0_3.hasNext()) {
            if (!com.google.android.gms.internal.measurement.zzlw.zzk(((java.util.Map$Entry) v0_3.next()))) {
                return 0;
            }
        }
        return 1;
    }

    public final int zzg()
    {
        java.util.Iterator v0_0 = this.zza;
        int v1_4 = v0_0.zzc();
        int v2 = 0;
        int v3 = 0;
        while (v2 < v1_4) {
            v3 += com.google.android.gms.internal.measurement.zzlw.zzm(v0_0.zzd(v2));
            v2++;
        }
        java.util.Iterator v0_2 = v0_0.zze().iterator();
        while (v0_2.hasNext()) {
            v3 += com.google.android.gms.internal.measurement.zzlw.zzm(((java.util.Map$Entry) v0_2.next()));
        }
        return v3;
    }
}
