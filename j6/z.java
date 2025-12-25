package j6;
public final class z {
    public static final long i;
    public static final synthetic int j;
    public final android.content.Context a;
    public final h3.k b;
    public final a5.z c;
    public final com.google.firebase.messaging.FirebaseMessaging d;
    public final r.e e;
    public final java.util.concurrent.ScheduledThreadPoolExecutor f;
    public boolean g;
    public final j6.x h;

    static z()
    {
        j6.z.i = java.util.concurrent.TimeUnit.HOURS.toSeconds(8);
        return;
    }

    public z(com.google.firebase.messaging.FirebaseMessaging p3, h3.k p4, j6.x p5, a5.z p6, android.content.Context p7, java.util.concurrent.ScheduledThreadPoolExecutor p8)
    {
        this.e = new r.e(0);
        this.g = 0;
        this.d = p3;
        this.b = p4;
        this.h = p5;
        this.c = p6;
        this.a = p7;
        this.f = p8;
        return;
    }

    public static void a(com.google.android.gms.tasks.Task p3)
    {
        try {
            com.google.android.gms.tasks.Tasks.await(p3, 30, java.util.concurrent.TimeUnit.SECONDS);
            return;
        } catch (InterruptedException v3_1) {
            throw new java.io.IOException("SERVICE_NOT_AVAILABLE", v3_1);
        } catch (InterruptedException v3_2) {
            java.io.IOException v0_1 = v3_2.getCause();
            if ((v0_1 instanceof java.io.IOException)) {
                throw ((java.io.IOException) v0_1);
            } else {
                if (!(v0_1 instanceof RuntimeException)) {
                    throw new java.io.IOException(v3_2);
                } else {
                    throw ((RuntimeException) v0_1);
                }
            }
        }
    }

    public final void b(String p7)
    {
        String v0_1 = this.d.a();
        a5.z v1 = this.c;
        v1.getClass();
        android.os.Bundle v2_1 = new android.os.Bundle();
        StringBuilder v3_4 = new StringBuilder("/topics/");
        v3_4.append(p7);
        v2_1.putString("gcm.topic", v3_4.toString());
        StringBuilder v3_2 = new StringBuilder("/topics/");
        v3_2.append(p7);
        j6.z.a(v1.o(v1.v(v0_1, v3_2.toString(), v2_1)));
        return;
    }

    public final void c(String p7)
    {
        String v0_1 = this.d.a();
        a5.z v1 = this.c;
        v1.getClass();
        android.os.Bundle v2_1 = new android.os.Bundle();
        StringBuilder v3_5 = new StringBuilder("/topics/");
        v3_5.append(p7);
        v2_1.putString("gcm.topic", v3_5.toString());
        v2_1.putString("delete", "1");
        StringBuilder v3_3 = new StringBuilder("/topics/");
        v3_3.append(p7);
        j6.z.a(v1.o(v1.v(v0_1, v3_3.toString(), v2_1)));
        return;
    }

    public final declared_synchronized void d(boolean p1)
    {
        this.g = p1;
        return;
    }

    public final boolean e()
    {
        while(true) {
            Throwable v0_10 = this.h.a();
            if (v0_10 != null) {
                String v7 = v0_10.b;
                String v8 = v0_10.a;
                int v9 = v7.hashCode();
                if (v9 == 83) {
                    if (!v7.equals("S")) {
                        if (android.util.Log.isLoggable("FirebaseMessaging", 3)) {
                            r.e v1_20 = new StringBuilder("Unknown topic operation");
                            v1_20.append(v0_10);
                            v1_20.append(".");
                            android.util.Log.d("FirebaseMessaging", v1_20.toString());
                        }
                    } else {
                        this.b(v8);
                        if (android.util.Log.isLoggable("FirebaseMessaging", 3)) {
                            r.e v1_11 = new StringBuilder("Subscribe to topic: ");
                            v1_11.append(v8);
                            v1_11.append(" succeeded.");
                            android.util.Log.d("FirebaseMessaging", v1_11.toString());
                        }
                    }
                } else {
                    if (v9 == 85) {
                        if (!v7.equals("U")) {
                        } else {
                            this.c(v8);
                            if (android.util.Log.isLoggable("FirebaseMessaging", 3)) {
                                r.e v1_16 = new StringBuilder("Unsubscribe from topic: ");
                                v1_16.append(v8);
                                v1_16.append(" succeeded.");
                                android.util.Log.d("FirebaseMessaging", v1_16.toString());
                            }
                        }
                    } else {
                    }
                }
                try {
                    r.e v2_0 = this.h.a;
                } catch (Throwable v0_2) {
                    throw v0_2;
                }
                if (((java.util.ArrayDeque) v2_0.e).remove(v0_10.c)) {
                    ((java.util.concurrent.ScheduledThreadPoolExecutor) v2_0.f).execute(new androidx.lifecycle.g0(v2_0, 10));
                }
                Throwable v0_3 = v0_10.c;
                if (this.e.containsKey(v0_3)) {
                    r.e v1_5 = ((java.util.ArrayDeque) this.e.get(v0_3));
                    com.google.android.gms.tasks.TaskCompletionSource v3_5 = ((com.google.android.gms.tasks.TaskCompletionSource) v1_5.poll());
                    if (v3_5 != null) {
                        v3_5.setResult(0);
                    }
                    if (v1_5.isEmpty()) {
                        this.e.remove(v0_3);
                    }
                } else {
                }
            } else {
                if (android.util.Log.isLoggable("FirebaseMessaging", 3)) {
                    android.util.Log.d("FirebaseMessaging", "topic sync succeeded");
                }
                return 1;
            }
        }
    }

    public final void f(long p11)
    {
        this.f.schedule(new j6.b0(this, this.a, this.b, Math.min(Math.max(30, (2 * p11)), j6.z.i)), p11, java.util.concurrent.TimeUnit.SECONDS);
        this.d(1);
        return;
    }
}
