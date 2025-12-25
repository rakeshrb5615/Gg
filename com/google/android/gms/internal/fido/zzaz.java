package com.google.android.gms.internal.fido;
public abstract class zzaz extends com.google.android.gms.internal.fido.zzav implements java.util.List, java.util.RandomAccess {
    private static final com.google.android.gms.internal.fido.zzcc zza;
    public static final synthetic int zzd;

    static zzaz()
    {
        com.google.android.gms.internal.fido.zzaz.zza = new com.google.android.gms.internal.fido.zzaw(com.google.android.gms.internal.fido.zzbs.zza, 0);
        return;
    }

    public zzaz()
    {
        return;
    }

    public static com.google.android.gms.internal.fido.zzaz zzh(Object[] p1, int p2)
    {
        if (p2 != 0) {
            return new com.google.android.gms.internal.fido.zzbs(p1, p2);
        } else {
            return com.google.android.gms.internal.fido.zzbs.zza;
        }
    }

    public static com.google.android.gms.internal.fido.zzaz zzi(Object[] p1)
    {
        if (p1.length != 0) {
            com.google.android.gms.internal.fido.zzaz v1_3 = ((Object[]) p1.clone());
            int v0_1 = v1_3.length;
            com.google.android.gms.internal.fido.zzbq.zzb(v1_3, v0_1);
            return com.google.android.gms.internal.fido.zzaz.zzh(v1_3, v0_1);
        } else {
            return com.google.android.gms.internal.fido.zzbs.zza;
        }
    }

    public static com.google.android.gms.internal.fido.zzaz zzj(Object p1)
    {
        com.google.android.gms.internal.fido.zzaz v1_1 = new Object[] {p1});
        com.google.android.gms.internal.fido.zzbq.zzb(v1_1, 1);
        return com.google.android.gms.internal.fido.zzaz.zzh(v1_1, 1);
    }

    public final void add(int p1, Object p2)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(int p1, java.util.Collection p2)
    {
        throw new UnsupportedOperationException();
    }

    public boolean contains(Object p1)
    {
        if (this.indexOf(p1) < 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean equals(Object p7)
    {
        if (p7 != this) {
            if ((p7 instanceof java.util.List)) {
                java.util.Iterator v1_2 = this.size();
                if (v1_2 == ((java.util.List) p7).size()) {
                    if (!(((java.util.List) p7) instanceof java.util.RandomAccess)) {
                        java.util.Iterator v1_0 = this.iterator();
                        boolean v7_1 = ((java.util.List) p7).iterator();
                        while (v1_0.hasNext()) {
                            if (v7_1.hasNext()) {
                                if (!com.google.android.gms.internal.fido.zzao.zza(v1_0.next(), v7_1.next())) {
                                    return 0;
                                }
                            } else {
                                return 0;
                            }
                        }
                        if (v7_1.hasNext()) {
                            return 0;
                        } else {
                            return 1;
                        }
                    } else {
                        boolean v3_5 = 0;
                        while (v3_5 < v1_2) {
                            if (com.google.android.gms.internal.fido.zzao.zza(this.get(v3_5), ((java.util.List) p7).get(v3_5))) {
                                v3_5++;
                            } else {
                                return 0;
                            }
                        }
                        return 1;
                    }
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
        int v0 = this.size();
        int v1 = 0;
        int v2_0 = 1;
        while (v1 < v0) {
            v2_0 = ((v2_0 * 31) + this.get(v1).hashCode());
            v1++;
        }
        return v2_0;
    }

    public int indexOf(Object p5)
    {
        if (p5 != null) {
            int v1 = this.size();
            int v2 = 0;
            while (v2 < v1) {
                if (!p5.equals(this.get(v2))) {
                    v2++;
                } else {
                    return v2;
                }
            }
            return -1;
        } else {
            return -1;
        }
    }

    public final synthetic java.util.Iterator iterator()
    {
        return this.zzk(0);
    }

    public int lastIndexOf(Object p4)
    {
        if (p4 != null) {
            int v1_0 = (this.size() + -1);
            while (v1_0 >= 0) {
                if (!p4.equals(this.get(v1_0))) {
                    v1_0--;
                } else {
                    return v1_0;
                }
            }
            return -1;
        } else {
            return -1;
        }
    }

    public final synthetic java.util.ListIterator listIterator()
    {
        return this.zzk(0);
    }

    public final bridge synthetic java.util.ListIterator listIterator(int p1)
    {
        return this.zzk(p1);
    }

    public final Object remove(int p1)
    {
        throw new UnsupportedOperationException();
    }

    public final Object set(int p1, Object p2)
    {
        throw new UnsupportedOperationException();
    }

    public bridge synthetic java.util.List subList(int p1, int p2)
    {
        return this.zzg(p1, p2);
    }

    public int zza(Object[] p3, int p4)
    {
        p4 = this.size();
        int v0 = 0;
        while (v0 < p4) {
            p3[v0] = this.get(v0);
            v0++;
        }
        return p4;
    }

    public final com.google.android.gms.internal.fido.zzcb zzd()
    {
        return this.zzk(0);
    }

    public com.google.android.gms.internal.fido.zzaz zzf()
    {
        if (this.size() > 1) {
            return new com.google.android.gms.internal.fido.zzax(this);
        } else {
            return this;
        }
    }

    public com.google.android.gms.internal.fido.zzaz zzg(int p2, int p3)
    {
        com.google.android.gms.internal.fido.zzap.zze(p2, p3, this.size());
        int v3_1 = (p3 - p2);
        if (v3_1 != this.size()) {
            if (v3_1 != 0) {
                return new com.google.android.gms.internal.fido.zzay(this, p2, v3_1);
            } else {
                return com.google.android.gms.internal.fido.zzbs.zza;
            }
        } else {
            return this;
        }
    }

    public final com.google.android.gms.internal.fido.zzcc zzk(int p3)
    {
        com.google.android.gms.internal.fido.zzap.zzb(p3, this.size(), "index");
        if (!this.isEmpty()) {
            return new com.google.android.gms.internal.fido.zzaw(this, p3);
        } else {
            return com.google.android.gms.internal.fido.zzaz.zza;
        }
    }
}
