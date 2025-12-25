package androidx.lifecycle;
public final class e implements androidx.lifecycle.s {
    public final synthetic int a;
    public final Object b;

    public synthetic e(Object p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final void c(androidx.lifecycle.u p3, androidx.lifecycle.n p4)
    {
        switch (this.a) {
            case 0:
                new java.util.HashMap();
                String v3_10 = ((androidx.lifecycle.i[]) this.b);
                if (v3_10.length > 0) {
                    throw 0;
                } else {
                    if (v3_10.length > 0) {
                        throw 0;
                    } else {
                        return;
                    }
                }
            default:
                if (p4 != androidx.lifecycle.n.ON_CREATE) {
                    String v3_3 = new StringBuilder("Next event must be ON_CREATE, it was ");
                    v3_3.append(p4);
                    throw new IllegalStateException(v3_3.toString().toString());
                } else {
                    p3.getLifecycle().b(this);
                    ((androidx.lifecycle.r0) this.b).b();
                    return;
                }
        }
    }
}
