package com.google.android.gms.internal.firebase-auth-api;
final class zzama implements com.google.android.gms.internal.firebase-auth-api.zzane {
    private static final com.google.android.gms.internal.firebase-auth-api.zzamj zza;
    private final com.google.android.gms.internal.firebase-auth-api.zzamj zzb;

    static zzama()
    {
        com.google.android.gms.internal.firebase-auth-api.zzama.zza = new com.google.android.gms.internal.firebase-auth-api.zzalz();
        return;
    }

    public zzama()
    {
        com.google.android.gms.internal.firebase-auth-api.zzamj[] v2_1 = new com.google.android.gms.internal.firebase-auth-api.zzamj[2];
        v2_1[0] = com.google.android.gms.internal.firebase-auth-api.zzalg.zza();
        v2_1[1] = com.google.android.gms.internal.firebase-auth-api.zzama.zza;
        this(new com.google.android.gms.internal.firebase-auth-api.zzamb(v2_1));
        return;
    }

    private zzama(com.google.android.gms.internal.firebase-auth-api.zzamj p2)
    {
        this.zzb = ((com.google.android.gms.internal.firebase-auth-api.zzamj) com.google.android.gms.internal.firebase-auth-api.zzalh.zza(p2, "messageInfoFactory"));
        return;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzanb zza(Class p9)
    {
        com.google.android.gms.internal.firebase-auth-api.zzand.zza(p9);
        com.google.android.gms.internal.firebase-auth-api.zzamk v2 = this.zzb.zza(p9);
        if (!v2.zzc()) {
            int v0_3;
            com.google.android.gms.internal.firebase-auth-api.zzamu v3 = com.google.android.gms.internal.firebase-auth-api.zzamw.zza();
            com.google.android.gms.internal.firebase-auth-api.zzalw v4 = com.google.android.gms.internal.firebase-auth-api.zzaly.zza();
            com.google.android.gms.internal.firebase-auth-api.zzanu v5 = com.google.android.gms.internal.firebase-auth-api.zzand.zza();
            if (com.google.android.gms.internal.firebase-auth-api.zzamc.zza[v2.zzb().ordinal()] == 1) {
                v0_3 = 0;
            } else {
                v0_3 = com.google.android.gms.internal.firebase-auth-api.zzaky.zza();
            }
            return com.google.android.gms.internal.firebase-auth-api.zzamq.zza(p9, v2, v3, v4, v5, v0_3, com.google.android.gms.internal.firebase-auth-api.zzamh.zza());
        } else {
            return com.google.android.gms.internal.firebase-auth-api.zzams.zza(com.google.android.gms.internal.firebase-auth-api.zzand.zza(), com.google.android.gms.internal.firebase-auth-api.zzaky.zza(), v2.zza());
        }
    }
}
