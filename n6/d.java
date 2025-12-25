package n6;
public final class d {
    public static final java.util.HashMap d;
    public static final x1.d e;
    public final java.util.concurrent.Executor a;
    public final n6.o b;
    public com.google.android.gms.tasks.Task c;

    static d()
    {
        n6.d.d = new java.util.HashMap();
        n6.d.e = new x1.d();
        return;
    }

    public d(java.util.concurrent.Executor p1, n6.o p2)
    {
        this.a = p1;
        this.b = p2;
        this.c = 0;
        return;
    }

    public static Object a(com.google.android.gms.tasks.Task p4)
    {
        java.util.concurrent.CountDownLatch v1_1 = new j6.o(7);
        long v2_2 = n6.d.e;
        p4.addOnSuccessListener(v2_2, v1_1);
        p4.addOnFailureListener(v2_2, v1_1);
        p4.addOnCanceledListener(v2_2, v1_1);
        if (!((java.util.concurrent.CountDownLatch) v1_1.b).await(5, java.util.concurrent.TimeUnit.SECONDS)) {
            throw new java.util.concurrent.TimeoutException("Task await timed out.");
        } else {
            if (!p4.isSuccessful()) {
                throw new java.util.concurrent.ExecutionException(p4.getException());
            } else {
                return p4.getResult();
            }
        }
    }

    public final declared_synchronized com.google.android.gms.tasks.Task b()
    {
        com.google.android.gms.tasks.Task v0_0 = this.c;
        if (v0_0 == null) {
            this.c = com.google.android.gms.tasks.Tasks.call(this.a, new g5.p(this.b, 2));
        } else {
            if ((v0_0.isComplete()) && (!this.c.isSuccessful())) {
            }
        }
        return this.c;
    }

    public final n6.f c()
    {
        int v0_0 = this.c;
        if ((v0_0 == 0) || (!v0_0.isSuccessful())) {
            try {
                return ((n6.f) n6.d.a(this.b()));
            } catch (int v0_2) {
                android.util.Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", v0_2);
                return 0;
            } catch (int v0_2) {
                android.util.Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", v0_2);
                return 0;
            } catch (int v0_2) {
                android.util.Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", v0_2);
                return 0;
            }
        } else {
            return ((n6.f) this.c.getResult());
        }
    }
}
