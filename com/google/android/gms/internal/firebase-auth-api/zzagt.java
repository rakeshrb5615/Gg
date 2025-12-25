package com.google.android.gms.internal.firebase-auth-api;
public class zzagt implements com.google.android.gms.internal.firebase-auth-api.zzaez {
    private static final String zza = "com.google.android.gms.internal.firebase-auth-api.zzagt";
    private String zzb;

    public zzagt()
    {
        return;
    }

    private final com.google.android.gms.internal.firebase-auth-api.zzagt zzb(String p7)
    {
        try {
            com.google.android.gms.internal.firebase-auth-api.zzacn v1_5 = new org.json.JSONObject(new org.json.JSONObject(p7).getString("error"));
            v1_5.getInt("code");
            this.zzb = v1_5.getString("message");
            return this;
        } catch (NullPointerException v0_3) {
            String v2_0 = v0_3.getMessage();
            StringBuilder v3_1 = new StringBuilder("Failed to parse error for string [");
            v3_1.append(p7);
            v3_1.append("] with exception: ");
            v3_1.append(v2_0);
            android.util.Log.e(com.google.android.gms.internal.firebase-auth-api.zzagt.zza, v3_1.toString());
            throw new com.google.android.gms.internal.firebase-auth-api.zzacn(v1.a.l("Failed to parse error for string [", p7, "]"), v0_3);
        } catch (NullPointerException v0_3) {
        }
    }

    public final synthetic com.google.android.gms.internal.firebase-auth-api.zzaez zza(String p1)
    {
        return this.zzb(p1);
    }

    public final String zza()
    {
        return this.zzb;
    }

    public final boolean zzb()
    {
        if (android.text.TextUtils.isEmpty(this.zzb)) {
            return 0;
        } else {
            return 1;
        }
    }
}
