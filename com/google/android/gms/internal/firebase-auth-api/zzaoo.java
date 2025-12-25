package com.google.android.gms.internal.firebase-auth-api;
public final class zzaoo {
    private static final ThreadLocal zza;

    static zzaoo()
    {
        com.google.android.gms.internal.firebase-auth-api.zzans.zzc().zza(-62135596800).zza(0).zze();
        com.google.android.gms.internal.firebase-auth-api.zzans.zzc().zza(253402300799).zza(999999999).zze();
        com.google.android.gms.internal.firebase-auth-api.zzans.zzc().zza(0).zza(0).zze();
        com.google.android.gms.internal.firebase-auth-api.zzaoo.zza = new com.google.android.gms.internal.firebase-auth-api.zzaon();
        com.google.android.gms.internal.firebase-auth-api.zzaoo.zzc("now");
        com.google.android.gms.internal.firebase-auth-api.zzaoo.zzc("getEpochSecond");
        com.google.android.gms.internal.firebase-auth-api.zzaoo.zzc("getNano");
        return;
    }

    public static long zza(com.google.android.gms.internal.firebase-auth-api.zzans p2)
    {
        return com.google.android.gms.internal.firebase-auth-api.zzaoo.zzb(p2).zzb();
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzans zza(String p15)
    {
        ArithmeticException v0_28 = p15.indexOf(84);
        if (v0_28 == -1) {
            throw new java.text.ParseException(v1.a.l("Failed to parse timestamp: invalid timestamp \"", p15, "\""), 0);
        } else {
            int v5_5 = p15.indexOf(90, v0_28);
            if (v5_5 == -1) {
                v5_5 = p15.indexOf(43, v0_28);
            }
            if (v5_5 == -1) {
                v5_5 = p15.indexOf(45, v0_28);
            }
            if (v5_5 == -1) {
                throw new java.text.ParseException("Failed to parse timestamp: missing valid timezone offset.", 0);
            } else {
                String v3_6;
                ArithmeticException v0_30 = p15.substring(0, v5_5);
                int v7_2 = v0_30.indexOf(46);
                int v8 = 1;
                if (v7_2 == -1) {
                    v3_6 = "";
                } else {
                    v3_6 = v0_30.substring((v7_2 + 1));
                    v0_30 = v0_30.substring(0, v7_2);
                }
                int v7_0;
                int v9_0 = (((java.text.SimpleDateFormat) com.google.android.gms.internal.firebase-auth-api.zzaoo.zza.get()).parse(v0_30).getTime() / 1000);
                if (!v3_6.isEmpty()) {
                    ArithmeticException v0_34 = 0;
                    v7_0 = 0;
                    while (v0_34 < 9) {
                        v7_0 *= 10;
                        if (v0_34 < v3_6.length()) {
                            if ((v3_6.charAt(v0_34) < 48) || (v3_6.charAt(v0_34) > 57)) {
                                throw new java.text.ParseException("Invalid nanoseconds.", 0);
                            } else {
                                v7_0 = ((v3_6.charAt(v0_34) - 48) + v7_0);
                            }
                        }
                        v0_34++;
                    }
                } else {
                    v7_0 = 0;
                }
                if (p15.charAt(v5_5) != 90) {
                    ArithmeticException v0_40 = com.google.android.gms.internal.firebase-auth-api.zzaoo.zzb(p15.substring((v5_5 + 1)));
                    if (p15.charAt(v5_5) != 43) {
                        v9_0 += v0_40;
                    } else {
                        v9_0 -= v0_40;
                    }
                } else {
                    if (p15.length() != (v5_5 + 1)) {
                        throw new java.text.ParseException(v1.a.l("Failed to parse timestamp: invalid trailing data \"", p15.substring(v5_5), "\""), 0);
                    }
                }
                if (!com.google.android.gms.internal.firebase-auth-api.zzaoo.zza(v9_0)) {
                    throw new IllegalArgumentException(com.google.android.gms.internal.firebase-auth-api.zzac.zza("Timestamp is not valid. Input seconds is too large. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. ", new Object[] {Long.valueOf(v9_0)})));
                } else {
                    if ((v7_0 <= -1000000000) || (v7_0 >= 1000000000)) {
                        ArithmeticException v0_10;
                        int v5_0 = ((long) (v7_0 / 1000000000));
                        long v11_0 = (v9_0 + v5_0);
                        if ((v5_0 ^ v9_0) >= 0) {
                            v0_10 = 0;
                        } else {
                            v0_10 = 1;
                        }
                        int v5_4;
                        if ((v9_0 ^ v11_0) < 0) {
                            v5_4 = 0;
                        } else {
                            v5_4 = 1;
                        }
                        if ((v0_10 | v5_4) == 0) {
                            throw new ArithmeticException();
                        } else {
                            v7_0 %= 1000000000;
                            v9_0 = v11_0;
                        }
                    }
                    if (v7_0 < 0) {
                        ArithmeticException v0_17;
                        v7_0 += 1000000000;
                        int v5_6 = (v9_0 - 1);
                        if ((1 ^ v9_0) < 0) {
                            v0_17 = 0;
                        } else {
                            v0_17 = 1;
                        }
                        if ((v9_0 ^ v5_6) < 0) {
                            v8 = 0;
                        } else {
                        }
                        if ((v0_17 | v8) == 0) {
                            throw new ArithmeticException();
                        } else {
                            v9_0 = v5_6;
                        }
                    }
                    p15 = com.google.android.gms.internal.firebase-auth-api.zzaoo.zzb(((com.google.android.gms.internal.firebase-auth-api.zzans) ((com.google.android.gms.internal.firebase-auth-api.zzalf) com.google.android.gms.internal.firebase-auth-api.zzans.zzc().zza(v9_0).zza(v7_0).zze())));
                    return p15;
                }
            }
        }
    }

    public static synthetic java.text.SimpleDateFormat zza()
    {
        java.text.SimpleDateFormat v0_1 = new java.text.SimpleDateFormat("yyyy-MM-dd\'T\'HH:mm:ss", java.util.Locale.ENGLISH);
        java.util.GregorianCalendar v1_2 = new java.util.GregorianCalendar(java.util.TimeZone.getTimeZone("UTC"));
        v1_2.setGregorianChange(new java.util.Date(-9223372036854775808));
        v0_1.setCalendar(v1_2);
        return v0_1;
    }

    private static boolean zza(long p2)
    {
        if ((p2 < -62135596800) || (p2 > 253402300799)) {
            return 0;
        } else {
            return 1;
        }
    }

    private static long zzb(String p8)
    {
        NumberFormatException v0_4 = p8.indexOf(58);
        if (v0_4 == -1) {
            throw new java.text.ParseException("Invalid offset value: ".concat(p8), 0);
        } else {
            try {
                return (((Long.parseLong(p8.substring(0, v0_4)) * 60) + Long.parseLong(p8.substring((v0_4 + 1)))) * 60);
            } catch (NumberFormatException v0_6) {
                java.text.ParseException v1_3 = new java.text.ParseException("Invalid offset value: ".concat(p8), 0);
                v1_3.initCause(v0_6);
                throw v1_3;
            }
        }
    }

    private static com.google.android.gms.internal.firebase-auth-api.zzans zzb(com.google.android.gms.internal.firebase-auth-api.zzans p4)
    {
        String v0_0 = p4.zzb();
        int v2 = p4.zza();
        if ((!com.google.android.gms.internal.firebase-auth-api.zzaoo.zza(v0_0)) || ((v2 < 0) || (v2 >= 1000000000))) {
            throw new IllegalArgumentException(com.google.android.gms.internal.firebase-auth-api.zzac.zza("Timestamp is not valid. See proto definition for valid values. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. Nanos (%s) must be in range [0, +999,999,999].", new Object[] {Long.valueOf(v0_0), Integer.valueOf(v2)})));
        } else {
            return p4;
        }
    }

    private static reflect.Method zzc(String p2)
    {
        try {
            return Class.forName("java.time.Instant").getMethod(p2, 0);
        } catch (Exception) {
            return 0;
        }
    }
}
