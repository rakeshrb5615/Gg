package com.google.android.recaptcha.internal;
public final class zzfm {
    private final h7.d zza;

    public zzfm()
    {
        this.zza = a.a.F(com.google.android.recaptcha.internal.zzfl.zza);
        return;
    }

    public final java.net.HttpURLConnection zza(String p4)
    {
        if (!((com.google.android.recaptcha.internal.zzfk) this.zza.getValue()).zzb(p4)) {
            throw new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zzc, com.google.android.recaptcha.internal.zzba.zzQ, 0);
        } else {
            com.google.android.recaptcha.internal.zzbd v4_2 = new java.net.URL(p4).openConnection();
            kotlin.jvm.internal.j.c(v4_2, "null cannot be cast to non-null type java.net.HttpURLConnection");
            return ((java.net.HttpURLConnection) v4_2);
        }
    }
}
