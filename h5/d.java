package h5;
public final synthetic class d extends kotlin.jvm.internal.i implements u7.a {
    public final synthetic int a;

    public synthetic d(int p1, Object p2, Class p3, String p4, String p5, int p6, int p7)
    {
        this.a = p7;
        super(p1, p2, p3, p4, p5, p6);
        return;
    }

    public final Object invoke()
    {
        switch (this.a) {
            case 0:
                ((h5.e) this.receiver).getClass();
                Boolean v0_7 = Thread.currentThread().getName();
                kotlin.jvm.internal.j.d(v0_7, "<get-threadName>(...)");
                return Boolean.valueOf(b8.i.s0(v0_7, "Firebase Background Thread #"));
            case 1:
                ((h5.e) this.receiver).getClass();
                Boolean v0_18 = Thread.currentThread().getName();
                kotlin.jvm.internal.j.d(v0_18, "<get-threadName>(...)");
                return Boolean.valueOf(b8.i.s0(v0_18, "Firebase Blocking Thread #"));
            default:
                ((h5.e) this.receiver).getClass();
                return Boolean.valueOf((android.os.Looper.getMainLooper().isCurrentThread() ^ 1));
        }
    }
}
