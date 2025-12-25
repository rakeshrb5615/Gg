package com.google.android.gms.internal.fido;
public final class zzbg extends com.google.android.gms.internal.fido.zzbh implements java.util.NavigableMap {
    public static final synthetic int zzb;
    private static final java.util.Comparator zzc;
    private static final com.google.android.gms.internal.fido.zzbg zzd;
    private final transient com.google.android.gms.internal.fido.zzbu zze;
    private final transient com.google.android.gms.internal.fido.zzaz zzf;
    private final transient com.google.android.gms.internal.fido.zzbg zzg;

    static zzbg()
    {
        com.google.android.gms.internal.fido.zzbu v0_0 = com.google.android.gms.internal.fido.zzbp.zza;
        com.google.android.gms.internal.fido.zzbg.zzc = v0_0;
        com.google.android.gms.internal.fido.zzbg.zzd = new com.google.android.gms.internal.fido.zzbg(com.google.android.gms.internal.fido.zzbi.zzq(v0_0), com.google.android.gms.internal.fido.zzbs.zza, 0);
        return;
    }

    public zzbg(com.google.android.gms.internal.fido.zzbu p1, com.google.android.gms.internal.fido.zzaz p2, com.google.android.gms.internal.fido.zzbg p3)
    {
        this.zze = p1;
        this.zzf = p2;
        this.zzg = p3;
        return;
    }

    public static bridge synthetic com.google.android.gms.internal.fido.zzaz zze(com.google.android.gms.internal.fido.zzbg p0)
    {
        return p0.zzf;
    }

    public static com.google.android.gms.internal.fido.zzbg zzf(java.util.Map p11)
    {
        String v1_9;
        String v0_0 = com.google.android.gms.internal.fido.zzbg.zzc;
        String v1_2 = p11.comparator();
        String v2_1 = 1;
        if (v1_2 != null) {
            v1_9 = v0_0.equals(v1_2);
        } else {
            v1_9 = 1;
        }
        IllegalArgumentException v11_3 = p11.entrySet();
        if (v11_3 == null) {
            IllegalArgumentException v11_2 = v11_3.iterator();
            int v4_1 = new java.util.ArrayList();
            v11_2.getClass();
            while (v11_2.hasNext()) {
                v4_1.add(v11_2.next());
            }
            v11_3 = v4_1;
        }
        IllegalArgumentException v11_5 = ((java.util.Map$Entry[]) v11_3.toArray(com.google.android.gms.internal.fido.zzba.zza));
        String v3_1 = v11_5.length;
        if (v3_1 == null) {
            return com.google.android.gms.internal.fido.zzbg.zzg(v0_0);
        } else {
            com.google.android.gms.internal.fido.zzbg v5_0 = 0;
            if (v3_1 == 1) {
                IllegalArgumentException v11_7 = v11_5[0];
                v11_7.getClass();
                return new com.google.android.gms.internal.fido.zzbg(new com.google.android.gms.internal.fido.zzbu(com.google.android.gms.internal.fido.zzaz.zzj(v11_7.getKey()), v0_0), com.google.android.gms.internal.fido.zzaz.zzj(v11_7.getValue()), 0);
            } else {
                Object[] v6 = new Object[v3_1];
                Object[] v7 = new Object[v3_1];
                if (v1_9 == null) {
                    java.util.Arrays.sort(v11_5, 0, v3_1, new com.google.android.gms.internal.fido.zzbd(v0_0));
                    String v1_7 = v11_5[0];
                    v1_7.getClass();
                    Object v8_0 = v1_7.getKey();
                    v6[0] = v8_0;
                    String v1_8 = v1_7.getValue();
                    v7[0] = v1_8;
                    com.google.android.gms.internal.fido.zzas.zza(v6[0], v1_8);
                    while (v2_1 < v3_1) {
                        String v1_11 = v11_5[(v2_1 - 1)];
                        v1_11.getClass();
                        com.google.android.gms.internal.fido.zzbg v5_4 = v11_5[v2_1];
                        v5_4.getClass();
                        Object v9 = v5_4.getKey();
                        Object v10 = v5_4.getValue();
                        com.google.android.gms.internal.fido.zzas.zza(v9, v10);
                        v6[v2_1] = v9;
                        v7[v2_1] = v10;
                        if (v0_0.compare(v8_0, v9) == 0) {
                            throw new IllegalArgumentException(g2.g.f("Multiple entries with same key: ", String.valueOf(v1_11), " and ", String.valueOf(v5_4)));
                        } else {
                            v2_1++;
                            v8_0 = v9;
                        }
                    }
                } else {
                    while (v5_0 < v3_1) {
                        String v1_0 = v11_5[v5_0];
                        v1_0.getClass();
                        String v2_0 = v1_0.getKey();
                        String v1_1 = v1_0.getValue();
                        com.google.android.gms.internal.fido.zzas.zza(v2_0, v1_1);
                        v6[v5_0] = v2_0;
                        v7[v5_0] = v1_1;
                        v5_0++;
                    }
                }
                return new com.google.android.gms.internal.fido.zzbg(new com.google.android.gms.internal.fido.zzbu(com.google.android.gms.internal.fido.zzaz.zzh(v6, v3_1), v0_0), com.google.android.gms.internal.fido.zzaz.zzh(v7, v3_1), 0);
            }
        }
    }

    public static com.google.android.gms.internal.fido.zzbg zzg(java.util.Comparator p3)
    {
        if (!com.google.android.gms.internal.fido.zzbp.zza.equals(p3)) {
            return new com.google.android.gms.internal.fido.zzbg(com.google.android.gms.internal.fido.zzbi.zzq(p3), com.google.android.gms.internal.fido.zzbs.zza, 0);
        } else {
            return com.google.android.gms.internal.fido.zzbg.zzd;
        }
    }

    public static bridge synthetic com.google.android.gms.internal.fido.zzbu zzk(com.google.android.gms.internal.fido.zzbg p0)
    {
        return p0.zze;
    }

    private final com.google.android.gms.internal.fido.zzbg zzl(int p4, int p5)
    {
        if (p4 == null) {
            if (p5 == this.zzf.size()) {
                return this;
            } else {
                p4 = 0;
            }
        }
        if (p4 != p5) {
            return new com.google.android.gms.internal.fido.zzbg(this.zze.zzu(p4, p5), this.zzf.zzg(p4, p5), 0);
        } else {
            return com.google.android.gms.internal.fido.zzbg.zzg(this.zze.zza);
        }
    }

    public final java.util.Map$Entry ceilingEntry(Object p2)
    {
        return this.zzj(p2, 1).firstEntry();
    }

    public final Object ceilingKey(Object p1)
    {
        return com.google.android.gms.internal.fido.zzbn.zza(this.ceilingEntry(p1));
    }

    public final java.util.Comparator comparator()
    {
        return this.zze.zza;
    }

    public final synthetic java.util.NavigableSet descendingKeySet()
    {
        return this.zze.zzl();
    }

    public final bridge synthetic java.util.NavigableMap descendingMap()
    {
        com.google.android.gms.internal.fido.zzbg v0_0 = this.zzg;
        if (v0_0 == null) {
            if (!this.isEmpty()) {
                v0_0 = new com.google.android.gms.internal.fido.zzbg(((com.google.android.gms.internal.fido.zzbu) this.zze.zzl()), this.zzf.zzf(), this);
            } else {
                com.google.android.gms.internal.fido.zzbg v0_3;
                com.google.android.gms.internal.fido.zzbg v0_2 = this.zze.zza;
                if (!(v0_2 instanceof com.google.android.gms.internal.fido.zzbr)) {
                    v0_3 = new com.google.android.gms.internal.fido.zzat(v0_2);
                } else {
                    v0_3 = ((com.google.android.gms.internal.fido.zzbr) v0_2);
                }
                return com.google.android.gms.internal.fido.zzbg.zzg(v0_3.zza());
            }
        }
        return v0_0;
    }

    public final bridge synthetic java.util.Set entrySet()
    {
        return this.zzc();
    }

    public final java.util.Map$Entry firstEntry()
    {
        if (!this.isEmpty()) {
            return ((java.util.Map$Entry) this.zzc().zzi().get(0));
        } else {
            return 0;
        }
    }

    public final Object firstKey()
    {
        return this.zze.first();
    }

    public final java.util.Map$Entry floorEntry(Object p2)
    {
        return this.zzh(p2, 1).lastEntry();
    }

    public final Object floorKey(Object p1)
    {
        return com.google.android.gms.internal.fido.zzbn.zza(this.floorEntry(p1));
    }

    public final Object get(Object p4)
    {
        Object v4_3;
        com.google.android.gms.internal.fido.zzaz v0_0 = this.zze;
        try {
            if (p4 != null) {
                v4_3 = java.util.Collections.binarySearch(v0_0.zzd, p4, v0_0.zza);
                if (v4_3 < null) {
                    v4_3 = -1;
                }
            }
        } catch (ClassCastException) {
        }
        if (v4_3 != -1) {
            return this.zzf.get(v4_3);
        } else {
            return 0;
        }
    }

    public final bridge synthetic java.util.NavigableMap headMap(Object p1, boolean p2)
    {
        return this.zzh(p1, p2);
    }

    public final synthetic java.util.SortedMap headMap(Object p2)
    {
        return this.zzh(p2, 0);
    }

    public final java.util.Map$Entry higherEntry(Object p2)
    {
        return this.zzj(p2, 0).firstEntry();
    }

    public final Object higherKey(Object p1)
    {
        return com.google.android.gms.internal.fido.zzbn.zza(this.higherEntry(p1));
    }

    public final synthetic java.util.Set keySet()
    {
        return this.zze;
    }

    public final java.util.Map$Entry lastEntry()
    {
        if (!this.isEmpty()) {
            return ((java.util.Map$Entry) this.zzc().zzi().get((this.zzf.size() - 1)));
        } else {
            return 0;
        }
    }

    public final Object lastKey()
    {
        return this.zze.last();
    }

    public final java.util.Map$Entry lowerEntry(Object p2)
    {
        return this.zzh(p2, 0).lastEntry();
    }

    public final Object lowerKey(Object p1)
    {
        return com.google.android.gms.internal.fido.zzbn.zza(this.lowerEntry(p1));
    }

    public final synthetic java.util.NavigableSet navigableKeySet()
    {
        return this.zze;
    }

    public final java.util.Map$Entry pollFirstEntry()
    {
        throw new UnsupportedOperationException();
    }

    public final java.util.Map$Entry pollLastEntry()
    {
        throw new UnsupportedOperationException();
    }

    public final int size()
    {
        return this.zzf.size();
    }

    public final bridge synthetic java.util.NavigableMap subMap(Object p1, boolean p2, Object p3, boolean p4)
    {
        return this.zzi(p1, p2, p3, p4);
    }

    public final bridge synthetic java.util.SortedMap subMap(Object p3, Object p4)
    {
        return this.zzi(p3, 1, p4, 0);
    }

    public final bridge synthetic java.util.NavigableMap tailMap(Object p1, boolean p2)
    {
        return this.zzj(p1, p2);
    }

    public final synthetic java.util.SortedMap tailMap(Object p2)
    {
        return this.zzj(p2, 1);
    }

    public final synthetic java.util.Collection values()
    {
        return this.zzf;
    }

    public final com.google.android.gms.internal.fido.zzav zza()
    {
        return this.zzf;
    }

    public final com.google.android.gms.internal.fido.zzbc zzb()
    {
        if (!this.isEmpty()) {
            return new com.google.android.gms.internal.fido.zzbf(this);
        } else {
            return com.google.android.gms.internal.fido.zzbt.zza;
        }
    }

    public final synthetic com.google.android.gms.internal.fido.zzbc zzd()
    {
        return this.zze;
    }

    public final com.google.android.gms.internal.fido.zzbg zzh(Object p3, boolean p4)
    {
        com.google.android.gms.internal.fido.zzbu v0 = this.zze;
        p3.getClass();
        return this.zzl(0, v0.zzs(p3, p4));
    }

    public final com.google.android.gms.internal.fido.zzbg zzi(Object p2, boolean p3, Object p4, boolean p5)
    {
        p2.getClass();
        p4.getClass();
        if (this.zze.zza.compare(p2, p4) > 0) {
            throw new IllegalArgumentException(com.google.android.gms.internal.fido.zzaq.zza("expected fromKey <= toKey but %s > %s", new Object[] {p2, p4})));
        } else {
            return this.zzh(p4, p5).zzj(p2, p3);
        }
    }

    public final com.google.android.gms.internal.fido.zzbg zzj(Object p2, boolean p3)
    {
        com.google.android.gms.internal.fido.zzbu v0 = this.zze;
        p2.getClass();
        return this.zzl(v0.zzt(p2, p3), this.zzf.size());
    }
}
