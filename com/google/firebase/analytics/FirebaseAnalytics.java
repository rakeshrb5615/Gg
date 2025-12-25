package com.google.firebase.analytics;
public final class FirebaseAnalytics {
    public static volatile com.google.firebase.analytics.FirebaseAnalytics b;
    public final com.google.android.gms.internal.measurement.zzfb a;

    public FirebaseAnalytics(com.google.android.gms.internal.measurement.zzfb p1)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p1);
        this.a = p1;
        return;
    }

    public static com.google.firebase.analytics.FirebaseAnalytics getInstance(android.content.Context p2)
    {
        if (com.google.firebase.analytics.FirebaseAnalytics.b == null) {
            if (com.google.firebase.analytics.FirebaseAnalytics.b == null) {
                com.google.firebase.analytics.FirebaseAnalytics.b = new com.google.firebase.analytics.FirebaseAnalytics(com.google.android.gms.internal.measurement.zzfb.zza(p2, 0));
            }
        }
        return com.google.firebase.analytics.FirebaseAnalytics.b;
    }

    public static com.google.android.gms.measurement.internal.zzlk getScionFrontendApiImplementation(android.content.Context p0, android.os.Bundle p1)
    {
        int v0_1 = com.google.android.gms.internal.measurement.zzfb.zza(p0, p1);
        if (v0_1 != 0) {
            return new t4.a(v0_1);
        } else {
            return 0;
        }
    }

    public String getFirebaseInstanceId()
    {
        try {
            Throwable v0_4 = q4.f.d();
            com.google.android.gms.common.internal.Preconditions.checkArgument(1, "Null is not a valid value of FirebaseApp.");
            return ((String) com.google.android.gms.tasks.Tasks.await(((d6.c) v0_4.b(d6.d)).c(), 30000, java.util.concurrent.TimeUnit.MILLISECONDS));
        } catch (Throwable v0_7) {
            throw new IllegalStateException(v0_7.getCause());
        } catch (java.util.concurrent.TimeoutException) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        } catch (Throwable v0_3) {
            throw new IllegalStateException(v0_3);
        }
    }

    public void setCurrentScreen(android.app.Activity p2, String p3, String p4)
    {
        this.a.zzp(com.google.android.gms.internal.measurement.zzdf.zza(p2), p3, p4);
        return;
    }
}
