package e0;
public abstract class c {
    private static final String DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
    public static final int RECEIVER_EXPORTED = 2;
    public static final int RECEIVER_NOT_EXPORTED = 4;
    public static final int RECEIVER_VISIBLE_TO_INSTANT_APPS = 1;
    private static final String TAG = "ContextCompat";
    private static final Object sSync;

    static c()
    {
        e0.c.sSync = new Object();
        return;
    }

    public static int checkSelfPermission(android.content.Context p2, String p3)
    {
        if (p3 == null) {
            throw new NullPointerException("permission must be non-null");
        } else {
            if ((android.os.Build$VERSION.SDK_INT >= 33) || (!android.text.TextUtils.equals("android.permission.POST_NOTIFICATIONS", p3))) {
                return p2.checkPermission(p3, android.os.Process.myPid(), android.os.Process.myUid());
            } else {
                if (!new d0.x(p2).a.areNotificationsEnabled()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }

    public static android.content.Context createAttributionContext(android.content.Context p2, String p3)
    {
        if (android.os.Build$VERSION.SDK_INT >= 30) {
            p2 = e0.b.a(p2, p3);
        }
        return p2;
    }

    public static android.content.Context createDeviceProtectedStorageContext(android.content.Context p0)
    {
        return p0.createDeviceProtectedStorageContext();
    }

    public static String getAttributionTag(android.content.Context p2)
    {
        if (android.os.Build$VERSION.SDK_INT < 30) {
            return 0;
        } else {
            return e0.b.c(p2);
        }
    }

    public static java.io.File getCodeCacheDir(android.content.Context p0)
    {
        return p0.getCodeCacheDir();
    }

    public static int getColor(android.content.Context p0, int p1)
    {
        return p0.getColor(p1);
    }

    public static android.content.res.ColorStateList getColorStateList(android.content.Context p8, int p9)
    {
        g0.i v0_0 = p8.getResources();
        Throwable v8_1 = p8.getTheme();
        android.content.res.Configuration v1_1 = new g0.j(v0_0, v8_1);
        android.util.SparseArray v3_1;
        android.util.SparseArray v3_0 = ((android.util.SparseArray) g0.m.b.get(v1_1));
        android.content.res.ColorStateList v4 = 0;
        if ((v3_0 == null) || (v3_0.size() <= 0)) {
            v3_1 = 0;
        } else {
            String v5_2 = ((g0.i) v3_0.get(p9));
            if (v5_2 == null) {
            } else {
                if (v5_2.b.equals(v0_0.getConfiguration())) {
                    if (v8_1 != null) {
                        if ((v8_1 == null) || (v5_2.c != v8_1.hashCode())) {
                            v3_0.remove(p9);
                        }
                    } else {
                        if (v5_2.c != 0) {
                        }
                    }
                    v3_1 = v5_2.a;
                    if (v3_1 == null) {
                        Object v2_0 = g0.m.a;
                        android.util.SparseArray v3_3 = ((android.util.TypedValue) v2_0.get());
                        if (v3_3 == null) {
                            v3_3 = new android.util.TypedValue();
                            v2_0.set(v3_3);
                        }
                        v0_0.getValue(p9, v3_3, 1);
                        Object v2_2 = v3_3.type;
                        if ((v2_2 < 28) || (v2_2 > 31)) {
                            try {
                                v4 = g0.c.a(v0_0, v0_0.getXml(p9), v8_1);
                            } catch (Object v2_4) {
                                android.util.Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", v2_4);
                            }
                        }
                        if (v4 == null) {
                            v4 = v0_0.getColorStateList(p9, v8_1);
                        } else {
                            g0.i v0_1 = g0.m.b;
                            android.util.SparseArray v3_10 = ((android.util.SparseArray) v0_1.get(v1_1));
                            if (v3_10 == null) {
                                v3_10 = new android.util.SparseArray();
                                v0_1.put(v1_1, v3_10);
                            }
                            v3_10.append(p9, new g0.i(v4, v1_1.a.getConfiguration(), v8_1));
                        }
                        return v4;
                    } else {
                        return v3_1;
                    }
                }
            }
        }
    }

    public static android.content.Context getContextForLanguage(android.content.Context p4)
    {
        m0.h v2_0;
        android.content.res.Configuration v0_0 = android.os.Build$VERSION.SDK_INT;
        if (v0_0 < 33) {
            v2_0 = m0.h.a(d0.d.e(p4));
        } else {
            android.os.LocaleList v1_9 = p4.getSystemService("locale");
            if (v1_9 == null) {
                v2_0 = m0.h.b;
            } else {
                v2_0 = new m0.h(new m0.i(d0.h.a(v1_9)));
            }
        }
        if ((v0_0 <= 32) && (!v2_0.b())) {
            android.content.res.Configuration v0_3 = new android.content.res.Configuration(p4.getResources().getConfiguration());
            v0_3.setLocales(v2_0.a.a);
            p4 = p4.createConfigurationContext(v0_3);
        }
        return p4;
    }

    public static java.io.File getDataDir(android.content.Context p0)
    {
        return p0.getDataDir();
    }

    public static android.view.Display getDisplayOrDefault(android.content.Context p2)
    {
        if (android.os.Build$VERSION.SDK_INT < 30) {
            return ((android.view.WindowManager) p2.getSystemService("window")).getDefaultDisplay();
        } else {
            return e0.b.d(p2);
        }
    }

    public static android.graphics.drawable.Drawable getDrawable(android.content.Context p0, int p1)
    {
        return p0.getDrawable(p1);
    }

    public static java.io.File[] getExternalCacheDirs(android.content.Context p0)
    {
        return p0.getExternalCacheDirs();
    }

    public static java.io.File[] getExternalFilesDirs(android.content.Context p0, String p1)
    {
        return p0.getExternalFilesDirs(p1);
    }

    public static java.util.concurrent.Executor getMainExecutor(android.content.Context p2)
    {
        if (android.os.Build$VERSION.SDK_INT < 28) {
            return new m0.f(new android.os.Handler(p2.getMainLooper()), 0);
        } else {
            return e0.a.e(p2);
        }
    }

    public static java.io.File getNoBackupFilesDir(android.content.Context p0)
    {
        return p0.getNoBackupFilesDir();
    }

    public static java.io.File[] getObbDirs(android.content.Context p0)
    {
        return p0.getObbDirs();
    }

    public static String getString(android.content.Context p0, int p1)
    {
        return e0.c.getContextForLanguage(p0).getString(p1);
    }

    public static Object getSystemService(android.content.Context p0, Class p1)
    {
        return p0.getSystemService(p1);
    }

    public static String getSystemServiceName(android.content.Context p0, Class p1)
    {
        return p0.getSystemServiceName(p1);
    }

    public static boolean isDeviceProtectedStorage(android.content.Context p0)
    {
        return p0.isDeviceProtectedStorage();
    }

    public static String obtainAndCheckReceiverPermission(android.content.Context p4)
    {
        String v0_1 = new StringBuilder();
        v0_1.append(p4.getApplicationContext().getPackageName());
        v0_1.append(".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION");
        String v0_2 = v0_1.toString();
        if (a.a.k(p4, v0_2) == 0) {
            return v0_2;
        } else {
            if (android.os.Build$VERSION.SDK_INT >= 29) {
                String v0_4 = new StringBuilder();
                v0_4.append(p4.getOpPackageName());
                v0_4.append(".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION");
                v0_2 = v0_4.toString();
                if (a.a.k(p4, v0_2) == 0) {
                    return v0_2;
                }
            }
            throw new RuntimeException(v1.a.l("Permission ", v0_2, " is required by your application to receive broadcasts, please add it to your manifest"));
        }
    }

    public static android.content.Intent registerReceiver(android.content.Context p6, android.content.BroadcastReceiver p7, android.content.IntentFilter p8, int p9)
    {
        return e0.c.registerReceiver(p6, p7, p8, 0, 0, p9);
    }

    public static android.content.Intent registerReceiver(android.content.Context p6, android.content.BroadcastReceiver p7, android.content.IntentFilter p8, String p9, android.os.Handler p10, int p11)
    {
        android.content.Intent v0_0 = (p11 & 1);
        if ((v0_0 != null) && ((p11 & 4) != 0)) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
        } else {
            if (v0_0 != null) {
                p11 |= 2;
            }
            int v11_1 = (p11 & 2);
            if ((v11_1 == 0) && ((p11 & 4) == 0)) {
                throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
            } else {
                if ((v11_1 != 0) && ((p11 & 4) != 0)) {
                    throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
                } else {
                    if (android.os.Build$VERSION.SDK_INT < 33) {
                        if (((p11 & 4) == 0) || (p9 != null)) {
                            android.content.Intent v6_6 = p6.registerReceiver(p7, p8, p9, p10, (p11 & 1));
                        } else {
                            v6_6 = p6.registerReceiver(p7, p8, e0.c.obtainAndCheckReceiverPermission(p6), p10);
                        }
                        return v6_6;
                    } else {
                        return p6.registerReceiver(p7, p8, p9, p10, p11);
                    }
                }
            }
        }
    }

    public static boolean startActivities(android.content.Context p1, android.content.Intent[] p2)
    {
        return e0.c.startActivities(p1, p2, 0);
    }

    public static boolean startActivities(android.content.Context p0, android.content.Intent[] p1, android.os.Bundle p2)
    {
        p0.startActivities(p1, p2);
        return 1;
    }

    public static void startActivity(android.content.Context p0, android.content.Intent p1, android.os.Bundle p2)
    {
        p0.startActivity(p1, p2);
        return;
    }

    public static void startForegroundService(android.content.Context p0, android.content.Intent p1)
    {
        p0.startForegroundService(p1);
        return;
    }
}
