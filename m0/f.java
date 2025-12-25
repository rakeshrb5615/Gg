package m0;
public final class f implements java.util.concurrent.Executor {
    public final synthetic int a;
    public final Object b;

    public f()
    {
        this.a = 2;
        this.b = new android.os.Handler(android.os.Looper.getMainLooper());
        return;
    }

    public synthetic f(Object p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final void execute(Runnable p4)
    {
        switch (this.a) {
            case 0:
                String v0_5 = ((android.os.Handler) this.b);
                p4.getClass();
                if (!v0_5.post(p4)) {
                    StringBuilder v1_3 = new StringBuilder();
                    v1_3.append(v0_5);
                    v1_3.append(" is shutting down");
                    throw new java.util.concurrent.RejectedExecutionException(v1_3.toString());
                } else {
                    return;
                }
            case 1:
                String v0_12 = ((android.os.Handler) this.b);
                p4.getClass();
                if (!v0_12.post(p4)) {
                    StringBuilder v1_1 = new StringBuilder();
                    v1_1.append(v0_12);
                    v1_1.append(" is shutting down");
                    throw new java.util.concurrent.RejectedExecutionException(v1_1.toString());
                } else {
                    return;
                }
            case 2:
                ((android.os.Handler) this.b).post(p4);
                return;
            default:
                ((java.util.concurrent.Executor) this.b).execute(new b5.k(p4, 1));
                return;
        }
    }
}
