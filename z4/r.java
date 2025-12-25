package z4;
public final class r {
    public static z4.r c;
    public final String a;
    public final com.google.android.gms.internal.firebase-auth-api.zzmy b;

    public r(String p1, com.google.android.gms.internal.firebase-auth-api.zzmy p2)
    {
        this.a = p1;
        this.b = p2;
        return;
    }

    public static z4.r a(android.content.Context p5, String p6)
    {
        z4.r v0_0 = z4.r.c;
        if ((v0_0 == null) || (!java.util.Objects.equals(v0_0.a, p6))) {
            try {
                com.google.android.gms.internal.firebase-auth-api.zzcl.zza();
                String v5_1 = z4.r.b(p5, p6);
            } catch (StringBuilder v1_0) {
                String v2_0 = v1_0.getMessage();
                String v3_1 = new StringBuilder("Exception encountered during crypto setup:\n");
                v3_1.append(v2_0);
                android.util.Log.e("FirebearStorageCryptoHelper", v3_1.toString());
                if ((v1_0 instanceof java.security.GeneralSecurityException)) {
                    StringBuilder v1_3 = new StringBuilder("com.google.firebase.auth.api.crypto.");
                    v1_3.append(p6);
                    v5_1.getSharedPreferences(v1_3.toString(), 0).edit().remove("StorageCryptoKeyset").apply();
                    try {
                        v5_1 = z4.r.b(v5_1, p6);
                    } catch (String v5_2) {
                        String v5_3 = v5_2.getMessage();
                        StringBuilder v1_9 = new StringBuilder("Exception encountered during second attempt to crypto setup:\n");
                        v1_9.append(v5_3);
                        android.util.Log.e("FirebearStorageCryptoHelper", v1_9.toString());
                    } catch (String v5_2) {
                    }
                }
                v5_1 = 0;
            } catch (StringBuilder v1_0) {
            }
            z4.r.c = new z4.r(p6, v5_1);
        }
        return z4.r.c;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzmy b(android.content.Context p3, String p4)
    {
        StringBuilder v0_1 = new com.google.android.gms.internal.firebase-auth-api.zzmy$zza();
        String v1_2 = new StringBuilder("com.google.firebase.auth.api.crypto.");
        v1_2.append(p4);
        com.google.android.gms.internal.firebase-auth-api.zzmy v3_2 = v0_1.zza(p3, "StorageCryptoKeyset", v1_2.toString()).zza(com.google.android.gms.internal.firebase-auth-api.zzcv.zzb);
        StringBuilder v0_4 = new StringBuilder("android-keystore://firebear_main_key_id_for_storage_crypto.");
        v0_4.append(p4);
        return v3_2.zza(v0_4.toString()).zza();
    }
}
