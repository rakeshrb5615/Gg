package com.google.android.recaptcha.internal;
public final class zzgt implements com.google.android.recaptcha.internal.zzgx {
    public static final com.google.android.recaptcha.internal.zzgt zza;

    static zzgt()
    {
        com.google.android.recaptcha.internal.zzgt.zza = new com.google.android.recaptcha.internal.zzgt();
        return;
    }

    private zzgt()
    {
        return;
    }

    public final varargs void zza(int p11, com.google.android.recaptcha.internal.zzgd p12, com.google.android.recaptcha.internal.zzue[] p13)
    {
        int v0_0 = p13.length;
        Object v3 = 0;
        if ((v0_0 != 4) && (v0_0 != 5)) {
            throw new com.google.android.recaptcha.internal.zzce(4, 3, 0);
        } else {
            int v5_1 = p12.zzc().zza(p13[0]);
            if (1 != (v5_1 instanceof Integer)) {
                v5_1 = 0;
            }
            int v5_2 = ((Integer) v5_1);
            if (v5_2 == 0) {
                throw new com.google.android.recaptcha.internal.zzce(4, 5, 0);
            } else {
                int v5_3 = v5_2.intValue();
                com.google.android.recaptcha.internal.zzga v6_4 = p12.zzc().zza(p13[1]);
                if (1 != (v6_4 instanceof Integer)) {
                    v6_4 = 0;
                }
                com.google.android.recaptcha.internal.zzga v6_5 = ((Integer) v6_4);
                if (v6_5 == null) {
                    throw new com.google.android.recaptcha.internal.zzce(4, 5, 0);
                } else {
                    com.google.android.recaptcha.internal.zzga v6_6 = v6_5.intValue();
                    String v8_3 = p12.zzc().zza(p13[2]);
                    if (1 != (v8_3 instanceof String)) {
                        v8_3 = 0;
                    }
                    String v8_4 = ((String) v8_3);
                    if (v8_4 == null) {
                        throw new com.google.android.recaptcha.internal.zzce(4, 5, 0);
                    } else {
                        String v8_5 = p12.zzh().zza(v8_4);
                        String v1_2 = p12.zzc().zza(p13[3]);
                        if (1 != (v1_2 instanceof String)) {
                            v1_2 = 0;
                        }
                        String v1_3 = ((String) v1_2);
                        if (v1_3 == null) {
                            throw new com.google.android.recaptcha.internal.zzce(4, 5, 0);
                        } else {
                            String v1_4 = p12.zzh().zza(v1_3);
                            if (v0_0 == 5) {
                                v3 = p12.zzc().zza(p13[4]);
                            }
                            int v13_4 = new com.google.android.recaptcha.internal.zzfz(v6_6);
                            try {
                                int v0_3 = com.google.android.recaptcha.internal.zzgc.zza(v8_5);
                                p12.zzc().zze(v5_3, reflect.Proxy.newProxyInstance(v0_3.getClassLoader(), new Class[] {v0_3}), new com.google.android.recaptcha.internal.zzga(v13_4, v1_4, v3)));
                                p12.zzc().zze(p11, v13_4);
                                return;
                            } catch (Exception v11_1) {
                                throw new com.google.android.recaptcha.internal.zzce(6, 20, v11_1);
                            }
                        }
                    }
                }
            }
        }
    }
}
