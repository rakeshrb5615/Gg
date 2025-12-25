package com.google.android.recaptcha.internal;
public abstract class zznd extends com.google.android.recaptcha.internal.zzko {
    private static final java.util.Map zzb;
    protected com.google.android.recaptcha.internal.zzpm zzc;
    private int zzd;

    static zznd()
    {
        com.google.android.recaptcha.internal.zznd.zzb = new java.util.concurrent.ConcurrentHashMap();
        return;
    }

    public zznd()
    {
        this.zzd = -1;
        this.zzc = com.google.android.recaptcha.internal.zzpm.zzc();
        return;
    }

    public static com.google.android.recaptcha.internal.zznj zzA()
    {
        return com.google.android.recaptcha.internal.zznx.zzf();
    }

    public static com.google.android.recaptcha.internal.zznk zzB()
    {
        return com.google.android.recaptcha.internal.zzot.zze();
    }

    public static com.google.android.recaptcha.internal.zznk zzC(com.google.android.recaptcha.internal.zznk p1)
    {
        return p1.zzd((p1.size() + p1.size()));
    }

    public static varargs Object zzE(reflect.Method p0, Object p1, Object[] p2)
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

    public static Object zzF(com.google.android.recaptcha.internal.zzoi p1, String p2, Object[] p3)
    {
        return new com.google.android.recaptcha.internal.zzou(p1, p2, p3);
    }

    public static void zzI(Class p1, com.google.android.recaptcha.internal.zznd p2)
    {
        p2.zzH();
        com.google.android.recaptcha.internal.zznd.zzb.put(p1, p2);
        return;
    }

    public static final boolean zzK(com.google.android.recaptcha.internal.zznd p4, boolean p5)
    {
        boolean v2_5 = ((Byte) p4.zzh(1, 0, 0)).byteValue();
        if (v2_5 != 1) {
            if (v2_5) {
                boolean v2_2 = com.google.android.recaptcha.internal.zzos.zza().zzb(p4.getClass()).zzl(p4);
                if (p5 != 0) {
                    int v5_1;
                    if (1 == v2_2) {
                        v5_1 = p4;
                    } else {
                        v5_1 = 0;
                    }
                    p4.zzh(2, v5_1, 0);
                }
                return v2_2;
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    private final int zzf(com.google.android.recaptcha.internal.zzow p2)
    {
        return com.google.android.recaptcha.internal.zzos.zza().zzb(this.getClass()).zza(this);
    }

    private static com.google.android.recaptcha.internal.zznd zzg(com.google.android.recaptcha.internal.zznd p1)
    {
        if ((p1 != null) && (!com.google.android.recaptcha.internal.zznd.zzK(p1, 1))) {
            throw new com.google.android.recaptcha.internal.zzpk(p1).zza();
        } else {
            return p1;
        }
    }

    private static com.google.android.recaptcha.internal.zznd zzi(com.google.android.recaptcha.internal.zznd p6, byte[] p7, int p8, int p9, com.google.android.recaptcha.internal.zzmo p10)
    {
        if (p9 != 0) {
            com.google.android.recaptcha.internal.zznd v1 = p6.zzv();
            try {
                java.io.IOException v0_3 = com.google.android.recaptcha.internal.zzos.zza().zzb(v1.getClass());
                v0_3.zzi(v1, p7, 0, p9, new com.google.android.recaptcha.internal.zzkt(p10));
                v0_3.zzf(v1);
                return v1;
            } catch (java.io.IOException v0_1) {
                throw v0_1.zza();
            } catch (IndexOutOfBoundsException) {
                throw new com.google.android.recaptcha.internal.zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            } catch (java.io.IOException v0_2) {
                com.google.android.recaptcha.internal.zznn v6_9 = v0_2;
                if (!v6_9.zzb()) {
                    throw v6_9;
                } else {
                    throw new com.google.android.recaptcha.internal.zznn(v6_9);
                }
            } catch (java.io.IOException v0_0) {
                com.google.android.recaptcha.internal.zznn v6_3 = v0_0;
                if (!(v6_3.getCause() instanceof com.google.android.recaptcha.internal.zznn)) {
                    throw new com.google.android.recaptcha.internal.zznn(v6_3);
                } else {
                    throw ((com.google.android.recaptcha.internal.zznn) v6_3.getCause());
                }
            }
        } else {
            return p6;
        }
    }

    public static com.google.android.recaptcha.internal.zznc zzs(com.google.android.recaptcha.internal.zzoi p6, Object p7, com.google.android.recaptcha.internal.zzoi p8, com.google.android.recaptcha.internal.zzng p9, int p10, com.google.android.recaptcha.internal.zzpw p11, Class p12)
    {
        return new com.google.android.recaptcha.internal.zznc(p6, "", 0, new com.google.android.recaptcha.internal.zznb(0, p10, p11, 0, 0), p12);
    }

    public static bridge synthetic com.google.android.recaptcha.internal.zznd zzt(com.google.android.recaptcha.internal.zznd p0, byte[] p1, int p2, int p3, com.google.android.recaptcha.internal.zzmo p4)
    {
        return com.google.android.recaptcha.internal.zznd.zzi(p0, p1, 0, p3, p4);
    }

    public static com.google.android.recaptcha.internal.zznd zzu(Class p4)
    {
        IllegalStateException v0_0 = com.google.android.recaptcha.internal.zznd.zzb;
        com.google.android.recaptcha.internal.zznd v1_1 = ((com.google.android.recaptcha.internal.zznd) v0_0.get(p4));
        if (v1_1 == null) {
            try {
                Class.forName(p4.getName(), 1, p4.getClassLoader());
                v1_1 = ((com.google.android.recaptcha.internal.zznd) v0_0.get(p4));
            } catch (IllegalStateException v4_1) {
                throw new IllegalStateException("Class initialization cannot fail.", v4_1);
            }
        }
        if (v1_1 != null) {
            return v1_1;
        } else {
            com.google.android.recaptcha.internal.zznd v1_7 = ((com.google.android.recaptcha.internal.zznd) ((com.google.android.recaptcha.internal.zznd) com.google.android.recaptcha.internal.zzps.zze(p4)).zzh(6, 0, 0));
            if (v1_7 == null) {
                throw new IllegalStateException();
            } else {
                v0_0.put(p4, v1_7);
                return v1_7;
            }
        }
    }

    public static com.google.android.recaptcha.internal.zznd zzw(com.google.android.recaptcha.internal.zznd p3, java.io.InputStream p4)
    {
        com.google.android.recaptcha.internal.zznn v4_1;
        if (p4 != null) {
            v4_1 = new com.google.android.recaptcha.internal.zzlg(p4, 4096, 0);
        } else {
            v4_1 = com.google.android.recaptcha.internal.zzli.zzH(com.google.android.recaptcha.internal.zznl.zzb, 0, 0, 0);
        }
        com.google.android.recaptcha.internal.zzmo v0 = com.google.android.recaptcha.internal.zzos.zza;
        com.google.android.recaptcha.internal.zznn v3_1 = p3.zzv();
        try {
            com.google.android.recaptcha.internal.zzow v1_2 = com.google.android.recaptcha.internal.zzos.zza().zzb(v3_1.getClass());
            v1_2.zzh(v3_1, com.google.android.recaptcha.internal.zzlj.zzq(v4_1), com.google.android.recaptcha.internal.zzmo.zza);
            v1_2.zzf(v3_1);
            com.google.android.recaptcha.internal.zznd.zzg(v3_1);
            return v3_1;
        } catch (com.google.android.recaptcha.internal.zznn v3_8) {
            throw v3_8.zza();
        } catch (com.google.android.recaptcha.internal.zznn v3_10) {
            if (!v3_10.zzb()) {
                throw v3_10;
            } else {
                throw new com.google.android.recaptcha.internal.zznn(v3_10);
            }
        } catch (com.google.android.recaptcha.internal.zznn v3_5) {
            if (!(v3_5.getCause() instanceof com.google.android.recaptcha.internal.zznn)) {
                throw new com.google.android.recaptcha.internal.zznn(v3_5);
            } else {
                throw ((com.google.android.recaptcha.internal.zznn) v3_5.getCause());
            }
        } catch (com.google.android.recaptcha.internal.zznn v3_2) {
            if (!(v3_2.getCause() instanceof com.google.android.recaptcha.internal.zznn)) {
                throw v3_2;
            } else {
                throw ((com.google.android.recaptcha.internal.zznn) v3_2.getCause());
            }
        }
    }

    public static com.google.android.recaptcha.internal.zznd zzx(com.google.android.recaptcha.internal.zznd p3, byte[] p4)
    {
        int v0 = com.google.android.recaptcha.internal.zzos.zza;
        com.google.android.recaptcha.internal.zznd v3_1 = com.google.android.recaptcha.internal.zznd.zzi(p3, p4, 0, p4.length, com.google.android.recaptcha.internal.zzmo.zza);
        com.google.android.recaptcha.internal.zznd.zzg(v3_1);
        return v3_1;
    }

    public static com.google.android.recaptcha.internal.zzni zzy()
    {
        return com.google.android.recaptcha.internal.zzne.zzf();
    }

    public static com.google.android.recaptcha.internal.zzni zzz(com.google.android.recaptcha.internal.zzni p1)
    {
        return p1.zzg((p1.size() + p1.size()));
    }

    public final boolean equals(Object p4)
    {
        if (this != p4) {
            if (p4) {
                if (this.getClass() == p4.getClass()) {
                    return com.google.android.recaptcha.internal.zzos.zza().zzb(this.getClass()).zzk(this, ((com.google.android.recaptcha.internal.zznd) p4));
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
        if (this.zzL()) {
            return this.zzn();
        } else {
            int v0_2 = this.zza;
            if (v0_2 == 0) {
                v0_2 = this.zzn();
                this.zza = v0_2;
            }
            return v0_2;
        }
    }

    public final String toString()
    {
        return com.google.android.recaptcha.internal.zzok.zza(this, super.toString());
    }

    public final com.google.android.recaptcha.internal.zzoq zzD()
    {
        return ((com.google.android.recaptcha.internal.zzoq) this.zzh(7, 0, 0));
    }

    public final void zzG()
    {
        com.google.android.recaptcha.internal.zzos.zza().zzb(this.getClass()).zzf(this);
        this.zzH();
        return;
    }

    public final void zzH()
    {
        this.zzd = (this.zzd & 2147483647);
        return;
    }

    public final void zzJ(int p2)
    {
        this.zzd = ((this.zzd & -2147483648) | 2147483647);
        return;
    }

    public final boolean zzL()
    {
        if ((this.zzd & -2147483648) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final int zza(com.google.android.recaptcha.internal.zzow p4)
    {
        if (!this.zzL()) {
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

    public final synthetic com.google.android.recaptcha.internal.zzoh zzad()
    {
        return ((com.google.android.recaptcha.internal.zzmx) this.zzh(5, 0, 0));
    }

    public final synthetic com.google.android.recaptcha.internal.zzoh zzae()
    {
        com.google.android.recaptcha.internal.zzmx v0_2 = ((com.google.android.recaptcha.internal.zzmx) this.zzh(5, 0, 0));
        v0_2.zzh(this);
        return v0_2;
    }

    public final void zze(com.google.android.recaptcha.internal.zzln p3)
    {
        com.google.android.recaptcha.internal.zzos.zza().zzb(this.getClass()).zzj(this, com.google.android.recaptcha.internal.zzlo.zza(p3));
        return;
    }

    public abstract Object zzh();

    public final synthetic com.google.android.recaptcha.internal.zzoi zzm()
    {
        return ((com.google.android.recaptcha.internal.zznd) this.zzh(6, 0, 0));
    }

    public final int zzn()
    {
        return com.google.android.recaptcha.internal.zzos.zza().zzb(this.getClass()).zzb(this);
    }

    public final int zzo()
    {
        if (!this.zzL()) {
            String v0_6 = (this.zzd & 2147483647);
            if (v0_6 == 2147483647) {
                String v0_1 = this.zzf(0);
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
            String v0_3 = this.zzf(0);
            if (v0_3 < null) {
                throw new IllegalStateException(g2.g.c(v0_3, "serialized size must be non-negative, was "));
            } else {
                return v0_3;
            }
        }
    }

    public final boolean zzp()
    {
        return com.google.android.recaptcha.internal.zznd.zzK(this, 1);
    }

    public final com.google.android.recaptcha.internal.zzmx zzq()
    {
        return ((com.google.android.recaptcha.internal.zzmx) this.zzh(5, 0, 0));
    }

    public final com.google.android.recaptcha.internal.zzmx zzr()
    {
        com.google.android.recaptcha.internal.zzmx v0_2 = ((com.google.android.recaptcha.internal.zzmx) this.zzh(5, 0, 0));
        v0_2.zzh(this);
        return v0_2;
    }

    public final com.google.android.recaptcha.internal.zznd zzv()
    {
        return ((com.google.android.recaptcha.internal.zznd) this.zzh(4, 0, 0));
    }
}
