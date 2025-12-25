package b5;
public final class a implements java.util.concurrent.ThreadFactory {
    public static final java.util.concurrent.ThreadFactory e;
    public final java.util.concurrent.atomic.AtomicLong a;
    public final String b;
    public final int c;
    public final android.os.StrictMode$ThreadPolicy d;

    static a()
    {
        b5.a.e = java.util.concurrent.Executors.defaultThreadFactory();
        return;
    }

    public a(String p2, int p3, android.os.StrictMode$ThreadPolicy p4)
    {
        this.a = new java.util.concurrent.atomic.AtomicLong();
        this.b = p2;
        this.c = p3;
        this.d = p4;
        return;
    }

    public final Thread newThread(Runnable p5)
    {
        Thread v5_2 = b5.a.e.newThread(new a5.i(2, this, p5));
        String v0_4 = this.a.getAndIncrement();
        StringBuilder v2_1 = new StringBuilder();
        v2_1.append(this.b);
        v2_1.append(" Thread #");
        v2_1.append(v0_4);
        v5_2.setName(v2_1.toString());
        return v5_2;
    }
}
