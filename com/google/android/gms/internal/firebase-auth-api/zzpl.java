package com.google.android.gms.internal.firebase-auth-api;
public final class zzpl {
    private static final com.google.android.gms.internal.firebase-auth-api.zzaaj zza;
    private final java.util.Map zzb;

    static zzpl()
    {
        com.google.android.gms.internal.firebase-auth-api.zzaaj v0_1 = new byte[0];
        com.google.android.gms.internal.firebase-auth-api.zzpl.zza = com.google.android.gms.internal.firebase-auth-api.zzaaj.zza(v0_1);
        return;
    }

    private zzpl(java.util.Map p1)
    {
        this.zzb = p1;
        return;
    }

    public synthetic zzpl(java.util.Map p1, com.google.android.gms.internal.firebase-auth-api.zzpp p2)
    {
        this(p1);
        return;
    }

    public final Iterable zza(byte[] p5)
    {
        java.util.ArrayList v5_3;
        java.util.List v0_2 = ((java.util.List) this.zzb.get(com.google.android.gms.internal.firebase-auth-api.zzpl.zza));
        if (p5.length < 5) {
            v5_3 = 0;
        } else {
            v5_3 = ((java.util.List) this.zzb.get(com.google.android.gms.internal.firebase-auth-api.zzaaj.zza(p5, 0, 5)));
        }
        if ((v0_2 != null) || (v5_3 != null)) {
            if (v0_2 != null) {
                if (v5_3 != null) {
                    return new com.google.android.gms.internal.firebase-auth-api.zzpo(this, v5_3, v0_2);
                } else {
                    return v0_2;
                }
            } else {
                return v5_3;
            }
        } else {
            return new java.util.ArrayList();
        }
    }
}
