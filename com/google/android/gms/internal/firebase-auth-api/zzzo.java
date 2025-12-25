package com.google.android.gms.internal.firebase-auth-api;
final class zzzo implements com.google.android.gms.internal.firebase-auth-api.zzzn {
    private final com.google.android.gms.internal.firebase-auth-api.zzzp zza;

    private zzzo(com.google.android.gms.internal.firebase-auth-api.zzzp p1)
    {
        this.zza = p1;
        return;
    }

    public synthetic zzzo(com.google.android.gms.internal.firebase-auth-api.zzzp p1, com.google.android.gms.internal.firebase-auth-api.zzzq p2)
    {
        this(p1);
        return;
    }

    public final Object zza(String p5)
    {
        String v0_4 = com.google.android.gms.internal.firebase-auth-api.zzzj.zza(new String[] {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"})).iterator();
        Exception v1_1 = 0;
        while (v0_4.hasNext()) {
            try {
                p5 = this.zza.zza(p5, ((java.security.Provider) v0_4.next()));
                return p5;
            } catch (Exception v2_4) {
                if (v1_1 == null) {
                    v1_1 = v2_4;
                }
            }
        }
        throw new java.security.GeneralSecurityException("No good Provider found.", v1_1);
    }
}
