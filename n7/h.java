package n7;
public abstract class h extends n7.g implements kotlin.jvm.internal.g {
    public final int a;

    public h(int p1, l7.c p2)
    {
        super(p2);
        super.a = p1;
        return;
    }

    public final int getArity()
    {
        return this.a;
    }

    public final String toString()
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
