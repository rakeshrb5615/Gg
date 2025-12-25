package com.google.android.recaptcha.internal;
public final class zzqb {
    private static final ThreadLocal zza;

    static zzqb()
    {
        String v0_0 = com.google.android.recaptcha.internal.zzpj.zzi();
        v0_0.zzf(-62135596800);
        v0_0.zze(0);
        v0_0.zzi();
        String v0_1 = com.google.android.recaptcha.internal.zzpj.zzi();
        v0_1.zzf(253402300799);
        v0_1.zze(999999999);
        v0_1.zzi();
        String v0_3 = com.google.android.recaptcha.internal.zzpj.zzi();
        v0_3.zzf(0);
        v0_3.zze(0);
        v0_3.zzi();
        com.google.android.recaptcha.internal.zzqb.zza = new com.google.android.recaptcha.internal.zzqa();
        com.google.android.recaptcha.internal.zzqb.zzd("now");
        com.google.android.recaptcha.internal.zzqb.zzd("getEpochSecond");
        com.google.android.recaptcha.internal.zzqb.zzd("getNano");
        return;
    }

    public static com.google.android.recaptcha.internal.zzpj zza(com.google.android.recaptcha.internal.zzpj p5)
    {
        String v0_0 = p5.zzg();
        int v2_2 = com.google.android.recaptcha.internal.zzqb.zze(v0_0);
        int v3 = p5.zzf();
        if ((v2_2 == 0) || ((v3 < 0) || (v3 >= 1000000000))) {
            int v2_1 = new StringBuilder("Timestamp is not valid. See proto definition for valid values. Seconds (");
            v2_1.append(v0_0);
            v2_1.append(") must be in range [-62,135,596,800, +253,402,300,799]. Nanos (");
            v2_1.append(v3);
            v2_1.append(") must be in range [0, +999,999,999].");
            throw new IllegalArgumentException(v2_1.toString());
        } else {
            return p5;
        }
    }

    public static com.google.android.recaptcha.internal.zzpj zzb(long p6)
    {
        long v2 = (p6 / 1000);
        if (!com.google.android.recaptcha.internal.zzqb.zze(v2)) {
            com.google.android.recaptcha.internal.zzph v7_5 = new StringBuilder("Timestamp is not valid. Input seconds is too large. Seconds (");
            v7_5.append(v2);
            v7_5.append(") must be in range [-62,135,596,800, +253,402,300,799]. ");
            throw new IllegalArgumentException(v7_5.toString());
        } else {
            com.google.android.recaptcha.internal.zzpj v6_4 = ((int) ((p6 % 1000) * 1000000));
            if ((v6_4 <= -1000000000) || (v6_4 >= 1000000000)) {
                v2 = com.google.android.recaptcha.internal.zzkk.zza(v2, ((long) (v6_4 / 1000000000)));
                v6_4 %= 1000000000;
            }
            if (v6_4 < null) {
                v6_4 += 1000000000;
                v2 = com.google.android.recaptcha.internal.zzkk.zzb(v2, 1);
            }
            com.google.android.recaptcha.internal.zzph v7_3 = com.google.android.recaptcha.internal.zzpj.zzi();
            v7_3.zzf(v2);
            v7_3.zze(v6_4);
            com.google.android.recaptcha.internal.zzpj v6_6 = ((com.google.android.recaptcha.internal.zzpj) v7_3.zzi());
            com.google.android.recaptcha.internal.zzqb.zza(v6_6);
            return v6_6;
        }
    }

    public static String zzc(com.google.android.recaptcha.internal.zzpj p5)
    {
        com.google.android.recaptcha.internal.zzqb.zza(p5);
        java.util.Locale v0_5 = p5.zzg();
        String v5_7 = p5.zzf();
        StringBuilder v2_1 = new StringBuilder();
        v2_1.append(((java.text.SimpleDateFormat) com.google.android.recaptcha.internal.zzqb.zza.get()).format(new java.util.Date((v0_5 * 1000))));
        if (v5_7 != null) {
            String v5_3;
            v2_1.append(".");
            if ((v5_7 % 1000000) != 0) {
                if ((v5_7 % 1000) != 0) {
                    v5_3 = String.format(java.util.Locale.ENGLISH, "%1$09d", new Object[] {Integer.valueOf(v5_7)}));
                } else {
                    v5_3 = String.format(java.util.Locale.ENGLISH, "%1$06d", new Object[] {Integer.valueOf((v5_7 / 1000))}));
                }
            } else {
                v5_3 = String.format(java.util.Locale.ENGLISH, "%1$03d", new Object[] {Integer.valueOf((v5_7 / 1000000))}));
            }
            v2_1.append(v5_3);
        }
        v2_1.append("Z");
        return v2_1.toString();
    }

    private static reflect.Method zzd(String p2)
    {
        try {
            return Class.forName("java.time.Instant").getMethod(p2, 0);
        } catch (Exception) {
            return 0;
        }
    }

    private static boolean zze(long p2)
    {
        if ((p2 < -62135596800) || (p2 > 253402300799)) {
            return 0;
        } else {
            return 1;
        }
    }
}
