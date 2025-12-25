package com.google.android.gms.internal.fido;
final class zzbu extends com.google.android.gms.internal.fido.zzbi {
    static final com.google.android.gms.internal.fido.zzbu zzc;
    final transient com.google.android.gms.internal.fido.zzaz zzd;

    static zzbu()
    {
        com.google.android.gms.internal.fido.zzbu.zzc = new com.google.android.gms.internal.fido.zzbu(com.google.android.gms.internal.fido.zzbs.zza, com.google.android.gms.internal.fido.zzbp.zza);
        return;
    }

    public zzbu(com.google.android.gms.internal.fido.zzaz p1, java.util.Comparator p2)
    {
        super(p2);
        super.zzd = p1;
        return;
    }

    public final Object ceiling(Object p2)
    {
        Object v2_2 = this.zzt(p2, 1);
        if (v2_2 != this.zzd.size()) {
            return this.zzd.get(v2_2);
        } else {
            return 0;
        }
    }

    public final boolean contains(Object p4)
    {
        try {
            if ((p4 == 0) || (java.util.Collections.binarySearch(this.zzd, p4, this.zza) < 0)) {
                return 0;
            } else {
                return 1;
            }
        } catch (ClassCastException) {
            return 0;
        }
    }

    public final boolean containsAll(java.util.Collection p7)
    {
        if ((p7 instanceof com.google.android.gms.internal.fido.zzbo)) {
            p7 = ((com.google.android.gms.internal.fido.zzbo) p7).zza();
        }
        if ((com.google.android.gms.internal.fido.zzca.zza(this.zza, p7)) && (p7.size() > 1)) {
            com.google.android.gms.internal.fido.zzcc v0_3 = this.zzd.zzk(0);
            java.util.Iterator v7_1 = p7.iterator();
            if (v0_3.hasNext()) {
                Object v3_1 = v7_1.next();
                Object v4_0 = v0_3.next();
                try {
                    while(true) {
                        int v5_1 = this.zza.compare(v4_0, v3_1);
                        v3_1 = v7_1.next();
                    }
                    return 1;
                } catch (ClassCastException) {
                    return 0;
                }
                if (v5_1 >= 0) {
                    if (v5_1 != 0) {
                        return 0;
                    } else {
                        if (v7_1.hasNext()) {
                        }
                    }
                } else {
                    if (v0_3.hasNext()) {
                        v4_0 = v0_3.next();
                    } else {
                        return 0;
                    }
                }
                return 1;
            } else {
                return 0;
            }
        } else {
            return super.containsAll(p7);
        }
    }

    public final bridge synthetic java.util.Iterator descendingIterator()
    {
        return this.zzr();
    }

    public final boolean equals(Object p7)
    {
        if (p7 != this) {
            if ((p7 instanceof java.util.Set)) {
                if (this.zzd.size() == ((java.util.Set) p7).size()) {
                    if (!this.isEmpty()) {
                        if (!com.google.android.gms.internal.fido.zzca.zza(this.zza, ((java.util.Set) p7))) {
                            return this.containsAll(((java.util.Set) p7));
                        } else {
                            boolean v7_2 = ((java.util.Set) p7).iterator();
                            try {
                                com.google.android.gms.internal.fido.zzcc v1_5 = this.zzd.zzk(0);
                            } catch (java.util.NoSuchElementException) {
                                return 0;
                            }
                            while (v1_5.hasNext()) {
                                int v3_2 = v1_5.next();
                                Object v4 = v7_2.next();
                                if ((v4 == null) || (this.zza.compare(v3_2, v4) != 0)) {
                                    return 0;
                                }
                            }
                            return 1;
                        }
                    } else {
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

    public final Object first()
    {
        if (this.isEmpty()) {
            throw new java.util.NoSuchElementException();
        } else {
            return this.zzd.get(0);
        }
    }

    public final Object floor(Object p2)
    {
        Object v2_3 = (this.zzs(p2, 1) + -1);
        if (v2_3 != -1) {
            return this.zzd.get(v2_3);
        } else {
            return 0;
        }
    }

    public final Object higher(Object p2)
    {
        Object v2_2 = this.zzt(p2, 0);
        if (v2_2 != this.zzd.size()) {
            return this.zzd.get(v2_2);
        } else {
            return 0;
        }
    }

    public final synthetic java.util.Iterator iterator()
    {
        return this.zzd.zzk(0);
    }

    public final Object last()
    {
        if (this.isEmpty()) {
            throw new java.util.NoSuchElementException();
        } else {
            java.util.NoSuchElementException v0_4 = this.zzd;
            return v0_4.get((v0_4.size() - 1));
        }
    }

    public final Object lower(Object p2)
    {
        Object v2_3 = (this.zzs(p2, 0) + -1);
        if (v2_3 != -1) {
            return this.zzd.get(v2_3);
        } else {
            return 0;
        }
    }

    public final int size()
    {
        return this.zzd.size();
    }

    public final int zza(Object[] p2, int p3)
    {
        return this.zzd.zza(p2, 0);
    }

    public final int zzb()
    {
        return this.zzd.zzb();
    }

    public final int zzc()
    {
        return this.zzd.zzc();
    }

    public final com.google.android.gms.internal.fido.zzcb zzd()
    {
        return this.zzd.zzk(0);
    }

    public final Object[] zze()
    {
        return this.zzd.zze();
    }

    public final com.google.android.gms.internal.fido.zzbi zzf()
    {
        com.google.android.gms.internal.fido.zzbu v0_2 = java.util.Collections.reverseOrder(this.zza);
        if (!this.isEmpty()) {
            return new com.google.android.gms.internal.fido.zzbu(this.zzd.zzf(), v0_2);
        } else {
            return com.google.android.gms.internal.fido.zzbi.zzq(v0_2);
        }
    }

    public final com.google.android.gms.internal.fido.zzaz zzi()
    {
        return this.zzd;
    }

    public final com.google.android.gms.internal.fido.zzbi zzm(Object p2, boolean p3)
    {
        return this.zzu(0, this.zzs(p2, p3));
    }

    public final com.google.android.gms.internal.fido.zzbi zzo(Object p1, boolean p2, Object p3, boolean p4)
    {
        return this.zzp(p1, p2).zzm(p3, p4);
    }

    public final com.google.android.gms.internal.fido.zzbi zzp(Object p1, boolean p2)
    {
        return this.zzu(this.zzt(p1, p2), this.zzd.size());
    }

    public final com.google.android.gms.internal.fido.zzcb zzr()
    {
        return this.zzd.zzf().zzk(0);
    }

    public final int zzs(Object p3, boolean p4)
    {
        com.google.android.gms.internal.fido.zzaz v0 = this.zzd;
        p3.getClass();
        int v3_1 = java.util.Collections.binarySearch(v0, p3, this.zza);
        if (v3_1 < 0) {
            return (~ v3_1);
        } else {
            if (p4) {
                v3_1++;
            }
            return v3_1;
        }
    }

    public final int zzt(Object p3, boolean p4)
    {
        com.google.android.gms.internal.fido.zzaz v0 = this.zzd;
        p3.getClass();
        int v3_1 = java.util.Collections.binarySearch(v0, p3, this.zza);
        if (v3_1 < 0) {
            return (~ v3_1);
        } else {
            if (!p4) {
                return (v3_1 + 1);
            } else {
                return v3_1;
            }
        }
    }

    public final com.google.android.gms.internal.fido.zzbu zzu(int p3, int p4)
    {
        if (p3 == null) {
            if (p4 == this.zzd.size()) {
                return this;
            } else {
                p3 = 0;
            }
        }
        if (p3 >= p4) {
            return com.google.android.gms.internal.fido.zzbi.zzq(this.zza);
        } else {
            return new com.google.android.gms.internal.fido.zzbu(this.zzd.zzg(p3, p4), this.zza);
        }
    }
}
