package androidx.lifecycle;
public final class a1 {
    public final java.util.LinkedHashMap a;

    public a1()
    {
        this.a = new java.util.LinkedHashMap();
        return;
    }

    public final void a()
    {
        java.util.LinkedHashMap v0 = this.a;
        java.util.Iterator v1_1 = v0.values().iterator();
        while (v1_1.hasNext()) {
            ((androidx.lifecycle.v0) v1_1.next()).a();
        }
        v0.clear();
        return;
    }
}
