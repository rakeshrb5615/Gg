package com.google.android.recaptcha.internal;
final class zzmt {
    private static final com.google.android.recaptcha.internal.zzmt zzb;
    final com.google.android.recaptcha.internal.zzpe zza;
    private boolean zzc;
    private boolean zzd;

    static zzmt()
    {
        com.google.android.recaptcha.internal.zzmt.zzb = new com.google.android.recaptcha.internal.zzmt(1);
        return;
    }

    private zzmt()
    {
        this.zza = new com.google.android.recaptcha.internal.zzoz();
        return;
    }

    private zzmt(boolean p1)
    {
        com.google.android.recaptcha.internal.zzoz v1_1 = new com.google.android.recaptcha.internal.zzoz();
        this.zza = v1_1;
        this.zzg();
        this.zzg();
        return;
    }

    public static int zza(com.google.android.recaptcha.internal.zzms p4, Object p5)
    {
        long v0_0 = p4.zzd();
        int v1_4 = p4.zza();
        p4.zzg();
        int v4_5 = com.google.android.recaptcha.internal.zzln.zzA((v1_4 << 3));
        if (v0_0 == com.google.android.recaptcha.internal.zzpw.zzj) {
            if ((((com.google.android.recaptcha.internal.zzoi) p5) instanceof com.google.android.recaptcha.internal.zzkp)) {
                throw 0;
            } else {
                v4_5 += v4_5;
            }
        }
        long v0_13;
        int v5_25;
        int v1_1 = 4;
        switch (v0_0.ordinal()) {
            case 0:
                ((Double) p5).getClass();
                v1_1 = 8;
                break;
            case 1:
                ((Float) p5).getClass();
                break;
            case 2:
                v1_1 = com.google.android.recaptcha.internal.zzln.zzB(((Long) p5).longValue());
                break;
            case 3:
                v1_1 = com.google.android.recaptcha.internal.zzln.zzB(((Long) p5).longValue());
                break;
            case 4:
                v1_1 = com.google.android.recaptcha.internal.zzln.zzB(((long) ((Integer) p5).intValue()));
                break;
            case 5:
                ((Long) p5).getClass();
                break;
            case 6:
                ((Integer) p5).getClass();
                break;
            case 7:
                ((Boolean) p5).getClass();
                v1_1 = 1;
                break;
            case 8:
                if (!(p5 instanceof com.google.android.recaptcha.internal.zzle)) {
                    v1_1 = com.google.android.recaptcha.internal.zzln.zzz(((String) p5));
                } else {
                    v5_25 = ((com.google.android.recaptcha.internal.zzle) p5).zzd();
                    v0_13 = com.google.android.recaptcha.internal.zzln.zzA(v5_25);
                    v1_1 = (v0_13 + v5_25);
                }
                break;
            case 9:
                v1_1 = ((com.google.android.recaptcha.internal.zzoi) p5).zzo();
                break;
            case 10:
                if (!(p5 instanceof com.google.android.recaptcha.internal.zzns)) {
                    v1_1 = com.google.android.recaptcha.internal.zzln.zzx(((com.google.android.recaptcha.internal.zzoi) p5));
                } else {
                    v5_25 = ((com.google.android.recaptcha.internal.zzns) p5).zza();
                    v0_13 = com.google.android.recaptcha.internal.zzln.zzA(v5_25);
                }
                break;
            case 11:
                if (!(p5 instanceof com.google.android.recaptcha.internal.zzle)) {
                    v5_25 = ((byte[]) p5).length;
                    v0_13 = com.google.android.recaptcha.internal.zzln.zzA(v5_25);
                } else {
                    v5_25 = ((com.google.android.recaptcha.internal.zzle) p5).zzd();
                    v0_13 = com.google.android.recaptcha.internal.zzln.zzA(v5_25);
                }
                break;
            case 12:
                v1_1 = com.google.android.recaptcha.internal.zzln.zzA(((Integer) p5).intValue());
                break;
            case 13:
                if (!(p5 instanceof com.google.android.recaptcha.internal.zznf)) {
                    v1_1 = com.google.android.recaptcha.internal.zzln.zzB(((long) ((Integer) p5).intValue()));
                } else {
                    v1_1 = com.google.android.recaptcha.internal.zzln.zzB(((long) ((com.google.android.recaptcha.internal.zznf) p5).zza()));
                }
                break;
            case 14:
                ((Integer) p5).getClass();
                break;
            case 15:
                ((Long) p5).getClass();
                break;
            case 16:
                int v5_13 = ((Integer) p5).intValue();
                v1_1 = com.google.android.recaptcha.internal.zzln.zzA(((v5_13 >> 31) ^ (v5_13 + v5_13)));
                break;
            case 17:
                long v0_5 = ((Long) p5).longValue();
                v1_1 = com.google.android.recaptcha.internal.zzln.zzB(((v0_5 >> 63) ^ (v0_5 + v0_5)));
                break;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return (v4_5 + v1_1);
    }

    public static com.google.android.recaptcha.internal.zzmt zzd()
    {
        return com.google.android.recaptcha.internal.zzmt.zzb;
    }

    private static Object zzl(Object p3)
    {
        if (!(p3 instanceof com.google.android.recaptcha.internal.zzon)) {
            if (!(p3 instanceof byte[])) {
                return p3;
            } else {
                int v0_2 = ((byte[]) p3).length;
                byte[] v1 = new byte[v0_2];
                System.arraycopy(((byte[]) p3), 0, v1, 0, v0_2);
                return v1;
            }
        } else {
            return ((com.google.android.recaptcha.internal.zzon) p3).zzd();
        }
    }

    private final void zzm(java.util.Map$Entry p5)
    {
        String v0_2 = ((com.google.android.recaptcha.internal.zzms) p5.getKey());
        com.google.android.recaptcha.internal.zzoi v5_9 = p5.getValue();
        com.google.android.recaptcha.internal.zzpe v1_4 = (v5_9 instanceof com.google.android.recaptcha.internal.zzns);
        v0_2.zzg();
        if (v0_2.zze() != com.google.android.recaptcha.internal.zzpx.zzi) {
            if (v1_4 != null) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            } else {
                this.zza.zzf(v0_2, com.google.android.recaptcha.internal.zzmt.zzl(v5_9));
                return;
            }
        } else {
            com.google.android.recaptcha.internal.zzoi v2_0 = this.zze(v0_2);
            if (v2_0 != null) {
                if (v1_4 != null) {
                    throw 0;
                } else {
                    com.google.android.recaptcha.internal.zzoi v5_7;
                    if (!(v2_0 instanceof com.google.android.recaptcha.internal.zzon)) {
                        v5_7 = v0_2.zzb(((com.google.android.recaptcha.internal.zzoi) v2_0).zzae(), ((com.google.android.recaptcha.internal.zzoi) v5_9)).zzk();
                    } else {
                        v5_7 = v0_2.zzc(((com.google.android.recaptcha.internal.zzon) v2_0), ((com.google.android.recaptcha.internal.zzon) v5_9));
                    }
                    this.zza.zzf(v0_2, v5_7);
                    return;
                }
            } else {
                this.zza.zzf(v0_2, com.google.android.recaptcha.internal.zzmt.zzl(v5_9));
                if (v1_4 != null) {
                    this.zzd = 1;
                }
                return;
            }
        }
    }

    private static boolean zzn(java.util.Map$Entry p4)
    {
        String v0_3 = ((com.google.android.recaptcha.internal.zzms) p4.getKey());
        if (v0_3.zze() != com.google.android.recaptcha.internal.zzpx.zzi) {
            return 1;
        } else {
            v0_3.zzg();
            IllegalArgumentException v4_1 = p4.getValue();
            if (!(v4_1 instanceof com.google.android.recaptcha.internal.zzoj)) {
                if (!(v4_1 instanceof com.google.android.recaptcha.internal.zzns)) {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                } else {
                    return 1;
                }
            } else {
                return ((com.google.android.recaptcha.internal.zzoj) v4_1).zzp();
            }
        }
    }

    private static final int zzo(java.util.Map$Entry p5)
    {
        int v0_2 = ((com.google.android.recaptcha.internal.zzms) p5.getKey());
        int v1_3 = p5.getValue();
        if (v0_2.zze() != com.google.android.recaptcha.internal.zzpx.zzi) {
            return com.google.android.recaptcha.internal.zzmt.zza(v0_2, v1_3);
        } else {
            int v5_6;
            int v1_2;
            int v0_4;
            v0_2.zzg();
            v0_2.zzf();
            if (!(v1_3 instanceof com.google.android.recaptcha.internal.zzns)) {
                int v5_4 = ((com.google.android.recaptcha.internal.zzms) p5.getKey()).zza();
                int v1_0 = ((com.google.android.recaptcha.internal.zzoi) v1_3);
                v0_4 = (com.google.android.recaptcha.internal.zzln.zzA(8) + com.google.android.recaptcha.internal.zzln.zzA(8));
                v5_6 = (com.google.android.recaptcha.internal.zzln.zzA(v5_4) + com.google.android.recaptcha.internal.zzln.zzA(16));
                v1_2 = (com.google.android.recaptcha.internal.zzln.zzx(v1_0) + com.google.android.recaptcha.internal.zzln.zzA(24));
            } else {
                int v5_9 = ((com.google.android.recaptcha.internal.zzms) p5.getKey()).zza();
                int v1_4 = ((com.google.android.recaptcha.internal.zzns) v1_3);
                v0_4 = (com.google.android.recaptcha.internal.zzln.zzA(8) + com.google.android.recaptcha.internal.zzln.zzA(8));
                v5_6 = (com.google.android.recaptcha.internal.zzln.zzA(v5_9) + com.google.android.recaptcha.internal.zzln.zzA(16));
                v1_2 = v1.a.w(v1_4.zza(), v1_4.zza(), com.google.android.recaptcha.internal.zzln.zzA(24));
            }
            return ((v0_4 + v5_6) + v1_2);
        }
    }

    public final bridge synthetic Object clone()
    {
        return this.zzc();
    }

    public final boolean equals(Object p2)
    {
        if (this != p2) {
            if ((p2 instanceof com.google.android.recaptcha.internal.zzmt)) {
                return this.zza.equals(((com.google.android.recaptcha.internal.zzmt) p2).zza);
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

    public final int zzb()
    {
        java.util.Iterator v0_2 = this.zza.zzc();
        int v1_4 = 0;
        int v2 = 0;
        while (v1_4 < v0_2) {
            v2 += com.google.android.recaptcha.internal.zzmt.zzo(this.zza.zzg(v1_4));
            v1_4++;
        }
        java.util.Iterator v0_1 = this.zza.zzd().iterator();
        while (v0_1.hasNext()) {
            v2 += com.google.android.recaptcha.internal.zzmt.zzo(((java.util.Map$Entry) v0_1.next()));
        }
        return v2;
    }

    public final com.google.android.recaptcha.internal.zzmt zzc()
    {
        com.google.android.recaptcha.internal.zzmt v0_1 = new com.google.android.recaptcha.internal.zzmt();
        boolean v1_3 = this.zza.zzc();
        Object v2_4 = 0;
        while (v2_4 < v1_3) {
            com.google.android.recaptcha.internal.zzms v3_3 = this.zza.zzg(v2_4);
            v0_1.zzi(((com.google.android.recaptcha.internal.zzms) ((com.google.android.recaptcha.internal.zzpa) v3_3).zza()), v3_3.getValue());
            v2_4++;
        }
        boolean v1_0 = this.zza.zzd().iterator();
        while (v1_0.hasNext()) {
            Object v2_2 = ((java.util.Map$Entry) v1_0.next());
            v0_1.zzi(((com.google.android.recaptcha.internal.zzms) v2_2.getKey()), v2_2.getValue());
        }
        v0_1.zzd = this.zzd;
        return v0_1;
    }

    public final Object zze(com.google.android.recaptcha.internal.zzms p2)
    {
        int v2_1 = this.zza.get(p2);
        if ((v2_1 instanceof com.google.android.recaptcha.internal.zzns)) {
            throw 0;
        } else {
            return v2_1;
        }
    }

    public final java.util.Iterator zzf()
    {
        if (!this.zza.isEmpty()) {
            if (!this.zzd) {
                return this.zza.entrySet().iterator();
            } else {
                return new com.google.android.recaptcha.internal.zznq(this.zza.entrySet().iterator());
            }
        } else {
            return java.util.Collections.emptyIterator();
        }
    }

    public final void zzg()
    {
        if (!this.zzc) {
            int v0_5 = this.zza.zzc();
            com.google.android.recaptcha.internal.zznd v1_5 = 0;
            while (v1_5 < v0_5) {
                boolean v2_3 = this.zza.zzg(v1_5).getValue();
                if ((v2_3 instanceof com.google.android.recaptcha.internal.zznd)) {
                    ((com.google.android.recaptcha.internal.zznd) v2_3).zzG();
                }
                v1_5++;
            }
            int v0_1 = this.zza.zzd().iterator();
            while (v0_1.hasNext()) {
                com.google.android.recaptcha.internal.zznd v1_3 = ((java.util.Map$Entry) v0_1.next()).getValue();
                if ((v1_3 instanceof com.google.android.recaptcha.internal.zznd)) {
                    ((com.google.android.recaptcha.internal.zznd) v1_3).zzG();
                }
            }
            this.zza.zza();
            this.zzc = 1;
            return;
        } else {
            return;
        }
    }

    public final void zzh(com.google.android.recaptcha.internal.zzmt p4)
    {
        java.util.Map$Entry v0_4 = p4.zza.zzc();
        int v1 = 0;
        while (v1 < v0_4) {
            this.zzm(p4.zza.zzg(v1));
            v1++;
        }
        java.util.Iterator v4_3 = p4.zza.zzd().iterator();
        while (v4_3.hasNext()) {
            this.zzm(((java.util.Map$Entry) v4_3.next()));
        }
        return;
    }

    public final void zzi(com.google.android.recaptcha.internal.zzms p3, Object p4)
    {
        com.google.android.recaptcha.internal.zzpe v0_8;
        p3.zzg();
        com.google.android.recaptcha.internal.zzpe v0_5 = p3.zzd();
        Class vtmp3 = p4.getClass();
        Integer v1 = com.google.android.recaptcha.internal.zzpx.zza;
        switch (v0_5.zza().ordinal()) {
            case 0:
                v0_8 = (p4 instanceof Integer);
                if (v0_8 == null) {
                } else {
                    if ((p4 instanceof com.google.android.recaptcha.internal.zzns)) {
                        this.zzd = 1;
                    }
                    this.zza.zzf(p3, p4);
                    return;
                }
            case 1:
                v0_8 = (p4 instanceof Long);
                break;
            case 2:
                v0_8 = (p4 instanceof Float);
                break;
            case 3:
                v0_8 = (p4 instanceof Double);
                break;
            case 4:
                v0_8 = (p4 instanceof Boolean);
                break;
            case 5:
                v0_8 = (p4 instanceof String);
                break;
            case 6:
                if ((!(p4 instanceof com.google.android.recaptcha.internal.zzle)) && (!(p4 instanceof byte[]))) {
                } else {
                }
                break;
            case 7:
                if ((!(p4 instanceof Integer)) && (!(p4 instanceof com.google.android.recaptcha.internal.zznf))) {
                } else {
                }
                break;
            case 8:
                if ((!(p4 instanceof com.google.android.recaptcha.internal.zzoi)) && (!(p4 instanceof com.google.android.recaptcha.internal.zzns))) {
                } else {
                }
                break;
            default:
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[] {Integer.valueOf(p3.zza()), p3.zzd().zza(), p4.getClass().getName()})));
    }

    public final boolean zzj()
    {
        return this.zzc;
    }

    public final boolean zzk()
    {
        int v0_3 = this.zza.zzc();
        boolean v2_4 = 0;
        while (v2_4 < v0_3) {
            if (com.google.android.recaptcha.internal.zzmt.zzn(this.zza.zzg(v2_4))) {
                v2_4++;
            } else {
                return 0;
            }
        }
        int v0_1 = this.zza.zzd().iterator();
        while (v0_1.hasNext()) {
            if (!com.google.android.recaptcha.internal.zzmt.zzn(((java.util.Map$Entry) v0_1.next()))) {
                return 0;
            }
        }
        return 1;
    }
}
