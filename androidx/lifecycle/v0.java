package androidx.lifecycle;
public abstract class v0 {
    public final p1.a a;

    public v0()
    {
        this.a = new p1.a();
        return;
    }

    public final void a()
    {
        java.util.LinkedHashSet v0_0 = this.a;
        if ((v0_0 != null) && (!v0_0.d)) {
            v0_0.d = 1;
            java.util.Iterator v2_0 = v0_0.b.values().iterator();
            while (v2_0.hasNext()) {
                p1.a.a(((AutoCloseable) v2_0.next()));
            }
            java.util.Iterator v2_2 = v0_0.c.iterator();
            while (v2_2.hasNext()) {
                p1.a.a(((AutoCloseable) v2_2.next()));
            }
            v0_0.c.clear();
        }
        this.b();
        return;
    }

    public void b()
    {
        return;
    }
}
