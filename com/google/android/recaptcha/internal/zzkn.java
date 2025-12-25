package com.google.android.recaptcha.internal;
public abstract class zzkn implements com.google.android.recaptcha.internal.zzoh {

    public zzkn()
    {
        return;
    }

    public static void zzd(Iterable p4, java.util.List p5)
    {
        Class vtmp1 = p4.getClass();
        int v1_0 = 0;
        if (!(p4 instanceof com.google.android.recaptcha.internal.zznu)) {
            if ((p4 instanceof com.google.android.recaptcha.internal.zzor)) {
                p5.addAll(((java.util.Collection) p4));
                return;
            } else {
                if ((p4 instanceof java.util.Collection)) {
                    int v0_3 = ((java.util.Collection) p4).size();
                    if ((p5 instanceof java.util.ArrayList)) {
                        ((java.util.ArrayList) p5).ensureCapacity((p5.size() + v0_3));
                    }
                    if ((p5 instanceof com.google.android.recaptcha.internal.zzot)) {
                        ((com.google.android.recaptcha.internal.zzot) p5).zzf((p5.size() + v0_3));
                    }
                }
                int v0_5 = p5.size();
                if ((!(p4 instanceof java.util.List)) || (!(p4 instanceof java.util.RandomAccess))) {
                    java.util.List v4_1 = p4.iterator();
                    while (v4_1.hasNext()) {
                        int v1_2 = v4_1.next();
                        if (v1_2 == 0) {
                            com.google.android.recaptcha.internal.zzkn.zze(p5, v0_5);
                        }
                        p5.add(v1_2);
                    }
                } else {
                    String v2_8 = ((java.util.List) p4).size();
                    while (v1_0 < v2_8) {
                        Object v3_4 = ((java.util.List) p4).get(v1_0);
                        if (v3_4 == null) {
                            com.google.android.recaptcha.internal.zzkn.zze(p5, v0_5);
                        }
                        p5.add(v3_4);
                        v1_0++;
                    }
                }
            }
        } else {
            java.util.List v4_4 = ((com.google.android.recaptcha.internal.zznu) p4).zza();
            NullPointerException v5_1 = p5.size();
            java.util.List v4_5 = v4_4.iterator();
            while (v4_5.hasNext()) {
                String v2_10 = v4_5.next();
                if (v2_10 != null) {
                    if (!(v2_10 instanceof com.google.android.recaptcha.internal.zzle)) {
                        if (!(v2_10 instanceof byte[])) {
                            ((com.google.android.recaptcha.internal.zznu) p5).add(((String) v2_10));
                        } else {
                            String v2_12 = ((byte[]) v2_10);
                            com.google.android.recaptcha.internal.zzle.zzk(v2_12, 0, v2_12.length);
                            ((com.google.android.recaptcha.internal.zznu) p5).zzb();
                        }
                    } else {
                        ((com.google.android.recaptcha.internal.zznu) p5).zzb();
                    }
                } else {
                    java.util.List v4_9 = v1.a.j("Element at index ", (((com.google.android.recaptcha.internal.zznu) p5).size() - v5_1), " is null.");
                    int v1_4 = ((com.google.android.recaptcha.internal.zznu) p5).size();
                    while(true) {
                        v1_4--;
                        if (v1_4 < v5_1) {
                            break;
                        }
                        ((com.google.android.recaptcha.internal.zznu) p5).remove(v1_4);
                    }
                    throw new NullPointerException(v4_9);
                }
            }
        }
        return;
    }

    private static void zze(java.util.List p3, int p4)
    {
        String v0_2 = v1.a.j("Element at index ", (p3.size() - p4), " is null.");
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

    public bridge synthetic Object clone()
    {
        return this.zza();
    }

    public abstract com.google.android.recaptcha.internal.zzkn zza();

    public abstract com.google.android.recaptcha.internal.zzkn zzb();

    public final bridge synthetic com.google.android.recaptcha.internal.zzoh zzc(com.google.android.recaptcha.internal.zzoi p2)
    {
        if (!this.zzm().getClass().isInstance(p2)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        } else {
            return this.zzb(((com.google.android.recaptcha.internal.zzko) p2));
        }
    }
}
