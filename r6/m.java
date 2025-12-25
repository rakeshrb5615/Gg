package r6;
public final class m implements t6.b {
    public final synthetic int a;
    public final k4.i b;

    public synthetic m(k4.i p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final Object get()
    {
        r6.o0 v1_0 = this.b;
        switch (this.a) {
            case 0:
                return new r6.l(((c6.b) v1_0.b));
            case 1:
                r6.b v0_6 = ((q4.f) v1_0.b);
                kotlin.jvm.internal.j.e(v0_6, "firebaseApp");
                return r6.o0.a(v0_6);
            default:
                return new u6.a(((android.content.Context) v1_0.b));
        }
    }
}
