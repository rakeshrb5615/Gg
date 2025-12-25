package com.google.android.gms.internal.auth;
public abstract class zzeu extends com.google.android.gms.internal.auth.zzdp {
    private static final java.util.Map zzb;
    protected com.google.android.gms.internal.auth.zzgz zzc;

    static zzeu()
    {
        com.google.android.gms.internal.auth.zzeu.zzb = new java.util.concurrent.ConcurrentHashMap();
        return;
    }

    public zzeu()
    {
        this.zzc = com.google.android.gms.internal.auth.zzgz.zza();
        return;
    }

    public static com.google.android.gms.internal.auth.zzeu zza(Class p4)
    {
        IllegalStateException v0_0 = com.google.android.gms.internal.auth.zzeu.zzb;
        com.google.android.gms.internal.auth.zzeu v1_1 = ((com.google.android.gms.internal.auth.zzeu) v0_0.get(p4));
        if (v1_1 == null) {
            try {
                Class.forName(p4.getName(), 1, p4.getClassLoader());
                v1_1 = ((com.google.android.gms.internal.auth.zzeu) v0_0.get(p4));
            } catch (IllegalStateException v4_1) {
                throw new IllegalStateException("Class initialization cannot fail.", v4_1);
            }
        }
        if (v1_1 != null) {
            return v1_1;
        } else {
            com.google.android.gms.internal.auth.zzeu v1_7 = ((com.google.android.gms.internal.auth.zzeu) ((com.google.android.gms.internal.auth.zzeu) com.google.android.gms.internal.auth.zzhi.zze(p4)).zzi(6, 0, 0));
            if (v1_7 == null) {
                throw new IllegalStateException();
            } else {
                v0_0.put(p4, v1_7);
                return v1_7;
            }
        }
    }

    public static com.google.android.gms.internal.auth.zzeu zzb(com.google.android.gms.internal.auth.zzeu p3, byte[] p4)
    {
        com.google.android.gms.internal.auth.zzeu v3_1 = com.google.android.gms.internal.auth.zzeu.zzj(p3, p4, 0, p4.length, com.google.android.gms.internal.auth.zzek.zza);
        if (v3_1 != null) {
            boolean v1_2 = ((Byte) v3_1.zzi(1, 0, 0)).byteValue();
            if (v1_2 != 1) {
                if (v1_2) {
                    com.google.android.gms.internal.auth.zzeu v4_1;
                    boolean v1_5 = com.google.android.gms.internal.auth.zzge.zza().zzb(v3_1.getClass()).zzi(v3_1);
                    if (1 == v1_5) {
                        v4_1 = v3_1;
                    } else {
                        v4_1 = 0;
                    }
                    v3_1.zzi(2, v4_1, 0);
                    if (v1_5) {
                        return v3_1;
                    }
                }
                com.google.android.gms.internal.auth.zzeu v4_4 = new com.google.android.gms.internal.auth.zzgx(v3_1).zza();
                v4_4.zze(v3_1);
                throw v4_4;
            }
        }
        return v3_1;
    }

    public static com.google.android.gms.internal.auth.zzey zzc()
    {
        return com.google.android.gms.internal.auth.zzgf.zze();
    }

    public static varargs Object zze(reflect.Method p0, Object p1, Object[] p2)
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

    public static Object zzf(com.google.android.gms.internal.auth.zzfw p1, String p2, Object[] p3)
    {
        return new com.google.android.gms.internal.auth.zzgg(p1, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", p3);
    }

    public static void zzg(Class p1, com.google.android.gms.internal.auth.zzeu p2)
    {
        com.google.android.gms.internal.auth.zzeu.zzb.put(p1, p2);
        return;
    }

    private static com.google.android.gms.internal.auth.zzeu zzj(com.google.android.gms.internal.auth.zzeu p6, byte[] p7, int p8, int p9, com.google.android.gms.internal.auth.zzek p10)
    {
        com.google.android.gms.internal.auth.zzeu v1_1 = ((com.google.android.gms.internal.auth.zzeu) p6.zzi(4, 0, 0));
        try {
            java.io.IOException v0_1 = com.google.android.gms.internal.auth.zzge.zza().zzb(v1_1.getClass());
            v0_1.zzg(v1_1, p7, 0, p9, new com.google.android.gms.internal.auth.zzds(p10));
            v0_1.zze(v1_1);
        } catch (java.io.IOException v0_4) {
            com.google.android.gms.internal.auth.zzfa v6_11 = v0_4;
            v6_11.zze(v1_1);
            throw v6_11;
        } catch (java.io.IOException v0_3) {
            com.google.android.gms.internal.auth.zzfa v6_10 = v0_3.zza();
            v6_10.zze(v1_1);
            throw v6_10;
        } catch (java.io.IOException v0_2) {
            com.google.android.gms.internal.auth.zzfa v6_6 = v0_2;
            if (!(v6_6.getCause() instanceof com.google.android.gms.internal.auth.zzfa)) {
                com.google.android.gms.internal.auth.zzfa v7_4 = new com.google.android.gms.internal.auth.zzfa(v6_6);
                v7_4.zze(v1_1);
                throw v7_4;
            } else {
                throw ((com.google.android.gms.internal.auth.zzfa) v6_6.getCause());
            }
        } catch (com.google.android.gms.internal.auth.zzfa) {
            com.google.android.gms.internal.auth.zzfa v6_4 = com.google.android.gms.internal.auth.zzfa.zzf();
            v6_4.zze(v1_1);
            throw v6_4;
        }
        if (v1_1.zza != 0) {
            throw new RuntimeException();
        } else {
            return v1_1;
        }
    }

    public final boolean equals(Object p4)
    {
        if (this != p4) {
            if (p4) {
                if (this.getClass() == p4.getClass()) {
                    return com.google.android.gms.internal.auth.zzge.zza().zzb(this.getClass()).zzh(this, ((com.google.android.gms.internal.auth.zzeu) p4));
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
        int v0_0 = this.zza;
        if (v0_0 == 0) {
            int v0_3 = com.google.android.gms.internal.auth.zzge.zza().zzb(this.getClass()).zza(this);
            this.zza = v0_3;
            return v0_3;
        } else {
            return v0_0;
        }
    }

    public final String toString()
    {
        return com.google.android.gms.internal.auth.zzfy.zza(this, super.toString());
    }

    public final synthetic com.google.android.gms.internal.auth.zzfv zzd()
    {
        com.google.android.gms.internal.auth.zzes v0_2 = ((com.google.android.gms.internal.auth.zzes) this.zzi(5, 0, 0));
        v0_2.zze(this);
        return v0_2;
    }

    public final synthetic com.google.android.gms.internal.auth.zzfw zzh()
    {
        return ((com.google.android.gms.internal.auth.zzeu) this.zzi(6, 0, 0));
    }

    public abstract Object zzi();
}
