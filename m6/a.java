package m6;
public final synthetic class a implements com.google.android.gms.tasks.SuccessContinuation, com.google.android.gms.tasks.Continuation {
    public final synthetic m6.b a;

    public synthetic a(m6.b p1)
    {
        this.a = p1;
        return;
    }

    public com.google.android.gms.tasks.Task then(Object p7)
    {
        com.google.android.gms.tasks.Task v7_1 = this.a;
        com.google.android.gms.tasks.Task v0_1 = v7_1.c.b();
        com.google.android.gms.tasks.Task v1_1 = v7_1.d.b();
        return com.google.android.gms.tasks.Tasks.whenAllComplete(new com.google.android.gms.tasks.Task[] {v0_1, v1_1})).continueWithTask(v7_1.b, new h5.a(v7_1, v0_1, v1_1, 3));
    }

    public Object then(com.google.android.gms.tasks.Task p7)
    {
        m6.d v7_7;
        String v0_0 = this.a;
        v0_0.getClass();
        if (!p7.isSuccessful()) {
            v7_7 = 0;
        } else {
            String v1_12 = v0_0.c;
            v1_12.c = com.google.android.gms.tasks.Tasks.forResult(0);
            d5.c v2_0 = v1_12.b;
            v2_0.a.deleteFile(v2_0.b);
            m6.d v7_3 = ((n6.f) p7.getResult());
            if (v7_3 == null) {
                android.util.Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
            } else {
                java.util.concurrent.Executor v3_1 = v0_0.a;
                if (v3_1 != null) {
                    try {
                        v3_1.c(m6.b.c(v7_3.d));
                    } catch (String v1_5) {
                        android.util.Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", v1_5);
                    } catch (String v1_4) {
                        android.util.Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", v1_4);
                    }
                }
                String v0_2 = v0_0.i;
                try {
                    m6.d v7_6 = ((n0.a) v0_2.c).g(v7_3);
                    String v1_10 = ((java.util.Set) v0_2.e).iterator();
                } catch (m6.d v7_8) {
                    android.util.Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscribers. Continuing to listen for changes.", v7_8);
                }
                while (v1_10.hasNext()) {
                    ((java.util.concurrent.Executor) v0_2.d).execute(new o6.a(((d5.c) v1_10.next()), v7_6, 0));
                }
            }
            v7_7 = 1;
        }
        return Boolean.valueOf(v7_7);
    }
}
