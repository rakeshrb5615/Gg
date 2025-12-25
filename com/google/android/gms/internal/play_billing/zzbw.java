package com.google.android.gms.internal.play_billing;
public abstract class zzbw implements java.util.Map, java.io.Serializable {
    private transient com.google.android.gms.internal.play_billing.zzbx zza;
    private transient com.google.android.gms.internal.play_billing.zzbx zzb;
    private transient com.google.android.gms.internal.play_billing.zzbq zzc;

    public zzbw()
    {
        return;
    }

    public static com.google.android.gms.internal.play_billing.zzbw zzc(Object p0, Object p1, Object p2, Object p3, Object p4, Object p5)
    {
        com.google.android.gms.internal.play_billing.zzbo.zza("com.android.vending.billing.PURCHASES_UPDATED", p1);
        com.google.android.gms.internal.play_billing.zzbo.zza("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED", p3);
        com.google.android.gms.internal.play_billing.zzbo.zza("com.android.vending.billing.ALTERNATIVE_BILLING", p5);
        return com.google.android.gms.internal.play_billing.zzcf.zzg(3, new Object[] {"com.android.vending.billing.PURCHASES_UPDATED", p5}), 0);
    }

    public final void clear()
    {
        throw new UnsupportedOperationException();
    }

    public final boolean containsKey(Object p1)
    {
        if (this.get(p1) == null) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean containsValue(Object p2)
    {
        return this.zzb().contains(p2);
    }

    public final bridge synthetic java.util.Set entrySet()
    {
        return this.zzf();
    }

    public final boolean equals(Object p2)
    {
        if (this != p2) {
            if ((p2 instanceof java.util.Map)) {
                return this.entrySet().equals(((java.util.Map) p2).entrySet());
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public abstract Object get();

    public final Object getOrDefault(Object p1, Object p2)
    {
        Object v1_1 = this.get(p1);
        if (v1_1 == null) {
            return p2;
        } else {
            return v1_1;
        }
    }

    public final int hashCode()
    {
        return com.google.android.gms.internal.play_billing.zzcg.zza(this.zzf());
    }

    public final boolean isEmpty()
    {
        if (this.size() != 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final bridge synthetic java.util.Set keySet()
    {
        com.google.android.gms.internal.play_billing.zzbx v0 = this.zzb;
        if (v0 == null) {
            v0 = this.zze();
            this.zzb = v0;
        }
        return v0;
    }

    public final Object put(Object p1, Object p2)
    {
        throw new UnsupportedOperationException();
    }

    public final void putAll(java.util.Map p1)
    {
        throw new UnsupportedOperationException();
    }

    public final Object remove(Object p1)
    {
        throw new UnsupportedOperationException();
    }

    public final String toString()
    {
        String v0_0 = this.size();
        if (v0_0 < null) {
            throw new IllegalArgumentException(g2.g.c(v0_0, "size cannot be negative but was: "));
        } else {
            String v2_2 = new StringBuilder(((int) Math.min((((long) v0_0) * 8), 1073741824)));
            v2_2.append(123);
            String v0_6 = this.entrySet().iterator();
            int v1_0 = 1;
            while (v0_6.hasNext()) {
                java.util.Map$Entry v3_3 = ((java.util.Map$Entry) v0_6.next());
                if (v1_0 == 0) {
                    v2_2.append(", ");
                }
                v2_2.append(v3_3.getKey());
                v2_2.append(61);
                v2_2.append(v3_3.getValue());
                v1_0 = 0;
            }
            v2_2.append(125);
            return v2_2.toString();
        }
    }

    public final bridge synthetic java.util.Collection values()
    {
        return this.zzb();
    }

    public abstract com.google.android.gms.internal.play_billing.zzbq zza();

    public final com.google.android.gms.internal.play_billing.zzbq zzb()
    {
        com.google.android.gms.internal.play_billing.zzbq v0 = this.zzc;
        if (v0 == null) {
            v0 = this.zza();
            this.zzc = v0;
        }
        return v0;
    }

    public abstract com.google.android.gms.internal.play_billing.zzbx zzd();

    public abstract com.google.android.gms.internal.play_billing.zzbx zze();

    public final com.google.android.gms.internal.play_billing.zzbx zzf()
    {
        com.google.android.gms.internal.play_billing.zzbx v0 = this.zza;
        if (v0 == null) {
            v0 = this.zzd();
            this.zza = v0;
        }
        return v0;
    }
}
