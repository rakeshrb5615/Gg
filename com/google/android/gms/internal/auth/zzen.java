package com.google.android.gms.internal.auth;
final class zzen {
    private static final com.google.android.gms.internal.auth.zzel zza;
    private static final com.google.android.gms.internal.auth.zzel zzb;

    static zzen()
    {
        com.google.android.gms.internal.auth.zzen.zza = new com.google.android.gms.internal.auth.zzem();
        try {
        } catch (Exception) {
        }
        com.google.android.gms.internal.auth.zzen.zzb = ((com.google.android.gms.internal.auth.zzel) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(0).newInstance(0));
        return;
    }

    public static com.google.android.gms.internal.auth.zzel zza()
    {
        IllegalStateException v0_0 = com.google.android.gms.internal.auth.zzen.zzb;
        if (v0_0 == null) {
            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
        } else {
            return v0_0;
        }
    }

    public static com.google.android.gms.internal.auth.zzel zzb()
    {
        return com.google.android.gms.internal.auth.zzen.zza;
    }
}
