package z4;
public final class a0 {
    public static z4.a0 c;
    public final String a;
    public final com.google.android.gms.internal.firebase-auth-api.zzmy b;

    public a0(android.content.Context p6, String p7)
    {
        this.a = p7;
        try {
            com.google.android.gms.internal.firebase-auth-api.zzkt.zza();
            com.google.android.gms.internal.firebase-auth-api.zzmy$zza v2_1 = new com.google.android.gms.internal.firebase-auth-api.zzmy$zza();
            StringBuilder v4_1 = new StringBuilder("com.google.firebase.auth.api.crypto.");
            v4_1.append(p7);
            int v6_2 = v2_1.zza(p6, "GenericIdpKeyset", v4_1.toString()).zza(com.google.android.gms.internal.firebase-auth-api.zzlh.zza);
            StringBuilder v1_4 = new StringBuilder("android-keystore://firebear_master_key_id.");
            v1_4.append(p7);
            v6_2.zza(v1_4.toString());
            int v6_3 = v6_2.zza();
        } catch (int v6_4) {
            int v6_5 = v6_4.getMessage();
            String v7_3 = new StringBuilder("Exception encountered during crypto setup:\n");
            v7_3.append(v6_5);
            android.util.Log.e("FirebearCryptoHelper", v7_3.toString());
            v6_3 = 0;
        } catch (int v6_4) {
        }
        this.b = v6_3;
        return;
    }

    public static z4.a0 c(android.content.Context p1, String p2)
    {
        z4.a0 v0_0 = z4.a0.c;
        if ((v0_0 == null) || (!java.util.Objects.equals(v0_0.a, p2))) {
            z4.a0.c = new z4.a0(p1, p2);
        }
        return z4.a0.c;
    }

    public final String a()
    {
        int v1 = 0;
        if (this.b != null) {
            Throwable v0_9 = new java.io.ByteArrayOutputStream();
            try {
            } catch (Throwable v0_4) {
                Throwable v0_5 = v0_4.getMessage();
                StringBuilder v3_1 = new StringBuilder("Exception encountered when attempting to get Public Key:\n");
                v3_1.append(v0_5);
                android.util.Log.e("FirebearCryptoHelper", v3_1.toString());
                return v1;
            } catch (Throwable v0_4) {
                v0_5 = v0_4.getMessage();
                v3_1 = new StringBuilder("Exception encountered when attempting to get Public Key:\n");
                v3_1.append(v0_5);
                android.util.Log.e("FirebearCryptoHelper", v3_1.toString());
                return v1;
            }
            this.b.zza().zzb().zza(com.google.android.gms.internal.firebase-auth-api.zzbc.zza(v0_9));
            v1 = 8;
            return android.util.Base64.encodeToString(v0_9.toByteArray(), 8);
        } else {
            android.util.Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to get Public key");
            return 0;
        }
    }

    public final String b(String p6)
    {
        if (this.b != null) {
            try {
            } catch (Throwable v6_4) {
                Throwable v6_5 = v6_4.getMessage();
                StringBuilder v2_5 = new StringBuilder("Exception encountered while decrypting bytes:\n");
                v2_5.append(v6_5);
                android.util.Log.e("FirebearCryptoHelper", v2_5.toString());
                return 0;
            } catch (Throwable v6_4) {
                v6_5 = v6_4.getMessage();
                v2_5 = new StringBuilder("Exception encountered while decrypting bytes:\n");
                v2_5.append(v6_5);
                android.util.Log.e("FirebearCryptoHelper", v2_5.toString());
                return 0;
            }
            return new String(((com.google.android.gms.internal.firebase-auth-api.zzbd) this.b.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzks.zza(), com.google.android.gms.internal.firebase-auth-api.zzbd)).zza(android.util.Base64.decode(p6, 8), 0), "UTF-8");
        } else {
            android.util.Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to decrypt payload");
            return 0;
        }
    }
}
