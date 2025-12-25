package d0;
public final class w implements android.os.Handler$Callback, android.content.ServiceConnection {
    public final android.content.Context a;
    public final android.os.Handler b;
    public final java.util.HashMap c;
    public java.util.HashSet d;

    public w(android.content.Context p2)
    {
        this.c = new java.util.HashMap();
        this.d = new java.util.HashSet();
        this.a = p2;
        android.os.Looper v2_1 = new android.os.HandlerThread("NotificationManagerCompat");
        v2_1.start();
        this.b = new android.os.Handler(v2_1.getLooper(), this);
        return;
    }

    public final void a(d0.v p8)
    {
        boolean v0_0 = p8.d;
        String v1_0 = p8.a;
        StringBuilder v3_0 = 3;
        if (android.util.Log.isLoggable("NotifManCompat", 3)) {
            StringBuilder v4_20 = new StringBuilder("Processing component ");
            v4_20.append(v1_0);
            v4_20.append(", ");
            v4_20.append(v0_0.size());
            v4_20.append(" queued tasks");
            android.util.Log.d("NotifManCompat", v4_20.toString());
        }
        if (!v0_0.isEmpty()) {
            StringBuilder v4_11;
            if (!p8.b) {
                String v6_0 = this.a;
                StringBuilder v4_6 = v6_0.bindService(new android.content.Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(v1_0), this, 33);
                p8.b = v4_6;
                if (v4_6 == null) {
                    StringBuilder v4_8 = new StringBuilder("Unable to bind to listener ");
                    v4_8.append(v1_0);
                    android.util.Log.w("NotifManCompat", v4_8.toString());
                    v6_0.unbindService(this);
                } else {
                    p8.e = 0;
                }
                v4_11 = p8.b;
            } else {
                v4_11 = 1;
            }
            if ((v4_11 == null) || (p8.c == null)) {
                this.b(p8);
                return;
            }
            while(true) {
                StringBuilder v4_15 = ((d0.t) v0_0.peek());
                if (v4_15 == null) {
                    break;
                }
                try {
                    if (android.util.Log.isLoggable("NotifManCompat", 3)) {
                        String v5_8 = new StringBuilder();
                        v5_8.append("Sending task ");
                        v5_8.append(v4_15);
                        android.util.Log.d("NotifManCompat", v5_8.toString());
                    }
                    v4_15.a(p8.c);
                    v0_0.remove();
                } catch (android.os.DeadObjectException) {
                    if (!android.util.Log.isLoggable("NotifManCompat", v3_0)) {
                        break;
                    }
                    StringBuilder v3_3 = new StringBuilder("Remote service has died: ");
                    v3_3.append(v1_0);
                    android.util.Log.d("NotifManCompat", v3_3.toString());
                    break;
                }
            }
            if (v0_0.isEmpty()) {
                return;
            } else {
                this.b(p8);
                return;
            }
        }
        return;
    }

    public final void b(d0.v p9)
    {
        android.os.Message v0_0 = p9.a;
        String v1_0 = p9.d;
        StringBuilder v2_0 = this.b;
        if (!v2_0.hasMessages(3, v0_0)) {
            String v4_3 = p9.e;
            int v5 = (v4_3 + 1);
            p9.e = v5;
            if (v5 <= 6) {
                int v9_3 = ((1 << v4_3) * 1000);
                if (android.util.Log.isLoggable("NotifManCompat", 3)) {
                    String v1_3 = new StringBuilder("Scheduling retry for ");
                    v1_3.append(v9_3);
                    v1_3.append(" ms");
                    android.util.Log.d("NotifManCompat", v1_3.toString());
                }
                v2_0.sendMessageDelayed(v2_0.obtainMessage(3, v0_0), ((long) v9_3));
                return;
            } else {
                StringBuilder v2_2 = new StringBuilder("Giving up on delivering ");
                v2_2.append(v1_0.size());
                v2_2.append(" tasks to ");
                v2_2.append(v0_0);
                v2_2.append(" after ");
                v2_2.append(p9.e);
                v2_2.append(" retries");
                android.util.Log.w("NotifManCompat", v2_2.toString());
                v1_0.clear();
                return;
            }
        } else {
            return;
        }
    }

    public final boolean handleMessage(android.os.Message p12)
    {
        java.util.Iterator v0_0 = p12.what;
        d0.v v1_0 = 0;
        if (v0_0 == null) {
            d0.v v12_14 = ((d0.t) p12.obj);
            java.util.Iterator v0_2 = android.provider.Settings$Secure.getString(this.a.getContentResolver(), "enabled_notification_listeners");
            if ((v0_2 != null) && (!v0_2.equals(d0.x.c))) {
                java.util.HashSet v6_3 = v0_2.split(":", -1);
                android.content.Context v7_13 = new java.util.HashSet(v6_3.length);
                String v8_13 = v6_3.length;
                Object v9_5 = 0;
                while (v9_5 < v8_13) {
                    String v10_3 = android.content.ComponentName.unflattenFromString(v6_3[v9_5]);
                    if (v10_3 != null) {
                        v7_13.add(v10_3.getPackageName());
                    }
                    v9_5++;
                }
                d0.x.d = v7_13;
                d0.x.c = v0_2;
            }
            java.util.Iterator v0_13 = d0.x.d;
            if (!v0_13.equals(this.d)) {
                this.d = v0_13;
                d0.v v5_8 = this.a.getPackageManager().queryIntentServices(new android.content.Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                java.util.HashSet v6_8 = new java.util.HashSet();
                d0.v v5_9 = v5_8.iterator();
                while (v5_9.hasNext()) {
                    android.content.Context v7_7 = ((android.content.pm.ResolveInfo) v5_9.next());
                    if (v0_13.contains(v7_7.serviceInfo.packageName)) {
                        Object v9_1 = v7_7.serviceInfo;
                        String v8_9 = new android.content.ComponentName(v9_1.packageName, v9_1.name);
                        if (v7_7.serviceInfo.permission == null) {
                            v6_8.add(v8_9);
                        } else {
                            Object v9_4 = new StringBuilder("Permission present on component ");
                            v9_4.append(v8_9);
                            v9_4.append(", not adding listener record.");
                            android.util.Log.w("NotifManCompat", v9_4.toString());
                        }
                    }
                }
                java.util.Iterator v0_14 = v6_8.iterator();
                while (v0_14.hasNext()) {
                    d0.v v5_1 = ((android.content.ComponentName) v0_14.next());
                    if (!this.c.containsKey(v5_1)) {
                        if (android.util.Log.isLoggable("NotifManCompat", 3)) {
                            String v8_1 = new StringBuilder("Adding listener record for ");
                            v8_1.append(v5_1);
                            android.util.Log.d("NotifManCompat", v8_1.toString());
                        }
                        this.c.put(v5_1, new d0.v(v5_1));
                    }
                }
                java.util.Iterator v0_17 = this.c.entrySet().iterator();
                while (v0_17.hasNext()) {
                    d0.v v5_13 = ((java.util.Map$Entry) v0_17.next());
                    if (!v6_8.contains(v5_13.getKey())) {
                        if (android.util.Log.isLoggable("NotifManCompat", 3)) {
                            String v8_15 = new StringBuilder("Removing listener record for ");
                            v8_15.append(v5_13.getKey());
                            android.util.Log.d("NotifManCompat", v8_15.toString());
                        }
                        d0.v v5_15 = ((d0.v) v5_13.getValue());
                        if (v5_15.b) {
                            this.a.unbindService(this);
                            v5_15.b = 0;
                        }
                        v5_15.c = 0;
                        v0_17.remove();
                    }
                }
            }
            java.util.Iterator v0_5 = this.c.values().iterator();
            while (v0_5.hasNext()) {
                d0.v v1_3 = ((d0.v) v0_5.next());
                v1_3.d.add(v12_14);
                this.a(v1_3);
            }
        } else {
            if (v0_0 == 1) {
                d0.v v12_3 = ((d0.u) p12.obj);
                d0.v v12_4 = v12_3.b;
                java.util.Iterator v0_8 = ((d0.v) this.c.get(v12_3.a));
                if (v0_8 != null) {
                    if (v12_4 != null) {
                        d0.v v1_5 = v12_4.queryLocalInterface(b.c.g);
                        if ((v1_5 == null) || (!(v1_5 instanceof b.c))) {
                            v1_0 = new b.a();
                            v1_0.a = v12_4;
                        } else {
                            v1_0 = ((b.c) v1_5);
                        }
                    }
                    v0_8.c = v1_0;
                    v0_8.e = 0;
                    this.a(v0_8);
                    return 1;
                }
            } else {
                if (v0_0 == 2) {
                    d0.v v12_8 = ((d0.v) this.c.get(((android.content.ComponentName) p12.obj)));
                    if (v12_8 != null) {
                        if (v12_8.b) {
                            this.a.unbindService(this);
                            v12_8.b = 0;
                        }
                        v12_8.c = 0;
                        return 1;
                    }
                } else {
                    if (v0_0 == 3) {
                        d0.v v12_12 = ((d0.v) this.c.get(((android.content.ComponentName) p12.obj)));
                        if (v12_12 != null) {
                            this.a(v12_12);
                            return 1;
                        }
                    } else {
                        return 0;
                    }
                }
            }
        }
        return 1;
    }

    public final void onServiceConnected(android.content.ComponentName p4, android.os.IBinder p5)
    {
        if (android.util.Log.isLoggable("NotifManCompat", 3)) {
            d0.u v0_6 = new StringBuilder("Connected to service ");
            v0_6.append(p4);
            android.util.Log.d("NotifManCompat", v0_6.toString());
        }
        this.b.obtainMessage(1, new d0.u(p4, p5)).sendToTarget();
        return;
    }

    public final void onServiceDisconnected(android.content.ComponentName p4)
    {
        if (android.util.Log.isLoggable("NotifManCompat", 3)) {
            android.os.Handler v0_5 = new StringBuilder("Disconnected from service ");
            v0_5.append(p4);
            android.util.Log.d("NotifManCompat", v0_5.toString());
        }
        this.b.obtainMessage(2, p4).sendToTarget();
        return;
    }
}
