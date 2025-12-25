package com.google.android.gms.internal.auth;
public final class zzcr {
    private static final r.e zza;

    static zzcr()
    {
        com.google.android.gms.internal.auth.zzcr.zza = new r.e(0);
        return;
    }

    public static declared_synchronized android.net.Uri zza(String p4)
    {
        r.e v1 = com.google.android.gms.internal.auth.zzcr.zza;
        android.net.Uri v2_4 = ((android.net.Uri) v1.get("com.google.android.gms.auth_account"));
        if (v2_4 != null) {
            return v2_4;
        } else {
            android.net.Uri v2_2 = android.net.Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(android.net.Uri.encode("com.google.android.gms.auth_account"))));
            v1.put("com.google.android.gms.auth_account", v2_2);
            return v2_2;
        }
    }
}
