package w7;
public final class c extends w7.a {
    public final w7.b b;

    public c()
    {
        this.b = new w7.b();
        return;
    }

    public final java.util.Random a()
    {
        java.util.Random v0_1 = this.b.get();
        kotlin.jvm.internal.j.d(v0_1, "get(...)");
        return ((java.util.Random) v0_1);
    }
}
