package kotlin.jvm.internal;
public abstract class k implements kotlin.jvm.internal.g, java.io.Serializable {
    private final int arity;

    public k(int p1)
    {
        this.arity = p1;
        return;
    }

    public int getArity()
    {
        return this.arity;
    }

    public String toString()
    {
        kotlin.jvm.internal.s.a.getClass();
        String v0_1 = kotlin.jvm.internal.t.a(this);
        kotlin.jvm.internal.j.d(v0_1, "renderLambdaToString(...)");
        return v0_1;
    }
}
