package com.google.android.gms.internal.firebase-auth-api;
public final class zznf implements com.google.android.gms.internal.firebase-auth-api.zzby {
    private final android.content.SharedPreferences$Editor zza;
    private final String zzb;

    public zznf(android.content.Context p1, String p2, String p3)
    {
        if (p2 == 0) {
            throw new IllegalArgumentException("keysetName cannot be null");
        } else {
            this.zzb = p2;
            android.content.SharedPreferences$Editor v1_7 = p1.getApplicationContext();
            if (p3 != null) {
                this.zza = v1_7.getSharedPreferences(p3, 0).edit();
                return;
            } else {
                this.zza = android.preference.PreferenceManager.getDefaultSharedPreferences(v1_7).edit();
                return;
            }
        }
    }

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzvv p3)
    {
        if (!this.zza.putString(this.zzb, com.google.android.gms.internal.firebase-auth-api.zzzx.zza(p3.zzk())).commit()) {
            throw new java.io.IOException("Failed to write to SharedPreferences");
        } else {
            return;
        }
    }

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzxh p3)
    {
        if (!this.zza.putString(this.zzb, com.google.android.gms.internal.firebase-auth-api.zzzx.zza(p3.zzk())).commit()) {
            throw new java.io.IOException("Failed to write to SharedPreferences");
        } else {
            return;
        }
    }
}
