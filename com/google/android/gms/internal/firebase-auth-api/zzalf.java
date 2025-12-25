package com.google.android.gms.internal.firebase-auth-api;
public abstract class zzalf extends com.google.android.gms.internal.firebase-auth-api.zzajm {
    private static java.util.Map zzc;
    protected com.google.android.gms.internal.firebase-auth-api.zzanx zzb;
    private int zzd;

    static zzalf()
    {
        com.google.android.gms.internal.firebase-auth-api.zzalf.zzc = new java.util.concurrent.ConcurrentHashMap();
        return;
    }

    public zzalf()
    {
        this.zzd = -1;
        this.zzb = com.google.android.gms.internal.firebase-auth-api.zzanx.zzc();
        return;
    }

    private final int zza()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzamx.zza().zza(this).zzb(this);
    }

    private static com.google.android.gms.internal.firebase-auth-api.zzalf zza(com.google.android.gms.internal.firebase-auth-api.zzalf p1)
    {
        if ((p1 != null) && (!com.google.android.gms.internal.firebase-auth-api.zzalf.zzb(p1, 1))) {
            com.google.android.gms.internal.firebase-auth-api.zzall v1_1 = new com.google.android.gms.internal.firebase-auth-api.zzanv(p1).zza();
            v1_1.getClass();
            throw v1_1;
        } else {
            return p1;
        }
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzalf zza(com.google.android.gms.internal.firebase-auth-api.zzalf p0, com.google.android.gms.internal.firebase-auth-api.zzajv p1, com.google.android.gms.internal.firebase-auth-api.zzaku p2)
    {
        return com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzalf.zzb(p0, p1, p2));
    }

    private static com.google.android.gms.internal.firebase-auth-api.zzalf zza(com.google.android.gms.internal.firebase-auth-api.zzalf p1, com.google.android.gms.internal.firebase-auth-api.zzakh p2, com.google.android.gms.internal.firebase-auth-api.zzaku p3)
    {
        com.google.android.gms.internal.firebase-auth-api.zzall v1_1 = p1.zzo();
        try {
            com.google.android.gms.internal.firebase-auth-api.zzanb v0_1 = com.google.android.gms.internal.firebase-auth-api.zzamx.zza().zza(v1_1);
            v0_1.zza(v1_1, com.google.android.gms.internal.firebase-auth-api.zzakl.zza(p2), p3);
            v0_1.zzd(v1_1);
            return v1_1;
        } catch (com.google.android.gms.internal.firebase-auth-api.zzall v1_8) {
            com.google.android.gms.internal.firebase-auth-api.zzall v1_9 = v1_8.zza();
            v1_9.getClass();
            throw v1_9;
        } catch (com.google.android.gms.internal.firebase-auth-api.zzall v1_10) {
            if (v1_10.zzl()) {
                v1_10 = new com.google.android.gms.internal.firebase-auth-api.zzall(v1_10);
            }
            throw v1_10;
        } catch (com.google.android.gms.internal.firebase-auth-api.zzall v1_5) {
            if (!(v1_5.getCause() instanceof com.google.android.gms.internal.firebase-auth-api.zzall)) {
                throw new com.google.android.gms.internal.firebase-auth-api.zzall(v1_5);
            } else {
                throw ((com.google.android.gms.internal.firebase-auth-api.zzall) v1_5.getCause());
            }
        } catch (com.google.android.gms.internal.firebase-auth-api.zzall v1_2) {
            if (!(v1_2.getCause() instanceof com.google.android.gms.internal.firebase-auth-api.zzall)) {
                throw v1_2;
            } else {
                throw ((com.google.android.gms.internal.firebase-auth-api.zzall) v1_2.getCause());
            }
        }
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzalf zza(com.google.android.gms.internal.firebase-auth-api.zzalf p3, java.io.InputStream p4, com.google.android.gms.internal.firebase-auth-api.zzaku p5)
    {
        com.google.android.gms.internal.firebase-auth-api.zzakj v4_1;
        if (p4 != null) {
            v4_1 = new com.google.android.gms.internal.firebase-auth-api.zzakj(p4, 4096, 0);
        } else {
            com.google.android.gms.internal.firebase-auth-api.zzakj v4_2 = com.google.android.gms.internal.firebase-auth-api.zzalh.zzb;
            v4_1 = com.google.android.gms.internal.firebase-auth-api.zzakh.zza(v4_2, 0, v4_2.length, 0);
        }
        return com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzalf.zza(p3, v4_1, p5));
    }

    private static com.google.android.gms.internal.firebase-auth-api.zzalf zza(com.google.android.gms.internal.firebase-auth-api.zzalf p6, byte[] p7, int p8, int p9, com.google.android.gms.internal.firebase-auth-api.zzaku p10)
    {
        if (p9 != 0) {
            com.google.android.gms.internal.firebase-auth-api.zzalf v1 = p6.zzo();
            try {
                java.io.IOException v0_3 = com.google.android.gms.internal.firebase-auth-api.zzamx.zza().zza(v1);
                v0_3.zza(v1, p7, 0, p9, new com.google.android.gms.internal.firebase-auth-api.zzaju(p10));
                v0_3.zzd(v1);
                return v1;
            } catch (java.io.IOException v0_1) {
                com.google.android.gms.internal.firebase-auth-api.zzall v6_6 = v0_1.zza();
                v6_6.getClass();
                throw v6_6;
            } catch (IndexOutOfBoundsException) {
                com.google.android.gms.internal.firebase-auth-api.zzall v6_1 = com.google.android.gms.internal.firebase-auth-api.zzall.zzj();
                v6_1.getClass();
                throw v6_1;
            } catch (java.io.IOException v0_2) {
                com.google.android.gms.internal.firebase-auth-api.zzall v6_7 = v0_2;
                if (v6_7.zzl()) {
                    v6_7 = new com.google.android.gms.internal.firebase-auth-api.zzall(v6_7);
                }
                throw v6_7;
            } catch (java.io.IOException v0_0) {
                com.google.android.gms.internal.firebase-auth-api.zzall v6_2 = v0_0;
                if (!(v6_2.getCause() instanceof com.google.android.gms.internal.firebase-auth-api.zzall)) {
                    throw new com.google.android.gms.internal.firebase-auth-api.zzall(v6_2);
                } else {
                    throw ((com.google.android.gms.internal.firebase-auth-api.zzall) v6_2.getCause());
                }
            }
        } else {
            return p6;
        }
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzalf zza(com.google.android.gms.internal.firebase-auth-api.zzalf p2, byte[] p3, com.google.android.gms.internal.firebase-auth-api.zzaku p4)
    {
        return com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzalf.zza(p2, p3, 0, p3.length, p4));
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzalf zza(Class p3)
    {
        com.google.android.gms.internal.firebase-auth-api.zzalf v0_3 = ((com.google.android.gms.internal.firebase-auth-api.zzalf) com.google.android.gms.internal.firebase-auth-api.zzalf.zzc.get(p3));
        if (v0_3 == null) {
            try {
                Class.forName(p3.getName(), 1, p3.getClassLoader());
                v0_3 = ((com.google.android.gms.internal.firebase-auth-api.zzalf) com.google.android.gms.internal.firebase-auth-api.zzalf.zzc.get(p3));
            } catch (IllegalStateException v3_1) {
                throw new IllegalStateException("Class initialization cannot fail.", v3_1);
            }
        }
        if (v0_3 != null) {
            return v0_3;
        } else {
            com.google.android.gms.internal.firebase-auth-api.zzalf v0_10 = ((com.google.android.gms.internal.firebase-auth-api.zzalf) ((com.google.android.gms.internal.firebase-auth-api.zzalf) com.google.android.gms.internal.firebase-auth-api.zzanz.zza(p3)).zza(com.google.android.gms.internal.firebase-auth-api.zzalf$zze.zzf, 0, 0));
            if (v0_10 == null) {
                throw new IllegalStateException();
            } else {
                com.google.android.gms.internal.firebase-auth-api.zzalf.zzc.put(p3, v0_10);
                return v0_10;
            }
        }
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzalm zza(com.google.android.gms.internal.firebase-auth-api.zzalm p1)
    {
        return p1.zza((p1.size() << 1));
    }

    public static Object zza(com.google.android.gms.internal.firebase-auth-api.zzamm p1, String p2, Object[] p3)
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzamz(p1, p2, p3);
    }

    public static varargs Object zza(reflect.Method p0, Object p1, Object[] p2)
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

    public static void zza(Class p1, com.google.android.gms.internal.firebase-auth-api.zzalf p2)
    {
        p2.zzu();
        com.google.android.gms.internal.firebase-auth-api.zzalf.zzc.put(p1, p2);
        return;
    }

    public static synthetic boolean zza(com.google.android.gms.internal.firebase-auth-api.zzalf p0, boolean p1)
    {
        return com.google.android.gms.internal.firebase-auth-api.zzalf.zzb(p0, 0);
    }

    private final int zzb(com.google.android.gms.internal.firebase-auth-api.zzanb p1)
    {
        if (p1 != 0) {
            return p1.zza(this);
        } else {
            return com.google.android.gms.internal.firebase-auth-api.zzamx.zza().zza(this).zza(this);
        }
    }

    private static com.google.android.gms.internal.firebase-auth-api.zzalf zzb(com.google.android.gms.internal.firebase-auth-api.zzalf p0, com.google.android.gms.internal.firebase-auth-api.zzajv p1, com.google.android.gms.internal.firebase-auth-api.zzaku p2)
    {
        com.google.android.gms.internal.firebase-auth-api.zzakh v1_1 = p1.zzc();
        com.google.android.gms.internal.firebase-auth-api.zzalf v0_1 = com.google.android.gms.internal.firebase-auth-api.zzalf.zza(p0, v1_1, p2);
        v1_1.zzc(0);
        return v0_1;
    }

    private static final boolean zzb(com.google.android.gms.internal.firebase-auth-api.zzalf p3, boolean p4)
    {
        boolean v0_6 = ((Byte) p3.zza(com.google.android.gms.internal.firebase-auth-api.zzalf$zze.zza, 0, 0)).byteValue();
        if (v0_6 != 1) {
            if (v0_6) {
                boolean v0_3 = com.google.android.gms.internal.firebase-auth-api.zzamx.zza().zza(p3).zze(p3);
                if (p4 != 0) {
                    int v2_0;
                    if (!v0_3) {
                        v2_0 = 0;
                    } else {
                        v2_0 = p3;
                    }
                    p3.zza(com.google.android.gms.internal.firebase-auth-api.zzalf$zze.zzb, v2_0, 0);
                }
                return v0_3;
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzalm zzp()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzana.zzd();
    }

    public boolean equals(Object p4)
    {
        if (this != p4) {
            if (p4) {
                if (this.getClass() == p4.getClass()) {
                    return com.google.android.gms.internal.firebase-auth-api.zzamx.zza().zza(this).zzb(this, ((com.google.android.gms.internal.firebase-auth-api.zzalf) p4));
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

    public int hashCode()
    {
        if (!this.zzw()) {
            if (this.zza == 0) {
                this.zza = this.zza();
            }
            return this.zza;
        } else {
            return this.zza();
        }
    }

    public String toString()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzamn.zza(this, super.toString());
    }

    public final int zza(com.google.android.gms.internal.firebase-auth-api.zzanb p3)
    {
        if (!this.zzw()) {
            if (this.zzi() == 2147483647) {
                int v3_4 = this.zzb(p3);
                this.zzb(v3_4);
                return v3_4;
            } else {
                return this.zzi();
            }
        } else {
            int v3_2 = this.zzb(p3);
            if (v3_2 < 0) {
                throw new IllegalStateException(g2.g.c(v3_2, "serialized size must be non-negative, was "));
            } else {
                return v3_2;
            }
        }
    }

    public abstract Object zza();

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzakn p2)
    {
        com.google.android.gms.internal.firebase-auth-api.zzamx.zza().zza(this).zza(this, com.google.android.gms.internal.firebase-auth-api.zzakp.zza(p2));
        return;
    }

    public final void zzb(int p3)
    {
        if (p3 < null) {
            throw new IllegalStateException(g2.g.c(p3, "serialized size must be non-negative, was "));
        } else {
            this.zzd = ((p3 & 2147483647) | (this.zzd & -2147483648));
            return;
        }
    }

    public final int zzi()
    {
        return (this.zzd & 2147483647);
    }

    public final int zzl()
    {
        return this.zza(0);
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzalf$zzb zzm()
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzalf$zzb) this.zza(com.google.android.gms.internal.firebase-auth-api.zzalf$zze.zze, 0, 0));
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzalf$zzb zzn()
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzalf$zzb) this.zza(com.google.android.gms.internal.firebase-auth-api.zzalf$zze.zze, 0, 0)).zza(this);
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzalf zzo()
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzalf) this.zza(com.google.android.gms.internal.firebase-auth-api.zzalf$zze.zzd, 0, 0));
    }

    public final synthetic com.google.android.gms.internal.firebase-auth-api.zzaml zzq()
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzalf$zzb) this.zza(com.google.android.gms.internal.firebase-auth-api.zzalf$zze.zze, 0, 0));
    }

    public final synthetic com.google.android.gms.internal.firebase-auth-api.zzaml zzr()
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzalf$zzb) this.zza(com.google.android.gms.internal.firebase-auth-api.zzalf$zze.zze, 0, 0)).zza(this);
    }

    public final synthetic com.google.android.gms.internal.firebase-auth-api.zzamm zzs()
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzalf) this.zza(com.google.android.gms.internal.firebase-auth-api.zzalf$zze.zzf, 0, 0));
    }

    public final void zzt()
    {
        com.google.android.gms.internal.firebase-auth-api.zzamx.zza().zza(this).zzd(this);
        this.zzu();
        return;
    }

    public final void zzu()
    {
        this.zzd = (this.zzd & 2147483647);
        return;
    }

    public final boolean zzv()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzalf.zzb(this, 1);
    }

    public final boolean zzw()
    {
        if ((this.zzd & -2147483648) == 0) {
            return 0;
        } else {
            return 1;
        }
    }
}
