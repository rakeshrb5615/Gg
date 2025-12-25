package com.google.android.gms.internal.firebase-auth-api;
public class zzahq implements com.google.android.gms.internal.firebase-auth-api.zzaez {
    private static final String zza = "zzahq";
    private java.util.List zzb;

    public zzahq()
    {
        return;
    }

    private final com.google.android.gms.internal.firebase-auth-api.zzahq zzb(String p5)
    {
        try {
            org.json.JSONException v0_1 = new org.json.JSONObject(p5);
            this.zzb = new java.util.ArrayList();
            org.json.JSONException v0_3 = v0_1.optJSONArray("authorizedDomains");
        } catch (org.json.JSONException v0_2) {
            throw com.google.android.gms.internal.firebase-auth-api.zzajk.zza(v0_2, com.google.android.gms.internal.firebase-auth-api.zzahq.zza, p5);
        }
        if (v0_3 != null) {
            int v1_2 = 0;
            while (v1_2 < v0_3.length()) {
                this.zzb.add(v0_3.getString(v1_2));
                v1_2++;
            }
        }
        return this;
    }

    public final synthetic com.google.android.gms.internal.firebase-auth-api.zzaez zza(String p1)
    {
        return this.zzb(p1);
    }

    public final java.util.List zza()
    {
        return this.zzb;
    }
}
