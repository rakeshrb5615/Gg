package com.google.android.gms.internal.firebase-auth-api;
final class zzalv implements com.google.android.gms.internal.firebase-auth-api.zzalw {

    public zzalv()
    {
        return;
    }

    private static com.google.android.gms.internal.firebase-auth-api.zzalm zzc(Object p0, long p1)
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzalm) com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p0, p1));
    }

    public final java.util.List zza(Object p3, long p4)
    {
        com.google.android.gms.internal.firebase-auth-api.zzalm v0 = com.google.android.gms.internal.firebase-auth-api.zzalv.zzc(p3, p4);
        if (!v0.zzc()) {
            int v1_2;
            int v1_1 = v0.size();
            if (v1_1 != 0) {
                v1_2 = (v1_1 << 1);
            } else {
                v1_2 = 10;
            }
            v0 = v0.zza(v1_2);
            com.google.android.gms.internal.firebase-auth-api.zzanz.zza(p3, p4, v0);
        }
        return v0;
    }

    public final void zza(Object p5, Object p6, long p7)
    {
        com.google.android.gms.internal.firebase-auth-api.zzalm v0 = com.google.android.gms.internal.firebase-auth-api.zzalv.zzc(p5, p7);
        com.google.android.gms.internal.firebase-auth-api.zzalm v6_1 = com.google.android.gms.internal.firebase-auth-api.zzalv.zzc(p6, p7);
        int v1 = v0.size();
        int v2_1 = v6_1.size();
        if ((v1 > 0) && (v2_1 > 0)) {
            if (!v0.zzc()) {
                v0 = v0.zza((v2_1 + v1));
            }
            v0.addAll(v6_1);
        }
        if (v1 > 0) {
            v6_1 = v0;
        }
        com.google.android.gms.internal.firebase-auth-api.zzanz.zza(p5, p7, v6_1);
        return;
    }

    public final void zzb(Object p1, long p2)
    {
        com.google.android.gms.internal.firebase-auth-api.zzalv.zzc(p1, p2).zzb();
        return;
    }
}
