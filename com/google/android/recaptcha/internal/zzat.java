package com.google.android.recaptcha.internal;
final class zzat extends kotlin.jvm.internal.k implements u7.a {
    public static final com.google.android.recaptcha.internal.zzat zza;

    static zzat()
    {
        com.google.android.recaptcha.internal.zzat.zza = new com.google.android.recaptcha.internal.zzat();
        return;
    }

    public zzat()
    {
        super(0);
        return;
    }

    public static final java.util.Map zza()
    {
        java.util.Iterator v0_0 = com.google.android.recaptcha.internal.zzav.zzc();
        java.util.LinkedHashMap v1_1 = new java.util.LinkedHashMap(i7.r.l0(v0_0.size()));
        java.util.Iterator v0_1 = v0_0.entrySet().iterator();
        while (v0_1.hasNext()) {
            Object v2_2 = ((java.util.Map$Entry) v0_1.next());
            v1_1.put(v2_2.getKey(), ((com.google.android.recaptcha.internal.zzaw) v2_2.getValue()).zzb());
        }
        return v1_1;
    }

    public final bridge synthetic Object invoke()
    {
        return com.google.android.recaptcha.internal.zzat.zza();
    }
}
