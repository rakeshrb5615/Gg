package com.google.android.recaptcha.internal;
public final class zzpz {

    static zzpz()
    {
        com.google.android.recaptcha.internal.zzml v0_0 = com.google.android.recaptcha.internal.zzml.zzi();
        v0_0.zzf(-315576000000);
        v0_0.zze(-999999999);
        v0_0.zzi();
        com.google.android.recaptcha.internal.zzml v0_1 = com.google.android.recaptcha.internal.zzml.zzi();
        v0_1.zzf(315576000000);
        v0_1.zze(999999999);
        v0_1.zzi();
        com.google.android.recaptcha.internal.zzml v0_3 = com.google.android.recaptcha.internal.zzml.zzi();
        v0_3.zzf(0);
        v0_3.zze(0);
        v0_3.zzi();
        return;
    }

    public static com.google.android.recaptcha.internal.zzml zza(long p9)
    {
        int v2_1 = ((int) (p9 % 1000000000));
        IllegalArgumentException v9_1 = (p9 / 1000000000);
        if ((v2_1 <= -1000000000) || (v2_1 >= 1000000000)) {
            v9_1 = com.google.android.recaptcha.internal.zzkk.zza(v9_1, ((long) (v2_1 / 1000000000)));
            v2_1 %= 1000000000;
        }
        if ((v9_1 > 0) && (v2_1 < 0)) {
            v2_1 += 1000000000;
            v9_1 += -1;
        }
        if ((v9_1 < 0) && (v2_1 > 0)) {
            v2_1 += -1000000000;
            v9_1++;
        }
        String v1_0 = com.google.android.recaptcha.internal.zzml.zzi();
        v1_0.zzf(v9_1);
        v1_0.zze(v2_1);
        IllegalArgumentException v9_3 = ((com.google.android.recaptcha.internal.zzml) v1_0.zzi());
        String v1_1 = v9_3.zzg();
        String v10_0 = v9_3.zzf();
        if ((v1_1 >= -315576000000) && ((v1_1 <= 315576000000) && ((((long) v10_0) >= -999999999) && (v10_0 < 1000000000)))) {
            long v0_2 = v1_1 cmp 0;
            if (((v0_2 >= 0) && (v10_0 >= null)) || ((v0_2 <= 0) && (v10_0 <= null))) {
                return v9_3;
            }
        }
        long v0_4 = new StringBuilder("Duration is not valid. See proto definition for valid values. Seconds (");
        v0_4.append(v1_1);
        v0_4.append(") must be in range [-315,576,000,000, +315,576,000,000]. Nanos (");
        v0_4.append(v10_0);
        v0_4.append(") must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds");
        throw new IllegalArgumentException(v0_4.toString());
    }
}
