package com.google.android.recaptcha.internal;
public final class zzgi implements com.google.android.recaptcha.internal.zzgx {
    public static final com.google.android.recaptcha.internal.zzgi zza;

    static zzgi()
    {
        com.google.android.recaptcha.internal.zzgi.zza = new com.google.android.recaptcha.internal.zzgi();
        return;
    }

    private zzgi()
    {
        return;
    }

    public final varargs void zza(int p7, com.google.android.recaptcha.internal.zzgd p8, com.google.android.recaptcha.internal.zzue[] p9)
    {
        if (p9.length != 3) {
            throw new com.google.android.recaptcha.internal.zzce(4, 3, 0);
        } else {
            Exception v7_1 = p8.zzc().zza(p9[0]);
            if (1 != java.util.Objects.nonNull(v7_1)) {
                v7_1 = 0;
            }
            if (v7_1 == null) {
                throw new com.google.android.recaptcha.internal.zzce(4, 5, 0);
            } else {
                int v4_1 = p8.zzc().zza(p9[1]);
                if (1 != (v4_1 instanceof Integer)) {
                    v4_1 = 0;
                }
                int v4_2 = ((Integer) v4_1);
                if (v4_2 == 0) {
                    throw new com.google.android.recaptcha.internal.zzce(4, 5, 0);
                } else {
                    int v4_3 = v4_2.intValue();
                    com.google.android.recaptcha.internal.zzce v8_2 = p8.zzc().zza(p9[2]);
                    if (1 != java.util.Objects.nonNull(v8_2)) {
                        v8_2 = 0;
                    }
                    if (v8_2 == null) {
                        throw new com.google.android.recaptcha.internal.zzce(4, 5, 0);
                    } else {
                        try {
                            reflect.Array.set(v7_1, v4_3, v8_2);
                            return;
                        } catch (Exception v7_9) {
                            if (!(v7_9 instanceof ArrayIndexOutOfBoundsException)) {
                                throw new com.google.android.recaptcha.internal.zzce(4, 25, v7_9);
                            } else {
                                throw new com.google.android.recaptcha.internal.zzce(4, 22, v7_9);
                            }
                        }
                    }
                }
            }
        }
    }
}
