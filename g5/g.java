package g5;
public abstract class g {
    public static final char[] a;

    static g()
    {
        char[] v0_1 = new char[16];
        v0_1 = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
        g5.g.a = v0_1;
        return;
    }

    public static declared_synchronized long a(android.content.Context p3)
    {
        long v1_1 = new android.app.ActivityManager$MemoryInfo();
        ((android.app.ActivityManager) p3.getSystemService("activity")).getMemoryInfo(v1_1);
        return v1_1.totalMem;
    }

    public static void b(java.io.Closeable p1, String p2)
    {
        if (p1 != null) {
            try {
                p1.close();
                return;
            } catch (java.io.IOException v1_1) {
                android.util.Log.e("FirebaseCrashlytics", p2, v1_1);
            }
        }
        return;
    }

    public static int c()
    {
        int v0_0 = g5.g.f();
        if (g5.g.g()) {
            v0_0 |= 2;
        }
        if ((!android.os.Debug.isDebuggerConnected()) && (!android.os.Debug.waitingForDebugger())) {
            return v0_0;
        } else {
            return (v0_0 | 4);
        }
    }

    public static int d(android.content.Context p3, String p4, String p5)
    {
        String v1_0;
        android.content.res.Resources v0 = p3.getResources();
        String v1_3 = p3.getApplicationContext().getApplicationInfo().icon;
        if (v1_3 <= null) {
            v1_0 = p3.getPackageName();
        } else {
            try {
                v1_0 = p3.getResources().getResourcePackageName(v1_3);
            } catch (android.content.res.Resources$NotFoundException) {
                v1_0 = p3.getPackageName();
            }
            if ("android".equals(v1_0)) {
                v1_0 = p3.getPackageName();
            }
        }
        return v0.getIdentifier(p4, p5, v1_0);
    }

    public static String e(byte[] p6)
    {
        char[] v0_2 = new char[(p6.length * 2)];
        int v1 = 0;
        while (v1 < p6.length) {
            char v2_3 = p6[v1];
            int v4_0 = (v1 * 2);
            char[] v5 = g5.g.a;
            v0_2[v4_0] = v5[((v2_3 & 255) >> 4)];
            v0_2[(v4_0 + 1)] = v5[(v2_3 & 15)];
            v1++;
        }
        return new String(v0_2);
    }

    public static boolean f()
    {
        if (!android.os.Build.PRODUCT.contains("sdk")) {
            int v0_5 = android.os.Build.HARDWARE;
            if ((!v0_5.contains("goldfish")) && (!v0_5.contains("ranchu"))) {
                return 0;
            }
        }
        return 1;
    }

    public static boolean g()
    {
        int v0_0 = g5.g.f();
        java.io.File v1_5 = android.os.Build.TAGS;
        if ((v0_0 != 0) || ((v1_5 == null) || (!v1_5.contains("test-keys")))) {
            if (!new java.io.File("/system/app/Superuser.apk").exists()) {
                java.io.File v1_4 = new java.io.File("/system/xbin/su");
                if ((v0_0 != 0) || (!v1_4.exists())) {
                    return 0;
                } else {
                    return 1;
                }
            } else {
                return 1;
            }
        } else {
            return 1;
        }
    }

    public static String h(String p2)
    {
        String v2_3 = p2.getBytes();
        try {
            String v0_2 = java.security.MessageDigest.getInstance("SHA-1");
            v0_2.update(v2_3);
            return g5.g.e(v0_2.digest());
        } catch (String v2_1) {
            android.util.Log.e("FirebaseCrashlytics", "Could not create hashing algorithm: SHA-1, returning empty string.", v2_1);
            return "";
        }
    }

    public static String i(java.io.FileInputStream p1)
    {
        Throwable v1_3 = new java.util.Scanner(p1).useDelimiter("\\A");
        String v0_2;
        if (!v1_3.hasNext()) {
            v0_2 = "";
        } else {
            v0_2 = v1_3.next();
        }
        v1_3.close();
        return v0_2;
    }
}
