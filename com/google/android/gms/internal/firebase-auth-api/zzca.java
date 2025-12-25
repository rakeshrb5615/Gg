package com.google.android.gms.internal.firebase-auth-api;
public final class zzca {
    private static final java.util.concurrent.CopyOnWriteArrayList zza;

    static zzca()
    {
        com.google.android.gms.internal.firebase-auth-api.zzca.zza = new java.util.concurrent.CopyOnWriteArrayList();
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzbx zza(String p3)
    {
        java.security.GeneralSecurityException v0_2 = com.google.android.gms.internal.firebase-auth-api.zzca.zza.iterator();
        while (v0_2.hasNext()) {
            String v1_1 = ((com.google.android.gms.internal.firebase-auth-api.zzbx) v0_2.next());
            if (v1_1.zzb(p3)) {
                return v1_1;
            }
        }
        throw new java.security.GeneralSecurityException(g2.g.l("No KMS client does support: ", p3));
    }
}
