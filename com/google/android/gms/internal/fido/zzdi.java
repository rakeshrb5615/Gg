package com.google.android.gms.internal.fido;
public final class zzdi extends com.google.android.gms.internal.fido.zzdr {
    private final com.google.android.gms.internal.fido.zzaz zza;
    private final int zzb;

    public zzdi(com.google.android.gms.internal.fido.zzaz p4)
    {
        p4.getClass();
        this.zza = p4;
        com.google.android.gms.internal.fido.zzdh v4_4 = 0;
        String v0_1 = 0;
        while(true) {
            int v1_3 = this.zza;
            if (v4_4 >= v1_3.size()) {
                break;
            }
            int v1_2 = ((com.google.android.gms.internal.fido.zzdr) v1_3.get(v4_4)).zzb();
            if (v0_1 < v1_2) {
                v0_1 = v1_2;
            }
            v4_4++;
        }
        String v0_2 = (v0_1 + 1);
        this.zzb = v0_2;
        if (v0_2 > 4) {
            throw new com.google.android.gms.internal.fido.zzdh("Exceeded cutoff limit for max depth of cbor value");
        } else {
            return;
        }
    }

    public final bridge synthetic int compareTo(Object p5)
    {
        if (com.google.android.gms.internal.fido.zzdr.zzd(-128) == ((com.google.android.gms.internal.fido.zzdr) p5).zza()) {
            int v0_5 = this.zza;
            int v2_0 = ((com.google.android.gms.internal.fido.zzdi) ((com.google.android.gms.internal.fido.zzdr) p5)).zza;
            if (v0_5.size() == v2_0.size()) {
                int v1_1 = 0;
                while(true) {
                    int v2_1 = this.zza;
                    if (v1_1 >= v2_1.size()) {
                        return 0;
                    } else {
                        int v2_4 = ((com.google.android.gms.internal.fido.zzdr) v2_1.get(v1_1)).compareTo(((com.google.android.gms.internal.fido.zzdr) ((com.google.android.gms.internal.fido.zzdi) ((com.google.android.gms.internal.fido.zzdr) p5)).zza.get(v1_1)));
                        if (v2_4 != 0) {
                            break;
                        }
                        v1_1++;
                    }
                }
                return v2_4;
            } else {
                return (v0_5.size() - v2_0.size());
            }
        } else {
            return (com.google.android.gms.internal.fido.zzdr.zzd(-128) - ((com.google.android.gms.internal.fido.zzdr) p5).zza());
        }
    }

    public final boolean equals(Object p4)
    {
        if (this != p4) {
            if (p4) {
                if (com.google.android.gms.internal.fido.zzdi == p4.getClass()) {
                    return this.zza.equals(((com.google.android.gms.internal.fido.zzdi) p4).zza);
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
        return java.util.Arrays.hashCode(new Object[] {Integer.valueOf(com.google.android.gms.internal.fido.zzdr.zzd(-128)), this.zza}));
    }

    public final String toString()
    {
        if (!this.zza.isEmpty()) {
            java.io.IOException v0_8 = new java.util.ArrayList();
            AssertionError v1_4 = this.zza;
            StringBuilder v2_2 = v1_4.size();
            String v3_1 = 0;
            while (v3_1 < v2_2) {
                v0_8.add(((com.google.android.gms.internal.fido.zzdr) v1_4.get(v3_1)).toString().replace("\n", "\n  "));
                v3_1++;
            }
            AssertionError v1_1 = com.google.android.gms.internal.fido.zzag.zza(",\n  ");
            StringBuilder v2_1 = new StringBuilder("[\n  ");
            try {
                v1_1.zzb(v2_1, v0_8.iterator());
                v2_1.append("\n]");
                return v2_1.toString();
            } catch (java.io.IOException v0_5) {
                throw new AssertionError(v0_5);
            }
        } else {
            return "[]";
        }
    }

    public final int zza()
    {
        return com.google.android.gms.internal.fido.zzdr.zzd(-128);
    }

    public final int zzb()
    {
        return this.zzb;
    }
}
