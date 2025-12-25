package com.google.android.gms.measurement;
public class AppMeasurementContentProvider extends android.content.ContentProvider {

    public AppMeasurementContentProvider()
    {
        return;
    }

    public void attachInfo(android.content.Context p1, android.content.pm.ProviderInfo p2)
    {
        super.attachInfo(p1, p2);
        if ("com.google.android.gms.measurement.google_measurement_service".equals(p2.authority)) {
            throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application\'s build.gradle.");
        } else {
            return;
        }
    }

    public int delete(android.net.Uri p1, String p2, String[] p3)
    {
        return 0;
    }

    public String getType(android.net.Uri p1)
    {
        return 0;
    }

    public android.net.Uri insert(android.net.Uri p1, android.content.ContentValues p2)
    {
        return 0;
    }

    public boolean onCreate()
    {
        int v0_0 = this.getContext();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(v0_0);
        com.google.android.gms.measurement.internal.zzic.zzy(v0_0, 0, 0);
        return 0;
    }

    public android.database.Cursor query(android.net.Uri p1, String[] p2, String p3, String[] p4, String p5)
    {
        return 0;
    }

    public int update(android.net.Uri p1, android.content.ContentValues p2, String p3, String[] p4)
    {
        return 0;
    }
}
