package com.google.android.gms.internal.firebase-auth-api;
public class zzagx implements com.google.android.gms.internal.firebase-auth-api.zzafa {
    private static final String zza = "zzagx";
    private final String zzb;
    private final String zzc;
    private final y4.d zzd;
    private final String zze;
    private final String zzf;

    static zzagx()
    {
        String[] v1_1 = new String[0];
        new com.google.android.gms.common.logging.Logger("zzagx", v1_1);
        return;
    }

    public zzagx(y4.d p2, String p3, String p4)
    {
        this.zzd = ((y4.d) com.google.android.gms.common.internal.Preconditions.checkNotNull(p2));
        this.zzb = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p2.a);
        this.zzc = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p2.c);
        this.zze = p3;
        this.zzf = p4;
        return;
    }

    public final String zza()
    {
        String v0_0 = this.zzc;
        String vtmp1 = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v0_0);
        String v1_0 = 0;
        try {
            org.json.JSONObject v2_3 = new y4.b(v0_0);
        } catch (IllegalArgumentException) {
            v2_3 = 0;
        }
        String v0_5;
        if (v2_3 == null) {
            v0_5 = 0;
        } else {
            v0_5 = v2_3.a;
        }
        if (v2_3 != null) {
            v1_0 = v2_3.b;
        }
        org.json.JSONObject v2_1 = new org.json.JSONObject();
        v2_1.put("email", this.zzb);
        if (v0_5 != null) {
            v2_1.put("oobCode", v0_5);
        }
        if (v1_0 != null) {
            v2_1.put("tenantId", v1_0);
        }
        String v0_2 = this.zze;
        if (v0_2 != null) {
            v2_1.put("idToken", v0_2);
        }
        String v0_3 = this.zzf;
        if (v0_3 == null) {
            com.google.android.gms.internal.firebase-auth-api.zzajk.zza(v2_1);
        } else {
            com.google.android.gms.internal.firebase-auth-api.zzajk.zza(v2_1, "captchaResp", v0_3);
        }
        return v2_1.toString();
    }

    public final y4.d zzb()
    {
        return this.zzd;
    }

    public final String zzc()
    {
        return this.zzf;
    }
}
