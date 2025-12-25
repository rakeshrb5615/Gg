package com.google.android.gms.internal.firebase-auth-api;
final class zzamb implements com.google.android.gms.internal.firebase-auth-api.zzamj {
    private com.google.android.gms.internal.firebase-auth-api.zzamj[] zza;

    public varargs zzamb(com.google.android.gms.internal.firebase-auth-api.zzamj[] p1)
    {
        this.zza = p1;
        return;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzamk zza(Class p6)
    {
        UnsupportedOperationException v0_0 = this.zza;
        int v2 = 0;
        while (v2 < v0_0.length) {
            com.google.android.gms.internal.firebase-auth-api.zzamj v3 = v0_0[v2];
            if (!v3.zzb(p6)) {
                v2++;
            } else {
                return v3.zza(p6);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(p6.getName()));
    }

    public final boolean zzb(Class p6)
    {
        com.google.android.gms.internal.firebase-auth-api.zzamj[] v0 = this.zza;
        int v3 = 0;
        while (v3 < v0.length) {
            if (!v0[v3].zzb(p6)) {
                v3++;
            } else {
                return 1;
            }
        }
        return 0;
    }
}
