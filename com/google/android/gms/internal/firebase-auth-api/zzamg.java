package com.google.android.gms.internal.firebase-auth-api;
public final class zzamg extends java.util.LinkedHashMap {
    private static final com.google.android.gms.internal.firebase-auth-api.zzamg zza;
    private boolean zzb;

    static zzamg()
    {
        com.google.android.gms.internal.firebase-auth-api.zzamg v0_1 = new com.google.android.gms.internal.firebase-auth-api.zzamg();
        com.google.android.gms.internal.firebase-auth-api.zzamg.zza = v0_1;
        v0_1.zzb = 0;
        return;
    }

    private zzamg()
    {
        this.zzb = 1;
        return;
    }

    private zzamg(java.util.Map p1)
    {
        super(p1);
        super.zzb = 1;
        return;
    }

    private static int zza(Object p1)
    {
        if (!(p1 instanceof byte[])) {
            if ((p1 instanceof com.google.android.gms.internal.firebase-auth-api.zzalk)) {
                throw new UnsupportedOperationException();
            } else {
                return p1.hashCode();
            }
        } else {
            return com.google.android.gms.internal.firebase-auth-api.zzalh.zza(((byte[]) p1));
        }
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzamg zza()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzamg.zza;
    }

    private final void zze()
    {
        if (!this.zzb) {
            throw new UnsupportedOperationException();
        } else {
            return;
        }
    }

    public final void clear()
    {
        this.zze();
        super.clear();
        return;
    }

    public final java.util.Set entrySet()
    {
        if (!this.isEmpty()) {
            return super.entrySet();
        } else {
            return java.util.Collections.EMPTY_SET;
        }
    }

    public final boolean equals(Object p7)
    {
        if ((p7 instanceof java.util.Map)) {
            int v7_1;
            if (this == ((java.util.Map) p7)) {
                v7_1 = 1;
            } else {
                if (this.size() == ((java.util.Map) p7).size()) {
                    java.util.Iterator v2_1 = this.entrySet().iterator();
                    while (v2_1.hasNext()) {
                        boolean v3_2 = ((java.util.Map$Entry) v2_1.next());
                        if (((java.util.Map) p7).containsKey(v3_2.getKey())) {
                            boolean v3_5;
                            byte[] v4_2 = v3_2.getValue();
                            boolean v3_4 = ((java.util.Map) p7).get(v3_2.getKey());
                            if ((!(v4_2 instanceof byte[])) || (!(v3_4 instanceof byte[]))) {
                                v3_5 = v4_2.equals(v3_4);
                            } else {
                                v3_5 = java.util.Arrays.equals(((byte[]) v4_2), ((byte[]) v3_4));
                            }
                            if (!v3_5) {
                            }
                        }
                    }
                }
                v7_1 = 0;
            }
            if (v7_1 != 0) {
                return 1;
            }
        }
        return 0;
    }

    public final int hashCode()
    {
        java.util.Iterator v0_1 = this.entrySet().iterator();
        int v1 = 0;
        while (v0_1.hasNext()) {
            int v2_1 = ((java.util.Map$Entry) v0_1.next());
            v1 += (com.google.android.gms.internal.firebase-auth-api.zzamg.zza(v2_1.getValue()) ^ com.google.android.gms.internal.firebase-auth-api.zzamg.zza(v2_1.getKey()));
        }
        return v1;
    }

    public final Object put(Object p1, Object p2)
    {
        this.zze();
        com.google.android.gms.internal.firebase-auth-api.zzalh.zza(p1);
        com.google.android.gms.internal.firebase-auth-api.zzalh.zza(p2);
        return super.put(p1, p2);
    }

    public final void putAll(java.util.Map p3)
    {
        this.zze();
        java.util.Iterator v0_1 = p3.keySet().iterator();
        while (v0_1.hasNext()) {
            Object v1_0 = v0_1.next();
            com.google.android.gms.internal.firebase-auth-api.zzalh.zza(v1_0);
            com.google.android.gms.internal.firebase-auth-api.zzalh.zza(p3.get(v1_0));
        }
        super.putAll(p3);
        return;
    }

    public final Object remove(Object p1)
    {
        this.zze();
        return super.remove(p1);
    }

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzamg p2)
    {
        this.zze();
        if (!p2.isEmpty()) {
            this.putAll(p2);
        }
        return;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzamg zzb()
    {
        if (!this.isEmpty()) {
            return new com.google.android.gms.internal.firebase-auth-api.zzamg(this);
        } else {
            return new com.google.android.gms.internal.firebase-auth-api.zzamg();
        }
    }

    public final void zzc()
    {
        this.zzb = 0;
        return;
    }

    public final boolean zzd()
    {
        return this.zzb;
    }
}
