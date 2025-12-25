package com.google.android.recaptcha.internal;
 class zzpe extends java.util.AbstractMap {
    private Object[] zza;
    private int zzb;
    private java.util.Map zzc;
    private boolean zzd;
    private volatile com.google.android.recaptcha.internal.zzpc zze;
    private java.util.Map zzf;

    private zzpe()
    {
        java.util.Map v0 = java.util.Collections.EMPTY_MAP;
        this.zzc = v0;
        this.zzf = v0;
        return;
    }

    public synthetic zzpe(com.google.android.recaptcha.internal.zzpd p1)
    {
        p1 = java.util.Collections.EMPTY_MAP;
        this.zzc = p1;
        this.zzf = p1;
        return;
    }

    public static bridge synthetic int zzb(com.google.android.recaptcha.internal.zzpe p0)
    {
        return p0.zzb;
    }

    public static bridge synthetic Object zze(com.google.android.recaptcha.internal.zzpe p0, int p1)
    {
        return p0.zzm(p1);
    }

    public static bridge synthetic java.util.Map zzh(com.google.android.recaptcha.internal.zzpe p0)
    {
        return p0.zzc;
    }

    public static bridge synthetic void zzi(com.google.android.recaptcha.internal.zzpe p0)
    {
        p0.zzo();
        return;
    }

    public static bridge synthetic Object[] zzk(com.google.android.recaptcha.internal.zzpe p0)
    {
        return p0.zza;
    }

    private final int zzl(Comparable p5)
    {
        int v0_0 = this.zzb;
        int v1 = (v0_0 - 1);
        int v2_1 = 0;
        if (v1 >= 0) {
            int v3_0 = p5.compareTo(((com.google.android.recaptcha.internal.zzpa) this.zza[v1]).zza());
            if (v3_0 <= 0) {
                if (v3_0 == 0) {
                    return v1;
                }
            } else {
                return (- (v0_0 + 1));
            }
        }
        while (v2_1 <= v1) {
            int v0_2 = ((v2_1 + v1) / 2);
            int v3_5 = p5.compareTo(((com.google.android.recaptcha.internal.zzpa) this.zza[v0_2]).zza());
            if (v3_5 >= 0) {
                if (v3_5 <= 0) {
                    return v0_2;
                } else {
                    v2_1 = (v0_2 + 1);
                }
            } else {
                v1 = (v0_2 - 1);
            }
        }
        return (- (v2_1 + 1));
    }

    private final Object zzm(int p7)
    {
        this.zzo();
        Object v0_3 = ((com.google.android.recaptcha.internal.zzpa) this.zza[p7]).getValue();
        System.arraycopy(this.zza, (p7 + 1), this.zza, p7, ((this.zzb - p7) - 1));
        this.zzb = (this.zzb - 1);
        if (!this.zzc.isEmpty()) {
            java.util.Iterator v7_7 = this.zzn().entrySet().iterator();
            Object v4_1 = ((java.util.Map$Entry) v7_7.next());
            this.zza[this.zzb] = new com.google.android.recaptcha.internal.zzpa(this, ((Comparable) v4_1.getKey()), v4_1.getValue());
            this.zzb = (this.zzb + 1);
            v7_7.remove();
        }
        return v0_3;
    }

    private final java.util.SortedMap zzn()
    {
        this.zzo();
        if ((this.zzc.isEmpty()) && (!(this.zzc instanceof java.util.TreeMap))) {
            java.util.NavigableMap v0_8 = new java.util.TreeMap();
            this.zzc = v0_8;
            this.zzf = v0_8.descendingMap();
        }
        return ((java.util.SortedMap) this.zzc);
    }

    private final void zzo()
    {
        if (this.zzd) {
            throw new UnsupportedOperationException();
        } else {
            return;
        }
    }

    public final void clear()
    {
        this.zzo();
        if (this.zzb != 0) {
            this.zza = 0;
            this.zzb = 0;
        }
        if (!this.zzc.isEmpty()) {
            this.zzc.clear();
        }
        return;
    }

    public final boolean containsKey(Object p2)
    {
        if ((this.zzl(((Comparable) p2)) < 0) && (!this.zzc.containsKey(((Comparable) p2)))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final java.util.Set entrySet()
    {
        if (this.zze == null) {
            this.zze = new com.google.android.recaptcha.internal.zzpc(this, 0);
        }
        return this.zze;
    }

    public final boolean equals(Object p8)
    {
        if (this != p8) {
            if ((p8 instanceof com.google.android.recaptcha.internal.zzpe)) {
                int v1_1 = this.size();
                if (v1_1 != ((com.google.android.recaptcha.internal.zzpe) p8).size()) {
                    return 0;
                } else {
                    int v2_0 = this.zzb;
                    if (v2_0 != ((com.google.android.recaptcha.internal.zzpe) p8).zzb) {
                        return this.entrySet().equals(((com.google.android.recaptcha.internal.zzpe) p8).entrySet());
                    } else {
                        int v4_1 = 0;
                        while (v4_1 < v2_0) {
                            if (this.zzg(v4_1).equals(((com.google.android.recaptcha.internal.zzpe) p8).zzg(v4_1))) {
                                v4_1++;
                            } else {
                                return 0;
                            }
                        }
                        if (v2_0 == v1_1) {
                            return 1;
                        } else {
                            return this.zzc.equals(((com.google.android.recaptcha.internal.zzpe) p8).zzc);
                        }
                    }
                }
            } else {
                return super.equals(p8);
            }
        } else {
            return 1;
        }
    }

    public final Object get(Object p2)
    {
        java.util.Map v0_0 = this.zzl(((Comparable) p2));
        if (v0_0 < null) {
            return this.zzc.get(((Comparable) p2));
        } else {
            return ((com.google.android.recaptcha.internal.zzpa) this.zza[v0_0]).getValue();
        }
    }

    public final int hashCode()
    {
        int v0_0 = this.zzb;
        int v1 = 0;
        int v2 = 0;
        while (v1 < v0_0) {
            v2 += this.zza[v1].hashCode();
            v1++;
        }
        if (this.zzc.size() <= 0) {
            return v2;
        } else {
            return (this.zzc.hashCode() + v2);
        }
    }

    public final bridge synthetic Object put(Object p1, Object p2)
    {
        return this.zzf(((Comparable) p1), p2);
    }

    public final Object remove(Object p2)
    {
        this.zzo();
        java.util.Map v0_0 = this.zzl(((Comparable) p2));
        if (v0_0 < null) {
            if (!this.zzc.isEmpty()) {
                return this.zzc.remove(((Comparable) p2));
            } else {
                return 0;
            }
        } else {
            return this.zzm(v0_0);
        }
    }

    public final int size()
    {
        return (this.zzc.size() + this.zzb);
    }

    public void zza()
    {
        if (!this.zzd) {
            int v0_9;
            if (!this.zzc.isEmpty()) {
                v0_9 = java.util.Collections.unmodifiableMap(this.zzc);
            } else {
                v0_9 = java.util.Collections.EMPTY_MAP;
            }
            int v0_4;
            this.zzc = v0_9;
            if (!this.zzf.isEmpty()) {
                v0_4 = java.util.Collections.unmodifiableMap(this.zzf);
            } else {
                v0_4 = java.util.Collections.EMPTY_MAP;
            }
            this.zzf = v0_4;
            this.zzd = 1;
        }
        return;
    }

    public final int zzc()
    {
        return this.zzb;
    }

    public final Iterable zzd()
    {
        if (!this.zzc.isEmpty()) {
            return this.zzc.entrySet();
        } else {
            return java.util.Collections.EMPTY_SET;
        }
    }

    public final Object zzf(Comparable p5, Object p6)
    {
        this.zzo();
        java.util.SortedMap v0_2 = this.zzl(p5);
        if (v0_2 < null) {
            this.zzo();
            if (this.zza == null) {
                Object[] v1_8 = new Object[16];
                this.zza = v1_8;
            }
            java.util.SortedMap v0_1 = (- (v0_2 + 1));
            if (v0_1 < 16) {
                if (this.zzb == 16) {
                    Object[] v1_3 = ((com.google.android.recaptcha.internal.zzpa) this.zza[15]);
                    this.zzb = 15;
                    this.zzn().put(v1_3.zza(), v1_3.getValue());
                }
                System.arraycopy(this.zza, v0_1, this.zza, (v0_1 + 1), (15 - v0_1));
                this.zza[v0_1] = new com.google.android.recaptcha.internal.zzpa(this, p5, p6);
                this.zzb = (this.zzb + 1);
                return 0;
            } else {
                return this.zzn().put(p5, p6);
            }
        } else {
            return ((com.google.android.recaptcha.internal.zzpa) this.zza[v0_2]).setValue(p6);
        }
    }

    public final java.util.Map$Entry zzg(int p2)
    {
        if (p2 >= this.zzb) {
            throw new ArrayIndexOutOfBoundsException(p2);
        } else {
            return ((com.google.android.recaptcha.internal.zzpa) this.zza[p2]);
        }
    }

    public final boolean zzj()
    {
        return this.zzd;
    }
}
