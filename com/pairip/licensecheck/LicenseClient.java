package com.pairip.licensecheck;
public class LicenseClient implements android.content.ServiceConnection {
    private static final int ERROR_INVALID_PACKAGE_NAME = 3;
    private static final int FLAG_RPC_CALL = 0;
    private static final int LICENSED = 0;
    private static final int MAX_RETRIES = 3;
    private static final int MILLIS_PER_SEC = 1000;
    private static final int NOT_LICENSED = 2;
    private static final String PAYLOAD_PAYWALL = "PAYWALL_INTENT";
    private static final int RETRY_DELAY_MILLIS = 1000;
    private static final String SERVICE_INTERFACE_CLASS_NAME = "com.android.vending.licensing.ILicensingService";
    private static final String SERVICE_PACKAGE = "com.android.vending";
    private static final String TAG = "LicenseClient";
    private static final int TRANSACTION_CHECK_LICENSE_V2 = 2;
    private static final int TRANSACTION_REPORT_SUCCESSFUL_LICENSE_CHECK = 3;
    protected static com.pairip.licensecheck.LicenseClient$ImmediateTaskExecutor backgroundRunner = None;
    protected static Runnable exitAction = None;
    private static final android.os.Handler handler = None;
    protected static com.pairip.licensecheck.LicenseClient$LicenseCheckState licenseCheckState = None;
    protected static String licensePubKey = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAjhLcxHXqtzrIzi09OMmUhVaO4J+e7yEv9NM8Ywo3rYFBUUtD9E23zM/6GVpvoV2XPdOun8fXsnTOeHM/WTorpaCdzNeWCdFXs3F2QaOJUHhYmAO9LVSaePA+o90dqchW/8CMNPUV3zK1UnZWUsQzA7yrbYgxuWfPPTdxWQe2btsPWq1IEM281PdF0AKXLAUUdBLd6D4X6QjhKXZ0togWXILj1HSYk9RSqq5K8HMIuCbRdoJ898sdkJCiKTMpb7GnegFt6YHHPH/Jgl5QXDo24eF/RvQw6IYIJjq2a37oARQxcMsU8O3sOqttQSyz1Mq5ozuqfmOUIMod31izpCEFowIDAQAB";
    protected static boolean localCheckEnabled = True;
    protected static com.pairip.licensecheck.LicenseClient$ImmediateTaskExecutor mainThreadRunner = None;
    protected static String packageName = "com.chilllive.chillwallpaperproject";
    private static android.os.Bundle responsePayload;
    private final android.content.Context context;
    protected com.pairip.licensecheck.LicenseClient$DelayedTaskExecutor delayedTaskExecutor;
    private int retryNum;
    private boolean waitingForRepeatedCheck;

    public static synthetic void $r8$lambda$GS82Fij7VQePgSFog-s63-Rcyb0(com.pairip.licensecheck.LicenseClient p0)
    {
        p0.lambda$initializeLicenseCheck$0();
        return;
    }

    public static synthetic void $r8$lambda$gb-vmUiJUmqdCloCudVdY-igh7I(com.pairip.licensecheck.LicenseClient p0, android.os.IBinder p1)
    {
        p0.lambda$onServiceConnected$1(p1);
        return;
    }

    public static synthetic void $r8$lambda$heJ2Stw6wCNVkkwCytXyCvBISDM(com.pairip.licensecheck.LicenseClient p0)
    {
        p0.lambda$scheduleRepeatedLicenseCheck$0();
        return;
    }

    public static synthetic void $r8$lambda$ot_XkRbEJeEFG1Hy-d3H6N4DX_I(com.pairip.licensecheck.LicenseClient p0, com.pairip.licensecheck.RepeatedCheckMetadata p1, android.os.Bundle p2)
    {
        p0.lambda$processResponse$0(p1, p2);
        return;
    }

    public static synthetic void $r8$lambda$q2q7YKfx3jIZHqiUNn7fQ55wwzI(com.pairip.licensecheck.LicenseClient p0, boolean p1)
    {
        p0.lambda$initializeLicenseCheck$1(p1);
        return;
    }

    public static synthetic void $r8$lambda$tTRuJInP7s484yRu-m6AsnoI1z4(com.pairip.licensecheck.LicenseClient p0)
    {
        p0.connectToLicensingService();
        return;
    }

    public static synthetic void $r8$lambda$xzrAfByzooHDT9oIsgTdQvzthuE(com.pairip.licensecheck.LicenseClient p0, android.os.IBinder p1)
    {
        p0.lambda$onServiceConnected$0(p1);
        return;
    }

    static bridge synthetic void -$$Nest$mprocessResponse(com.pairip.licensecheck.LicenseClient p0, int p1, android.os.Bundle p2)
    {
        p0.processResponse(p1, p2);
        return;
    }

    static LicenseClient()
    {
        com.pairip.licensecheck.LicenseClient.exitAction = new com.pairip.licensecheck.LicenseClient$1();
        com.pairip.licensecheck.LicenseClient.licenseCheckState = com.pairip.licensecheck.LicenseClient$LicenseCheckState.CHECK_REQUIRED;
        com.pairip.licensecheck.LicenseClient.backgroundRunner = new com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda2();
        android.os.Handler v0_2 = new android.os.Handler(android.os.Looper.getMainLooper());
        com.pairip.licensecheck.LicenseClient.handler = v0_2;
        java.util.Objects.requireNonNull(v0_2);
        com.pairip.licensecheck.LicenseClient.mainThreadRunner = new com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda3(v0_2);
        return;
    }

    public LicenseClient(android.content.Context p3)
    {
        this.delayedTaskExecutor = new com.pairip.licensecheck.LicenseClient$DelayedTaskExecutorImpl(0);
        this.retryNum = 0;
        this.waitingForRepeatedCheck = 0;
        this.context = p3;
        return;
    }

    private void checkLicenseInternal(android.os.IBinder p7)
    {
        if (p7 != null) {
            android.util.Log.d("LicenseClient", "Sending request to licensing service...");
            android.os.Parcel v1_1 = android.os.Parcel.obtain();
            android.os.Parcel v3 = android.os.Parcel.obtain();
            try {
                this.populateInputDataForLicenseCheckV2(v1_1, p7);
            } catch (com.pairip.licensecheck.LicenseCheckException v7_4) {
                this.handleError(new com.pairip.licensecheck.LicenseCheckException("Error when calling licensing service.", v7_4));
                v1_1.recycle();
                v3.recycle();
                android.util.Log.d("LicenseClient", "Request to licensing service sent.");
                return;
            } catch (com.pairip.licensecheck.LicenseCheckException v7_6) {
                v1_1.recycle();
                v3.recycle();
                android.util.Log.d("LicenseClient", "Request to licensing service sent.");
                throw v7_6;
            }
            if (!p7.transact(2, v1_1, v3, 0)) {
                this.handleError(new com.pairip.licensecheck.LicenseCheckException("Licensing service could not process request."));
            }
            v1_1.recycle();
            v3.recycle();
            android.util.Log.d("LicenseClient", "Request to licensing service sent.");
            return;
        } else {
            this.retryOrThrow(new com.pairip.licensecheck.LicenseCheckException("Received a null binder."));
            return;
        }
    }

    private void connectToLicensingService()
    {
        android.util.Log.d("LicenseClient", "Connecting to the licensing service...");
        try {
            if (!this.context.bindService(new android.content.Intent("com.android.vending.licensing.ILicensingService").setPackage("com.android.vending").setAction("com.android.vending.licensing.ILicensingService"), this, 1)) {
                this.retryOrThrow(new com.pairip.licensecheck.LicenseCheckException("Could not bind with the licensing service."));
            }
        } catch (com.pairip.licensecheck.LicenseCheckException v0_3) {
            this.retryOrThrow(new com.pairip.licensecheck.LicenseCheckException("Not allowed to bind with the licensing service.", v0_3));
            return;
        }
        return;
    }

    private android.content.Intent createCloseAppIntentOrExitIfAppInBackground()
    {
        if (!this.isForeground()) {
            com.pairip.licensecheck.LicenseClient.exitAction.run();
        }
        android.content.Intent v0_3 = new android.content.Intent(this.context, com.pairip.licensecheck.LicenseActivity);
        v0_3.addFlags(67108864);
        v0_3.addFlags(32768);
        v0_3.addFlags(268435456);
        return v0_3;
    }

    private static com.pairip.licensecheck.ILicenseV2ResultListener createResultListener(com.pairip.licensecheck.LicenseClient p1)
    {
        return new com.pairip.licensecheck.LicenseClient$2(p1);
    }

    public static String getLicensePubKey()
    {
        return com.pairip.licensecheck.LicenseClient.licensePubKey;
    }

    private void handleError(com.pairip.licensecheck.LicenseCheckException p3)
    {
        boolean v3_1 = android.util.Log.getStackTraceString(p3);
        com.pairip.licensecheck.LicenseClient$LicenseCheckState v0_2 = new StringBuilder("Error while checking license: ");
        v0_2.append(v3_1);
        android.util.Log.e("LicenseClient", v0_2.toString());
        if (!com.pairip.licensecheck.LicenseClient.licenseCheckState.equals(com.pairip.licensecheck.LicenseClient$LicenseCheckState.FULL_CHECK_OK)) {
            this.startErrorDialogActivity();
            return;
        } else {
            return;
        }
    }

    private boolean isForeground()
    {
        int v0_1 = new android.app.ActivityManager$RunningAppProcessInfo();
        android.app.ActivityManager.getMyMemoryState(v0_1);
        if (v0_1.importance > 100) {
            return 0;
        } else {
            return 1;
        }
    }

    private synthetic void lambda$initializeLicenseCheck$0()
    {
        com.pairip.licensecheck.LicenseClient.mainThreadRunner.run(new com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda1(this, this.performLocalInstallerCheck()));
        return;
    }

    private synthetic void lambda$initializeLicenseCheck$1(boolean p1)
    {
        if (p1 != null) {
            com.pairip.licensecheck.LicenseClient.licenseCheckState = com.pairip.licensecheck.LicenseClient$LicenseCheckState.LOCAL_CHECK_OK;
        }
        this.connectToLicensingService();
        return;
    }

    private synthetic void lambda$onServiceConnected$0(android.os.IBinder p1)
    {
        try {
            this.checkLicenseInternal(p1);
            return;
        } catch (com.pairip.licensecheck.LicenseCheckException v1_1) {
            this.handleError(v1_1);
            return;
        }
    }

    private synthetic void lambda$onServiceConnected$1(android.os.IBinder p3)
    {
        try {
            this.reportSuccessfulLicenseCheck(p3);
            return;
        } catch (String v3_2) {
            String v3_3 = android.util.Log.getStackTraceString(v3_2);
            String v0_2 = new StringBuilder("Error while reporting license check: ");
            v0_2.append(v3_3);
            android.util.Log.e("LicenseClient", v0_2.toString());
            return;
        }
    }

    private synthetic void lambda$processResponse$0(com.pairip.licensecheck.RepeatedCheckMetadata p2, android.os.Bundle p3)
    {
        if (p2 == null) {
            com.pairip.licensecheck.LicenseClient.licenseCheckState = com.pairip.licensecheck.LicenseClient$LicenseCheckState.FULL_CHECK_OK;
        } else {
            com.pairip.licensecheck.LicenseClient.licenseCheckState = com.pairip.licensecheck.LicenseClient$LicenseCheckState.REPEATED_CHECK_REQUIRED;
            this.scheduleRepeatedLicenseCheck(p2);
        }
        com.pairip.licensecheck.LicenseClient.responsePayload = p3;
        return;
    }

    static synthetic void lambda$reportSuccessfulLicenseCheck$0()
    {
        com.pairip.licensecheck.LicenseClient.licenseCheckState = com.pairip.licensecheck.LicenseClient$LicenseCheckState.LOCAL_CHECK_REPORTED;
        return;
    }

    private synthetic void lambda$scheduleRepeatedLicenseCheck$0()
    {
        this.waitingForRepeatedCheck = 0;
        this.connectToLicensingService();
        return;
    }

    static synthetic void lambda$static$0(Runnable p1)
    {
        new Thread(p1).start();
        return;
    }

    private boolean performLocalInstallerCheck()
    {
        try {
            if (android.os.Build$VERSION.SDK_INT >= 30) {
                String v2_12 = this.context.getPackageManager();
                if (v2_12 != null) {
                    String v3_0 = v2_12.getPackageInfo(com.pairip.licensecheck.LicenseClient.packageName, 0);
                    if (v3_0 != null) {
                        if (v3_0.applicationInfo != null) {
                            String v3_2 = v3_0.applicationInfo.flags;
                            if ((v3_2 & 1) == 0) {
                                if ((v3_2 & 128) == 0) {
                                    String v2_1 = v2_12.getInstallSourceInfo(com.pairip.licensecheck.LicenseClient.packageName);
                                    if (v2_1 != null) {
                                        String v2_2 = v2_1.getInstallingPackageName();
                                        if (v2_2 != null) {
                                            if (v2_2.equals("com.android.vending")) {
                                                return 1;
                                            } else {
                                            }
                                        }
                                        android.util.Log.i("LicenseClient", "Local install check failed due to wrong installer.");
                                        return 0;
                                    } else {
                                        android.util.Log.i("LicenseClient", "Local install check bypassed due to install source info not found.");
                                        return 0;
                                    }
                                } else {
                                }
                            }
                            android.util.Log.i("LicenseClient", "Local install check passed due to system app.");
                            return 1;
                        } else {
                        }
                    }
                    android.util.Log.i("LicenseClient", "Local install check bypassed due to app package info not found.");
                    return 0;
                } else {
                    android.util.Log.i("LicenseClient", "Local install check bypassed due to package manager not found.");
                    return 0;
                }
            } else {
                android.util.Log.i("LicenseClient", "Local install check bypassed due to old SDK version.");
                return 0;
            }
        } catch (String v2_11) {
            android.util.Log.w("LicenseClient", "Could not obtain package info for local installer check.", v2_11);
            return 0;
        }
    }

    private void populateInputDataForLicenseCheckV2(android.os.Parcel p1, android.os.IBinder p2)
    {
        p1.writeInterfaceToken(p2.getInterfaceDescriptor());
        p1.writeString(com.pairip.licensecheck.LicenseClient.packageName);
        p1.writeStrongBinder(com.pairip.licensecheck.LicenseClient.createResultListener(this).asBinder());
        p1.writeInt(0);
        return;
    }

    private void populateInputDataForReportAutoVerifiedLicense(android.os.Parcel p1, android.os.IBinder p2)
    {
        p1.writeInterfaceToken(p2.getInterfaceDescriptor());
        p1.writeString(com.pairip.licensecheck.LicenseClient.packageName);
        p1.writeInt(0);
        return;
    }

    private void processResponse(int p4, android.os.Bundle p5)
    {
        try {
            if (p4 == 3) {
                throw new com.pairip.licensecheck.LicenseCheckException("Request package name invalid.");
            } else {
                if (p4 != null) {
                    if (p4 != 2) {
                        Object[] v1_1 = new Object[1];
                        v1_1[0] = Integer.valueOf(p4);
                        throw new com.pairip.licensecheck.LicenseCheckException(String.format("Unexpected response code %d received.", v1_1));
                    } else {
                        this.startPaywallActivity(((android.app.PendingIntent) p5.getParcelable("PAYWALL_INTENT")));
                        return;
                    }
                } else {
                    com.pairip.licensecheck.LicenseResponseHelper.validateResponse(p5, com.pairip.licensecheck.LicenseClient.packageName);
                    android.util.Log.i("LicenseClient", "License check succeeded.");
                    com.pairip.licensecheck.LicenseClient.mainThreadRunner.run(new com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda7(this, com.pairip.licensecheck.LicenseResponseHelper.getRepeatedCheckMetadata(p5), p5));
                    return;
                }
            }
        } catch (String v4_10) {
            this.handleError(v4_10);
            return;
        }
    }

    private void retryOrThrow(com.pairip.licensecheck.LicenseCheckException p2)
    {
        this.retryOrThrow(p2, 0);
        return;
    }

    private void retryOrThrow(com.pairip.licensecheck.LicenseCheckException p7, boolean p8)
    {
        String v0_0 = this.retryNum;
        if (v0_0 >= 3) {
            if (p8 == null) {
                this.handleError(p7);
                return;
            } else {
                String v7_6 = String.valueOf(p7);
                StringBuilder v8_1 = new StringBuilder("Retry limit reached for: ");
                v8_1.append(v7_6);
                android.util.Log.e("LicenseClient", v8_1.toString());
                return;
            }
        } else {
            String v7_2;
            this.retryNum = (v0_0 + 1);
            this.delayedTaskExecutor.schedule(new com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda0(this), 1000);
            String v0_5 = Integer.valueOf(this.retryNum);
            if (p7 != null) {
                v7_2 = p7.getMessage();
            } else {
                v7_2 = "null";
            }
            Long v3_3 = Long.valueOf(1);
            Object[] v2_1 = new Object[3];
            v2_1[0] = v0_5;
            v2_1[1] = v7_2;
            v2_1[2] = v3_3;
            android.util.Log.d("LicenseClient", String.format("Retry #%d. License check failed with error \'%s\'. Next try in %ds...", v2_1));
            return;
        }
    }

    private void scheduleRepeatedLicenseCheck(com.pairip.licensecheck.RepeatedCheckMetadata p8)
    {
        String v1_1 = Math.min(p8.getDurationToRetryMillis(), Math.max(0, (p8.getTimeToRetryMillis() - this.getCurrentTimeMillis())));
        this.waitingForRepeatedCheck = 1;
        try {
            this.context.unbindService(this);
        } catch (com.pairip.licensecheck.LicenseClient$DelayedTaskExecutor v3_1) {
            android.util.Log.e("LicenseClient", "Failed to unbind service for repeated license check.", v3_1);
        }
        this.delayedTaskExecutor.schedule(new com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda9(this), v1_1);
        String v8_2 = new Object[1];
        v8_2[0] = Long.valueOf(v1_1);
        android.util.Log.d("LicenseClient", String.format("Repeated license check is scheduled in %d ms...", v8_2));
        return;
    }

    private void startErrorDialogActivity()
    {
        android.content.Intent v0 = this.createCloseAppIntentOrExitIfAppInBackground();
        v0.putExtra("activitytype", com.pairip.licensecheck.LicenseActivity$ActivityType.ERROR_DIALOG);
        this.context.startActivity(v0);
        return;
    }

    private void startPaywallActivity(android.app.PendingIntent p3)
    {
        android.content.Intent v0 = this.createCloseAppIntentOrExitIfAppInBackground();
        v0.putExtra("paywallintent", p3);
        v0.putExtra("activitytype", com.pairip.licensecheck.LicenseActivity$ActivityType.PAYWALL);
        this.context.startActivity(v0);
        return;
    }

    protected long getCurrentTimeMillis()
    {
        return System.currentTimeMillis();
    }

    public void initializeLicenseCheck()
    {
        com.pairip.licensecheck.LicenseCheckException v0_3 = com.pairip.licensecheck.LicenseClient.licenseCheckState.ordinal();
        if (v0_3 == null) {
            if (!com.pairip.licensecheck.LicenseClient.localCheckEnabled) {
                this.connectToLicensingService();
                return;
            } else {
                com.pairip.licensecheck.LicenseClient.backgroundRunner.run(new com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda4(this));
                return;
            }
        } else {
            if (v0_3 == 1) {
                try {
                    com.pairip.licensecheck.LicenseResponseHelper.validateResponse(com.pairip.licensecheck.LicenseClient.responsePayload, com.pairip.licensecheck.LicenseClient.packageName);
                    return;
                } catch (com.pairip.licensecheck.LicenseCheckException v0_2) {
                    this.handleError(v0_2);
                    return;
                }
            } else {
                if (v0_3 == 4) {
                    this.connectToLicensingService();
                    return;
                } else {
                    return;
                }
            }
        }
    }

    public void onServiceConnected(android.content.ComponentName p2, android.os.IBinder p3)
    {
        android.util.Log.d("LicenseClient", "Connected to the licensing service.");
        com.pairip.licensecheck.LicenseClient$ImmediateTaskExecutor v2_3 = com.pairip.licensecheck.LicenseClient.licenseCheckState.ordinal();
        if (v2_3 != null) {
            if (v2_3 == 2) {
                com.pairip.licensecheck.LicenseClient.backgroundRunner.run(new com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda6(this, p3));
                return;
            } else {
                if (v2_3 != 4) {
                    return;
                }
            }
        }
        com.pairip.licensecheck.LicenseClient.backgroundRunner.run(new com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda5(this, p3));
        return;
    }

    public void onServiceDisconnected(android.content.ComponentName p2)
    {
        if ((!com.pairip.licensecheck.LicenseClient.licenseCheckState.equals(com.pairip.licensecheck.LicenseClient$LicenseCheckState.REPEATED_CHECK_REQUIRED)) || (!this.waitingForRepeatedCheck)) {
            android.util.Log.w("LicenseClient", "Unexpectedly disconnected from the licensing service.");
            this.retryOrThrow(new com.pairip.licensecheck.LicenseCheckException("Licensing service unexpectedly disconnected."));
            return;
        } else {
            android.util.Log.d("LicenseClient", "Ignoring service disconnection in REPEATED_CHECK_REQUIRED state.");
            return;
        }
    }

    public void reportSuccessfulLicenseCheck(android.os.IBinder p9)
    {
        if (p9 != null) {
            android.util.Log.d("LicenseClient", "Sending request to license reporting service...");
            android.os.Parcel v3_1 = android.os.Parcel.obtain();
            android.os.Parcel v5 = android.os.Parcel.obtain();
            try {
                this.populateInputDataForReportAutoVerifiedLicense(v3_1, p9);
                com.pairip.licensecheck.LicenseClient$ImmediateTaskExecutor v9_1 = p9.transact(3, v3_1, v5, 0);
            } catch (com.pairip.licensecheck.LicenseClient$ImmediateTaskExecutor v9_3) {
                com.pairip.licensecheck.LicenseClient$ImmediateTaskExecutor v9_4 = String.valueOf(v9_3);
                StringBuilder v2_2 = new StringBuilder("Error when calling licensing service.");
                v2_2.append(v9_4);
                android.util.Log.e("LicenseClient", v2_2.toString());
                v3_1.recycle();
                v5.recycle();
                android.util.Log.d("LicenseClient", "Request to licensing reporting service sent.");
                return;
            } catch (com.pairip.licensecheck.LicenseClient$ImmediateTaskExecutor v9_7) {
                v3_1.recycle();
                v5.recycle();
                android.util.Log.d("LicenseClient", "Request to licensing reporting service sent.");
                throw v9_7;
            }
            if (v9_1 == null) {
                android.util.Log.e("LicenseClient", "Error sending request to license reporting service.");
            }
            if (v9_1 != null) {
                com.pairip.licensecheck.LicenseClient.mainThreadRunner.run(new com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda8());
            }
            v3_1.recycle();
            v5.recycle();
            android.util.Log.d("LicenseClient", "Request to licensing reporting service sent.");
            return;
        } else {
            this.retryOrThrow(new com.pairip.licensecheck.LicenseCheckException("Received a null binder."), 1);
            return;
        }
    }
}
