package com.google.android.gms.internal.play_billing;
public abstract class zzfi extends com.google.android.gms.internal.play_billing.zzds {
    private static final java.util.Map zzb;
    protected com.google.android.gms.internal.play_billing.zzhi zzc;
    private int zzd;

    static zzfi()
    {
        com.google.android.gms.internal.play_billing.zzfi.zzb = new java.util.concurrent.ConcurrentHashMap();
        return;
    }

    public zzfi()
    {
        this.zzd = -1;
        this.zzc = com.google.android.gms.internal.play_billing.zzhi.zzc();
        return;
    }

    private static final boolean zzA(com.google.android.gms.internal.play_billing.zzfi p4, boolean p5)
    {
        boolean v2_5 = ((Byte) p4.zzb(1, 0, 0)).byteValue();
        if (v2_5 != 1) {
            if (v2_5) {
                boolean v2_2 = com.google.android.gms.internal.play_billing.zzgs.zza().zzb(p4.getClass()).zzk(p4);
                if (p5 != 0) {
                    int v5_1;
                    if (1 == v2_2) {
                        v5_1 = p4;
                    } else {
                        v5_1 = 0;
                    }
                    p4.zzb(2, v5_1, 0);
                }
                return v2_2;
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    private final int zzc(com.google.android.gms.internal.play_billing.zzgv p2)
    {
        return com.google.android.gms.internal.play_billing.zzgs.zza().zzb(this.getClass()).zza(this);
    }

    private static com.google.android.gms.internal.play_billing.zzfi zzd(com.google.android.gms.internal.play_billing.zzfi p6, byte[] p7, int p8, int p9, com.google.android.gms.internal.play_billing.zzeu p10)
    {
        if (p9 != 0) {
            com.google.android.gms.internal.play_billing.zzfi v1 = p6.zzo();
            try {
                java.io.IOException v0_3 = com.google.android.gms.internal.play_billing.zzgs.zza().zzb(v1.getClass());
                v0_3.zzh(v1, p7, 0, p9, new com.google.android.gms.internal.play_billing.zzdw(p10));
                v0_3.zzf(v1);
                return v1;
            } catch (java.io.IOException v0_2) {
                throw v0_2;
            } catch (java.io.IOException v0_1) {
                throw v0_1.zza();
            } catch (IndexOutOfBoundsException) {
                throw new com.google.android.gms.internal.play_billing.zzfq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            } catch (java.io.IOException v0_0) {
                com.google.android.gms.internal.play_billing.zzfq v6_3 = v0_0;
                if (!(v6_3.getCause() instanceof com.google.android.gms.internal.play_billing.zzfq)) {
                    throw new com.google.android.gms.internal.play_billing.zzfq(v6_3);
                } else {
                    throw ((com.google.android.gms.internal.play_billing.zzfq) v6_3.getCause());
                }
            }
        } else {
            return p6;
        }
    }

    public static com.google.android.gms.internal.play_billing.zzfi zzn(Class p4)
    {
        IllegalStateException v0_0 = com.google.android.gms.internal.play_billing.zzfi.zzb;
        com.google.android.gms.internal.play_billing.zzfi v1_1 = ((com.google.android.gms.internal.play_billing.zzfi) v0_0.get(p4));
        if (v1_1 == null) {
            try {
                Class.forName(p4.getName(), 1, p4.getClassLoader());
                v1_1 = ((com.google.android.gms.internal.play_billing.zzfi) v0_0.get(p4));
            } catch (IllegalStateException v4_1) {
                throw new IllegalStateException("Class initialization cannot fail.", v4_1);
            }
        }
        if (v1_1 != null) {
            return v1_1;
        } else {
            com.google.android.gms.internal.play_billing.zzfi v1_7 = ((com.google.android.gms.internal.play_billing.zzfi) ((com.google.android.gms.internal.play_billing.zzfi) com.google.android.gms.internal.play_billing.zzho.zze(p4)).zzb(6, 0, 0));
            if (v1_7 == null) {
                throw new IllegalStateException();
            } else {
                v0_0.put(p4, v1_7);
                return v1_7;
            }
        }
    }

    public static com.google.android.gms.internal.play_billing.zzfi zzp(com.google.android.gms.internal.play_billing.zzfi p2, byte[] p3, com.google.android.gms.internal.play_billing.zzeu p4)
    {
        com.google.android.gms.internal.play_billing.zzfq v2_2 = com.google.android.gms.internal.play_billing.zzfi.zzd(p2, p3, 0, p3.length, p4);
        if ((v2_2 != null) && (!com.google.android.gms.internal.play_billing.zzfi.zzA(v2_2, 1))) {
            throw new com.google.android.gms.internal.play_billing.zzhg(v2_2).zza();
        } else {
            return v2_2;
        }
    }

    public static com.google.android.gms.internal.play_billing.zzfm zzq()
    {
        return com.google.android.gms.internal.play_billing.zzfj.zzf();
    }

    public static com.google.android.gms.internal.play_billing.zzfn zzr()
    {
        return com.google.android.gms.internal.play_billing.zzgt.zze();
    }

    public static varargs Object zzs(reflect.Method p0, Object p1, Object[] p2)
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

    public static Object zzt(com.google.android.gms.internal.play_billing.zzgl p1, String p2, Object[] p3)
    {
        return new com.google.android.gms.internal.play_billing.zzgu(p1, p2, p3);
    }

    public static void zzw(Class p1, com.google.android.gms.internal.play_billing.zzfi p2)
    {
        p2.zzv();
        com.google.android.gms.internal.play_billing.zzfi.zzb.put(p1, p2);
        return;
    }

    public static bridge synthetic boolean zzy(com.google.android.gms.internal.play_billing.zzfi p0, boolean p1)
    {
        return com.google.android.gms.internal.play_billing.zzfi.zzA(p0, 0);
    }

    public final boolean equals(Object p4)
    {
        if (this != p4) {
            if (p4) {
                if (this.getClass() == p4.getClass()) {
                    return com.google.android.gms.internal.play_billing.zzgs.zza().zzb(this.getClass()).zzj(this, ((com.google.android.gms.internal.play_billing.zzfi) p4));
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
        if (this.zzz()) {
            return this.zzi();
        } else {
            int v0_2 = this.zza;
            if (v0_2 == 0) {
                v0_2 = this.zzi();
                this.zza = v0_2;
            }
            return v0_2;
        }
    }

    public final String toString()
    {
        return com.google.android.gms.internal.play_billing.zzgn.zza(this, super.toString());
    }

    public final synthetic com.google.android.gms.internal.play_billing.zzgk zzK()
    {
        return ((com.google.android.gms.internal.play_billing.zzfe) this.zzb(5, 0, 0));
    }

    public final void zzL(com.google.android.gms.internal.play_billing.zzep p3)
    {
        com.google.android.gms.internal.play_billing.zzgs.zza().zzb(this.getClass()).zzi(this, com.google.android.gms.internal.play_billing.zzeq.zza(p3));
        return;
    }

    public abstract Object zzb();

    public final int zze(com.google.android.gms.internal.play_billing.zzgv p4)
    {
        if (!this.zzz()) {
            IllegalStateException v0_9 = (this.zzd & 2147483647);
            if (v0_9 != 2147483647) {
                return v0_9;
            } else {
                String v4_1 = p4.zza(this);
                if (v4_1 < null) {
                    throw new IllegalStateException(g2.g.c(v4_1, "serialized size must be non-negative, was "));
                } else {
                    this.zzd = ((this.zzd & -2147483648) | v4_1);
                    return v4_1;
                }
            }
        } else {
            String v4_3 = p4.zza(this);
            if (v4_3 < null) {
                throw new IllegalStateException(g2.g.c(v4_3, "serialized size must be non-negative, was "));
            } else {
                return v4_3;
            }
        }
    }

    public final synthetic com.google.android.gms.internal.play_billing.zzgl zzh()
    {
        return ((com.google.android.gms.internal.play_billing.zzfi) this.zzb(6, 0, 0));
    }

    public final int zzi()
    {
        return com.google.android.gms.internal.play_billing.zzgs.zza().zzb(this.getClass()).zzb(this);
    }

    public final int zzj()
    {
        if (!this.zzz()) {
            String v0_6 = (this.zzd & 2147483647);
            if (v0_6 == 2147483647) {
                String v0_1 = this.zzc(0);
                if (v0_1 < null) {
                    throw new IllegalStateException(g2.g.c(v0_1, "serialized size must be non-negative, was "));
                } else {
                    this.zzd = ((this.zzd & -2147483648) | v0_1);
                    return v0_1;
                }
            } else {
                return v0_6;
            }
        } else {
            String v0_3 = this.zzc(0);
            if (v0_3 < null) {
                throw new IllegalStateException(g2.g.c(v0_3, "serialized size must be non-negative, was "));
            } else {
                return v0_3;
            }
        }
    }

    public final boolean zzk()
    {
        return com.google.android.gms.internal.play_billing.zzfi.zzA(this, 1);
    }

    public final com.google.android.gms.internal.play_billing.zzfe zzl()
    {
        return ((com.google.android.gms.internal.play_billing.zzfe) this.zzb(5, 0, 0));
    }

    public final com.google.android.gms.internal.play_billing.zzfe zzm()
    {
        com.google.android.gms.internal.play_billing.zzfe v0_2 = ((com.google.android.gms.internal.play_billing.zzfe) this.zzb(5, 0, 0));
        v0_2.zzd(this);
        return v0_2;
    }

    public final com.google.android.gms.internal.play_billing.zzfi zzo()
    {
        return ((com.google.android.gms.internal.play_billing.zzfi) this.zzb(4, 0, 0));
    }

    public final void zzu()
    {
        com.google.android.gms.internal.play_billing.zzgs.zza().zzb(this.getClass()).zzf(this);
        this.zzv();
        return;
    }

    public final void zzv()
    {
        this.zzd = (this.zzd & 2147483647);
        return;
    }

    public final void zzx(int p2)
    {
        this.zzd = ((this.zzd & -2147483648) | 2147483647);
        return;
    }

    public final boolean zzz()
    {
        if ((this.zzd & -2147483648) == 0) {
            return 0;
        } else {
            return 1;
        }
    }
}
