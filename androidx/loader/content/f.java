package androidx.loader.content;
public final class f implements java.util.concurrent.ThreadFactory {
    public final synthetic int a;
    public final Number b;

    public f(int p2)
    {
        this.a = p2;
        switch (p2) {
            case 1:
                this.b = new java.util.concurrent.atomic.AtomicInteger(0);
                return;
            default:
                this.b = new java.util.concurrent.atomic.AtomicInteger(1);
                return;
        }
    }

    public f(java.util.concurrent.atomic.AtomicLong p2)
    {
        this.a = 2;
        this.b = p2;
        return;
    }

    public final Thread newThread(Runnable p4)
    {
        switch (this.a) {
            case 0:
                int v1_2 = new StringBuilder("ModernAsyncTask #");
                v1_2.append(((java.util.concurrent.atomic.AtomicInteger) this.b).getAndIncrement());
                return new Thread(p4, v1_2.toString());
            case 1:
                Thread v0_4 = new Thread(p4);
                String v4_4 = new StringBuilder("arch_disk_io_");
                v4_4.append(((java.util.concurrent.atomic.AtomicInteger) this.b).getAndIncrement());
                v0_4.setName(v4_4.toString());
                return v0_4;
            default:
                String v4_2 = java.util.concurrent.Executors.defaultThreadFactory().newThread(new g5.w(p4));
                Thread v0_7 = new StringBuilder("awaitEvenIfOnMainThread task continuation executor");
                v0_7.append(((java.util.concurrent.atomic.AtomicLong) this.b).getAndIncrement());
                v4_2.setName(v0_7.toString());
                return v4_2;
        }
    }
}
