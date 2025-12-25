package com.google.android.gms.internal.firebase-auth-api;
public final enum class zzahh extends java.lang.Enum {
    public static final enum com.google.android.gms.internal.firebase-auth-api.zzahh zza;
    private static final enum com.google.android.gms.internal.firebase-auth-api.zzahh zzb;
    private static final synthetic com.google.android.gms.internal.firebase-auth-api.zzahh[] zzc;
    private final String zzd;

    static zzahh()
    {
        com.google.android.gms.internal.firebase-auth-api.zzahh[] v0_2 = new com.google.android.gms.internal.firebase-auth-api.zzahh("REFRESH_TOKEN", 0, "refresh_token");
        com.google.android.gms.internal.firebase-auth-api.zzahh.zza = v0_2;
        com.google.android.gms.internal.firebase-auth-api.zzahh v1_1 = new com.google.android.gms.internal.firebase-auth-api.zzahh("AUTHORIZATION_CODE", 1, "authorization_code");
        com.google.android.gms.internal.firebase-auth-api.zzahh.zzb = v1_1;
        com.google.android.gms.internal.firebase-auth-api.zzahh.zzc = new com.google.android.gms.internal.firebase-auth-api.zzahh[] {v0_2, v1_1});
        return;
    }

    private zzahh(String p1, int p2, String p3)
    {
        super(p1, p2);
        super.zzd = p3;
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzahh[] values()
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzahh[]) com.google.android.gms.internal.firebase-auth-api.zzahh.zzc.clone());
    }

    public final String toString()
    {
        return this.zzd;
    }
}
