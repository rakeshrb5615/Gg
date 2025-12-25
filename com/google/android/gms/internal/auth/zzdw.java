package com.google.android.gms.internal.auth;
final class zzdw implements java.util.Comparator {

    public zzdw()
    {
        return;
    }

    public final synthetic int compare(Object p5, Object p6)
    {
        com.google.android.gms.internal.auth.zzdv v0_1 = new com.google.android.gms.internal.auth.zzdv(((com.google.android.gms.internal.auth.zzee) p5));
        com.google.android.gms.internal.auth.zzdv v1_1 = new com.google.android.gms.internal.auth.zzdv(((com.google.android.gms.internal.auth.zzee) p6));
        while ((v0_1.hasNext()) && (v1_1.hasNext())) {
            int v2_4 = Integer.valueOf((v0_1.zza() & 255)).compareTo(Integer.valueOf((v1_1.zza() & 255)));
            if (v2_4 != 0) {
                return v2_4;
            }
        }
        return Integer.valueOf(((com.google.android.gms.internal.auth.zzee) p5).zzd()).compareTo(Integer.valueOf(((com.google.android.gms.internal.auth.zzee) p6).zzd()));
    }
}
