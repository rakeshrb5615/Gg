package com.google.android.gms.internal.firebase-auth-api;
 class zzang extends java.util.AbstractMap {
    private Object[] zza;
    private int zzb;
    private java.util.Map zzc;
    private boolean zzd;
    private volatile com.google.android.gms.internal.firebase-auth-api.zzanm zze;
    private java.util.Map zzf;

    private zzang()
    {
        java.util.Map v0 = java.util.Collections.EMPTY_MAP;
        this.zzc = v0;
        this.zzf = v0;
        return;
    }

    public synthetic zzang(com.google.android.gms.internal.firebase-auth-api.zzanl p1)
    {
        return;
    }

    public static bridge synthetic int zza(com.google.android.gms.internal.firebase-auth-api.zzang p0)
    {
        return p0.zzb;
    }

    private final int zza(Comparable p5)
    {
        int v0_2;
        int v0_0 = this.zzb;
        int v1 = (v0_0 - 1);
        if (v1 < 0) {
            int v0_1 = 0;
            while (v0_1 <= v1) {
                int v2_2 = ((v0_1 + v1) / 2);
                int v3_5 = p5.compareTo(((Comparable) ((com.google.android.gms.internal.firebase-auth-api.zzank) this.zza[v2_2]).getKey()));
                if (v3_5 >= 0) {
                    if (v3_5 <= 0) {
                        return v2_2;
                    } else {
                        v0_1 = (v2_2 + 1);
                    }
                } else {
                    v1 = (v2_2 - 1);
                }
            }
            v0_2 = (v0_1 + 1);
        } else {
            int v2_0 = p5.compareTo(((Comparable) ((com.google.android.gms.internal.firebase-auth-api.zzank) this.zza[v1]).getKey()));
            if (v2_0 <= 0) {
                if (v2_0 != 0) {
                } else {
                    return v1;
                }
            } else {
                v0_2 = (v0_0 + 1);
            }
        }
        return (- v0_2);
    }

    public static synthetic Object zza(com.google.android.gms.internal.firebase-auth-api.zzang p0, int p1)
    {
        return p0.zzb(p1);
    }

    private final Object zzb(int p6)
    {
        this.zzg();
        Object v0_3 = ((com.google.android.gms.internal.firebase-auth-api.zzank) this.zza[p6]).getValue();
        System.arraycopy(this.zza, (p6 + 1), this.zza, p6, ((this.zzb - p6) - 1));
        this.zzb = (this.zzb - 1);
        if (!this.zzc.isEmpty()) {
            java.util.Iterator v6_7 = this.zzf().entrySet().iterator();
            this.zza[this.zzb] = new com.google.android.gms.internal.firebase-auth-api.zzank(this, ((java.util.Map$Entry) v6_7.next()));
            this.zzb = (this.zzb + 1);
            v6_7.remove();
        }
        return v0_3;
    }

    public static bridge synthetic java.util.Map zzb(com.google.android.gms.internal.firebase-auth-api.zzang p0)
    {
        return p0.zzc;
    }

    public static bridge synthetic java.util.Map zzc(com.google.android.gms.internal.firebase-auth-api.zzang p0)
    {
        return p0.zzf;
    }

    public static synthetic void zzd(com.google.android.gms.internal.firebase-auth-api.zzang p0)
    {
        p0.zzg();
        return;
    }

    public static bridge synthetic Object[] zze(com.google.android.gms.internal.firebase-auth-api.zzang p0)
    {
        return p0.zza;
    }

    private final java.util.SortedMap zzf()
    {
        this.zzg();
        if ((this.zzc.isEmpty()) && (!(this.zzc instanceof java.util.TreeMap))) {
            java.util.NavigableMap v0_8 = new java.util.TreeMap();
            this.zzc = v0_8;
            this.zzf = v0_8.descendingMap();
        }
        return ((java.util.SortedMap) this.zzc);
    }

    private final void zzg()
    {
        if (this.zzd) {
            throw new UnsupportedOperationException();
        } else {
            return;
        }
    }

    public void clear()
    {
        this.zzg();
        if (this.zzb != 0) {
            this.zza = 0;
            this.zzb = 0;
        }
        if (!this.zzc.isEmpty()) {
            this.zzc.clear();
        }
        return;
    }

    public boolean containsKey(Object p2)
    {
        if ((this.zza(((Comparable) p2)) < 0) && (!this.zzc.containsKey(((Comparable) p2)))) {
            return 0;
        } else {
            return 1;
        }
    }

    public java.util.Set entrySet()
    {
        if (this.zze == null) {
            this.zze = new com.google.android.gms.internal.firebase-auth-api.zzanm(this, 0);
        }
        return this.zze;
    }

    public boolean equals(Object p8)
    {
        if (this != p8) {
            if ((p8 instanceof com.google.android.gms.internal.firebase-auth-api.zzang)) {
                int v1_1 = this.size();
                if (v1_1 == ((com.google.android.gms.internal.firebase-auth-api.zzang) p8).size()) {
                    int v2_0 = this.zzb;
                    if (v2_0 == ((com.google.android.gms.internal.firebase-auth-api.zzang) p8).zzb) {
                        int v4_1 = 0;
                        while (v4_1 < v2_0) {
                            if (this.zza(v4_1).equals(((com.google.android.gms.internal.firebase-auth-api.zzang) p8).zza(v4_1))) {
                                v4_1++;
                            } else {
                                return 0;
                            }
                        }
                        if (v2_0 == v1_1) {
                            return 1;
                        } else {
                            return this.zzc.equals(((com.google.android.gms.internal.firebase-auth-api.zzang) p8).zzc);
                        }
                    } else {
                        return this.entrySet().equals(((com.google.android.gms.internal.firebase-auth-api.zzang) p8).entrySet());
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

    public Object get(Object p2)
    {
        java.util.Map v0_0 = this.zza(((Comparable) p2));
        if (v0_0 < null) {
            return this.zzc.get(((Comparable) p2));
        } else {
            return ((com.google.android.gms.internal.firebase-auth-api.zzank) this.zza[v0_0]).getValue();
        }
    }

    public int hashCode()
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

    public synthetic Object put(Object p1, Object p2)
    {
        return this.zza(((Comparable) p1), p2);
    }

    public Object remove(Object p2)
    {
        this.zzg();
        java.util.Map v0_0 = this.zza(((Comparable) p2));
        if (v0_0 < null) {
            if (!this.zzc.isEmpty()) {
                return this.zzc.remove(((Comparable) p2));
            } else {
                return 0;
            }
        } else {
            return this.zzb(v0_0);
        }
    }

    public int size()
    {
        return (this.zzc.size() + this.zzb);
    }

    public final Object zza(Comparable p5, Object p6)
    {
        this.zzg();
        java.util.SortedMap v0_2 = this.zza(p5);
        if (v0_2 < null) {
            this.zzg();
            if (this.zza == null) {
                Object[] v1_6 = new Object[16];
                this.zza = v1_6;
            }
            java.util.SortedMap v0_1 = (- (v0_2 + 1));
            if (v0_1 < 16) {
                Object[] v1_0 = this.zzb;
                if (v1_0 == 16) {
                    com.google.android.gms.internal.firebase-auth-api.zzank v2_2 = ((com.google.android.gms.internal.firebase-auth-api.zzank) this.zza[15]);
                    this.zzb = (v1_0 - 1);
                    this.zzf().put(((Comparable) v2_2.getKey()), v2_2.getValue());
                }
                Object[] v1_3 = this.zza;
                System.arraycopy(v1_3, v0_1, v1_3, (v0_1 + 1), ((v1_3.length - v0_1) - 1));
                this.zza[v0_1] = new com.google.android.gms.internal.firebase-auth-api.zzank(this, p5, p6);
                this.zzb = (this.zzb + 1);
                return 0;
            } else {
                return this.zzf().put(p5, p6);
            }
        } else {
            return ((com.google.android.gms.internal.firebase-auth-api.zzank) this.zza[v0_2]).setValue(p6);
        }
    }

    public final java.util.Map$Entry zza(int p2)
    {
        if (p2 >= this.zzb) {
            throw new ArrayIndexOutOfBoundsException(p2);
        } else {
            return ((com.google.android.gms.internal.firebase-auth-api.zzank) this.zza[p2]);
        }
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
        return this.zzb;
    }

    public final Iterable zzc()
    {
        if (!this.zzc.isEmpty()) {
            return this.zzc.entrySet();
        } else {
            return java.util.Collections.EMPTY_SET;
        }
    }

    public final java.util.Set zzd()
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzanh(this, 0);
    }

    public final boolean zze()
    {
        return this.zzd;
    }
}
