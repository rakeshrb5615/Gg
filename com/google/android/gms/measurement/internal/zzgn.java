package com.google.android.gms.measurement.internal;
public final class zzgn {
    protected static final java.util.concurrent.atomic.AtomicReference zza;
    protected static final java.util.concurrent.atomic.AtomicReference zzb;
    protected static final java.util.concurrent.atomic.AtomicReference zzc;
    private final com.google.android.gms.measurement.internal.zzgm zzd;

    static zzgn()
    {
        com.google.android.gms.measurement.internal.zzgn.zza = new java.util.concurrent.atomic.AtomicReference();
        com.google.android.gms.measurement.internal.zzgn.zzb = new java.util.concurrent.atomic.AtomicReference();
        com.google.android.gms.measurement.internal.zzgn.zzc = new java.util.concurrent.atomic.AtomicReference();
        return;
    }

    public zzgn(com.google.android.gms.measurement.internal.zzgm p1)
    {
        this.zzd = p1;
        return;
    }

    private static final String zzg(String p3, String[] p4, String[] p5, java.util.concurrent.atomic.AtomicReference p6)
    {
        String v0_7;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p5);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p6);
        int v2 = 0;
        if (p4.length != p5.length) {
            v0_7 = 0;
        } else {
            v0_7 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(v0_7);
        while (v2 < p4.length) {
            if (!java.util.Objects.equals(p3, p4[v2])) {
                v2++;
            } else {
                String[] v3_2 = ((String[]) p6.get());
                if (v3_2 == null) {
                    v3_2 = new String[p5.length];
                    p6.set(v3_2);
                }
                String v0_3 = v3_2[v2];
                if (v0_3 == null) {
                    String v0_5 = new StringBuilder();
                    v0_5.append(p5[v2]);
                    v0_5.append("(");
                    v0_5.append(p4[v2]);
                    v0_5.append(")");
                    v0_3 = v0_5.toString();
                    v3_2[v2] = v0_3;
                }
                return v0_3;
            }
        }
        return p3;
    }

    public final String zza(String p4)
    {
        if (p4 != null) {
            if (this.zzd.zza()) {
                return com.google.android.gms.measurement.internal.zzgn.zzg(p4, com.google.android.gms.measurement.internal.zzjm.zzc, com.google.android.gms.measurement.internal.zzjm.zza, com.google.android.gms.measurement.internal.zzgn.zza);
            } else {
                return p4;
            }
        } else {
            return 0;
        }
    }

    public final String zzb(String p4)
    {
        if (p4 != null) {
            if (this.zzd.zza()) {
                return com.google.android.gms.measurement.internal.zzgn.zzg(p4, com.google.android.gms.measurement.internal.zzjn.zzb, com.google.android.gms.measurement.internal.zzjn.zza, com.google.android.gms.measurement.internal.zzgn.zzb);
            } else {
                return p4;
            }
        } else {
            return 0;
        }
    }

    public final String zzc(String p4)
    {
        if (p4 != null) {
            if (this.zzd.zza()) {
                if (!p4.startsWith("_exp_")) {
                    return com.google.android.gms.measurement.internal.zzgn.zzg(p4, com.google.android.gms.measurement.internal.zzjo.zzb, com.google.android.gms.measurement.internal.zzjo.zza, com.google.android.gms.measurement.internal.zzgn.zzc);
                } else {
                    return v1.a.l("experiment_id(", p4, ")");
                }
            } else {
                return p4;
            }
        } else {
            return 0;
        }
    }

    public final String zzd(com.google.android.gms.measurement.internal.zzbg p4)
    {
        boolean v0_0 = this.zzd;
        if (v0_0.zza()) {
            String v4_3;
            StringBuilder v1_2 = new StringBuilder("origin=");
            v1_2.append(p4.zzc);
            v1_2.append(",name=");
            v1_2.append(this.zza(p4.zza));
            v1_2.append(",params=");
            String v4_1 = p4.zzb;
            if (v4_1 != null) {
                if (v0_0.zza()) {
                    v4_3 = this.zze(v4_1.zzf());
                } else {
                    v4_3 = v4_1.toString();
                }
            } else {
                v4_3 = 0;
            }
            v1_2.append(v4_3);
            return v1_2.toString();
        } else {
            return p4.toString();
        }
    }

    public final String zze(android.os.Bundle p6)
    {
        if (p6 != null) {
            if (this.zzd.zza()) {
                StringBuilder v0_3 = u.e.b("Bundle[{");
                java.util.Iterator v1_0 = p6.keySet().iterator();
                while (v1_0.hasNext()) {
                    String v2_2 = ((String) v1_0.next());
                    if (v0_3.length() != 8) {
                        v0_3.append(", ");
                    }
                    String v2_4;
                    v0_3.append(this.zzb(v2_2));
                    v0_3.append("=");
                    String v2_3 = p6.get(v2_2);
                    if (!(v2_3 instanceof android.os.Bundle)) {
                        if (!(v2_3 instanceof Object[])) {
                            if (!(v2_3 instanceof java.util.ArrayList)) {
                                v2_4 = String.valueOf(v2_3);
                            } else {
                                v2_4 = this.zzf(((java.util.ArrayList) v2_3).toArray());
                            }
                        } else {
                            v2_4 = this.zzf(((Object[]) v2_3));
                        }
                    } else {
                        v2_4 = this.zzf(new Object[] {v2_3}));
                    }
                    v0_3.append(v2_4);
                }
                v0_3.append("}]");
                return v0_3.toString();
            } else {
                return p6.toString();
            }
        } else {
            return 0;
        }
    }

    public final String zzf(Object[] p6)
    {
        if (p6 != null) {
            StringBuilder v0_1 = u.e.b("[");
            int v1 = 0;
            while (v1 < p6.length) {
                String v2_1;
                String v2_0 = p6[v1];
                if (!(v2_0 instanceof android.os.Bundle)) {
                    v2_1 = String.valueOf(v2_0);
                } else {
                    v2_1 = this.zze(((android.os.Bundle) v2_0));
                }
                if (v2_1 != null) {
                    if (v0_1.length() != 1) {
                        v0_1.append(", ");
                    }
                    v0_1.append(v2_1);
                }
                v1++;
            }
            v0_1.append("]");
            return v0_1.toString();
        } else {
            return "[]";
        }
    }
}
