package com.google.android.gms.internal.firebase-auth-api;
public abstract class zzaie implements com.google.android.gms.internal.firebase-auth-api.zzafa {

    public zzaie()
    {
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzaih zzg()
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzagr();
    }

    public final String zza()
    {
        String v0_1 = new org.json.JSONObject();
        v0_1.put("idToken", this.zzc());
        v0_1.put("token", this.zzf());
        v0_1.put("providerId", this.zzd());
        v0_1.put("tokenType", this.zzb().toString());
        v0_1.put("tenantId", this.zze());
        return v0_1.toString();
    }

    public abstract com.google.android.gms.internal.firebase-auth-api.zzahg zzb();

    public abstract String zzc();

    public abstract String zzd();

    public abstract String zze();

    public abstract String zzf();
}
