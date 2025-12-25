package com.google.android.recaptcha.internal;
public final class zzgk implements com.google.android.recaptcha.internal.zzgx {
    public static final com.google.android.recaptcha.internal.zzgk zza;

    static zzgk()
    {
        com.google.android.recaptcha.internal.zzgk.zza = new com.google.android.recaptcha.internal.zzgk();
        return;
    }

    private zzgk()
    {
        return;
    }

    public final varargs void zza(int p11, com.google.android.recaptcha.internal.zzgd p12, com.google.android.recaptcha.internal.zzue[] p13)
    {
        int v0_0 = p13.length;
        if (v0_0 == 0) {
            throw new com.google.android.recaptcha.internal.zzce(4, 3, 0);
        } else {
            com.google.android.recaptcha.internal.zztf v3 = com.google.android.recaptcha.internal.zzti.zzf();
            int v5 = 0;
            while (v5 < v0_0) {
                String v6_3 = p12.zzc().zza(p13[v5]);
                if (v6_3 == null) {
                    throw new com.google.android.recaptcha.internal.zzce(4, 4, 0);
                } else {
                    com.google.android.recaptcha.internal.zztg v7_1 = com.google.android.recaptcha.internal.zzth.zzf();
                    if (!(v6_3 instanceof Integer)) {
                        if (!(v6_3 instanceof Short)) {
                            if (!(v6_3 instanceof Byte)) {
                                if (!(v6_3 instanceof Long)) {
                                    if (!(v6_3 instanceof Double)) {
                                        if (!(v6_3 instanceof Float)) {
                                            if (!(v6_3 instanceof Boolean)) {
                                                if (!(v6_3 instanceof Character)) {
                                                    if (!(v6_3 instanceof String)) {
                                                        v7_1.zzw(v6_3.toString());
                                                    } else {
                                                        v7_1.zzw(((String) v6_3));
                                                    }
                                                } else {
                                                    v7_1.zzq(String.valueOf(((Character) v6_3).charValue()));
                                                }
                                            } else {
                                                v7_1.zze(((Boolean) v6_3).booleanValue());
                                            }
                                        } else {
                                            v7_1.zzs(((Number) v6_3).floatValue());
                                        }
                                    } else {
                                        v7_1.zzr(((Number) v6_3).doubleValue());
                                    }
                                } else {
                                    v7_1.zzv(((Number) v6_3).longValue());
                                }
                            } else {
                                byte[] v9 = new byte[1];
                                v9[0] = ((Number) v6_3).byteValue();
                                v7_1.zzf(com.google.android.recaptcha.internal.zzle.zzk(v9, 0, 1));
                            }
                        } else {
                            v7_1.zzt(((Number) v6_3).shortValue());
                        }
                    } else {
                        v7_1.zzu(((Number) v6_3).intValue());
                    }
                    v3.zzf(((com.google.android.recaptcha.internal.zzth) v7_1.zzi()));
                    v5++;
                }
            }
            com.google.android.recaptcha.internal.zzge v12_1 = p12.zzc();
            String v13_3 = ((com.google.android.recaptcha.internal.zzti) v3.zzi()).zzd();
            v12_1.zze(p11, com.google.android.recaptcha.internal.zzkh.zzh().zzi(v13_3, 0, v13_3.length));
            return;
        }
    }
}
