package com.google.android.recaptcha.internal;
public final class zzkm {
    private static final java.util.Map zza;

    static zzkm()
    {
        java.util.Map v0_1 = new java.util.LinkedHashMap(16);
        java.util.LinkedHashMap v2_1 = new java.util.LinkedHashMap(16);
        com.google.android.recaptcha.internal.zzkm.zzb(v0_1, v2_1, Boolean.TYPE, Boolean);
        com.google.android.recaptcha.internal.zzkm.zzb(v0_1, v2_1, Byte.TYPE, Byte);
        com.google.android.recaptcha.internal.zzkm.zzb(v0_1, v2_1, Character.TYPE, Character);
        com.google.android.recaptcha.internal.zzkm.zzb(v0_1, v2_1, Double.TYPE, Double);
        com.google.android.recaptcha.internal.zzkm.zzb(v0_1, v2_1, Float.TYPE, Float);
        com.google.android.recaptcha.internal.zzkm.zzb(v0_1, v2_1, Integer.TYPE, Integer);
        com.google.android.recaptcha.internal.zzkm.zzb(v0_1, v2_1, Long.TYPE, Long);
        com.google.android.recaptcha.internal.zzkm.zzb(v0_1, v2_1, Short.TYPE, Short);
        com.google.android.recaptcha.internal.zzkm.zzb(v0_1, v2_1, Void.TYPE, Void);
        com.google.android.recaptcha.internal.zzkm.zza = java.util.Collections.unmodifiableMap(v0_1);
        java.util.Collections.unmodifiableMap(v2_1);
        return;
    }

    public static Class zza(Class p1)
    {
        p1.getClass();
        Class v0_2 = ((Class) com.google.android.recaptcha.internal.zzkm.zza.get(p1));
        if (v0_2 != null) {
            return v0_2;
        } else {
            return p1;
        }
    }

    private static void zzb(java.util.Map p0, java.util.Map p1, Class p2, Class p3)
    {
        p0.put(p2, p3);
        p1.put(p3, p2);
        return;
    }
}
