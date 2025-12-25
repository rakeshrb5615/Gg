package com.google.android.gms.internal.firebase-auth-api;
final class zzakx {
    private static final com.google.android.gms.internal.firebase-auth-api.zzakx zzb;
    final com.google.android.gms.internal.firebase-auth-api.zzang zza;
    private boolean zzc;
    private boolean zzd;

    static zzakx()
    {
        com.google.android.gms.internal.firebase-auth-api.zzakx.zzb = new com.google.android.gms.internal.firebase-auth-api.zzakx(1);
        return;
    }

    private zzakx()
    {
        this.zza = new com.google.android.gms.internal.firebase-auth-api.zzanf();
        return;
    }

    private zzakx(com.google.android.gms.internal.firebase-auth-api.zzang p1)
    {
        this.zza = p1;
        this.zze();
        return;
    }

    private zzakx(boolean p1)
    {
        this(new com.google.android.gms.internal.firebase-auth-api.zzanf());
        this.zze();
        return;
    }

    public static int zza(com.google.android.gms.internal.firebase-auth-api.zzakz p5, Object p6)
    {
        com.google.android.gms.internal.firebase-auth-api.zzaog v0 = p5.zzb();
        int v1 = p5.zza();
        if (!p5.zze()) {
            return com.google.android.gms.internal.firebase-auth-api.zzakx.zza(v0, v1, p6);
        } else {
            int v2_0 = ((java.util.List) p6).size();
            int v3 = 0;
            if (!p5.zzd()) {
                int v5_2 = 0;
                while (v3 < v2_0) {
                    v5_2 += com.google.android.gms.internal.firebase-auth-api.zzakx.zza(v0, v1, ((java.util.List) p6).get(v3));
                    v3++;
                }
                return v5_2;
            } else {
                if (!((java.util.List) p6).isEmpty()) {
                    int v5_4 = 0;
                    while (v3 < v2_0) {
                        v5_4 += com.google.android.gms.internal.firebase-auth-api.zzakx.zza(v0, ((java.util.List) p6).get(v3));
                        v3++;
                    }
                    return (com.google.android.gms.internal.firebase-auth-api.zzakn.zzi(v5_4) + (com.google.android.gms.internal.firebase-auth-api.zzakn.zzh(v1) + v5_4));
                } else {
                    return 0;
                }
            }
        }
    }

    public static int zza(com.google.android.gms.internal.firebase-auth-api.zzaog p1, int p2, Object p3)
    {
        int v2_1 = com.google.android.gms.internal.firebase-auth-api.zzakn.zzh(p2);
        if (p1 == com.google.android.gms.internal.firebase-auth-api.zzaog.zzj) {
            com.google.android.gms.internal.firebase-auth-api.zzalh.zza(((com.google.android.gms.internal.firebase-auth-api.zzamm) p3));
            v2_1 <<= 1;
        }
        return (v2_1 + com.google.android.gms.internal.firebase-auth-api.zzakx.zza(p1, p3));
    }

    private static int zza(com.google.android.gms.internal.firebase-auth-api.zzaog p1, Object p2)
    {
        switch (com.google.android.gms.internal.firebase-auth-api.zzala.zzb[p1.ordinal()]) {
            case 1:
                return com.google.android.gms.internal.firebase-auth-api.zzakn.zza(((Double) p2).doubleValue());
            case 2:
                return com.google.android.gms.internal.firebase-auth-api.zzakn.zza(((Float) p2).floatValue());
            case 3:
                return com.google.android.gms.internal.firebase-auth-api.zzakn.zzb(((Long) p2).longValue());
            case 4:
                return com.google.android.gms.internal.firebase-auth-api.zzakn.zze(((Long) p2).longValue());
            case 5:
                return com.google.android.gms.internal.firebase-auth-api.zzakn.zzc(((Integer) p2).intValue());
            case 6:
                return com.google.android.gms.internal.firebase-auth-api.zzakn.zza(((Long) p2).longValue());
            case 7:
                return com.google.android.gms.internal.firebase-auth-api.zzakn.zzb(((Integer) p2).intValue());
            case 8:
                return com.google.android.gms.internal.firebase-auth-api.zzakn.zza(((Boolean) p2).booleanValue());
            case 9:
                return ((com.google.android.gms.internal.firebase-auth-api.zzamm) p2).zzl();
            case 10:
                if (!(p2 instanceof com.google.android.gms.internal.firebase-auth-api.zzalq)) {
                    return com.google.android.gms.internal.firebase-auth-api.zzakn.zza(((com.google.android.gms.internal.firebase-auth-api.zzamm) p2));
                } else {
                    return com.google.android.gms.internal.firebase-auth-api.zzakn.zza(((com.google.android.gms.internal.firebase-auth-api.zzalq) p2));
                }
            case 11:
                if (!(p2 instanceof com.google.android.gms.internal.firebase-auth-api.zzajv)) {
                    return com.google.android.gms.internal.firebase-auth-api.zzakn.zza(((String) p2));
                } else {
                    return com.google.android.gms.internal.firebase-auth-api.zzakn.zza(((com.google.android.gms.internal.firebase-auth-api.zzajv) p2));
                }
            case 12:
                if (!(p2 instanceof com.google.android.gms.internal.firebase-auth-api.zzajv)) {
                    return com.google.android.gms.internal.firebase-auth-api.zzakn.zza(((byte[]) p2));
                } else {
                    return com.google.android.gms.internal.firebase-auth-api.zzakn.zza(((com.google.android.gms.internal.firebase-auth-api.zzajv) p2));
                }
            case 13:
                return com.google.android.gms.internal.firebase-auth-api.zzakn.zzi(((Integer) p2).intValue());
            case 14:
                return com.google.android.gms.internal.firebase-auth-api.zzakn.zzf(((Integer) p2).intValue());
            case 15:
                return com.google.android.gms.internal.firebase-auth-api.zzakn.zzc(((Long) p2).longValue());
            case 16:
                return com.google.android.gms.internal.firebase-auth-api.zzakn.zzg(((Integer) p2).intValue());
            case 17:
                return com.google.android.gms.internal.firebase-auth-api.zzakn.zzd(((Long) p2).longValue());
            case 18:
                if (!(p2 instanceof com.google.android.gms.internal.firebase-auth-api.zzalk)) {
                    return com.google.android.gms.internal.firebase-auth-api.zzakn.zza(((Integer) p2).intValue());
                } else {
                    return com.google.android.gms.internal.firebase-auth-api.zzakn.zza(((com.google.android.gms.internal.firebase-auth-api.zzalk) p2).zza());
                }
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static int zza(java.util.Map$Entry p4)
    {
        boolean v0_2 = ((com.google.android.gms.internal.firebase-auth-api.zzakz) p4.getKey());
        com.google.android.gms.internal.firebase-auth-api.zzamm v1_2 = p4.getValue();
        if ((v0_2.zzc() != com.google.android.gms.internal.firebase-auth-api.zzaoj.zzi) || ((v0_2.zze()) || (v0_2.zzd()))) {
            return com.google.android.gms.internal.firebase-auth-api.zzakx.zza(v0_2, v1_2);
        } else {
            if (!(v1_2 instanceof com.google.android.gms.internal.firebase-auth-api.zzalq)) {
                return com.google.android.gms.internal.firebase-auth-api.zzakn.zza(((com.google.android.gms.internal.firebase-auth-api.zzakz) p4.getKey()).zza(), ((com.google.android.gms.internal.firebase-auth-api.zzamm) v1_2));
            } else {
                return com.google.android.gms.internal.firebase-auth-api.zzakn.zza(((com.google.android.gms.internal.firebase-auth-api.zzakz) p4.getKey()).zza(), ((com.google.android.gms.internal.firebase-auth-api.zzalq) v1_2));
            }
        }
    }

    private final Object zza(com.google.android.gms.internal.firebase-auth-api.zzakz p2)
    {
        NoSuchMethodError v2_1 = this.zza.get(p2);
        if ((v2_1 instanceof com.google.android.gms.internal.firebase-auth-api.zzalq)) {
            throw new NoSuchMethodError();
        } else {
            return v2_1;
        }
    }

    private static Object zza(Object p3)
    {
        if (!(p3 instanceof com.google.android.gms.internal.firebase-auth-api.zzamr)) {
            if (!(p3 instanceof byte[])) {
                return p3;
            } else {
                byte[] v3_3 = ((byte[]) p3);
                byte[] v0_3 = new byte[((byte[]) p3).length];
                System.arraycopy(v3_3, 0, v0_3, 0, v3_3.length);
                return v0_3;
            }
        } else {
            return ((com.google.android.gms.internal.firebase-auth-api.zzamr) p3).zza();
        }
    }

    public static void zza(com.google.android.gms.internal.firebase-auth-api.zzakn p1, com.google.android.gms.internal.firebase-auth-api.zzaog p2, int p3, Object p4)
    {
        if (p2 != com.google.android.gms.internal.firebase-auth-api.zzaog.zzj) {
            p1.zzj(p3, p2.zza());
            switch (com.google.android.gms.internal.firebase-auth-api.zzala.zzb[p2.ordinal()]) {
                case 1:
                    p1.zzb(((Double) p4).doubleValue());
                    return;
                case 2:
                    p1.zzb(((Float) p4).floatValue());
                    return;
                case 3:
                    p1.zzh(((Long) p4).longValue());
                    return;
                case 4:
                    p1.zzh(((Long) p4).longValue());
                    return;
                case 5:
                    p1.zzk(((Integer) p4).intValue());
                    return;
                case 6:
                    p1.zzf(((Long) p4).longValue());
                    return;
                case 7:
                    p1.zzj(((Integer) p4).intValue());
                    return;
                case 8:
                    p1.zzb(((Boolean) p4).booleanValue());
                    return;
                case 9:
                    ((com.google.android.gms.internal.firebase-auth-api.zzamm) p4).zza(p1);
                    return;
                case 10:
                    p1.zzb(((com.google.android.gms.internal.firebase-auth-api.zzamm) p4));
                    return;
                case 11:
                    if (!(p4 instanceof com.google.android.gms.internal.firebase-auth-api.zzajv)) {
                        p1.zzb(((String) p4));
                        return;
                    } else {
                        p1.zzb(((com.google.android.gms.internal.firebase-auth-api.zzajv) p4));
                        return;
                    }
                case 12:
                    if (!(p4 instanceof com.google.android.gms.internal.firebase-auth-api.zzajv)) {
                        p1.zzb(((byte[]) p4), 0, ((byte[]) p4).length);
                        return;
                    } else {
                        p1.zzb(((com.google.android.gms.internal.firebase-auth-api.zzajv) p4));
                        return;
                    }
                case 13:
                    p1.zzm(((Integer) p4).intValue());
                    return;
                case 14:
                    p1.zzj(((Integer) p4).intValue());
                    return;
                case 15:
                    p1.zzf(((Long) p4).longValue());
                    return;
                case 16:
                    p1.zzl(((Integer) p4).intValue());
                    return;
                case 17:
                    p1.zzg(((Long) p4).longValue());
                    return;
                case 18:
                    if (!(p4 instanceof com.google.android.gms.internal.firebase-auth-api.zzalk)) {
                        p1.zzk(((Integer) p4).intValue());
                        return;
                    } else {
                        p1.zzk(((com.google.android.gms.internal.firebase-auth-api.zzalk) p4).zza());
                        return;
                    }
                default:
                    return;
            }
        } else {
            com.google.android.gms.internal.firebase-auth-api.zzalh.zza(((com.google.android.gms.internal.firebase-auth-api.zzamm) p4));
            p1.zzj(p3, 3);
            ((com.google.android.gms.internal.firebase-auth-api.zzamm) p4).zza(p1);
            p1.zzj(p3, 4);
            return;
        }
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzakx zzb()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzakx.zzb;
    }

    private final void zzb(com.google.android.gms.internal.firebase-auth-api.zzakz p5, Object p6)
    {
        if (!p5.zze()) {
            com.google.android.gms.internal.firebase-auth-api.zzakx.zzc(p5, p6);
        } else {
            if (!(p6 instanceof java.util.List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            } else {
                com.google.android.gms.internal.firebase-auth-api.zzang v0_1 = ((java.util.List) p6).size();
                java.util.ArrayList v1_1 = new java.util.ArrayList(v0_1);
                int v2 = 0;
                while (v2 < v0_1) {
                    Object v3 = ((java.util.List) p6).get(v2);
                    com.google.android.gms.internal.firebase-auth-api.zzakx.zzc(p5, v3);
                    v1_1.add(v3);
                    v2++;
                }
                p6 = v1_1;
            }
        }
        if ((p6 instanceof com.google.android.gms.internal.firebase-auth-api.zzalq)) {
            this.zzd = 1;
        }
        this.zza.zza(p5, p6);
        return;
    }

    private final void zzb(java.util.Map$Entry p7)
    {
        String v0_2 = ((com.google.android.gms.internal.firebase-auth-api.zzakz) p7.getKey());
        com.google.android.gms.internal.firebase-auth-api.zzamm v7_9 = p7.getValue();
        com.google.android.gms.internal.firebase-auth-api.zzang v1_4 = (v7_9 instanceof com.google.android.gms.internal.firebase-auth-api.zzalq);
        if (!v0_2.zze()) {
            if (v0_2.zzc() != com.google.android.gms.internal.firebase-auth-api.zzaoj.zzi) {
                if (v1_4 != null) {
                    throw new IllegalStateException("Lazy fields must be message-valued");
                } else {
                    this.zza.zza(v0_2, com.google.android.gms.internal.firebase-auth-api.zzakx.zza(v7_9));
                    return;
                }
            } else {
                com.google.android.gms.internal.firebase-auth-api.zzamm v2_1 = this.zza(v0_2);
                if (v2_1 != null) {
                    if (v1_4 != null) {
                        throw new NoSuchMethodError();
                    } else {
                        com.google.android.gms.internal.firebase-auth-api.zzamm v7_8;
                        if (!(v2_1 instanceof com.google.android.gms.internal.firebase-auth-api.zzamr)) {
                            v7_8 = v0_2.zza(((com.google.android.gms.internal.firebase-auth-api.zzamm) v2_1).zzr(), ((com.google.android.gms.internal.firebase-auth-api.zzamm) v7_9)).zze();
                        } else {
                            v7_8 = v0_2.zza(((com.google.android.gms.internal.firebase-auth-api.zzamr) v2_1), ((com.google.android.gms.internal.firebase-auth-api.zzamr) v7_9));
                        }
                        this.zza.zza(v0_2, v7_8);
                        return;
                    }
                } else {
                    this.zza.zza(v0_2, com.google.android.gms.internal.firebase-auth-api.zzakx.zza(v7_9));
                    if (v1_4 != null) {
                        this.zzd = 1;
                    }
                    return;
                }
            }
        } else {
            if (v1_4 != null) {
                throw new IllegalStateException("Lazy fields can not be repeated");
            } else {
                com.google.android.gms.internal.firebase-auth-api.zzang v1_5 = this.zza(v0_2);
                com.google.android.gms.internal.firebase-auth-api.zzamm v7_15 = ((java.util.List) v7_9);
                com.google.android.gms.internal.firebase-auth-api.zzamm v2_5 = v7_15.size();
                if (v1_5 == null) {
                    v1_5 = new java.util.ArrayList(v2_5);
                }
                int v4 = 0;
                while (v4 < v2_5) {
                    ((java.util.List) v1_5).add(com.google.android.gms.internal.firebase-auth-api.zzakx.zza(v7_15.get(v4)));
                    v4++;
                }
                this.zza.zza(v0_2, v1_5);
                return;
            }
        }
    }

    private static boolean zzb(Object p1)
    {
        if (!(p1 instanceof com.google.android.gms.internal.firebase-auth-api.zzamo)) {
            if (!(p1 instanceof com.google.android.gms.internal.firebase-auth-api.zzalq)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            } else {
                return 1;
            }
        } else {
            return ((com.google.android.gms.internal.firebase-auth-api.zzamo) p1).zzv();
        }
    }

    private static void zzc(com.google.android.gms.internal.firebase-auth-api.zzakz p3, Object p4)
    {
        IllegalArgumentException v0_0 = p3.zzb();
        com.google.android.gms.internal.firebase-auth-api.zzalh.zza(p4);
        Integer v1_0 = 1;
        switch (com.google.android.gms.internal.firebase-auth-api.zzala.zza[v0_0.zzb().ordinal()]) {
            case 1:
                v1_0 = (p4 instanceof Integer);
                break;
            case 2:
                v1_0 = (p4 instanceof Long);
                break;
            case 3:
                v1_0 = (p4 instanceof Float);
                break;
            case 4:
                v1_0 = (p4 instanceof Double);
                break;
            case 5:
                v1_0 = (p4 instanceof Boolean);
                break;
            case 6:
                v1_0 = (p4 instanceof String);
                break;
            case 7:
                if ((!(p4 instanceof com.google.android.gms.internal.firebase-auth-api.zzajv)) && (!(p4 instanceof byte[]))) {
                    v1_0 = 0;
                } else {
                }
                break;
            case 8:
                if ((!(p4 instanceof Integer)) && (!(p4 instanceof com.google.android.gms.internal.firebase-auth-api.zzalk))) {
                } else {
                }
                break;
            case 9:
                if ((!(p4 instanceof com.google.android.gms.internal.firebase-auth-api.zzamm)) && (!(p4 instanceof com.google.android.gms.internal.firebase-auth-api.zzalq))) {
                } else {
                }
                break;
            default:
        }
        if (v1_0 == null) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[] {Integer.valueOf(p3.zza()), p3.zzb().zzb(), p4.getClass().getName()})));
        } else {
            return;
        }
    }

    private static boolean zzc(java.util.Map$Entry p4)
    {
        int v0_2 = ((com.google.android.gms.internal.firebase-auth-api.zzakz) p4.getKey());
        if (v0_2.zzc() == com.google.android.gms.internal.firebase-auth-api.zzaoj.zzi) {
            if (!v0_2.zze()) {
                return com.google.android.gms.internal.firebase-auth-api.zzakx.zzb(p4.getValue());
            } else {
                boolean v4_4 = ((java.util.List) p4.getValue());
                int v0_1 = v4_4.size();
                int v2_0 = 0;
                while (v2_0 < v0_1) {
                    if (com.google.android.gms.internal.firebase-auth-api.zzakx.zzb(v4_4.get(v2_0))) {
                        v2_0++;
                    } else {
                        return 0;
                    }
                }
            }
        }
        return 1;
    }

    public final synthetic Object clone()
    {
        void v0_1 = new com.google.android.gms.internal.firebase-auth-api.zzakx();
        boolean v1_3 = this.zza.zzb();
        Object v2_4 = 0;
        while (v2_4 < v1_3) {
            com.google.android.gms.internal.firebase-auth-api.zzakz v3_3 = this.zza.zza(v2_4);
            v0_1 = v0_1.zzb(((com.google.android.gms.internal.firebase-auth-api.zzakz) v3_3.getKey()), v3_3.getValue());
            v2_4++;
        }
        boolean v1_0 = this.zza.zzc().iterator();
        while (v1_0.hasNext()) {
            Object v2_2 = ((java.util.Map$Entry) v1_0.next());
            v0_1 = v0_1.zzb(((com.google.android.gms.internal.firebase-auth-api.zzakz) v2_2.getKey()), v2_2.getValue());
        }
        v0_1.zzd = this.zzd;
        return v0_1;
    }

    public final boolean equals(Object p2)
    {
        if (this != p2) {
            if ((p2 instanceof com.google.android.gms.internal.firebase-auth-api.zzakx)) {
                return this.zza.equals(((com.google.android.gms.internal.firebase-auth-api.zzakx) p2).zza);
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

    public final int zza()
    {
        java.util.Iterator v0_2 = this.zza.zzb();
        int v1_4 = 0;
        int v2 = 0;
        while (v1_4 < v0_2) {
            v2 += com.google.android.gms.internal.firebase-auth-api.zzakx.zza(this.zza.zza(v1_4));
            v1_4++;
        }
        java.util.Iterator v0_1 = this.zza.zzc().iterator();
        while (v0_1.hasNext()) {
            v2 += com.google.android.gms.internal.firebase-auth-api.zzakx.zza(((java.util.Map$Entry) v0_1.next()));
        }
        return v2;
    }

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzakx p4)
    {
        java.util.Map$Entry v0_4 = p4.zza.zzb();
        int v1 = 0;
        while (v1 < v0_4) {
            this.zzb(p4.zza.zza(v1));
            v1++;
        }
        java.util.Iterator v4_3 = p4.zza.zzc().iterator();
        while (v4_3.hasNext()) {
            this.zzb(((java.util.Map$Entry) v4_3.next()));
        }
        return;
    }

    public final java.util.Iterator zzc()
    {
        if (!this.zza.isEmpty()) {
            if (!this.zzd) {
                return this.zza.zzd().iterator();
            } else {
                return new com.google.android.gms.internal.firebase-auth-api.zzals(this.zza.zzd().iterator());
            }
        } else {
            return java.util.Collections.emptyIterator();
        }
    }

    public final java.util.Iterator zzd()
    {
        if (!this.zza.isEmpty()) {
            if (!this.zzd) {
                return this.zza.entrySet().iterator();
            } else {
                return new com.google.android.gms.internal.firebase-auth-api.zzals(this.zza.entrySet().iterator());
            }
        } else {
            return java.util.Collections.emptyIterator();
        }
    }

    public final void zze()
    {
        if (!this.zzc) {
            int v0_5 = this.zza.zzb();
            com.google.android.gms.internal.firebase-auth-api.zzalf v1_5 = 0;
            while (v1_5 < v0_5) {
                boolean v2_3 = this.zza.zza(v1_5).getValue();
                if ((v2_3 instanceof com.google.android.gms.internal.firebase-auth-api.zzalf)) {
                    ((com.google.android.gms.internal.firebase-auth-api.zzalf) v2_3).zzt();
                }
                v1_5++;
            }
            int v0_1 = this.zza.zzc().iterator();
            while (v0_1.hasNext()) {
                com.google.android.gms.internal.firebase-auth-api.zzalf v1_3 = ((java.util.Map$Entry) v0_1.next()).getValue();
                if ((v1_3 instanceof com.google.android.gms.internal.firebase-auth-api.zzalf)) {
                    ((com.google.android.gms.internal.firebase-auth-api.zzalf) v1_3).zzt();
                }
            }
            this.zza.zza();
            this.zzc = 1;
            return;
        } else {
            return;
        }
    }

    public final boolean zzf()
    {
        return this.zzc;
    }

    public final boolean zzg()
    {
        int v0_3 = this.zza.zzb();
        boolean v2_4 = 0;
        while (v2_4 < v0_3) {
            if (com.google.android.gms.internal.firebase-auth-api.zzakx.zzc(this.zza.zza(v2_4))) {
                v2_4++;
            } else {
                return 0;
            }
        }
        int v0_1 = this.zza.zzc().iterator();
        while (v0_1.hasNext()) {
            if (!com.google.android.gms.internal.firebase-auth-api.zzakx.zzc(((java.util.Map$Entry) v0_1.next()))) {
                return 0;
            }
        }
        return 1;
    }
}
