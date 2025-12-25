package com.google.android.gms.internal.firebase-auth-api;
public final class zzox {
    private static final com.google.android.gms.internal.firebase-auth-api.zzox zza;
    private final java.util.Map zzb;

    static zzox()
    {
        com.google.android.gms.internal.firebase-auth-api.zzox.zza = new com.google.android.gms.internal.firebase-auth-api.zzox();
        return;
    }

    public zzox()
    {
        this.zzb = new java.util.HashMap();
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzox zza()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzox.zza;
    }

    private final declared_synchronized void zza(String p5, com.google.android.gms.internal.firebase-auth-api.zzcb p6)
    {
        if (!this.zzb.containsKey(p5)) {
            this.zzb.put(p5, p6);
            return;
        } else {
            if (!((com.google.android.gms.internal.firebase-auth-api.zzcb) this.zzb.get(p5)).equals(p6)) {
                String v1_2 = String.valueOf(this.zzb.get(p5));
                String v6_1 = String.valueOf(p6);
                StringBuilder v2_1 = new StringBuilder("Parameters object with name ");
                v2_1.append(p5);
                v2_1.append(" already exists (");
                v2_1.append(v1_2);
                v2_1.append("), cannot insert ");
                v2_1.append(v6_1);
                throw new java.security.GeneralSecurityException(v2_1.toString());
            } else {
                return;
            }
        }
    }

    public final declared_synchronized void zza(java.util.Map p3)
    {
        Throwable v3_2 = p3.entrySet().iterator();
        while (v3_2.hasNext()) {
            com.google.android.gms.internal.firebase-auth-api.zzcb v0_1 = ((java.util.Map$Entry) v3_2.next());
            this.zza(((String) v0_1.getKey()), ((com.google.android.gms.internal.firebase-auth-api.zzcb) v0_1.getValue()));
        }
        return;
    }
}
