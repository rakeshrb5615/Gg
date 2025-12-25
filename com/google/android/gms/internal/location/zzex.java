package com.google.android.gms.internal.location;
public abstract class zzex extends com.google.android.gms.internal.location.zzeu implements java.util.List, java.util.RandomAccess {
    private static final com.google.android.gms.internal.location.zzfa zza;

    static zzex()
    {
        com.google.android.gms.internal.location.zzex.zza = new com.google.android.gms.internal.location.zzev(com.google.android.gms.internal.location.zzey.zza, 0);
        return;
    }

    public zzex()
    {
        return;
    }

    public static com.google.android.gms.internal.location.zzex zzi()
    {
        return com.google.android.gms.internal.location.zzey.zza;
    }

    public static com.google.android.gms.internal.location.zzex zzj(java.util.Collection p3)
    {
        if (!(p3 instanceof com.google.android.gms.internal.location.zzeu)) {
            NullPointerException v3_5 = p3.toArray();
            String v0_8 = v3_5.length;
            int v1 = 0;
            while (v1 < v0_8) {
                if (v3_5[v1] == null) {
                    throw new NullPointerException(v1.a.m(new StringBuilder((String.valueOf(v1).length() + 9)), "at index ", v1));
                } else {
                    v1++;
                }
            }
            return com.google.android.gms.internal.location.zzex.zzk(v3_5, v0_8);
        } else {
            NullPointerException v3_4 = ((com.google.android.gms.internal.location.zzeu) p3).zze();
            if (v3_4.zzf()) {
                NullPointerException v3_6 = v3_4.toArray();
                v3_4 = com.google.android.gms.internal.location.zzex.zzk(v3_6, v3_6.length);
            }
            return v3_4;
        }
    }

    public static com.google.android.gms.internal.location.zzex zzk(Object[] p1, int p2)
    {
        if (p2 != 0) {
            return new com.google.android.gms.internal.location.zzey(p1, p2);
        } else {
            return com.google.android.gms.internal.location.zzey.zza;
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

    public final boolean contains(Object p1)
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
                                if (!com.google.android.gms.internal.location.zzeq.zza(v1_0.next(), v7_1.next())) {
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
                            if (com.google.android.gms.internal.location.zzeq.zza(this.get(v3_5), ((java.util.List) p7).get(v3_5))) {
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

    public final int indexOf(Object p5)
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
        return this.zzl(0);
    }

    public final int lastIndexOf(Object p4)
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
        return this.zzl(0);
    }

    public final bridge synthetic java.util.ListIterator listIterator(int p1)
    {
        return this.zzl(p1);
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
        return this.zzh(p1, p2);
    }

    public final com.google.android.gms.internal.location.zzez zza()
    {
        return this.zzl(0);
    }

    public final com.google.android.gms.internal.location.zzex zze()
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

    public com.google.android.gms.internal.location.zzex zzh(int p2, int p3)
    {
        com.google.android.gms.internal.location.zzer.zze(p2, p3, this.size());
        int v3_1 = (p3 - p2);
        if (v3_1 != this.size()) {
            if (v3_1 != 0) {
                return new com.google.android.gms.internal.location.zzew(this, p2, v3_1);
            } else {
                return com.google.android.gms.internal.location.zzey.zza;
            }
        } else {
            return this;
        }
    }

    public final com.google.android.gms.internal.location.zzfa zzl(int p3)
    {
        com.google.android.gms.internal.location.zzer.zzd(p3, this.size(), "index");
        if (!this.isEmpty()) {
            return new com.google.android.gms.internal.location.zzev(this, p3);
        } else {
            return com.google.android.gms.internal.location.zzex.zza;
        }
    }
}
