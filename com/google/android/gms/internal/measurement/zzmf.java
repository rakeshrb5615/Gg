package com.google.android.gms.internal.measurement;
public abstract class zzmf extends com.google.android.gms.internal.measurement.zzks {
    private static final java.util.Map zzd;
    private int zzb;
    protected com.google.android.gms.internal.measurement.zzoj zzc;

    static zzmf()
    {
        com.google.android.gms.internal.measurement.zzmf.zzd = new java.util.concurrent.ConcurrentHashMap();
        return;
    }

    public zzmf()
    {
        this.zzb = -1;
        this.zzc = com.google.android.gms.internal.measurement.zzoj.zza();
        return;
    }

    private final int zzc(com.google.android.gms.internal.measurement.zznx p2)
    {
        return com.google.android.gms.internal.measurement.zznu.zza().zzb(this.getClass()).zze(this);
    }

    public static com.google.android.gms.internal.measurement.zzmf zzco(Class p4)
    {
        IllegalStateException v0_0 = com.google.android.gms.internal.measurement.zzmf.zzd;
        com.google.android.gms.internal.measurement.zzmf v1_1 = ((com.google.android.gms.internal.measurement.zzmf) v0_0.get(p4));
        if (v1_1 == null) {
            try {
                Class.forName(p4.getName(), 1, p4.getClassLoader());
                v1_1 = ((com.google.android.gms.internal.measurement.zzmf) v0_0.get(p4));
            } catch (IllegalStateException v4_1) {
                throw new IllegalStateException("Class initialization cannot fail.", v4_1);
            }
        }
        if (v1_1 != null) {
            return v1_1;
        } else {
            com.google.android.gms.internal.measurement.zzmf v1_7 = ((com.google.android.gms.internal.measurement.zzmf) ((com.google.android.gms.internal.measurement.zzmf) com.google.android.gms.internal.measurement.zzop.zzc(p4)).zzl(6, 0, 0));
            if (v1_7 == null) {
                throw new IllegalStateException();
            } else {
                v0_0.put(p4, v1_7);
                return v1_7;
            }
        }
    }

    public static void zzcp(Class p1, com.google.android.gms.internal.measurement.zzmf p2)
    {
        p2.zzcg();
        com.google.android.gms.internal.measurement.zzmf.zzd.put(p1, p2);
        return;
    }

    public static Object zzcq(com.google.android.gms.internal.measurement.zznm p1, String p2, Object[] p3)
    {
        return new com.google.android.gms.internal.measurement.zznw(p1, p2, p3);
    }

    public static varargs Object zzcr(reflect.Method p0, Object p1, Object[] p2)
    {
        try {
            return p0.invoke(p1, p2);
        } catch (Error v0_3) {
            throw new RuntimeException("Couldn\'t use Java reflection to implement protocol message reflection.", v0_3);
        } catch (Error v0_4) {
            Error v0_5 = v0_4.getCause();
            if ((v0_5 instanceof RuntimeException)) {
                throw ((RuntimeException) v0_5);
            } else {
                if (!(v0_5 instanceof Error)) {
                    throw new RuntimeException("Unexpected exception thrown by generated accessor method.", v0_5);
                } else {
                    throw ((Error) v0_5);
                }
            }
        }
    }

    public static com.google.android.gms.internal.measurement.zzmm zzcs()
    {
        return com.google.android.gms.internal.measurement.zzmg.zzd();
    }

    public static com.google.android.gms.internal.measurement.zzmn zzct()
    {
        return com.google.android.gms.internal.measurement.zzna.zze();
    }

    public static com.google.android.gms.internal.measurement.zzmn zzcu(com.google.android.gms.internal.measurement.zzmn p1)
    {
        return p1.zzd((p1.size() + p1.size()));
    }

    public static com.google.android.gms.internal.measurement.zzmo zzcv()
    {
        return com.google.android.gms.internal.measurement.zznv.zzd();
    }

    public static com.google.android.gms.internal.measurement.zzmo zzcw(com.google.android.gms.internal.measurement.zzmo p1)
    {
        return p1.zzg((p1.size() + p1.size()));
    }

    public static synthetic boolean zzcx(com.google.android.gms.internal.measurement.zzmf p0, boolean p1)
    {
        return com.google.android.gms.internal.measurement.zzmf.zzd(p0, 0);
    }

    private static final boolean zzd(com.google.android.gms.internal.measurement.zzmf p4, boolean p5)
    {
        boolean v2_5 = ((Byte) p4.zzl(1, 0, 0)).byteValue();
        if (v2_5 != 1) {
            if (v2_5) {
                boolean v2_2 = com.google.android.gms.internal.measurement.zznu.zza().zzb(p4.getClass()).zzk(p4);
                if (p5 != 0) {
                    int v5_1;
                    if (1 == v2_2) {
                        v5_1 = p4;
                    } else {
                        v5_1 = 0;
                    }
                    p4.zzl(2, v5_1, 0);
                }
                return v2_2;
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public final boolean equals(Object p4)
    {
        if (this != p4) {
            if (p4) {
                if (this.getClass() == p4.getClass()) {
                    return com.google.android.gms.internal.measurement.zznu.zza().zzb(this.getClass()).zzb(this, ((com.google.android.gms.internal.measurement.zzmf) p4));
                } else {
                    return 0;
                }
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        if (this.zzcf()) {
            return this.zzci();
        } else {
            int v0_2 = this.zza;
            if (v0_2 == 0) {
                v0_2 = this.zzci();
                this.zza = v0_2;
            }
            return v0_2;
        }
    }

    public final String toString()
    {
        return com.google.android.gms.internal.measurement.zzno.zza(this, super.toString());
    }

    public final void zzcB(com.google.android.gms.internal.measurement.zzlm p3)
    {
        com.google.android.gms.internal.measurement.zznu.zza().zzb(this.getClass()).zzf(this, com.google.android.gms.internal.measurement.zzln.zza(p3));
        return;
    }

    public final synthetic com.google.android.gms.internal.measurement.zznl zzcC()
    {
        return ((com.google.android.gms.internal.measurement.zzmb) this.zzl(5, 0, 0));
    }

    public final boolean zzcD()
    {
        return com.google.android.gms.internal.measurement.zzmf.zzd(this, 1);
    }

    public final synthetic com.google.android.gms.internal.measurement.zznm zzcE()
    {
        return ((com.google.android.gms.internal.measurement.zzmf) this.zzl(6, 0, 0));
    }

    public final int zzcd(com.google.android.gms.internal.measurement.zznx p5)
    {
        if (!this.zzcf()) {
            IllegalStateException v0_9 = (this.zzb & 2147483647);
            if (v0_9 != 2147483647) {
                return v0_9;
            } else {
                String v5_1 = p5.zze(this);
                if (v5_1 < null) {
                    StringBuilder v3_1 = new StringBuilder((String.valueOf(v5_1).length() + 42));
                    v3_1.append("serialized size must be non-negative, was ");
                    v3_1.append(v5_1);
                    throw new IllegalStateException(v3_1.toString());
                } else {
                    this.zzb = ((this.zzb & -2147483648) | v5_1);
                    return v5_1;
                }
            }
        } else {
            String v5_3 = p5.zze(this);
            if (v5_3 < null) {
                StringBuilder v3_3 = new StringBuilder((String.valueOf(v5_3).length() + 42));
                v3_3.append("serialized size must be non-negative, was ");
                v3_3.append(v5_3);
                throw new IllegalStateException(v3_3.toString());
            } else {
                return v5_3;
            }
        }
    }

    public final boolean zzcf()
    {
        if ((this.zzb & -2147483648) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void zzcg()
    {
        this.zzb = (this.zzb & 2147483647);
        return;
    }

    public final com.google.android.gms.internal.measurement.zzmf zzch()
    {
        return ((com.google.android.gms.internal.measurement.zzmf) this.zzl(4, 0, 0));
    }

    public final int zzci()
    {
        return com.google.android.gms.internal.measurement.zznu.zza().zzb(this.getClass()).zzc(this);
    }

    public final void zzcj()
    {
        com.google.android.gms.internal.measurement.zznu.zza().zzb(this.getClass()).zzj(this);
        this.zzcg();
        return;
    }

    public final com.google.android.gms.internal.measurement.zzmb zzck()
    {
        return ((com.google.android.gms.internal.measurement.zzmb) this.zzl(5, 0, 0));
    }

    public final com.google.android.gms.internal.measurement.zzmb zzcl()
    {
        com.google.android.gms.internal.measurement.zzmb v0_2 = ((com.google.android.gms.internal.measurement.zzmb) this.zzl(5, 0, 0));
        v0_2.zzbd(this);
        return v0_2;
    }

    public final void zzcm(int p2)
    {
        this.zzb = ((this.zzb & -2147483648) | 2147483647);
        return;
    }

    public final int zzcn()
    {
        if (!this.zzcf()) {
            String v0_6 = (this.zzb & 2147483647);
            if (v0_6 == 2147483647) {
                String v0_1 = this.zzc(0);
                if (v0_1 < null) {
                    StringBuilder v4_1 = new StringBuilder((String.valueOf(v0_1).length() + 42));
                    v4_1.append("serialized size must be non-negative, was ");
                    v4_1.append(v0_1);
                    throw new IllegalStateException(v4_1.toString());
                } else {
                    this.zzb = ((this.zzb & -2147483648) | v0_1);
                    return v0_1;
                }
            } else {
                return v0_6;
            }
        } else {
            String v0_3 = this.zzc(0);
            if (v0_3 < null) {
                StringBuilder v4_3 = new StringBuilder((String.valueOf(v0_3).length() + 42));
                v4_3.append("serialized size must be non-negative, was ");
                v4_3.append(v0_3);
                throw new IllegalStateException(v4_3.toString());
            } else {
                return v0_3;
            }
        }
    }

    public abstract Object zzl();
}
