package com.google.android.recaptcha.internal;
public final class zzkj {

    public static int zza(int p5, int p6, java.math.RoundingMode p7)
    {
        p7.getClass();
        if (p6 == 0) {
            throw new ArithmeticException("/ by zero");
        } else {
            int v0 = (p5 / p6);
            int v1_3 = (p5 - (p6 * v0));
            if (v1_3 != 0) {
                int v3_1 = 1;
                AssertionError v5_3 = (((p5 ^ p6) >> 31) | 1);
                switch (com.google.android.recaptcha.internal.zzki.zza[p7.ordinal()]) {
                    case 1:
                        com.google.android.recaptcha.internal.zzkl.zzb(0);
                        return v0;
                    case 2:
                        break;
                    case 3:
                        if (v5_3 < null) {
                            v0 += v5_3;
                        }
                        break;
                    case 5:
                        if (v5_3 <= null) {
                            return v0;
                        }
                    case 6:
                    case 7:
                    case 8:
                        int v1_0 = Math.abs(v1_3);
                        int v1_1 = (v1_0 - (Math.abs(p6) - v1_0));
                        if (v1_1 != 0) {
                            if (v1_1 <= 0) {
                                return v0;
                            }
                        } else {
                            if (p7 == java.math.RoundingMode.HALF_UP) {
                            } else {
                                if (p7 != java.math.RoundingMode.HALF_EVEN) {
                                    v3_1 = 0;
                                }
                                if (((v0 & 1) & v3_1) == 0) {
                                    return v0;
                                }
                            }
                        }
                    default:
                        throw new AssertionError();
                }
            }
            return v0;
        }
    }

    public static int zzb(int p1, java.math.RoundingMode p2)
    {
        if (p1 <= 0) {
            throw new IllegalArgumentException("x (0) must be > 0");
        } else {
            switch (com.google.android.recaptcha.internal.zzki.zza[p2.ordinal()]) {
                case 1:
                    int v2_7;
                    if (((p1 - 1) & p1) != 0) {
                        v2_7 = 0;
                    } else {
                        v2_7 = 1;
                    }
                    com.google.android.recaptcha.internal.zzkl.zzb(v2_7);
                case 2:
                case 3:
                    break;
                case 2:
                case 3:
                    break;
                case 4:
                case 5:
                    return (32 - Integer.numberOfLeadingZeros((p1 - 1)));
                case 6:
                case 7:
                case 8:
                    int v2_1 = Integer.numberOfLeadingZeros(p1);
                    return ((31 - v2_1) + (((-1257966797 >> v2_1) - p1) >> 31));
                default:
                    throw new AssertionError();
            }
            return (31 - Integer.numberOfLeadingZeros(p1));
        }
    }
}
