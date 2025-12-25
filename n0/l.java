package n0;
public final class l implements java.lang.Runnable {
    public final synthetic int a;
    public Object b;
    public Object c;
    public Object d;

    public synthetic l()
    {
        this.a = 0;
        return;
    }

    public l(android.view.View p1, q0.c1 p2, n0.a p3, android.animation.ValueAnimator p4)
    {
        this.a = 2;
        this.b = p1;
        this.c = p3;
        this.d = p4;
        return;
    }

    public l(n5.c p2, g5.b p3, com.google.android.gms.tasks.TaskCompletionSource p4)
    {
        this.a = 1;
        this.d = p2;
        this.b = p3;
        this.c = p4;
        return;
    }

    public final void run()
    {
        switch (this.a) {
            case 0:
                try {
                    long v0_10 = ((n0.e) this.b).call();
                } catch (Exception) {
                    v0_10 = 0;
                }
                ((android.os.Handler) this.d).post(new b5.l(8, ((n0.f) this.c), v0_10));
                return;
            case 1:
                long v0_5 = ((n5.c) this.d);
                n0.f v1_3 = ((g5.b) this.b);
                v0_5.b(v1_3, ((com.google.android.gms.tasks.TaskCompletionSource) this.c));
                ((java.util.concurrent.atomic.AtomicInteger) v0_5.i.c).set(0);
                android.os.Handler v2_5 = Math.min(4704985352480227328, (Math.pow(v0_5.b, ((double) v0_5.a())) * (4678479150791524352 / v0_5.a)));
                long v0_4 = new StringBuilder("Delay for: ");
                v0_4.append(String.format(java.util.Locale.US, "%.2f", new Object[] {Double.valueOf((v2_5 / 4652007308841189376))})));
                v0_4.append(" s for report: ");
                v0_4.append(v1_3.b);
                long v0_6 = v0_4.toString();
                if (android.util.Log.isLoggable("FirebaseCrashlytics", 3)) {
                    android.util.Log.d("FirebaseCrashlytics", v0_6, 0);
                }
                try {
                    Thread.sleep(((long) v2_5));
                } catch (InterruptedException) {
                }
                return;
            default:
                q0.x0.h(((android.view.View) this.b), ((n0.a) this.c));
                ((android.animation.ValueAnimator) this.d).start();
                return;
        }
    }
}
