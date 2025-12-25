package com.google.android.gms.internal.measurement;
public final class zzah implements com.google.android.gms.internal.measurement.zzao {
    private final Double zza;

    public zzah(Double p3)
    {
        if (p3 != null) {
            this.zza = p3;
            return;
        } else {
            this.zza = Double.valueOf(9221120237041090560);
            return;
        }
    }

    public final boolean equals(Object p2)
    {
        if (p2 != this) {
            if ((p2 instanceof com.google.android.gms.internal.measurement.zzah)) {
                return this.zza.equals(((com.google.android.gms.internal.measurement.zzah) p2).zza);
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        return this.zza.hashCode();
    }

    public final String toString()
    {
        return this.zzc();
    }

    public final String zzc()
    {
        String v0_0 = this.zza;
        if (!Double.isNaN(v0_0.doubleValue())) {
            if (!Double.isInfinite(v0_0.doubleValue())) {
                String v0_3;
                String v0_2 = java.math.BigDecimal.valueOf(v0_0.doubleValue());
                if (v0_2.signum() != 0) {
                    v0_3 = v0_2.stripTrailingZeros();
                } else {
                    v0_3 = new java.math.BigDecimal(java.math.BigInteger.ZERO, 0);
                }
                String v2_4;
                String v1_4 = new java.text.DecimalFormat("0E0");
                v1_4.setRoundingMode(java.math.RoundingMode.HALF_UP);
                if (v0_3.scale() <= 0) {
                    v2_4 = v0_3.scale();
                } else {
                    v2_4 = v0_3.precision();
                }
                v1_4.setMinimumFractionDigits((v2_4 - 1));
                String v1_5 = v1_4.format(v0_3);
                String v3_0 = v1_5.indexOf("E");
                if (v3_0 <= null) {
                    return v1_5;
                } else {
                    String v3_3 = Integer.parseInt(v1_5.substring((v3_0 + 1)));
                    if (((v3_3 >= null) || (v3_3 <= -7)) && ((v3_3 < null) || (v3_3 >= 21))) {
                        return v1_5.replace("E-", "e-").replace("E", "e+");
                    } else {
                        return v0_3.toPlainString();
                    }
                }
            } else {
                if (v0_0.doubleValue() <= 0) {
                    return "-Infinity";
                } else {
                    return "Infinity";
                }
            }
        } else {
            return "NaN";
        }
    }

    public final com.google.android.gms.internal.measurement.zzao zzcA(String p2, com.google.android.gms.internal.measurement.zzg p3, java.util.List p4)
    {
        if (!"toString".equals(p2)) {
            String v4_1 = this.zzc();
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append(v4_1);
            v0_1.append(".");
            v0_1.append(p2);
            v0_1.append(" is not a function.");
            throw new IllegalArgumentException(v0_1.toString());
        } else {
            return new com.google.android.gms.internal.measurement.zzas(this.zzc());
        }
    }

    public final Double zzd()
    {
        return this.zza;
    }

    public final Boolean zze()
    {
        Boolean v0_0 = this.zza;
        int v2 = 0;
        if ((!Double.isNaN(v0_0.doubleValue())) && (v0_0.doubleValue() != 0)) {
            v2 = 1;
        }
        return Boolean.valueOf(v2);
    }

    public final java.util.Iterator zzf()
    {
        return 0;
    }

    public final com.google.android.gms.internal.measurement.zzao zzt()
    {
        return new com.google.android.gms.internal.measurement.zzah(this.zza);
    }
}
