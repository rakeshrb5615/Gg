package com.google.android.gms.internal.firebase-auth-api;
public class zzahv extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.internal.firebase-auth-api.zzaez {
    public static final android.os.Parcelable$Creator CREATOR = None;
    private static final String zza = "zzahv";
    private String zzb;
    private String zzc;
    private Long zzd;
    private String zze;
    private Long zzf;

    static zzahv()
    {
        com.google.android.gms.internal.firebase-auth-api.zzahv.CREATOR = new com.google.android.gms.internal.firebase-auth-api.zzahu();
        return;
    }

    public zzahv()
    {
        this.zzf = Long.valueOf(System.currentTimeMillis());
        return;
    }

    public zzahv(String p9, String p10, Long p11, String p12)
    {
        this(p9, p10, p11, p12, Long.valueOf(System.currentTimeMillis()));
        return;
    }

    public zzahv(String p1, String p2, Long p3, String p4, Long p5)
    {
        this.zzb = p1;
        this.zzc = p2;
        this.zzd = p3;
        this.zze = p4;
        this.zzf = p5;
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzahv zzb(String p5)
    {
        try {
            com.google.android.gms.internal.firebase-auth-api.zzaao v0_1 = new org.json.JSONObject(p5);
            org.json.JSONException v5_2 = new com.google.android.gms.internal.firebase-auth-api.zzahv();
            v5_2.zzb = v0_1.optString("refresh_token", 0);
            v5_2.zzc = v0_1.optString("access_token", 0);
            v5_2.zzd = Long.valueOf(v0_1.optLong("expires_in"));
            v5_2.zze = v0_1.optString("token_type", 0);
            v5_2.zzf = Long.valueOf(v0_1.optLong("issued_at"));
            return v5_2;
        } catch (org.json.JSONException v5_3) {
            android.util.Log.d(com.google.android.gms.internal.firebase-auth-api.zzahv.zza, "Failed to read GetTokenResponse from JSONObject");
            throw new com.google.android.gms.internal.firebase-auth-api.zzaao(v5_3);
        }
    }

    private final com.google.android.gms.internal.firebase-auth-api.zzahv zzd(String p5)
    {
        try {
            NullPointerException v0_1 = new org.json.JSONObject(p5);
            this.zzb = com.google.android.gms.common.util.Strings.emptyToNull(v0_1.optString("refresh_token"));
            this.zzc = com.google.android.gms.common.util.Strings.emptyToNull(v0_1.optString("access_token"));
            this.zzd = Long.valueOf(v0_1.optLong("expires_in", 0));
            this.zze = com.google.android.gms.common.util.Strings.emptyToNull(v0_1.optString("token_type"));
            this.zzf = Long.valueOf(System.currentTimeMillis());
            return this;
        } catch (NullPointerException v0_6) {
            throw com.google.android.gms.internal.firebase-auth-api.zzajk.zza(v0_6, com.google.android.gms.internal.firebase-auth-api.zzahv.zza, p5);
        } catch (NullPointerException v0_6) {
        }
    }

    public void writeToParcel(android.os.Parcel p4, int p5)
    {
        p5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 2, this.zzb, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 3, this.zzc, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLongObject(p4, 4, Long.valueOf(this.zza()), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 5, this.zze, 0);
        Long v0_3 = this.zzf;
        v0_3.longValue();
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLongObject(p4, 6, v0_3, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, p5);
        return;
    }

    public final long zza()
    {
        long v0_0 = this.zzd;
        if (v0_0 != 0) {
            return v0_0.longValue();
        } else {
            return 0;
        }
    }

    public final synthetic com.google.android.gms.internal.firebase-auth-api.zzaez zza(String p1)
    {
        return this.zzd(p1);
    }

    public final long zzb()
    {
        return this.zzf.longValue();
    }

    public final String zzc()
    {
        return this.zzc;
    }

    public final void zzc(String p1)
    {
        this.zzb = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p1);
        return;
    }

    public final String zzd()
    {
        return this.zzb;
    }

    public final String zze()
    {
        return this.zze;
    }

    public final String zzf()
    {
        org.json.JSONException v0_1 = new org.json.JSONObject();
        try {
            v0_1.put("refresh_token", this.zzb);
            v0_1.put("access_token", this.zzc);
            v0_1.put("expires_in", this.zzd);
            v0_1.put("token_type", this.zze);
            v0_1.put("issued_at", this.zzf);
            return v0_1.toString();
        } catch (org.json.JSONException v0_3) {
            android.util.Log.d(com.google.android.gms.internal.firebase-auth-api.zzahv.zza, "Failed to convert GetTokenResponse to JSON");
            throw new com.google.android.gms.internal.firebase-auth-api.zzaao(v0_3);
        }
    }

    public final boolean zzg()
    {
        if ((com.google.android.gms.common.util.DefaultClock.getInstance().currentTimeMillis() + 300000) >= ((this.zzd.longValue() * 1000) + this.zzf.longValue())) {
            return 0;
        } else {
            return 1;
        }
    }
}
