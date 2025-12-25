package c4;
public final class l {
    public static final d4.l e;
    public static final android.content.Intent f;
    public final d4.r a;
    public final String b;
    public final android.content.Context c;
    public final c4.m d;

    static l()
    {
        c4.l.e = new d4.l("AppUpdateService", 0);
        c4.l.f = new android.content.Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");
        return;
    }

    public l(android.content.Context p6, c4.m p7)
    {
        this.b = p6.getPackageName();
        this.c = p6;
        this.d = p7;
        try {
            int v1_0 = 0;
        } catch (android.content.pm.PackageManager$NameNotFoundException) {
            return;
        }
        if (!p6.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
            return;
        } else {
            d4.r v7_2 = p6.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
            if (v7_2 != null) {
                d4.l v0_4 = v7_2.length;
                if (v0_4 == null) {
                    android.content.Context v6_1 = d4.a.a;
                    d4.r v7_5 = new Object[0];
                    v6_1.getClass();
                    if (!android.util.Log.isLoggable("PlayCore", 5)) {
                        return;
                    } else {
                        android.util.Log.w("PlayCore", d4.l.j(v6_1.b, "Phonesky package is not signed -- possibly self-built package. Could not verify.", v7_5));
                        return;
                    }
                }
                while (v1_0 < v0_4) {
                    boolean v2_2 = v7_2[v1_0].toByteArray();
                    try {
                        String v3_1 = java.security.MessageDigest.getInstance("SHA-256");
                        v3_1.update(v2_2);
                        boolean v2_4 = android.util.Base64.encodeToString(v3_1.digest(), 11);
                    } catch (java.security.NoSuchAlgorithmException) {
                        v2_4 = "";
                    }
                    if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(v2_4)) {
                        String v3_5 = android.os.Build.TAGS;
                        if (((!v3_5.contains("dev-keys")) && (!v3_5.contains("test-keys"))) || (!"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(v2_4))) {
                            v1_0++;
                        }
                    }
                    d4.l v0_5 = p6.getApplicationContext();
                    if (v0_5 != null) {
                        p6 = v0_5;
                    }
                    this.a = new d4.r(p6, c4.l.e, c4.l.f);
                    return;
                }
                return;
            }
        }
    }

    public static android.os.Bundle a(c4.l p3, String p4)
    {
        android.os.Bundle v0_1 = new android.os.Bundle();
        v0_1.putAll(c4.l.b());
        v0_1.putString("package.name", p4);
        try {
            int v3_5 = Integer.valueOf(p3.c.getPackageManager().getPackageInfo(p3.c.getPackageName(), 0).versionCode);
        } catch (android.content.pm.PackageManager$NameNotFoundException) {
            int v3_6 = new Object[0];
            String v4_1 = c4.l.e;
            v4_1.getClass();
            if (android.util.Log.isLoggable("PlayCore", 6)) {
                android.util.Log.e("PlayCore", d4.l.j(v4_1.b, "The current version of the app could not be retrieved", v3_6));
            }
            v3_5 = 0;
        }
        if (v3_5 != 0) {
            v0_1.putInt("app.version.code", v3_5.intValue());
        }
        return v0_1;
    }

    public static android.os.Bundle b()
    {
        Throwable v0_1 = new android.os.Bundle();
        String v1_1 = new android.os.Bundle();
        int v2 = d4.j;
        String v3_3 = d4.j.a;
        if (!v3_3.containsKey("app_update")) {
            java.util.HashMap v5_1 = new java.util.HashMap();
            v5_1.put("java", Integer.valueOf(11004));
            v3_3.put("app_update", v5_1);
        }
        String v3_1 = ((java.util.Map) v3_3.get("app_update"));
        v1_1.putInt("playcore_version_code", ((Integer) v3_1.get("java")).intValue());
        if (v3_1.containsKey("native")) {
            v1_1.putInt("playcore_native_version", ((Integer) v3_1.get("native")).intValue());
        }
        if (v3_1.containsKey("unity")) {
            v1_1.putInt("playcore_unity_version", ((Integer) v3_1.get("unity")).intValue());
        }
        v0_1.putAll(v1_1);
        v0_1.putInt("playcore.version.code", 11004);
        return v0_1;
    }
}
