package a5;
public final class p implements x5.c, x5.b {
    public final java.util.HashMap a;
    public java.util.ArrayDeque b;
    public final b5.n c;

    public p()
    {
        this.a = new java.util.HashMap();
        this.b = new java.util.ArrayDeque();
        this.c = b5.n.a;
        return;
    }

    public final declared_synchronized void a(java.util.concurrent.Executor p4, x5.a p5)
    {
        p4.getClass();
        if (!this.a.containsKey(q4.b)) {
            this.a.put(q4.b, new java.util.concurrent.ConcurrentHashMap());
        }
        ((java.util.concurrent.ConcurrentHashMap) this.a.get(q4.b)).put(p5, p4);
        return;
    }
}
