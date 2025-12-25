package com.google.android.gms.internal.firebase-auth-api;
public final enum class zzahg extends java.lang.Enum {
    public static final enum com.google.android.gms.internal.firebase-auth-api.zzahg zza;
    private static final enum com.google.android.gms.internal.firebase-auth-api.zzahg zzb;
    private static final synthetic com.google.android.gms.internal.firebase-auth-api.zzahg[] zzc;
    private final String zzd;

    static zzahg()
    {
        com.google.android.gms.internal.firebase-auth-api.zzahg[] v0_2 = new com.google.android.gms.internal.firebase-auth-api.zzahg("ACCESS_TOKEN", 0, "ACCESS_TOKEN");
        com.google.android.gms.internal.firebase-auth-api.zzahg.zza = v0_2;
        com.google.android.gms.internal.firebase-auth-api.zzahg v1_2 = new com.google.android.gms.internal.firebase-auth-api.zzahg("ID_TOKEN", 1, "idToken");
        com.google.android.gms.internal.firebase-auth-api.zzahg.zzb = v1_2;
        com.google.android.gms.internal.firebase-auth-api.zzahg.zzc = new com.google.android.gms.internal.firebase-auth-api.zzahg[] {v0_2, v1_2});
        return;
    }

    private zzahg(String p1, int p2, String p3)
    {
        super(p1, p2);
        super.zzd = p3;
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzahg[] values()
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzahg[]) com.google.android.gms.internal.firebase-auth-api.zzahg.zzc.clone());
    }

    public final String toString()
    {
        return this.zzd;
    }
}
