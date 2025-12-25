package k8;
public final class j extends k8.i {
    public final Runnable c;

    public j(Runnable p1, long p2, boolean p4)
    {
        super(p2, p4);
        super.c = p1;
        return;
    }

    public final void run()
    {
        this.c.run();
        return;
    }

    public final String toString()
    {
        int v1_4;
        String v0_1 = new StringBuilder("Task[");
        int v1_6 = this.c;
        v0_1.append(v1_6.getClass().getSimpleName());
        v0_1.append(64);
        v0_1.append(d8.f0.j(v1_6));
        v0_1.append(", ");
        v0_1.append(this.a);
        v0_1.append(", ");
        if (!this.b) {
            v1_4 = "Non-blocking";
        } else {
            v1_4 = "Blocking";
        }
        v0_1.append(v1_4);
        v0_1.append(93);
        return v0_1.toString();
    }
}
