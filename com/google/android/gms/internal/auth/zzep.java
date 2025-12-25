package com.google.android.gms.internal.auth;
final class zzep {
    private static final com.google.android.gms.internal.auth.zzep zzb;
    final com.google.android.gms.internal.auth.zzgu zza;
    private boolean zzc;
    private boolean zzd;

    static zzep()
    {
        com.google.android.gms.internal.auth.zzep.zzb = new com.google.android.gms.internal.auth.zzep(1);
        return;
    }

    private zzep()
    {
        this.zza = new com.google.android.gms.internal.auth.zzgk(16);
        return;
    }

    private zzep(boolean p2)
    {
        com.google.android.gms.internal.auth.zzgk v2_1 = new com.google.android.gms.internal.auth.zzgk(0);
        this.zza = v2_1;
        this.zzb();
        this.zzb();
        return;
    }

    public static com.google.android.gms.internal.auth.zzep zza()
    {
        throw 0;
    }

    private static final void zzd(com.google.android.gms.internal.auth.zzeo p2, Object p3)
    {
        boolean v0_7;
        boolean v0_0 = p2.zzb();
        com.google.android.gms.internal.auth.zzez.zze(p3);
        Integer v1 = com.google.android.gms.internal.auth.zzho.zza;
        switch (v0_0.zza().ordinal()) {
            case 0:
                v0_7 = (p3 instanceof Integer);
                if (!v0_7) {
                } else {
                    return;
                }
            case 1:
                v0_7 = (p3 instanceof Long);
                break;
            case 2:
                v0_7 = (p3 instanceof Float);
                break;
            case 3:
                v0_7 = (p3 instanceof Double);
                break;
            case 4:
                v0_7 = (p3 instanceof Boolean);
                break;
            case 5:
                v0_7 = (p3 instanceof String);
                break;
            case 6:
                if ((!(p3 instanceof com.google.android.gms.internal.auth.zzee)) && (!(p3 instanceof byte[]))) {
                } else {
                    return;
                }
            case 7:
                if ((!(p3 instanceof Integer)) && (!(p3 instanceof com.google.android.gms.internal.auth.zzew))) {
                } else {
                    return;
                }
            case 8:
                if ((!(p3 instanceof com.google.android.gms.internal.auth.zzfw)) && (!(p3 instanceof com.google.android.gms.internal.auth.zzfb))) {
                } else {
                    return;
                }
            default:
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[] {Integer.valueOf(p2.zza()), p2.zzb().zza(), p3.getClass().getName()})));
    }

    public final bridge synthetic Object clone()
    {
        com.google.android.gms.internal.auth.zzep v0_1 = new com.google.android.gms.internal.auth.zzep();
        boolean v1_2 = 0;
        while (v1_2 < this.zza.zzb()) {
            Object v2_5 = this.zza.zzg(v1_2);
            v0_1.zzc(((com.google.android.gms.internal.auth.zzeo) v2_5.getKey()), v2_5.getValue());
            v1_2++;
        }
        boolean v1_0 = this.zza.zzc().iterator();
        while (v1_0.hasNext()) {
            Object v2_2 = ((java.util.Map$Entry) v1_0.next());
            v0_1.zzc(((com.google.android.gms.internal.auth.zzeo) v2_2.getKey()), v2_2.getValue());
        }
        v0_1.zzd = this.zzd;
        return v0_1;
    }

    public final boolean equals(Object p2)
    {
        if (this != p2) {
            if ((p2 instanceof com.google.android.gms.internal.auth.zzep)) {
                return this.zza.equals(((com.google.android.gms.internal.auth.zzep) p2).zza);
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        return this.zza.hashCode();
    }

    public final void zzb()
    {
        if (!this.zzc) {
            this.zza.zza();
            this.zzc = 1;
            return;
        } else {
            return;
        }
    }

    public final void zzc(com.google.android.gms.internal.auth.zzeo p4, Object p5)
    {
        if (!p4.zzc()) {
            com.google.android.gms.internal.auth.zzep.zzd(p4, p5);
        } else {
            if (!(p5 instanceof java.util.List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            } else {
                com.google.android.gms.internal.auth.zzgu v0_2 = new java.util.ArrayList();
                v0_2.addAll(((java.util.List) p5));
                com.google.android.gms.internal.auth.zzgu v5_2 = v0_2.size();
                int v1 = 0;
                while (v1 < v5_2) {
                    com.google.android.gms.internal.auth.zzep.zzd(p4, v0_2.get(v1));
                    v1++;
                }
                p5 = v0_2;
            }
        }
        if ((p5 instanceof com.google.android.gms.internal.auth.zzfb)) {
            this.zzd = 1;
        }
        this.zza.zze(p4, p5);
        return;
    }
}
