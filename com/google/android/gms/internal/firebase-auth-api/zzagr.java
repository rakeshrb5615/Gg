package com.google.android.gms.internal.firebase-auth-api;
final class zzagr extends com.google.android.gms.internal.firebase-auth-api.zzaih {
    private String zza;
    private String zzb;
    private String zzc;
    private com.google.android.gms.internal.firebase-auth-api.zzahg zzd;
    private String zze;

    public zzagr()
    {
        return;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzaie zza()
    {
        IllegalStateException v1_0 = this.zza;
        if (v1_0 != null) {
            String v3 = this.zzc;
            if (v3 != null) {
                com.google.android.gms.internal.firebase-auth-api.zzahg v4 = this.zzd;
                if (v4 != null) {
                    String v5 = this.zze;
                    if (v5 != null) {
                        return new com.google.android.gms.internal.firebase-auth-api.zzago(v1_0, this.zzb, v3, v4, v5, 0);
                    }
                }
            }
        }
        String v0_2 = new StringBuilder();
        if (this.zza == null) {
            v0_2.append(" providerId");
        }
        if (this.zzc == null) {
            v0_2.append(" token");
        }
        if (this.zzd == null) {
            v0_2.append(" tokenType");
        }
        if (this.zze == null) {
            v0_2.append(" idToken");
        }
        throw new IllegalStateException("Missing required properties:".concat(String.valueOf(v0_2)));
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzaih zza(com.google.android.gms.internal.firebase-auth-api.zzahg p2)
    {
        if (p2 == null) {
            throw new NullPointerException("Null tokenType");
        } else {
            this.zzd = p2;
            return this;
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzaih zza(String p2)
    {
        if (p2 == null) {
            throw new NullPointerException("Null idToken");
        } else {
            this.zze = p2;
            return this;
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzaih zzb(String p2)
    {
        if (p2 == null) {
            throw new NullPointerException("Null providerId");
        } else {
            this.zza = p2;
            return this;
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzaih zzc(String p1)
    {
        this.zzb = p1;
        return this;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzaih zzd(String p2)
    {
        if (p2 == null) {
            throw new NullPointerException("Null token");
        } else {
            this.zzc = p2;
            return this;
        }
    }
}
