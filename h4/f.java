package h4;
public final class f {
    public static final d4.l c;
    public final i4.h a;
    public final String b;

    static f()
    {
        h4.f.c = new d4.l("ReviewService", 3);
        return;
    }

    public f(android.content.Context p11)
    {
        this.b = p11.getPackageName();
        d4.l v2_0 = i4.i.a;
        try {
            if (p11.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                try {
                    android.content.Intent v0_2 = p11.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                } catch (android.content.pm.PackageManager$NameNotFoundException) {
                    String v11_3 = new Object[0];
                    v2_0.h(v0_2, v11_3);
                }
                if (v0_2 != null) {
                    int v4_4 = v0_2.length;
                    if (v4_4 != 0) {
                        java.util.ArrayList v5_2 = new java.util.ArrayList();
                        int v6 = 0;
                        while (v6 < v4_4) {
                            boolean v7_1 = v0_2[v6].toByteArray();
                            try {
                                String v8_1 = java.security.MessageDigest.getInstance("SHA-256");
                                v8_1.update(v7_1);
                                boolean v7_3 = android.util.Base64.encodeToString(v8_1.digest(), 11);
                            } catch (java.security.NoSuchAlgorithmException) {
                                v7_3 = "";
                            }
                            v5_2.add(v7_3);
                            if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(v7_3)) {
                                String v8_5 = android.os.Build.TAGS;
                                if (((!v8_5.contains("dev-keys")) && (!v8_5.contains("test-keys"))) || (!"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(v7_3))) {
                                    v6++;
                                }
                            }
                            this.a = new i4.h(p11, h4.f.c, new android.content.Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"));
                            return;
                        }
                        String v11_5 = new StringBuilder();
                        android.content.Intent v0_3 = v5_2.iterator();
                        if (v0_3.hasNext()) {
                            while(true) {
                                v11_5.append(((CharSequence) v0_3.next()));
                                if (!v0_3.hasNext()) {
                                    break;
                                }
                                v11_5.append(", ");
                            }
                        }
                        android.content.Intent v0_6 = new Object[0];
                        v2_0.h(v1.a.l("Play Store package certs are not valid. Found these sha256 certs: [", v11_5.toString(), "]."), v0_6);
                    }
                }
                String v11_8 = new Object[0];
                v2_0.h("Play Store package is not signed -- possibly self-built package. Could not verify.", v11_8);
                return;
            } else {
                String v11_1 = new Object[0];
                v2_0.h("Play Store package is disabled.", v11_1);
                return;
            }
        } catch (android.content.pm.PackageManager$NameNotFoundException) {
            String v11_2 = new Object[0];
            v2_0.h("Play Store package is not found.", v11_2);
        }
        return;
    }
}
