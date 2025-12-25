package com.google.android.gms.internal.auth;
 class zzgu extends java.util.AbstractMap {
    private final int zza;
    private java.util.List zzb;
    private java.util.Map zzc;
    private boolean zzd;
    private volatile com.google.android.gms.internal.auth.zzgs zze;
    private java.util.Map zzf;

    public synthetic zzgu(int p1, com.google.android.gms.internal.auth.zzgt p2)
    {
        this.zza = p1;
        this.zzb = java.util.Collections.EMPTY_LIST;
        java.util.Map v1_2 = java.util.Collections.EMPTY_MAP;
        this.zzc = v1_2;
        this.zzf = v1_2;
        return;
    }

    public static bridge synthetic Object zzd(com.google.android.gms.internal.auth.zzgu p0, int p1)
    {
        return p0.zzl(p1);
    }

    public static bridge synthetic java.util.List zzf(com.google.android.gms.internal.auth.zzgu p0)
    {
        return p0.zzb;
    }

    public static bridge synthetic java.util.Map zzh(com.google.android.gms.internal.auth.zzgu p0)
    {
        return p0.zzc;
    }

    public static bridge synthetic void zzi(com.google.android.gms.internal.auth.zzgu p0)
    {
        p0.zzn();
        return;
    }

    private final int zzk(Comparable p5)
    {
        int v0_1 = this.zzb.size();
        int v1 = (v0_1 - 1);
        int v2_1 = 0;
        if (v1 >= 0) {
            int v3_1 = p5.compareTo(((com.google.android.gms.internal.auth.zzgo) this.zzb.get(v1)).zza());
            if (v3_1 <= 0) {
                if (v3_1 == 0) {
                    return v1;
                }
            } else {
                return (- (v0_1 + 1));
            }
        }
        while (v2_1 <= v1) {
            int v0_3 = ((v2_1 + v1) / 2);
            int v3_6 = p5.compareTo(((com.google.android.gms.internal.auth.zzgo) this.zzb.get(v0_3)).zza());
            if (v3_6 >= 0) {
                if (v3_6 <= 0) {
                    return v0_3;
                } else {
                    v2_1 = (v0_3 + 1);
                }
            } else {
                v1 = (v0_3 - 1);
            }
        }
        return (- (v2_1 + 1));
    }

    private final Object zzl(int p6)
    {
        this.zzn();
        Object v6_3 = ((com.google.android.gms.internal.auth.zzgo) this.zzb.remove(p6)).getValue();
        if (!this.zzc.isEmpty()) {
            java.util.Iterator v0_3 = this.zzm().entrySet().iterator();
            Object v3_1 = ((java.util.Map$Entry) v0_3.next());
            this.zzb.add(new com.google.android.gms.internal.auth.zzgo(this, ((Comparable) v3_1.getKey()), v3_1.getValue()));
            v0_3.remove();
        }
        return v6_3;
    }

    private final java.util.SortedMap zzm()
    {
        this.zzn();
        if ((this.zzc.isEmpty()) && (!(this.zzc instanceof java.util.TreeMap))) {
            java.util.NavigableMap v0_8 = new java.util.TreeMap();
            this.zzc = v0_8;
            this.zzf = v0_8.descendingMap();
        }
        return ((java.util.SortedMap) this.zzc);
    }

    private final void zzn()
    {
        if (this.zzd) {
            throw new UnsupportedOperationException();
        } else {
            return;
        }
    }

    public final void clear()
    {
        this.zzn();
        if (!this.zzb.isEmpty()) {
            this.zzb.clear();
        }
        if (!this.zzc.isEmpty()) {
            this.zzc.clear();
        }
        return;
    }

    public final boolean containsKey(Object p2)
    {
        if ((this.zzk(((Comparable) p2)) < 0) && (!this.zzc.containsKey(((Comparable) p2)))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final java.util.Set entrySet()
    {
        if (this.zze == null) {
            this.zze = new com.google.android.gms.internal.auth.zzgs(this, 0);
        }
        return this.zze;
    }

    public final boolean equals(Object p8)
    {
        if (this != p8) {
            if ((p8 instanceof com.google.android.gms.internal.auth.zzgu)) {
                int v1_1 = this.size();
                if (v1_1 == ((com.google.android.gms.internal.auth.zzgu) p8).size()) {
                    int v2_0 = this.zzb();
                    if (v2_0 != ((com.google.android.gms.internal.auth.zzgu) p8).zzb()) {
                        return this.entrySet().equals(((com.google.android.gms.internal.auth.zzgu) p8).entrySet());
                    } else {
                        int v4_1 = 0;
                        while (v4_1 < v2_0) {
                            if (this.zzg(v4_1).equals(((com.google.android.gms.internal.auth.zzgu) p8).zzg(v4_1))) {
                                v4_1++;
                            } else {
                                return 0;
                            }
                        }
                        if (v2_0 == v1_1) {
                            return 1;
                        } else {
                            return this.zzc.equals(((com.google.android.gms.internal.auth.zzgu) p8).zzc);
                        }
                    }
                } else {
                    return 0;
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
        java.util.Map v0_0 = this.zzk(((Comparable) p2));
        if (v0_0 < null) {
            return this.zzc.get(((Comparable) p2));
        } else {
            return ((com.google.android.gms.internal.auth.zzgo) this.zzb.get(v0_0)).getValue();
        }
    }

    public final int hashCode()
    {
        int v0_0 = this.zzb();
        int v1 = 0;
        int v2 = 0;
        while (v1 < v0_0) {
            v2 += ((com.google.android.gms.internal.auth.zzgo) this.zzb.get(v1)).hashCode();
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
        return this.zze(((Comparable) p1), p2);
    }

    public final Object remove(Object p2)
    {
        this.zzn();
        java.util.Map v0_0 = this.zzk(((Comparable) p2));
        if (v0_0 < null) {
            if (!this.zzc.isEmpty()) {
                return this.zzc.remove(((Comparable) p2));
            } else {
                return 0;
            }
        } else {
            return this.zzl(v0_0);
        }
    }

    public final int size()
    {
        return (this.zzc.size() + this.zzb.size());
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

    public final int zzb()
    {
        return this.zzb.size();
    }

    public final Iterable zzc()
    {
        if (!this.zzc.isEmpty()) {
            return this.zzc.entrySet();
        } else {
            return com.google.android.gms.internal.auth.zzgn.zza();
        }
    }

    public final Object zze(Comparable p5, Object p6)
    {
        this.zzn();
        java.util.SortedMap v0_2 = this.zzk(p5);
        if (v0_2 < null) {
            this.zzn();
            if ((this.zzb.isEmpty()) && (!(this.zzb instanceof java.util.ArrayList))) {
                this.zzb = new java.util.ArrayList(this.zza);
            }
            java.util.SortedMap v0_1 = (- (v0_2 + 1));
            if (v0_1 < this.zza) {
                com.google.android.gms.internal.auth.zzgo v2_1 = this.zza;
                if (this.zzb.size() == v2_1) {
                    java.util.List v1_8 = ((com.google.android.gms.internal.auth.zzgo) this.zzb.remove((v2_1 - 1)));
                    this.zzm().put(v1_8.zza(), v1_8.getValue());
                }
                this.zzb.add(v0_1, new com.google.android.gms.internal.auth.zzgo(this, p5, p6));
                return 0;
            } else {
                return this.zzm().put(p5, p6);
            }
        } else {
            return ((com.google.android.gms.internal.auth.zzgo) this.zzb.get(v0_2)).setValue(p6);
        }
    }

    public final java.util.Map$Entry zzg(int p2)
    {
        return ((java.util.Map$Entry) this.zzb.get(p2));
    }

    public final boolean zzj()
    {
        return this.zzd;
    }
}
