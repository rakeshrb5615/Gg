package k4;
public final class d {
    public static final java.util.HashMap o;
    public final android.content.Context a;
    public final k4.z b;
    public final String c;
    public final java.util.ArrayList d;
    public final java.util.HashSet e;
    public final Object f;
    public boolean g;
    public final android.content.Intent h;
    public final k4.c0 i;
    public final ref.WeakReference j;
    public final d4.n k;
    public final java.util.concurrent.atomic.AtomicInteger l;
    public d4.q m;
    public android.os.IInterface n;

    static d()
    {
        k4.d.o = new java.util.HashMap();
        return;
    }

    public d(android.content.Context p3, k4.z p4, String p5, android.content.Intent p6, k4.c0 p7)
    {
        this.d = new java.util.ArrayList();
        this.e = new java.util.HashSet();
        this.f = new Object();
        this.k = new d4.n(this, 2);
        this.l = new java.util.concurrent.atomic.AtomicInteger(0);
        this.a = p3;
        this.b = p4;
        this.c = p5;
        this.h = p6;
        this.i = p7;
        this.j = new ref.WeakReference(0);
        return;
    }

    public static void b(k4.d p6, k4.a0 p7)
    {
        k4.e v1_0 = p6.b;
        java.util.ArrayList v2 = p6.d;
        int v3 = 0;
        if ((p6.n != null) || (p6.g)) {
            if (!p6.g) {
                p7.run();
                return;
            } else {
                int v6_1 = new Object[0];
                v1_0.b("Waiting to bind to the service.", v6_1);
                v2.add(p7);
                return;
            }
        } else {
            String v0_2 = new Object[0];
            v1_0.b("Initiate binding to the service.", v0_2);
            v2.add(p7);
            k4.a0 v7_2 = new d4.q(p6, 2);
            p6.m = v7_2;
            p6.g = 1;
            if (!p6.a.bindService(p6.h, v7_2, 1)) {
                k4.a0 v7_4 = new Object[0];
                v1_0.b("Failed to bind to the service.", v7_4);
                p6.g = 0;
                int v6_2 = v2.size();
                while (v3 < v6_2) {
                    k4.a0 v7_5 = v2.get(v3);
                    v3++;
                    ((k4.a0) v7_5).a(new k4.e("Failed to bind to the service."));
                }
                v2.clear();
            }
            return;
        }
    }

    public final android.os.Handler a()
    {
        java.util.HashMap v0 = k4.d.o;
        if (!v0.containsKey(this.c)) {
            android.os.Handler v1_8 = new android.os.HandlerThread(this.c, 10);
            v1_8.start();
            v0.put(this.c, new android.os.Handler(v1_8.getLooper()));
        }
        return ((android.os.Handler) v0.get(this.c));
    }

    public final void c(k4.a0 p3, com.google.android.gms.tasks.TaskCompletionSource p4)
    {
        this.a().post(new k4.b0(this, p3.c(), p4, p3));
        return;
    }

    public final void d(com.google.android.gms.tasks.TaskCompletionSource p3)
    {
        this.e.remove(p3);
        this.a().post(new k4.c(this, 1));
        return;
    }

    public final void e()
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
