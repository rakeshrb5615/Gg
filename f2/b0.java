package f2;
public abstract class b0 {

    public static android.graphics.drawable.Drawable a(android.graphics.drawable.Drawable p2, android.graphics.drawable.Drawable p3, int p4, int p5)
    {
        if (p2 != 0) {
            if (p3 != 0) {
                if (p4 == -1) {
                    p4 = p3.getIntrinsicWidth();
                    if (p4 == -1) {
                        p4 = p2.getIntrinsicWidth();
                    }
                }
                if (p5 == -1) {
                    p5 = p3.getIntrinsicHeight();
                    if (p5 == -1) {
                        p5 = p2.getIntrinsicHeight();
                    }
                }
                if ((p4 > p2.getIntrinsicWidth()) || (p5 > p2.getIntrinsicHeight())) {
                    int v4_2 = (((float) p4) / ((float) p5));
                    if (v4_2 < (((float) p2.getIntrinsicWidth()) / ((float) p2.getIntrinsicHeight()))) {
                        p5 = p2.getIntrinsicHeight();
                        p4 = ((int) (v4_2 * ((float) p5)));
                    } else {
                        int v5_6 = p2.getIntrinsicWidth();
                        p5 = ((int) (((float) v5_6) / v4_2));
                        p4 = v5_6;
                    }
                }
                android.graphics.drawable.LayerDrawable v0_9 = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[] {p2, p3}));
                v0_9.setLayerSize(1, p4, p5);
                v0_9.setLayerGravity(1, 17);
                return v0_9;
            } else {
                return p2;
            }
        } else {
            return p3;
        }
    }

    public static android.graphics.drawable.Drawable b(android.graphics.drawable.Drawable p0, android.content.res.ColorStateList p1, android.graphics.PorterDuff$Mode p2)
    {
        if (p0 != null) {
            if (p1 != null) {
                p0 = p0.mutate();
                if (p2 != null) {
                    p0.setTintMode(p2);
                }
            }
            return p0;
        } else {
            return 0;
        }
    }

    public static int[] c(int[] p3)
    {
        int v0_0 = 0;
        while (v0_0 < p3.length) {
            int v1_1 = p3[v0_0];
            if (v1_1 != 16842912) {
                if (v1_1 != 0) {
                    v0_0++;
                } else {
                    int[] v3_2 = ((int[]) p3.clone());
                    v3_2[v0_0] = 16842912;
                    return v3_2;
                }
            } else {
                return p3;
            }
        }
        int v0_3 = java.util.Arrays.copyOf(p3, (p3.length + 1));
        v0_3[p3.length] = 16842912;
        return v0_3;
    }

    public static android.content.res.ColorStateList d(android.graphics.drawable.Drawable p2)
    {
        if (!(p2 instanceof android.graphics.drawable.ColorDrawable)) {
            if ((android.os.Build$VERSION.SDK_INT < 29) || (!(p2 instanceof android.graphics.drawable.ColorStateListDrawable))) {
                return 0;
            } else {
                return ((android.graphics.drawable.ColorStateListDrawable) p2).getColorStateList();
            }
        } else {
            return android.content.res.ColorStateList.valueOf(((android.graphics.drawable.ColorDrawable) p2).getColor());
        }
    }

    public static float e(android.view.View p0)
    {
        return p0.getTransitionAlpha();
    }

    public static void f(android.content.Context p7)
    {
        if (!c4.b.C(p7).getBoolean("proxy_notification_initialized", 0)) {
            try {
                android.os.Bundle v1_7 = p7.getApplicationContext();
                String v2_0 = v1_7.getPackageManager();
            } catch (android.content.pm.PackageManager$NameNotFoundException) {
                boolean v0_1 = 1;
                if (com.google.android.gms.common.util.PlatformVersion.isAtLeastQ()) {
                    android.os.Bundle v1_6 = new com.google.android.gms.tasks.TaskCompletionSource();
                    try {
                        String v4_1;
                        if (android.os.Binder.getCallingUid() != p7.getApplicationInfo().uid) {
                            v4_1 = 0;
                        } else {
                            v4_1 = 1;
                        }
                    } catch (android.app.NotificationManager v7_5) {
                        v1_6.trySetResult(0);
                        throw v7_5;
                    }
                    if (v4_1 != null) {
                        String v2_6 = c4.b.C(p7).edit();
                        v2_6.putBoolean("proxy_notification_initialized", 1);
                        v2_6.apply();
                        android.app.NotificationManager v7_2 = ((android.app.NotificationManager) p7.getSystemService(android.app.NotificationManager));
                        if (!v0_1) {
                            if ("com.google.android.gms".equals(v7_2.getNotificationDelegate())) {
                                v7_2.setNotificationDelegate(0);
                            }
                        } else {
                            v7_2.setNotificationDelegate("com.google.android.gms");
                        }
                    } else {
                        String v4_4 = new StringBuilder("error configuring notification delegate for package ");
                        v4_4.append(p7.getPackageName());
                        android.util.Log.e("FirebaseMessaging", v4_4.toString());
                    }
                    v1_6.trySetResult(0);
                    v1_6.getTask();
                } else {
                    com.google.android.gms.tasks.Tasks.forResult(0);
                }
            }
            if (v2_0 == null) {
            } else {
                android.os.Bundle v1_1 = v2_0.getApplicationInfo(v1_7.getPackageName(), 128);
                if (v1_1 == null) {
                } else {
                    String v2_1 = v1_1.metaData;
                    if ((v2_1 == null) || (!v2_1.containsKey("firebase_messaging_notification_delegation_enabled"))) {
                    } else {
                        v0_1 = v1_1.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
                    }
                }
            }
        }
        return;
    }

    public static boolean g()
    {
        return android.os.Trace.isEnabled();
    }

    public static boolean h(android.content.Context p5)
    {
        if (com.google.android.gms.common.util.PlatformVersion.isAtLeastQ()) {
            if (android.os.Binder.getCallingUid() != p5.getApplicationInfo().uid) {
                StringBuilder v0_2 = new StringBuilder("error retrieving notification delegate for package ");
                v0_2.append(p5.getPackageName());
                android.util.Log.e("FirebaseMessaging", v0_2.toString());
                return 0;
            } else {
                if ("com.google.android.gms".equals(((android.app.NotificationManager) p5.getSystemService(android.app.NotificationManager)).getNotificationDelegate())) {
                    if (android.util.Log.isLoggable("FirebaseMessaging", 3)) {
                        android.util.Log.d("FirebaseMessaging", "GMS core is set for proxying");
                    }
                    return 1;
                }
            }
        } else {
            if (android.util.Log.isLoggable("FirebaseMessaging", 3)) {
                android.util.Log.d("FirebaseMessaging", "Platform doesn\'t support proxying.");
                return 0;
            }
        }
        return 0;
    }

    public static android.graphics.Insets i(int p0, int p1, int p2, int p3)
    {
        return android.graphics.Insets.of(p0, p1, p2, p3);
    }

    public static void j(android.view.View p0, int p1, int p2, int p3, int p4)
    {
        p0.setLeftTopRightBottom(p1, p2, p3, p4);
        return;
    }

    public static void k(android.view.View p0, float p1)
    {
        p0.setTransitionAlpha(p1);
        return;
    }

    public static void l(android.view.View p0, int p1)
    {
        p0.setTransitionVisibility(p1);
        return;
    }

    public static void m(android.view.ViewGroup p0, boolean p1)
    {
        p0.suppressLayout(p1);
        return;
    }

    public static void n(android.view.View p0, android.graphics.Matrix p1)
    {
        p0.transformMatrixToGlobal(p1);
        return;
    }

    public static void o(android.view.View p0, android.graphics.Matrix p1)
    {
        p0.transformMatrixToLocal(p1);
        return;
    }
}
