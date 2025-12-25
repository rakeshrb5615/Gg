package com.pairip.licensecheck;
public class LicenseActivity extends android.app.Activity {
    public static final String ACTIVITY_TYPE_ARG_NAME = "activitytype";
    public static final String PAYWALL_INTENT_ARG_NAME = "paywallintent";
    private static final String TAG = "LicenseActivity";

    public static synthetic void $r8$lambda$N5_Pzpb-eSKmOONXn3Kn0QvMbys(com.pairip.licensecheck.LicenseActivity p0)
    {
        p0.lambda$showErrorDialog$0();
        return;
    }

    public static synthetic void $r8$lambda$fE_XZ7S0hhHsxQNTfy8mxeJ7kEU(com.pairip.licensecheck.LicenseActivity p0, android.content.DialogInterface p1, int p2)
    {
        p0.lambda$showErrorDialog$1(p1, p2);
        return;
    }

    public static synthetic void $r8$lambda$x-JmBIDmuVzGN23Wk7Dd1TBpzO0(com.pairip.licensecheck.LicenseActivity p0, android.app.PendingIntent p1)
    {
        p0.lambda$showPaywallAndCloseApp$0(p1);
        return;
    }

    public LicenseActivity()
    {
        return;
    }

    private synthetic void lambda$showErrorDialog$0()
    {
        try {
            new android.app.AlertDialog$Builder(this).setTitle("Something went wrong").setMessage("Check that Google Play is enabled on your device and that you\'re using an up-to-date version before opening the app. If the problem persists try reinstalling the app.").setPositiveButton("Close", new com.pairip.licensecheck.LicenseActivity$$ExternalSyntheticLambda2(this)).setCancelable(0).show();
            return;
        } catch (String v0_4) {
            String v0_5 = android.util.Log.getStackTraceString(v0_4);
            String v1_3 = new StringBuilder("Couldn\'t show the error dialog. ");
            v1_3.append(v0_5);
            android.util.Log.d("LicenseActivity", v1_3.toString());
            return;
        }
    }

    private synthetic void lambda$showErrorDialog$1(android.content.DialogInterface p1, int p2)
    {
        this.closeApp();
        return;
    }

    private synthetic void lambda$showPaywallAndCloseApp$0(android.app.PendingIntent p3)
    {
        try {
            if (android.os.Build$VERSION.SDK_INT < 34) {
                p3.send();
            } else {
                p3.send(android.app.ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
            }
        } catch (android.app.PendingIntent$CanceledException v3_1) {
            this.logAndShowErrorDialog("Paywall intent unexpectedly cancelled.", v3_1);
            return;
        }
        this.closeApp();
        return;
    }

    private void logAndShowErrorDialog(String p2)
    {
        android.util.Log.e("LicenseActivity", p2);
        this.showErrorDialog();
        return;
    }

    private void logAndShowErrorDialog(String p2, Exception p3)
    {
        String v3_1 = android.util.Log.getStackTraceString(p3);
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append(p2);
        v0_1.append(" ");
        v0_1.append(v3_1);
        this.logAndShowErrorDialog(v0_1.toString());
        return;
    }

    private void showErrorDialog()
    {
        this.runOnUiThread(new com.pairip.licensecheck.LicenseActivity$$ExternalSyntheticLambda1(this));
        return;
    }

    private void showPaywallAndCloseApp()
    {
        String v0_3 = ((android.app.PendingIntent) this.getIntent().getParcelableExtra("paywallintent"));
        if (v0_3 != null) {
            this.runOnUiThread(new com.pairip.licensecheck.LicenseActivity$$ExternalSyntheticLambda0(this, v0_3));
            return;
        } else {
            this.logAndShowErrorDialog("Paywall intent is not provided.");
            return;
        }
    }

    protected void closeApp()
    {
        this.finishAndRemoveTask();
        System.exit(0);
        return;
    }

    public void onStart()
    {
        super.onStart();
        try {
            Exception v0_4 = ((com.pairip.licensecheck.LicenseActivity$ActivityType) this.getIntent().getSerializableExtra("activitytype")).ordinal();
        } catch (Exception v0_0) {
            this.logAndShowErrorDialog("Couldn\'t process license activity correctly.", v0_0);
            return;
        }
        if (v0_4 == null) {
            this.showPaywallAndCloseApp();
            return;
        } else {
            if (v0_4 == 1) {
                this.showErrorDialog();
                return;
            } else {
                return;
            }
        }
    }
}
