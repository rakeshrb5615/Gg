package com.google.android.gms.internal.firebase-auth-api;
final class zzago extends com.google.android.gms.internal.firebase-auth-api.zzaie {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final com.google.android.gms.internal.firebase-auth-api.zzahg zzd;
    private final String zze;

    private zzago(String p1, String p2, String p3, com.google.android.gms.internal.firebase-auth-api.zzahg p4, String p5)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        this.zzd = p4;
        this.zze = p5;
        return;
    }

    public synthetic zzago(String p1, String p2, String p3, com.google.android.gms.internal.firebase-auth-api.zzahg p4, String p5, com.google.android.gms.internal.firebase-auth-api.zzagq p6)
    {
        this(p1, p2, p3, p4, p5);
        return;
    }

    public final boolean equals(Object p5)
    {
        if (p5 != this) {
            if (((p5 instanceof com.google.android.gms.internal.firebase-auth-api.zzaie)) && (this.zza.equals(((com.google.android.gms.internal.firebase-auth-api.zzaie) p5).zzd()))) {
                String v1_1 = this.zzb;
                if (v1_1 != null) {
                    if (!v1_1.equals(((com.google.android.gms.internal.firebase-auth-api.zzaie) p5).zze())) {
                        return 0;
                    }
                } else {
                    if (((com.google.android.gms.internal.firebase-auth-api.zzaie) p5).zze() != null) {
                        return 0;
                    }
                }
                if ((this.zzc.equals(((com.google.android.gms.internal.firebase-auth-api.zzaie) p5).zzf())) && ((this.zzd.equals(((com.google.android.gms.internal.firebase-auth-api.zzaie) p5).zzb())) && (this.zze.equals(((com.google.android.gms.internal.firebase-auth-api.zzaie) p5).zzc())))) {
                    return 1;
                }
            }
            return 0;
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        int v2_0;
        int v0_10 = ((this.zza.hashCode() ^ 1000003) * 1000003);
        int v2_5 = this.zzb;
        if (v2_5 != 0) {
            v2_0 = v2_5.hashCode();
        } else {
            v2_0 = 0;
        }
        return (((((((v0_10 ^ v2_0) * 1000003) ^ this.zzc.hashCode()) * 1000003) ^ this.zzd.hashCode()) * 1000003) ^ this.zze.hashCode());
    }

    public final String toString()
    {
        String v0_0 = this.zza;
        String v1_0 = this.zzb;
        String v2 = this.zzc;
        String v3_1 = String.valueOf(this.zzd);
        String v4 = this.zze;
        String v0_1 = v1.a.r("RevokeTokenRequest{providerId=", v0_0, ", tenantId=", v1_0, ", token=");
        v0_1.append(v2);
        v0_1.append(", tokenType=");
        v0_1.append(v3_1);
        v0_1.append(", idToken=");
        return v1.a.n(v0_1, v4, "}");
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzahg zzb()
    {
        return this.zzd;
    }

    public final String zzc()
    {
        return this.zze;
    }

    public final String zzd()
    {
        return this.zza;
    }

    public final String zze()
    {
        return this.zzb;
    }

    public final String zzf()
    {
        return this.zzc;
    }
}
