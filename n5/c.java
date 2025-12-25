package n5;
public final class c {
    public final double a;
    public final double b;
    public final long c;
    public final long d;
    public final int e;
    public final java.util.concurrent.ArrayBlockingQueue f;
    public final java.util.concurrent.ThreadPoolExecutor g;
    public final a2.b h;
    public final k2.c i;
    public int j;
    public long k;

    public c(a2.b p9, o5.c p10, k2.c p11)
    {
        java.util.concurrent.ThreadPoolExecutor v0_0 = p10.d;
        int v2_0 = p10.e;
        long v4_1 = (((long) p10.f) * 1000);
        this.a = v0_0;
        this.b = v2_0;
        this.c = v4_1;
        this.h = p9;
        this.i = p11;
        this.d = android.os.SystemClock.elapsedRealtime();
        long v9_2 = ((int) v0_0);
        this.e = v9_2;
        java.util.concurrent.ArrayBlockingQueue v6_1 = new java.util.concurrent.ArrayBlockingQueue(v9_2);
        this.f = v6_1;
        this.g = new java.util.concurrent.ThreadPoolExecutor(1, 1, 0, java.util.concurrent.TimeUnit.MILLISECONDS, v6_1);
        this.j = 0;
        this.k = 0;
        return;
    }

    public final int a()
    {
        if (this.k == 0) {
            this.k = System.currentTimeMillis();
        }
        int v0_6;
        int v0_3 = ((int) ((System.currentTimeMillis() - this.k) / this.c));
        if (this.f.size() != this.e) {
            v0_6 = Math.max(0, (this.j - v0_3));
        } else {
            v0_6 = Math.min(100, (this.j + v0_3));
        }
        if (this.j != v0_6) {
            this.j = v0_6;
            this.k = System.currentTimeMillis();
        }
        return v0_6;
    }

    public final void b(g5.b p7, com.google.android.gms.tasks.TaskCompletionSource p8)
    {
        int v0_4 = new StringBuilder("Sending report through Google DataTransport: ");
        v0_4.append(p7.b);
        int v0_6 = v0_4.toString();
        if (android.util.Log.isLoggable("FirebaseCrashlytics", 3)) {
            android.util.Log.d("FirebaseCrashlytics", v0_6, 0);
        }
        int v0_5;
        if ((android.os.SystemClock.elapsedRealtime() - this.d) >= 2000) {
            v0_5 = 0;
        } else {
            v0_5 = 1;
        }
        this.h.l(new o2.a(p7.a, o2.d.c, 0), new n5.b(this, p8, v0_5, p7));
        return;
    }
}
