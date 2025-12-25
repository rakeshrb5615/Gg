package com.google.android.gms.internal.firebase-auth-api;
public abstract class zzal implements java.io.Serializable, java.util.Map {
    private transient com.google.android.gms.internal.firebase-auth-api.zzaq zza;
    private transient com.google.android.gms.internal.firebase-auth-api.zzaq zzb;
    private transient com.google.android.gms.internal.firebase-auth-api.zzag zzc;

    public zzal()
    {
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzal zza(java.util.Map p2)
    {
        if ((!(p2 instanceof com.google.android.gms.internal.firebase-auth-api.zzal)) || ((p2 instanceof java.util.SortedMap))) {
            int v0_2;
            com.google.android.gms.internal.firebase-auth-api.zzal v2_3 = p2.entrySet();
            if (v2_3 == null) {
                v0_2 = 4;
            } else {
                v0_2 = v2_3.size();
            }
            com.google.android.gms.internal.firebase-auth-api.zzao v1_1 = new com.google.android.gms.internal.firebase-auth-api.zzao(v0_2);
            v1_1.zza(v2_3);
            return v1_1.zza();
        } else {
            ((com.google.android.gms.internal.firebase-auth-api.zzal) p2).zzd();
            return ((com.google.android.gms.internal.firebase-auth-api.zzal) p2);
        }
    }

    public final void clear()
    {
        throw new UnsupportedOperationException();
    }

    public boolean containsKey(Object p1)
    {
        if (this.get(p1) == null) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean containsValue(Object p2)
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzag) this.values()).contains(p2);
    }

    public synthetic java.util.Set entrySet()
    {
        com.google.android.gms.internal.firebase-auth-api.zzaq v0 = this.zza;
        if (v0 == null) {
            v0 = this.zzb();
            this.zza = v0;
        }
        return v0;
    }

    public boolean equals(Object p2)
    {
        if (this != p2) {
            if (!(p2 instanceof java.util.Map)) {
                return 0;
            } else {
                return this.entrySet().equals(((java.util.Map) p2).entrySet());
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

    public int hashCode()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzav.zza(((com.google.android.gms.internal.firebase-auth-api.zzaq) this.entrySet()));
    }

    public boolean isEmpty()
    {
        if (this.size() != 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public synthetic java.util.Set keySet()
    {
        com.google.android.gms.internal.firebase-auth-api.zzaq v0 = this.zzb;
        if (v0 == null) {
            v0 = this.zzc();
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

    public String toString()
    {
        String v0_0 = this.size();
        com.google.android.gms.internal.firebase-auth-api.zzae.zza(v0_0, "size");
        StringBuilder v1_0 = new StringBuilder(((int) Math.min((((long) v0_0) << 3), 1073741824)));
        v1_0.append(123);
        String v0_4 = this.entrySet().iterator();
        int v2_1 = 1;
        while (v0_4.hasNext()) {
            java.util.Map$Entry v3_2 = ((java.util.Map$Entry) v0_4.next());
            if (v2_1 == 0) {
                v1_0.append(", ");
            }
            v1_0.append(v3_2.getKey());
            v1_0.append(61);
            v1_0.append(v3_2.getValue());
            v2_1 = 0;
        }
        v1_0.append(125);
        return v1_0.toString();
    }

    public synthetic java.util.Collection values()
    {
        com.google.android.gms.internal.firebase-auth-api.zzag v0 = this.zzc;
        if (v0 == null) {
            v0 = this.zza();
            this.zzc = v0;
        }
        return v0;
    }

    public abstract com.google.android.gms.internal.firebase-auth-api.zzag zza();

    public abstract com.google.android.gms.internal.firebase-auth-api.zzaq zzb();

    public abstract com.google.android.gms.internal.firebase-auth-api.zzaq zzc();

    public abstract boolean zzd();
}
