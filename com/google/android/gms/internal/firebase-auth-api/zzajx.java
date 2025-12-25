package com.google.android.gms.internal.firebase-auth-api;
final class zzajx implements java.util.Comparator {

    public zzajx()
    {
        return;
    }

    public final synthetic int compare(Object p5, Object p6)
    {
        com.google.android.gms.internal.firebase-auth-api.zzakb v0_1 = ((com.google.android.gms.internal.firebase-auth-api.zzakb) ((com.google.android.gms.internal.firebase-auth-api.zzajv) p5).iterator());
        com.google.android.gms.internal.firebase-auth-api.zzakb v1_1 = ((com.google.android.gms.internal.firebase-auth-api.zzakb) ((com.google.android.gms.internal.firebase-auth-api.zzajv) p6).iterator());
        while ((v0_1.hasNext()) && (v1_1.hasNext())) {
            int v2_3 = Integer.compare(com.google.android.gms.internal.firebase-auth-api.zzajv.zza(v0_1.zza()), com.google.android.gms.internal.firebase-auth-api.zzajv.zza(v1_1.zza()));
            if (v2_3 != 0) {
                return v2_3;
            }
        }
        return Integer.compare(((com.google.android.gms.internal.firebase-auth-api.zzajv) p5).zzb(), ((com.google.android.gms.internal.firebase-auth-api.zzajv) p6).zzb());
    }
}
