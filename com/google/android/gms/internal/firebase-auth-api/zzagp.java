package com.google.android.gms.internal.firebase-auth-api;
final class zzagp extends com.google.android.gms.internal.firebase-auth-api.zzaid {
    private final String zza;
    private final String zzb;

    public zzagp(String p1, String p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final boolean equals(Object p5)
    {
        if (p5 != this) {
            if ((p5 instanceof com.google.android.gms.internal.firebase-auth-api.zzaid)) {
                String v1_4 = this.zza;
                if (v1_4 != null) {
                    if (!v1_4.equals(((com.google.android.gms.internal.firebase-auth-api.zzaid) p5).zzb())) {
                        return 0;
                    }
                } else {
                    if (((com.google.android.gms.internal.firebase-auth-api.zzaid) p5).zzb() != null) {
                        return 0;
                    }
                }
                String v1_2 = this.zzb;
                if (v1_2 != null) {
                    if (!v1_2.equals(((com.google.android.gms.internal.firebase-auth-api.zzaid) p5).zza())) {
                        return 0;
                    }
                } else {
                    if (((com.google.android.gms.internal.firebase-auth-api.zzaid) p5).zza() != null) {
                        return 0;
                    }
                }
                return 1;
            }
            return 0;
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        int v0_2;
        int v0_0 = this.zza;
        int v1 = 0;
        if (v0_0 != 0) {
            v0_2 = v0_0.hashCode();
        } else {
            v0_2 = 0;
        }
        int v0_4 = ((v0_2 ^ 1000003) * 1000003);
        String v2_1 = this.zzb;
        if (v2_1 != null) {
            v1 = v2_1.hashCode();
        }
        return (v0_4 ^ v1);
    }

    public final String toString()
    {
        String v0_0 = this.zza;
        String v1 = this.zzb;
        StringBuilder v2_1 = new StringBuilder("RecaptchaEnforcementState{provider=");
        v2_1.append(v0_0);
        v2_1.append(", enforcementState=");
        v2_1.append(v1);
        v2_1.append("}");
        return v2_1.toString();
    }

    public final String zza()
    {
        return this.zzb;
    }

    public final String zzb()
    {
        return this.zza;
    }
}
