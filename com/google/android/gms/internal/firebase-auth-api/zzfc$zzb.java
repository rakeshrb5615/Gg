package com.google.android.gms.internal.firebase-auth-api;
public final class zzfc$zzb {
    private com.google.android.gms.internal.firebase-auth-api.zzfc$zzc zza;
    private String zzb;
    private com.google.android.gms.internal.firebase-auth-api.zzfc$zza zzc;
    private com.google.android.gms.internal.firebase-auth-api.zzcy zzd;

    private zzfc$zzb()
    {
        return;
    }

    public synthetic zzfc$zzb(com.google.android.gms.internal.firebase-auth-api.zzfe p1)
    {
        return;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzfc$zzb zza(com.google.android.gms.internal.firebase-auth-api.zzcy p1)
    {
        this.zzd = p1;
        return this;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzfc$zzb zza(com.google.android.gms.internal.firebase-auth-api.zzfc$zza p1)
    {
        this.zzc = p1;
        return this;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzfc$zzb zza(com.google.android.gms.internal.firebase-auth-api.zzfc$zzc p1)
    {
        this.zza = p1;
        return this;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzfc$zzb zza(String p1)
    {
        this.zzb = p1;
        return this;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzfc zza()
    {
        if (this.zza == null) {
            this.zza = com.google.android.gms.internal.firebase-auth-api.zzfc$zzc.zzb;
        }
        if (this.zzb == null) {
            throw new java.security.GeneralSecurityException("kekUri must be set");
        } else {
            if (this.zzc == null) {
                throw new java.security.GeneralSecurityException("dekParsingStrategy must be set");
            } else {
                java.security.GeneralSecurityException v0_4 = this.zzd;
                if (v0_4 == null) {
                    throw new java.security.GeneralSecurityException("dekParametersForNewKeys must be set");
                } else {
                    if (v0_4.zza()) {
                        throw new java.security.GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
                    } else {
                        java.security.GeneralSecurityException v0_11 = this.zzc;
                        String v1_3 = this.zzd;
                        if (((!v0_11.equals(com.google.android.gms.internal.firebase-auth-api.zzfc$zza.zza)) || (!(v1_3 instanceof com.google.android.gms.internal.firebase-auth-api.zzdx))) && (((!v0_11.equals(com.google.android.gms.internal.firebase-auth-api.zzfc$zza.zzc)) || (!(v1_3 instanceof com.google.android.gms.internal.firebase-auth-api.zzem))) && (((!v0_11.equals(com.google.android.gms.internal.firebase-auth-api.zzfc$zza.zzb)) || (!(v1_3 instanceof com.google.android.gms.internal.firebase-auth-api.zzge))) && (((!v0_11.equals(com.google.android.gms.internal.firebase-auth-api.zzfc$zza.zzd)) || (!(v1_3 instanceof com.google.android.gms.internal.firebase-auth-api.zzdi))) && (((!v0_11.equals(com.google.android.gms.internal.firebase-auth-api.zzfc$zza.zze)) || (!(v1_3 instanceof com.google.android.gms.internal.firebase-auth-api.zzdq))) && ((!v0_11.equals(com.google.android.gms.internal.firebase-auth-api.zzfc$zza.zzf)) || (!(v1_3 instanceof com.google.android.gms.internal.firebase-auth-api.zzeg)))))))) {
                            String v1_6 = this.zzc.toString();
                            String v2_17 = String.valueOf(this.zzd);
                            StringBuilder v3_1 = new StringBuilder("Cannot use parsing strategy ");
                            v3_1.append(v1_6);
                            v3_1.append(" when new keys are picked according to ");
                            v3_1.append(v2_17);
                            v3_1.append(".");
                            throw new java.security.GeneralSecurityException(v3_1.toString());
                        } else {
                            return new com.google.android.gms.internal.firebase-auth-api.zzfc(this.zza, this.zzb, this.zzc, this.zzd, 0);
                        }
                    }
                }
            }
        }
    }
}
