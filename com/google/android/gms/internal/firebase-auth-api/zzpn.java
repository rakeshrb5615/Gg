package com.google.android.gms.internal.firebase-auth-api;
public final class zzpn {
    private final java.util.Map zza;

    public zzpn()
    {
        this.zza = new java.util.HashMap();
        return;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzpl zza()
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzpl(this.zza, 0);
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzpn zza(com.google.android.gms.internal.firebase-auth-api.zzaaj p3, Object p4)
    {
        if ((p3.zza() != 0) && (p3.zza() != 5)) {
            throw new java.security.GeneralSecurityException("PrefixMap only supports 0 and 5 byte prefixes");
        } else {
            java.util.ArrayList v3_1;
            if (!this.zza.containsKey(p3)) {
                java.util.ArrayList v0_4 = new java.util.ArrayList();
                this.zza.put(p3, v0_4);
                v3_1 = v0_4;
            } else {
                v3_1 = ((java.util.List) this.zza.get(p3));
            }
            v3_1.add(p4);
            return this;
        }
    }
}
