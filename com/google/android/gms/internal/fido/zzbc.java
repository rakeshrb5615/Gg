package com.google.android.gms.internal.fido;
public abstract class zzbc extends com.google.android.gms.internal.fido.zzav implements java.util.Set {
    private transient com.google.android.gms.internal.fido.zzaz zza;

    public zzbc()
    {
        return;
    }

    private static varargs com.google.android.gms.internal.fido.zzbc zzf(int p13, Object[] p14)
    {
        if (p13 == null) {
            return com.google.android.gms.internal.fido.zzbt.zza;
        } else {
            if (p13 == 1) {
                com.google.android.gms.internal.fido.zzbc v13_5 = p14[0];
                v13_5.getClass();
                return new com.google.android.gms.internal.fido.zzby(v13_5);
            } else {
                int v2_0 = com.google.android.gms.internal.fido.zzbc.zzh(p13);
                Object[] v6 = new Object[v2_0];
                int v7 = (v2_0 - 1);
                com.google.android.gms.internal.fido.zzbt v3_0 = 0;
                int v5 = 0;
                int v8 = 0;
                while (v3_0 < p13) {
                    Object[] v4_1 = p14[v3_0];
                    com.google.android.gms.internal.fido.zzbq.zza(v4_1, v3_0);
                    int v9 = v4_1.hashCode();
                    int v10_0 = com.google.android.gms.internal.fido.zzau.zza(v9);
                    while(true) {
                        boolean v11_0 = (v10_0 & v7);
                        Object v12 = v6[v11_0];
                        if (v12 == null) {
                            break;
                        }
                        if (!v12.equals(v4_1)) {
                            v10_0++;
                        }
                        v3_0++;
                    }
                    int v10_1 = (v8 + 1);
                    p14[v8] = v4_1;
                    v6[v11_0] = v4_1;
                    v5 += v9;
                    v8 = v10_1;
                }
                java.util.Arrays.fill(p14, v8, p13, 0);
                if (v8 != 1) {
                    if (com.google.android.gms.internal.fido.zzbc.zzh(v8) < (v2_0 / 2)) {
                        return com.google.android.gms.internal.fido.zzbc.zzf(v8, p14);
                    } else {
                        if (v8 <= 0) {
                            p14 = java.util.Arrays.copyOf(p14, v8);
                        }
                        return new com.google.android.gms.internal.fido.zzbt(p14, v5, v6, v7, v8);
                    }
                } else {
                    com.google.android.gms.internal.fido.zzbc v13_4 = p14[0];
                    v13_4.getClass();
                    return new com.google.android.gms.internal.fido.zzby(v13_4);
                }
            }
        }
    }

    public static int zzh(int p5)
    {
        IllegalArgumentException v5_1 = Math.max(p5, 2);
        if (v5_1 >= 751619276) {
            if (v5_1 >= 1073741824) {
                throw new IllegalArgumentException("collection too large");
            } else {
                return 1073741824;
            }
        } else {
            String v0_2 = Integer.highestOneBit((v5_1 - 1));
            do {
                v0_2 += v0_2;
            } while((((double) v0_2) * 4604480259023595110) >= ((double) v5_1));
            return v0_2;
        }
    }

    public static com.google.android.gms.internal.fido.zzbc zzk(Object p1, Object p2)
    {
        return com.google.android.gms.internal.fido.zzbc.zzf(2, new Object[] {p1, p2}));
    }

    public boolean equals(Object p5)
    {
        if (p5 != this) {
            if (((p5 instanceof com.google.android.gms.internal.fido.zzbc)) && ((this.zzg()) && ((((com.google.android.gms.internal.fido.zzbc) p5).zzg()) && (this.hashCode() != p5.hashCode())))) {
                return 0;
            } else {
                if (p5 != this) {
                    try {
                        if ((!(p5 instanceof java.util.Set)) || (this.size() != ((java.util.Set) p5).size())) {
                            return 0;
                        } else {
                            if (this.containsAll(((java.util.Set) p5))) {
                                return 1;
                            } else {
                                return 0;
                            }
                        }
                    } catch (ClassCastException) {
                        return 0;
                    }
                } else {
                    return 1;
                }
            }
        } else {
            return 1;
        }
    }

    public int hashCode()
    {
        return com.google.android.gms.internal.fido.zzbx.zza(this);
    }

    public bridge synthetic java.util.Iterator iterator()
    {
        return this.zzd();
    }

    public abstract com.google.android.gms.internal.fido.zzcb zzd();

    public boolean zzg()
    {
        return 0;
    }

    public com.google.android.gms.internal.fido.zzaz zzi()
    {
        com.google.android.gms.internal.fido.zzaz v0 = this.zza;
        if (v0 == null) {
            v0 = this.zzj();
            this.zza = v0;
        }
        return v0;
    }

    public com.google.android.gms.internal.fido.zzaz zzj()
    {
        com.google.android.gms.internal.fido.zzaz v0_0 = this.toArray();
        return com.google.android.gms.internal.fido.zzaz.zzh(v0_0, v0_0.length);
    }
}
