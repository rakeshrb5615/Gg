package com.google.firebase.provider;
public class FirebaseInitProvider extends android.content.ContentProvider {
    public static final q4.a a;
    public static final java.util.concurrent.atomic.AtomicBoolean b;

    static FirebaseInitProvider()
    {
        com.google.firebase.provider.FirebaseInitProvider.a = new q4.a(System.currentTimeMillis(), android.os.SystemClock.elapsedRealtime(), android.os.SystemClock.uptimeMillis());
        com.google.firebase.provider.FirebaseInitProvider.b = new java.util.concurrent.atomic.AtomicBoolean(0);
        return;
    }

    public FirebaseInitProvider()
    {
        return;
    }

    public final void attachInfo(android.content.Context p3, android.content.pm.ProviderInfo p4)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4, "FirebaseInitProvider ProviderInfo cannot be null.");
        if ("com.google.firebase.firebaseinitprovider".equals(p4.authority)) {
            throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application\'s build.gradle.");
        } else {
            super.attachInfo(p3, p4);
            return;
        }
    }

    public final int delete(android.net.Uri p1, String p2, String[] p3)
    {
        return 0;
    }

    public final String getType(android.net.Uri p1)
    {
        return 0;
    }

    public final android.net.Uri insert(android.net.Uri p1, android.content.ContentValues p2)
    {
        return 0;
    }

    public final boolean onCreate()
    {
        java.util.concurrent.atomic.AtomicBoolean v0 = com.google.firebase.provider.FirebaseInitProvider.b;
        v0.set(1);
        if (q4.f.h(this.getContext()) != null) {
            android.util.Log.i("FirebaseInitProvider", "FirebaseApp initialization successful");
        } else {
            android.util.Log.i("FirebaseInitProvider", "FirebaseApp initialization unsuccessful");
        }
        v0.set(0);
        return 0;
    }

    public final android.database.Cursor query(android.net.Uri p1, String[] p2, String p3, String[] p4, String p5)
    {
        return 0;
    }

    public final int update(android.net.Uri p1, android.content.ContentValues p2, String p3, String[] p4)
    {
        return 0;
    }
}
