package com.google.android.gms.internal.common;
public abstract class zzah extends com.google.android.gms.internal.common.zzac implements java.util.List, java.util.RandomAccess {
    private static final com.google.android.gms.internal.common.zzal zza;
    public static final synthetic int zzd;

    static zzah()
    {
        com.google.android.gms.internal.common.zzah.zza = new com.google.android.gms.internal.common.zzae(com.google.android.gms.internal.common.zzaj.zza, 0);
        return;
    }

    public zzah()
    {
        return;
    }

    public static com.google.android.gms.internal.common.zzah zzj()
    {
        return com.google.android.gms.internal.common.zzaj.zza;
    }

    public static com.google.android.gms.internal.common.zzah zzk(Object p1)
    {
        com.google.android.gms.internal.common.zzah v1_1 = new Object[] {p1});
        com.google.android.gms.internal.common.zzai.zza(v1_1, 1);
        return com.google.android.gms.internal.common.zzah.zzq(v1_1, 1);
    }

    public static com.google.android.gms.internal.common.zzah zzl(Object p0, Object p1)
    {
        com.google.android.gms.internal.common.zzah v0_1 = new Object[] {p0, p1});
        com.google.android.gms.internal.common.zzai.zza(v0_1, 2);
        return com.google.android.gms.internal.common.zzah.zzq(v0_1, 2);
    }

    public static com.google.android.gms.internal.common.zzah zzm(Object p0, Object p1, Object p2)
    {
        com.google.android.gms.internal.common.zzah v0_1 = new Object[] {p0, p1, p2});
        com.google.android.gms.internal.common.zzai.zza(v0_1, 3);
        return com.google.android.gms.internal.common.zzah.zzq(v0_1, 3);
    }

    public static com.google.android.gms.internal.common.zzah zzn(Object p0, Object p1, Object p2, Object p3, Object p4, Object p5)
    {
        com.google.android.gms.internal.common.zzah v0_1 = new Object[] {p0, p5});
        com.google.android.gms.internal.common.zzai.zza(v0_1, 6);
        return com.google.android.gms.internal.common.zzah.zzq(v0_1, 6);
    }

    public static com.google.android.gms.internal.common.zzah zzo(Iterable p3)
    {
        p3.getClass();
        if (!(p3 instanceof java.util.Collection)) {
            com.google.android.gms.internal.common.zzah v3_6 = p3.iterator();
            if (v3_6.hasNext()) {
                Object v0_2 = v3_6.next();
                if (v3_6.hasNext()) {
                    com.google.android.gms.internal.common.zzad v1_2 = new com.google.android.gms.internal.common.zzad(4);
                    v1_2.zzb(v0_2);
                    v1_2.zzc(v3_6);
                    return v1_2.zzd();
                } else {
                    return com.google.android.gms.internal.common.zzah.zzk(v0_2);
                }
            } else {
                return com.google.android.gms.internal.common.zzaj.zza;
            }
        } else {
            return com.google.android.gms.internal.common.zzah.zzp(((java.util.Collection) p3));
        }
    }

    public static com.google.android.gms.internal.common.zzah zzp(java.util.Collection p1)
    {
        if (!(p1 instanceof com.google.android.gms.internal.common.zzac)) {
            com.google.android.gms.internal.common.zzah v1_3 = p1.toArray();
            int v0_3 = v1_3.length;
            com.google.android.gms.internal.common.zzai.zza(v1_3, v0_3);
            return com.google.android.gms.internal.common.zzah.zzq(v1_3, v0_3);
        } else {
            com.google.android.gms.internal.common.zzah v1_1 = ((com.google.android.gms.internal.common.zzac) p1).zze();
            if (v1_1.zzf()) {
                com.google.android.gms.internal.common.zzah v1_2 = v1_1.toArray();
                v1_1 = com.google.android.gms.internal.common.zzah.zzq(v1_2, v1_2.length);
            }
            return v1_1;
        }
    }

    public static com.google.android.gms.internal.common.zzah zzq(Object[] p1, int p2)
    {
        if (p2 != 0) {
            return new com.google.android.gms.internal.common.zzaj(p1, p2);
        } else {
            return com.google.android.gms.internal.common.zzaj.zza;
        }
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
                                if (!java.util.Objects.equals(v1_0.next(), v7_1.next())) {
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
                            if (java.util.Objects.equals(this.get(v3_5), ((java.util.List) p7).get(v3_5))) {
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
        return this.zzr(0);
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
        return this.zzr(0);
    }

    public final bridge synthetic java.util.ListIterator listIterator(int p1)
    {
        return this.zzr(p1);
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
        return this.zzi(p1, p2);
    }

    public final com.google.android.gms.internal.common.zzak zza()
    {
        return this.zzr(0);
    }

    public final com.google.android.gms.internal.common.zzah zze()
    {
        return this;
    }

    public int zzg(Object[] p3, int p4)
    {
        p4 = this.size();
        int v0 = 0;
        while (v0 < p4) {
            p3[v0] = this.get(v0);
            v0++;
        }
        return p4;
    }

    public com.google.android.gms.internal.common.zzah zzh()
    {
        if (this.size() > 1) {
            return new com.google.android.gms.internal.common.zzaf(this);
        } else {
            return this;
        }
    }

    public com.google.android.gms.internal.common.zzah zzi(int p2, int p3)
    {
        com.google.android.gms.internal.common.zzr.zzd(p2, p3, this.size());
        int v3_1 = (p3 - p2);
        if (v3_1 != this.size()) {
            if (v3_1 != 0) {
                return new com.google.android.gms.internal.common.zzag(this, p2, v3_1);
            } else {
                return com.google.android.gms.internal.common.zzaj.zza;
            }
        } else {
            return this;
        }
    }

    public final com.google.android.gms.internal.common.zzal zzr(int p3)
    {
        com.google.android.gms.internal.common.zzr.zzc(p3, this.size(), "index");
        if (!this.isEmpty()) {
            return new com.google.android.gms.internal.common.zzae(this, p3);
        } else {
            return com.google.android.gms.internal.common.zzah.zza;
        }
    }
}
