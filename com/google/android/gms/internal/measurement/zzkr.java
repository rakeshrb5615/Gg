package com.google.android.gms.internal.measurement;
public abstract class zzkr implements com.google.android.gms.internal.measurement.zznl {

    public zzkr()
    {
        return;
    }

    private static void zza(java.util.List p3, int p4)
    {
        String v0_3 = (p3.size() - p4);
        StringBuilder v2_1 = new StringBuilder((String.valueOf(v0_3).length() + 26));
        v2_1.append("Element at index ");
        v2_1.append(v0_3);
        v2_1.append(" is null.");
        String v0_2 = v2_1.toString();
        int v1_1 = p3.size();
        while(true) {
            v1_1--;
            if (v1_1 < p4) {
                break;
            }
            p3.remove(v1_1);
        }
        throw new NullPointerException(v0_2);
    }

    public static void zzaU(Iterable p4, java.util.List p5)
    {
        Class vtmp1 = p4.getClass();
        int v1_1 = 0;
        if (!(p4 instanceof com.google.android.gms.internal.measurement.zzmx)) {
            if ((p4 instanceof com.google.android.gms.internal.measurement.zznt)) {
                p5.addAll(((java.util.Collection) p4));
                return;
            } else {
                if ((p4 instanceof java.util.Collection)) {
                    int v0_3 = ((java.util.Collection) p4).size();
                    if (!(p5 instanceof java.util.ArrayList)) {
                        if ((p5 instanceof com.google.android.gms.internal.measurement.zznv)) {
                            ((com.google.android.gms.internal.measurement.zznv) p5).zze((p5.size() + v0_3));
                        }
                    } else {
                        ((java.util.ArrayList) p5).ensureCapacity((p5.size() + v0_3));
                    }
                }
                int v0_5 = p5.size();
                if ((!(p4 instanceof java.util.List)) || (!(p4 instanceof java.util.RandomAccess))) {
                    java.util.List v4_2 = p4.iterator();
                    while (v4_2.hasNext()) {
                        int v1_3 = v4_2.next();
                        if (v1_3 == 0) {
                            com.google.android.gms.internal.measurement.zzkr.zza(p5, v0_5);
                        }
                        p5.add(v1_3);
                    }
                } else {
                    String v2_8 = ((java.util.List) p4).size();
                    while (v1_1 < v2_8) {
                        Object v3_4 = ((java.util.List) p4).get(v1_1);
                        if (v3_4 == null) {
                            com.google.android.gms.internal.measurement.zzkr.zza(p5, v0_5);
                        }
                        p5.add(v3_4);
                        v1_1++;
                    }
                }
            }
        } else {
            java.util.List v4_5 = ((com.google.android.gms.internal.measurement.zzmx) p4).zza();
            NullPointerException v5_3 = p5.size();
            java.util.List v4_6 = v4_5.iterator();
            while (v4_6.hasNext()) {
                String v2_10 = v4_6.next();
                if (v2_10 != null) {
                    if (!(v2_10 instanceof com.google.android.gms.internal.measurement.zzlh)) {
                        if (!(v2_10 instanceof byte[])) {
                            ((com.google.android.gms.internal.measurement.zzmx) p5).add(((String) v2_10));
                        } else {
                            String v2_12 = ((byte[]) v2_10);
                            com.google.android.gms.internal.measurement.zzlh.zzh(v2_12, 0, v2_12.length);
                            ((com.google.android.gms.internal.measurement.zzmx) p5).zzb();
                        }
                    } else {
                        ((com.google.android.gms.internal.measurement.zzmx) p5).zzb();
                    }
                } else {
                    java.util.List v4_9 = (((com.google.android.gms.internal.measurement.zzmx) p5).size() - v5_3);
                    String v2_14 = new StringBuilder((String.valueOf(v4_9).length() + 26));
                    v2_14.append("Element at index ");
                    v2_14.append(v4_9);
                    v2_14.append(" is null.");
                    java.util.List v4_1 = v2_14.toString();
                    int v1_0 = ((com.google.android.gms.internal.measurement.zzmx) p5).size();
                    while(true) {
                        v1_0--;
                        if (v1_0 < v5_3) {
                            break;
                        }
                        ((com.google.android.gms.internal.measurement.zzmx) p5).remove(v1_0);
                    }
                    throw new NullPointerException(v4_1);
                }
            }
        }
        return;
    }

    public bridge synthetic Object clone()
    {
        return this.zzaR();
    }

    public abstract com.google.android.gms.internal.measurement.zzkr zzaR();

    public com.google.android.gms.internal.measurement.zzkr zzaS(byte[] p1, int p2, int p3)
    {
        throw 0;
    }

    public com.google.android.gms.internal.measurement.zzkr zzaT(byte[] p1, int p2, int p3, com.google.android.gms.internal.measurement.zzlr p4)
    {
        throw 0;
    }

    public final synthetic com.google.android.gms.internal.measurement.zznl zzaV(byte[] p3, com.google.android.gms.internal.measurement.zzlr p4)
    {
        return this.zzaT(p3, 0, p3.length, p4);
    }

    public final synthetic com.google.android.gms.internal.measurement.zznl zzaW(byte[] p3)
    {
        return this.zzaS(p3, 0, p3.length);
    }
}
