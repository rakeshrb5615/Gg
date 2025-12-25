package com.google.android.gms.internal.fido;
public abstract class zzba implements java.util.Map, java.io.Serializable {
    static final java.util.Map$Entry[] zza;
    private transient com.google.android.gms.internal.fido.zzbc zzb;

    static zzba()
    {
        java.util.Map$Entry[] v0_1 = new java.util.Map$Entry[0];
        com.google.android.gms.internal.fido.zzba.zza = v0_1;
        return;
    }

    public zzba()
    {
        return;
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
        return this.zza().contains(p2);
    }

    public bridge synthetic java.util.Set entrySet()
    {
        return this.zzc();
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
        return com.google.android.gms.internal.fido.zzbx.zza(this.zzc());
    }

    public final boolean isEmpty()
    {
        if (this.size() != 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public bridge synthetic java.util.Set keySet()
    {
        return this.zzd();
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

    public bridge synthetic java.util.Collection values()
    {
        return this.zza();
    }

    public com.google.android.gms.internal.fido.zzav zza()
    {
        throw 0;
    }

    public abstract com.google.android.gms.internal.fido.zzbc zzb();

    public final com.google.android.gms.internal.fido.zzbc zzc()
    {
        com.google.android.gms.internal.fido.zzbc v0 = this.zzb;
        if (v0 == null) {
            v0 = this.zzb();
            this.zzb = v0;
        }
        return v0;
    }

    public com.google.android.gms.internal.fido.zzbc zzd()
    {
        throw 0;
    }
}
