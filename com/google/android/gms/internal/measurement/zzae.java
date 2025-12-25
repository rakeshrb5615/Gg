package com.google.android.gms.internal.measurement;
public final class zzae implements java.lang.Iterable, com.google.android.gms.internal.measurement.zzao, com.google.android.gms.internal.measurement.zzak {
    final java.util.SortedMap zza;
    final java.util.Map zzb;

    public zzae()
    {
        this.zza = new java.util.TreeMap();
        this.zzb = new java.util.TreeMap();
        return;
    }

    public zzae(java.util.List p3)
    {
        if (p3 != null) {
            int v0 = 0;
            while (v0 < p3.size()) {
                this.zzn(v0, ((com.google.android.gms.internal.measurement.zzao) p3.get(v0)));
                v0++;
            }
        }
        return;
    }

    public final boolean equals(Object p7)
    {
        if (p7 != this) {
            if ((p7 instanceof com.google.android.gms.internal.measurement.zzae)) {
                if (this.zzh() == ((com.google.android.gms.internal.measurement.zzae) p7).zzh()) {
                    java.util.SortedMap v1_0 = this.zza;
                    if (!v1_0.isEmpty()) {
                        int v3_3 = ((Integer) v1_0.firstKey()).intValue();
                        while (v3_3 <= ((Integer) v1_0.lastKey()).intValue()) {
                            if (this.zzl(v3_3).equals(((com.google.android.gms.internal.measurement.zzae) p7).zzl(v3_3))) {
                                v3_3++;
                            } else {
                                return 0;
                            }
                        }
                        return 1;
                    } else {
                        return ((com.google.android.gms.internal.measurement.zzae) p7).zza.isEmpty();
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
        return (this.zza.hashCode() * 31);
    }

    public final java.util.Iterator iterator()
    {
        return new com.google.android.gms.internal.measurement.zzad(this);
    }

    public final String toString()
    {
        return this.zzs(",");
    }

    public final java.util.List zzb()
    {
        java.util.ArrayList v0_1 = new java.util.ArrayList(this.zzh());
        int v1_0 = 0;
        while (v1_0 < this.zzh()) {
            v0_1.add(this.zzl(v1_0));
            v1_0++;
        }
        return v0_1;
    }

    public final String zzc()
    {
        return this.zzs(",");
    }

    public final com.google.android.gms.internal.measurement.zzao zzcA(String p2, com.google.android.gms.internal.measurement.zzg p3, java.util.List p4)
    {
        if ((!"concat".equals(p2)) && ((!"every".equals(p2)) && ((!"filter".equals(p2)) && ((!"forEach".equals(p2)) && ((!"indexOf".equals(p2)) && ((!"join".equals(p2)) && ((!"lastIndexOf".equals(p2)) && ((!"map".equals(p2)) && ((!"pop".equals(p2)) && ((!"push".equals(p2)) && ((!"reduce".equals(p2)) && ((!"reduceRight".equals(p2)) && ((!"reverse".equals(p2)) && ((!"shift".equals(p2)) && ((!"slice".equals(p2)) && ((!"some".equals(p2)) && ((!"sort".equals(p2)) && ((!"splice".equals(p2)) && ((!"toString".equals(p2)) && (!"unshift".equals(p2))))))))))))))))))))) {
            return com.google.android.gms.internal.measurement.zzak.zzu(this, new com.google.android.gms.internal.measurement.zzas(p2), p3, p4);
        } else {
            return com.google.android.gms.internal.measurement.zzba.zza(p2, this, p3, p4);
        }
    }

    public final Double zzd()
    {
        Double v0_0 = this.zza;
        if (v0_0.size() != 1) {
            if (v0_0.size() > 0) {
                return Double.valueOf(9221120237041090560);
            } else {
                return Double.valueOf(0);
            }
        } else {
            return this.zzl(0).zzd();
        }
    }

    public final Boolean zze()
    {
        return Boolean.TRUE;
    }

    public final java.util.Iterator zzf()
    {
        return new com.google.android.gms.internal.measurement.zzac(this, this.zza.keySet().iterator(), this.zzb.keySet().iterator());
    }

    public final java.util.Iterator zzg()
    {
        return this.zza.keySet().iterator();
    }

    public final int zzh()
    {
        int v0_0 = this.zza;
        if (!v0_0.isEmpty()) {
            return (((Integer) v0_0.lastKey()).intValue() + 1);
        } else {
            return 0;
        }
    }

    public final int zzi()
    {
        return this.zza.size();
    }

    public final boolean zzj(String p2)
    {
        if ((!"length".equals(p2)) && (!this.zzb.containsKey(p2))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final com.google.android.gms.internal.measurement.zzao zzk(String p3)
    {
        if (!"length".equals(p3)) {
            if (this.zzj(p3)) {
                com.google.android.gms.internal.measurement.zzao v3_1 = ((com.google.android.gms.internal.measurement.zzao) this.zzb.get(p3));
                if (v3_1 != null) {
                    return v3_1;
                }
            }
            return com.google.android.gms.internal.measurement.zzao.zzf;
        } else {
            return new com.google.android.gms.internal.measurement.zzah(Double.valueOf(((double) this.zzh())));
        }
    }

    public final com.google.android.gms.internal.measurement.zzao zzl(int p2)
    {
        if (p2 >= this.zzh()) {
            throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
        } else {
            if (this.zzo(p2)) {
                com.google.android.gms.internal.measurement.zzao v2_3 = ((com.google.android.gms.internal.measurement.zzao) this.zza.get(Integer.valueOf(p2)));
                if (v2_3 != null) {
                    return v2_3;
                }
            }
            return com.google.android.gms.internal.measurement.zzao.zzf;
        }
    }

    public final void zzm(String p2, com.google.android.gms.internal.measurement.zzao p3)
    {
        if (p3 != null) {
            this.zzb.put(p2, p3);
            return;
        } else {
            this.zzb.remove(p2);
            return;
        }
    }

    public final void zzn(int p3, com.google.android.gms.internal.measurement.zzao p4)
    {
        if (p3 > 32468) {
            throw new IllegalStateException("Array too large");
        } else {
            if (p3 < null) {
                throw new IndexOutOfBoundsException(v1.a.m(new StringBuilder((String.valueOf(p3).length() + 21)), "Out of bounds index: ", p3));
            } else {
                if (p4 != null) {
                    this.zza.put(Integer.valueOf(p3), p4);
                    return;
                } else {
                    this.zza.remove(Integer.valueOf(p3));
                    return;
                }
            }
        }
    }

    public final boolean zzo(int p4)
    {
        if (p4) {
            IndexOutOfBoundsException v0_0 = this.zza;
            if (p4 <= ((Integer) v0_0.lastKey()).intValue()) {
                return v0_0.containsKey(Integer.valueOf(p4));
            }
        }
        throw new IndexOutOfBoundsException(v1.a.m(new StringBuilder((String.valueOf(p4).length() + 21)), "Out of bounds index: ", p4));
    }

    public final void zzp()
    {
        this.zza.clear();
        return;
    }

    public final void zzq(int p6, com.google.android.gms.internal.measurement.zzao p7)
    {
        if (p6 < null) {
            throw new IllegalArgumentException(v1.a.m(new StringBuilder((String.valueOf(p6).length() + 21)), "Invalid value index: ", p6));
        } else {
            if (p6 < this.zzh()) {
                java.util.SortedMap v0_1 = this.zza;
                int v1_2 = ((Integer) v0_1.lastKey()).intValue();
                while (v1_2 >= p6) {
                    Integer v2 = Integer.valueOf(v1_2);
                    com.google.android.gms.internal.measurement.zzao v3_1 = ((com.google.android.gms.internal.measurement.zzao) v0_1.get(v2));
                    if (v3_1 != null) {
                        this.zzn((v1_2 + 1), v3_1);
                        v0_1.remove(v2);
                    }
                    v1_2--;
                }
                this.zzn(p6, p7);
                return;
            } else {
                this.zzn(p6, p7);
                return;
            }
        }
    }

    public final void zzr(int p5)
    {
        java.util.SortedMap v0 = this.zza;
        Integer v1_7 = ((Integer) v0.lastKey()).intValue();
        if ((p5 <= v1_7) && (p5 >= null)) {
            v0.remove(Integer.valueOf(p5));
            if (p5 == v1_7) {
                com.google.android.gms.internal.measurement.zzao v5_1 = (p5 - 1);
                Integer v1_6 = Integer.valueOf(v5_1);
                if ((!v0.containsKey(v1_6)) && (v5_1 >= null)) {
                    v0.put(v1_6, com.google.android.gms.internal.measurement.zzao.zzf);
                    return;
                }
                return;
            }
            do {
                p5++;
                if (p5 <= ((Integer) v0.lastKey()).intValue()) {
                    Integer v1_4 = Integer.valueOf(p5);
                    com.google.android.gms.internal.measurement.zzao v2_1 = ((com.google.android.gms.internal.measurement.zzao) v0.get(v1_4));
                }
            } while(v2_1 == null);
            v0.put(Integer.valueOf((p5 - 1)), v2_1);
            v0.remove(v1_4);
        }
        return;
    }

    public final String zzs(String p6)
    {
        StringBuilder v0_1 = new StringBuilder();
        if (!this.zza.isEmpty()) {
            int v2 = 0;
            while(true) {
                String v3_0;
                if (p6 != 0) {
                    v3_0 = p6;
                } else {
                    v3_0 = "";
                }
                if (v2 >= this.zzh()) {
                    break;
                }
                com.google.android.gms.internal.measurement.zzao v4_1 = this.zzl(v2);
                v0_1.append(v3_0);
                if ((!(v4_1 instanceof com.google.android.gms.internal.measurement.zzat)) && (!(v4_1 instanceof com.google.android.gms.internal.measurement.zzam))) {
                    v0_1.append(v4_1.zzc());
                }
                v2++;
            }
            v0_1.delete(0, v3_0.length());
        }
        return v0_1.toString();
    }

    public final com.google.android.gms.internal.measurement.zzao zzt()
    {
        com.google.android.gms.internal.measurement.zzae v0_1 = new com.google.android.gms.internal.measurement.zzae();
        java.util.Iterator v1_2 = this.zza.entrySet().iterator();
        while (v1_2.hasNext()) {
            com.google.android.gms.internal.measurement.zzao v2_1 = ((java.util.Map$Entry) v1_2.next());
            if (!(v2_1.getValue() instanceof com.google.android.gms.internal.measurement.zzak)) {
                v0_1.zza.put(((Integer) v2_1.getKey()), ((com.google.android.gms.internal.measurement.zzao) v2_1.getValue()).zzt());
            } else {
                v0_1.zza.put(((Integer) v2_1.getKey()), ((com.google.android.gms.internal.measurement.zzao) v2_1.getValue()));
            }
        }
        return v0_1;
    }
}
