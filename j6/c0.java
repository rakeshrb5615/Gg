package j6;
public abstract class c0 {
    public static final long a;
    public static final Object b;
    public static com.google.android.gms.stats.WakeLock c;

    static c0()
    {
        j6.c0.a = java.util.concurrent.TimeUnit.MINUTES.toMillis(1);
        j6.c0.b = new Object();
        return;
    }

    public static void a(android.content.Intent p3)
    {
        if ((j6.c0.c != null) && (p3.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", 0))) {
            p3.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", 0);
            j6.c0.c.release();
        }
        return;
    }

    public static android.content.ComponentName b(android.content.Context p4, android.content.Intent p5)
    {
        if (j6.c0.c == null) {
            long v1_4 = new com.google.android.gms.stats.WakeLock(p4, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            j6.c0.c = v1_4;
            v1_4.setReferenceCounted(1);
        }
        long v1_1 = p5.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", 0);
        p5.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", 1);
        int v4_1 = p4.startService(p5);
        if (v4_1 != 0) {
            if (v1_1 == 0) {
                j6.c0.c.acquire(j6.c0.a);
            }
            return v4_1;
        } else {
            return 0;
        }
    }
}
