package com.google.android.gms.common.internal;
public abstract class zag implements android.content.DialogInterface$OnClickListener {

    public zag()
    {
        return;
    }

    public static com.google.android.gms.common.internal.zag zab(android.app.Activity p1, android.content.Intent p2, int p3)
    {
        return new com.google.android.gms.common.internal.zad(p2, p1, p3);
    }

    public static com.google.android.gms.common.internal.zag zac(androidx.fragment.app.e0 p1, android.content.Intent p2, int p3)
    {
        return new com.google.android.gms.common.internal.zae(p2, p1, p3);
    }

    public static com.google.android.gms.common.internal.zag zad(com.google.android.gms.common.api.internal.LifecycleFragment p1, android.content.Intent p2, int p3)
    {
        return new com.google.android.gms.common.internal.zaf(p2, p1, 2);
    }

    public final void onClick(android.content.DialogInterface p5, int p6)
    {
        try {
            this.zaa();
        } catch (Throwable v6_0) {
            String v0 = "Failed to start resolution intent.";
            if (1 == android.os.Build.FINGERPRINT.contains("generic")) {
                v0 = "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.";
            }
            android.util.Log.e("DialogRedirect", v0, v6_0);
        } catch (Throwable v6_1) {
            p5.dismiss();
            throw v6_1;
        }
        p5.dismiss();
        return;
    }

    public abstract void zaa();
}
