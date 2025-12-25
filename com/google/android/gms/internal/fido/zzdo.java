package com.google.android.gms.internal.fido;
public final class zzdo extends com.google.android.gms.internal.fido.zzdr {
    private final int zza;
    private final com.google.android.gms.internal.fido.zzbg zzb;

    public zzdo(com.google.android.gms.internal.fido.zzbg p4)
    {
        p4.getClass();
        this.zzb = p4;
        com.google.android.gms.internal.fido.zzdh v4_5 = p4.zzc().zzd();
        int v0_2 = 0;
        while (v4_5.hasNext()) {
            int v1_1 = ((java.util.Map$Entry) v4_5.next());
            int v2_2 = ((com.google.android.gms.internal.fido.zzdr) v1_1.getKey()).zzb();
            if (v0_2 < v2_2) {
                v0_2 = v2_2;
            }
            int v1_4 = ((com.google.android.gms.internal.fido.zzdr) v1_1.getValue()).zzb();
            if (v0_2 < v1_4) {
                v0_2 = v1_4;
            }
        }
        int v0_0 = (v0_2 + 1);
        this.zza = v0_0;
        if (v0_0 > 4) {
            throw new com.google.android.gms.internal.fido.zzdh("Exceeded cutoff limit for max depth of cbor value");
        } else {
            return;
        }
    }

    public final bridge synthetic int compareTo(Object p6)
    {
        int v6_7;
        com.google.android.gms.internal.fido.zzcb v0_6;
        if (com.google.android.gms.internal.fido.zzdr.zzd(-96) == ((com.google.android.gms.internal.fido.zzdr) p6).zza()) {
            if (this.zzb.size() == ((com.google.android.gms.internal.fido.zzdo) ((com.google.android.gms.internal.fido.zzdr) p6)).zzb.size()) {
                com.google.android.gms.internal.fido.zzcb v0_3 = this.zzb.zzc().zzd();
                int v6_4 = ((com.google.android.gms.internal.fido.zzdo) ((com.google.android.gms.internal.fido.zzdr) p6)).zzb.zzc().zzd();
                while ((v0_3.hasNext()) || (v6_4.hasNext())) {
                    int v1_6 = ((java.util.Map$Entry) v0_3.next());
                    com.google.android.gms.internal.fido.zzdr v2_1 = ((java.util.Map$Entry) v6_4.next());
                    int v3_2 = ((com.google.android.gms.internal.fido.zzdr) v1_6.getKey()).compareTo(((com.google.android.gms.internal.fido.zzdr) v2_1.getKey()));
                    if (v3_2 == 0) {
                        int v1_9 = ((com.google.android.gms.internal.fido.zzdr) v1_6.getValue()).compareTo(((com.google.android.gms.internal.fido.zzdr) v2_1.getValue()));
                        if (v1_9 != 0) {
                            return v1_9;
                        }
                    } else {
                        return v3_2;
                    }
                }
                return 0;
            } else {
                v0_6 = this.zzb.size();
                v6_7 = ((com.google.android.gms.internal.fido.zzdo) ((com.google.android.gms.internal.fido.zzdr) p6)).zzb.size();
            }
        } else {
            v6_7 = ((com.google.android.gms.internal.fido.zzdr) p6).zza();
            v0_6 = com.google.android.gms.internal.fido.zzdr.zzd(-96);
        }
        return (v0_6 - v6_7);
    }

    public final boolean equals(Object p4)
    {
        if (this != p4) {
            if (p4) {
                if (com.google.android.gms.internal.fido.zzdo == p4.getClass()) {
                    return this.zzb.equals(((com.google.android.gms.internal.fido.zzdo) p4).zzb);
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
        return java.util.Arrays.hashCode(new Object[] {Integer.valueOf(com.google.android.gms.internal.fido.zzdr.zzd(-96)), this.zzb}));
    }

    public final String toString()
    {
        if (!this.zzb.isEmpty()) {
            java.io.IOException v0_8 = new java.util.LinkedHashMap();
            AssertionError v1_0 = this.zzb.zzc().zzd();
            while (v1_0.hasNext()) {
                StringBuilder v2_4 = ((java.util.Map$Entry) v1_0.next());
                v0_8.put(((com.google.android.gms.internal.fido.zzdr) v2_4.getKey()).toString().replace("\n", "\n  "), ((com.google.android.gms.internal.fido.zzdr) v2_4.getValue()).toString().replace("\n", "\n  "));
            }
            AssertionError v1_2 = com.google.android.gms.internal.fido.zzag.zza(",\n  ");
            StringBuilder v2_2 = new StringBuilder("{\n  ");
            try {
                com.google.android.gms.internal.fido.zzaf.zza(v2_2, v0_8.entrySet().iterator(), v1_2, " : ");
                v2_2.append("\n}");
                return v2_2.toString();
            } catch (java.io.IOException v0_6) {
                throw new AssertionError(v0_6);
            }
        } else {
            return "{}";
        }
    }

    public final int zza()
    {
        return com.google.android.gms.internal.fido.zzdr.zzd(-96);
    }

    public final int zzb()
    {
        return this.zza;
    }

    public final com.google.android.gms.internal.fido.zzbg zzc()
    {
        return this.zzb;
    }
}
