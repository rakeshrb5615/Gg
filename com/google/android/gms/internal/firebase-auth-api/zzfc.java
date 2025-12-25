package com.google.android.gms.internal.firebase-auth-api;
public final class zzfc extends com.google.android.gms.internal.firebase-auth-api.zzcy {
    private final com.google.android.gms.internal.firebase-auth-api.zzfc$zzc zza;
    private final String zzb;
    private final com.google.android.gms.internal.firebase-auth-api.zzfc$zza zzc;
    private final com.google.android.gms.internal.firebase-auth-api.zzcy zzd;

    private zzfc(com.google.android.gms.internal.firebase-auth-api.zzfc$zzc p1, String p2, com.google.android.gms.internal.firebase-auth-api.zzfc$zza p3, com.google.android.gms.internal.firebase-auth-api.zzcy p4)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        this.zzd = p4;
        return;
    }

    public synthetic zzfc(com.google.android.gms.internal.firebase-auth-api.zzfc$zzc p1, String p2, com.google.android.gms.internal.firebase-auth-api.zzfc$zza p3, com.google.android.gms.internal.firebase-auth-api.zzcy p4, com.google.android.gms.internal.firebase-auth-api.zzfe p5)
    {
        this(p1, p2, p3, p4);
        return;
    }

    public final boolean equals(Object p4)
    {
        if ((p4 instanceof com.google.android.gms.internal.firebase-auth-api.zzfc)) {
            if ((!((com.google.android.gms.internal.firebase-auth-api.zzfc) p4).zzc.equals(this.zzc)) || ((!((com.google.android.gms.internal.firebase-auth-api.zzfc) p4).zzd.equals(this.zzd)) || ((!((com.google.android.gms.internal.firebase-auth-api.zzfc) p4).zzb.equals(this.zzb)) || (!((com.google.android.gms.internal.firebase-auth-api.zzfc) p4).zza.equals(this.zza))))) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public final int hashCode()
    {
        return java.util.Objects.hash(new Object[] {com.google.android.gms.internal.firebase-auth-api.zzfc, this.zzb, this.zzc, this.zzd, this.zza}));
    }

    public final String toString()
    {
        String v0_0 = this.zzb;
        String v1_3 = String.valueOf(this.zzc);
        String v2_1 = String.valueOf(this.zzd);
        String v3_1 = String.valueOf(this.zza);
        String v0_1 = v1.a.r("LegacyKmsEnvelopeAead Parameters (kekUri: ", v0_0, ", dekParsingStrategy: ", v1_3, ", dekParametersForNewKeys: ");
        v0_1.append(v2_1);
        v0_1.append(", variant: ");
        v0_1.append(v3_1);
        v0_1.append(")");
        return v0_1.toString();
    }

    public final boolean zza()
    {
        if (this.zza == com.google.android.gms.internal.firebase-auth-api.zzfc$zzc.zzb) {
            return 0;
        } else {
            return 1;
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzcy zzb()
    {
        return this.zzd;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzfc$zzc zzc()
    {
        return this.zza;
    }

    public final String zzd()
    {
        return this.zzb;
    }
}
