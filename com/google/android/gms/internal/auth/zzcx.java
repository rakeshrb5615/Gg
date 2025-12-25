package com.google.android.gms.internal.auth;
final class zzcx extends com.google.android.gms.internal.auth.zzdc {

    public zzcx(com.google.android.gms.internal.auth.zzcz p7, String p8, Double p9, boolean p10)
    {
        super(p7, p8, p9, 1, 0);
        return;
    }

    public final bridge synthetic Object zza(Object p4)
    {
        try {
            int v4_4 = Double.valueOf(Double.parseDouble(((String) p4)));
            return v4_4;
        } catch (NumberFormatException) {
            String v0_2 = v1.a.q("Invalid double value for ", this.zzc(), ": ");
            v0_2.append(((String) v4_4));
            android.util.Log.e("PhenotypeFlag", v0_2.toString());
            return 0;
        }
    }
}
