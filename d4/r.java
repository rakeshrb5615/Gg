package d4;
public final class r {
    public static final java.util.HashMap n;
    public final android.content.Context a;
    public final d4.l b;
    public final String c;
    public final java.util.ArrayList d;
    public final java.util.HashSet e;
    public final Object f;
    public boolean g;
    public final android.content.Intent h;
    public final ref.WeakReference i;
    public final d4.n j;
    public final java.util.concurrent.atomic.AtomicInteger k;
    public d4.q l;
    public d4.h m;

    static r()
    {
        d4.r.n = new java.util.HashMap();
        return;
    }

    public r(android.content.Context p3, d4.l p4, android.content.Intent p5)
    {
        this.d = new java.util.ArrayList();
        this.e = new java.util.HashSet();
        this.f = new Object();
        this.j = new d4.n(this, 0);
        this.k = new java.util.concurrent.atomic.AtomicInteger(0);
        this.a = p3;
        this.b = p4;
        this.c = "AppUpdateService";
        this.h = p5;
        this.i = new ref.WeakReference(0);
        return;
    }

    public static void b(d4.r p6, d4.m p7)
    {
        a5.o v1_0 = p6.b;
        java.util.ArrayList v2 = p6.d;
        int v3 = 0;
        if ((p6.m != null) || (p6.g)) {
            if (!p6.g) {
                p7.run();
                return;
            } else {
                int v6_1 = new Object[0];
                v1_0.h("Waiting to bind to the service.", v6_1);
                v2.add(p7);
                return;
            }
        } else {
            String v0_2 = new Object[0];
            v1_0.h("Initiate binding to the service.", v0_2);
            v2.add(p7);
            com.google.android.gms.tasks.TaskCompletionSource v7_2 = new d4.q(p6, 0);
            p6.l = v7_2;
            p6.g = 1;
            if (!p6.a.bindService(p6.h, v7_2, 1)) {
                com.google.android.gms.tasks.TaskCompletionSource v7_4 = new Object[0];
                v1_0.h("Failed to bind to the service.", v7_4);
                p6.g = 0;
                int v6_2 = v2.size();
                while (v3 < v6_2) {
                    com.google.android.gms.tasks.TaskCompletionSource v7_5 = v2.get(v3);
                    v3++;
                    com.google.android.gms.tasks.TaskCompletionSource v7_6 = ((d4.m) v7_5);
                    a5.o v1_2 = new a5.o("Failed to bind to the service.");
                    com.google.android.gms.tasks.TaskCompletionSource v7_7 = v7_6.a;
                    if (v7_7 != null) {
                        v7_7.trySetException(v1_2);
                    }
                }
                v2.clear();
            }
            return;
        }
    }

    public final android.os.Handler a()
    {
        java.util.HashMap v0 = d4.r.n;
        if (!v0.containsKey(this.c)) {
            android.os.Handler v1_8 = new android.os.HandlerThread(this.c, 10);
            v1_8.start();
            v0.put(this.c, new android.os.Handler(v1_8.getLooper()));
        }
        return ((android.os.Handler) v0.get(this.c));
    }

    public final void c(com.google.android.gms.tasks.TaskCompletionSource p3)
    {
        this.e.remove(p3);
        this.a().post(new d4.o(this, 0));
        return;
    }

    public final void d()
    {
        java.util.HashSet v0 = this.e;
        java.util.Iterator v1 = v0.iterator();
        while (v1.hasNext()) {
            ((com.google.android.gms.tasks.TaskCompletionSource) v1.next()).trySetException(new android.os.RemoteException(String.valueOf(this.c).concat(" : Binder has died.")));
        }
        v0.clear();
        return;
    }
}
