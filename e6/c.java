package e6;
public final class c {
    public static final String[] c;
    public final android.content.SharedPreferences a;
    public final String b;

    static c()
    {
        e6.c.c = new String[] {"*", "FCM", "GCM", ""});
        return;
    }

    public c(q4.f p4)
    {
        p4.a();
        this.a = p4.a.getSharedPreferences("com.google.android.gms.appid", 0);
        p4.a();
        int v0_4 = p4.c;
        String v1_0 = v0_4.e;
        if (v1_0 == null) {
            p4.a();
            v1_0 = v0_4.b;
            if ((v1_0.startsWith("1:")) || (v1_0.startsWith("2:"))) {
                boolean v4_6 = v1_0.split(":");
                if (v4_6.length == 4) {
                    v1_0 = v4_6[1];
                    if (!v1_0.isEmpty()) {
                        this.b = v1_0;
                        return;
                    }
                }
                v1_0 = 0;
            }
        }
        this.b = v1_0;
        return;
    }

    public final String a()
    {
        try {
            String v1_7 = this.a.getString("|S||P|", 0);
        } catch (String v1_8) {
            throw v1_8;
        }
        if (v1_7 != null) {
            try {
                String v1_1 = java.security.KeyFactory.getInstance("RSA").generatePublic(new java.security.spec.X509EncodedKeySpec(android.util.Base64.decode(v1_7, 8)));
            } catch (String v1_2) {
                int v5_3 = new StringBuilder("Invalid key stored ");
                v5_3.append(v1_2);
                android.util.Log.w("ContentValues", v5_3.toString());
                v1_1 = 0;
            } catch (String v1_2) {
            } catch (String v1_2) {
            }
            if (v1_1 != null) {
                String v1_5 = java.security.MessageDigest.getInstance("SHA1").digest(v1_1.getEncoded());
                v1_5[0] = ((byte) (((v1_5[0] & 15) + 112) & 255));
                String v3_1 = android.util.Base64.encodeToString(v1_5, 0, 8, 11);
                return v3_1;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }
}
