package com.google.android.gms.internal.firebase-auth-api;
public final class zzajb extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.internal.firebase-auth-api.zzafa {
    public static final android.os.Parcelable$Creator CREATOR;
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private String zzg;
    private String zzh;
    private boolean zzi;
    private boolean zzj;
    private String zzk;
    private String zzl;
    private String zzm;
    private String zzn;
    private boolean zzo;
    private String zzp;

    static zzajb()
    {
        com.google.android.gms.internal.firebase-auth-api.zzajb.CREATOR = new com.google.android.gms.internal.firebase-auth-api.zzaja();
        return;
    }

    public zzajb()
    {
        this.zzi = 1;
        this.zzj = 1;
        return;
    }

    public zzajb(String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8, String p9)
    {
        this.zza = "http://localhost";
        this.zzc = p1;
        this.zzd = p2;
        this.zzh = p5;
        this.zzk = p6;
        this.zzn = p7;
        this.zzp = p8;
        this.zzi = 1;
        if ((android.text.TextUtils.isEmpty(p1)) && ((android.text.TextUtils.isEmpty(this.zzd)) && (android.text.TextUtils.isEmpty(this.zzk)))) {
            throw new IllegalArgumentException("idToken, accessToken and authCode cannot all be null");
        } else {
            this.zze = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p3);
            this.zzf = 0;
            String v1_11 = new StringBuilder();
            if (!android.text.TextUtils.isEmpty(this.zzc)) {
                v1_11.append("id_token=");
                v1_11.append(this.zzc);
                v1_11.append("&");
            }
            if (!android.text.TextUtils.isEmpty(this.zzd)) {
                v1_11.append("access_token=");
                v1_11.append(this.zzd);
                v1_11.append("&");
            }
            if (!android.text.TextUtils.isEmpty(this.zzf)) {
                v1_11.append("identifier=");
                v1_11.append(this.zzf);
                v1_11.append("&");
            }
            if (!android.text.TextUtils.isEmpty(this.zzh)) {
                v1_11.append("oauth_token_secret=");
                v1_11.append(this.zzh);
                v1_11.append("&");
            }
            if (!android.text.TextUtils.isEmpty(this.zzk)) {
                v1_11.append("code=");
                v1_11.append(this.zzk);
                v1_11.append("&");
            }
            if (!android.text.TextUtils.isEmpty(p9)) {
                v1_11.append("nonce=");
                v1_11.append(p9);
                v1_11.append("&");
            }
            v1_11.append("providerId=");
            v1_11.append(this.zze);
            this.zzg = v1_11.toString();
            this.zzj = 1;
            return;
        }
    }

    public zzajb(String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8, boolean p9, boolean p10, String p11, String p12, String p13, String p14, boolean p15, String p16)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        this.zzd = p4;
        this.zze = p5;
        this.zzf = p6;
        this.zzg = p7;
        this.zzh = p8;
        this.zzi = p9;
        this.zzj = p10;
        this.zzk = p11;
        this.zzl = p12;
        this.zzm = p13;
        this.zzn = p14;
        this.zzo = p15;
        this.zzp = p16;
        return;
    }

    public zzajb(z4.b0 p2, String p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2);
        this.zzl = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p2.a);
        this.zzm = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p3);
        this.zze = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p2.c);
        this.zzi = 1;
        String v2_4 = new StringBuilder("providerId=");
        v2_4.append(this.zze);
        this.zzg = v2_4.toString();
        return;
    }

    public final void writeToParcel(android.os.Parcel p4, int p5)
    {
        p5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 2, this.zza, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 3, this.zzb, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 4, this.zzc, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 5, this.zzd, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 6, this.zze, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 7, this.zzf, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 8, this.zzg, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 9, this.zzh, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p4, 10, this.zzi);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p4, 11, this.zzj);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 12, this.zzk, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 13, this.zzl, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 14, this.zzm, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 15, this.zzn, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p4, 16, this.zzo);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 17, this.zzp, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, p5);
        return;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzajb zza(String p1)
    {
        this.zzb = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p1);
        return this;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzajb zza(boolean p1)
    {
        this.zzj = 0;
        return this;
    }

    public final String zza()
    {
        String v0_1 = new org.json.JSONObject();
        v0_1.put("autoCreate", this.zzj);
        v0_1.put("returnSecureToken", this.zzi);
        String v1_13 = this.zzb;
        if (v1_13 != null) {
            v0_1.put("idToken", v1_13);
        }
        String v1_0 = this.zzg;
        if (v1_0 != null) {
            v0_1.put("postBody", v1_0);
        }
        String v1_1 = this.zzn;
        if (v1_1 != null) {
            v0_1.put("tenantId", v1_1);
        }
        String v1_3 = this.zzp;
        if (v1_3 != null) {
            v0_1.put("pendingToken", v1_3);
        }
        if (!android.text.TextUtils.isEmpty(this.zzl)) {
            v0_1.put("sessionId", this.zzl);
        }
        if (android.text.TextUtils.isEmpty(this.zzm)) {
            String v1_9 = this.zza;
            if (v1_9 != null) {
                v0_1.put("requestUri", v1_9);
            }
        } else {
            v0_1.put("requestUri", this.zzm);
        }
        v0_1.put("returnIdpCredential", this.zzo);
        return v0_1.toString();
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzajb zzb(String p1)
    {
        this.zzn = p1;
        return this;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzajb zzb(boolean p1)
    {
        this.zzo = 1;
        return this;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzajb zzc(boolean p1)
    {
        this.zzi = 1;
        return this;
    }
}
