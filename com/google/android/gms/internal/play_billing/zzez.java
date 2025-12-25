package com.google.android.gms.internal.play_billing;
final class zzez {
    private static final com.google.android.gms.internal.play_billing.zzez zzb;
    final com.google.android.gms.internal.play_billing.zzhd zza;
    private boolean zzc;
    private boolean zzd;

    static zzez()
    {
        com.google.android.gms.internal.play_billing.zzez.zzb = new com.google.android.gms.internal.play_billing.zzez(1);
        return;
    }

    private zzez()
    {
        this.zza = new com.google.android.gms.internal.play_billing.zzgy();
        return;
    }

    private zzez(boolean p1)
    {
        com.google.android.gms.internal.play_billing.zzgy v1_1 = new com.google.android.gms.internal.play_billing.zzgy();
        this.zza = v1_1;
        this.zzg();
        this.zzg();
        return;
    }

    public static int zza(com.google.android.gms.internal.play_billing.zzhs p1, int p2, Object p3)
    {
        int v2_3 = com.google.android.gms.internal.play_billing.zzep.zzC((p2 << 3));
        if (p1 == com.google.android.gms.internal.play_billing.zzhs.zzj) {
            com.google.android.gms.internal.play_billing.zzfo.zzd(((com.google.android.gms.internal.play_billing.zzgl) p3));
            v2_3 += v2_3;
        }
        return (v2_3 + com.google.android.gms.internal.play_billing.zzez.zzb(p1, p3));
    }

    public static int zzb(com.google.android.gms.internal.play_billing.zzhs p3, Object p4)
    {
        int v4_17;
        int v3_29;
        long v0 = com.google.android.gms.internal.play_billing.zzht.zza;
        switch (p3.ordinal()) {
            case 0:
                ((Double) p4).getClass();
                return 8;
            case 1:
                ((Float) p4).getClass();
                return 4;
            case 2:
                return com.google.android.gms.internal.play_billing.zzep.zzD(((Long) p4).longValue());
            case 3:
                return com.google.android.gms.internal.play_billing.zzep.zzD(((Long) p4).longValue());
            case 4:
                return com.google.android.gms.internal.play_billing.zzep.zzD(((long) ((Integer) p4).intValue()));
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
                if (!(p4 instanceof com.google.android.gms.internal.play_billing.zzei)) {
                    return com.google.android.gms.internal.play_billing.zzep.zzB(((String) p4));
                } else {
                    v3_29 = ((com.google.android.gms.internal.play_billing.zzei) p4).zzd();
                    v4_17 = com.google.android.gms.internal.play_billing.zzep.zzC(v3_29);
                }
            case 9:
                return ((com.google.android.gms.internal.play_billing.zzgl) p4).zzj();
            case 10:
                if (!(p4 instanceof com.google.android.gms.internal.play_billing.zzfv)) {
                    return com.google.android.gms.internal.play_billing.zzep.zzz(((com.google.android.gms.internal.play_billing.zzgl) p4));
                } else {
                    v3_29 = ((com.google.android.gms.internal.play_billing.zzfv) p4).zza();
                    v4_17 = com.google.android.gms.internal.play_billing.zzep.zzC(v3_29);
                }
            case 11:
                if (!(p4 instanceof com.google.android.gms.internal.play_billing.zzei)) {
                    v3_29 = ((byte[]) p4).length;
                    v4_17 = com.google.android.gms.internal.play_billing.zzep.zzC(v3_29);
                } else {
                    v3_29 = ((com.google.android.gms.internal.play_billing.zzei) p4).zzd();
                    v4_17 = com.google.android.gms.internal.play_billing.zzep.zzC(v3_29);
                }
                break;
            case 12:
                return com.google.android.gms.internal.play_billing.zzep.zzC(((Integer) p4).intValue());
            case 13:
                if (!(p4 instanceof com.google.android.gms.internal.play_billing.zzfk)) {
                    return com.google.android.gms.internal.play_billing.zzep.zzD(((long) ((Integer) p4).intValue()));
                } else {
                    return com.google.android.gms.internal.play_billing.zzep.zzD(((long) ((com.google.android.gms.internal.play_billing.zzfk) p4).zza()));
                }
            case 14:
                ((Integer) p4).getClass();
                return 4;
            case 15:
                ((Long) p4).getClass();
                return 8;
            case 16:
                int v3_14 = ((Integer) p4).intValue();
                return com.google.android.gms.internal.play_billing.zzep.zzC(((v3_14 >> 31) ^ (v3_14 + v3_14)));
            case 17:
                int v3_35 = ((Long) p4).longValue();
                return com.google.android.gms.internal.play_billing.zzep.zzD(((v3_35 >> 63) ^ (v3_35 + v3_35)));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return (v4_17 + v3_29);
    }

    public static int zzc(com.google.android.gms.internal.play_billing.zzey p5, Object p6)
    {
        com.google.android.gms.internal.play_billing.zzhs v0 = p5.zzb();
        int v1 = p5.zza();
        if (!p5.zze()) {
            return com.google.android.gms.internal.play_billing.zzez.zza(v0, v1, p6);
        } else {
            int v2_0 = ((java.util.List) p6).size();
            int v3 = 0;
            if (!p5.zzd()) {
                int v5_2 = 0;
                while (v3 < v2_0) {
                    v5_2 += com.google.android.gms.internal.play_billing.zzez.zza(v0, v1, ((java.util.List) p6).get(v3));
                    v3++;
                }
                return v5_2;
            } else {
                if (((java.util.List) p6).isEmpty()) {
                    return 0;
                } else {
                    int v5_4 = 0;
                    while (v3 < v2_0) {
                        v5_4 += com.google.android.gms.internal.play_billing.zzez.zzb(v0, ((java.util.List) p6).get(v3));
                        v3++;
                    }
                    return (com.google.android.gms.internal.play_billing.zzep.zzC(v5_4) + (com.google.android.gms.internal.play_billing.zzep.zzC((v1 << 3)) + v5_4));
                }
            }
        }
    }

    public static com.google.android.gms.internal.play_billing.zzez zze()
    {
        return com.google.android.gms.internal.play_billing.zzez.zzb;
    }

    private static boolean zzj(java.util.Map$Entry p4)
    {
        int v0_2 = ((com.google.android.gms.internal.play_billing.zzey) p4.getKey());
        if (v0_2.zzc() == com.google.android.gms.internal.play_billing.zzht.zzi) {
            if (!v0_2.zze()) {
                return com.google.android.gms.internal.play_billing.zzez.zzk(p4.getValue());
            } else {
                boolean v4_4 = ((java.util.List) p4.getValue());
                int v0_1 = v4_4.size();
                int v2_0 = 0;
                while (v2_0 < v0_1) {
                    if (com.google.android.gms.internal.play_billing.zzez.zzk(v4_4.get(v2_0))) {
                        v2_0++;
                    } else {
                        return 0;
                    }
                }
            }
        }
        return 1;
    }

    private static boolean zzk(Object p1)
    {
        if (!(p1 instanceof com.google.android.gms.internal.play_billing.zzgm)) {
            if (!(p1 instanceof com.google.android.gms.internal.play_billing.zzfv)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            } else {
                return 1;
            }
        } else {
            return ((com.google.android.gms.internal.play_billing.zzgm) p1).zzk();
        }
    }

    private static final int zzl(java.util.Map$Entry p5)
    {
        int v0_2 = ((com.google.android.gms.internal.play_billing.zzey) p5.getKey());
        int v1_1 = p5.getValue();
        if ((v0_2.zzc() != com.google.android.gms.internal.play_billing.zzht.zzi) || ((v0_2.zze()) || (v0_2.zzd()))) {
            return com.google.android.gms.internal.play_billing.zzez.zzc(v0_2, v1_1);
        } else {
            int v1_3;
            int v5_6;
            int v0_4;
            if (!(v1_1 instanceof com.google.android.gms.internal.play_billing.zzfv)) {
                int v5_4 = ((com.google.android.gms.internal.play_billing.zzey) p5.getKey()).zza();
                int v1_0 = ((com.google.android.gms.internal.play_billing.zzgl) v1_1);
                v0_4 = (com.google.android.gms.internal.play_billing.zzep.zzC(8) + com.google.android.gms.internal.play_billing.zzep.zzC(8));
                v5_6 = (com.google.android.gms.internal.play_billing.zzep.zzC(v5_4) + com.google.android.gms.internal.play_billing.zzep.zzC(16));
                v1_3 = (com.google.android.gms.internal.play_billing.zzep.zzz(v1_0) + com.google.android.gms.internal.play_billing.zzep.zzC(24));
            } else {
                int v5_9 = ((com.google.android.gms.internal.play_billing.zzey) p5.getKey()).zza();
                int v1_4 = ((com.google.android.gms.internal.play_billing.zzfv) v1_1);
                v0_4 = (com.google.android.gms.internal.play_billing.zzep.zzC(8) + com.google.android.gms.internal.play_billing.zzep.zzC(8));
                v5_6 = (com.google.android.gms.internal.play_billing.zzep.zzC(v5_9) + com.google.android.gms.internal.play_billing.zzep.zzC(16));
                v1_3 = v1.a.u(v1_4.zza(), v1_4.zza(), com.google.android.gms.internal.play_billing.zzep.zzC(24));
            }
            return ((v0_4 + v5_6) + v1_3);
        }
    }

    private static final void zzm(com.google.android.gms.internal.play_billing.zzey p2, Object p3)
    {
        boolean v0_7;
        boolean v0_0 = p2.zzb();
        Class vtmp2 = p3.getClass();
        Integer v1 = com.google.android.gms.internal.play_billing.zzht.zza;
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
                if ((!(p3 instanceof com.google.android.gms.internal.play_billing.zzei)) && (!(p3 instanceof byte[]))) {
                } else {
                    return;
                }
            case 7:
                if ((!(p3 instanceof Integer)) && (!(p3 instanceof com.google.android.gms.internal.play_billing.zzfk))) {
                } else {
                    return;
                }
            case 8:
                if ((!(p3 instanceof com.google.android.gms.internal.play_billing.zzgl)) && (!(p3 instanceof com.google.android.gms.internal.play_billing.zzfv))) {
                } else {
                    return;
                }
            default:
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[] {Integer.valueOf(p2.zza()), p2.zzb().zza(), p3.getClass().getName()})));
    }

    public final bridge synthetic Object clone()
    {
        com.google.android.gms.internal.play_billing.zzez v0_1 = new com.google.android.gms.internal.play_billing.zzez();
        boolean v1_2 = this.zza;
        Object v2_4 = v1_2.zzc();
        com.google.android.gms.internal.play_billing.zzey v3_2 = 0;
        while (v3_2 < v2_4) {
            Object v4_0 = v1_2.zzg(v3_2);
            v0_1.zzh(((com.google.android.gms.internal.play_billing.zzey) ((com.google.android.gms.internal.play_billing.zzgz) v4_0).zza()), v4_0.getValue());
            v3_2++;
        }
        boolean v1_0 = v1_2.zzd().iterator();
        while (v1_0.hasNext()) {
            Object v2_2 = ((java.util.Map$Entry) v1_0.next());
            v0_1.zzh(((com.google.android.gms.internal.play_billing.zzey) v2_2.getKey()), v2_2.getValue());
        }
        v0_1.zzd = this.zzd;
        return v0_1;
    }

    public final boolean equals(Object p2)
    {
        if (this != p2) {
            if ((p2 instanceof com.google.android.gms.internal.play_billing.zzez)) {
                return this.zza.equals(((com.google.android.gms.internal.play_billing.zzez) p2).zza);
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

    public final int zzd()
    {
        java.util.Iterator v0_0 = this.zza;
        int v1_4 = v0_0.zzc();
        int v2 = 0;
        int v3 = 0;
        while (v2 < v1_4) {
            v3 += com.google.android.gms.internal.play_billing.zzez.zzl(v0_0.zzg(v2));
            v2++;
        }
        java.util.Iterator v0_2 = v0_0.zzd().iterator();
        while (v0_2.hasNext()) {
            v3 += com.google.android.gms.internal.play_billing.zzez.zzl(((java.util.Map$Entry) v0_2.next()));
        }
        return v3;
    }

    public final java.util.Iterator zzf()
    {
        java.util.Iterator v0_0 = this.zza;
        if (!v0_0.isEmpty()) {
            if (!this.zzd) {
                return v0_0.entrySet().iterator();
            } else {
                return new com.google.android.gms.internal.play_billing.zzft(v0_0.entrySet().iterator());
            }
        } else {
            return java.util.Collections.emptyIterator();
        }
    }

    public final void zzg()
    {
        if (!this.zzc) {
            int v0_2 = this.zza;
            java.util.Iterator v1_1 = v0_2.zzc();
            com.google.android.gms.internal.play_billing.zzfi v2_5 = 0;
            while (v2_5 < v1_1) {
                boolean v3_2 = v0_2.zzg(v2_5).getValue();
                if ((v3_2 instanceof com.google.android.gms.internal.play_billing.zzfi)) {
                    ((com.google.android.gms.internal.play_billing.zzfi) v3_2).zzu();
                }
                v2_5++;
            }
            java.util.Iterator v1_0 = v0_2.zzd().iterator();
            while (v1_0.hasNext()) {
                com.google.android.gms.internal.play_billing.zzfi v2_3 = ((java.util.Map$Entry) v1_0.next()).getValue();
                if ((v2_3 instanceof com.google.android.gms.internal.play_billing.zzfi)) {
                    ((com.google.android.gms.internal.play_billing.zzfi) v2_3).zzu();
                }
            }
            v0_2.zza();
            this.zzc = 1;
            return;
        } else {
            return;
        }
    }

    public final void zzh(com.google.android.gms.internal.play_billing.zzey p5, Object p6)
    {
        if (!p5.zze()) {
            com.google.android.gms.internal.play_billing.zzez.zzm(p5, p6);
        } else {
            if (!(p6 instanceof java.util.List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            } else {
                com.google.android.gms.internal.play_billing.zzhd v0_1 = ((java.util.List) p6).size();
                java.util.ArrayList v1_1 = new java.util.ArrayList(v0_1);
                int v2 = 0;
                while (v2 < v0_1) {
                    Object v3 = ((java.util.List) p6).get(v2);
                    com.google.android.gms.internal.play_billing.zzez.zzm(p5, v3);
                    v1_1.add(v3);
                    v2++;
                }
                p6 = v1_1;
            }
        }
        if ((p6 instanceof com.google.android.gms.internal.play_billing.zzfv)) {
            this.zzd = 1;
        }
        this.zza.zzf(p5, p6);
        return;
    }

    public final boolean zzi()
    {
        int v0_0 = this.zza;
        boolean v1_4 = v0_0.zzc();
        int v3 = 0;
        while (v3 < v1_4) {
            if (com.google.android.gms.internal.play_billing.zzez.zzj(v0_0.zzg(v3))) {
                v3++;
            } else {
                return 0;
            }
        }
        int v0_3 = v0_0.zzd().iterator();
        while (v0_3.hasNext()) {
            if (!com.google.android.gms.internal.play_billing.zzez.zzj(((java.util.Map$Entry) v0_3.next()))) {
                return 0;
            }
        }
        return 1;
    }
}
