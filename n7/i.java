package n7;
public abstract class i extends n7.c implements kotlin.jvm.internal.g {
    private final int arity;

    public i(int p1, l7.c p2)
    {
        super(p2);
        super.arity = p1;
        return;
    }

    public int getArity()
    {
        return this.arity;
    }

    public String toString()
    {
        if (this.getCompletion() != null) {
            return super.toString();
        } else {
            kotlin.jvm.internal.s.a.getClass();
            String v0_3 = kotlin.jvm.internal.t.a(this);
            kotlin.jvm.internal.j.d(v0_3, "renderLambdaToString(...)");
            return v0_3;
        }
    }
}
