package com.google.android.gms.common;
public class GoogleApiAvailability extends com.google.android.gms.common.GoogleApiAvailabilityLight {
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE;
    private static final Object zaa;
    private static final com.google.android.gms.common.GoogleApiAvailability zab;
    private String zac;

    static GoogleApiAvailability()
    {
        com.google.android.gms.common.GoogleApiAvailability.zaa = new Object();
        com.google.android.gms.common.GoogleApiAvailability.zab = new com.google.android.gms.common.GoogleApiAvailability();
        com.google.android.gms.common.GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE = com.google.android.gms.common.GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        return;
    }

    public GoogleApiAvailability()
    {
        return;
    }

    public static com.google.android.gms.common.GoogleApiAvailability getInstance()
    {
        return com.google.android.gms.common.GoogleApiAvailability.zab;
    }

    public static final varargs com.google.android.gms.tasks.Task zai(com.google.android.gms.common.api.HasApiKey p4, com.google.android.gms.common.api.HasApiKey[] p5)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4, "Requested API must not be null.");
        int v1_0 = p5.length;
        int v2 = 0;
        while (v2 < v1_0) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(p5[v2], "Requested API must not be null.");
            v2++;
        }
        java.util.ArrayList v0_2 = new java.util.ArrayList((p5.length + 1));
        v0_2.add(p4);
        v0_2.addAll(java.util.Arrays.asList(p5));
        return com.google.android.gms.common.api.internal.GoogleApiManager.zaj().zam(v0_2);
    }

    public varargs com.google.android.gms.tasks.Task checkApiAvailability(com.google.android.gms.common.api.GoogleApi p1, com.google.android.gms.common.api.GoogleApi[] p2)
    {
        return com.google.android.gms.common.GoogleApiAvailability.zai(p1, p2).onSuccessTask(com.google.android.gms.common.zab.zaa);
    }

    public varargs com.google.android.gms.tasks.Task checkApiAvailability(com.google.android.gms.common.api.HasApiKey p1, com.google.android.gms.common.api.HasApiKey[] p2)
    {
        return com.google.android.gms.common.GoogleApiAvailability.zai(p1, p2).onSuccessTask(com.google.android.gms.common.zaa.zaa);
    }

    public int getClientVersion(android.content.Context p1)
    {
        return super.getClientVersion(p1);
    }

    public android.app.Dialog getErrorDialog(android.app.Activity p2, int p3, int p4)
    {
        return this.getErrorDialog(p2, p3, p4, 0);
    }

    public android.app.Dialog getErrorDialog(android.app.Activity p8, int p9, int p10, android.content.DialogInterface$OnCancelListener p11)
    {
        return this.zaa(p8, p9, com.google.android.gms.common.internal.zag.zab(p8, this.getErrorResolutionIntent(p8, p9, "d"), p10), p11, 0);
    }

    public android.app.Dialog getErrorDialog(androidx.fragment.app.e0 p2, int p3, int p4)
    {
        return this.getErrorDialog(p2, p3, p4, 0);
    }

    public android.app.Dialog getErrorDialog(androidx.fragment.app.e0 p8, int p9, int p10, android.content.DialogInterface$OnCancelListener p11)
    {
        return this.zaa(p8.requireContext(), p9, com.google.android.gms.common.internal.zag.zac(p8, this.getErrorResolutionIntent(p8.requireContext(), p9, "d"), p10), p11, 0);
    }

    public android.content.Intent getErrorResolutionIntent(android.content.Context p1, int p2, String p3)
    {
        return super.getErrorResolutionIntent(p1, p2, p3);
    }

    public android.app.PendingIntent getErrorResolutionPendingIntent(android.content.Context p1, int p2, int p3)
    {
        return super.getErrorResolutionPendingIntent(p1, p2, p3);
    }

    public android.app.PendingIntent getErrorResolutionPendingIntent(android.content.Context p2, com.google.android.gms.common.ConnectionResult p3)
    {
        if (!p3.hasResolution()) {
            return this.getErrorResolutionPendingIntent(p2, p3.getErrorCode(), 0);
        } else {
            return p3.getResolution();
        }
    }

    public final String getErrorString(int p1)
    {
        return super.getErrorString(p1);
    }

    public int isGooglePlayServicesAvailable(android.content.Context p1)
    {
        return super.isGooglePlayServicesAvailable(p1);
    }

    public int isGooglePlayServicesAvailable(android.content.Context p1, int p2)
    {
        return super.isGooglePlayServicesAvailable(p1, p2);
    }

    public final boolean isUserResolvableError(int p1)
    {
        return super.isUserResolvableError(p1);
    }

    public com.google.android.gms.tasks.Task makeGooglePlayServicesAvailable(android.app.Activity p4)
    {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("makeGooglePlayServicesAvailable must be called from the main thread");
        int v0_2 = this.isGooglePlayServicesAvailable(p4, com.google.android.gms.common.GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        if (v0_2 != 0) {
            com.google.android.gms.tasks.Task v4_3 = com.google.android.gms.common.api.internal.zacc.zaa(p4);
            v4_3.zah(new com.google.android.gms.common.ConnectionResult(v0_2, 0), 0);
            return v4_3.zad();
        } else {
            return com.google.android.gms.tasks.Tasks.forResult(0);
        }
    }

    public void setDefaultNotificationChannelId(android.content.Context p2, String p3)
    {
        if (com.google.android.gms.common.util.PlatformVersion.isAtLeastO()) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(((android.app.NotificationManager) com.google.android.gms.common.internal.Preconditions.checkNotNull(p2.getSystemService("notification"))).getNotificationChannel(p3));
        }
        try {
            this.zac = p3;
            return;
        } catch (Throwable v3_1) {
            throw v3_1;
        }
    }

    public boolean showErrorDialogFragment(android.app.Activity p2, int p3, int p4)
    {
        return this.showErrorDialogFragment(p2, p3, p4, 0);
    }

    public boolean showErrorDialogFragment(android.app.Activity p1, int p2, int p3, android.content.DialogInterface$OnCancelListener p4)
    {
        android.app.Dialog v2_1 = this.getErrorDialog(p1, p2, p3, p4);
        if (v2_1 != null) {
            this.zad(p1, v2_1, "GooglePlayServicesErrorDialog", p4);
            return 1;
        } else {
            return 0;
        }
    }

    public boolean showErrorDialogFragment(android.app.Activity p7, int p8, e.c p9, android.content.DialogInterface$OnCancelListener p10)
    {
        int v7_3 = this.zaa(p7, p8, 0, p10, new com.google.android.gms.common.zac(this, p7, p8, p9));
        if (v7_3 != 0) {
            this.zad(p7, v7_3, "GooglePlayServicesErrorDialog", p10);
            return 1;
        } else {
            return 0;
        }
    }

    public void showErrorNotification(android.content.Context p3, int p4)
    {
        this.zae(p3, p4, 0, this.getErrorResolutionPendingIntent(p3, p4, 0, "n"));
        return;
    }

    public void showErrorNotification(android.content.Context p3, com.google.android.gms.common.ConnectionResult p4)
    {
        this.zae(p3, p4.getErrorCode(), 0, this.getErrorResolutionPendingIntent(p3, p4));
        return;
    }

    public final android.app.Dialog zaa(android.content.Context p6, int p7, com.google.android.gms.common.internal.zag p8, android.content.DialogInterface$OnCancelListener p9, android.content.DialogInterface$OnClickListener p10)
    {
        android.app.AlertDialog$Builder v0_0 = 0;
        if (p7 != null) {
            String v1_6 = new android.util.TypedValue();
            p6.getTheme().resolveAttribute(16843529, v1_6, 1);
            if ("Theme.Dialog.Alert".equals(p6.getResources().getResourceEntryName(v1_6.resourceId))) {
                v0_0 = new android.app.AlertDialog$Builder(p6, 5);
            }
            if (v0_0 == null) {
                v0_0 = new android.app.AlertDialog$Builder(p6);
            }
            v0_0.setMessage(com.google.android.gms.common.internal.zac.zac(p6, p7));
            if (p9 != null) {
                v0_0.setOnCancelListener(p9);
            }
            String v9_1 = com.google.android.gms.common.internal.zac.zab(p6, p7);
            if (v9_1 != null) {
                if (p8 == null) {
                    p8 = p10;
                }
                v0_0.setPositiveButton(v9_1, p8);
            }
            android.app.AlertDialog v6_1 = com.google.android.gms.common.internal.zac.zaf(p6, p7);
            if (v6_1 != null) {
                v0_0.setTitle(v6_1);
            }
            android.util.Log.w("GoogleApiAvailability", g2.g.c(p7, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
            return v0_0.create();
        } else {
            return 0;
        }
    }

    public final android.app.Dialog zab(android.app.Activity p4, android.content.DialogInterface$OnCancelListener p5)
    {
        android.app.AlertDialog v0_5 = new android.widget.ProgressBar(p4, 0, 16842874);
        v0_5.setIndeterminate(1);
        v0_5.setVisibility(0);
        String v1_5 = new android.app.AlertDialog$Builder(p4);
        v1_5.setView(v0_5);
        v1_5.setMessage(com.google.android.gms.common.internal.zac.zac(p4, 18));
        v1_5.setPositiveButton("", 0);
        android.app.AlertDialog v0_4 = v1_5.create();
        this.zad(p4, v0_4, "GooglePlayServicesUpdatingDialog", p5);
        return v0_4;
    }

    public final com.google.android.gms.common.api.internal.zabx zac(android.content.Context p3, com.google.android.gms.common.api.internal.zabw p4)
    {
        String v0_1 = new android.content.IntentFilter("android.intent.action.PACKAGE_ADDED");
        v0_1.addDataScheme("package");
        com.google.android.gms.common.api.internal.zabx v1_3 = new com.google.android.gms.common.api.internal.zabx(p4);
        com.google.android.gms.internal.base.zao.zaa(p3, v1_3, v0_1);
        v1_3.zaa(p3);
        if (this.isUninstalledAppPossiblyUpdating(p3, "com.google.android.gms")) {
            return v1_3;
        } else {
            p4.zaa();
            v1_3.zab();
            return 0;
        }
    }

    public final void zad(android.app.Activity p2, android.app.Dialog p3, String p4, android.content.DialogInterface$OnCancelListener p5)
    {
        try {
            if (!(p2 instanceof androidx.fragment.app.j0)) {
                com.google.android.gms.common.ErrorDialogFragment.newInstance(p3, p5).show(p2.getFragmentManager(), p4);
                return;
            } else {
                com.google.android.gms.common.SupportErrorDialogFragment.newInstance(p3, p5).show(((androidx.fragment.app.j0) p2).getSupportFragmentManager(), p4);
                return;
            }
        } catch (NoClassDefFoundError) {
            com.google.android.gms.common.ErrorDialogFragment.newInstance(p3, p5).show(p2.getFragmentManager(), p4);
            return;
        }
    }

    public final void zae(android.content.Context p9, int p10, String p11, android.app.PendingIntent p12)
    {
        android.util.Log.w("GoogleApiAvailability", v1.a.j("GMS core API Availability. ConnectionResult=", p10, ", tag=null"), new IllegalArgumentException());
        if (p10 != 18) {
            if (p12 != null) {
                android.app.NotificationChannel v11_3 = com.google.android.gms.common.internal.zac.zae(p9, p10);
                boolean v0_5 = com.google.android.gms.common.internal.zac.zad(p9, p10);
                java.util.ArrayList v1_0 = p9.getResources();
                android.app.NotificationManager v2_3 = ((android.app.NotificationManager) com.google.android.gms.common.internal.Preconditions.checkNotNull(p9.getSystemService("notification")));
                d0.p v3_1 = new d0.p(p9, 0);
                v3_1.m = 1;
                int v5_0 = v3_1.s;
                v5_0.flags = (v5_0.flags | 16);
                v3_1.e = d0.p.b(v11_3);
                android.app.NotificationChannel v11_9 = new d0.n();
                v11_9.b = d0.p.b(v0_5);
                v3_1.d(v11_9);
                if (!com.google.android.gms.common.util.DeviceProperties.isWearable(p9)) {
                    v3_1.s.icon = 17301642;
                    v3_1.s.tickerText = d0.p.b(v1_0.getString(com.google.android.gms.base.R$string.common_google_play_services_notification_ticker));
                    v3_1.s.when = System.currentTimeMillis();
                    v3_1.g = p12;
                    v3_1.f = d0.p.b(v0_5);
                } else {
                    com.google.android.gms.common.internal.Preconditions.checkState(com.google.android.gms.common.util.PlatformVersion.isAtLeastKitKatWatch());
                    v3_1.s.icon = p9.getApplicationInfo().icon;
                    v3_1.j = 2;
                    if (!com.google.android.gms.common.util.DeviceProperties.isWearableWithoutPlayStore(p9)) {
                        v3_1.g = p12;
                    } else {
                        v3_1.b.add(new d0.j(com.google.android.gms.base.R$drawable.common_full_open_on_phone, v1_0.getString(com.google.android.gms.base.R$string.common_open_on_phone), p12));
                    }
                }
                if (com.google.android.gms.common.util.PlatformVersion.isAtLeastO()) {
                    com.google.android.gms.common.internal.Preconditions.checkState(com.google.android.gms.common.util.PlatformVersion.isAtLeastO());
                    String v12_1 = this.zac;
                    if (v12_1 == null) {
                        v12_1 = "com.google.android.gms.availability";
                        android.app.NotificationChannel v11_25 = v2_3.getNotificationChannel("com.google.android.gms.availability");
                        String v9_1 = p9.getResources().getString(com.google.android.gms.base.R$string.common_google_play_services_notification_channel_name);
                        if (v11_25 != null) {
                            if (!v9_1.contentEquals(v11_25.getName())) {
                                v11_25.setName(v9_1);
                                v2_3.createNotificationChannel(v11_25);
                            }
                        } else {
                            v2_3.createNotificationChannel(new android.app.NotificationChannel("com.google.android.gms.availability", v9_1, 4));
                        }
                    }
                    v3_1.q = v12_1;
                }
                int v10_2;
                String v9_2 = v3_1.a();
                if ((p10 == 1) || ((p10 == 2) || (p10 == 3))) {
                    com.google.android.gms.common.GooglePlayServicesUtilLight.sCanceledAvailabilityNotification.set(0);
                    v10_2 = 10436;
                } else {
                    v10_2 = 39789;
                }
                v2_3.notify(v10_2, v9_2);
                return;
            } else {
                if (p10 == 6) {
                    android.util.Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                }
                return;
            }
        } else {
            this.zaf(p9);
            return;
        }
    }

    public final void zaf(android.content.Context p4)
    {
        new com.google.android.gms.common.zad(this, p4).sendEmptyMessageDelayed(1, 120000);
        return;
    }

    public final boolean zag(android.app.Activity p8, com.google.android.gms.common.api.internal.LifecycleFragment p9, int p10, int p11, android.content.DialogInterface$OnCancelListener p12)
    {
        int v8_1 = this.zaa(p8, p10, com.google.android.gms.common.internal.zag.zad(p9, this.getErrorResolutionIntent(p8, p10, "d"), 2), p12, 0);
        if (v8_1 != 0) {
            this.zad(p8, v8_1, "GooglePlayServicesErrorDialog", p12);
            return 1;
        } else {
            return 0;
        }
    }

    public final boolean zah(android.content.Context p5, com.google.android.gms.common.ConnectionResult p6, int p7)
    {
        if (!com.google.android.gms.common.wrappers.InstantApps.isInstantApp(p5)) {
            int v0_4 = this.getErrorResolutionPendingIntent(p5, p6);
            if (v0_4 != 0) {
                this.zae(p5, p6.getErrorCode(), 0, android.app.PendingIntent.getActivity(p5, 0, com.google.android.gms.common.api.GoogleApiActivity.zaa(p5, v0_4, p7, 1), (com.google.android.gms.internal.base.zap.zaa | 134217728)));
                return 1;
            }
        }
        return 0;
    }
}
