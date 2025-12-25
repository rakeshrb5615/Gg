package com.google.android.gms.internal.measurement;
final class zzke extends com.google.android.gms.internal.measurement.zzkm {

    public zzke(com.google.android.gms.internal.measurement.zzkg p7, String p8, Double p9, boolean p10)
    {
        super(p7, "measurement.test.double_flag", p9, 1, 0);
        return;
    }

    public final synthetic Object zza(Object p5)
    {
        if (!(p5 instanceof Double)) {
            if (!(p5 instanceof Float)) {
                try {
                    if (!(p5 instanceof String)) {
                        String v0_1 = this.zzb;
                        int v5_1 = p5.toString();
                        StringBuilder v3_1 = new StringBuilder(((v0_1.length() + 27) + v5_1.length()));
                        v3_1.append("Invalid double value for ");
                        v3_1.append(v0_1);
                        v3_1.append(": ");
                        v3_1.append(v5_1);
                        android.util.Log.e("PhenotypeFlag", v3_1.toString());
                        return 0;
                    } else {
                        p5 = Double.valueOf(Double.parseDouble(((String) p5)));
                        return p5;
                    }
                } catch (NumberFormatException) {
                    v0_1 = this.zzb;
                    v5_1 = p5.toString();
                    v3_1 = new StringBuilder(((v0_1.length() + 27) + v5_1.length()));
                    v3_1.append("Invalid double value for ");
                    v3_1.append(v0_1);
                    v3_1.append(": ");
                    v3_1.append(v5_1);
                    android.util.Log.e("PhenotypeFlag", v3_1.toString());
                    return 0;
                }
            } else {
                return Double.valueOf(((Float) p5).doubleValue());
            }
        } else {
            return ((Double) p5);
        }
    }
}
