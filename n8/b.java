package n8;
public final class b implements com.google.android.gms.tasks.OnCompleteListener, z8.g {
    public final synthetic int a;
    public final synthetic d8.n b;

    public synthetic b(d8.n p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public void b(z8.d p1, Throwable p2)
    {
        switch (this.a) {
            case 1:
                this.b.resumeWith(c4.b.p(p2));
                return;
            case 2:
                this.b.resumeWith(c4.b.p(p2));
                return;
            default:
                this.b.resumeWith(c4.b.p(p2));
                return;
        }
    }

    public void d(z8.d p4, z8.q0 p5)
    {
        switch (this.a) {
            case 1:
                d8.n v1 = this.b;
                if (!p5.a.v) {
                    v1.resumeWith(c4.b.p(new a5.o(p5)));
                } else {
                    h7.b v5_1 = p5.b;
                    if (v5_1 != null) {
                        v1.resumeWith(v5_1);
                    } else {
                        h7.g v4_6 = p4.c();
                        v4_6.getClass();
                        h7.b v5_3 = kotlin.jvm.internal.s.a(z8.t);
                        h7.g v4_10 = q4.b.u(v5_3).cast(v4_6.e.a(v5_3));
                        kotlin.jvm.internal.j.b(v4_10);
                        h7.g v4_12 = ((z8.t) v4_10).b;
                        StringBuilder v0_6 = new StringBuilder("Response from ");
                        v0_6.append(j2.h.getName());
                        v0_6.append(46);
                        v0_6.append(v4_12.getName());
                        v0_6.append(" was null but response body type was declared as non-null");
                        v1.resumeWith(c4.b.p(new h7.b(v0_6.toString())));
                    }
                }
                return;
            case 2:
                StringBuilder v0_4 = this.b;
                if (!p5.a.v) {
                    v0_4.resumeWith(c4.b.p(new a5.o(p5)));
                } else {
                    v0_4.resumeWith(p5.b);
                }
                return;
            default:
                this.b.resumeWith(p5);
                return;
        }
    }

    public void onComplete(com.google.android.gms.tasks.Task p3)
    {
        boolean v0_0 = p3.getException();
        d8.n v1 = this.b;
        if (v0_0) {
            v1.resumeWith(c4.b.p(v0_0));
            return;
        } else {
            if (!p3.isCanceled()) {
                v1.resumeWith(p3.getResult());
                return;
            } else {
                v1.m(0);
                return;
            }
        }
    }
}
