package com.google.android.recaptcha.internal;
public final class zzbe {

    public zzbe()
    {
        new java.util.concurrent.ConcurrentHashMap();
        com.google.android.recaptcha.internal.zzbe.zzb();
        return;
    }

    public static final java.util.Set zza(android.content.Context p3)
    {
        try {
            java.util.LinkedHashSet v0_1 = new java.util.LinkedHashSet();
            com.google.android.recaptcha.internal.zzqi v3_2 = p3.getSystemService("connectivity");
            kotlin.jvm.internal.j.c(v3_2, "null cannot be cast to non-null type android.net.ConnectivityManager");
            com.google.android.recaptcha.internal.zzqi v3_6 = ((android.net.ConnectivityManager) v3_2);
            com.google.android.recaptcha.internal.zzqi v3_1 = v3_6.getNetworkCapabilities(v3_6.getActiveNetwork());
        } catch (Exception) {
            return i7.p.a;
        }
        if ((v3_1 != null) && (v3_1.hasTransport(1) == 1)) {
            v0_1.add(com.google.android.recaptcha.internal.zzqi.zzM);
        }
        if ((v3_1 != null) && (v3_1.hasTransport(0) == 1)) {
            v0_1.add(com.google.android.recaptcha.internal.zzqi.zzN);
        }
        if ((v3_1 != null) && (v3_1.hasTransport(4) == 1)) {
            v0_1.add(com.google.android.recaptcha.internal.zzqi.zzO);
        }
        if ((v3_1 != null) && (v3_1.hasTransport(3) == 1)) {
            v0_1.add(com.google.android.recaptcha.internal.zzqi.zzP);
        }
        if ((v3_1 != null) && (v3_1.hasCapability(16) == 1)) {
            v0_1.add(com.google.android.recaptcha.internal.zzqi.zzr);
        }
        return v0_1;
    }

    private static final java.util.Map zzb()
    {
        com.google.android.recaptcha.internal.zzqi v2_19 = new h7.f(Integer.valueOf(0), com.google.android.recaptcha.internal.zzqi.zzb);
        new h7.f(Integer.valueOf(1), com.google.android.recaptcha.internal.zzqi.zzc);
        new h7.f(Integer.valueOf(2), com.google.android.recaptcha.internal.zzqi.zzd);
        new h7.f(Integer.valueOf(3), com.google.android.recaptcha.internal.zzqi.zze);
        new h7.f(Integer.valueOf(4), com.google.android.recaptcha.internal.zzqi.zzf);
        new h7.f(Integer.valueOf(5), com.google.android.recaptcha.internal.zzqi.zzg);
        new h7.f(Integer.valueOf(6), com.google.android.recaptcha.internal.zzqi.zzh);
        new h7.f(Integer.valueOf(7), com.google.android.recaptcha.internal.zzqi.zzi);
        new h7.f(Integer.valueOf(8), com.google.android.recaptcha.internal.zzqi.zzj);
        new h7.f(Integer.valueOf(9), com.google.android.recaptcha.internal.zzqi.zzk);
        new h7.f(Integer.valueOf(10), com.google.android.recaptcha.internal.zzqi.zzl);
        new h7.f(Integer.valueOf(11), com.google.android.recaptcha.internal.zzqi.zzm);
        new h7.f(Integer.valueOf(12), com.google.android.recaptcha.internal.zzqi.zzn);
        new h7.f(Integer.valueOf(13), com.google.android.recaptcha.internal.zzqi.zzo);
        h7.f v16 = v2_19;
        new h7.f(Integer.valueOf(14), com.google.android.recaptcha.internal.zzqi.zzp);
        java.util.LinkedHashMap v0_2 = i7.r.o0(new h7.f[] {v16, new h7.f(Integer.valueOf(15), com.google.android.recaptcha.internal.zzqi.zzq)}));
        Integer v1_0 = android.os.Build$VERSION.SDK_INT;
        v0_2.put(Integer.valueOf(17), com.google.android.recaptcha.internal.zzqi.zzs);
        v0_2.put(Integer.valueOf(16), com.google.android.recaptcha.internal.zzqi.zzr);
        if (v1_0 >= 28) {
            v0_2.put(Integer.valueOf(18), com.google.android.recaptcha.internal.zzqi.zzt);
            v0_2.put(Integer.valueOf(19), com.google.android.recaptcha.internal.zzqi.zzu);
            v0_2.put(Integer.valueOf(20), com.google.android.recaptcha.internal.zzqi.zzv);
            v0_2.put(Integer.valueOf(21), com.google.android.recaptcha.internal.zzqi.zzw);
        }
        if (v1_0 >= 29) {
            v0_2.put(Integer.valueOf(23), com.google.android.recaptcha.internal.zzqi.zzy);
        }
        if (v1_0 >= 30) {
            v0_2.put(Integer.valueOf(25), com.google.android.recaptcha.internal.zzqi.zzA);
        }
        if (v1_0 >= 31) {
            v0_2.put(Integer.valueOf(32), com.google.android.recaptcha.internal.zzqi.zzH);
            v0_2.put(Integer.valueOf(29), com.google.android.recaptcha.internal.zzqi.zzE);
        }
        if (v1_0 >= 33) {
            v0_2.put(Integer.valueOf(35), com.google.android.recaptcha.internal.zzqi.zzK);
            v0_2.put(Integer.valueOf(34), com.google.android.recaptcha.internal.zzqi.zzJ);
            v0_2.put(Integer.valueOf(33), com.google.android.recaptcha.internal.zzqi.zzI);
        }
        return v0_2;
    }
}
