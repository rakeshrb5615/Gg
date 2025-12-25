package com.google.android.recaptcha.internal;
public final class zzgs implements com.google.android.recaptcha.internal.zzgx {
    public static final com.google.android.recaptcha.internal.zzgs zza;

    static zzgs()
    {
        com.google.android.recaptcha.internal.zzgs.zza = new com.google.android.recaptcha.internal.zzgs();
        return;
    }

    private zzgs()
    {
        return;
    }

    public final varargs void zza(int p11, com.google.android.recaptcha.internal.zzgd p12, com.google.android.recaptcha.internal.zzue[] p13)
    {
        int v0_0 = p13.length;
        if ((v0_0 != 4) && (v0_0 != 5)) {
            throw new com.google.android.recaptcha.internal.zzce(4, 3, 0);
        } else {
            String v5_1 = p12.zzc().zza(p13[0]);
            if (1 != (v5_1 instanceof String)) {
                v5_1 = 0;
            }
            String v5_2 = ((String) v5_1);
            if (v5_2 == null) {
                throw new com.google.android.recaptcha.internal.zzce(4, 5, 0);
            } else {
                String v6_4 = p12.zzc().zza(p13[1]);
                if (1 != java.util.Objects.nonNull(v6_4)) {
                    v6_4 = 0;
                }
                if (v6_4 == null) {
                    throw new com.google.android.recaptcha.internal.zzce(4, 5, 0);
                } else {
                    String v8_3 = p12.zzc().zza(p13[2]);
                    if (1 != (v8_3 instanceof String)) {
                        v8_3 = 0;
                    }
                    String v8_4 = ((String) v8_3);
                    if (v8_4 == null) {
                        throw new com.google.android.recaptcha.internal.zzce(4, 5, 0);
                    } else {
                        int v13_2;
                        String v8_5 = p12.zzh().zza(v8_4);
                        Object v1_2 = p12.zzc().zza(p13[3]);
                        if (v0_0 != 5) {
                            v13_2 = -1;
                        } else {
                            int v13_4 = p12.zzc().zza(p13[4]);
                            if (1 != (v13_4 instanceof Integer)) {
                                v13_4 = 0;
                            }
                            int v13_5 = ((Integer) v13_4);
                            if (v13_5 == 0) {
                                throw new com.google.android.recaptcha.internal.zzce(4, 5, 0);
                            } else {
                                v13_2 = v13_5.intValue();
                            }
                        }
                        if ((v6_4 instanceof String)) {
                            v6_4 = p12.zzh().zza(((String) v6_4));
                        }
                        int v0_6 = com.google.android.recaptcha.internal.zzgc.zza(v6_4);
                        p12.zzc().zze(p11, reflect.Proxy.newProxyInstance(v0_6.getClassLoader(), new Class[] {v0_6}), new com.google.android.recaptcha.internal.zzfy(new com.google.android.recaptcha.internal.zzgr(p12, v5_2, v13_2), v8_5, v1_2)));
                        return;
                    }
                }
            }
        }
    }
}
