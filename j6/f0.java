package j6;
public final class f0 implements android.content.ServiceConnection {
    public final android.content.Context a;
    public final android.content.Intent b;
    public final java.util.concurrent.ScheduledThreadPoolExecutor c;
    public final java.util.ArrayDeque d;
    public j6.d0 e;
    public boolean f;

    public f0(android.content.Context p6)
    {
        java.util.concurrent.ScheduledThreadPoolExecutor v0_1 = new java.util.concurrent.ScheduledThreadPoolExecutor(1, new com.google.android.gms.common.util.concurrent.NamedThreadFactory("Firebase-FirebaseInstanceIdServiceConnection"));
        v0_1.setKeepAliveTime(40, java.util.concurrent.TimeUnit.SECONDS);
        v0_1.allowCoreThreadTimeOut(1);
        this.d = new java.util.ArrayDeque();
        this.f = 0;
        android.content.Intent v6_1 = p6.getApplicationContext();
        this.a = v6_1;
        this.b = new android.content.Intent("com.google.firebase.MESSAGING_EVENT").setPackage(v6_1.getPackageName());
        this.c = v0_1;
        return;
    }

    public final declared_synchronized void a()
    {
        if (android.util.Log.isLoggable("FirebaseMessaging", 3)) {
            android.util.Log.d("FirebaseMessaging", "flush queue called");
        }
        while (!this.d.isEmpty()) {
            if (android.util.Log.isLoggable("FirebaseMessaging", 3)) {
                android.util.Log.d("FirebaseMessaging", "found intent to be delivered");
            }
            j6.e0 v0_5 = this.e;
            if ((v0_5 == null) || (!v0_5.isBinderAlive())) {
                this.c();
                return;
            } else {
                if (android.util.Log.isLoggable("FirebaseMessaging", 3)) {
                    android.util.Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.e.a(((j6.e0) this.d.poll()));
            }
        }
        return;
    }

    public final declared_synchronized com.google.android.gms.tasks.Task b(android.content.Intent p6)
    {
        if (android.util.Log.isLoggable("FirebaseMessaging", 3)) {
            android.util.Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
        }
        j6.e0 v0_2 = new j6.e0(p6);
        com.google.android.gms.tasks.Task v6_1 = this.c;
        v0_2.b.getTask().addOnCompleteListener(v6_1, new a5.a(v6_1.schedule(new androidx.lifecycle.g0(v0_2, 11), 20, java.util.concurrent.TimeUnit.SECONDS), 13));
        this.d.add(v0_2);
        this.a();
        return v0_2.b.getTask();
    }

    public final void c()
    {
        if (android.util.Log.isLoggable("FirebaseMessaging", 3)) {
            com.google.android.gms.tasks.TaskCompletionSource v0_14 = new StringBuilder("binder is dead. start connection? ");
            v0_14.append((this.f ^ 1));
            android.util.Log.d("FirebaseMessaging", v0_14.toString());
        }
        if (!this.f) {
            this.f = 1;
            try {
                if (!com.google.android.gms.common.stats.ConnectionTracker.getInstance().bindService(this.a, this.b, this, 65)) {
                    android.util.Log.e("FirebaseMessaging", "binding to the service failed");
                } else {
                    return;
                }
            } catch (com.google.android.gms.tasks.TaskCompletionSource v0_6) {
                android.util.Log.e("FirebaseMessaging", "Exception while binding the service", v0_6);
            }
            this.f = 0;
            while(true) {
                com.google.android.gms.tasks.TaskCompletionSource v0_9 = this.d;
                if (v0_9.isEmpty()) {
                    break;
                }
                ((j6.e0) v0_9.poll()).b.trySetResult(0);
            }
        }
        return;
    }

    public final declared_synchronized void onServiceConnected(android.content.ComponentName p5, android.os.IBinder p6)
    {
        if (android.util.Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder v3_2 = new StringBuilder("onServiceConnected: ");
            v3_2.append(p5);
            android.util.Log.d("FirebaseMessaging", v3_2.toString());
        }
        this.f = 0;
        if ((p6 instanceof j6.d0)) {
            this.e = ((j6.d0) p6);
            this.a();
            return;
        } else {
            StringBuilder v1_2 = new StringBuilder("Invalid service connection: ");
            v1_2.append(p6);
            android.util.Log.e("FirebaseMessaging", v1_2.toString());
            java.util.ArrayDeque v5_5 = this.d;
            while (!v5_5.isEmpty()) {
                ((j6.e0) v5_5.poll()).b.trySetResult(0);
            }
            return;
        }
    }

    public final void onServiceDisconnected(android.content.ComponentName p4)
    {
        if (android.util.Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder v0_3 = new StringBuilder("onServiceDisconnected: ");
            v0_3.append(p4);
            android.util.Log.d("FirebaseMessaging", v0_3.toString());
        }
        this.a();
        return;
    }
}
