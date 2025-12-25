package com.google.android.recaptcha.internal;
public final class zzhc implements com.google.android.recaptcha.internal.zzgx {
    public static final com.google.android.recaptcha.internal.zzhc zza;

    static zzhc()
    {
        com.google.android.recaptcha.internal.zzhc.zza = new com.google.android.recaptcha.internal.zzhc();
        return;
    }

    private zzhc()
    {
        return;
    }

    public final varargs void zza(int p10, com.google.android.recaptcha.internal.zzgd p11, com.google.android.recaptcha.internal.zzue[] p12)
    {
        int v0_0 = p12.length;
        if (v0_0 < 2) {
            throw new com.google.android.recaptcha.internal.zzce(4, 3, 0);
        } else {
            Class v4_1 = p11.zzc().zza(p12[0]);
            if (1 != java.util.Objects.nonNull(v4_1)) {
                v4_1 = 0;
            }
            if (v4_1 == null) {
                throw new com.google.android.recaptcha.internal.zzce(4, 5, 0);
            } else {
                Class v4_2;
                if (!(v4_1 instanceof Class)) {
                    v4_2 = v4_1.getClass();
                } else {
                    v4_2 = ((Class) v4_1);
                }
                String v7_2 = p11.zzc().zza(p12[1]);
                if (1 != (v7_2 instanceof String)) {
                    v7_2 = 0;
                }
                String v7_3 = ((String) v7_2);
                if (v7_3 == null) {
                    throw new com.google.android.recaptcha.internal.zzce(4, 5, 0);
                } else {
                    String v1_2 = p11.zzh().zza(v7_3);
                    if (kotlin.jvm.internal.j.a(v1_2, "forName")) {
                        throw new com.google.android.recaptcha.internal.zzce(6, 48, 0);
                    } else {
                        int v12_3 = p11.zzc().zzf(i7.h.i0(p12).subList(2, v0_0));
                        try {
                            p11.zzc().zze(p10, v4_2.getMethod(v1_2, ((Class[]) java.util.Arrays.copyOf(v12_3, v12_3.length))));
                            return;
                        } catch (Exception v10_9) {
                            throw new com.google.android.recaptcha.internal.zzce(6, 13, v10_9);
                        }
                    }
                }
            }
        }
    }
}
