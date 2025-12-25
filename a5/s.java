package a5;
public final class s implements c6.b {
    public volatile java.util.Set a;
    public volatile java.util.Set b;

    public final Object get()
    {
        if (this.b == null) {
            if (this.b == null) {
                this.b = java.util.Collections.newSetFromMap(new java.util.concurrent.ConcurrentHashMap());
                int v0_1 = this.a.iterator();
                while (v0_1.hasNext()) {
                    this.b.add(((c6.b) v0_1.next()).get());
                }
                this.a = 0;
            }
        }
        return java.util.Collections.unmodifiableSet(this.b);
    }
}
