package com.google.android.gms.internal.auth;
final class zzfg extends com.google.android.gms.internal.auth.zzfk {
    private static final Class zza;

    static zzfg()
    {
        com.google.android.gms.internal.auth.zzfg.zza = java.util.Collections.unmodifiableList(java.util.Collections.EMPTY_LIST).getClass();
        return;
    }

    private zzfg()
    {
        super(0);
        return;
    }

    public synthetic zzfg(com.google.android.gms.internal.auth.zzff p1)
    {
        super(0);
        return;
    }

    public final void zza(Object p4, long p5)
    {
        com.google.android.gms.internal.auth.zzey v0_1;
        com.google.android.gms.internal.auth.zzey v0_3 = ((java.util.List) com.google.android.gms.internal.auth.zzhi.zzf(p4, p5));
        if (!(v0_3 instanceof com.google.android.gms.internal.auth.zzfe)) {
            if (!com.google.android.gms.internal.auth.zzfg.zza.isAssignableFrom(v0_3.getClass())) {
                if ((!(v0_3 instanceof com.google.android.gms.internal.auth.zzgd)) || (!(v0_3 instanceof com.google.android.gms.internal.auth.zzey))) {
                    v0_1 = java.util.Collections.unmodifiableList(v0_3);
                    com.google.android.gms.internal.auth.zzhi.zzp(p4, p5, v0_1);
                    return;
                } else {
                    com.google.android.gms.internal.auth.zzey v0_2 = ((com.google.android.gms.internal.auth.zzey) v0_3);
                    if (v0_2.zzc()) {
                        v0_2.zzb();
                    }
                }
            }
            return;
        } else {
            v0_1 = ((com.google.android.gms.internal.auth.zzfe) v0_3).zze();
        }
        com.google.android.gms.internal.auth.zzhi.zzp(p4, p5, v0_1);
        return;
    }

    public final void zzb(Object p5, Object p6, long p7)
    {
        com.google.android.gms.internal.auth.zzey v6_2 = ((java.util.List) com.google.android.gms.internal.auth.zzhi.zzf(p6, p7));
        com.google.android.gms.internal.auth.zzey v0_0 = v6_2.size();
        com.google.android.gms.internal.auth.zzey v1_2 = ((java.util.List) com.google.android.gms.internal.auth.zzhi.zzf(p5, p7));
        if (!v1_2.isEmpty()) {
            com.google.android.gms.internal.auth.zzey v2_8;
            if (!com.google.android.gms.internal.auth.zzfg.zza.isAssignableFrom(v1_2.getClass())) {
                if (!(v1_2 instanceof com.google.android.gms.internal.auth.zzhd)) {
                    if ((!(v1_2 instanceof com.google.android.gms.internal.auth.zzgd)) || (!(v1_2 instanceof com.google.android.gms.internal.auth.zzey))) {
                        com.google.android.gms.internal.auth.zzey v0_3 = v1_2.size();
                        com.google.android.gms.internal.auth.zzey v2_13 = v6_2.size();
                        if ((v0_3 > null) && (v2_13 > null)) {
                            v1_2.addAll(v6_2);
                        }
                        if (v0_3 > null) {
                            v6_2 = v1_2;
                        }
                        com.google.android.gms.internal.auth.zzhi.zzp(p5, p7, v6_2);
                        return;
                    } else {
                        com.google.android.gms.internal.auth.zzey v2_6 = ((com.google.android.gms.internal.auth.zzey) v1_2);
                        if (v2_6.zzc()) {
                        } else {
                            v1_2 = v2_6.zzd((v1_2.size() + v0_0));
                            com.google.android.gms.internal.auth.zzhi.zzp(p5, p7, v1_2);
                        }
                    }
                } else {
                    v2_8 = new com.google.android.gms.internal.auth.zzfd((v1_2.size() + v0_0));
                    v2_8.addAll(v2_8.size(), ((com.google.android.gms.internal.auth.zzhd) v1_2));
                    com.google.android.gms.internal.auth.zzhi.zzp(p5, p7, v2_8);
                }
            } else {
                v2_8 = new java.util.ArrayList((v1_2.size() + v0_0));
                v2_8.addAll(v1_2);
                com.google.android.gms.internal.auth.zzhi.zzp(p5, p7, v2_8);
            }
            v1_2 = v2_8;
        } else {
            if (!(v1_2 instanceof com.google.android.gms.internal.auth.zzfe)) {
                if ((!(v1_2 instanceof com.google.android.gms.internal.auth.zzgd)) || (!(v1_2 instanceof com.google.android.gms.internal.auth.zzey))) {
                    v1_2 = new java.util.ArrayList(v0_0);
                } else {
                    v1_2 = ((com.google.android.gms.internal.auth.zzey) v1_2).zzd(v0_0);
                }
            } else {
                v1_2 = new com.google.android.gms.internal.auth.zzfd(v0_0);
            }
            com.google.android.gms.internal.auth.zzhi.zzp(p5, p7, v1_2);
        }
    }
}
