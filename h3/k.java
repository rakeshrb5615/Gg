package h3;
public final class k {
    public int a;
    public int b;
    public Object c;
    public Object d;
    public java.io.Serializable e;

    public static String b(q4.f p3)
    {
        p3.a();
        boolean v0_0 = p3.c;
        int v1_1 = v0_0.e;
        if (v1_1 == 0) {
            p3.a();
            String v3_3 = v0_0.b;
            if (v3_3.startsWith("1:")) {
                String v3_1 = v3_3.split(":");
                if (v3_1.length >= 2) {
                    String v3_2 = v3_1[1];
                    if (!v3_2.isEmpty()) {
                        return v3_2;
                    } else {
                        return 0;
                    }
                } else {
                    return 0;
                }
            } else {
                return v3_3;
            }
        } else {
            return v1_1;
        }
    }

    public declared_synchronized String a()
    {
        if (((String) this.d) == null) {
            this.f();
        }
        return ((String) this.d);
    }

    public android.content.pm.PackageInfo c(String p3)
    {
        try {
            return ((android.content.Context) this.c).getPackageManager().getPackageInfo(p3, 0);
        } catch (int v3_4) {
            String v0_2 = new StringBuilder("Failed to find package ");
            v0_2.append(v3_4);
            android.util.Log.w("FirebaseMessaging", v0_2.toString());
            return 0;
        }
    }

    public boolean d()
    {
        int v0_0 = this.b;
        if (v0_0 == 0) {
            int v0_9 = ((android.content.Context) this.c).getPackageManager();
            if (v0_9.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") != -1) {
                if (!com.google.android.gms.common.util.PlatformVersion.isAtLeastO()) {
                    int v3_3 = new android.content.Intent("com.google.android.c2dm.intent.REGISTER");
                    v3_3.setPackage("com.google.android.gms");
                    int v3_4 = v0_9.queryIntentServices(v3_3, 0);
                    if ((v3_4 != 0) && (v3_4.size() > 0)) {
                        this.b = 1;
                        v0_0 = 1;
                        if (v0_0 == 0) {
                            return 0;
                        } else {
                            return 1;
                        }
                    }
                }
                int v3_7 = new android.content.Intent("com.google.iid.TOKEN_REQUEST");
                v3_7.setPackage("com.google.android.gms");
                int v0_1 = v0_9.queryBroadcastReceivers(v3_7, 0);
                if ((v0_1 == 0) || (v0_1.size() <= 0)) {
                    android.util.Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                    if (!com.google.android.gms.common.util.PlatformVersion.isAtLeastO()) {
                        this.b = 1;
                    } else {
                        this.b = 2;
                    }
                    v0_0 = this.b;
                } else {
                    this.b = 2;
                    v0_0 = 2;
                }
            } else {
                android.util.Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                v0_0 = 0;
            }
        }
    }

    public void e(q0.s1 p2, java.util.List p3)
    {
        float v2_0 = p3.iterator();
        while (v2_0.hasNext()) {
            android.view.View v3_7 = ((q0.c1) v2_0.next());
            if ((v3_7.a.c() & 8) != 0) {
                ((android.view.View) this.d).setTranslationY(((float) d3.a.c(this.b, 0, v3_7.a.b())));
                break;
            }
        }
        return;
    }

    public declared_synchronized void f()
    {
        String v0_4 = this.c(((android.content.Context) this.c).getPackageName());
        if (v0_4 != null) {
            this.d = Integer.toString(v0_4.versionCode);
            this.e = v0_4.versionName;
        }
        return;
    }
}
