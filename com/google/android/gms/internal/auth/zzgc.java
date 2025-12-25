package com.google.android.gms.internal.auth;
final class zzgc {
    private static final com.google.android.gms.internal.auth.zzgb zza;
    private static final com.google.android.gms.internal.auth.zzgb zzb;

    static zzgc()
    {
        try {
        } catch (Exception) {
        }
        com.google.android.gms.internal.auth.zzgc.zza = ((com.google.android.gms.internal.auth.zzgb) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(0).newInstance(0));
        com.google.android.gms.internal.auth.zzgc.zzb = new com.google.android.gms.internal.auth.zzgb();
        return;
    }

    public static com.google.android.gms.internal.auth.zzgb zza()
    {
        return com.google.android.gms.internal.auth.zzgc.zza;
    }

    public static com.google.android.gms.internal.auth.zzgb zzb()
    {
        return com.google.android.gms.internal.auth.zzgc.zzb;
    }
}
