package a5;
public final synthetic class t implements c6.a, a5.f, com.google.android.gms.tasks.OnFailureListener, f2.r, com.google.android.gms.tasks.Continuation, com.google.android.gms.tasks.OnCompleteListener, com.android.billingclient.api.ConsumeResponseListener, e.b, x5.a, o2.e {
    public final synthetic int a;

    public synthetic t(int p1)
    {
        this.a = p1;
        return;
    }

    public synthetic t(a5.z p1)
    {
        this.a = 14;
        return;
    }

    public static bridge synthetic android.content.pm.SigningInfo c(android.content.pm.PackageInfo p0)
    {
        return p0.signingInfo;
    }

    public static bridge synthetic android.window.OnBackInvokedDispatcher d(Object p0)
    {
        return ((android.window.OnBackInvokedDispatcher) p0);
    }

    public void a(c6.b p1)
    {
        return;
    }

    public Object apply(Object p3)
    {
        ((k6.e) p3).getClass();
        b8.g v0 = j6.p.a;
        v0.getClass();
        java.io.ByteArrayOutputStream v1_1 = new java.io.ByteArrayOutputStream();
        try {
            v0.e(((k6.e) p3), v1_1);
        } catch (java.io.IOException) {
        }
        return v1_1.toByteArray();
    }

    public void b(f2.q p2, f2.s p3)
    {
        switch (this.a) {
            case 8:
                p2.e(p3);
                return;
            case 9:
                p2.f(p3);
                return;
            case 10:
                p2.c(p3);
                return;
            case 11:
                p2.b();
                return;
            default:
                p2.d();
                return;
        }
    }

    public Object e(a5.z p2)
    {
        switch (this.a) {
            case 1:
                return ((java.util.concurrent.ScheduledExecutorService) com.google.firebase.concurrent.ExecutorsRegistrar.a.get());
            case 2:
                return ((java.util.concurrent.ScheduledExecutorService) com.google.firebase.concurrent.ExecutorsRegistrar.c.get());
            case 3:
                return ((java.util.concurrent.ScheduledExecutorService) com.google.firebase.concurrent.ExecutorsRegistrar.b.get());
            case 4:
                return b5.n.a;
            default:
                return com.google.firebase.installations.FirebaseInstallationsRegistrar.a(p2);
        }
    }

    public void onActivityResult(Object p2)
    {
        Class vtmp1 = ((e.a) p2).getClass();
        return;
    }

    public void onComplete(com.google.android.gms.tasks.Task p1)
    {
        return;
    }

    public void onConsumeResponse(com.android.billingclient.api.BillingResult p1, String p2)
    {
        p1.getResponseCode();
        return;
    }

    public void onFailure(Exception p3)
    {
        android.util.Log.e("FirebaseCrashlytics", "Error fetching settings.", p3);
        return;
    }

    public Object then(com.google.android.gms.tasks.Task p5)
    {
        Boolean v5_3;
        switch (this.a) {
            case 14:
                int v2;
                if (!p5.isSuccessful()) {
                    android.util.Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", p5.getException());
                    v2 = 0;
                } else {
                    Boolean v5_2 = ((g5.b) p5.getResult());
                    int v0_2 = new StringBuilder("Crashlytics report successfully enqueued to DataTransport: ");
                    v0_2.append(v5_2.b);
                    String v1_2 = d5.d.a;
                    v1_2.b(v0_2.toString());
                    Boolean v5_4 = v5_2.c;
                    v2 = 1;
                    if (!v5_4.delete()) {
                        int v0_6 = new StringBuilder("Crashlytics could not delete report file: ");
                        v0_6.append(v5_4.getPath());
                        v1_2.d(v0_6.toString(), 0);
                    } else {
                        int v0_10 = new StringBuilder("Deleted report file: ");
                        v0_10.append(v5_4.getPath());
                        v1_2.b(v0_10.toString());
                    }
                }
                return Boolean.valueOf(v2);
            case 20:
                v5_3 = 403;
                break;
            default:
                v5_3 = -1;
        }
        return Integer.valueOf(v5_3);
    }
}
