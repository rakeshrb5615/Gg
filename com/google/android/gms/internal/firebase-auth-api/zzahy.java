package com.google.android.gms.internal.firebase-auth-api;
public final class zzahy {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final long zzd;
    private final com.google.android.gms.internal.firebase-auth-api.zzaiz zze;

    private zzahy(String p2, String p3, String p4, long p5, com.google.android.gms.internal.firebase-auth-api.zzaiz p7)
    {
        if ((!android.text.TextUtils.isEmpty(p2)) && (p7 != null)) {
            android.util.Log.e("MfaInfo", "Cannot have both MFA phone_info and totp_info");
            throw new IllegalArgumentException("Cannot have both MFA phone_info and totp_info");
        } else {
            this.zza = p2;
            this.zzb = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p3);
            this.zzc = p4;
            this.zzd = p5;
            this.zze = p7;
            return;
        }
    }

    private static long zza(String p3)
    {
        try {
            return com.google.android.gms.internal.firebase-auth-api.zzaoo.zza(com.google.android.gms.internal.firebase-auth-api.zzaoo.zza(p3));
        } catch (long v0_3) {
            String v1_2 = new StringBuilder("Could not parse timestamp as ISOString. Invalid ISOString \"");
            v1_2.append(p3);
            v1_2.append("\"");
            android.util.Log.w("MfaInfo", v1_2.toString(), v0_3);
            return 0;
        }
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzahy zza(org.json.JSONObject p7)
    {
        int v6_2;
        String v1_3 = com.google.android.gms.common.util.Strings.emptyToNull(p7.optString("phoneInfo"));
        String v2_0 = com.google.android.gms.common.util.Strings.emptyToNull(p7.optString("mfaEnrollmentId"));
        String v3_2 = com.google.android.gms.common.util.Strings.emptyToNull(p7.optString("displayName"));
        long v4_2 = com.google.android.gms.internal.firebase-auth-api.zzahy.zza(p7.optString("enrolledAt", ""));
        if (p7.opt("totpInfo") == null) {
            v6_2 = 0;
        } else {
            v6_2 = new com.google.android.gms.internal.firebase-auth-api.zzaiz();
        }
        com.google.android.gms.internal.firebase-auth-api.zzahy v0_1 = new com.google.android.gms.internal.firebase-auth-api.zzahy(v1_3, v2_0, v3_2, v4_2, v6_2);
        p7.optString("unobfuscatedPhoneInfo");
        return v0_1;
    }

    public static java.util.List zza(org.json.JSONArray p3)
    {
        if ((p3 != null) && (p3.length() != 0)) {
            java.util.ArrayList v0_2 = new java.util.ArrayList();
            int v1 = 0;
            while (v1 < p3.length()) {
                v0_2.add(com.google.android.gms.internal.firebase-auth-api.zzahy.zza(p3.getJSONObject(v1)));
                v1++;
            }
            return v0_2;
        } else {
            return new java.util.ArrayList();
        }
    }

    public final long zza()
    {
        return this.zzd;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzaiz zzb()
    {
        return this.zze;
    }

    public final String zzc()
    {
        return this.zzc;
    }

    public final String zzd()
    {
        return this.zzb;
    }

    public final String zze()
    {
        return this.zza;
    }
}
