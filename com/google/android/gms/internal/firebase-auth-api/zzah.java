package com.google.android.gms.internal.firebase-auth-api;
public abstract class zzah extends com.google.android.gms.internal.firebase-auth-api.zzag implements java.util.List, java.util.RandomAccess {
    private static final com.google.android.gms.internal.firebase-auth-api.zzax zza;

    static zzah()
    {
        com.google.android.gms.internal.firebase-auth-api.zzah.zza = new com.google.android.gms.internal.firebase-auth-api.zzaj(com.google.android.gms.internal.firebase-auth-api.zzap.zza, 0);
        return;
    }

    public zzah()
    {
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzah zza(Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7)
    {
        NullPointerException v0_1 = new Object[] {p0, p7});
        String v1_1 = 0;
        while (v1_1 < 8) {
            if (v0_1[v1_1] == null) {
                throw new NullPointerException(g2.g.c(v1_1, "at index "));
            } else {
                v1_1++;
            }
        }
        return com.google.android.gms.internal.firebase-auth-api.zzah.zzb(v0_1, 8);
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzah zza(Object[] p1)
    {
        return com.google.android.gms.internal.firebase-auth-api.zzah.zzb(p1, p1.length);
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzah zzb(Object[] p1, int p2)
    {
        if (p2 != 0) {
            return new com.google.android.gms.internal.firebase-auth-api.zzap(p1, p2);
        } else {
            return com.google.android.gms.internal.firebase-auth-api.zzap.zza;
        }
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzak zzf()
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzak();
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzah zzg()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzap.zza;
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

    public boolean equals(Object p7)
    {
        if (p7 != com.google.android.gms.internal.firebase-auth-api.zzu.zza(this)) {
            if ((p7 instanceof java.util.List)) {
                int v0_3 = this.size();
                if (v0_3 == ((java.util.List) p7).size()) {
                    if (!(((java.util.List) p7) instanceof java.util.RandomAccess)) {
                        int v0_1 = this.size();
                        boolean v7_1 = ((java.util.List) p7).iterator();
                        int v3_2 = 0;
                        while (v3_2 < v0_1) {
                            if (v7_1.hasNext()) {
                                boolean v4_1 = this.get(v3_2);
                                v3_2++;
                                if (java.util.Objects.equals(v4_1, v7_1.next())) {
                                }
                            }
                        }
                        if (!v7_1.hasNext()) {
                            return 1;
                        }
                    } else {
                        int v3_3 = 0;
                        while (v3_3 < v0_3) {
                            if (java.util.Objects.equals(this.get(v3_3), ((java.util.List) p7).get(v3_3))) {
                                v3_3++;
                            }
                        }
                        return 1;
                    }
                }
            }
            return 0;
        } else {
            return 1;
        }
    }

    public int hashCode()
    {
        int v1_1 = 1;
        int v2 = 0;
        while (v2 < this.size()) {
            v1_1 = (~ (~ (this.get(v2).hashCode() + (v1_1 * 31))));
            v2++;
        }
        return v1_1;
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

    public synthetic java.util.Iterator iterator()
    {
        return this.zzd();
    }

    public int lastIndexOf(Object p4)
    {
        if (p4 != null) {
            int v1_0 = (this.size() - 1);
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

    public synthetic java.util.ListIterator listIterator()
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzax) this.listIterator(0));
    }

    public synthetic java.util.ListIterator listIterator(int p2)
    {
        com.google.android.gms.internal.firebase-auth-api.zzu.zzb(p2, this.size());
        if (!this.isEmpty()) {
            return new com.google.android.gms.internal.firebase-auth-api.zzaj(this, p2);
        } else {
            return com.google.android.gms.internal.firebase-auth-api.zzah.zza;
        }
    }

    public final Object remove(int p1)
    {
        throw new UnsupportedOperationException();
    }

    public final Object set(int p1, Object p2)
    {
        throw new UnsupportedOperationException();
    }

    public synthetic java.util.List subList(int p1, int p2)
    {
        return this.zza(p1, p2);
    }

    public int zza(Object[] p5, int p6)
    {
        int v0 = this.size();
        int v1 = 0;
        while (v1 < v0) {
            p5[(p6 + v1)] = this.get(v1);
            v1++;
        }
        return (p6 + v0);
    }

    public com.google.android.gms.internal.firebase-auth-api.zzah zza(int p2, int p3)
    {
        com.google.android.gms.internal.firebase-auth-api.zzu.zza(p2, p3, this.size());
        int v3_1 = (p3 - p2);
        if (v3_1 != this.size()) {
            if (v3_1 != 0) {
                return new com.google.android.gms.internal.firebase-auth-api.zzam(this, p2, v3_1);
            } else {
                return com.google.android.gms.internal.firebase-auth-api.zzap.zza;
            }
        } else {
            return this;
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzah zzc()
    {
        return this;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzay zzd()
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzax) this.listIterator());
    }
}
