package com.google.android.gms.internal.measurement;
final class zzkc extends com.google.android.gms.internal.measurement.zzkm {

    public zzkc(com.google.android.gms.internal.measurement.zzkg p7, String p8, Long p9, boolean p10)
    {
        super(p7, p8, p9, 1, 0);
        return;
    }

    public final synthetic Object zza(Object p5)
    {
        if (!(p5 instanceof Long)) {
            try {
                if (!(p5 instanceof String)) {
                    String v0_1 = this.zzb;
                    int v5_1 = p5.toString();
                    StringBuilder v3_1 = new StringBuilder(((v0_1.length() + 25) + v5_1.length()));
                    v3_1.append("Invalid long value for ");
                    v3_1.append(v0_1);
                    v3_1.append(": ");
                    v3_1.append(v5_1);
                    android.util.Log.e("PhenotypeFlag", v3_1.toString());
                    return 0;
                } else {
                    p5 = Long.valueOf(Long.parseLong(((String) p5)));
                    return p5;
                }
            } catch (NumberFormatException) {
                v0_1 = this.zzb;
                v5_1 = p5.toString();
                v3_1 = new StringBuilder(((v0_1.length() + 25) + v5_1.length()));
                v3_1.append("Invalid long value for ");
                v3_1.append(v0_1);
                v3_1.append(": ");
                v3_1.append(v5_1);
                android.util.Log.e("PhenotypeFlag", v3_1.toString());
                return 0;
            }
        } else {
            return ((Long) p5);
        }
    }
}
