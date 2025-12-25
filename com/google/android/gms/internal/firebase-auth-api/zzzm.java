package com.google.android.gms.internal.firebase-auth-api;
final class zzzm implements com.google.android.gms.internal.firebase-auth-api.zzzn {
    private final com.google.android.gms.internal.firebase-auth-api.zzzp zza;

    private zzzm(com.google.android.gms.internal.firebase-auth-api.zzzp p1)
    {
        this.zza = p1;
        return;
    }

    public synthetic zzzm(com.google.android.gms.internal.firebase-auth-api.zzzp p1, com.google.android.gms.internal.firebase-auth-api.zzzq p2)
    {
        this(p1);
        return;
    }

    public final Object zza(String p6)
    {
        com.google.android.gms.internal.firebase-auth-api.zzzp v0_4 = com.google.android.gms.internal.firebase-auth-api.zzzj.zza(new String[] {"GmsCore_OpenSSL", "AndroidOpenSSL"})).iterator();
        Exception v2 = 0;
        while (v0_4.hasNext()) {
            try {
                p6 = this.zza.zza(p6, ((java.security.Provider) v0_4.next()));
                return p6;
            } catch (Exception v3_3) {
                if (v2 == null) {
                    v2 = v3_3;
                }
            }
        }
        return this.zza.zza(p6, 0);
    }
}
