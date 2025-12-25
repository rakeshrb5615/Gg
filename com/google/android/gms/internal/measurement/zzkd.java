package com.google.android.gms.internal.measurement;
final class zzkd extends com.google.android.gms.internal.measurement.zzkm {

    public zzkd(com.google.android.gms.internal.measurement.zzkg p7, String p8, Boolean p9, boolean p10)
    {
        super(p7, p8, p9, 1, 0);
        return;
    }

    public final synthetic Object zza(Object p5)
    {
        if (!(p5 instanceof Boolean)) {
            if ((p5 instanceof String)) {
                if (!com.google.android.gms.internal.measurement.zzjg.zzc.matcher(((String) p5)).matches()) {
                    if (com.google.android.gms.internal.measurement.zzjg.zzd.matcher(((String) p5)).matches()) {
                        return Boolean.FALSE;
                    }
                } else {
                    return Boolean.TRUE;
                }
            }
            boolean v0_3 = this.zzb;
            Boolean v5_1 = p5.toString();
            StringBuilder v3_1 = new StringBuilder(((v0_3.length() + 28) + v5_1.length()));
            v3_1.append("Invalid boolean value for ");
            v3_1.append(v0_3);
            v3_1.append(": ");
            v3_1.append(v5_1);
            android.util.Log.e("PhenotypeFlag", v3_1.toString());
            return 0;
        } else {
            return ((Boolean) p5);
        }
    }
}
