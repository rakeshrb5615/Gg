package com.google.android.gms.internal.location;
public final class zzeo {
    private static final java.text.SimpleDateFormat zza;
    private static final java.text.SimpleDateFormat zzb;
    private static final StringBuilder zzc;

    static zzeo()
    {
        int v1_0 = java.util.Locale.ROOT;
        com.google.android.gms.internal.location.zzeo.zza = new java.text.SimpleDateFormat("MM-dd HH:mm:ss.SSS", v1_0);
        com.google.android.gms.internal.location.zzeo.zzb = new java.text.SimpleDateFormat("MM-dd HH:mm:ss", v1_0);
        com.google.android.gms.internal.location.zzeo.zzc = new StringBuilder(33);
        return;
    }

    public static String zza(long p2)
    {
        if (p2 < 0) {
            return Long.toString(p2);
        } else {
            return com.google.android.gms.internal.location.zzeo.zza.format(new java.util.Date(p2));
        }
    }

    public static String zzb(long p2)
    {
        StringBuilder v0 = com.google.android.gms.internal.location.zzeo.zzc;
        try {
            v0.setLength(0);
            com.google.android.gms.internal.location.zzeo.zzc(p2, v0);
            return v0.toString();
        } catch (Throwable v2_2) {
            throw v2_2;
        }
    }

    public static StringBuilder zzc(long p9, StringBuilder p11)
    {
        long v2_0 = p9 cmp 0;
        if (v2_0 != 0) {
            p11.ensureCapacity((p11.length() + 27));
            String v4_0 = 0;
            if (v2_0 < 0) {
                p11.append("-");
                if (p9 == -9223372036854775808) {
                    p9 = 9223372036854775807;
                    v4_0 = 1;
                } else {
                    p9 = (- p9);
                }
            }
            if (p9 >= 86400000) {
                p11.append((p9 / 86400000));
                p11.append("d");
                p9 %= 86400000;
            }
            if (1 == v4_0) {
                p9 = 25975808;
            }
            if (p9 >= 3600000) {
                p11.append((p9 / 3600000));
                p11.append("h");
                p9 %= 3600000;
            }
            if (p9 >= 60000) {
                p11.append((p9 / 60000));
                p11.append("m");
                p9 %= 60000;
            }
            if (p9 >= 1000) {
                p11.append((p9 / 1000));
                p11.append("s");
                p9 %= 1000;
            }
            if (p9 > 0) {
                p11.append(p9);
                p11.append("ms");
            }
            return p11;
        } else {
            p11.append("0s");
            return p11;
        }
    }
}
